<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
<%
	String sql = "",m_from_ip ="",entr_ip="";		
	String db_from_ip = "",site = "",chk = "N";

	entr_ip = (String)request.getRemoteAddr();
	site = request.getParameter("site");

	if(site != null && site.equals("eip")) {
		site = "http//eipt.chosun.com:7777";
	} else {
		site = "http://ciis.chosun.com:9020/common/jsp/logout.jsp";
	}

	sql = "SELECT SF_CO_FIND_IP_CHK('"+entr_ip+"','1') AS FROM_IP FROM DUAL";

	Connection conn  = null;
	Statement stmt   = null;
	ResultSet rset   = null;
	
	/**
	 * µ¥LŸº£L½º¿¡ ¿¬°∕´ϴ׮
	 * º񶆠ŵ¸®¹®8·̠dº¸¸¦ vȸȕ´ϴ׮
	 * ¸ր�쁚 ƗLº��� dº¸°¡ V8¸砱װɷ̠º񱴇Ѵ׮
	 * »耫Z ƗLº��� dº¸°¡ ¾� Lº¥Ʈ ƗLº���¼­ dº¸¸¦ °¡n¿ͼ­ º񱴇Ѵ׮
	 */
	try
	{
		//DB ¿¬°�
		Driver myDriver= (Driver)Class.forName("weblogic.jdbc.pool.Driver").newInstance();
		conn   = myDriver.connect("jdbc:weblogic:pool:CIIS_COM_POOL", null);

		stmt   = conn.createStatement();
		rset   = stmt.executeQuery(sql);

		if ( rset.next() )
		{
			db_from_ip = rset.getString("FROM_IP");
		}
		
		rset.close();
		stmt.close();
		conn.close();
		
		if (db_from_ip != null && db_from_ip.equals("Y"))	
			chk = "Y";
	}
	catch(SQLException e) {System.out.println((String)e.getMessage());}
	catch(Exception e) {System.out.println((String)e.getMessage());}
	finally {
		try { if(stmt  != null) stmt.close();}  catch(Exception e){ System.out.println((String)e.getMessage());}
		try { if(rset  != null) rset.close();}  catch(Exception e){ System.out.println((String)e.getMessage());}
		try { if(conn  != null && !conn.isClosed()) conn.close();}  catch(Exception e){ System.out.println((String)e.getMessage());}
	}
out.println(chk);
%>
