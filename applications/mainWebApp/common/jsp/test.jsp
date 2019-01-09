<%---------------------------------------------------------------------------------------------------
* ���ϸ� : login.jsp 
* ��� : �α��� - ��й�ȣ ���� ��󿩺� Ȯ��
* �ۼ����� : 2009-02-18
* �ۼ��� : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
<jsp:useBean id="authUser" scope="page" class="ldapp.AuthUser" />
<%!
	public void setCookie(String s, String s1, int i, javax.servlet.http.HttpServletResponse res)
	{
		Cookie cookie = new Cookie(s, s1);
		cookie.setDomain(".chosun.com");
	
		if ( i != 1 )
			cookie.setMaxAge(i);
	
		cookie.setPath("/");
		res.addCookie(cookie);
	} 	 
	
	

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
	// Session ���� ����
	session.invalidate();
	setCookie("SM_USER", "", 0, response);
	setCookie("SMSESSION", "", 0, response);

	String sql = "",m_from_ip ="",entr_ip="";		
	String db_from_ip = "",db_usbkey="",fail_url ="";
	boolean chk = false;

	entr_ip = (String)request.getRemoteAddr();

	String loginid = (request.getParameter ("user_id") == null) ? "" : request.getParameter("user_id").trim();
	String loginpwd = (request.getParameter ("user_passwd") == null) ? "" : request.getParameter("user_passwd").trim();
	String loginurl = (request.getParameter ("URL") == null) ? "" : request.getParameter("URL").trim();
	String logintarget = (request.getParameter ("target") == null) ? "" : request.getParameter("target").trim();
	String site= (request.getParameter ("site") == null) ? "" : request.getParameter("site").trim();

System.out.println("loginid :loginpwd " +loginid + " : " +   loginpwd);

	fail_url = "http://ciis.chosun.com/common/jsp/logout.jsp";

	sql = "SELECT SF_CO_FIND_IP_CHK('"+entr_ip+"','2') AS FROM_IP ,SF_CO_FIND_USBKEY('"+loginid+"') AS USBKEY FROM DUAL";

	Connection conn  = null;
	Statement stmt   = null;
	ResultSet rset   = null;
	
	/**
	 * ����Ÿ���̽��� �����մϴ�.
	 * �غ�� ���������� ������ ��ȸ�մϴ�.
	 * ���� ����� ���̺� ������ ������ �װɷ� ���Ѵ�.
	 * ����� ���̺� ������ ������ �̺�Ʈ ���̺��� ������ �����ͼ� ���Ѵ�.
	*/
	try
	{
		//DB ����	
		Driver myDriver= (Driver)Class.forName("weblogic.jdbc.pool.Driver").newInstance();
		conn   = myDriver.connect("jdbc:weblogic:pool:CIIS_COM_POOL", null);

		stmt   = conn.createStatement();
		rset   = stmt.executeQuery(sql);

		if ( rset.next() )
		{
			db_from_ip = rset.getString("FROM_IP");
			db_usbkey = rset.getString("USBKEY");
System.out.println("db_from_ip :db_usbkey " +db_from_ip + " : " +   db_usbkey);
		}
		
		if (db_from_ip != null && db_from_ip.equals("Y")) {	
			chk = true;
		}
System.out.println("chk0 : " +entr_ip + " " +   chk);

		rset.close();
		stmt.close();
		conn.close();
	}
	catch(SQLException e) {out.println((String)e.getMessage());}
	catch(Exception e) {out.println((String)e.getMessage());}
	finally {
		try { if(stmt  != null) stmt.close();}  catch(Exception e){ out.println((String)e.getMessage());}
		try { if(rset  != null) rset.close();}  catch(Exception e){ out.println((String)e.getMessage());}
		try { if(conn  != null && !conn.isClosed()) conn.close();}  catch(Exception e){ out.println((String)e.getMessage());}
	}

	
	if (!logintarget.equals(""))	logintarget = java.net.URLDecoder.decode(logintarget);
	else				 logintarget = "/common/jsp/install2.jsp";

	//�Է°��� ���ٸ� �������� �̵��Ѵ�
	if (loginid.equals("") || loginpwd.equals("")) {
		out.println ("<script language=javascript>\n<!--");
		out.println ("alert (\"�Է°��� �����ϴ�\");\n");
		out.println ("	location.href = '/index.jsp';");
		out.println ("//-->\n</script>");
	}

	boolean auth = false, result = false;
	
	//���̵�, ��й�ȣ ��ġ���θ� Ȯ���Ѵ�
	auth = authUser.isAuth (loginid, loginpwd);
	
	//��й�ȣ ���� ��󿩺θ� Ȯ���Ѵ�
	if(loginid.equals("c192044") || loginid.equals("c153001")) {
System.out.println("id pw time check " );
		if (auth)		result = authUser.isTarget (loginid, loginpwd, -30);
	}
System.out.println("chk : " +entr_ip + " " +   chk);
%>
<% if (result) {  %>
<script language=javascript>
<!--
	alert ("��й�ȣ ��ȿ�Ⱓ�� ����Ǿ��ų� ���� �α����Դϴ�. ��й�ȣ�� ������ �ּ���.");
	location.href = "/jsp/sm/co_login_1000_i.jsp?USERNAME=<%=loginid%>";
//-->
</script>
<% } else { %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<% if (!chk)  { %>
<script language="javascript">

function auth() {
	if (ChosunAuth2.IsValid() == 0) {
	     usbserial = ChosunAuth2.GetSerial();
		 if(usbserial=="<%=db_usbkey%>") {
		 	document.form.submit();
		 }else {
			alert("����ڿ� USBKEY���� ��ġ���� �ʽ��ϴ�."+usbserial);
			location.href = "<%=fail_url%>";
			return ;
		 }
	} else {
	    usbserial = "Nothing Key";
		alert("USBKEY �� �ʿ��մϴ�.");
		location.href = "<%=fail_url%>";
		return ;
	}
}

</script>
<% } %>
</head>


<% if (!chk)  { %>
<body onload="javascript:auth();">
<object id="ChosunAuth2" width=0 height=0 classid="CLSID:98652349-A6FA-4DA2-9C44-498A1C7C1352"  codebase="http://ciis.chosun.com/html/authactivex/ChosunAuth2.cab#version=1,0,0,1" onerror="javascript:window.alert('ActiveX ��Ʈ���� ��ġ�� �ֽñ� �ٶ��ϴ�.')">

</object>
<% } else { %>
<body onload="javascript:document.form.submit();">
<% } %>

<!-- SiteMinder ���� ó�� FORM ���� -->
<form name="form" method="post" action="/siteminderagent/forms/login.fcc">
<input type="hidden" name="target" value="<%=logintarget%>">
<input type="hidden" name="smauthreason" value="0">
<input type="hidden" name="User" value="<%=loginid%>">
<input type="hidden" name="Password" value="<%=loginpwd%>">
</form>
</body>
</html>
<% } %>
