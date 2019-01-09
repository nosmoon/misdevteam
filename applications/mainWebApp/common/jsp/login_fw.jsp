<%@ page contentType="text/html; charset=EUC-KR" %>
<%
String domainName = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
%>

<script language="javascript">
	function go_main(){
		var winID = "winTFFramework";	// TF Framework Popup Window ID
		var newWin = null				// TF Framework Popup Window Object
		
		var TargetUrl = "/common/jsp/main.jsp";  
		
		newWin = window.open(TargetUrl, winID, "left=0,top=0,width=1220,height=880,menubar=no,toolbar=no,scrollbars=auto,status=no,location=no,resizable=yes");
		newWin.focus();
		
		if (newWin == null) {
			alert("팝업이 차단되어있습니다.\n\n팝업 차단을 해제해 주시기 바랍니다.");
			return;
		}
		
		top.opener = parent;
		parent.close();
	}
	
	go_main();

</script>