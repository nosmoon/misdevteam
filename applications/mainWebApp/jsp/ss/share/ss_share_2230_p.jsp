<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_2230_p.jsp
* 기능 : 판매국메인-실시간공지-상세(팝업)
* 작성일자 : 2004-04-27
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_S_ANNCSLSDataSet ds = (SS_S_ANNCSLSDataSet)request.getAttribute("ds");
%>


<html>
<head>
<title>실시간공지</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
    show_cont();
}

function show_cont() {
  //iframe에 내용을 나타냄 readonly
  ifrm_cont.document.all.share_init_id.outerHTML = document.getElementById("dis_content").innerHTML;
}
-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginheight="0" class="scroll1" onload="jsInit()">
<table border="0" width="470" height="100%"  cellspacing="2" cellpadding="2" align="center">
<tr>
<td valign="top">

	<table width="100%" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr>
		  <td height="3">
		    <!--여백-->
		  </td>
		</tr>
		<tr>
		  <td  height="25" bgcolor="#EBE9DC" class="title">실시간 공지</td>
		</tr>
		<tr>
		  <td height="3">
		    <!--여백-->
		  </td>
		</tr>
	</table>

	<!--실시간공지 테이블-->
	<table border="0" width="470" class="gray" cellpadding="2" cellspacing="0" >
		<tr>
			<td class="gray" width="70" align="left" bgcolor="#dddddd" > 작성자 </td>
			<td class="gray" align="left"><%= Util.checkString(ds.getMakepersnm())%></td>
		</tr>
		<tr>
			<td class="gray" width="70" align="left" bgcolor="#dddddd" > 제목 </td>
			<td class="gray" align="left"><%= Util.checkString(ds.getAnnctitl())%></td>
		</tr>
	<%
	String cont = ds.getAnnccont();
    cont = Util.replace(cont, "_#_", "\"");
    cont = Util.replace(cont, "&lt;", "<" );
    cont = Util.replace(cont, "&gt;", ">" );
	%>
		<tr>
            <td class="gray" width="70" bgcolor="#dddddd"> 내용 </td>
            <td class="gray" valign="top" height="170" align="left" colspan="2">
              <div id="dis_content" style="display:none"><%=cont%></div>
              <div id="ifrm_cont_div" style="margin-top:0;margin-bottom:0;">
                <iframe class="gray" src="/html/share/ss_share_init.html" name="ifrm_cont" width="400" height="170" frameborder="0" marginheight="0" marginwidth="0" scrolling="auto" readonly></iframe>
              </div>
            </td>
<%--
			<td class="gray" width="70" bgcolor="#dddddd"> 내용 </td>
			<td class="gray" height="170" align="left" colspan="3">
				<textarea cols="52" rows="12" readOnly><%=//ds.getAnnccont()%></textarea>
			</td>
--%>
		</tr>
	</table>
	<!--실시간공지 테이블 끝-->
</td>
</tr>
<tr>
	<td align="center" height="25" bgcolor="#dddddd"><a href="javascript:self.close();"><img src="/html/comm_img/bu_close.gif" width="49" height="19" border="0"></a></td>
</tr>
</table>
</body>
</html>
