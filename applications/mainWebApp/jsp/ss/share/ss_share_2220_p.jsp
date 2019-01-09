<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_2220_p.jsp
* 기능 : 판매국메인-공지사항-상세(팝업)
* 작성일자 : 2004-04-27
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_S_ANNCDataSet ds = (SS_S_ANNCDataSet)request.getAttribute("ds");
%>


<html>
<head>
<title>공지사항</title>
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
//  alert(document.getElementById("dis_content").innerHTML);
  ifrm_cont.document.all.share_init_id.outerHTML = document.getElementById("dis_content").innerHTML;
}
-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginheight="0" class="scroll1" onload="jsInit()">
<table border="0" width="800" height="100%"  cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top">
        <div style="margin-top:0; margin-left:3;">
		<table width="100%" border="0"  cellpadding="1" cellspacing="0" align="center">
			<tr>
			  <td height="3">
			    <!--여백-->
			  </td>
			</tr>
			<tr>
			  <td  height="25" bgcolor="#EBE9DC" class="title" align="center">:: 공지사항 ::</td>
			</tr>
			<tr>
			  <td height="3">
			    <!--여백-->
			  </td>
			</tr>
		</table>
		<!--공지사항 테이블-->
		<table border="0" width="795" class="gray" cellpadding="2" cellspacing="0" >
			<tr>
				<td class="gray" width="35" align="center" bgcolor="#dddddd" >번호</td>
				<td class="gray" width="50" align="center" ><%= ds.getSeq()%></td>
				<td class="gray" width="60" align="center" bgcolor="#dddddd" >제목</td>
				<td class="gray" width="380" align="center" ><%= Util.checkString(ds.getTitl())%></td>
				<td class="gray" align="center" width="60" bgcolor="#dddddd" >작성자</td>
				<td class="gray" align="center" width="80" ><%= Util.checkString(ds.getMakepersnm())%></td>
				<td class="gray" align="center" width="60" bgcolor="#dddddd" >등록일자</td>
				<td class="gray" align="center" width="70" ><%= Util.convertS(ds.getRegdt())%></td>
			</tr>
			<%
			String cont = ds.getCont1() + ds.getCont2() + ds.getCont3() + ds.getCont4() + ds.getCont5();
            cont = Util.replace(cont, "_#_", "\"");
            cont = Util.replace(cont, "&lt;", "<" );
            cont = Util.replace(cont, "&gt;", ">" );
			%>
			<tr>
				<td class="gray" valign="top" width="795" height="468" align="left" colspan="8">
                  <div id="dis_content" style="display:none"><%=cont%></div>
                  <div id="ifrm_cont_div" style="margin-top:0;margin-bottom:0;">
                    <iframe class="gray" src="/html/share/ss_share_init.html" name="ifrm_cont" width="790" height="464" frameborder="0" marginheight="0" marginwidth="0" scrolling="auto" readonly></iframe>
                  </div>
				</td>
			</tr>
		</table>
		<!--공지사항 테이블 끝-->
        </div>
  </tr>
  <tr>
    <td align="center" height="25" bgcolor="#dddddd"><a href="javascript:self.close();"><img src="/html/comm_img/bu_close.gif" width="49" height="19" border="0"></a></td>
  </tr>
</table>
</body>
</html>
