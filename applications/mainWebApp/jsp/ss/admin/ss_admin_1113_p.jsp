<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1113_p.jsp
* 기능 : 관리자-마이그레이션-전환-지국DB업로드 에러 확인 팝업
* 작성일자 : 2004-06-03
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
	String logFileContent = Util.Uni2Ksc((String)request.getAttribute("logFileContent"));
	String badFileContent = Util.Uni2Ksc((String)request.getAttribute("badFileContent"));
%>

<html>
<head>
<title>::: 지국DB업로드 에러::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--

// 팝업 종료
function close_modal(){
    window.close();
}

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<!--팝업 사이즈 700*600-->
<table width="700" border="0" cellspacing="0" cellpadding="0" height="450">
<tr>
<td height="76">
	<table width="100%" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr> 
		  <td  height="25" bgcolor="#EBE9DC" class="title">log 파일</td>
		</tr>
		<tr> 
		  <td height="3" colspan="1"> 
		    <!--여백-->
		  </td>
		</tr>
	</table>
	<table width=100% border=0 cellpadding=0 cellspacing=0>
		<tr>
			<td>
				<textarea cols="95" rows="10" class="scroll1"><%=logFileContent %></textarea>
			</td>
		</tr>
	</table>
	<br>
	<table width="100%" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr> 
		  <td  height="25" bgcolor="#EBE9DC" class="title">bad 파일</td>
		</tr>
		<tr> 
		  <td height="3" colspan="1"> 
		    <!--여백-->
		  </td>
		</tr>
	</table>
	<table width=100% border=0 cellpadding=0 cellspacing=0>
		<tr>
			<td>
				<textarea cols="95" rows="10" class="scroll1"><%=badFileContent %></textarea>
			</td>
		</tr>
	</table>
</td>
</tr>
<tr>
	<td align="center" height="27"  bgcolor="#959595"><input type="image" src="/html/comm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=true;"></td>
</tr>
</table>

</body>
</html>
