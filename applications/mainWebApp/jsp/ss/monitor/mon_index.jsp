<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : mon_index.jsp
* ���     : ����ȭ�� ��â���� ����
* �ۼ����� : 2005-08-03
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<html>
<head>
<script language="javascript">
	function jsMainOpen(){
		var opt = ",toolbar=no,menubar=yes,location=no,scrollbars=yes,status=yes,resizable=yes";
		win = window.open("/jsp/ss/monitor/mon_main.jsp", "", "left=0,top=0,width=" + "1006" + ",height=" + "741"  + opt );
        win.focus();
        win.resizeTo(screen.availWidth, screen.availHeight);

        window.opener=self;
        window.close();
	}
</script>
</head>
<body onload="jsMainOpen()">
<form name="form1" method="post">
</form>
</body>
</html>