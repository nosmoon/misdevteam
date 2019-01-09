<%@ page import="java.util.*,java.io.*,java.sql.*,java.text.*"%><%
	byte[] add_file = (byte[])request.getAttribute("add_file"); 
	String add_file_nm   = (String)request.getAttribute("add_file_nm");		
	String add_file_nm2 = new String(add_file_nm.getBytes("KSC5601"),"8859_1");
	
	response.setContentLength((int)add_file.length);
	response.setContentType("application/smnet");
	response.setHeader("Content-Disposition", "attachment;filename=" + add_file_nm2 );

	BufferedInputStream fin = new BufferedInputStream(new ByteArrayInputStream(add_file));
	BufferedOutputStream outs = new BufferedOutputStream(response.getOutputStream());

	byte[] buf= new byte[1024];
	for(int count= fin.read(buf); count != -1; count= fin.read(buf)) {
		outs.write( buf, 0, count );		
	}	
	outs.close();
	fin.close();
%>