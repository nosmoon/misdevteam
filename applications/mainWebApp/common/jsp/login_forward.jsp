<%---------------------------------------------------------------------------------------------------
* 파일명 : login_forward.jsp 
* 기능 : 로그인 - 
* 작성일자 : 2006-01-05
* 작성자 : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%@page contentType="text/html; charset=KSC5601" %>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
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
	// Session 정보 제거
	session.invalidate();
	setCookie("SM_USER", "", 0, response);
	setCookie("SMSESSION", "LOGGEDOFF", -1, response);

	String sql = "",m_from_ip ="",entr_ip="";		
	String db_from_ip = "",db_usbkey="",fail_url ="";
	boolean chk = false;

	entr_ip = (String)request.getRemoteAddr();

	String loginid = (request.getParameter ("User") == null) ? "" : request.getParameter("User").trim();
	String loginpwd = (request.getParameter ("Password") == null) ? "" : request.getParameter("Password").trim();
	String loginurl = (request.getParameter ("URL") == null) ? "" : request.getParameter("URL").trim();
	String logintarget = (request.getParameter ("target") == null) ? "" : request.getParameter("target").trim();
	String site= (request.getParameter ("site") == null) ? "" : request.getParameter("site").trim();


	if(fail_url != null && fail_url.equals("eip")) {
		fail_url = "http://eipt.chosun.com:7777";
	} else if(fail_url != null && fail_url.equals("ciis")) {
		fail_url = "http://ciis.chosun.com:9020/common/jsp/logout.jsp";
	} else {
		fail_url = "http://eipt.chosun.com:7777";
	}

	sql = "SELECT SF_CO_FIND_IP_CHK('"+entr_ip+"','1') AS FROM_IP ,SF_CO_FIND_USBKEY('"+loginid+"') AS USBKEY FROM DUAL";

	Connection conn  = null;
	Statement stmt   = null;
	ResultSet rset   = null;
	
	/**
	 * 데이타베이스에 연결합니다.
	 * 준비된 쿼리문으로 정보를 조회합니다.
	 * 먼저 사용자 테이블에 정보가 있으면 그걸로 비교한다.
	 * 사용자 테이블에 정보가 없으면 이벤트 테이블에서 정보를 가져와서 비교한다.
	*/
	try
	{
		//DB 연결	
		Driver myDriver= (Driver)Class.forName("weblogic.jdbc.pool.Driver").newInstance();
		conn   = myDriver.connect("jdbc:weblogic:pool:CIIS_COM_POOL", null);

		stmt   = conn.createStatement();
		rset   = stmt.executeQuery(sql);

		if ( rset.next() )
		{
			db_from_ip = rset.getString("FROM_IP");
			db_usbkey = rset.getString("USBKEY");
		}
		
		rset.close();
		stmt.close();
		conn.close();
		
		if (db_from_ip != null && !db_from_ip.equals(""))	
			chk = true;
	}
	catch(SQLException e) {out.println((String)e.getMessage());}
	catch(Exception e) {out.println((String)e.getMessage());}
	finally {
		try { if(stmt  != null) stmt.close();}  catch(Exception e){ out.println((String)e.getMessage());}
		try { if(rset  != null) rset.close();}  catch(Exception e){ out.println((String)e.getMessage());}
		try { if(conn  != null && !conn.isClosed()) conn.close();}  catch(Exception e){ out.println((String)e.getMessage());}
	}
%>


<%

//	if (!logintarget.equals(""))			logintarget = java.net.URLEncoder.encode(logintarget);
//	else									logintarget = "/";


//	if (!site.equals(""))					site = java.net.URLEncoder.encode(site);
//	else									site = "/";

	//입력값이 없다면 메인으로 이동한다
	if (loginid.equals("") || loginpwd.equals("")) {
		out.println ("<script language=javascript>\n<!--");
		out.println ("alert (\"입력값이 없습니다\");\n");
		//out.println ("	location.href = \"/\";");
		out.println ("history.back();");
		out.println ("//-->\n</script>");
	}


	int site_idx = site.indexOf("?personID");

	if (site_idx != -1) { 
		site_idx++;
		site = site.substring(0, site_idx+9);
		site = site + loginid;
	}
%>

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
			alert("사용자와 USBKEY값이 일치하지 않습니다.");
			location.href = "<%=fail_url%>";
			return ;
		 }
	} else {
	    usbserial = "Nothing Key";
		alert("USBKEY 가 필요합니다.");
		location.href = "<%=fail_url%>";
		return ;
	}
}

</script>
<% } %>
</head>
<% if (!chk)  { %>
<body onload="javascript:auth();">
<object id="ChosunAuth2" width=0 height=0 classid="CLSID:98652349-A6FA-4DA2-9C44-498A1C7C1352"  codebase="http://220.73.135.221:9020/html/authactivex/ChosunAuth2.cab#version=1,0,0,1" onerror="javascript:window.alert('ActiveX 컨트롤을 설치해 주시기 바랍니다.')">

</object>
<% } else { %>
<body onload="javascript:document.form.submit();">
<% } %>
<form name="form" method="post" action="/siteminderagent/forms/login.fcc">
<input type="hidden" name="target" value="<%=logintarget%>?site=<%=site%>">
<input type="hidden" name="smauthreason" value="0">
<input type="hidden" name="SMENC" value ="EUC-KR">

<input type="hidden" name="User" value="<%=loginid%>">
<input type="hidden" name="Password" value="<%=loginpwd%>">
</form>
</body>
</html>
