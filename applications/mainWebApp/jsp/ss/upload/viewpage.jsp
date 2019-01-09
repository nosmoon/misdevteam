<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page contentType="text/html;charset=EUC-KR"%>
<%
    request.setCharacterEncoding("EUC-KR");
%>
<%
  String saveFolder="C:/work";
	String encType="euc-kr";
	int maxSize=5*1024*1024; //5MB
	try{
		MultipartRequest multi=
			new MultipartRequest(request,saveFolder,maxSize,encType,new DefaultFileRenamePolicy());
		String user=multi.getParameter("user");
		String title=multi.getParameter("title");
		String fileName=multi.getFilesystemName("uploadFile");
		int fileSize=(int)multi.getFile("uploadFile").length();
		
		out.println("user:"+user+"<p>");
		out.println("title:"+title+"<p>");
		out.println("fileName:"+fileName+"<p>");
		out.println("fileSize:"+fileSize+"<p>");
	}catch(Exception e){
		e.printStackTrace();
	}
%>