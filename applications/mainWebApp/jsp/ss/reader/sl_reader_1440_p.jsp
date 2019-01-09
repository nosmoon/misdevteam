<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1440_p.jsp
* 기능       : 독자정보관리(중지내역팝업)(초기화면)
* 작성일자   : 2004-04-03
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    final int TAB_SIZE = 5; // 한 row 에 들어갈 탭의 갯수
%>
<html>
<head>
<title>::::구독추가/변경::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<style>
	.on_1{background-image:url("/html/slcomm_img/tb1_01.gif");}
	.on_2{background-image:url("/html/slcomm_img/tb1_02.gif");}
	.on_3{background-image:url("/html/slcomm_img/tb1_03.gif");}
	.on_4{background-image:url("/html/slcomm_img/tb1_04.gif");}
   	.on_5{background-image:url("/html/slcomm_img/tb1_05.gif");}
	.on_6{background-image:url("/html/slcomm_img/tb1_06.gif");}
	.off_1{background-image:url("/html/slcomm_img/tb_01.gif");}
	.off_2{background-image:url("/html/slcomm_img/tb_02.gif");}
	.off_3{background-image:url("/html/slcomm_img/tb_03.gif");}
	.off_4{background-image:url("/html/slcomm_img/tb_04.gif");}
   	.off_5{background-image:url("/html/slcomm_img/tb_05.gif");}
	.off_6{background-image:url("/html/slcomm_img/tb_06.gif");}
</style>
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
	// 폼 유효성 체크 & 전송
    function check_all(form, s_uri){
		if(!validate(form)){
			return false;
		}
		else{
			makeValue(form); // "/" 및 "," 제거

			form.action = s_uri;
			form.target = "ifrm";
			form.submit();
		}
	}

	// 폼 visual initializing
    function jsInit(){
    	setEventHandler();
		setEnterKeyEventHandler();
        setInputBackgroundColor();
    }

	//페이지가 로딩될때 기본값으로 검색
    function default_search(){
   		var lo_form = document.nwspsubscntr_list_search_form;

		var ls_args = ":"; // dialog argument
		// dialog에 argument로 던져진 문자열을 ":" 로 split

        if(window.dialogArguments){
           if(window.dialogArguments.indexOf(":") == -1){
               alert("유효하지 않은 arguments 입니다.");
               window.returnValue = "";
               window.close();
           }
           ls_args = window.dialogArguments;
           ga_args = ls_args.split(":");  //(ga_args[0] : 독자번호), (ga_args[1] : 매체코드 )

           if(ga_args[0] == "" || ga_args[1] == ""){
               alert("독자번호나 매체코드가 셋팅되지 않았습니다.");
               window.returnValue = "";
               window.close();
           }

            window.returnValue = ga_args[0];
            nwspsubscntr_list_search(ga_args[0], ga_args[1])
        }

    }

	// 구독계약 목록조회(매체텝 선택시)
	function nwspsubscntr_list_search(s_rdr_no, s_medicd){
    	var lo_form = document.nwspsubscntr_list_search_form;
    	lo_form.rdr_no.value = s_rdr_no;
       	lo_form.medicd.value = s_medicd;

		if(!check_all(lo_form, "/ss/slreader/1445")) return;
		return;
    }

    //중지취소 -> 권한없음 처리.
    function cancel_stop(){
    	var lo_form = subs_ifrm.document.subs_cntr_list_form;

        //filtering
        var checked = false;
        if(lo_form.idx == null){               //추가된 인계작업이 없을 경우
        	alert("취소할 중지계약이 존재하지 않았습니다.");
        	return;
        }else if(lo_form.idx.length == null){  //인계작업이 한 건일 경우
			if(!lo_form.idx.checked){
            	alert("취소할 중지계약이 목록에서 선택하세요.");
                if(!lo_form.idx.disabled) lo_form.idx.focus();
                return;
            }
        }else{                                  //인계작업이 여러건일 경우
            for(var i=0; i<lo_form.idx.length; i++){
                if(lo_form.idx[i].checked){
                    checked = true;
                    break;
                }
            }
            if(!checked){
                alert("취소할 중지계약이을 목록에서 선택하세요.");
                if(!lo_form.idx[0].disabled) lo_form.idx[0].focus();
                return;
            }
        }

		//idx의 value 셋팅
        if(!lo_form.idx.length){ //한건일 경우
            lo_form.idx.value = 0;
        }else{
            for(var i=0; i<lo_form.idx.length; i++){ //여러건일 경우
                lo_form.idx[i].value = i;
            }
        }

        lo_form.target = "ifrm";
        lo_form.action = "/ss/slreader/1450";
        lo_form.submit();
        return;
    }

	// 창 닫기
	function close_modal(){
		window.close();
	}

	//매체 tab의 row 번호를 받아 탭 row display를 설정한다.
	//@param i_tab_row 탭의 row 순버( 0 부터 시작)
	//@param i_tab_row_cnt 텝의 총 row 수
	//
    function tab_navigate(i_tab_row, i_tab_row_cnt){
		for(var i=0; i<i_tab_row_cnt; i++){
            if( i == i_tab_row){
	        	document.all("tab_row_" + i).style.display = "inline";
            }else{
            	document.all("tab_row_" + i).style.display = "none";
            }
        }
    }


	//매체 tab 전체에 대한 display 설정
	//@param s_medicd   매체코드(선택된) <- server 측에 request 한 정보임(Optional)
	//                  s_medicd 가 "" 일 경우 처음 매체가 선택된 것으로 간주본다.
	//@param i_total_count 총 탭의 갯수 ( 총 매체수 )
	//
    function set_on_off_medi_tab( s_medicd, i_total_count){
        var ls_tab_id = "";
		var lo_tab; // tab table 객체
    	for(var i=0; i<i_total_count; i++){
            ls_tab_id = "tab_" + i;
            lo_tab = document.all(ls_tab_id);
            if(( s_medicd =="" && i == 0) || s_medicd == lo_tab.medicd){
                set_medi_tab(lo_tab, "on");
            }else{
               	set_medi_tab(lo_tab, "off");
            }
        }
    }

    //매체 tab "ON/OFF"
    function set_medi_tab(o_this, s_on_off){
    	var lo_cells = o_this.cells;
        var count = 1;
        for (i=0; i < o_this.rows.length; i++) {
            for (j=0; j < o_this.rows(i).cells.length; j++) {
                o_this.rows(i).cells(j).className = s_on_off + "_" + count++;
            }
        }
    }

    //선택한 목록 배경색 셋팅
    //o_list : 목록 테이블 객체의 레퍼런스
    //s_key  : 현재 클릭된 해당 row의 key 값
    function set_clicked_row_bg(o_list, s_key){
        if(o_list != null){
            for(var i=0; i<o_list.rows.length; i++){
                if(o_list.rows[i].key == s_key){
                    o_list.rows[i].className = "click";
                    o_list.rows[i].clicked = true;
                }else{
                    o_list.rows[i].className = "";
                    o_list.rows[i].clicked = false;
                }
            }
        }
    }

    //선택한 목록 배경색 초기화
    //o_list : 목록 테이블 객체의 레퍼런스
    function set_clicked_row_bg_init(o_list){
        if(o_list != null){
            for(var i=0; i<o_list.rows.length; i++){
                o_list.rows[i].className = "";
                o_list.rows[i].clicked = false;
            }
        }
    }

    // 인계대상 목록의 체크박스를 클릭해서 모든 체크박스를 선택 또는 선택해제한다.
    function select_all(bool) {
        var lo_form1;
        lo_form1 = subs_ifrm.document.subs_cntr_list_form;
        if(lo_form1.idx==null) {					// 선택된 건이 없는 경우
            return;
        } else if(lo_form1.idx.type=="checkbox") {	// 한건인 경우
            if(!lo_form1.idx.disabled) lo_form1.idx.checked = bool;
        } else {									// 여러건인 경우
            for(var i=0; i<lo_form1.idx.length; i++) {
                if(!lo_form1.idx[i].disabled) lo_form1.idx[i].checked = bool;
            }
        }
    }
-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1" onload="jsInit();default_search();">
<!--title-->
<table width="860" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td  height="2">
      <!-----상위여백-- -->
    </td>
  </tr>
  <tr>
    <td align="center" height="33" class="pup"><table width="860" border=0 cellpadding=0 cellspacing=0>
      <tr>
        <td width=2> <img src="/html/slcomm_img/car_01.gif" width=2 height=3 ></td>
        <td background="/html/slcomm_img/car_02.gif"></td>
        <td> <img src="/html/slcomm_img/car_03.gif" width=2 height=3 ></td>
      </tr>
      <tr>
        <td width=2> <img src="/html/slcomm_img/car_04.gif" width=2 height=23 ></td>
        <td background="/html/slcomm_img/car_05.gif" align="center" class="pup"> <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
            <!--title 자리-->            중지내역 <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
        <td width=2><img src="/html/slcomm_img/car_06.gif" width=2 height=23 ></td>
      </tr>
      <tr>
        <td width=2><img src="/html/slcomm_img/car_07.gif" width=2 height=7 ></td>
        <td background="/html/slcomm_img/car_08.gif"></td>
        <td width=2> <img src="/html/slcomm_img/car_09.gif" width=2 height=7 ></td>
      </tr>
    </table>
      <!--title-->
      <!--title end--></td>
  </tr>
  <tr>
    <td  height="7">
      <!-----리스트사이여백-- -->
    </td>
  </tr>
</table>
<table width="860" border="0" height="24" cellspacing="0" cellpadding="0" id="tab_table_id">
    <tr height="4" colspan="2">
      <td><!--여백--></td>
    </tr>
    <tr id="subs_display_control" >
      <td width="350" style="visibility:hidden">
        <!--tab table start-->
        <table width="350" border="0" cellpadding="0" cellspacing="0" id="tab_row_0">
          <tr>
            <td width="60">
              <table id="tab_0" border=0 cellpadding=0 cellspacing=0 width="100%" style="cursor:hand;" onclick="set_on_off_medi_tab(this, 5, 1);">
                <tr>
                  <td width=5 height=3 background="/html/slcomm_img/tb1_01.gif"></td>
                  <td height=3  background="/html/slcomm_img/tb1_02.gif" ></td>
                  <td width=5 height=3 background="/html/slcomm_img/tb1_03.gif"></td>
                </tr>
                <tr>
                  <td background="/html/slcomm_img/tb1_04.gif" height="17" width="5"></td>
                  <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">MM-999</td>
                  <td background="/html/slcomm_img/tb1_06.gif" height="17" width="5"></td>
                </tr>
            </table></td>
            <td width="60">
              <table id="tab_1" border=0 cellpadding=0 cellspacing=0 width="100%" style="cursor:hand;" onclick="set_on_off_medi_tab(this, 5, 1);">
                <tr>
                  <td width=5 height=3 background="/html/slcomm_img/tb1_01.gif"></td>
                  <td height=3  background="/html/slcomm_img/tb1_02.gif" ></td>
                  <td width=5 height=3 background="/html/slcomm_img/tb1_03.gif"></td>
                </tr>
                <tr>
                  <td background="/html/slcomm_img/tb1_04.gif" height="17" width="5"></td>
                  <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">MM-999</td>
                  <td background="/html/slcomm_img/tb1_06.gif" height="17" width="5"></td>
                </tr>
            </table></td>
            <td width="60">
              <table id="tab_2" border=0 cellpadding=0 cellspacing=0 width="100%" style="cursor:hand;" onclick="set_on_off_medi_tab(this, 5, 1);">
                <tr>
                  <td width=5 height=3 background="/html/slcomm_img/tb1_01.gif"></td>
                  <td height=3  background="/html/slcomm_img/tb1_02.gif" ></td>
                  <td width=5 height=3 background="/html/slcomm_img/tb1_03.gif"></td>
                </tr>
                <tr>
                  <td background="/html/slcomm_img/tb1_04.gif" height="17" width="5"></td>
                  <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">MM-999</td>
                  <td background="/html/slcomm_img/tb1_06.gif" height="17" width="5"></td>
                </tr>
            </table></td>
            <td width="60">
              <table id="tab_3" border=0 cellpadding=0 cellspacing=0 width="100%" style="cursor:hand;" onclick="set_on_off_medi_tab(this, 5, 1);">
                <tr>
                  <td width=5 height=3 background="/html/slcomm_img/tb1_01.gif"></td>
                  <td height=3  background="/html/slcomm_img/tb1_02.gif" ></td>
                  <td width=5 height=3 background="/html/slcomm_img/tb1_03.gif"></td>
                </tr>
                <tr>
                  <td background="/html/slcomm_img/tb1_04.gif" height="17" width="5"></td>
                  <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">MM-999</td>
                  <td background="/html/slcomm_img/tb1_06.gif" height="17" width="5"></td>
                </tr>
            </table></td>
            <td width="60">
              <table id="tab_4" border=0 cellpadding=0 cellspacing=0 width="100%" style="cursor:hand;" onclick="set_on_off_medi_tab(this, 5, 1);">
                <tr>
                  <td width=5 height=3 background="/html/slcomm_img/tb1_01.gif"></td>
                  <td height=3  background="/html/slcomm_img/tb1_02.gif" ></td>
                  <td width=5 height=3 background="/html/slcomm_img/tb1_03.gif"></td>
                </tr>
                <tr>
                  <td background="/html/slcomm_img/tb1_04.gif" height="17" width="5"></td>
                  <td background="/html/slcomm_img/tb1_05.gif" height="17" align="center">MM-999</td>
                  <td background="/html/slcomm_img/tb1_06.gif" height="17" width="5"></td>
                </tr>
            </table></td>
            <td width="50">
              <table border=0 cellpadding=0 cellspacing=0 width="100%" >
                <tr>
                  <td valign="bottom">&nbsp;
                      <input type="image" src="/html/slcomm_img/bu_ar02.gif" name="prev_medi_btn" value="" align="absmiddle" onclick="window.event.returnValue=false;">
                      <input type="image" src="/html/slcomm_img/bu_ar01.gif" name="next_medi_btn" value="" align="absmiddle" onclick="window.event.returnValue=false;"></td>
                </tr>
            </table></td>
          </tr>
        </table>
        <!--tab table end-->
      </td>
      <td align="right" valign="bottom">
      <input type="image" name="cancel_stop_btn" id="cancel_stop_btn_id" src="/html/reader/images/bu_cenjung.gif" onclick="cancel_stop();window.event.returnValue=false;" align="absmiddle"></td>
    </tr>
</table>
<table width="860"  cellpadding="2" cellspacing="0" bgcolor="#ffffff" class="gray" >
  <tr align="center">
    <td width="106" height="22" bgcolor="#DDDDDD" class="gray"> 매체명 </td>
    <td width="65" bgcolor="#DDDDDD" class="gray"> 계약번호 </td>
    <td width="63" bgcolor="#DDDDDD" class="gray"> 관리번호 </td>
    <td width="63" bgcolor="#DDDDDD" class="gray"> 구독구분 </td>
    <td width="56" bgcolor="#DDDDDD" class="gray"> 부수 </td>
    <td width="78" height="22" bgcolor="#DDDDDD" class="gray"> 구독단가 </td>
    <td width="59" height="22" bgcolor="#DDDDDD" class="gray"> 유가월 </td>
    <td width="83" height="22" bgcolor="#DDDDDD" class="gray">확장일자</td>
    <td width="84" bgcolor="#DDDDDD" class="gray">중지일자</td>
    <td width="86" bgcolor="#DDDDDD" class="gray">중지사유</td>
    <td height="22" bgcolor="#DDDDDD" class="gray"><input type="checkbox" id="select_all_checkbox_id" name="select_all_checkbox" value="checkbox" onclick="select_all(this.checked)"></td>
    <td width="12" bgcolor="#DDDDDD" class="gray">&nbsp;</td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
    <iframe name="subs_ifrm" src="/html/reader/sl_reader_1440_l.htm" height="139" width="860" scrolling="yes" frameborder="0" border="0" marginheight="0" marginwidth="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<table width="860"  cellpadding="3" cellspacing="0" bgcolor="#ffffff" >
  <tr>
    <td width="859" height="7" align="center">
      <!--하단여백-->
    </td>
  </tr>
</table>
<table width="860"  cellpadding="3" cellspacing="0" bgcolor="#ffffff">
  <tr>
    <td width="859" height="7" align="center">
      <!--하단여백-->
    </td>
  </tr>
  <tr>
    <td align="center" height="27"  bgcolor="#959595"><!--- 버튼 --->
        <input type="image" id="close_btn" src="/html/slcomm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;" align="absmiddle">
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="100%" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<form name="nwspsubscntr_list_search_form" method="post">
	<input type="hidden" name="bocd" value="">
    <input type="hidden" name="rdr_no" value="">
    <input type="hidden" name="medicd" value="">
</form>
<form name="nwspsubscntr_detail_search_form" method="post">
	<input type="hidden" name="bocd" value="">
    <input type="hidden" name="rdr_no" value="">
    <input type="hidden" name="medicd" value="">
    <input type="hidden" name="cntrno" value="">
    <input type="hidden" name="mangno" value="">
</form>
</body>
</html>
