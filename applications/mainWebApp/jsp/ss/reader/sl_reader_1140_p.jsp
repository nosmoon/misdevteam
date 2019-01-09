<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1140_p.jsp
* 기능       : 독자정보관리(구독내역팝업-초기화면)
* 작성일자   : 2003-12-12
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
<title>::::구독내역::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
	window.returnValue	 = "";

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

	// 페이지 로딩될 때 기본값으로 검색
    function default_search(){

   		var lo_form = document.his_search_form;

		var ls_args = ":"; // dialog argument
		// dialog에 argument로 던져진 문자열을 ":" 로 split
        //window.dialogArguments = "040000047:130";
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

			lo_form.rdr_no.value = ga_args[0];
            lo_form.medicd.value = ga_args[1];
            lo_form.pid.value = "1150"; //최초는 구독내역 목록 조회
			lo_form.pageno.value = "1";
			lo_form.pagesize.value = "9";

			window.setTimeout("stop_interval()", 5000);
            sync_medicd(); // argument 값의 medicd 와 매체코드 목록과 일치시킨다.

			lo_form.action = "/ss/slreader/1150";
			lo_form.target = "ifrm";
			lo_form.submit();
        }
    }

	// 페이지 네비게이션
    function page_move(i_pageno){
		var lo_search_form = document.his_search_form;
		lo_search_form.pageno.value = i_pageno;
        lo_search_form.pagesize.value = "9";
        if(!check_all(lo_search_form, "/ss/slreader/" + lo_search_form.pid.value)) return;
		return;
    }

	// 내역 조회
    function his_list_search(s_pid) {
		var ls_pid  = "";
		if(s_pid == "") ls_pid = "1150"; //defaut 구독내역 조회
 		else ls_pid = s_pid;

        var lo_medi_form = medi_ifrm.document.bohndl_medi_list_form;
        var lo_search_form = document.his_search_form;
		lo_search_form.pid.value = ls_pid;
        // 부분중지일 경우 check된 매체코드가 있어야 중지 처리가 가능함
		var j = 0;
		if(lo_medi_form.medicd.length){
			for(var i=0; i<lo_medi_form.medicd.length; i++) { // 체크된 건수를 합산
				if(lo_medi_form.medicd[i].checked) j++;
			}
		}else{
			if(lo_medi_form.medicd.checked) j++;
		}
		if(j==0) { // 체크된 건이 없을 때
			alert('체크된 매체가 존재하지 않습니다.');
			return;
		}

        lo_search_form.pageno.value = "1";
        lo_search_form.pagesize.value = "9";
        var ls_concat_str = "##";
        lo_search_form.medicd.value 		= concatenate_with_delimiter(lo_medi_form.medicd, ls_concat_str, lo_medi_form.medicd);		// 매체코드

//alert(lo_search_form.medicd.value);
		if(!check_all(lo_search_form, "/ss/slreader/" + s_pid)) return;
		return;
    }

    // 해당 인덱스의 key_obj가 체크되어있는지에 따라서 concat_str로 연결된 문자열을 조합한다.
    // array_obj는 collection type이다.
    function concatenate_with_delimiter(array_obj, concat_str, key_obj) {
        var ls_ret_str = "";
        var ls_obj_val;

		if(array_obj.length){
            for(var i=0; i<array_obj.length; i++) {
                if(key_obj[i].checked) {
                    ls_obj_val = array_obj[i].value;
                    //if(ls_obj_val=="") ls_obj_val = null;
                    ls_ret_str += (concat_str + ls_obj_val);
                }
            }
		}else{
            if(key_obj.checked) {
                ls_obj_val = array_obj.value;
                //if(ls_obj_val=="") ls_obj_val = null;
                ls_ret_str += (concat_str + ls_obj_val);
            }
        }

        ls_ret_str = ls_ret_str.substr(concat_str.length);

        return ls_ret_str;
    }


    // 타이틀 체크 박스 클릭 이벤트 핸들러
	function set_checkbox_state(o_this){
        var lo_form = medi_ifrm.document.bohndl_medi_list_form;
        if(o_this.checked == false){
    		on_off_checkbox(lo_form.medicd, "off");
        }else{
           	on_off_checkbox(lo_form.medicd, "on");
        }
        return;
    }

	// 타이틀 체크 박스 클릭시 medi_ifrm 내 있는 모든 체크 박스를 선택 혹은 해제
    // s_flg("on","off")
    function on_off_checkbox(o_checkbox, s_flg){
		if(!o_checkbox) return;
        if(o_checkbox.length){ // 체크박스가 여러개 일경우( array 일 경우)
        	for(var i=0; i<o_checkbox.length; i++){
                if(s_flg == "on"){
                	o_checkbox[i].checked=true;
                }else{
                  	o_checkbox[i].checked=false;
                }
            }
        }else{ // 한개 일경우
            if(s_flg == "on"){
                o_checkbox.checked=true;
            }else{
                o_checkbox.checked=false;
            }
        }

    }


    //dialog argument로 넘어온 매체코드 와 검색조건의 매체 목록의 것과 동기화
    var o_interval = ""; // interval 호출
	function sync_medicd(){
        if(o_interval == ""){
			o_interval=window.setInterval("check_medi_list()",200);
        }else{
        	stop_interval();
        }
    }

	//argument로 넘겨 받은 매체코드에 해당하는 매체를 매체목록에서 체크( 동기화 )
	function check_medi_list(){
        if( !medi_ifrm.document.bohndl_medi_list_form || medi_ifrm.document.bohndl_medi_list_form == "undefined" ) return;
		var lo_search_form = document.his_search_form;
        var lo_medi_form = medi_ifrm.document.bohndl_medi_list_form;
		var ls_medicd = lo_search_form.medicd.value;

		if(lo_medi_form.medicd.length){
			for(var i=0; i<lo_medi_form.medicd.length; i++) {
				if(lo_medi_form.medicd[i].value == ls_medicd)  lo_medi_form.medicd[i].checked = true;
				else lo_medi_form.medicd[i].checked = false;
			}
		}else{
			lo_medi_form.medicd.checked = true;
		}
        stop_interval();
	}

	//sync_medicd 의 interval을 중지할 때 쓰임
    function stop_interval(){
        if(o_interval!=""){
            window.clearInterval(o_interval);
        }
    }

	//창닫기
	function close_modal(){
		window.close();
	}

-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1" onload="jsInit();default_search();">
<!--title-->
<table width="860" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td  height="7">
      <!-----상위여백-- -->
    </td>
  </tr>
  <tr>
    <td align="center" height="33" class="pup">
      <!--title-->
      <table width="860" border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width=2> <img src="/html/slcomm_img/car_01.gif" width=2 height=3 ></td>
          <td background="/html/slcomm_img/car_02.gif"></td>
          <td> <img src="/html/slcomm_img/car_03.gif" width=2 height=3 ></td>
        </tr>
        <tr>
          <td width=2> <img src="/html/slcomm_img/car_04.gif" width=2 height=23 ></td>
          <td background="/html/slcomm_img/car_05.gif" align="center" class="pup"> <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle">
            <!--title 자리-->
            구독내역 <img src="/html/slcomm_img/ic_pup.gif" width="19" height="8" align="absmiddle"></td>
          <td width=2><img src="/html/slcomm_img/car_06.gif" width=2 height=23 ></td>
        </tr>
        <tr>
          <td width=2><img src="/html/slcomm_img/car_07.gif" width=2 height=7 ></td>
          <td background="/html/slcomm_img/car_08.gif"></td>
          <td width=2> <img src="/html/slcomm_img/car_09.gif" width=2 height=7 ></td>
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
      <table width="860" border="0" cellspacing="0" cellpadding="2">
        <tr valign="top">
          <td width="220">
            <!--검색 -->
            <table width="220" border="0" cellspacing="0" cellpadding="2">
              <form name="his_search_form" method="post" >
                <input type=hidden name=rdr_no   > <!--독자번호          -->
                <input type=hidden name=medicd   > <!--매체리스트         -->
                <input type=hidden name=pageno   > <!--현재페이지         -->
                <input type=hidden name=pagesize > <!--페이지당 보여줄 건수-->
                <input type=hidden name=pid      > <!--프로그램 id (이벤트 번호)-->
              <tr>
                <td bgcolor="#EBE9DC" class="title" width="35"><img src="/html/slcomm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간</td>
                <td bgcolor="#EBE9DC" class="title" width="175">
                  <input name="frdt" type="text" size="9" class="text_box" dataType="date" caption="시작일자" value="">
                  ~
                  <input name="todt" type="text" size="9" class="text_box" dataType="date" caption="종료일자" value="">
                </td>
              </tr>
              <tr>
                <td height="3" colspan="2">
                  <!--여백-->
                </td>
              </tr>
              </form>
            </table>
            <!--리스트 -->
            <table width="220" border="0" cellpadding="1" cellspacing="0" bgcolor="#FFFFFF" class="gray" >
              <tr align="center">
                <td width="30" bgcolor="#dddddd" class="gray">
                  <input id="all_check" name="all_check" type="checkbox"  value="checkbox" onclick="set_checkbox_state(this)">
                </td>
                <td width="110" height="16" bgcolor="#dddddd" class="gray"> 매체명
                </td>
                <td width="80" bgcolor="#dddddd" class="gray"> 약어 </td>
              </tr>
            </table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
    <iframe name="medi_ifrm" src="/ss/slcommon/1600" height="207" width="220" scrolling="yes" frameborder="0" marginheight="0" marginwidth="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

          </td>
          <td width="632">
            <!--버튼 -->
            <table width="100%" border="0" cellspacing="0" cellpadding="2" id="his_title_id">
              <tr>
                <td width="292" height="27" bgcolor="#EBE9DC" class="title">구독내역</td>
                <td bgcolor="#EBE9DC" class="title" align="right" height="27">
                  <input type="image" src="/html/slcomm_img/bu_gu_1.gif" width="39" height="19" align="absbottom" onclick="his_list_search('1150');">
				  <input type="image" src="/html/slcomm_img/bu_move.gif" width="39" height="19" align="absmiddle" onclick="his_list_search('1170');">
				  <input type="image" src="/html/slcomm_img/bu_rest.gif" width="39" height="19" align="absmiddle" onclick="his_list_search('1160');"></td>
              </tr>
              <tr>
                <td height="3" colspan="2">
                  <!--여백-->
                </td>
              </tr>
            </table>
            <!--리스트 -->
            <table width="100%" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="his_list_id">
              <tr bgcolor="#dddddd" align="center">
                <td width="150" class="gray" height="23"  > 구독기간 </td>
                <td width="90" height="23" class="gray"  > 지국명 </td>
                <td width="99" class="gray" height="23"  > 매체명 </td>
                <td width="65" class="gray"> 확장유형 </td>
                <td class="gray" height="23"  > 비고 </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray" >&nbsp;</td>
                <td class="gray" >&nbsp; </td>
                <td width="99" class="gray"  >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray" >&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp; </td>
                <td width="99" class="gray" >&nbsp;</td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp; </td>
                <td width="99" class="gray" >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp; </td>
                <td width="99" class="gray" >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp; </td>
                <td width="99" class="gray" >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp; </td>
                <td width="99" class="gray" >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
                <td width="99" class="gray" >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
                <td width="99" class="gray" >&nbsp; </td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
              <tr>
                <td width="150" align="center" class="gray">&nbsp;</td>
                <td class="gray">&nbsp;</td>
                <td width="99" class="gray" >&nbsp;</td>
                <td width="65" class="gray">&nbsp; </td>
                <td class="gray">&nbsp; </td>
              </tr>
            </table>
            <!--버튼-->
            <table width="100%" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="navigator_id">
              <tr>
                <td align="center" height="25" bgcolor="#E8E8E8">
                  <!--JSP PAGE START---------------------------------------------------------------------------------->
                        <jsp:include page="/jsp/ss/slcomm_jsp/page_navigator.jsp">
                        <jsp:param name = "curr_page_no" 		value="1"/>
                        <jsp:param name = "total_records" 		value="0"/>
                        <jsp:param name = "js_fn_nm" 			value="page_move"/>
                        <jsp:param name = "records_per_page" 	value="9"/>
                        <jsp:param name = "page_set_gubun" 	value="0"/>
                        </jsp:include>
                  <!--JSP PAGE END------------------------------------------------------------------------------------>
                </td>
              </tr>
            </table>
          </td>
        </tr>
        <tr valign="top">
          <td>&nbsp;</td>
          <td>&nbsp;</td>
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
    <td align="center" height="27"  bgcolor="#959595"><input type="image" src="/html/slcomm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;"></a></td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="100%" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>