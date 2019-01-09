<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : mon_index.jsp
* 기능     : 메인화면 새창으로 띄우기
* 작성일자 : 2005-08-03
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
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