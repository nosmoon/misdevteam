<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1100_a.jsp
* 기능 : 관리자-마이그레이션-전환-초기화면
* 작성일자 : 2004-03-12
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");
    int migListCount = 5;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
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

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript" src="/html/comm_js/progress.js"></script>	<!--작업 모달을 위한 자바스크립트-->
<script language="JavaScript">
<!--
// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.mig_search_form.bonm.focus();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 지역 검색
function area_search(){
    var lo_form1 = document.mig_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>전체</option>" +
                  "</select>"
        document.all.areacd_id.outerHTML = str;
        return;
    }

    // 부서코드값을 "/ss/common/1100" 서블릿으로 보낸다
    lo_form1.action = "/ss/common/1100";
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 지국찾기 팝업
// 지국지사코드, 지국지사명이 팝업으로부터 넘어온다. 두 값의 구분자는 "\n"
function bo_search(){
    var lo_form1 = document.mig_search_form;
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

// 지국DB업로드 에러 확인
function showError(){

    var lo_form1 = document.mig_list_form;

    // 지국 검색 후 클릭 체크
    if(lo_form1.bocd.value == ''){
    	alert("지국 검색 후 클릭하세요");
    	return;
    }
    
    opt = ",toolbar=no,menubar=no,location=no,scrollbars=yes,status=no";
    var lo_win = window.open("about:blank;", "error_window", "left=0,top=0" + ",width=" + "700" + ",height=" + "500"  + opt );
    
    lo_win.focus();
    lo_form1.action = "/ss/admin/1113";
    lo_form1.target = "error_window";
    lo_form1.submit();
    	
}

// 엔터키에 의한 지국찾기
function bo_enter_search(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    var lo_form1 = document.mig_search_form;

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
		var lo_form2 = document.mig_search_form;
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

// 목록보기
function list_search(){
    var lo_form1 = document.mig_search_form;

    // 지국 검색 후 클릭 체크
    if(lo_form1.bocd.value == ''){
    	alert("지국 검색 후 클릭하세요");
    	return;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	// 목록 검색조건을 "/ss/admin/1105" 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1105";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 작업이력 목록보기
function hsty_search(){
    var lo_form1 = document.mig_hsty_form;
    var lo_form2 = document.mig_search_form;

	// 지국지사코드를 검색폼에서 가져온다.
	lo_form1.bocd.value = lo_form2.bocd.value;

    // 지국 검색 후 클릭 체크
    if(lo_form1.bocd.value == ''){
    	alert("지국 검색 후 클릭하세요");
    	return;
    }
    
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

    // 현재 선택된 목록 탭의 작업구분값에 따라 해당 서블릿으로 보낸다.
    if(lo_form1.workclsf.value == "BU"){
	    lo_form1.action = "/ss/admin/1130";
    }else if(lo_form1.workclsf.value == "LU"){
	    lo_form1.action = "/ss/admin/1135";
    }else if(lo_form1.workclsf.value == "BC"){
	    lo_form1.action = "/ss/admin/1140";
    }else if(lo_form1.workclsf.value == "LC"){
	    lo_form1.action = "/ss/admin/1145";
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 작업내력 목록보기
function ptcr_search(workno){
    var lo_form1 = document.mig_ptcr_form;
    var lo_form2 = document.mig_search_form;

	// 지국지사코드를 검색폼에서 가져온다.
	lo_form1.bocd.value = lo_form2.bocd.value;

    // 지국 검색 후 클릭 체크
    if(lo_form1.bocd.value == ''){
    	alert("지국 검색 후 클릭하세요");
    	return;
    }
	// 작업번호 설정
	lo_form1.workno.value = workno;

    // 이력 조회 후 클릭 체크
    if(lo_form1.bocd.value == '' || lo_form1.workclsf.value == ''){
    	alert("이력 조회 항목을 클릭하세요");
    	return;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

    // 현재 선택된 목록 탭의 작업구분값에 따라 해당 서블릿으로 보낸다.
    if(lo_form1.workclsf.value == "BU"){
	    lo_form1.action = "/ss/admin/1150";
    }else if(lo_form1.workclsf.value == "LU"){
	    lo_form1.action = "/ss/admin/1155";
    }else if(lo_form1.workclsf.value == "BC"){
	    lo_form1.action = "/ss/admin/1160";
    }else if(lo_form1.workclsf.value == "LC"){
	    lo_form1.action = "/ss/admin/1165";
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 지국 DB 업로드
function bo_db_upload(){
    var lo_form1 = document.mig_list_form;

    // 지국 검색 후 클릭 체크
    if(lo_form1.bocd.value == ''){
    	alert("지국 검색 후 클릭하세요");
    	return;
    }

    // 지국명 체크
    if(lo_form1.bonm.value == ''){
    	alert("지국명을 입력하세요.");
    	return;
    }

	lo_form1.accflag.value = 'BU';									// accflag 설정('BU':지국 DB 업로드, 'LU':빌링 DB 업로드, 'BC':지국 DB 전환, 'LC':빌링 DB 전환)
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	// 지국지사코드, 지국명을 "/ss/admin/1110" 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1110";
    lo_form1.target = "ifrm";
    lo_form1.submit();
	jsShowProgress();		// 작업 모달 보이기
}

/*
// 빌링 DB 업로드
function bill_db_upload(){
    var lo_form1 = document.mig_list_form;

    // 지국 검색 후 클릭 체크
    if(lo_form1.bocd.value == ''){
    	alert("지국 검색 후 클릭하세요");
    	return;
    }

	lo_form1.accflag.value = 'LU';									// accflag 설정('BU':지국 DB 업로드, 'LU':빌링 DB 업로드, 'BC':지국 DB 전환, 'LC':빌링 DB 전환)
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	// 지국지사코드, 지국명을 "/ss/admin/1115" 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1115";
    lo_form1.target = "ifrm";
    lo_form1.submit();
	jsShowProgress();		// 작업 모달 보이기
}
*/

// 지국 DB 전환
function bo_db_convert(){
    var lo_form1 = document.mig_list_form;

    // 지국 검색 후 클릭 체크
    if(lo_form1.bocd.value == ''){
    	alert("지국 검색 후 클릭하세요");
    	return;
    }

	lo_form1.accflag.value = 'BC';									// accflag 설정('BU':지국 DB 업로드, 'LU':빌링 DB 업로드, 'BC':지국 DB 전환, 'LC':빌링 DB 전환)
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	// 지국지사코드, 지국명을 "/ss/admin/1120" 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1120";
    lo_form1.target = "ifrm";
    lo_form1.submit();
	jsShowProgress();		// 작업 모달 보이기
}

/*
// 빌링 DB 전환
function bill_db_convert(){
    var lo_form1 = document.mig_list_form;

    // 지국 검색 후 클릭 체크
    if(lo_form1.bocd.value == ''){
    	alert("지국 검색 후 클릭하세요");
    	return;
    }

	lo_form1.accflag.value = 'LC';									// accflag 설정('BU':지국 DB 업로드, 'LU':빌링 DB 업로드, 'BC':지국 DB 전환, 'LC':빌링 DB 전환)
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	// 지국지사코드, 지국명을 "/ss/admin/1125" 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1125";
    lo_form1.target = "ifrm";
    lo_form1.submit();
	jsShowProgress();		// 작업 모달 보이기
}
*/

//tab 전체에 대한 display 설정
function set_on_off_tab(curr_tab_id, i_total_count){
    var ls_tab_id = "";
	for(var i=0; i<i_total_count; i++){
        ls_tab_id = "tab_" + i;

    	if(curr_tab_id == ls_tab_id){
        	set_tab(document.all(ls_tab_id), "on");
    	}else{
        	set_tab(document.all(ls_tab_id), "off");
        }
    }
}
//tab "ON/OFF"
function set_tab(o_this, s_on_off){
	var lo_cells = o_this.cells;
    var count = 1;
    for (i=0; i < o_this.rows.length; i++) {
        for (j=0; j < o_this.rows(i).cells.length; j++) {
            o_this.rows(i).cells(j).className = s_on_off + "_" + count++;
        }
    }
}

//탭 선택시 작업구분 설정
function set_workclsf(workclsf){
	var lo_form1 = document.mig_hsty_form;
	var lo_form2 = document.mig_ptcr_form;
	// 작업구분
	lo_form1.workclsf.value = workclsf;
	lo_form2.workclsf.value = workclsf;
}

// 페이지 이동(작업이력)
function page_move_hsty(pageno) {
    var lo_form1 = document.mig_hsty_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 현재 선택된 목록 탭의 작업구분값에 따라 해당 서블릿으로 보낸다.
    if(lo_form1.workclsf.value == "BU"){
	    lo_form1.action = "/ss/admin/1130";
    }else if(lo_form1.workclsf.value == "LU"){
	    lo_form1.action = "/ss/admin/1135";
    }else if(lo_form1.workclsf.value == "BC"){
	    lo_form1.action = "/ss/admin/1140";
    }else if(lo_form1.workclsf.value == "LC"){
	    lo_form1.action = "/ss/admin/1145";
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동(작업내력)
function page_move_ptcr(pageno) {
    var lo_form1 = document.mig_ptcr_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 현재 선택된 목록 탭의 작업구분값에 따라 해당 서블릿으로 보낸다.
    if(lo_form1.workclsf.value == "BU"){
	    lo_form1.action = "/ss/admin/1150";
    }else if(lo_form1.workclsf.value == "LU"){
	    lo_form1.action = "/ss/admin/1155";
    }else if(lo_form1.workclsf.value == "BC"){
	    lo_form1.action = "/ss/admin/1160";
    }else if(lo_form1.workclsf.value == "LC"){
	    lo_form1.action = "/ss/admin/1165";
    }
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

    var lo_form1 = document.mig_search_form;
		
	if(flag == '1'){			// 부서,지역,지국 초기화
		// 부서 초기화
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search();" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true); %>'
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
    var lo_form1 = document.mig_search_form;

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

//-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >관리자
		> </b>작업 &gt; 마이그레이션</td>
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

	<!--마이그레이션 검색 시작 ---------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
	<form name="mig_search_form" method="post" action="" >
		<input name="common_deptcd" type="hidden" value ="">                    	<!-- 공통 부서코드 -->
		<input name="bocd" type="hidden" value ="">                    				<!-- 지국코드 -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   	<!-- 세션 적용 여부 -->
		<tr>
			<td bgcolor="#EBE9DC" width="135" >
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서
	            <select name="deptcd" onChange="area_search('1');" class="sel_all">	<!-- 부서코드, 코드명 목록 -->
<%
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true);
%>
	            </select>
			</td>
			<td width="165" >
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역
	            <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--지역코드, 지역명 목록-->
<%
					writeAreaOpt(session, out, true);
%>
	            </select>
			</td>
			<td width="180">
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국
				<input name="bonm" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
            	<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;" border="0"><!--지국검색팝업-->
            	<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
            </td>
			</td>
			<td bgcolor="#EBE9DC" align="right">
				<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;" border="0" >
			</td>
		</tr>
	</form>
	</table>
	<!--마이그레이션 검색 끝 ---------------------------------------------------------------------------->

    </td>
  </tr>
  <tr>
    <td height="2">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
    <td height="10">

    <!--마이그레이션 목록 시작 ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="mig_list_id">
	<form name="mig_list_form" method="post" action="" >
		<input name="bocd" type="hidden" value ="">                    				<!-- 지국코드 -->
		<input name="bonm" type="hidden" value ="">                    				<!-- 지국명 -->
		<input name="accflag" type="hidden" value ="">                    			<!--accflag 설정('BU':지국 DB 업로드, 'LU':빌링 DB 업로드, 'BC':지국 DB 전환, 'LC':빌링 DB 전환)-->

		<tr bgcolor="#dddddd" align="center" height="23">
			<td class="gray" align="center"> 구분 </td>
			<td width="165" class="gray" align="center"> 시작일시 </td>
			<td width="165" class="gray" align="center"> 종료일시 </td>
			<td width="150" class="gray" align="center"> 작업상태 </td>
			<td width="200" class="gray" align="center"> 처리 </td>
		</tr>
		<tr height="23">
			<td class="gray" align="left"> &nbsp;지국DB업로드 </td>
			<td width="165" class="gray" align="center"> &nbsp; </td>
			<td width="165" class="gray" align="center"> &nbsp; </td>
			<td width="150" class="gray" align="center"> &nbsp; </td>
			<td width="200" class="gray" align="left">&nbsp;&nbsp;
				<input type="image" src="/html/comm_img/bu_bodbup.gif" width="96" height="19" align="absmiddle" onclick="javascript:bo_db_upload();window.event.returnValue=false;" border="0">
			</td>
		</tr>
<%--		
		<tr height="23">
			<td class="gray" align="left"> &nbsp;빌링DB업로드 </td>
			<td width="165" class="gray" align="center"> &nbsp; </td>
			<td width="165" class="gray" align="center"> &nbsp; </td>
			<td width="150" class="gray" align="center"> &nbsp; </td>
			<td width="200" class="gray" align="left">&nbsp;&nbsp;
				<input type="image" src="/html/comm_img/bu_billdbup.gif" width="96" height="19" align="absmiddle" onclick="javascript:bill_db_upload();window.event.returnValue=false;" border="0">
			</td>
		</tr>
--%>		
		<tr height="23">
			<td class="gray"align="left"> &nbsp;지국DB전환 </td>
			<td width="165" class="gray"align="center"> &nbsp; </td>
			<td width="165" class="gray"align="center"> &nbsp; </td>
			<td width="150" class="gray"align="center"> &nbsp; </td>
			<td width="200" class="gray"align="left">&nbsp;&nbsp;
				<input type="image" src="/html/comm_img/bu_bodbch.gif" width="84" height="19" align="absmiddle" onclick="javascript:bo_db_convert();window.event.returnValue=false;" border="0">
			</td>
		</tr>
<%--		
		<tr height="23">
			<td class="gray"align="left"> &nbsp;빌링DB전환 </td>
			<td width="165" class="gray"align="center"> &nbsp; </td>
			<td width="165" class="gray"align="center"> &nbsp; </td>
			<td width="150" class="gray"align="center"> &nbsp; </td>
			<td width="200" class="gray"align="left">&nbsp;&nbsp;
				<input type="image" src="/html/comm_img/bu_billdbch.gif" width="84" height="19" align="absmiddle" onclick="javascript:bill_db_convert();window.event.returnValue=false;" border="0">
			</td>
		</tr>
--%>		
	</form>
    </table>
    <!--마이그레이션 목록 끝 ---------------------------------------------------------------------------->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
    <td>

      <!--타이틀박스-->
      <table width="830" border="0"  cellpadding="1" cellspacing="0">
        <tr>
          <td  height="27" bgcolor="#EBE9DC" class="title">마이그레이션 이력</td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--여백-->
          </td>
        </tr>
      </table>

    </td>
  </tr>
  <tr>
    <td>

<%--
	<!-- 마이그레이션  이력 탭 구성 시작 -->
	<table width="830" border="0" cellspacing="0" cellpadding="0" align="left">
		<tr>
		<td width="100">

		<!--지국DB업로드 작업이력 텝 시작 -->
		<table id="tab_0" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_tab(this.id, 4);set_workclsf('BU');hsty_search();;window.event.returnValue=false;" style="cursor:hand">
			<tr>
				<td background="/html/comm_img/tb3_01.gif" width=5 height=3 ></td>
				<td background="/html/comm_img/tb3_02.gif" height=3 ></td>
				<td background="/html/comm_img/tb3_03.gif" width=5 height=3 ></td>
			</tr>
			<tr>
				<td background="/html/comm_img/tb3_04.gif" height="17" style width="5"></td>
				<td background="/html/comm_img/tb3_05.gif" height="17" align="center">지국DB업로드</td>
				<td background="/html/comm_img/tb3_06.gif" height="17" style width="5"></td>
			</tr>
		</table>
		<!--지국DB업로드 작업이력 텝 끝 -->

		</td>
		<td width="100">
		<!--빌링DB업로드 작업이력 텝 시작 -->
		<table id="tab_1" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_tab(this.id, 4);set_workclsf('LU');hsty_search();;window.event.returnValue=false;" style="cursor:hand">
			<tr>
				<td background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
				<td background="/html/comm_img/tb4_02.gif" height=3 ></td>
				<td background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
			</tr>
			<tr>
				<td background="/html/comm_img/tb4_04.gif" height="17" style width="5"></td>
				<td background="/html/comm_img/tb4_05.gif" height="17" align="center" >빌링DB업로드</td>
				<td background="/html/comm_img/tb4_06.gif" height="17" style width="5"></td>
			</tr>
		</table>
		<!--빌링DB업로드 작업이력 텝 끝 -->
		</td>
		<td width="100">

		<!--지국자료전환 작업이력 텝 시작 -->
		<table id="tab_2" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_tab(this.id, 4);set_workclsf('BC');hsty_search();;window.event.returnValue=false;" style="cursor:hand">
			<tr>
				<td background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
				<td background="/html/comm_img/tb4_02.gif" height=3 ></td>
				<td background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
			</tr>
			<tr>
				<td background="/html/comm_img/tb4_04.gif" height="17" style width="5"></td>
				<td background="/html/comm_img/tb4_05.gif" height="17" align="center">지국자료전환</td>
				<td background="/html/comm_img/tb4_06.gif" height="17" style width="5"></td>
			</tr>
		</table>
		<!--지국자료전환 작업이력 텝 끝 -->

		</td>
		<td width="100">

		<!--빌링자료전환 작업이력 텝 시작 -->
		<table id="tab_3" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_tab(this.id, 4);set_workclsf('LC');hsty_search();;window.event.returnValue=false;" style="cursor:hand">
			<tr>
				<td background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
				<td background="/html/comm_img/tb4_02.gif" height=3 ></td>
				<td background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
			</tr>
			<tr>
				<td background="/html/comm_img/tb4_04.gif" height="17" style width="5"></td>
				<td background="/html/comm_img/tb4_05.gif" height="17" align="center">빌링자료전환</td>
				<td background="/html/comm_img/tb4_06.gif" height="17" style width="5"></td>
			</tr>
		</table>
		<!--빌링자료전환 작업이력 텝 끝 -->

		</td>
		<td width="430">
		</td>
--%>		

	<!-- 마이그레이션  이력 탭 구성 시작 -->
	<table width="830" border="0" cellspacing="0" cellpadding="0" align="left">
		<tr>
		<td width="100">




		<!--지국DB업로드 작업이력 텝 시작 -->
		<table id="tab_0" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_tab(this.id, 2);set_workclsf('BU');hsty_search();;window.event.returnValue=false;" style="cursor:hand">
			<tr>
				<td background="/html/comm_img/tb3_01.gif" width=5 height=3 ></td>
				<td background="/html/comm_img/tb3_02.gif" height=3 ></td>
				<td background="/html/comm_img/tb3_03.gif" width=5 height=3 ></td>
			</tr>
			<tr>
				<td background="/html/comm_img/tb3_04.gif" height="17" style width="5"></td>
				<td background="/html/comm_img/tb3_05.gif" height="17" align="center">지국DB업로드</td>
				<td background="/html/comm_img/tb3_06.gif" height="17" style width="5"></td>
			</tr>
		</table>
		<!--지국DB업로드 작업이력 텝 끝 -->

		</td>
		<td width="100">

		<!--지국자료전환 작업이력 텝 시작 -->
		<table id="tab_1" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_tab(this.id, 2);set_workclsf('BC');hsty_search();;window.event.returnValue=false;" style="cursor:hand">
			<tr>
				<td background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
				<td background="/html/comm_img/tb4_02.gif" height=3 ></td>
				<td background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
			</tr>
			<tr>
				<td background="/html/comm_img/tb4_04.gif" height="17" style width="5"></td>
				<td background="/html/comm_img/tb4_05.gif" height="17" align="center">지국자료전환</td>
				<td background="/html/comm_img/tb4_06.gif" height="17" style width="5"></td>
			</tr>
		</table>
		<!--지국자료전환 작업이력 텝 끝 -->
		</td>

		<td width="610">
		</td>




		</tr>
	</table>
	<!-- 마이그레이션 이력 탭 구성 끝 -->

    </td>
  </tr>
  <tr>
    <td height="2">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
    <td>

	<!-- 마이그레이션 이력 목록 시작 -->
    <table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="mig_hsty_id">
		<tr bgcolor="#dddddd" align="center">
			<td width="120" height="23" class="gray"> 시작일시 </td>
			<td width="120" height="23" class="gray"> 종료일시 </td>
			<td height="23" class="gray"> 작업자 </td>
			<td width="500" height="23" class="gray"> 작업비고 </td>
		</tr>
        <%-- 초기화면 목록 반복 시작 --%>
	    <%for(int i=0; i<migListCount; i++){%>
	    <tr>
			<td width="120" height="23" class="gray"> &nbsp; </td>
			<td width="120" height="23" class="gray"> &nbsp; </td>
			<td height="23" class="gray"> &nbsp; </td>
			<td width="500" height="23" class="gray"> &nbsp; </td>
	    </tr>
	    <%}%>
        <%-- 초기화면 목록 반복 끝 --%>
		<tr bgcolor="#dddddd" height="23">
			<td colspan="4" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
			</td>
		</tr> 
    </table>
	<!-- 마이그레이션 이력 목록 끝 -->

    </td>
  </tr>
  <tr>
    <td height="2">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
    <td>


    <!-- 페이지 이동 -->
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_hsty">
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
                    <jsp:param name = "js_fn_nm" 	value="page_move_hsty"/>
                    <jsp:param name = "pagesize" 	value="<%= migListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- 페이지 이동 -->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
    <td>

      <!--타이틀박스-->
      <table width="830" border="0"  cellpadding="1" cellspacing="0">
        <tr>
          <td  height="27" bgcolor="#EBE9DC" class="title">마이그레이션 내역</td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--여백-->
          </td>
        </tr>
      </table>

    </td>
  </tr>
  <tr>
    <td>

	<!-- 마이그레이션 내역 목록 시작 -->
    <table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="mig_ptcr_id">
		<tr bgcolor="#dddddd" align="center" height="23">
			<td width="120" class="gray">시각(시작/종료)</td>
			<td width="140" class="gray">테이블(소스/타깃)</td>
			<td width="110" class="gray">데이터(추출/전환)</td>
			<td class="gray">에러(코드/메세지)</td>
		</tr>
        <%-- 초기화면 목록 반복 시작 --%>
	    <%for(int i=0; i<migListCount; i++){%>
		<tr align="center">
			<td width="120" class="gray">&nbsp;</td>
			<td width="140" class="gray">&nbsp;</td>
			<td width="110" class="gray">&nbsp;</td>
			<td rowspan="2" class="gray">&nbsp;</td>
		</tr>
		<tr align="center">
			<td width="120" class="gray">&nbsp;</td>
			<td width="140" class="gray">&nbsp;</td>
			<td width="110" class="gray">&nbsp;</td>
		</tr>
	    <%}%>
        <%-- 초기화면 목록 반복 끝 --%>
		<tr bgcolor="#dddddd" height="23">
			<td colspan="4" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
			</td>
		</tr>    
    </table>
	<!-- 마이그레이션 내역 목록 끝 -->

    </td>
  </tr>
  <tr>
    <td height="2">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
    <td>

    <!-- 페이지 이동 -->
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_ptcr">
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
                    <jsp:param name = "js_fn_nm" 	value="page_move_ptcr"/>
                    <jsp:param name = "pagesize" 	value="<%= migListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- 페이지 이동 -->


    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<form name="mig_hsty_form" method="post" action="" style="display:none;">
    <input name="pageno" type="hidden" value ="1">			                <!-- 현재 페이지 번호 -->
    <input name="pagesize" type="hidden" value ="<%= migListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
    <input name="js_fn_nm" type="hidden" value ="page_move_hsty">
	<input name="bocd" type="hidden" value ="">                    			<!-- 지국코드 -->
	<input name="workclsf" type="hidden" value ="">                    		<!-- 작업구분 -->
	<input name="workno" type="hidden" value ="">                    		<!-- 작업번호 -->
</form>

<form name="mig_ptcr_form" method="post" action="" style="display:none;">
    <input name="pageno" type="hidden" value ="1">			                <!-- 현재 페이지 번호 -->
    <input name="pagesize" type="hidden" value ="<%= migListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
    <input name="js_fn_nm" type="hidden" value ="page_move_ptcr">
	<input name="bocd" type="hidden" value ="">                    			<!-- 지국코드 -->
	<input name="workclsf" type="hidden" value ="">                    		<!-- 작업구분 -->
	<input name="workno" type="hidden" value ="">                    		<!-- 작업번호 -->
</form>

</body>
</html>
