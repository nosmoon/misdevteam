<%@ page import="java.util.*,java.io.*,java.sql.*,java.text.*"%><%
byte[] thunbnail = (byte[])request.getAttribute("thunbnail");
if(thunbnail != null){
response.setContentType("image/gif");

BufferedInputStream fin = new BufferedInputStream(new ByteArrayInputStream(sajin));
BufferedOutputStream outs = new BufferedOutputStream(response.getOutputStream());

byte[] buf= new byte[1024];

for(int count= fin.read(buf); count != -1; count= fin.read(buf)) {
	outs.write( buf, 0, count );
}
outs.close();
fin.close();
}
%>
