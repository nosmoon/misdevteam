<%@ page contentType="text/html; charset=KSC5601"%>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
        somo.framework.util.*
"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : main.jsp
* 기능 : 세션처리 및 메인프레임 시작
* 작성일자 : 2009-02-18
* 작성자 : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 	
* 수정자 : 	
* 수정일자 : 	
---------------------------------------------------------------------------------------------------%>
<%!
    // 전달된 쿠키에 설정된 값을 얻어서 리턴한다.
    public String GetCookie(HttpServletRequest req, HttpServletResponse res, String param) throws Exception{
        String ret = "";
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(int i=0; i<cookies.length; i++){
                if(cookies[i].getName().equals(param)){
                    ret = cookies[i].getValue();
					break;
                }
            }
        }
        return ret;
    }
%>
<%
	String emp_no = "",uid = "" , pw = "";
	uid = Util.checkString(request.getParameter("uid"));
	pw  = Util.checkString(request.getParameter("pw"));
//	emp_no =	Util.checkString(Util.getSessionParameterValue(request, "emp_no", true)); //session.getAttribute("emp_no");      // 사번
//	uid =	Util.checkString(Util.getSessionParameterValue(request, "uid", true)); //session.getAttribute("emp_no");      // 사번
//	uid="c1530041";
//	pw="c153001";
//	uid="da20702";
//	pw="1234";
System.out.println("ID : PW 비교 -- uid : " + uid +" pw : " + pw);
  
%>

<%
	int result=-1;
	// LDAP 로그인 업데이트
	ldapp.ChangePass pwcheck  = new ldapp.ChangePass();
	result=pwcheck.searchldap(uid,pw);

	if(uid.equals("") || pw.equals("")) {
		result = -1 ;
	}
out.println(result);
%>
