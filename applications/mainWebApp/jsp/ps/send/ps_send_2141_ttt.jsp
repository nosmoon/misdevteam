<%--@ page contentType="text/html; charset=KSC5601" --%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.util.*,java.io.*,java.sql.*,jxl.*" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_send_2141_t.jsp
* ���     : �ݼ۰��� excel ���ε�
* �ۼ����� : 2008-07-10
* �ۼ���   : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ���     :
---------------------------------------------------------------------------------------------------%>
<%
    String path=request.getRealPath("/upload/");    //���ε�Ǵ� ��ġ ����
    int sizeLimit = 2*1024*1024;                    //���Ͽ뷮����

    //������ ������Ʈ ����(������ ���ϸ��� ���� ��ü, �������� ������, ���Ͽ뷮����, �����ڵ�, �⺻���� ����)
    MultipartRequest multi = new MultipartRequest(request, path, sizeLimit, "8859_1", new DefaultFileRenamePolicy());
    Enumeration formNames = multi.getFileNames();       //�������� ����
    String formName1 = (String)formNames.nextElement();
    String fname1 = multi.getFilesystemName(formName1);

    Workbook workbook = Workbook.getWorkbook(new File(path+"/"+fname1));
    Sheet sheet = workbook.getSheet(0);
    int col = sheet.getColumns();
    int row = sheet.getRows();
    cell f_rdr_no;
    int f_retn_nmno;

%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title></title>
<meta NAME="Generator" CONTENT="EditPlus">
<meta NAME="Author" CONTENT="">
<meta NAME="Keywords" CONTENT="">
<meta NAME="Description" CONTENT="">
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
</head>
<body>
<form name="upload_form" method="post" action="" >
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td>
      <table width="830" border="0" cellspacing="0" cellpadding="2">
        <tr>
          <td height="27" class="title" bgcolor="#EBE9DC"><b>�ݼ۰��� Excel ���ε�</b></td>
          <td height="27" class="title" width="50"  bgcolor="#EBE9DC" align="right"><img src="/html/comm_img/bu_excel_upload.gif" align="absmiddle" border="0" style="cursor:hand" onclick="excel_upload()" ></td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td height="3">
      <!--����-->
    </td>
  </tr>
  <tr>
    <td width="80">
      <!--����Ʈ -->
      <table cellspacing="0" width="830" cellpadding="1" border="0" class="gray" bgcolor="#FFFFFF" id="code_list">
        <tr>
          <td width="100" class="gray" bgcolor="#dddddd" align="center" >�ݼ�����</td>
          <td width="100" class="gray" bgcolor="#dddddd" align="center" >���ڹ�ȣ</td>
          <td width="100" class="gray" bgcolor="#dddddd" align="center" >�ݼ�����</td>
          <td width="100" class="gray" bgcolor="#dddddd" align="center" >�ݼ�ȣ��</td>
          <td width="100" class="gray" bgcolor="#dddddd" align="center" >�ݼۻ���</td>
        </tr>

<%
    int cellLen1= 0;
    for(int i=0; i<row; i++){
      Cell cell[] = sheet.getRow(i);
      cellLen1 = cell.length;
%>
        <tr>
<%
/*
    var s=ext1.lastIndexOf("\\");
    var m=ext1.lastIndexOf(".");
    var e=ext1.length;
    var filename=ext1.substring(s+1,m);
    var extname=ext1.substring(m+1,e);
    var all=ext1.substring(s+1,e);

    lo_form1.filename.value = all;
    if(ext1.split(" ").join("") != ""){
        ext2 = ext1.substring(ext1.length-4,ext1.length);
        ext2 = ext2.toLowerCase();
        if(ext2 != '.xls'){
            alert("�������ϸ� ���ε� �����մϴ�...");
            return;

*/


      for(int j=0; j<col; j++){
        if(j<cellLen1 && cell[j].getContents()!=""){
          System.out.println("cell["+j+"].getContents():"+cell[j].getContents());
          f_rdr_no=cell[j].getContents();
          f_rdr_no=f_rdr_no.substring(0,17);

          System.out.println("f_rdr_no:"+f_rdr_no);


%>
          <td width="100"  class="gray" align="center" >
            <input type="text" name="data" value="<%=cell[j].getContents()%>" class="readonly_box" ReadOnly>
          </td>
<%
        }else{
          System.out.println("cell["+j+"].getContents():"+cell[j].getContents());
%>
          <td width="100" class="gray" align="center" >&nbsp;</td>
<%
        }
      }
%>
        </tr>
<%
	}
    System.out.println("cellLen1:"+cellLen1);
//    System.out.println("cellLen2:"+cellLen2);
%>
      </table>
    </td>
  </tr>
</table>
<%--
<table border="1">
<%
    int cellLen= 0;
    for(int i=0; i<row; i++){
      Cell cell[] = sheet.getRow(i);
      cellLen = cell.length;
      out.println("<tr>");
      for(int j=0; j<col; j++){
        if(j<cellLen && cell[j].getContents()!=""){
          out.println("<td>"+cell[j].getContents()+"</td>");
        }else{
          out.println("<td>&nbsp;</td>");
        }
      }
      out.println("</tr>");
    }
%>
</table>
--%>
</form>
</body>
</html>
