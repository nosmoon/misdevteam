<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@page import="java.util.*, java.sql.*,oracle.jdbc.OracleTypes	"%><%
	
	String cmpy_cd = "";
	String auth_gb = "";
	String incmg_pers = "";	
	String feat_clsf = "";
	String select_team = "";
	String select_part = "";
	String select_area = "";
	
	if (request.getParameter("cmpy_cd") != null)	cmpy_cd = request.getParameter("cmpy_cd").trim();
	if (request.getParameter("auth_gb") != null)	auth_gb = request.getParameter("auth_gb").trim();
	if (request.getParameter("incmg_pers") != null)	incmg_pers = request.getParameter("incmg_pers").trim();
	if (request.getParameter("feat_clsf") != null)	feat_clsf = request.getParameter("feat_clsf").trim();
	if (request.getParameter("select_team") != null)	select_team = request.getParameter("select_team").trim();
	if (request.getParameter("select_part") != null)	select_part = request.getParameter("select_part").trim();
	if (request.getParameter("select_area") != null)	select_area = request.getParameter("select_area").trim();

	String sp_Qurery = "";		
	sp_Qurery = "{ call SP_SE_MO_BAS_ORGATREE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? , ? ,? ) }" ;

	Connection conn  = null;
	Statement stmt   = null;
	ResultSet rs_team   = null;
	ResultSet rs_part   = null;
	ResultSet rs_area   = null;
	ResultSet rs_bocd   = null;


	String result = "4";
	CallableStatement cstmt = null;

	/**
	 * ����Ÿ���̽��� �����մϴ�.
	 * �غ�� ���������� ������ ��ȸ�մϴ�.
	 * ���� ����� ���̺� ������ ������ �װɷ� ���Ѵ�.
	 * ����� ���̺� ������ ������ �̺�Ʈ ���̺��� ������ �����ͼ� ���Ѵ�.
	*/
	try
	{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			//DB ����	
		conn = DriverManager.getConnection("jdbc:oracle:thin:@//192.168.2.240:1525/XCRMSL", "crmsal_com", "xsl_#82dudtksghd"); //�
//		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.101:1521:DEVCRMSL", "crmsal_com", "dev_crmsal_com");   //����
			
				cstmt = conn.prepareCall(sp_Qurery);

				cstmt.registerOutParameter(1, Types.VARCHAR);
				cstmt.registerOutParameter(2, Types.VARCHAR);
				

				cstmt.setString(3, "100"); // cmpy_cd;
				cstmt.setString(4, select_team);
				cstmt.setString(5, select_part );
				cstmt.setString(6, select_area); 
				cstmt.setString(7, "1");  // auth_gb
				cstmt.setString(8, incmg_pers);  
				cstmt.setString(9, "");   // feat_clsf

	      cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	      cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	      cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	      cstmt.registerOutParameter(13, OracleTypes.CURSOR);
				//cstmt.execute();
	      cstmt.executeQuery();
	         				
	      rs_team = (ResultSet)cstmt.getObject(10);
	      rs_part = (ResultSet)cstmt.getObject(11);
	      rs_area = (ResultSet)cstmt.getObject(12);
	      rs_bocd = (ResultSet)cstmt.getObject(13);


				String errcode = cstmt.getString(1);
				String errmsg = cstmt.getString(2);


				if("".equals(errcode) || errcode == null){
       	 	out.println("<resultlist>");
	        out.println("<errinfo>");
					out.println("<errcode></errcode>");
					out.println("<errmsg></errmsg>");
	        out.println("</errinfo>");
       		out.println("<resultinfo>");
%>
<%       		
					while (rs_team.next()) {
						String teamcd = rs_team.getString("DEPT_CD");
						String teamnm = rs_team.getString("DEPT_NM");
%>
						<team_info>
							<teamcd><%=teamcd %></teamcd>															<!-- ���ڵ� -->
							<teamnm><![CDATA[<%=teamnm %>]]></teamnm>									<!-- ���� -->
						</team_info>
<%
					}
%>
<%					

					while (rs_part.next()) {
						String partcd = rs_part.getString("DEPT_CD");
						String partnm = rs_part.getString("DEPT_NM");
%>
						<part_info>
							<partcd><%=partcd %></partcd>															<!-- ��Ʈ -->
							<partnm><![CDATA[<%=partnm %>]]></partnm>									<!-- ��Ʈ�� -->
						</part_info>
<%
					}
%>
<%

					while (rs_area.next()) {
						String areacd = rs_area.getString("AREA_CD");
						String areanm = rs_area.getString("AREA_NM");
%>
						<area_info>
							<areacd><%=areacd %></areacd>															<!-- �����ڵ� -->
							<areanm><![CDATA[<%=areanm %>]]></areanm>									<!-- �����ڵ�� -->
						</area_info>
<%
					}
%>
<%

					while (rs_bocd.next()) {
						String bocd = rs_bocd.getString("BOCD");
						String bonm = rs_bocd.getString("BONM");
%>
						<bocd_info>
							<bocd><%=bocd %></bocd>															<!-- �����ڵ� -->
							<bonm><![CDATA[<%=bonm %>]]></bonm>									<!-- ���͸� -->
						</bocd_info>
<%
					}
%>
<%
				out.println("</resultinfo>");
				out.println("</resultlist>");
			} else {
%>
					out.println("<resultlist>");
		      out.println("<errinfo>");
					out.println("<errcode>"+result+"</errcode>");
		  		out.println("<errmsg><![CDATA[������ �����Դϴ�.]]></errmsg>");
		      out.println("</errinfo>");
		      out.println("<resultinfo>");
		
					out.println("<team_info><teamcd></teamcd><teamnmd></<teamnm></team_info>");
					out.println("<part_info><partcd></partcd><partnm></partnm></part_info>");
					out.println("<area_info><areacd></areacd><areanm></areanm></area_info>");
					out.println("<bocd_info><bocd></bocd><bonm></bonm></bocd_info>");
		      out.println("</resultinfo>");	
		      out.println("</resultlist>");

<%
			}
	}
	catch(SQLException e) {
					out.println("<resultlist>");
		      out.println("<errinfo>");
					out.println("<errcode>"+result+"</errcode>");
		  		out.println("<errmsg><![CDATA[������ �����Դϴ�.]]></errmsg>");
		      out.println("</errinfo>");
		      out.println("<resultinfo>");
		
					out.println("<team_info><teamcd></teamcd><teamnmd></<teamnm></team_info>");
					out.println("<part_info><partcd></partcd><partnm></partnm></part_info>");
					out.println("<area_info><areacd></areacd><areanm></areanm></area_info>");
					out.println("<bocd_info><bocd></bocd><bonm></bonm></bocd_info>");
		      out.println("</resultinfo>");	
		      out.println("</resultlist>");
		System.out.println("SQLException"+e.toString());
	}
	catch(Exception e) {
					out.println("<resultlist>");
		      out.println("<errinfo>");
					out.println("<errcode>"+result+"</errcode>");
		  		out.println("<errmsg><![CDATA[������ �����Դϴ�.]]></errmsg>");
		      out.println("</errinfo>");
		      out.println("<resultinfo>");
					out.println("<team_info><teamcd></teamcd><teamnmd></<teamnm></team_info>");
					out.println("<part_info><partcd></partcd><partnm></partnm></part_info>");
					out.println("<area_info><areacd></areacd><areanm></areanm></area_info>");
					out.println("<bocd_info><bocd></bocd><bonm></bonm></bocd_info>");
					out.println("<bocdnmlist></bocdnmlist>");
		      out.println("</resultinfo>");	
		      out.println("</resultlist>");
		System.out.println("Exception"+e.toString());
	}
	finally {
		try { if(cstmt  != null) cstmt.close();}  catch(Exception e){}
		try { if(rs_team  != null) rs_team.close();}  catch(Exception e){}
		try { if(rs_part  != null) rs_part.close();}  catch(Exception e){}
		try { if(rs_area  != null) rs_area.close();}  catch(Exception e){}
		try { if(rs_bocd  != null) rs_bocd.close();}  catch(Exception e){}
		try { if(conn  != null && !conn.isClosed()) conn.close();}  catch(Exception e){}
	}
%>