<%@ page import="java.util.*,java.io.*,java.sql.*,java.text.*"%><%
byte[] popup = (byte[])request.getAttribute("popup");
if(popup != null){
response.setContentType("image/gif");

BufferedInputStream fin = new BufferedInputStream(new ByteArrayInputStream(popup));
BufferedOutputStream outs = new BufferedOutputStream(response.getOutputStream());

byte[] buf= new byte[1024];

for(int count= fin.read(buf); count != -1; count= fin.read(buf)) {
	outs.write( buf, 0, count );
}
outs.close();
fin.close();
}
else{
	response.setContentType("image/gif");
	File imgFile = new  File("C:\\work\\salesdept\\www\\html\\img\\Pop_up.GIF");
	
	FileInputStream ifo = new FileInputStream(imgFile);
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	
	byte[] buf = new byte[1024];
	int readlength = 0;
	while( (readlength =ifo.read(buf)) != -1 )
	{
		baos.write(buf,0,readlength);
	}
	byte[] imgbuf = null;
	
	imgbuf = baos.toByteArray();
	baos.close();
	ifo.close();    

	BufferedInputStream fin = new BufferedInputStream(new ByteArrayInputStream(imgbuf));
	BufferedOutputStream outs = new BufferedOutputStream(response.getOutputStream());
	
	for(int count= fin.read(buf); count != -1; count= fin.read(buf)) {
		outs.write( buf, 0, count );
	}
	outs.close();
	fin.close();   

}
%>
