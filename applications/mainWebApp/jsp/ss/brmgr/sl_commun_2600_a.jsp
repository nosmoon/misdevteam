<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_commun_2600_a.jsp
* 기능 	 	 : 판매지국-통신실 아파트투입 현황조사 및 등록 초기화면
* 작성일자 	 : 2004-02-24
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    int page_rec = 5;

    // dataset 인스턴스 선언부분
    SL_L_COMM_APT_THRWDataSet ds = (SL_L_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset

    String concatDelimiter = "##";	// 일괄업데이트를 위한 구분자
%>

<html>
<head>
<style>
    .on_1{background-image:url("/html/comm_img/tb3_01.gif");}
    .on_2{background-image:url("/html/comm_img/tb3_02.gif");}
    .on_3{background-image:url("/html/comm_img/tb3_03.gif");}
    .on_4{background-image:url("/html/comm_img/tb3_04.gif");}
    .on_5{background-image:url("/html/comm_img/tb3_05.gif");}
    .on_6{background-image:url("/html/comm_img/tb3_06.gif");}
    .off_1{background-image:url("/html/comm_img/tb4_01.gif");}
    .off_2{background-image:url("/html/comm_img/tb4_02.gif");}
    .off_3{background-image:url("/html/comm_img/tb4_03.gif");}
    .off_4{background-image:url("/html/comm_img/tb4_04.gif");}
    .off_5{background-image:url("/html/comm_img/tb4_05.gif");}
    .off_6{background-image:url("/html/comm_img/tb4_06.gif");}
</style>
<script language="javascript">
<!--
    //페이지초기화시 버튼설정및 EventHandler호출
    function jsInit(){
            setEventHandler();
            setEnterKeyEventHandler();
            setInputBackgroundColor();
            displayTab(tab_form.tabKey.value);
        }

    //페이지초기화시 버튼설정
    function btnInit(){
        document.all("update_btn").disabled = true;
        document.all("update_btn2").disabled = true;

    }

    // 전달사항 리스트 조회(엔터키)
    function list_search_enter() {
        if(event.keyCode == 13) list_search(1);
    }

    // 현황조사 리스트 조회
    function list_search(curr_page_no) {
        var lo_form = document.thrw_search_form;

        if(lo_form.invsgdt1.value == '' || lo_form.invsgdt2.value == '') {
            alert("조사일자는 필수항목입니다.");
            return;
        }

        if(curr_page_no!=null) {
            lo_form.curr_page_no.value = curr_page_no;
        }

        lo_form.method = "post";
        lo_form.action = "2610";
        lo_form.target = "ifrm";
        check_all(lo_form);

        jsInit();
    }

    // 현황조사 상세보기
    function thrw_view(invsgdt,invsgno,addrcd,dongno) {
        var lo_form = document.apt_thrw_temp_form;

        lo_form.invsgdt.value = invsgdt;
        lo_form.invsgno.value = invsgno;
        lo_form.addrcd.value = addrcd;
        lo_form.dongno.value = dongno;

        lo_form.action = "/ss/commun/2640";
        lo_form.target = "ifrm";
        check_all(lo_form);

        document.all("update_btn").disabled = false;
        document.all("update_btn2").disabled = false;
    }

    // 호별 등록
    function hous_save() {
        var lo_form  = document.thrw_head_form;
        var lo_form2 = ifrm_2.document.hous_thrw_form;

        if(lo_form.addrcd.value == '' || lo_form.dongno.value == '') {
            alert("대상아파트와 동을 선택하세요");
            return;
        }

        document.apt_thrw_temp_form.accflag.value 	    = "I";

        lo_form2.accflag.value 	    = "I";
        lo_form2.hmflag.value		= "H";
        lo_form2.zip.value	 		= lo_form.zip.value;
        lo_form2.addr.value     	= lo_form.addr.value;
        lo_form2.addrcd.value 		= lo_form.addrcd.value;
        lo_form2.dongno.value		= lo_form.dongno.value;
        lo_form2.pyong1.value	 	= lo_form.pyong.value;
        lo_form2.hoscnt1.value      = lo_form.hoscnt.value;
        lo_form2.invsgdt.value 	    = lo_form.year.value + lo_form.month.value + lo_form.day.value;

        if(lo_form.hour.value.length==0) lo_form.hour.value = lo_form.hour.value+"  ";
        if(lo_form.hour.value.length==1) lo_form.hour.value = lo_form.hour.value+" ";
        if(lo_form.minute.value.length==0) lo_form.minute.value = lo_form.minute.value+"  ";
        if(lo_form.minute.value.length==1) lo_form.minute.value = lo_form.minute.value+" ";
        lo_form2.invsghhmm.value	= lo_form.hour.value + lo_form.minute.value;
        lo_form2.invsgpers.value    = lo_form.invsgpers.value

        lo_form2.action = "/ss/commun/2650";
        lo_form2.target = "ifrm";
        lo_form2.method = "post";
        check_all(lo_form2);
    }

    // 호별 수정
    function hous_update() {
    
        var lo_form  = document.thrw_head_form;
        var lo_form2 = ifrm_2.document.hous_thrw_form;
        var lo_form3 = document.apt_thrw_temp_form;

        if(lo_form3.invsgdt.value == '' || lo_form3.invsgno.value == '') {
            alert("수정할 조사대상을 선택하세요");
            return;
        }

        document.apt_thrw_temp_form.accflag.value 	    = "U";

        lo_form2.accflag.value 	    = "U";
        lo_form2.hmflag.value		= "H";
        lo_form2.addrcd.value 		= lo_form3.addrcd.value;
        lo_form2.dongno.value		= lo_form3.dongno.value;
        lo_form2.invsgdt.value 	    = lo_form3.invsgdt.value;
        lo_form2.invsgno.value 	    = lo_form3.invsgno.value;

        lo_form2.action = "/ss/commun/2650";
        lo_form2.target = "ifrm";
        lo_form2.method = "post";
        
        check_all(lo_form2);

    }

    // 호별현황 clear(취소)
    function hous_cancel()
    {
        var lo_form = ifrm_2.document.hous_thrw_form;	// 상세정보 폼
        for( var i =0; i< lo_form.length; i++){
            lo_form(i).value = "";
        }

        document.apt_thrw_temp_form.accflag.value = "";

        document.all("update_btn").disabled = true;
    }

    // 매체별 등록
    function medi_save() {
        var lo_form  = ifrm_1.document.medi_thrw_form;
        var lo_form2 = document.apt_thrw_temp_form;
        var lo_form3 = ifrm_2.document.hous_thrw_form;

        lo_form2.accflag.value 	    = "I";
        lo_form2.hmflag.value		= "M";
        lo_form2.addrcd.value 		= lo_form3.addrcd.value;
        lo_form2.dongno.value		= lo_form3.dongno.value;
        lo_form2.invsgdt.value 		= lo_form3.invsgdt.value;

        if(lo_form.medicd == null){
            alert("호별 투입매체 현황에 투입된 호가 최소한 하나는 존재하여야\n매체별 투입현황 저장이 가능합니다.");
            return;
        }

        if(lo_form.medicd.length > 1) {
            lo_form2.medicd.value	 	= concatenate_with_delimiter(lo_form.medicd);
            lo_form2.qty.value     		= concatenate_with_delimiter(lo_form.qty);
            lo_form2.qtyratio.value 	= concatenate_with_delimiter(lo_form.qtyratio);
            lo_form2.bgndlvtm.value		= concatenate_with_delimiter2(lo_form.bgnhour,lo_form.bgnminute);
            lo_form2.enddlvtm.value		= concatenate_with_delimiter2(lo_form.endhour,lo_form.endminute);
            lo_form2.dlvstatcd.value	= concatenate_with_delimiter(lo_form.dlvstatcd);
            lo_form2.leaffeednosh.value	= concatenate_with_delimiter(lo_form.leaffeednosh);
        } else {
            lo_form2.medicd.value	 	= lo_form.medicd.value;
            lo_form2.qty.value     		= lo_form.qty.value;
            lo_form2.qtyratio.value 	= lo_form.qtyratio.value;
            lo_form2.bgndlvtm.value		= lo_form.bgnhour.value+lo_form.bgnminute.value;
            lo_form2.enddlvtm.value		= lo_form.endhour.value+lo_form.endminute.value;
            lo_form2.dlvstatcd.value	= lo_form.dlvstatcd.value;
            lo_form2.leaffeednosh.value	= lo_form.leaffeednosh.value;
        }

        lo_form2.action = "/ss/commun/2650";
        lo_form2.target = "ifrm";
        lo_form2.method = "post";
        check_all(lo_form2);
    }

    // 매체별 수정
    function medi_update() {
        var lo_form  = ifrm_1.document.medi_thrw_form;
        var lo_form2 = document.apt_thrw_temp_form;
        var lo_form3 = ifrm_2.document.hous_thrw_form;

        lo_form2.accflag.value 	    = "U";
        if(lo_form3.accflag.value=="U" && lo_form3.hmflag.value == "H") lo_form2.hmflag.value		= "S";
        else lo_form2.hmflag.value		= "M";


        if(lo_form.medicd.length > 1) {
            lo_form2.medicd.value	 	= concatenate_with_delimiter(lo_form.medicd);
            lo_form2.qty.value     		= concatenate_with_delimiter(lo_form.qty);
            lo_form2.qtyratio.value 	= concatenate_with_delimiter(lo_form.qtyratio);
            lo_form2.bgndlvtm.value		= concatenate_with_delimiter2(lo_form.bgnhour,lo_form.bgnminute);
            lo_form2.enddlvtm.value		= concatenate_with_delimiter2(lo_form.endhour,lo_form.endminute);
            lo_form2.dlvstatcd.value	= concatenate_with_delimiter(lo_form.dlvstatcd);
            lo_form2.leaffeednosh.value	= concatenate_with_delimiter(lo_form.leaffeednosh);
        } else {
            lo_form2.medicd.value	 	= lo_form.medicd.value;
            lo_form2.qty.value     		= lo_form.qty.value;
            lo_form2.qtyratio.value 	= lo_form.qtyratio.value;
            lo_form2.bgndlvtm.value		= lo_form.bgnhour.value+lo_form.bgnminute.value;
            lo_form2.enddlvtm.value		= lo_form.endhour.value+lo_form.endminute.value;
            lo_form2.dlvstatcd.value	= lo_form.dlvstatcd.value;
            lo_form2.leaffeednosh.value	= lo_form.leaffeednosh.value;
        }

        lo_form2.action = "/ss/commun/2650";
        lo_form2.target = "ifrm";
        lo_form2.method = "post";
        check_all(lo_form2);
    }

    // 매체별 clear(취소)
    function medi_cancel()
    {
        var lo_form = ifrm_1.document.medi_thrw_form;	// 상세정보 폼
        for( var i =0; i< lo_form.length; i++){
            lo_form(i).value = "";
        }

        document.apt_thrw_temp_form.accflag.value = "";

        document.all("update_btn2").disabled = true;
    }

    // 해당 인덱스의 key_obj가 체크되어있는지에 따라서 concat_str로 연결된 문자열을 조합한다.
    // array_obj는 collection type이다.
    function concatenate_with_delimiter(array_obj) {
        var ls_ret_str = "";
        var ls_obj_val = "";
        var ls_deli_str = "<%=concatDelimiter%>";

        for(var i=0; i<array_obj.length; i++) {
                ls_obj_val = array_obj[i].value;
                ls_ret_str += (ls_deli_str + ls_obj_val);
        }

        ls_ret_str = ls_ret_str.substr(ls_deli_str.length);
        return ls_ret_str;
    }

    function concatenate_with_delimiter2(array_obj1,array_obj2) {
        var ls_ret_str = "";
        var ls_obj_val = "";
        var ls_deli_str = "<%=concatDelimiter%>";

        for(var i=0; i<array_obj1.length; i++) {

                ls_obj_val = array_obj1[i].value+array_obj2[i].value;
                ls_ret_str += (ls_deli_str + ls_obj_val);
        }

        ls_ret_str = ls_ret_str.substr(ls_deli_str.length);
        return ls_ret_str;
    }

    // TAB클릭시 해당 레이어 표시 또는 숨김
    function displayTab(tapValue) {
        var form = document.tab_form;
        var lo_form = document.apt_thrw_temp_form;

        if(lo_form.accflag.value == "" && tapValue == "tab12"){
            alert("호별 투입매체 현황먼저 등록하십시요.");
            return;
        }

        form.tabKey.value = tapValue;
        if(tapValue == "tab11"){
            Layer1.style.display = "";
            Layer2.style.display = "none";
        } else if(tapValue == "tab12") {
            Layer1.style.display = "none";
            Layer2.style.display = "";
        }
    }

    // TAB의 배경색 바꾸기
    function set_background_color(){
        var forms = document.forms;
        var elements;
        for(var i=0; i<forms.length; i++){
            elements = forms(i).elements;
            for(var j=0; j<elements.length; j++){
                if(elements(j).tagName != "INPUT") continue;
                if(elements(j).readOnly){
                    elements(j).style.backgroundColor = "#E6E6E6";
                    elements(j).style.color = "#6B6B6B";
                }else{
                    elements(j).style.backgroundColor = "#FFFFFF";
                    elements(j).style.color = "#000000";
                }
            }
        }
    }

    //매체 tab 전체에 대한 display 설정
    function set_on_off_medi_tab(curr_tab_id, i_total_count){
        var ls_tab_id = "";
        var lo_form = document.apt_thrw_temp_form;	 // 현재 화면내 독자상세폼

        if(lo_form.accflag.value == "" && curr_tab_id == "tab_1"){
            return;
        }
        for(var i=0; i<i_total_count; i++){
            ls_tab_id = "tab_" + i;

            if(curr_tab_id == ls_tab_id){
                set_medi_tab(document.all(ls_tab_id), "on");
            }else{
                set_medi_tab(document.all(ls_tab_id), "off");
            }
        }
    }
    //매체 tab "ON/OFF"
    function set_medi_tab(o_this, s_on_off){
        var lo_cells = o_this.cells;
        //alert(o_this.id);
        var count = 1;
        for (i=0; i < o_this.rows.length; i++) {
            for (j=0; j < o_this.rows(i).cells.length; j++) {
                //alert(o_this.rows(i).cells(j).outerHTML );
                o_this.rows(i).cells(j).className = s_on_off + "_" + count++;
            }
        }
    }


    // 해당아파트의 동 목록을 불러온다
    function dong_search() {
        var lo_form = document.thrw_head_form;

        // 업무구분코드가 NULL일 경우
        if(lo_form.addrcd.value == "") {
            var str = "<select id=dong_id name=\"dongno\" tabIndex=\"3\" class=\"sel_all\" onChange=\"apt_search()\">" +
                          "<option value='' selected></option>" +
                      "</select>"
            document.all.dong_id.outerHTML = str;
            return;
        }

        lo_form.action = "/ss/commun/2620";
        lo_form.target = "ifrm";
        check_all(lo_form);
    }


    // 해당아파트동의 기본정보와 구조를 불러온다
    function apt_search() {
        var lo_form = document.thrw_head_form;

        //var lo_form2 = document.apt_thrw_temp_form;

        //for( var i =0; i< lo_form2.length; i++){
        //	lo_form2(i).value = "";
        //}

        lo_form.action = "/ss/commun/2630";
        lo_form.target = "ifrm";
        check_all(lo_form);
    }

    // submit시 호출
    function check_all(form){
            if(!validate(form)) return false;
            else{
                makeValue(form);
                form.submit();
            }
    }

    //엔터키에 의한 우편번호 검색
    function zip_enter_search(i_pageno){
        var e = window.event;
        if(!e || e.keyCode != "13") return;

        //우편번호 패턴이 아니라면 zip_search 함수를 call 한다.
        if(!validate_zip(document.thrw_head_form.zip.value)){
            zip_search(i_pageno);
            /*
            alert("우편번호 형식이 유효하지 않습니다. \n예)123-123 혹은 123123 처럼 입력하세요.");
            document.thrw_head_form.zip.select();
            e.returnValue = false;
            */
            return;
        }

        var lo_form = document.zip_search_form;
        //lo_form.bocd.value = "00070"; //지국지사 코드
        lo_form.zip.value = deleteHyphen(trim(document.thrw_head_form.zip.value));
        lo_form.pageno.value = i_pageno;   // 페이지번호
        lo_form.pagesize.value = "10000";  // 페이지사이즈( 한 페이지당 최대 레코드 수)

        insertDash(document.thrw_head_form.zip, 3);
        zip_search_form.target = "ifrm";
        zip_search_form.method = "post";
        zip_search_form.action = "/ss/common/1005";
        if(!check_all(zip_search_form)) return;
    }

    // 우편번호 유효성 검증
    function validate_zip(s_zip){
        if(trim(s_zip) == "") return false;
        var format = /^(\d{3})(-{0,1})(\d{3})$/;
        return isValidFormat(s_zip, format);
    }

    //검색버튼에 의한 우편번호 검색(팝업)
    function zip_search(i_pageno){
        var job_flg = "A"; //전체 검색 "A" , 지국내 검색 "S"
        var ls_name = deleteHyphen(trim(document.thrw_head_form.zip.value) + ":" + job_flg);
        var lo_form = document.thrw_head_form;
        var ls_uri = "/ss/common/1000";
        var ls_return = jsNewModalWinNoS(ls_uri, ls_name, "495", "410");

        var la_str;
        if(ls_return.indexOf("\n") != -1){
            la_str = ls_return.split("\n");
            var la_temp = new Array();
            la_temp[0] = la_str[2];
            la_temp[1] = la_str[3];
            //lo_form.addr.value 	= trim(la_str[1]) + " " + jsGetChainStr(la_temp, "~");
            //우편번호 조회시 선택된 주소에서 시작번지,끝번지는 표시 안함 20041109 노상현 (의견:이기웅)
            lo_form.addr.value 	= trim(la_str[1]);
            lo_form.zip.value = la_str[0];
        }
        return;
    }

    //엔터키에 의한 우편번호 검색 후 검색 결과가 한건일때, 결과를 필드에 셋팅
    function set_zip_search_result(){
        var zip_form 		= ifrm.document.zip_detail_form; // ifrm 내 조회된 결과 form
        var lo_form 	= document.thrw_head_form;	 // 현재 화면내 독자상세폼

        var la_temp = new Array();
        la_temp[0] = zip_form.bgnn.value;
        la_temp[1] = zip_form.endn.value;

        //lo_form.addr.value 	= trim(zip_form.addr.value) + " " + jsGetChainStr(la_temp, "~");
        //우편번호 조회시 선택된 주소에서 시작번지,끝번지는 표시 안함 20041109 노상현 (의견:이기웅)
        lo_form.addr.value 	= trim(zip_form.addr.value);
        lo_form.zip.value 	= zip_form.zip.value;
        insertDash(lo_form.zip, 3);
    }


    // 직원검색(팝업)
    function boemp_search(){
        var ls_boemp_no = "";

        var lo_form2 = thrw_head_form;

        var ls_return = jsNewModalWinNoS("/ss/account/1160", ls_boemp_no, "420", "410");

        var la_str;
        if(ls_return.indexOf("\n") != -1){
            la_str = ls_return.split("\n");
            lo_form2.invsgpers.value = la_str[1];
        }

        return;
    }


    // 매체코드검색(팝업)
    function medi_ynmpop(){

        var ls_return = jsNewModalWinNoS("/ss/commun/2680", "", "420", "410");
        return;
    }

-->
</script>
<title>통신실</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
</head>
<body onload="jsInit();btnInit();list_search();" bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">통신실
      &gt; </b>아파트 투입현황 &gt; 현황조사 및 등록 </td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<!--아파트 투입현황 조사 title-->
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title">아파트 투입현황 조사</td>
  </tr>
  <tr>
    <td height="2">
      <!--여백-->
    </td>
  </tr>
</table>
<!--아파트 투입현황 조사 -->
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0" class="gray" >
<form name="thrw_head_form" method="post" action="" >
<input name="bocd" type="hidden">
  <tr>
    <td class="gray" width="90" bgcolor="#dddddd">주소</td>
    <td colspan="3" class="gray">
        <input name="zip" type="text" size="7" tabIndex="1" class="text_box" tabIndex="2" onkeydown="zip_enter_search(1);">
        <a href="javascript:zip_search();"><img src="/html/comm_img/bu_search03.gif" width="39" height="19" border="0" align="absmiddle"></a>
        <input name="addr" type="text" size="40" tabIndex="3" style="background-color:#EBE9DC" class="text_box" readonly>
      <select name="addrcd" class="sel_all" tabIndex="2" onChange="dong_search();">
        <option value="">선택</option>
        <%=ds.addrcdcurOptHtml("")%>
      </select>
      아파트
      <select id="dong_id" name="dongno" class="sel_all" tabIndex="3" onChange="apt_search();">
        <option value="">선택</option>
      </select>
      동</td>
  </tr>
  <tr>
    <td width="90" class="gray" bgcolor="#dddddd">아파트정보</td>
    <td width="400" class="gray">
      <input name="pyong" type="text" style="ime-mode:disabled;text-align:right" class="text_box" tabIndex="4" size="5">
      평형 <font color="blue">[복합평형의 경우 입력 예)25/35]</font></td>
    <td  class="gray" width="90" bgcolor="#dddddd">세대수 </td>
    <td  class="gray">
      <input name="hoscnt" type="text" style="ime-mode:disabled;text-align:right" class="text_box" tabIndex="5" size="5">
    </td>
  </tr>
  <tr>
    <td class="gray" width="90" bgcolor="#dddddd">조사일시</td>
    <td class="gray">
      <input name="year" type="text" class="text_box" maxlength="4" tabIndex="6" value="<%=Util.getYear()%>" size="4" dataType="number" len="4" caption="조사년도" notEmpty>
      년
      <input name="month" type="text" size="2" tabIndex="7" maxlength="2" value="<%=Util.getMonth()%>" class="text_box" dataType="number" len="2" caption="조사월" maxValue="12" notEmpty>
      월
      <input name="day" type="text" size="2" tabIndex="8" maxlength="2" value="<%=Util.getDay()%>" class="text_box" dataType="number" len="2" caption="조사일" maxValue="31">
      일
      <input name="hour" type="text" size="2" tabIndex="9" maxlength="2" value="00" class="text_box" dataType="number" len="2" caption="시간" maxValue="24">
      시
      <input name="minute" type="text" size="2" tabIndex="10" maxlength="2" value="00" class="text_box" dataType="number" len="2" caption="분" maxValue="59">
      분경</td>
    <td class="gray" bgcolor="#dddddd" >조사자명</td>
    <td class="gray" >
      <input name="invsgpers" type="text" size="10" tabIndex="11" class="text_box">
      <img src="/html/comm_img/bu_search01.gif" onClick="boemp_search();" style="cursor:hand;" width="63" border="0" align="absbottom">
    </td>
  </tr>
</form>
</table>
<!--검색 start-->
<br>
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="thrw_search_form" method="post" action="" >
    <input name="curr_page_no" type="hidden" value ="1">
    <input name="records_per_page" type="hidden" value ="<%=page_rec%>">
  <tr>
    <td bgcolor="#EBE9DC" class="title" width="80"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">조사일자</td>
    <td bgcolor="#EBE9DC" class="title" width="200">
      <input name="invsgdt1" type="text" value="<%=Util.getYear()+"0101"%>" tabIndex="1" size="10" class="text_box" dataType=date caption="조사일자(검색)">
      -
      <input name="invsgdt2" type="text" value="<%=Util.getDate()%>" tabIndex="2" size="10" class="text_box" dataType=date caption="조사일자(검색)">
    </td>
    <td bgcolor="#EBE9DC" class="title" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">아파트</td>
    <td class="title" bgcolor="#EBE9DC" width="500">
      <select name="addrcd" class="sel_all" tabIndex="3" onkeydown="list_search_enter();">
        <option value="">전체</option>
        <%=ds.addrcdcurOptHtml("")%>
      </select>
      &nbsp;&nbsp;&nbsp;
      <a href="javascript:list_search(1);"><img src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" ></a>
    </td>
  </tr>
  <tr>
    <td height="3" colspan="3">
      <!--여백-->
    </td>
  </tr>
</form>
</table>

      <table id="thrw_list_id" width="830" border="0" cellpadding="2" cellspacing="0" bgcolor="#FFFFFF" class="gray" align="center">
        <tr align="center" bgcolor="#dddddd" >
          <td class="gray" width="80" align="center">순번</td>
          <td class="gray" width="200" align="center">조사일시</td>
          <td class="gray" width="200" align="center">아파트명</td>
          <td class="gray" width="200" align="center">동번호</td>
          <td class="gray" width="200" align="center">조사자</td>
        </tr>
        <%-- 비품 리스트를 빈칸으로 출력 --%>
        <%
            for(int i=0; i<page_rec; i++){
        %>
        <tr>
          <td class="gray" width="80" align="center">&nbsp;</td>
          <td class="gray" width="200">&nbsp;</td>
          <td class="gray" width="200">&nbsp;</td>
          <td class="gray" width="200">&nbsp;</td>
          <td class="gray" width="200">&nbsp;</td>
        </tr>
        <%
            }
        %>
        <tr  bgcolor="#dddddd" align="right" >
          <td  colspan="13" class="gray" height="23"> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">
            총 건수 : <b>0</b>건 </td>
        </tr>
      </table>
      <!---button-->
      <table id="thrw_list_nav_id" width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
        <tr>
          <td align="center" height="2">
            <!--여백-->
          </td>
        </tr>
        <tr>
          <td align="center" height="24" bgcolor="#E8E8E8">
          <%-- 페이지이동시 페이지및, 전체항목수 세팅 --%>
            <%
                String curr_page_no,total_records,js_fn_nm;
                if("".equals(Util.checkString(request.getParameter("curr_page_no")))){
                    curr_page_no = "1";
                } else {
                    curr_page_no = request.getParameter("curr_page_no");
                }
                //total_records = String.valueOf(ds.getTotalcnt());
                total_records = "0";
                js_fn_nm = "list_search";

            %>
            <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
            <jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
            <jsp:param name = "total_records" 		value="<%=total_records%>"/>
            <jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
            <jsp:param name = "records_per_page" 	value="<%=page_rec%>"/>
            <jsp:param name = "page_set_gubun" 		value="0"/>
            </jsp:include>
           </td>
        </tr>
      </table>
<br>

      <table width="830" border="0" cellspacing="0" cellpadding="0" align="center" style="visibility:visible">
        <tr>
          <td width="150">
            <!--tab 1-->
            <table id="tab_0" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:displayTab('tab11');set_on_off_medi_tab(this.id, 2);" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb3_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb3_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb3_03.gif" width=5 height=3 ></td>
              </tr>
              <tr>
                <td background="/html/comm_img/tb3_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb3_05.gif">호별 투입매체 현황</td>
                <td background="/html/comm_img/tb3_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 1 end-->
          </td>
          <td width="150">
            <!--tab2-->
            <table id="tab_1" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:displayTab('tab12');set_on_off_medi_tab(this.id, 2);" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
              </tr>

              <tr>
                <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb4_05.gif">매체별 투입 현황</td>
                <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 2 end-->
          </td>
          <td width="530">
            <!--tab 여백-->
          </td>
        </tr>
      </table>
<!--호별 투입매체 현황 title-->
<div id="Layer1" style="display:none;">
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title" height="25">호별 투입매체 현황
    <img src="/html/commun/images/bu_me01.gif" onClick="medi_ynmpop();" style="cursor:hand;" width="104" align="absmiddle"></td>
  </tr>
  <tr>
    <td height="2">
      <!--여백-->
    </td>
  </tr>
</table>
<!--호별 투입매체 현황-->
<table width="830" border="0" cellpadding="2" cellspacing="0"  align="center" class="gray">
  <tr align="center" bgcolor="#dddddd">
    <td class="gray" style="padding:0;">
        <iframe name="ifrm_2" src="/html/commun/sl_commun_2620_l.html" frameborder="0" height="150" width="100%" marginheight="0" marginwidth="0" scrolling="yes"></iframe>
    </td>
  </tr>
  <tr bgcolor="#dddddd">
    <td colspan="13" class="gray">* 조선일보와 동아일보를 보는 경우 호 입력 예) C,D</td>
  </tr>
</table>
<!--button -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr>
    <td align="center" height="2">
      <!--여백-->
    </td>
  </tr>
  <tr>
    <td align="center" height="24" bgcolor="#E8E8E8">
        <input type="image" src="/html/comm_img/bu_new01.gif" name="insert_btn" value="" align="absmiddle"
            onclick="hous_save();window.event.returnValue=false;">
        <input type="image" src="/html/comm_img/bu_save.gif" name="update_btn" value="" align="absmiddle"
            onclick="hous_update();window.event.returnValue=false;">
        <input type="image" src="/html/comm_img/bu_default.gif" name="cancel_btn" value="" align="absmiddle"
            onclick="hous_cancel();window.event.returnValue=false;">
    </td>
  </tr>
</table>
</div>
<!--투입매체별 현황 title-->
<div id="Layer2" style="display:none;">
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title" height="25">투입매체별 현황</td>
  </tr>
  <tr>
    <td height="2">
      <!--여백-->
    </td>
  </tr>
</table>
<!--투입매체별 현황 현황-->
<table width="830" border="0" cellspacing="0"  align="center" cellpadding="2" class="gray">
  <tr bgcolor="#dddddd" align="center">
    <td  class="gray" bgcolor="#dddddd" align="center" width="120"> 구분(단위) </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="100"> 투입부수(부) </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="100"> 투입률(%) </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="180"> 배달시간(시:분)~(시:분) </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="120"> 배달상태 </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="150"> 전단삽지매수(장) </td>
  </tr>
  <tr>
      <td class="gray" colspan="6" style="padding:0;">
        <iframe name="ifrm_1" src="/html/commun/sl_commun_2610_l.html" frameborder="0" height="151" width="100%" marginheight="0" marginwidth="0" scrolling="yes"></iframe>
      </td>
  </tr>
</table>
<!--button -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr>
    <td align="center" height="2">
      <!--여백-->
    </td>
  </tr>
  <tr>
    <td align="center" height="24" bgcolor="#E8E8E8">
        <!--input type="image" src="/html/comm_img/bu_new01.gif" name="insert_btn2" value="" align="absmiddle"
            onclick="medi_save();window.event.returnValue=false;"-->
        <input type="image" src="/html/comm_img/bu_save.gif" name="update_btn2" value="" align="absmiddle"
            onclick="medi_update();window.event.returnValue=false;">
        <input type="image" src="/html/comm_img/bu_default.gif" name="cancel_btn2" value="" align="absmiddle"
            onclick="medi_cancel();window.event.returnValue=false;">
    </td>
  </tr>
</table>
</div>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=00 height=00></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
<form name="tab_form">
    <input type="hidden" name="tabKey" value="tab11">
</form>
<form name="zip_search_form" method="post" style="display:none">
    <input type=hidden name=bocd     	 value="">  <!--지국지사코드           -->
    <input type=hidden name=zip 		 value="">  <!--우편번호               -->
    <input type=hidden name=pageno		 value="">  <!--현재페이지             -->
    <input type=hidden name=pagesize	 value="">  <!--페이지당 보여줄 건수   -->
</form>
<form name="apt_thrw_temp_form" method="post" style="display:none">
    <input type=hidden name=bocd     	 	value="">
    <input type=hidden name=accflag 		value="">
    <input type=hidden name=hmflag		 	value="">
    <input type=hidden name=addrcd 		 	value="">
    <input type=hidden name=dongno		 	value="">
    <input type=hidden name=invsgdt 		value="">
    <input type=hidden name=invsgno		 	value="">
    <input type=hidden name=incmgpers		value="">
    <input type=hidden name=medicd	 		value="">
    <input type=hidden name=qty     	 	value="">
    <input type=hidden name=qtyratio 		value="">
    <input type=hidden name=bgndlvtm		value="">
    <input type=hidden name=enddlvtm	 	value="">
    <input type=hidden name=dlvstatcd		value="">
    <input type=hidden name=leaffeednosh	value="">
</form>
