<%@ page contentType="text/html; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1785_a.jsp
* 기능 : 지국업무지원-Billing자동이체-신청통계-초기화면
* 작성일자 : 2004-04-26
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    int moveListCount = 20;	// 한 화면당 리스트 항목 수
    applySession = false;	// 세션 적용 여부

    SS_L_APLC_MANG_INITDataSet ds = (SS_L_APLC_MANG_INITDataSet)request.getAttribute("ds");
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

// 목록조회
function list_search(pageno, rp_clsf) {
	var lo_form = document.list_search_form;

	// 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form.pageno.value = '1';
    } else {
        lo_form.pageno.value = pageno;
    }

    // 검색구분을 설정한다.
    // 1:지역별,2:지국별,3:접수일자별,4:구독지종별,5:신청연령별,6:카드사별
    /*
    if(!rp_clsf) {
        lo_form.rp_clsf.value = '1';
    } else {
        lo_form.rp_clsf.value = rp_clsf;
    }
    */
    if(rp_clsf!=null) {
        lo_form.rp_clsf.value = rp_clsf;
    }

	if(!check_all(lo_form)) return;

	lo_form.method = "post";
	lo_form.action = "/ss/brsup/1786";
	lo_form.target = "ifrm";
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

// 엔터키 잡아내기
function f_list_search() {
    if(event.keyCode == 13) list_search();
}
-->
</script>
</head>
<body onload="jsInit()" bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >지국지원
      > </b>Billing자동이체 &gt; 신청통계</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
<form name="list_search_form" method="post" action="">
  <input name="pageno" type="hidden" value ="1">			                <!-- 현재 페이지 번호 -->
  <input name="pagesize" type="hidden" value ="<%= moveListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
  <input name="js_fn_nm" type="hidden" value ="list_search">
  <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
  <input type="hidden" name="rp_clsf" value="1">
  <tr>
    <td bgcolor="#EBE9DC"  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">검색일자
    </td>
    <td bgcolor="#EBE9DC" class="title" width="180">
      <input name="fr_dt" type="text" size="10" maxlength="10" class="text_box" value="<%=Util.getDate2()%>" dataType="date" notEmpty caption="검색시작일자">
      ~<input name="to_dt" type="text" onkeydown="f_list_search()" size="10" maxlength="10" class="text_box" value="<%=Util.getDate2()%>" dataType="date" notEmpty caption="검색끝일자">
    </td>
    <td bgcolor="#EBE9DC"  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">이체구분
    </td>
    <td bgcolor="#EBE9DC" class="title">
      <select name="shftclsf" class="sel_all">
          <option value="" selected>전체</option>
          <%=ds.shftclsfOptHtml("")%>
      </select>
      <input type="image" onclick="list_search(1,1);window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle">
    </td>
  </tr>
  <tr>
    <td height="3" colspan="4">
      <!--여백-->
    </td>
  </tr>
</form>
</table>
<!--tab start -->
<table id="tab_id" width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr valign="bottom">
    <td width="100" onclick="list_search(1,1);window.event.returnValue=false;" style="cursor:hand;">
      <!--tab 1-->
      <table border=0 cellpadding=0 cellspacing=0 width="100%">
        <tr>
          <td height=3 ><img src="/html/comm_img/tb3_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb3_02.gif" height=3 ></td>
          <td height=3 ><img src="/html/comm_img/tb3_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb3_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb3_05.gif"><font color="#FFFFFF">지역별</font></td>
          <td background="/html/comm_img/tb3_06.gif"  style width="5"></td>
        </tr>
      </table>
      <!--tab 1 end-->
    </td>
    <td width="100" onclick="list_search(1,2);window.event.returnValue=false;" style="cursor:hand;">
      <!--tab2-->
      <table border=0 cellpadding=0 cellspacing=0 width="100%">
        <tr>
          <td height=3 ><img src="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
          <td height=3 ><img src="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb4_05.gif">지국별</td>
          <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
        </tr>
      </table>
      <!--tab 2 end-->
    </td>
    <td width="100"  onclick="list_search(1,3);window.event.returnValue=false;" style="cursor:hand;">
      <!--tab3-->
      <table border=0 cellpadding=0 cellspacing=0 width="100%">
        <tr>
          <td height=3 ><img src="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
          <td height=3 ><img src="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb4_05.gif">접수일자별</td>
          <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
        </tr>
      </table>
      <!--tab 3 end-->
    </td>
    <td width="100"  onclick="list_search(1,4);window.event.returnValue=false;" style="cursor:hand;">
      <!--tab4-->
      <table border=0 cellpadding=0 cellspacing=0 width="100%">
        <tr>
          <td height=3 ><img src="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
          <td height=3 ><img src="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb4_05.gif">구독지종별</td>
          <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
        </tr>
      </table>
      <!--tab 4 end-->
    </td>
    <td width="100"  onclick="list_search(1,5);window.event.returnValue=false;" style="cursor:hand;">
      <!--tab5-->
      <table border=0 cellpadding=0 cellspacing=0 width="100%">
        <tr>
          <td height=3 ><img src="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
          <td height=3 ><img src="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb4_05.gif">신청연령별</td>
          <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
        </tr>
      </table>
      <!--tab 5 end-->
    </td>
    <td width="100"  onclick="list_search(1,6);window.event.returnValue=false;" style="cursor:hand;">
      <!--tab6-->
      <table border=0 cellpadding=0 cellspacing=0 width="100%">
        <tr>
          <td height=3 ><img src="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
          <td height=3 ><img src="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb4_05.gif">카드사별</td>
          <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
        </tr>
      </table>
      <!--tab 6 end-->
    </td>
    <td width="430" height="30">
      <!--tab 여백 사이즈를 위해서 준거니까.높이 없애지마요-->
    </td>
  </tr>
</table>
<!--tab end -->
<!--지역별 시작 -->
<table id="header_id" width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr>
    <td height="25" bgcolor="#EBE9DC" class="title">지역별 목록</td>
  </tr>
  <tr>
    <td height="3">
      <!--여백-->
    </td>
  </tr>
</table>
<!--list-->
<table id="body_id" width="830" border="0" cellpadding="1" cellspacing="0" align="center" bgcolor="#FFFFFF"  class="gray" >
  <tr align="center" bgcolor="#dddddd" >
    <td width="94" class="gray" >지역별</td>
    <td width="92" class="gray">조선IS</td>
    <td width="92" class="gray">TM</td>
    <td width="92" class="gray">지국</td>
    <td width="92" class="gray">은행</td>
    <td width="92" class="gray">독자우대</td>
    <td width="92" class="gray">출판</td>
    <td width="92" class="gray">기타</td>
    <td width="92" class="gray">계</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
</table>
<!--버튼-->
<table id="nav_id" width="830" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center">
  <tr>
    <td align="center" height="25" bgcolor="#E8E8E8">
    	<img src="/html/comm_img/bu_first01.gif" alt="10페이지 앞으로" border="0" >
        <img src="/html/comm_img/bu_prev01.gif" >
        <img src="/html/comm_img/bu_next01.gif" alt="다음페이지" border="0" >
        <img src="/html/comm_img/bu_end01.gif" border="0" alt="10페이지 뒤로">
    </td>
  </tr>
</table>
<!--지역별 끝 -->
<br>
<br>
<iframe name="ifrm" width="0" height="0"></iframe>
</body>
</html>
