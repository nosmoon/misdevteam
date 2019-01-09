<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1315_p.jsp
* 기능 : 지국Info-지국조직현황-상세 목록 (팝업)
* 작성일자 : 2004-11-13
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BOEMP_DTLDataSet ds = (SS_L_BOEMP_DTLDataSet)request.getAttribute("ds");
%>

<html>
<head>
<title>::: 종사원 목록::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--

	//창닫기
	function close_modal(){
		window.close();
	}
//-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">

<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF">
	<tr bgcolor="#dddddd" height="23">
		<td width="60"  class="gray" align="center">이름</td>
		<td width="70"  class="gray" align="center">직책</td>
		<td width="100"  class="gray" align="center">주민번호</td>
		<td width="100"  class="gray" align="center">전화</td>
		<td class="gray" align="center">주소</td>
		<td width="70"  class="gray" align="center">입사일자</td>
		<td width="80"  class="gray" align="center">사이버일자</td>
		<td width="60"  class="gray" align="center">보험가입</td>
	</tr>

	<!-- 목록 시작 -------------------------------------------------------------------------->
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOEMP_DTLCURCOMMLISTRecord curcommlistRec = (SS_L_BOEMP_DTLCURCOMMLISTRecord)ds.curcommlist.get(i);%>

    <tr>
		<td width="60"  class="gray" align="left">&nbsp;<%= curcommlistRec.flnm%></td>
		<td width="70"  class="gray" align="left">&nbsp;<%= curcommlistRec.dutynm%></td>
		<td width="100"  class="gray" align="center"><%= Util.FormatJumin(curcommlistRec.prn)%>&nbsp;</td>
		<td width="100"  class="gray" align="left"><%= Util.getChainStr(curcommlistRec.tel1, curcommlistRec.tel2, curcommlistRec.tel3, "-")%>&nbsp;</td>
		<td class="gray" align="left"><%= curcommlistRec.addr%>&nbsp;<%= curcommlistRec.dtlsaddr%></td>
		<td width="70"  class="gray" align="center"><%= Util.convertS(curcommlistRec.in_cmpy_dt)%>&nbsp;</td>
		<td width="80"  class="gray" align="center"><%= Util.convertS(curcommlistRec.regdt)%>&nbsp;</td>
		<td width="60"  class="gray" align="center"><%= curcommlistRec.cctryn%></td>
	</tr>
    <%}%>
</table>

<table align="center">
  	<tr>
    	<td align="center" height="27"  bgcolor="#000000"><input type="image" src="/html/comm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;"></a></td>
  	</tr>
</table>

</body>
</html>

<script>

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
    close_modal();
<%}%>
</script>
