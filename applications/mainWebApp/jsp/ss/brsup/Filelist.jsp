<%@ page contentType="text/html; charset=KSC5601" %>
<%@ page import = "java.io.File" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
  
  request.setCharacterEncoding("KSC5601");
	
	String saveFolder="/isdata/chosunis";
	
	File file = new File( saveFolder );

	String[] fileList = file.list(); // 파일 리스트 추출
%>
<HTML>
<HEAD>
<TITLE>업로드된 파일 목록</TITLE>
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
<FONT color = "red">* 지금까지 업로드 되어진 파일들...</FONT>
<BR>
테스트 업로드 된 파일들을 우측 버튼을 눌러서 삭제해주는 센스를 보여주세요.
<INPUT type = "button" onClick = "deleteFiles()" value = "삭제">
<BR><BR>
<%
	// 디렉토리에 있는 파일 목록 출력
	for( int i = 0; i < fileList.length; i++ )
	{
%>
<A href = "./download.jsp?name=<%= fileList[i] %>"><%= fileList[i] %></A><BR>
<%
	}
%>
</BODY>
</HTML>