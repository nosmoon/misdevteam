<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<html>
<head>
<title>아파트 투입현황 상세</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="javascript">
<!--

	//페이지초기화시 버튼설정및 EventHandler호출
	function jsInit(){

		setEventHandler();
		setEnterKeyEventHandler();

		}

    function list_search() {
        var lo_form1 = document.hous_thrw_form;

		lo_form1.action = "/ss/brmgr/1886";
		lo_form1.target = "ifrm";
		lo_form1.method = "post";
        lo_form1.submit();

        return;
    }
-->
</script>
</head>
<body onload="jsInit();list_search();" bgcolor="#FFFFFF" class="scroll1">
<!--지국정보-->
<%--
<table id="bo_info_id" width="810" border="0" cellpadding="2" cellspacing="0"  align="center" class="gray">
<tr><td>
<form name="bo_info_form" method="post" action="">
<input type="text" name="bocd" value="<%=request.getParameter("bocd")%>">:bocd<br>
<input type="text" name="invsgdt" value="<%=request.getParameter("invsgdt")%>">:invsgdt<br>
<input type="text" name="invsgno" value="<%=request.getParameter("invsgno")%>">:invsgno<br>
<input type="text" name="addrcd" value="<%=request.getParameter("addrcd")%>">:addrcd<br>
<input type="text" name="dongno" value="<%=request.getParameter("dongno")%>">:dongno<br>
</form>
</td></tr>
</table>
--%>
<!--투입매체별 현황-->
<%--
<table id="apt_thrw_info_id" width="810" border="0" cellpadding="2" cellspacing="0"  align="center" class="gray">
<tr><td>
<form name="apt_thrw_info_form" method="post" action="" >
<input type="text" name="areanm" value="">:areanm<br>
<input type="text" name="bonm" value="">:bonm<br>
<input type="text" name="zip" value="">:zip<br>
<input type="text" name="addr" value="">:addr<br>
<input type="text" name="addrnm" value="">:addrnm<br>
<input type="text" name="pyong" value="">:pyong<br>
<input type="text" name="hoscnt" value="">:hoscnt<br>
<input type="text" name="cho_cnt" value="">:cho_cnt<br>
<input type="text" name="cho_rate" value="">:cho_rate<br>
<input type="text" name="jung_cnt" value="">:jung_cnt<br>
<input type="text" name="jung_rate" value="">:jung_rate<br>
<input type="text" name="dong_cnt" value="">:dong_cnt<br>
<input type="text" name="dong_rate" value="">:dong_rate<br>
<input type="text" name="invsghhmm" value="">:invsghhmm<br>
<input type="text" name="invsgpers" value="">:invsgpers<br>
<input type="text" name="addrcdnm" value="">:addrcdnm<br>
<input type="text" name="dongno" value="">:dongno<br>
<input type="text" name="remk" value="">:remk<br>
</form>
</td></tr>
</table>
--%>
<table id="boemp_search_id" width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="boemp_search_form" method="post" action="" >
	<tr>
		<td bgcolor="#EBE9DC" width="38" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">팀&nbsp;</td>
	    <td bgcolor="#EBE9DC" class="title" width="80"><input name="deptnm" type="text" size="4" class="text_box" style="width:70;" readonly></td>
        <td bgcolor="#EBE9DC" width="38" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역</td>
	    <td bgcolor="#EBE9DC" class="title" width="80"><input name="areanm" type="text" size="4" class="text_box" style="width:70;" readonly></td>
    	<td bgcolor="#EBE9DC" class="title" width="38""><img src="/html/comm_img/ic_title.gif" width="12" height="7">지국</td>
	    <td bgcolor="#EBE9DC" class="title" width="90"><input name="bonm" type="text" size="4" class="text_box" style="width:70;" readonly></td>
    	<td bgcolor="#EBE9DC" class="title" width="60""><img src="/html/comm_img/ic_title.gif" width="12" height="7">바로가기</td>
	    <td bgcolor="#EBE9DC" class="title" width="*"><input name="qsearch" type="text" class="text_box" value="" style="width:100;" readonly></td>
    </tr>
</form>
</table>

<table border="0" cellpadding="0" cellspacing="0">
<tr><td height="3"></td></tr>
</table>

<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">아파트 투입현황 상세</td>
  </tr>
  <tr>
    <td height="2">
      <!--여백-->
    </td>
  </tr>
</table>
<!--아파트 투입현황 조사내역 상세 -->
<table id="thrw_head_id" width="830" border="0" align="center" cellpadding="2" cellspacing="0" class="gray" >
<form name="thrw_head_form" method="post" action="" >
<input name="bocd" type="hidden" value="">
  <tr>
    <td class="gray" width="90" bgcolor="#dddddd">주소</td>
    <td colspan="5" class="gray">
        <input name="zip" type="text" size="7" tabIndex="1" class="text_box" value="" style="width:70;" readonly>
        <input name="addrcdnm" type="text" tabIndex="3" class="text_box" value="" style="width:264;" readonly>
        <input name="addrcdnm" type="text" tabIndex="3" class="text_box" value="" style="width:199;" readonly>
        아파트
        <input name="dongno" type="text" tabIndex="3" class="text_box" value="" style="width:62;" readonly>
        동</td>
  </tr>
  <tr>
    <td width="90" class="gray" bgcolor="#dddddd">아파트정보</td>
    <td width="340" class="gray">
      <input name="pyong" type="text" style="ime-mode:disabled;text-align:center" class="text_box" tabIndex="4" size="10" value="">
      평형
    </td>
    <td  class="gray" width="70" bgcolor="#dddddd">입주일자</td>
    <td  class="gray" width="140">
      <input name="mvindt" type="text" style="ime-mode:disabled;text-align:center" class="text_box" tabIndex="5" size="10" value="" readonly>
    </td>
    <td  class="gray" width="*" bgcolor="#dddddd">세대수 </td>
    <td  class="gray">
      <input name="hoscnt" type="text" style="ime-mode:disabled;text-align:right" class="text_box" tabIndex="5" size="5" value="">
    </td>
  </tr>
  <tr>
    <td class="gray" width="90" bgcolor="#dddddd">조사일시</td>
    <td class="gray">
      <input name="year" type="text" class="text_box" maxlength="4" tabIndex="6" value="" size="4" dataType="number" len="4" caption="조사년도" notEmpty>
      년
      <input name="month" type="text" size="2" tabIndex="7" maxlength="2" value="" class="text_box" dataType="number" len="2" caption="조사월" maxValue="12" notEmpty>
      월
      <input name="day" type="text" size="2" tabIndex="8" maxlength="2" value="" class="text_box" dataType="number" len="2" caption="조사일" maxValue="31">
      일
      <input name="hour" type="text" size="2" tabIndex="9" maxlength="2" value="" class="text_box" dataType="number" len="2" caption="시간" maxValue="24">
      시
      <input name="minute" type="text" size="2" tabIndex="10" maxlength="2" value="" class="text_box" dataType="number" len="2" caption="분" maxValue="59">
      분경
    </td>
    <td  class="gray" bgcolor="#dddddd">등록자구분</td>
    <td  class="gray" >
      <%-- 등록구분1, 등록구분2 설정 --%>
      <select id="sel_regtype1_id" name="sel_regtype1" class="sel_all" tabIndex="3" onChange="">
        <option value="">선택</option>
      </select>
      <select id="sel_regtype2_id" name="sel_regtype2" class="sel_all" tabIndex="3" onChange="">
        <option value="">선택</option>
      </select>    </td>
    <td class="gray" bgcolor="#dddddd" >조사자명</td>
    <td class="gray" >
      <input name="invsgpers" type="text" size="10" tabIndex="11" class="text_box" value="">
    </td>
  </tr>
</form>
</table>
<br>

<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title" height="25"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">호별 투입매체 현황
<%--    <img src="/html/commun/images/bu_me01.gif" onClick="medi_ynmpop();" style="cursor:hand;" width="104" align="absmiddle"></td>--%>
<%--    <img src="/html/comm_img/bu_me01.gif" onClick="medi_ynmpop();" style="cursor:hand;" width="104" align="absmiddle">
      &nbsp;&nbsp;( 중앙 J, 동아 D, 한국 UH, 한겨레 UG, 경향 UA, 한경 H, 매경 FA, 국민 UB, 코리아헤럴드 KH )--%>
    </td>
  </tr>
  <tr>
    <td height="2">
      <!--여백-->
    </td>
  </tr>
</table>
<table id="hous_thrw_id" width="830" border="0" cellpadding="2" cellspacing="0"  align="center" class="gray">
<form name="hous_thrw_form" method="post" action="" >
    <input type=hidden name=bocd            value="<%=request.getParameter("bocd")%>">
	<input type=hidden name=accflag 		value="">
    <input type=hidden name=hmflag		 	value="">
    <input type=hidden name=zip	 			value="">
    <input type=hidden name=addr     	 	value="">
	<input type=hidden name=addrcd 		 	value="<%=request.getParameter("addrcd")%>">
    <input type=hidden name=dongno		 	value="<%=request.getParameter("dongno")%>">
    <input type=hidden name=pyong1	 		value="">
    <input type=hidden name=hoscnt1	     	value="">
	<input type=hidden name=invsgdt 		value="<%=request.getParameter("invsgdt")%>">
    <input type=hidden name=invsgno		 	value="<%=request.getParameter("invsgno")%>">
    <input type=hidden name=invsghhmm	 	value="">
    <input type=hidden name=invsgpers     	value="">
  <tr align="center" bgcolor="#dddddd">
    <td align="center" class="gray" width="50" height="24" > 층</td>
    <td align="center" width="40" class="gray" height="24"> 1호 </td>
    <td align="center" width="40" class="gray" height="24"> 2호 </td>
    <td align="center" width="40" class="gray" height="24"> 3호 </td>
    <td align="center" width="40" class="gray" height="24"> 4호 </td>
    <td align="center" width="40" class="gray" height="24"> 5호 </td>
    <td align="center" width="40" class="gray" height="24"> 6호 </td>
    <td align="center" width="40" class="gray" height="24"> 7호 </td>
    <td align="center" width="40" class="gray" height="24"> 8호 </td>
    <td align="center" width="40" class="gray" height="24"> 9호 </td>
    <td align="center" width="40" class="gray" height="24"> 10호 </td>
    <td align="center" width="40" class="gray" height="24"> 11호 </td>
    <td align="center" width="40" class="gray" height="24"> 12호 </td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >1 층 </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >2 층 </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >3 층 </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >4 층 </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >5 층 </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >6 층 </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >7 층 </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >8 층 </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >9 층 </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >10 층 </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
</form>
</table>
<br>
<!--투입매체별 현황-->
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title" height="25"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">투입매체별 현황</td>
  </tr>
  <tr>
    <td height="2">
      <!--여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0"  align="center" cellpadding="2" class="gray">
  <tr bgcolor="#dddddd" align="center">
    <td  class="gray" bgcolor="#dddddd" align="center" width="127"> 구분(단위) </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="140"> 투입부수(부) </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="140"> 투입률(%) </td>
<%--    <td  class="gray" bgcolor="#dddddd" align="center" width="191"> 배달시간(시:분)~(시:분) </td> --%>
    <td  class="gray" bgcolor="#dddddd" align="center" width="*"> 배달상태 </td>
<%--    <td  class="gray" bgcolor="#dddddd" align="center" width="*"> 전단삽지매수(장) </td> --%>
  </tr>
</table>
<table id="medi_thrw_id" width="830" border="0" cellspacing="0"  align="center" cellpadding="2" class="gray">
<form name="medi_thrw_form" method="post" action="" >
  <tr>
    <input type=hidden name=medicd	 		value="">
    <input type=hidden name=qty     	 	value="">
	<input type=hidden name=qtyratio 		value="">
    <td class="gray" bgcolor="#dddddd" align="center" width="127">&nbsp;</td>
    <td  class="gray" align="right" width="140">&nbsp;</td>
    <td  class="gray" align="right" width="140">&nbsp;</td>
<%--    <td  class="gray" align="center" width="182">
      <input name="bgnhour" type="text" maxlength="2" size="1" value="" class="text_box" dataType="number" len="2" caption="배달시작시간" maxValue="24">
      :
      <input name="bgnminute" type="text" maxlength="2" size="1" value="" class="text_box" dataType="number" len="2" caption="배달시작분" maxValue="59">
      ~
      <input name="endhour" type="text" maxlength="2" size="1" value="" class="text_box" dataType="number" len="2" caption="배달종료시간" maxValue="24">
      :
      <input name="endminute" type="text" maxlength="2" size="1" value="" class="text_box" dataType="number" len="2" caption="배달종료분" maxValue="59">
    </td>--%>
    <td class="gray" align="left" width="*">
      <select name="dlvstatcd" class="sel_all">
        <option value="">선택</option>
      </select>
    </td>
<%--    <td class="gray" align="center" width="134">
      <input name="leaffeednosh" type="text" size="4" value="" class="text_box">
    </td>
--%>
  </tr>
</form>
</table>
<br>

<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title" height="25"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">투입률(조선, 중앙, 동아) / 활동사항</td>
  </tr>
  <tr>
    <td height="2">
      <!--여백-->
    </td>
  </tr>
</table>
<table id="medi_thrw_rate_id" width="830" border="0" cellspacing="0"  align="center" cellpadding="2" class="gray">
<form name="medi_thrw_rate_form" method="post" action="" >
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">매체</td>
    <td width="140" height="19" bgcolor="#dddddd" class="gray">투입부수</td>
    <td width="140" bgcolor="#dddddd" class="gray"> 투입률</td>
    <td width="*" bgcolor="#dddddd" class="gray">활동사항</td>
  </tr>
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">조선일보</td>
    <td width="140" class="gray" align="right">&nbsp;</td>
    <td width="140" class="gray" align="right">&nbsp;</td>
    <td width="*" bgcolor="#ffffff" class="gray" rowspan="3">&nbsp;</td>
  </tr>
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">중앙일보</td>
    <td width="140" class="gray" align="right">&nbsp;</td>
    <td width="140" class="gray" align="right">&nbsp;</td>
  </tr>
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">동아일보</td>
    <td width="140" class="gray" align="right">&nbsp;</td>
    <td width="140" class="gray" align="right">&nbsp;</td>
  </tr>
</form>
</table>

<br><p>
<br><p>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
