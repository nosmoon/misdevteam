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
	String emp_no = "",uid = "" , pw = "", site = "" ;
	uid = Util.checkString(request.getParameter("User"));
	pw  = Util.checkString(request.getParameter("Password"));
	site  = Util.checkString(request.getParameter("site"));

System.out.println("ID : PW �� -- uid : " + uid +" pw : " + pw);
  
%>

<%
	int result=-1, result2=-1;
    // DB�� �α��� ���� Ȯ��
     result = authUser.authuserdb(uid,pw);
System.out.println("ID : PW �� -- result : " + result);
	// LDAP �α��� ������Ʈ
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
	alert("��й�ȣ�� Ʋ���ϴ�. Ȯ���� �ٽ� �Է��� �ּ���");
	history.back();
</script>		

<% 
	}
%>