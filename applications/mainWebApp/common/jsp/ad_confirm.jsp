<%----------------------------------------------------------
* ���α׷���	: ad_confirm.jsp
* ���α׷����	: Ȯ��ȭ��
* �ۼ�����	: 2010.08.10
* �ۼ���		: KBS
* ��������	:
----------------------------------------------------------%>
<%@page language="java" contentType="text/html; charset=euc-kr"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
<%@page import="java.io.*"%>
<%
	String sql = "", m_from_ip ="";

// output
	String strMsg = "����Ǿ����ϴ�."; //db_id = "", db_sum_dn="", db_sum_cm="", db_pubc_dt = "";

// input
	String strID 		= request.getParameter("id");
	String strCustID 	= request.getParameter("oid");
	String strEmpNo = "", strCustName = "";	
// input. end.
	SimpleDateFormat sdfTime = new SimpleDateFormat("yyyyMMdd");
	long currentTime = System.currentTimeMillis();	
	String entr_ip 		= (String)request.getRemoteAddr();
	String strCurDay 	= sdfTime.format(new java.util.Date(currentTime));
	// fail_url. -- no use
	String fail_url = "http://ciis.chosun.com/common/jsp/auth_ip.jsp";	
	
	if( strCustID.length() == 0 )
	{
		//�Է°��� ���ٸ� �������� �̵��Ѵ�
		out.println ("<script language=javascript>\n<!--");
		out.println ("alert (\"OID ��ϰ��� �����ϴ�\");\n");
		out.println ("	location.href = '"+ fail_url + "';");
		out.println ("//-->\n</script>");
	}
	else
	{
	    String[] arrCustID = strCustID.split("_");
		strEmpNo = arrCustID[0];
		strCustName = arrCustID[1];
		sql = "DELETE FROM TAADM_CUSTPEOPLEDB WHERE EMP_NO='" + strEmpNo + "' AND CUST_NAME='" + strCustName + "'" ;
	
		Connection conn  = null;
		Statement stmt   = null;
		ResultSet rset   = null;
		
		try
		{
			//DB ����	
			Driver myDriver= (Driver)Class.forName("weblogic.jdbc.pool.Driver").newInstance();
			conn   = myDriver.connect("jdbc:weblogic:pool:CIIS_ADV_POOL", null);
	
			stmt   = conn.createStatement();
			rset   = stmt.executeQuery(sql);
			
			sql = "INSERT INTO TAADM_CUSTPEOPLEDB VALUES ('"+strEmpNo+"','"+strCustName+"','"+strID+"','"+entr_ip+"',SYSDATE)";
			rset   = stmt.executeQuery(sql);
	
	//		if ( rset.next() )
	//		{
	//			db_pubc_dt 	= rset.getString("PUBC_DT");
	//			db_sum_dn 	= rset.getString("SUM_DN");
	//			db_sum_cm 	= rset.getString("SUM_CM");
	//		}
			rset.close();
			stmt.close();
			conn.close();
		}
		catch(SQLException e) {out.println((String)e.getMessage()); strMsg = "�ι����� ������� �Դϴ�."; }
		catch(Exception e) {out.println((String)e.getMessage());	strMsg = "�ι����� ������� �Դϴ�.";	 }
		finally {
			try { if(stmt  != null) stmt.close();}  catch(Exception e){ out.println((String)e.getMessage());}
			try { if(rset  != null) rset.close();}  catch(Exception e){ out.println((String)e.getMessage());}
			try { if(conn  != null && !conn.isClosed()) conn.close();}  catch(Exception e){ out.println((String)e.getMessage());}
		}
	}
%>
<html>
<SCRIPT language="JavaScript">
	function Resize(win)
	{	
	  	win.resizeTo(0,0);
	  	window.alert("<%=strMsg%>");
	  	opener.close();
	  	self.close();
	}
</script>	
<body background="/images/notice_back.gif" hidden="true" onload="Resize(this)">
</body>
</html>
