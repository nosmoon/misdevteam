<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1427_p.jsp
* ��� : ������-�۾�-���-���������˾�
* �ۼ����� : 2004-06-13
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<html>
<head>
<title></title>
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<body>
<!--FTP ���� -->
<table width="500" border="0"  cellpadding="2" cellspacing="0" align="center">
	<tr>
		<td>

<!--	�� �������� ��� ��Ʈ�ѿ� ������ �ʿ��ϸ� 
	���� ��Ű�� ������ ������ �մϴ�.  LPK_TOOL.EXE�� �����Ͽ� 
	�ʿ��� LPK ������ �ۼ��մϴ�. LPK_TOOL.EXE�� ActiveX SDK,
	http://www.microsoft.com/intdev/sdk/sdk.htm�� �ֽ��ϴ�. Visual
	Basic 6.0 CD�� ���� ������ \Tools\LPK_TOOL ���͸����� ã�� �� �ֽ��ϴ�.	��ü �±��� �����Դϴ�:

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
<!--FTP �� -->
</body>
</html>
