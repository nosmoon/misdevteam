<%@ page contentType="text/html; charset=KSC5601" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : bridge.jsp
* 기능 : 메인화면 새창으로 띄우기
* 작성일자 : 2009-02-18
* 작성자 : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
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
			alert("팝업이 차단되어있습니다.\n\n팝업 차단을 해제해 주시기 바랍니다.");
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