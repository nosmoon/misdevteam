<%@ page contentType="text/html; charset=KSC5601" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : bridge.jsp
* ��� : ����ȭ�� ��â���� ����
* �ۼ����� : 2009-02-18
* �ۼ��� : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<html>
<head>
<script language="javascript">
	function jsMainOpen(){
		var winID = "winTFFramework";	// TF Framework Popup Window ID
		var newWin = null				// TF Framework Popup Window Object
		
		var TargetUrl = "/common/jsp/main.jsp";  
		
		window.location.href = TargetUrl;
		/*
		newWin = window.open(TargetUrl, winID, "left=0,top=0,width=1220,height=880,menubar=no,toolbar=no,scrollbars=auto,status=no,location=no,resizable=yes");
		newWin.focus();
		
		if (newWin == null) {
			alert("�˾��� ���ܵǾ��ֽ��ϴ�.\n\n�˾� ������ ������ �ֽñ� �ٶ��ϴ�.");
			return;
		}
		
		top.opener = parent;
		parent.close();
		*/
	}
</script>
</head>
<body onload="jsMainOpen()">
<form name="form1" method="post">
</form>
</body>
</html>