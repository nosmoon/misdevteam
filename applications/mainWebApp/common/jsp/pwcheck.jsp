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
* ���ϸ� : main.jsp
* ��� : ����ó�� �� ���������� ����
* �ۼ����� : 2009-02-18
* �ۼ��� : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 	
* ������ : 	
* �������� : 	
---------------------------------------------------------------------------------------------------%>
<%!
    // ���޵� ��Ű�� ������ ���� �� �����Ѵ�.
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
//	emp_no =	Util.checkString(Util.getSessionParameterValue(request, "emp_no", true)); //session.getAttribute("emp_no");      // ���
//	uid =	Util.checkString(Util.getSessionParameterValue(request, "uid", true)); //session.getAttribute("emp_no");      // ���
//	uid="c1530041";
//	pw="c153001";
//	uid="da20702";
//	pw="1234";
System.out.println("ID : PW �� -- uid : " + uid +" pw : " + pw);
  
%>

<%
	int result=-1;
	// LDAP �α��� ������Ʈ
	ldapp.ChangePass pwcheck  = new ldapp.ChangePass();
	result=pwcheck.searchldap(uid,pw);

	if(uid.equals("") || pw.equals("")) {
		result = -1 ;
	}
out.println(result);
%>
