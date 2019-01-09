<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%@ page import="java.io.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<title>download</title>
</head>
<body>
<%
 try{

  String file_name = "영업담당 매뉴얼-1.doc";
  //File file = new File("C:/work/agency2/www/VPN/"+file_name);
  //File file = new File("//was//agency//VPN//"+file_name);
  //File file = new File("//webstore//pub/agency//webapps//VPN//"+file_name);
  File file = new File("C:/work/ciis_chosun_com/applications/mainWebApp/upload/"+file_name);

  response.reset();

  response.setContentType("application/x-msdownload");
  response.setHeader("Content-Disposition", "attachment;filename="+file_name);  
  response.setHeader("Content-Treansper-Encoding", "binary");
  response.setContentLength((int)file.length());
  response.setHeader("Pargma","no-cache");
  response.setHeader("Expires","-1");
  
  byte[] data = new byte[(int)file.length()];
  BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
  BufferedOutputStream fos = new BufferedOutputStream(response.getOutputStream());
  
  int count = 0;
  while((count = fis.read(data))!= -1){
   fos.write(data);
  }
  
  out.clear();
  out = pageContext.pushBody();
  
  if(fis !=null) fis.close();
  if(fos !=null) fos.close();
  
 }catch(Exception e){
  System.out.println("download error" + e);
 }


%>
</body>
</html> 
