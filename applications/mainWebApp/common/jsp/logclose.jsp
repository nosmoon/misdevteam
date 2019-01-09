<%@ page contentType="text/html; charset=EUC-KR" %>
<script language="javascript">
function go_main(){
	var winID = "winTFFramework";	// TF Framework Popup Window ID
	var newWin = null				// TF Framework Popup Window Object
	newWin = window.open("about:blank", "", "");
	newWin.window.location = "/index.jsp";

	self.close();
}
go_main();
</script>
