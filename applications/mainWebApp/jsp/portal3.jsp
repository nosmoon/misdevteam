<%
/*
 * -----------------------------------------------------------------------------
 * 파일명: index.jsp
 * 설계자: 양정녕
 * 작성자: 양정녕
 * 설명 : 로그인 페이지를 구성한다.
 * -----------------------------------------------------------------------------
 * 수정이력
 * VersionDateDescription		작성자
 *1.0.0 2008/10/27상세설계에 의거.		양정녕
 * -----------------------------------------------------------------------------
 */
%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@	page import="java.net.*;" %>
<%@	page import="java.io.*;" %>
<%
	response.setHeader("Pragma","No-cache"); //HTTP 1.0 
	response.setDateHeader ("Expires", 0); 
	response.setHeader ("Cache-Control", "no-cache");

	String strDocument = request.getParameter("Document");
	strDocument = strDocument.replaceAll("&gt;", "<");
	strDocument = strDocument.replaceAll("&lt;", ">");
	strDocument = strDocument.replaceAll("&quot;", "\"");

	URL url = new URL("http://220.73.135.220:7777/servlet/com.nanum.xf.servlet.job.XFJobServlet");
	URLConnection conn = url.openConnection();
	
	conn.setDoOutput(true);
	OutputStream os = conn.getOutputStream();
	PrintWriter out2 = new PrintWriter(os);
	out2.println("userID=user2"); // ??
	out2.println("jobID=HD001"); // ??
	out2.println("docID=100-HD001-20090309-001"); // ??
	out2.println("document=" + strDocument); // ??
	out2.close();
	
	String temp;
	
	InputStream is = conn.getInputStream();
	InputStreamReader isr = new InputStreamReader(is);
	BufferedReader br = new BufferedReader(isr);
	
	while((temp=br.readLine())!=null){
		System.out.println(temp);
	}
	br.close();

%>
