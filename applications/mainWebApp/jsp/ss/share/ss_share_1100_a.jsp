<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1100_l.jsp
* 기능 : 정보공유 타사발송부수 조회화면
* 작성일자 : 2003-11-20
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
    int listCount = 20;	// 한 화면당 리스트 항목 수
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.taslm_othqty_search_form.invsgdt.focus();
}

// form 단위로 유효성을 검증한 예제
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

//타사발송부수 검색 조회
function list_search(){
    var lo_form1 = document.taslm_othqty_search_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 날짜조건을 "/ss/share/1110" 서블릿으로 보낸다
    lo_form1.action = "/ss/share/1110";
    lo_form1.target = "ifrm";
    lo_form1.submit();

}

// 페이지 이동
function page_move(pageno) {

    var lo_form1 = document.taslm_othqty_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    // "/ss/share/1110" 서블릿으로 보낸다
    lo_form1.action = "/ss/share/1110";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >정보공유
      &gt; </b> 타사발송부수</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>

<!--타사발송부수 검색 시작-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="taslm_othqty_search_form" method="post" action="" >
    <input type="hidden" name="pageno" value ="1">
    <input type="hidden" name="pagesize" value ="<%= listCount%>">	<!-- 한 화면당 리스트 항목 수 -->
    <input type="hidden" name="js_fn_nm" value ="page_move">

	<tr>
		<td bgcolor="#EBE9DC" width="70" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">등록일자</td>
		<td bgcolor="#EBE9DC" class="title" width="300">
			<input name="invsgdt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="등록일자" dataType="date">
			-
			<input name="invsgdt2" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="등록일자" dataType="date"> 예) 20040101
		</td>
		<td bgcolor="#EBE9DC" class="title"" align="right">
			<input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" class="sel_all" onclick="javascript:list_search()">
		</td>
	</tr>
	<tr>
		<td height="3" colspan="4">
		<!--여백-->
		</td>
	</tr>
</form>
</table>
<!--타사발송부수 검색 끝-->

<!--타사발송부수 목록 시작-->
<table width="830" border="0" cellspacing="0" cellpadding="1" align="center" bgcolor="#FFFFFF" class="gray" id="othqty_list_id">
	<tr bgcolor="#dddddd" align="center" height="23">
		<td class="gray">등록일자</td>
		<td class="gray" width="120">팀&nbsp;</td>
		<td class="gray" width="120">지역</td>
		<td class="gray" width="120">지국</td>
		<td class="gray" width="120">중앙일보</td>
		<td class="gray" width="120">동아일보</td>
		<td class="gray" width="120">기타</td>
	</tr>
	<%-- 초기화면 목록 반복 시작 --%>
	<%for(int i=0; i<listCount; i++){%>
	<tr>
		<td class="gray" align="center"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
	</tr>
	<%}%>
	<%-- 초기화면 목록 반복 끝 --%>
	<tr bgcolor="#dddddd" align="right">
		<td colspan="7" class="gray" height="23">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
		</td>
	</tr>
</table>
<!--타사발송부수 목록 끝-->

<!-- 페이지 이동 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
	<tr>
		<td align="center" height="2">
		<!--여백-->
		</td>
	</tr>
	<tr>
	    <td align="center" height="24" bgcolor="#E8E8E8">
	        <!--JSP PAGE START---------------------------------------------------------------------------------->
	        <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
	                <jsp:param name = "pageno" 		value="0"/>
	                <jsp:param name = "totalcnt" 	value="0"/>
	                <jsp:param name = "js_fn_nm" 	value="page_move"/>
	                <jsp:param name = "pagesize" 	value="<%= listCount%>"/>
	                <jsp:param name = "page_set_gubun" 	value="0"/>
	        </jsp:include>
	        <!--JSP PAGE END------------------------------------------------------------------------------------>
		</td>
  	</tr>
</table>
<!-- 페이지 이동 -->
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
