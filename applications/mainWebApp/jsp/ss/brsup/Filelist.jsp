<%@ page contentType="text/html; charset=KSC5601" %>
<%@ page import = "java.io.File" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
  
  request.setCharacterEncoding("KSC5601");
	
	String saveFolder="/isdata/chosunis";
	
	File file = new File( saveFolder );

	String[] fileList = file.list(); // ���� ����Ʈ ����
%>
<HTML>
<HEAD>
<TITLE>���ε�� ���� ���</TITLE>
<STYLE>
	body{ font-size:9pt };
</STYLE>
<SCRIPT>
	function deleteFiles()
	{
		location.href = "delete.jsp";
	}
</SCRIPT>
</HEAD>
<BODY>
<FONT color = "red">* ���ݱ��� ���ε� �Ǿ��� ���ϵ�...</FONT>
<BR>
�׽�Ʈ ���ε� �� ���ϵ��� ���� ��ư�� ������ �������ִ� ������ �����ּ���.
<INPUT type = "button" onClick = "deleteFiles()" value = "����">
<BR><BR>
<%
	// ���丮�� �ִ� ���� ��� ���
	for( int i = 0; i < fileList.length; i++ )
	{
%>
<A href = "./download.jsp?name=<%= fileList[i] %>"><%= fileList[i] %></A><BR>
<%
	}
%>
</BODY>
</HTML>