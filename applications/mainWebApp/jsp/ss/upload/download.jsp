<%@ page contentType="text/html;charset=8859_1" import = "java.io.*" %>
<%
	
	//String savePath = getServletContext().getRealPath("/") + "/isdata/chosunis";
	
	String savePath = "/chosunis/edi";
	
	int sizeLimit = 200 * 1024 * 1024 ; // 파일 용량 제한 200Mbyte
	
	String fileName = new String( ( request.getParameter("name") ).getBytes("8859_1"), "KSC5601" );
	
	if( fileName.indexOf("..") != -1 )
		throw new Exception("Logged your ip.");

	File file = new File( savePath + "/" + fileName );

	response.setContentType("application/octet-stream"); 

	String Agent=request.getHeader("USER-AGENT");

	if( Agent.indexOf("MSIE") >= 0 )
	{
		int i = Agent.indexOf( 'M', 2 );

		String IEV = Agent.substring( i + 5, i + 8 );

		if( IEV.equalsIgnoreCase("5.5") )
			response.setHeader("Content-Disposition", "filename=" + new String( fileName.getBytes("KSC5601"), "8859_1") );
		else
			response.setHeader("Content-Disposition", "attachment;filename="+new String(fileName.getBytes("KSC5601"),"8859_1")); 
	}
	else
	{
		response.setHeader("Content-Disposition", "attachment;filename=" + new String( fileName.getBytes("KSC5601"), "8859_1") );
	}

	byte b[] = new byte[10 * 1024 * 1024];
	
	if( file.isFile() )
	{  
		try
		{ 
			BufferedInputStream fin = new BufferedInputStream( new FileInputStream( file ) );  
			BufferedOutputStream outs = new BufferedOutputStream( response.getOutputStream() );  

			int read = 0;

			while( ( read = fin.read( b ) ) != -1 )
			{  
				outs.write(b,0,read);
			}

			outs.flush();
			outs.close();  
			fin.close(); 
		}
		catch( Exception e ){}
	}
%>
