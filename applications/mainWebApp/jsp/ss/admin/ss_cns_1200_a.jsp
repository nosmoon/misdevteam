<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_cns_1200_a.jsp
* 기능 : 상담원-불편 초기화면
* 작성일자 : 2004-07-15
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : 상세화면에 맛있는한자 추가
* 수정자 : 김대섭
* 수정일자 : 2005-03-07
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 상세화면에 19단표 추가
* 수정자 : 김대섭
* 수정일자 : 2005-03-15
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_DSCT_INITDataSet ds = (SS_L_RDR_DSCT_INITDataSet)request.getAttribute("ds");
    int moveListCount = 10;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
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
	document.rdr_dsct_search_form.bonm.focus();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 목록보기
function list_search(){
    var lo_form1 = document.rdr_dsct_search_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

	// 독자불편 목록 조회조건을 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/cns/1210";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// page 이동
function page_move(pageno) {
    var lo_form1 = document.rdr_dsct_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

	// 독자불편 목록 조회조건을 해당 서블릿으로 보낸다.
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    lo_form1.action = "/ss/cns/1210";
    lo_form1.target = "ifrm";
    lo_form1.submit();

}

// 상세보기
function detail_view(regdt, regno){
    var lo_form1 = document.rdr_dsct_list_form;

    // 등록일자, 등록번호를 "/ss/cns/2120" 서블릿으로 보낸다
    lo_form1.regdt.value = regdt;
    lo_form1.regno.value = regno;
    lo_form1.action = "/ss/cns/1220";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 지국찾기 팝업
function bo_search(){
    var lo_form1 = document.rdr_dsct_search_form;
    var	deptcd = lo_form1.deptcd.value;
    var areacd = lo_form1.areacd.value;
    var bonm   = lo_form1.bonm.value;

	var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");
    var la_str;

    if(ls_return.indexOf("\n") != -1){
        la_str = ls_return.split("\n");
        lo_form1.bocd.value = la_str[0];
        lo_form1.bonm.value = la_str[1];
/*
        lo_form1.deptcd.value = la_str[2];
        lo_form1.areacd.outerHTML =
        		'<select name="areacd" size="1" id="areacd_id" class="sel_all">' +
        		'<option value="' +
        		la_str[4] +
        		'" selected>' +
        		la_str[5] +
        		'</option>';
*/
	    // 목록 검색일 경우 처리
	    if(gs_request == 'L'){
	    	gs_request = 'N';
	    	list_search();
	    }

    }
	return;
}

// 엔터키에 의한 지국찾기
function bo_enter_search(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    var lo_form1 = document.rdr_dsct_search_form;

    //지국명이 존재하지 않으면 지국검색팝업을 띄운다.
	if(lo_form1.bonm.value == ''){
		bo_search();
		return;
	}

    // 부서코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1113";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}


// 엔터키에 의한 지국찾기 결과처리
function bo_enter_search_result(no){
	// 검색결과가 한건이므로 검색창에 결과값을 설정한다.
	if(no == '1'){
		var lo_form1 = ifrm.document.bo_detail_form;
		var lo_form2 = document.rdr_dsct_search_form;
/*
		lo_form2.deptcd.value = lo_form1.deptcd.value;
        lo_form2.areacd.outerHTML =
        		'<select name="areacd" size="1" id="areacd_id" class="sel_all">' +
        		'<option value="' +
        		lo_form1.areacd.value +
        		'" selected>' +
        		lo_form1.areanm.value +
        		'</option>';
*/
		lo_form2.bocd.value = lo_form1.bocd.value;
		lo_form2.bonm.value = lo_form1.bonm.value;
	// 검색결과가 없거나 여러건이므로 지국찾기 팝업을 띄운다.
	}else if(no == '2'){
		bo_search();
	}
}

// 지역 검색
function area_search(){
    var lo_form1 = document.rdr_dsct_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>전체</option>" +
                  "</select>"
        document.all.areacd_id.outerHTML = str;
        return;
    }

    // 부서코드값을 "/ss/common/1100" 서블릿으로 보낸다
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1100";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 목록에서 선택된 로우 전역변수
var go_sel_row;

// 선택된 로우 색깔 바꾸기
function change_sel_row(obj){
	go_sel_row = obj;
	obj.style.backgroundColor='#BFD2DD';
	lo_table = obj.parentNode;
	for(i=1; i<lo_table.rows.length-1; i++){
		if(lo_table.rows[i] != go_sel_row){
			lo_table.rows[i].style.backgroundColor='#FFFFFF';
		}
	}
}

// 목록에서 마우스 IN
function mouse_in(obj){
	if(obj != go_sel_row){
		obj.style.backgroundColor='#CCCCBB';
	}
}

// 목록에서 마우스 OUT
function mouse_out(obj){
	if(obj != go_sel_row){
		obj.style.backgroundColor='#FFFFFF';
	}
}

// 검색 조건 초기화
function set_default(flag){

    var lo_form1 = document.rdr_dsct_search_form;

	if(flag == '1'){			// 부서,지역,지국 초기화
		// 부서 초기화
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search();" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									+'</select>';
		// 지역 초기화
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" id="areacd_id" class="sel_all">'
									+'<% writeAreaOpt(session, out, true); %>'
									+'</select>';
		// 지국코드,지국명 초기화, 포커스이동
		lo_form1.bocd.value = "";
		lo_form1.bonm.value = "";
		lo_form1.bonm.focus();
	}else if(flag == '2'){		// 기간 초기화
	}else if(flag == '3'){		// 기타 초기화
	}
}

// 목록 조회시 지국명이 존재할 경우 지국검색 후 목록 조회를 수행한다.
// 이경우 단순 지국검색과 지국검색 후 목록 조회를 수행해야 하는가 구분해야 하고 목록조회를 수행해야 하는 경우는 gs_request 변수값을 L 로 설정한다.
var gs_request = 'N';	// N : 요청없음, L : 조회요청

// 요청 플래그 설정
function set_request(flag){
	gs_request = flag;
}

// 지국검색을 통한 목록 조회
function bo_list_search(){
    var lo_form1 = document.rdr_dsct_search_form;

	if(lo_form1.bonm.value == ''){
		lo_form1.bocd.value = '';
		list_search();
	}else{
	    // 부서코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}



//엔터키에 의한 우편번호 검색2(구독자)
function zip_enter_search(i_pageno){

    var e = window.event;
    if(!e || e.keyCode != "13") return;

	var ls_medicd = rdr_dsct_detail_form.medicd.value;
	if(ls_medicd == '210' || ls_medicd == '220' || ls_medicd == '230' || ls_medicd == '240' || ls_medicd == '270' || ls_medicd == '420' || ls_medicd == '421' || ls_medicd == '422'){
		pb_rdr_enter_search('1');
		window.event.returnValue = false;
		return;
	}

	//우편번호 패턴이 아니라면 zip_search 함수를 call 한다.
	if(!validate_zip(rdr_dsct_detail_form.dlvzip.value)){
        zip_search(i_pageno);
		window.event.returnValue = false;
        return;
    }else{

		var lo_form = document.zip_search_form;
	    lo_form.zip.value = rdr_dsct_detail_form.dlvzip.value;
	    lo_form.pageno.value = i_pageno;   // 페이지번호
	    lo_form.pagesize.value = "10000";  // 페이지사이즈( 한 페이지당 최대 레코드 수)

	    if(!check_all(zip_search_form, "/ss/common/1152")) return;

    }

}

//검색버튼에 의한 우편번호 검색(팝업)2(구독자)
function zip_search(i_pageno){

	var ls_medicd = rdr_dsct_detail_form.medicd.value;
	if(ls_medicd == '210' || ls_medicd == '220' || ls_medicd == '230' || ls_medicd == '240' || ls_medicd == '270' || ls_medicd == '420' || ls_medicd == '421' || ls_medicd == '422'){
		pb_rdr_enter_search('2');
		window.event.returnValue = false;
		return;
	}

    var job_flg = "A"; //전체 검색 "A" , 지국내 검색 "S"
    var ls_name = deleteHyphen(trim(rdr_dsct_detail_form.dlvzip.value) + ":" + job_flg);
	var lo_form = document.rdr_dsct_detail_form;
	var ls_uri = "/ss/common/1150";
    var ls_return = jsNewModalWinNoS(ls_uri, ls_name, "430", "410");

	var la_str;
	if(ls_return.indexOf("\n") != -1){
    	la_str = ls_return.split("\n");
        lo_form.dlvzip.value = la_str[0];
		lo_form.dlvaddr.value = la_str[1];
        lo_form.bocd.value = la_str[4];
		lo_form.bonm.value = la_str[5];
		lo_form.telno1.value = la_str[6];
		lo_form.telno2.value = la_str[7];
		lo_form.telno3.value = la_str[8];
	}
	return;
}

//엔터키에 의한 우편번호 검색 후 검색 결과가 한건일때, 결과를 필드에 셋팅
function set_zip_search_result(){

	var zip_form 		= ifrm.document.zip_detail_form; 		// ifrm 내 조회된 결과 form
	var lo_form 	    = document.rdr_dsct_detail_form;	 	// 현재 화면내 독자상세폼

	lo_form.dlvzip.value 	= zip_form.zip.value;
	lo_form.dlvaddr.value 	= zip_form.addr.value;
}

// 우편번호 유효성 검증
function validate_zip(s_zip){
	if(trim(s_zip) == "") return false;
    var format = /^(\d{3})(-{0,1})(\d{3})$/;
    return isValidFormat(s_zip, format);
}



// 추가
function add(){
    var lo_form1 = document.rdr_dsct_detail_form;	                // 상세정보 폼

	// 마감 항목을 제외하고 화면 정리
    var c_form2_elements = lo_form1.elements;
    for( var i =0; i< c_form2_elements.length; i++){
		c_form2_elements(i).value = "";
    }

	document.all.path_id.innerHTML = '&nbsp;TM';
	document.all.acpndt_id.innerHTML = '&nbsp;';
	document.all.boprocyn_id.innerHTML = '&nbsp;';
	document.all.boprocdt_id.innerHTML = '&nbsp;';
	document.all.cns_empnm_id.innerHTML = '<%= Util.getSessionParameterValue(request, "emp_nm", false)%>&nbsp;';
	document.all.cnscnfmtm_id.innerHTML = '&nbsp;';

	lo_form1.medicd.value='110'	//조선일보 기본
    lo_form1.jobflag.value = 'D';									// 작업구분을 불편으로 설정
    lo_form1.accflag.value = 'I';									// 처리구분을 입력으로 설정
}

// 저장
function save(){
   var lo_form1 = document.rdr_dsct_detail_form;

    lo_form1.jobflag.value = 'D';									// 작업구분을 불편으로 설정

	if(lo_form1.accflag.value == 'D'){								// 삭제시 예외발생하면 'U'로 변경한다.
		lo_form1.accflag.value = 'U';
	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크


    //현주소 체크
	if(lo_form1.dlvzip.value == '' || lo_form1.dlvaddr.value == '' || lo_form1.dlvdtlsaddr.value == ''){
		//기사건은 필요없다.
		if(lo_form1.dscttypecd.value == '50' || lo_form1.dscttypecd.value == '60' || lo_form1.dscttypecd.value == '70' || lo_form1.dscttypecd.value == '80' || lo_form1.dscttypecd.value == '90' || lo_form1.dscttypecd.value == '95'){
			;
		}else{
			alert("주소를 입력하세요");
			return;
		}
	}

	//구독자 체크
	if(lo_form1.rdrnm.value == ''){
		alert("구독자 성명을 입력하세요");
		return;
	}

	//불편유형 체크
	if(lo_form1.dscttypecd.value == ''){
		alert("불편 유형을 선택하세요");
		return;
	}

	//제목 또는 내용 체크
	if(lo_form1.titl.value == '' || lo_form1.cont.value == ''){
		alert("제목 또는 내용을 입력하세요");
		return;
	}

	//상담원확인여부
	if(lo_form1.cnscnfmyn_chk.checked){
		lo_form1.cnscnfmyn.value = 'Y';
	}else{
		lo_form1.cnscnfmyn.value = 'N';
	}

    //지국불편처리내용(처리소요시간,해피콜실시)는 상담원이 변경못함
    lo_form1.bo_procreqitm.value = lo_form1.hdn_bo_procreqitm.value;
    lo_form1.bo_cnfmtel.value = lo_form1.hdn_bo_cnfmtel.value;

    if(lo_form1.accflag.value == 'I') {	        					// 신규입력일 때
        lo_form1.action = "/ss/cns/1550";
    } else if(lo_form1.accflag.value == 'U') {						// 수정저장일 때
    	lo_form1.pageno.value = document.rdr_dsct_search_form.pageno.value;
        lo_form1.action = "/ss/cns/1560";
    }

    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 삭제
function del(){
    var lo_form1 = document.rdr_dsct_detail_form;
    lo_form1.jobflag.value = 'D';									// 작업구분을 불편으로 설정

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	// 일자, 번호 존재여부를 확인한다
    if(lo_form1.dt.value == '' || lo_form1.no.value == '') {
        alert("해당목록을 클릭 후 삭제하세요.");
        return;
    }

	var yesno = confirm("삭제하시겠습니까?");
	if(yesno){
	    lo_form1.accflag.value = 'D';								// 작업구분을 삭제('D')로 세팅
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/cns/1570";
	    lo_form1.submit();
	}
}


// 출판독자검색
function pb_rdr_enter_search(flag){
	if(flag == '1'){
	    var e = window.event;
	    if(!e || e.keyCode != "13") return;
	}
	var lo_form = document.rdr_dsct_detail_form;
	var ls_uri = "/ss/cns/1500";
	var ls_rdrnm = lo_form.rdrnm.value;
	var ls_medicd = lo_form.medicd.value;

	if(ls_medicd != '210' && ls_medicd != '220' && ls_medicd != '230' && ls_medicd != '240' && ls_medicd != '270' && ls_medicd != '420' && ls_medicd != '421' && ls_medicd != '422'){
		alert("출판매체 선택시 출판독자를 검색합니다.");
		window.event.returnValue = false;
		return;
	}
    var ls_return = jsNewModalWinNoS(ls_uri, ls_rdrnm+":"+ls_medicd, "800", "410");

	var la_str;
	if(ls_return.indexOf("\n") != -1){

		// 지국코드,지국명, 지국전화번호 초기화
		lo_form.bocd.value = "";
		lo_form.bonm.value = "";
		lo_form.telno1.value = "";
		lo_form.telno2.value = "";
		lo_form.telno3.value = "";

    	la_str = ls_return.split("\n");
        lo_form.rdr_no.value = la_str[0];
        lo_form.rdrnm.value = la_str[1];
        lo_form.medicd.value = la_str[2];
        lo_form.aplcperstel_no1.value = la_str[3];
        lo_form.bocd.value = la_str[4];
		lo_form.bonm.value = la_str[5];

		var la_ret6 = la_str[6];
		if(la_ret6.indexOf("-") != -1){
			var ls_telno = la_ret6.split("-");
			lo_form.rdrtel_no1.value = ls_telno[0];
			lo_form.rdrtel_no2.value = ls_telno[1];
			lo_form.rdrtel_no3.value = ls_telno[2];
		}

		var la_ret7 = la_str[7];
		if(la_ret7.indexOf("-") != -1){
			var ls_telno2 = la_ret7.split("-");
			lo_form.rdrptph_no1.value = ls_telno2[0];
			lo_form.rdrptph_no2.value = ls_telno2[1];
			lo_form.rdrptph_no3.value = ls_telno2[2];
		}

        lo_form.dlvzip.value = la_str[8];
		lo_form.dlvaddr.value = la_str[9];
		lo_form.dlvdtlsaddr.value = la_str[10];

		var la_ret11 = la_str[11];
		if(la_ret11.indexOf("-") != -1){
			var ls_telno3 = la_ret11.split("-");
			lo_form.telno1.value = ls_telno3[0];
			lo_form.telno2.value = ls_telno3[1];
			lo_form.telno3.value = ls_telno3[2];
		}

	}
	setEventHandler();
	window.event.returnValue = false;
	return;
}

//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">

<form name="rdr_dsct_list_form" method="post" action="" >
    <input name="regdt" type="hidden" value ="">
    <input name="regno" type="hidden" value ="">
</form>


<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >독자현황
      &gt; </b> 독자불편 </td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td>
      <!--독자불편접수 검색-->
      <table width="830" border="0" cellspacing="0" cellpadding="2">

      <form name="rdr_dsct_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                <!-- 현재 페이지 번호 -->
        <input name="pagesize" type="hidden" value ="<%= moveListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
        <input type="hidden" name="common_deptcd" value ="">                    <!-- 공통 부서코드 -->
        <input type="hidden" name="bocd" value ="">                         	<!-- 지국지사코드 -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->

        <tr>
          <td bgcolor="#EBE9DC" width="40" class="sea_top">	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서</td>
          <td width="236" class="sea_top" bgcolor="#EBE9DC" >
            <select name="deptcd" onChange="area_search();" class="sel_all"><!-- 부서코드, 코드명 목록 -->
<%
					writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
            </select>
			&nbsp;
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역
			&nbsp;
            <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--지역코드, 지역명 목록-->
<%
					writeAreaOpt(session, out, true);
%>
            </select>&nbsp;
		  </td>
		  <td class="sea_top" bgcolor="#EBE9DC">
          	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국
          </td>
          <td class="sea_top" bgcolor="#EBE9DC">
			<input name="bonm" type="text" size="12" class="text_box" value="" style="ime-mode:active;" onkeydown="bo_enter_search();">
			<input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" style="cursor:hand" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--지국검색팝업-->
			<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
          </td>
          <td bgcolor="#EBE9DC" class="sea_top" width="40">
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">경로</td>
          <td colspan="3" bgcolor="#EBE9DC" class="sea_top" align="left">
			<select name="acpnpathcd" size="1" class="sel_all">
                <option value="" selected>전체</option>
                <%= ds.acpnpathcdOptHtml("") %>                              <!-- 신청경로코드, 코드명 목록 -->
          </td>

          <td bgcolor="#EBE9DC" rowspan="2" width="52" align="right" class="sea_top">
            <input type="image" id="search_id" border="0" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;">
          </td>
        </tr>
        <tr>
          <td bgcolor="#EBE9DC" width="40"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간</td>
          <td width="236" bgcolor="#EBE9DC">
            <select name="fromtogb" size="1" onChange="" class="sel_all">
              <option value="">선택</option>
              <option value="1">등록일자</option>
              <option value="2" selected>접수일자</option>
              <option value="3">처리일자</option>
            </select>
            <input name="frdt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="기간" dataType="date">
            -
            <input name="todt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="기간" dataType="date">
          </td>
          <td bgcolor="#EBE9DC" width="40">
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">유형</td>
          <td width="140" bgcolor="#EBE9DC">
            <select name="dscttypecd" onChange="" class="sel_all"> <!-- 구독불편유형 코드,코드명 목록-->
              <option value="" selected>전체</option>
              <%= ds.dscttypecdOptHtml("")%>
            </select>
          </td>

          <td width="49" bgcolor="#EBE9DC"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">확인</td>
          <td width="80" bgcolor="#EBE9DC">
            <select name="bocnfmyn" onChange="" class="sel_all">
			  <option value="" selected>전체</option>
              <option value="Y">확인</option>
              <option value="N">미확인</option>
            </select>
          </td>
          <td width="47" bgcolor="#EBE9DC"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">처리</td>
          <td width="83" bgcolor="#EBE9DC">
            <select name="boprocyn" onChange="" class="sel_all">
			  <option value="" selected>전체</option>
              <option value="Y">처리</option>
              <option value="N">미처리</option>
            </select>
          </td>
        </tr>

        <tr>
          <td colspan="8" bgcolor="#EBE9DC">
          	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">독자명
            <input name="rdrnm" type="text" size="10"  style="ime-mode:active;" class="text_box" value="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">독자번호
            <input name="rdr_no" type="text" size="10"  style="ime-mode:active;" class="text_box" value="">&nbsp;&nbsp;&nbsp;
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">제목&nbsp;
            <input name="titl" type="text" size="22"  style="ime-mode:active;" class="text_box" value="">&nbsp;
          	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">내용&nbsp;&nbsp;&nbsp;&nbsp;
            <input name="cont" type="text" size="24"  style="ime-mode:active;" class="text_box" value="">
        </tr>


        <tr bgcolor="#927F5B">
          <td colspan="10" hight="1"><!--line--></td>
        </tr>
		   <tr>
          <td colspan="10" height="3"><!--여백--></td>
        </tr>
      </form>
      </table>
      <!--독자불편접수 검색 끝-->
      <!--독자불편접수 목록 시작-->
		<table cellpadding="0" cellspacing="0" id="rdr_dsct_list_id">
		<tr><td>
		<table width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff">

		  <tr bgcolor="#DDDDDD" height="23">
		    <td class="gray" align="center" width="68">독자명</td>
		    <td class="gray" align="center" width="68">접수일자</td>
		    <td class="gray" align="center" width="65">유형</td>
		    <td class="gray" align="center">제목</td>
		    <td class="gray" align="center" width="100">접수자/처리자</td>
		    <td class="gray" align="center" width="55">지역</td>
		    <td class="gray" align="center" width="68">지국</td>
		    <td class="gray" align="center" width="50">지국확인</td>
		    <td class="gray" align="center" width="55">경로</td>
		    <td class="gray" align="center" width="68">처리일자</td>
		  </tr>
        <%-- 초기화면 목록 반복 시작 --%>
        <%for(int i=0; i<moveListCount; i++){%>
		  <tr>
		    <td class="gray" width="68" align="center">&nbsp;</td>
		    <td class="gray" width="68" align="center">&nbsp;</td>
		    <td class="gray" width="65" align="center">&nbsp;</td>
		    <td class="gray">&nbsp;</td>
		    <td class="gray" width="100" align="center">&nbsp;</td>
		    <td class="gray" width="55" align="center">&nbsp;</td>
		    <td class="gray" width="68" align="center">&nbsp;</td>
		    <td class="gray" width="50" align="center">&nbsp;</td>
		    <td class="gray" width="55" align="center">&nbsp;</td>
		    <td class="gray" width="68" align="center">&nbsp;</td>
		  </tr>

        <%}%>
        <%-- 초기화면 목록 반복 끝 --%>

        <tr bgcolor="#dddddd" align="right">
            <td  height="23" class="gray" colspan="10">
                <img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
            </td>
        </tr>
		</table>
		<!---button-->
		<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
        <tr>
            <td align="center" height="2" colspan="10">
            <!--여백-->
            </td>
        </tr>
        <tr>
            <td align="center" height="24" bgcolor="#E8E8E8" colspan="10">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
            <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                <jsp:param name = "pageno" 		value="0"/>
                <jsp:param name = "totalcnt" 	value="0"/>
                <jsp:param name = "js_fn_nm" 	value="page_move"/>
                <jsp:param name = "pagesize" 	value="<%= moveListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    </td></tr>
    </table>
    <!-- 페이지 이동 -->
    <!-- 독자불편 목록 끝 -------------------------------------------------------------------------->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!--여백-->
    </td>
  </tr>
  <tr>
    <td>

    <!--독자불편 상세 시작 -------------------------------------------------------------------------->
	<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center" id="rdr_dsct_detail_id">
		<tr>
			<td  height="25" bgcolor="#EBE9DC" class="title" width="700">독자불편 상세( <font color="red"> 등록시 매체를 먼저 선택하세요. 독자명 검색은 출판매체에 대해 처리합니다. </font> )</td>
			<td align="right"  bgcolor="#EBE9DC" height="25" class="title">
				<input type="image" src="/html/comm_img/bu_new.gif" width="39" height="19" align="absmiddle" border="0" onclick="add()" border="0">
				<input type="image" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" onclick="save()" border="0">
				<input type="image" src="/html/comm_img/bu_del.gif" width="39" height="19" align="absmiddle" border="0" onclick="del()" border="0">
			</td>
		</tr>
		<tr>
			<td height="3"></td>
		</tr>
	</table>

	<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF">
	<form name="rdr_dsct_detail_form" method="post" action="" >
		<input name="jobflag" type="hidden" value="D">	<!--불편업무-->
		<input name="accflag" type="hidden" value="I">
		<input name="bocd" type="hidden" value="">
		<input name="dt" type="hidden" value="">		<!--등록일자-->
		<input name="no" type="hidden" value="">		<!--등록번호-->
		<input name="cnscnfmyn" type="hidden" value=""><!--상담원확인여부-->
		<input name="rdr_no" type="hidden" value="">	<!--독자번호(출판독자 검색시 사용)-->
		<input name="aplcperstel_no1" type="hidden" value="">	<!--정기구독번호(출판독자 검색시 사용)-->

		<input name="pageno" type="hidden" value =""><!--검색폼의 페이지번호-->

		<!--불편일반 시작-->
		<tr>
			<td width="110" class="gray" bgcolor="#EBE9DC">불편일반</td>
			<td width="100" class="gray" bgcolor="#dddddd">신청경로</td>
			<td	width="140" class="gray" id="path_id">&nbsp;TM</td>
			<td width="100" class="gray" bgcolor="#dddddd">접수일시</td>
			<td width="380" class="gray" colspan="3" id="acpndt_id">&nbsp;</td>
		</tr>
		<!--불편일반 끝-->
		<!--독자정보 시작-->
		<tr>
			<td rowspan="4" width="110" class="gray" bgcolor="#EBE9DC">독자정보</td>
			<td width="100" class="gray" bgcolor="#dddddd">독자명<font color="red">*</font></td>
			<td width="140" class="gray">
	        	<input name="rdrnm" type="text" size="10" style="ime-mode:active;" class="text_box" notEmpty caption="독자명" onkeydown="pb_rdr_enter_search('1');">&nbsp;
			</td>
			<td width="100" class="gray" bgcolor="#dddddd">전화번호</td>
			<td width="140" class="gray">
				<input name="rdrtel_no1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrtel_no2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrtel_no3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">
			</td>
	        <td width="100" class="gray" bgcolor="#dddddd"> 매체<font color="red">*</font></td>
	        <td width="140" class="gray">
				<select name="medicd" class="sel_all">
					<option value="">선택</option>
					<option value="110" selected>조선일보</option>
					<option value="111">대입수능교실</option>
					<option value="116">맛있는한자</option><%--20050307 김대섭 추가 --%>
					<option value="117">19단표</option><%--20050315 김대섭 추가 --%>
					<option value="120">수능합본호</option>
					<option value="130">소년조선</option>
					<option value="210">주간조선</option>
					<option value="220">월간조선</option>
					<option value="230">월간산</option>
					<option value="240">월간낚시</option>
					<option value="270">여성조선</option>
					<option value="420">TEPS</option>
					<option value="421">W.Village</option>
					<option value="422">ENNOBLE</option>
					<option value="424">징기스칸</option>
					<option value="610">스포츠조선</option>
					<option value="11J">생각놀이4~5세</option>
					<option value="11K">생각놀이6~7세</option>
				</select>
			</td>
		</tr>
		<tr>
			<td width="100" class="gray" bgcolor="#dddddd">휴대폰번호</td>
			<td width="140" class="gray">
	        	<input name="rdrptph_no1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrptph_no2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrptph_no3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">
			</td>
			<td width="100" class="gray" bgcolor="#dddddd">이메일</td>
			<td width="380" class="gray" colspan="3">
	        	<input name="rdremail" type="text" size="50" style="ime-mode:active;" class="text_box">&nbsp;
			</td>
		</tr>
		<tr>
			<td width="100" class="gray" bgcolor="#dddddd">주소<font color="red">*</font></td>
			<td width="620" colspan="5" class="gray">
				<input name="dlvzip" type="text" size="8"  class="text_box" caption="우편번호" onkeydown="zip_enter_search(1);">
				<input type="image" src="/html/comm_img/bu_search03.gif" width="39" height="19" align="absmiddle" style="cursor:hand;" onclick="zip_search();window.event.returnValue=false;">
				<input name="dlvaddr" type="text" size="40" class="text_box" readonly>
				<input name="dlvdtlsaddr" type="text" size="40" class="text_box" style="ime-mode:active;">
			</td>
		</tr>
		<tr>
			<td width="100" class="gray" bgcolor="#dddddd">지국명<font color="red">*</font></td>
			<td width="140" class="gray">
	        	<input name="bonm" type="text" size="10" style="ime-mode:active;" class="text_box" readOnly>&nbsp;
			</td>
			<td width="100" class="gray" bgcolor="#dddddd">지국전화번호</td>
			<td width="380" class="gray" colspan="3">
				<input name="telno1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box" readOnly>-
				<input name="telno2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box" readOnly>-
				<input name="telno3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box" readOnly>
			</td>
		</tr>
		<!--독자정보 끝-->

		<!--불편내용 시작-->
		<tr>
			<td width="110" class="gray" bgcolor="#EBE9DC" rowspan="5">불편내용</td>
			<td width="100" class="gray" bgcolor="#dddddd">유형<font color="red">*</font></td>
			<td width="140" class="gray">
				<select name="dscttypecd" class="sel_all">
                  <option value="" selected>전체</option>
                  <%= ds.dscttypecdOptHtml("")%>
                </select>
<%--     			<option value="" selected>선택</option>
					<option value="10">불착</option>
					<option value="20">구독중지</option>
					<option value="30">투입지거절</option>
					<option value="35">자동이체</option>
					<option value="40">항의</option>
	              	<option value="45">기타(구독)</option>
					<option value="50">제보</option>
					<option value="60">의견</option>
					<option value="70">제언</option>
					<option value="80">오류지적</option>
					<option value="90">항의</option>
	              	<option value="95">기타(기사)</option>
--%>
			</td>
			<td width="100" class="gray" bgcolor="#dddddd">제목<font color="red">*</font></td>
			<td width="380" class="gray" colspan="3">
	        	<input name="titl" type="text" size="60" style="ime-mode:active;" class="text_box">&nbsp;
			</td>
		</tr>
		<tr>
			<td width="100" class="gray" bgcolor="#dddddd">내용<font color="red">*</font></td>
			<td width="620" class="gray" colspan="5" align="center">
				<textarea name="cont" style="ime-mode:active;" rows="7" cols="87" class="scroll1"></textarea>
			</td>
		</tr>
		<!--불편내용 끝-->

		<!--처리사항 시작-->
		<tr>
<!--			<td rowspan="2" width="110" class="gray" bgcolor="#EBE9DC">처리사항</td>-->
			<td width="100" class="gray" bgcolor="#dddddd">처리여부</td>
			<td width="140" class="gray" id="boprocyn_id">&nbsp;</td>
			<td width="100" class="gray" bgcolor="#dddddd">처리일시</td>
			<td width="380" class="gray" colspan="3" id="boprocdt_id">&nbsp;</td>
		</tr>
		<tr>
			<td width="100" class="gray" bgcolor="#dddddd">처리내용</td>
			<td width="620" class="gray" colspan="5">
				<textarea name="boproccont" style="ime-mode:active;" rows="7" cols="87" class="scroll1"></textarea>
			</td>
		</tr>
		<tr>
			<td width="100" height="25" class="gray" bgcolor="#dddddd">처리결과</td>
			<td width="620" class="gray" colspan="5">&nbsp;처리소요시간&nbsp;
              <select name="bo_procreqitm" class="sel_all" style="width:162;">
					<option value="" selected>선택</option>
					<option value="10">30분 이내</option>
					<option value="20">30분 ~ 1시간 이내</option>
					<option value="30">1시간 이상</option>
              </select>
              &nbsp;&nbsp;&nbsp;해피콜실시&nbsp;
              <select name="bo_cnfmtel" class="sel_all" style="width:55;">
					<option value="" selected>선택</option>
					<option value="Y">Y</option>
					<option value="N">N</option>
              </select>
              <input type="hidden" name="hdn_bo_procreqitm" value="">
              <input type="hidden" name="hdn_bo_cnfmtel" value="">
			</td>
		</tr>
		<!--처리사항 끝-->

		<!--상담원 시작-->
		<tr>
			<td rowspan="3" width="110" class="gray" bgcolor="#EBE9DC">상담원</td>
			<td width="100" class="gray" bgcolor="#dddddd">이름</td>
			<td width="140" class="gray" id="cns_empnm_id"><%= Util.getSessionParameterValue(request, "emp_nm", false)%>&nbsp;</td>
			<td width="100" class="gray" bgcolor="#dddddd">확인여부</td>
			<td width="140" class="gray">
	        	<input type="checkbox" name="cnscnfmyn_chk">&nbsp;
			</td>
			<td width="100" class="gray" bgcolor="#dddddd">일시</td>
			<td width="140" class="gray" id="cnscnfmtm_id">&nbsp;</td>
		</tr>
		<tr>
			<td width="100" class="gray" bgcolor="#dddddd">비고</td>
			<td colspan="5" class="gray">
				<textarea name="remk" style="ime-mode:active;" rows="7" cols="87" class="scroll1"></textarea>
			</td>
		</tr>
		<tr>
			<td width="100" height="28" class="gray" bgcolor="#dddddd">처리결과</td>
			<td width="620" class="gray" colspan="5">&nbsp;처리소요시간&nbsp;
              <select name="cns_procreqitm" class="sel_all" style="width:162;">
					<option value="" selected>선택</option>
					<option value="10">30분 이내</option>
					<option value="20">30분 ~ 1시간 이내</option>
					<option value="30">1시간 이상</option>
              </select>
              &nbsp;&nbsp;&nbsp;해피콜실시&nbsp;
              <select name="cns_cnfmtel" class="sel_all" style="width:55;">
					<option value="" selected>선택</option>
					<option value="Y">Y</option>
					<option value="N">N</option>
              </select>
			</td>
		</tr>
		<!--상담원 끝-->

	</form>
	</table>

    <!--독자불편 상세 끝 -------------------------------------------------------------------------->
    </td>
  </tr>
</table>
<br><br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
