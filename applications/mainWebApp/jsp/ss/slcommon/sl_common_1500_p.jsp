<%@ page contentType="text/html; charset=euc-kr" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_common_1500_p.jsp
* 기능 		 : 판촉물검색 팝업 (검색 버튼에 의한 팝업 화면)
* 작성일자 	 : 2003-12-09
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<html>
<head>
<title>::::판촉물 검색::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
	window.returnValue	 = "";

	// 폼 visual initializing
    function init(){
    	setEventHandler();
		//setEnterKeyEventHandler();
        //set_background_color();

        //우편번호 "-" 넣기
        //if(!isEmpty(reader_detail_form.dlvzip.value)) insertDash(reader_detail_form.dlvzip, 3);

	    var lo_form = document.bns_itemcd_search_form;
		if(dialogArguments) { //판촉물명을 argument 로 받았을 경우 검색을 실행한다.
            //판촉물 코드 패턴이면 코드로 검색 , 그렇지 않으면 판촉물명으로 검색
            if(!validate_bns_itemcd(dialogArguments)){
                lo_form.bns_itemcd.value	= "";
                lo_form.bns_itemnm.value	= dialogArguments;
            }else{
                lo_form.bns_itemcd.value	= dialogArguments;
                lo_form.bns_itemnm.value	= "";
            }
           bns_itemcd_search(1);
        }
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

    // 판촉물코드 유효성 검증(숫자로만 이루어졌으면)
    function validate_bns_itemcd(s_cd){
		if(trim(s_cd) == "") return false;
        var format = /^(\d+)$/;
        return isValidFormat(s_cd, format);
    }

	//판촉물코드 목록조회
    function bns_itemcd_search(i_pageno){

        bns_itemcd_search_form.pageno.value = i_pageno;
        bns_itemcd_search_form.pagesize.value = "10";

 		if(!check_all(bns_itemcd_search_form, "/ss/slcommon/1510")) return;
    }

	//판촉물코드 셋팅 ( 부모 창에 판촉물을 셋팅 정보를 리턴)
    function set_bns_item(s_bns_itemcd, s_bns_itemnm, s_uprc){
    	window.returnValue = s_bns_itemcd + "\n" + s_bns_itemnm + "\n" + s_uprc;
        window.close();
    }

	function close_modal(){
		window.close();
	}
//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1" onload="init()">
<!--title-->
<table width="400" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td  height="7">
      <!-----상위여백-- -->
    </td>
  </tr>
  <tr>
    <td align="center" height="33" class="pup">
      <!--title-->
      <table width=400 border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width=2> <img src="/html/comm_img/car_01.gif" width=2 height=3 ></td>
          <td background="/html/comm_img/car_02.gif"></td>
          <td> <img src="/html/comm_img/car_03.gif" width=2 height=3 ></td>
        </tr>
        <tr>
          <td width=2> <img src="/html/comm_img/car_04.gif" width=2 height=23 ></td>
          <td background="/html/comm_img/car_05.gif" align="center" class="pup"> <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
            <!--title 자리-->
            판촉물 검색 <img src="/html/comm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
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
      <!--검색 시작-->
      <table width="400" border="0" cellspacing="0" cellpadding="2" >
<form name="bns_itemcd_search_form" method="post" onsubmit="bns_itemcd_search(1);">
		<input type="hidden" name="pageno" value="">
   		<input type="hidden" name="pagesize" value="">
        <input type="hidden" name="job_flg" value="P"><!-- action 이 Popup 창에서 일어났음을 의미한다. -->
        <tr>
          <td bgcolor="#EBE9DC" width="42" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">코드</td>
          <td bgcolor="#EBE9DC" width="76" class="title">
            <input name="bns_itemcd" type="text" size="8" class="text_box">
          </td>
          <td bgcolor="#EBE9DC" class="title"title width="63"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">판촉물명</td>
          <td width="203" bgcolor="#EBE9DC" class="title">
            <input name="bns_itemnm" type="text" size="8" class="text_box">
            <input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" border="0" align="absmiddle">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="4">
            <!--여백-->
          </td>
        </tr>
</form>
      </table>
      <!--리스트 시작 -->
      <table width="400" border="0" cellpadding="0" cellspacing="0" id="bns_item_list_id">
        <tr>
          <td>
          <table width="400" border="0" cellpadding="1" cellspacing="0" bgcolor="#FFFFFF" class="gray" >
            <tr align="center" bgcolor="#dddddd">
              <td width="74" class="gray">판촉물코드</td>
              <td width="230" class="gray">판촉물명</td>
              <td width="89" class="gray">단가(원)</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray" align="right">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray" align="right">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray" align="right">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray" align="right">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray" align="right">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray" align="right">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray" align="right">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray" align="right">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray" align="right">&nbsp;</td>
            </tr>
            <tr>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray" align="right">&nbsp;</td>
            </tr>
          </table>
          <!--버튼-->
          <table width="400" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center">
            <tr>
              <td align="center" height="25" valign="center" bgcolor="#E8E8E8">
                <!--JSP PAGE START---------------------------------------------------------------------------------->
                      <jsp:include page="/jsp/ss/slcomm_jsp/page_navigator.jsp">
                      <jsp:param name = "curr_page_no" 		value="1"/>
                      <jsp:param name = "total_records" 	value="0"/>
                      <jsp:param name = "js_fn_nm" 			value="bns_itemcd_search"/>
                      <jsp:param name = "records_per_page" 	value="10"/>
                      <jsp:param name = "page_set_gubun" 	value="0"/>
                      </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
              </td>
            </tr>
          </table>
          </td>
        </tr>
      </table>
      <!--리스트 끝 -->
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