<%@ page import="java.util.*,java.io.*,java.sql.*,java.text.*"%><%

byte[] filecont = (byte[])request.getAttribute("filecont");     // request 파일내용
String filenm   = (String)request.getAttribute("filenm");		// request 파일이름

//String filenm2 = new String(filenm.getBytes("KSC5601"),"8859_1");
String filenm2 = new String(filenm.getBytes("8859_1"), "euc-kr");
//String filenm3 = java.net.URLEncoder.encode(filenm2,"EUC-KR").replaceAll("\\+", "%20");


response.setContentLength((int)filecont.length);
response.setContentType("application/smnet");
//response.setHeader("Content-Disposition", "filename=" + filenm2 );
response.setHeader("Content-Disposition", "attachment;filename=" + filenm2 );

BufferedInputStream  fin  = new BufferedInputStream(new ByteArrayInputStream(filecont));
BufferedOutputStream outs = new BufferedOutputStream(response.getOutputStream());

byte[] buf= new byte[1024];

for(int count= fin.read(buf); count != -1; count= fin.read(buf)) {
	outs.write( buf, 0, count );
}
outs.close();
fin.close();

%>
