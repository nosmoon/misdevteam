<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1427_p.jsp
* 기능 : 관리자-작업-등록-파일전송팝업
* 작성일자 : 2004-06-13
* 작성자 : 노상현
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<html>
<head>
<title></title>
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<body>
<!--FTP 시작 -->
<table width="500" border="0"  cellpadding="2" cellspacing="0" align="center">
	<tr>
		<td>

<!--	이 페이지의 모든 컨트롤에 사용권이 필요하면 
	사용권 패키지 파일을 만들어야 합니다.  LPK_TOOL.EXE를 실행하여 
	필요한 LPK 파일을 작성합니다. LPK_TOOL.EXE는 ActiveX SDK,
	http://www.microsoft.com/intdev/sdk/sdk.htm에 있습니다. Visual
	Basic 6.0 CD를 갖고 있으면 \Tools\LPK_TOOL 디렉터리에서 찾을 수 있습니다.	개체 태그의 예제입니다:

<OBJECT CLASSID="clsid:5220cb21-c88d-11cf-b347-00aa00a28331">
	<PARAM NAME="LPKPath" VALUE="LPKfilename.LPK">
</OBJECT>
-->

<OBJECT CLASSID="clsid:5220cb21-c88d-11cf-b347-00aa00a28331">
	<PARAM NAME="LPKPath" VALUE="/html/ChosunFTP.lpk">
</OBJECT>

<OBJECT ID="ChosunFTP"
CLASSID="CLSID:A650B81D-DE68-488C-B3C6-0253214F16B6"
CODEBASE="/html/ChosunFTP.CAB#version=1,0,0,20">
</OBJECT>

		</td>
	</tr>
</table>
<!--FTP 끝 -->
</body>
</html>
