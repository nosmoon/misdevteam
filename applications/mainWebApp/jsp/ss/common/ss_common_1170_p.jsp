<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : ss_common_1170_p.jsp
* 기능       : 독자 상세 조회 팝업
* 작성일자   : 2003-12-09
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<html>
<head>
<title>::::독자상세조회::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="javascript">
<!--
     window.returnValue	 = "";

	// 폼 visual initializing
    function init(){
    	setEventHandler();
		//setEnterKeyEventHandler();
        //set_background_color();

        //우편번호 "-" 넣기
        //if(!isEmpty(reader_detail_form.dlvzip.value)) insertDash(reader_detail_form.dlvzip, 3);
    }

	// 폼 유효성 체크 & 전송
    function check_all(form, s_uri){
		if(!validate(form)){
			return false;
		}
		else{
			makeValue(form); // "/" 및 "," 제거
            //우편번호 "-"제거
            //deleteHyphen(reader_detail_form.dlvzip);

			form.action = s_uri;
			form.target = "ifrm";
			form.submit();
		}
	}

    // 독자번호 리턴값 셋팅
    /*
    function set_rdr_no(s_rdr_no){
        window.returnValue = s_rdr_no;
        window.close();
    }
    */

    // 독자번호 리턴값 셋팅
    function set_rdr_no(s_rdr_no, s_rdr_nm){
        window.returnValue = s_rdr_no + s_rdr_nm;
        window.close();
    }


	// 독자 목록 검색(목록조회)
	function reader_list_search(i_pageno){
        if(window.event) window.event.returnValue = false;
        var lo_form = document.reader_search_form;
        if(!validate_reader_search_word()) return;

        lo_form.bocd.value = "<%=Util.checkString(request.getParameter("bocd"))%>"; //debugging
        lo_form.pageno.value = i_pageno;
        lo_form.pagesize.value = "10";

        lo_form.action = "/jsp/ss/util/reqToInst.jsp";
        lo_form.submit();
        return;

		if(!check_all(lo_form, "/ss/common/1171")) return;
		return;
	}

    // 독자 목록 검색의 검색조건 필터
    function validate_reader_search_word(){
        var lo_form = document.reader_search_form;
        var ls_cond = lo_form.search_cond.value;
        var ls_word = lo_form.search_word.value;

       	if(ls_cond == "DSTC"){  		// 구역일 경우
           	if(!isValidFormat(ls_word, /^([\w\d]{3})$/)){
            	alert("유효하지 않은 구역입니다.");
                lo_form.search_word.select();
                return false;
            }
       	}else if(ls_cond == "DSNO") {	// 구역+배달번호
        	if(!isValidFormat(ls_word, /^(\d{3})-(\d{3})(-{0,1})(\d{0,2})$/)){
               	alert("유효하지 않은 구역+배달번호 입니다.\n 예) 101-101 또는 101-101-01");
                lo_form.search_word.select();
                return false;
            }
        }else if(ls_cond == "NO") {		// 독자번호
        	if(!isValidFormat(ls_word, /^(\d{9})$/)){
               	alert("유효하지 않은 독자번호 입니다.\n 예)031234567");
                lo_form.search_word.select();
                return false;
            }
        }else if(ls_cond == "TEL") {	// 전화번호
        	if(!isValidFormat(ls_word, /^(\d{3,4})-(\d{4})$/)){
               	alert("유효하지 않은 전화번호 입니다.\n 예)지역번호 없이 234-1234");
                lo_form.search_word.select();
                return false;
            }
        }
        return true;
    }

	// modal 창 닫기
	function close_modal(){
		window.close();
	}
//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1">
<!--title-->
<table width="910" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td  height="7">
      <!-----상위여백-- -->
    </td>
  </tr>
  <tr>
    <td align="center" height="33" class="pup">
      <!--title-->
      <table width=910 border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width=2> <img src="/html/comm_img/car_01.gif" width=2 height=3 ></td>
          <td background="/html/comm_img/car_02.gif"></td>
          <td> <img src="/html/comm_img/car_03.gif" width=2 height=3 ></td>
        </tr>
        <tr>
          <td width=2> <img src="/html/comm_img/car_04.gif" width=2 height=23 ></td>
          <td background="/html/comm_img/car_05.gif" align="center" class="pup"> <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle">독자상세조회<img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
          <td width=2><img src="/html/comm_img/car_06.gif" width=2 height=23 ></td>
        </tr>
        <tr>
          <td width=2><img src="/html/comm_img/car_07.gif" width=2 height=7 ></td>
          <td background="/html/comm_img/car_08.gif"></td>
          <td width=2> <img src="/html/comm_img/car_09.gif" width=2 height=7 ></td>
        </tr>
      </table>
      <!--title end-->
    </td>
  </tr>
  <tr>
    <td  height="7">
      <!-----리스트사이여백-- -->
    </td>
  </tr>
  <tr>
    <td align="center" class="pup" valign="top">
      <!--리스트 시작-->
      <table width="910" border="0" cellspacing="0" cellpadding="2">
<form name="reader_search_form" method="post" onsubmit="reader_list_search(1)">
	<input type=hidden name=bocd		 value="">     <!--지국지사코드           -->
    <input type=hidden name=pageno		 value="">     <!--현재페이지             -->
    <input type=hidden name=pagesize	 value="">     <!--페이지당 보여줄 건수     -->
         <tr>
          <td width="122" class="title" height="30"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">정렬
              <select name="search_order" class="sel_all" caption="정렬조건">
                <option value="DSNO">구역+배달</option>
                <option value="NO">독자번호</option>
                <option value="NM">독자명</option>
                <!--option value="TEL">전화번호</option-->
                <!--option value="MIL">마일리지</option-->
                <option value="ADDR">주소</option>
                <!--option value="AMT">실구독액</option-->
              </select>
          </td>
          <td  class="title" height="30"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">조건
              <select name="search_cond" class="sel_all" caption="검색조건">
                <option value="ALL">전체</option>
                <option value="DSTC" selected>구역</option>
                <option value="DSNO">구역+배달</option>
                <option value="NO">독자번호</option>
                <option value="NM">독자명</option>
                <option value="ADDR">상세주소</option>
                <option value="ADDRS">주소전체</option>
                <option value="TEL">전화번호</option>
                <option value="EMAIL">이메일</option>
              </select>
              <input name="search_word" type="text" size="10" class="text_box" onkeydown='if(window.event.keyCode == "13"){reader_list_search(1);window.event.returnValue=false;}'>
              <input type="image" id="reader_list_search_btn" src="/html/comm_img/bu_search.gif" width="36" height="19" border="0" align="absmiddle" ></td>
        </tr>
        <tr>
          <td height="3">
            <!--여백-->
          </td>
        </tr>
</form>
      </table>
      <table width="910" border="0" cellpadding="1" cellspacing="0" bgcolor="#ffffff" class="gray" id="rdr_dtls_sech_list_id">
        <tr align="center" bgcolor="#dddddd">
          <td width="40" rowspan="2" class="gray">순번</td>
          <td width="66" rowspan="2" class="gray">구역+배달</td>
          <td width="57" rowspan="2" class="gray">독자번호</td>
          <td width="72" rowspan="2" class="gray">독자명</td>
          <td width="187" rowspan="2" class="gray">주소</td>
          <td width="65" rowspan="2" class="gray">확장일자</td>
          <td width="45" rowspan="2" class="gray">유가월</td>
          <td width="42" rowspan="2" class="gray">매체</td>
          <td width="35" rowspan="2" class="gray">방법</td>
          <td colspan="3" class="gray">부수</td>
          <td width="13" rowspan="2" class="gray">1</td>
          <td width="13" rowspan="2" class="gray">2</td>
          <td width="13" rowspan="2" class="gray">3</td>
          <td width="13" rowspan="2" class="gray">4</td>
          <td width="13" rowspan="2" class="gray">5</td>
          <td width="13" rowspan="2" class="gray">6</td>
          <td width="13" rowspan="2" class="gray">7</td>
          <td width="13" rowspan="2" class="gray">8</td>
          <td width="13" rowspan="2" class="gray">9</td>
          <td width="13" rowspan="2" class="gray">10</td>
          <td width="13" rowspan="2" class="gray">11</td>
          <td width="13" rowspan="2" class="gray">12</td>
        </tr>
        <tr align="center" bgcolor="#dddddd">
          <td width="32" class="gray">유료</td>
          <td width="32" class="gray">준유</td>
          <td width="32" class="gray">무료</td>
        </tr>
        <tr>
            <td class="gray" align="right"><input type="text" class="text_box" style="border:0;width:39" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:65" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:56" disabled ></td>
            <td class="gray"><span ><input type="text" class="text_box" style="border:0;width:71" disabled ></span></td>
            <td class="gray"><span ><input type="text"  class="text_box" style="border:0;width:186" disabled  ></span></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:64" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:44" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:41" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:34" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
        </tr>
        <tr>
            <td class="gray" align="right"><input type="text" class="text_box" style="border:0;width:39" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:65" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:56" disabled ></td>
            <td class="gray"><span ><input type="text" class="text_box" style="border:0;width:71" disabled ></span></td>
            <td class="gray"><span ><input type="text"  class="text_box" style="border:0;width:186" disabled  ></span></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:64" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:44" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:41" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:34" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
        </tr>
        <tr>
            <td class="gray" align="right"><input type="text" class="text_box" style="border:0;width:39" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:65" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:56" disabled ></td>
            <td class="gray"><span ><input type="text" class="text_box" style="border:0;width:71" disabled ></span></td>
            <td class="gray"><span ><input type="text"  class="text_box" style="border:0;width:186" disabled  ></span></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:64" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:44" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:41" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:34" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
        </tr>
        <tr>
            <td class="gray" align="right"><input type="text" class="text_box" style="border:0;width:39" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:65" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:56" disabled ></td>
            <td class="gray"><span ><input type="text" class="text_box" style="border:0;width:71" disabled ></span></td>
            <td class="gray"><span ><input type="text"  class="text_box" style="border:0;width:186" disabled  ></span></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:64" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:44" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:41" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:34" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
        </tr>
        <tr>
            <td class="gray" align="right"><input type="text" class="text_box" style="border:0;width:39" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:65" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:56" disabled ></td>
            <td class="gray"><span ><input type="text" class="text_box" style="border:0;width:71" disabled ></span></td>
            <td class="gray"><span ><input type="text"  class="text_box" style="border:0;width:186" disabled  ></span></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:64" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:44" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:41" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:34" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
        </tr>
        <tr>
            <td class="gray" align="right"><input type="text" class="text_box" style="border:0;width:39" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:65" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:56" disabled ></td>
            <td class="gray"><span ><input type="text" class="text_box" style="border:0;width:71" disabled ></span></td>
            <td class="gray"><span ><input type="text"  class="text_box" style="border:0;width:186" disabled  ></span></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:64" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:44" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:41" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:34" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
        </tr>
        <tr>
            <td class="gray" align="right"><input type="text" class="text_box" style="border:0;width:39" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:65" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:56" disabled ></td>
            <td class="gray"><span ><input type="text" class="text_box" style="border:0;width:71" disabled ></span></td>
            <td class="gray"><span ><input type="text"  class="text_box" style="border:0;width:186" disabled  ></span></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:64" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:44" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:41" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:34" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
        </tr>
        <tr>
            <td class="gray" align="right"><input type="text" class="text_box" style="border:0;width:39" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:65" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:56" disabled ></td>
            <td class="gray"><span ><input type="text" class="text_box" style="border:0;width:71" disabled ></span></td>
            <td class="gray"><span ><input type="text"  class="text_box" style="border:0;width:186" disabled  ></span></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:64" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:44" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:41" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:34" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
        </tr>
        <tr>
            <td class="gray" align="right"><input type="text" class="text_box" style="border:0;width:39" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:65" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:56" disabled ></td>
            <td class="gray"><span ><input type="text" class="text_box" style="border:0;width:71" disabled ></span></td>
            <td class="gray"><span ><input type="text"  class="text_box" style="border:0;width:186" disabled  ></span></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:64" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:44" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:41" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:34" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
        </tr>
        <tr>
            <td class="gray" align="right"><input type="text" class="text_box" style="border:0;width:39" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:65" disabled ></td>
            <td class="gray"><input type="text" class="text_box" style="border:0;width:56" disabled ></td>
            <td class="gray"><span ><input type="text" class="text_box" style="border:0;width:71" disabled ></span></td>
            <td class="gray"><span ><input type="text"  class="text_box" style="border:0;width:186" disabled  ></span></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:64" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:44" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:41" disabled ></td>
            <td class="gray"><input type="text"  class="text_box" style="border:0;width:34" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="right" ><input type="text"  class="text_box" style="border:0;width:31" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
            <td class="gray" align="center"><input type="text"  class="text_box" style="border:0;width:12" disabled ></td>
        </tr>
      </table>
      <!--버튼-->
      <table width="910" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="rdr_dtls_sech_list_navigator_id">
        <tr>
          <td align="center" height="25" bgcolor="#E8E8E8">
          <!--JSP PAGE START---------------------------------------------------------------------------------->
                <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                <jsp:param name = "curr_page_no" 		value="1"/>
                <jsp:param name = "total_records" 		value="0"/>
                <jsp:param name = "js_fn_nm" 			value="reader_list_search"/>
                <jsp:param name = "records_per_page" 	value="10"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
          <!--JSP PAGE END------------------------------------------------------------------------------------>
          </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td align="center" height="7">
      <!--하단여백-->
    </td>
  </tr>
  <tr>
    <td align="center" height="27"  bgcolor="#959595"><input type="image" src="/html/comm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;"></a></td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>