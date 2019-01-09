<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1600_a.jsp
* 기능 : 지국지원-Billing자동이체-납부내역
* 작성일자 : 2004-03-22
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_PYMT_INITDataSet ds = (SS_L_PYMT_INITDataSet)request.getAttribute("ds");
    applySession = false;	// 세션 적용 여부
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
    }

	// 납부자목록 조회
	function pymt_list() {
		var lo_form = document.pymt_form;

		if(!check_all(lo_form)) return;

		lo_form.method = "post";
		lo_form.target = "ifrm";
		lo_form.action = "/ss/brsup/1710";
		lo_form.submit();
	}

	// 납부계약목록 조회
	function pymtcntr_list() {
		var lo_form = document.pymtcntr_form;

		if(!check_all(lo_form)) return;

		lo_form.method = "post";
		lo_form.target = "ifrm";
		lo_form.action = "/ss/brsup/1720";
		lo_form.submit();
	}

	// 납부내역 조회
	function pymtptcr_list() {
		var lo_form = document.pymtptcr_form;

		if(!check_all(lo_form)) return;

		lo_form.method = "post";
		lo_form.target = "ifrm";
		lo_form.action = "/ss/brsup/1730";
		lo_form.submit();
	}

	// 폼 유효성 체크
	function check_all(form){
	    if(!validate(form)) return false;
	    else{
	        makeValue(form);
	        return true;
	    }
	}
-->
</script>
</head>
<body onload="jsInit()" bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >지국지원
      > </b> Billing자동이체 &gt; 납부내역</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<!--내용을 위한 큰테이블 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top">
      <!-- 자동이체 납부자 목록검색 -->
      <table width="830" border="0"  cellpadding="0" cellspacing="0" align="center">
      <form name="pymt_form" method="post" action="">
        <tr>
          <td height="26" bgcolor="#D2C69B"  class="title" width="120">자동이체 납부자
            목록</td>
          <td height="26" bgcolor="#EBE9DC"  class="title" width="30"><img src="/html/comm_img/search4.gif" width="13" height="26"></td>
          <td height="26" bgcolor="#EBE9DC"  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">이체구분
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title">
            <select name="shftclsf" class="sel_all">
              <option value="" selected>전체</option>
              <%=ds.rsltcurOptHtml("")%>
            </select>
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="70"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">이체상태
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title">
            <select name="shftstatclsfcd" class="sel_all">
              <option value="" selected>전체</option>
              <option value="10">신청중</option>
              <option value="20">이체중</option>
              <option value="30">해지</option>
            </select>
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="110"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">납부자/구독자명
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="100">
            <input name="pymt" type="text" size="8" class="text_box" notEmpty caption="납부자/구독자명">
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" align="right">
            <input type="image" onclick="pymt_list();window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif" width="36"  align="absmiddle">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="8">
            <!--여백-->
          </td>
        </tr>
      </form>
      </table>
      <!-- 자동이체 납부자 목록검색 끝 -->
      <!--타이틀 끝-->
      <!-- 자동이체 납부자 목록-->
      <table width="830" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray">
        <tr align="center" bgcolor="#dddddd" >
          <td width="90" class="gray" >지국명</td>
          <td width="80" class="gray" >납부자</td>
          <td width="200" class="gray" >납부자 주민(사업자)번호</td>
          <td width="80" class="gray" >구독자</td>
          <td width="80" class="gray" >은행명</td>
          <td width="143" class="gray" >계좌/카드번호</td>
          <td width="70" class="gray" >이체개시월</td>
          <td width="70" class="gray" >상태</td>
        </tr>
        <tr>
          <td height="120" colspan="8" class="gray" style="padding:0;"><iframe src="/html/brsup/ss_brsup_1710_l.html" name="ifrm_1" width="830" height="120" frameborder="0" marginheight="0" marginwidth="0" scrolling="yes"></iframe></td>
          </tr>
      </table>
      <!-- 자동이체 납부자 목록 end-->
    </td>
  </tr>
  <tr>
    <td height="10">
      <!--구분을 위한여백 -->
    </td>
  </tr>
  <tr>
    <td valign="top">
      <!-- 납부계약 목록검색 -->
      <table width="830" border="0"  cellpadding="0" cellspacing="0" align="center">
      <form name="pymtcntr_form" method="post" action="">
        <tr>
          <td height="26" bgcolor="#D2C69B"  class="title" width="120">납부계약 목록</td>
          <td height="26" bgcolor="#EBE9DC"  class="title" width="30"><img src="/html/comm_img/search4.gif" width="13" height="26"></td>
          <td height="26" bgcolor="#EBE9DC"  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독상태</td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="150">
            <select name="subsstat" class="sel_all">
              <option value="" selected>전체</option>
              <option value="10">구독중</option>
              <option value="20">중지</option>
            </select>
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" align="right">
            <input type="image" onclick="pymtcntr_list();window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif" width="36"  align="absmiddle">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="4">
            <!--여백-->
          </td>
        </tr>
      </form>
      </table>
      <!-- 검색 끝 -->
      <!--  목록-->
      <table width="830" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray">
        <tr bgcolor="#dddddd" >
          <td width="70" class="gray" align="center" >지국명</td>
          <td width="70" class="gray" align="center" >독자번호</td>
          <td width="70" class="gray" align="center" >구독자명</td>
          <td width="40" class="gray" align="center" >매체</td>
          <td width="40" class="gray" align="center" >부수</td>
          <td width="60" class="gray" align="center" >단가</td>
          <td width="60" class="gray" align="center" >개시월</td>
          <td width="60" class="gray" align="center" >이체구분</td>
          <td width="60" class="gray" align="center" >이체상태</td>
          <td width="50" class="gray" align="center" >우편번호</td>
          <td width="155" align="center" class="gray" >배달주소</td>
          <td width="70" class="gray" align="center" >상태</td>
        </tr>
        <tr  >
          <td height="120" colspan="12" class="gray" style="padding:0;"><iframe src="/html/brsup/ss_brsup_1720_l.html" name="ifrm_2" width="830" height="120" frameborder="0" marginheight="0" marginwidth="0" scrolling="yes"></iframe></td>
          </tr>
      </table>
      <!--목록 end-->
    </td>
  </tr>
  <tr>
    <td height="10">
      <!--구분을 위한여백 -->
    </td>
  </tr>
  <tr>
    <td valign="top">
      <!-- 납부내역 목록검색 -->
      <table width="830" border="0"  cellpadding="0" cellspacing="0" align="center">
      <form name="pymtptcr_form" method="post" action="">
        <tr>
          <td height="26" bgcolor="#D2C69B"  class="title" width="120">납부내역 목록</td>
          <td height="26" bgcolor="#EBE9DC"  class="title" width="30"><img src="/html/comm_img/search4.gif" width="13" height="26"></td>
          <td height="26" bgcolor="#EBE9DC"  class="title" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">청구월</td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="160">
            <input name="f_basidt" value="<%=Util.getDate2().substring(0,7)%>" type="text" size="8" class="text_box" notEmpty dataType=month caption="청구월">
            -
            <input name="t_basidt" value="<%=Util.getDate2().substring(0,7)%>" type="text" size="8" class="text_box" notEmpty dataType=month caption="청구월">
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="71"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">이체구분
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="136">
            <select name="shftclsfcd" class="sel_all">
              <option value="" selected>전체</option>
              <%=ds.rsltcurOptHtml("")%>
            </select>
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">청구결과</td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="150">
            <select name="erryn" class="sel_all">
              <option value="" selected>전체</option>
              <option value="N">정상</option>
              <option value="Y">오류</option>
            </select>
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" align="right">
            <input type="image" onclick="pymtptcr_list();window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif" width="36"  align="absmiddle"></td>
        </tr>
        <tr>
          <td height="3" colspan="8">
            <!--여백-->
          </td>
        </tr>
      </form>
      </table>
      <!-- 검색 끝 -->
      <!--  목록-->
      <table width="830" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray">
        <tr bgcolor="#dddddd" >
          <td width="72" class="gray" align="center" >지국명</td>
          <td width="72" class="gray" align="center" >독자번호</td>
          <td width="72" class="gray" align="center" >구독자명</td>
          <td width="42" class="gray" align="center" >매체</td>
          <td width="42" class="gray" align="center" >부수</td>
          <td width="62" class="gray" align="center" >단가</td>
          <td width="62" class="gray" align="center" >청구월</td>
          <td width="74" class="gray" align="center" >구독월분</td>
          <td width="124" class="gray" align="center" >이체구분</td>
          <td width="53" align="center" class="gray" >결과</td>
          <td width="132" align="center" class="gray" >사유</td>
        </tr>
        <tr>
          <td height="120" colspan="11" class="gray" style="padding:0;"><iframe src="/html/brsup/ss_brsup_1730_l.html" name="ifrm_3" width="830" height="120" frameborder="0" marginheight="0" marginwidth="0" scrolling="yes"></iframe></td>
          </tr>
      </table>
      <!--목록 end-->
    </td>
  </tr>
</table>
<!--내용을 위한 큰테이블 끝-->
<br>
<br>
<iframe name="ifrm" width="0" height="0"></iframe>
</body>
</html>