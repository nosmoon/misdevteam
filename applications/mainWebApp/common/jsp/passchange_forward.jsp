<%@ page contentType="text/html; charset=KSC5601"%>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
        somo.framework.util.* "
%>
<jsp:useBean id="authUser" scope="page" class="ldapp.AuthUser" />
<jsp:useBean id="changepass" scope="page" class="ldapp.ChangePass" />
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
	String emp_no = "",uid = "" , pw = "", site = "" ;
	uid = Util.checkString(request.getParameter("User"));
	pw  = Util.checkString(request.getParameter("Password"));
	site  = Util.checkString(request.getParameter("site"));

System.out.println("ID : PW 비교 -- uid : " + uid +" pw : " + pw);
  
%>

<%
	int result=-1, result2=-1;
    // DB로 로그인 정보 확인
     result = authUser.authuserdb(uid,pw);
System.out.println("ID : PW 비교 -- result : " + result);
	// LDAP 로그인 업데이트
	//ldapp.ChangePass pwcheck  = new ldapp.ChangePass();
	
	//result=changepass.searchldap(uid,pw);
	//if(uid.equals("") || pw.equals("")) {
	//	result = -1 ;
	//}

//	result2 = changepass.updateldap(uid,pw,pw) ;
//	boolean auth = false;

//	auth = authUser.isAuth (uid, pw);

//out.println(result2);

//out.println(result);
//out.println(auth);

  System.out.println("site : "+site);
	if(result==4) {
%>
<form  name="getHeader" method="post" action="<%=site%>" >
	<input type="hidden" name="uid" value="<%=uid%>">
</form>

<script language="javascript">
	document.getHeader.submit();
</script>		
	
<% 
	} else { 
%>
<script language="javascript">
	alert("비밀번호가 틀립니다. 확인후 다시 입력해 주세요");
	history.back();
</script>		

<% 
	}
%>