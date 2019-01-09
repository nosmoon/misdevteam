<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1200_a.jsp
* 기능 : 지국Info-지국장정보-초기화면
* 작성일자 : 2004-02-02
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_L_BO_HEAD_INITDataSet ds = (SS_L_BO_HEAD_INITDataSet)request.getAttribute("ds");
    int moveListCount = 5;	// 한 화면당 리스트 항목 수(지국장 목록)
    int ideaListCount = 7;	// 한 화면당 리스트 항목 수(지국장 소견 목록)
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
	document.bo_head_search_form.bonm.focus();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 지국장 목록보기
function list_search(){
    var lo_form1 = document.bo_head_search_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

	// 조회조건을 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/brinfo/1210";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 소견 목록 보기
function list_search_idea(){
    var lo_form1 = document.bo_head_idea_search_form;

	// 주민번호 체크
	if(lo_form1.prn.value == ''){
        alert("지국장 목록에서 지국장을 선택하세요.");
        return;
	}
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

	// 조회조건을 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/brinfo/1240";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동(지국장 목록)
function page_move(pageno) {

    var lo_form1 = document.bo_head_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    // "/ss/brinfo/1210" 서블릿으로 보낸다
    lo_form1.action = "/ss/brinfo/1210";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동(지국장 소견 목록)
function page_move_idea(pageno) {

    var lo_form1 = document.bo_head_idea_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    // "/ss/brinfo/1240" 서블릿으로 보낸다
    lo_form1.action = "/ss/brinfo/1240";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 지역 검색
function area_search(){
    var lo_form1 = document.bo_head_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>전체</option>" +
                  "</select>"
        document.all.areacd_id.outerHTML = str;
        return;
    }

    // 부서(팀)코드값을 "/ss/common/1100" 서블릿으로 보낸다
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1100";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 지국찾기 팝업
function bo_search(){
    var lo_form1 = document.bo_head_search_form;
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

    var lo_form1 = document.bo_head_search_form;

    //지국명이 존재하지 않으면 지국검색팝업을 띄운다.
	if(lo_form1.bonm.value == ''){
		bo_search();
		return;
	}

    // 부서(팀)코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
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
		var lo_form2 = document.bo_head_search_form;
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

// 상세보기(지국장)
function detail_view(bocd,prn,bjjgseq,bjjuminno){
    var lo_form1 = document.bo_head_detail_form;

    //  "/ss/brinfo/1220" 서블릿으로 보낸다

    lo_form1.bocd.value = bocd;
    lo_form1.prn.value = prn;
    lo_form1.bjjgseq.value = bjjgseq;
    lo_form1.bjjuminno.value = bjjuminno;
    lo_form1.action = "/ss/brinfo/1220";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기(지국장 소견)
function detail_view_idea(prn, seq){
    var lo_form1 = document.bo_head_idea_detail_form;

    //  "/ss/brinfo/1220" 서블릿으로 보낸다

    lo_form1.prn.value = prn;
    lo_form1.seq.value = seq;
    lo_form1.action = "/ss/brinfo/1250";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 저장
function detail_save(){
    var lo_form1 = document.bo_head_detail_form;

    if(!check_all(lo_form1)) return;

    // "/ss/brinfo/1230" 서블릿으로 보낸다
    lo_form1.bocd.value = lo_form1.bocd.value;
    lo_form1.prn.value = lo_form1.prn.value;
    lo_form1.bjjgseq.value = lo_form1.bjjgseq.value;
    lo_form1.bjjuminno.value = lo_form1.bjjuminno.value;

    setFamilyInfo();

    lo_form1.action = "/ss/brinfo/1230";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 가족관계 iframe 의 값을 bo_head_detail_form에 상응하는 필드에 셋팅
function setFamilyInfo(){
    var lo_form1 = bo_headfaml_dtl.document.bo_headfaml_form;
    var lo_form2 = document.bo_head_detail_form;

    if(!check_all(lo_form1)) return;
    if(!check_all(lo_form2)) return;

    for(var i=0; i<lo_form1.flnm.length; i++){
    	lo_form2.flnm[i].value = lo_form1.flnm[i].value;
    	lo_form2.rshp[i].value = lo_form1.rshp[i].value;
    	lo_form2.bidt[i].value = lo_form1.bidt[i].value;
    }
}


// 지국장 소견 폼 추가
function add(){
	var lo_form1 = document.bo_head_idea_detail_form;
	// 소견 초기화
	lo_form1.idea1.outerHTML = '<textarea name="idea1" cols="45" rows="11" id="idea1_id"></textarea>';

	// 작업구분을 등록('I')로 세팅
	lo_form1.accflag.value = 'I';

	// 취소 버튼 비활성화
	document.all.cancel_id.disabled = true;
}

// 지국장 소견 폼 저장
function save(){
	var lo_form1 = document.bo_head_idea_detail_form;

    if(lo_form1.prn.value == '') {		// 주민번호 존재여부를 확인한다.
        alert("지국장 목록에서 지국장을 선택하세요.");
        return;
    }

	if(lo_form1.accflag.value == 'D'){								// 삭제시 예외발생하면 'U'로 변경한다.
		lo_form1.accflag.value = 'U';
	}

    if(lo_form1.accflag.value == 'I') {	        					// 신규입력일 때
        lo_form1.action = "/ss/brinfo/1260";
    } else if(lo_form1.accflag.value == 'U') {						// 수정저장일 때
        lo_form1.action = "/ss/brinfo/1270";
    } else {
      return;
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 지국장 소견 폼 삭제
function del(){
	var lo_form1 = document.bo_head_idea_detail_form;

    if(lo_form1.prn.value == '' || lo_form1.seq.value == '') {		// 주민번호, 순번 존재여부를 확인한다.
        alert("해당목록을 클릭 후 삭제하세요.");
        return;
    }

	var yesno = confirm("삭제하시겠습니까?");
	if(yesno){
	    lo_form1.accflag.value = 'D';								// 작업구분을 삭제('D')로 세팅
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/brinfo/1280";
	    lo_form1.submit();
	}
}

// 지국장 소견 폼 취소
function cancel(){
	var lo_form1 = document.bo_head_idea_detail_form;
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	lo_form1.reset();

	setEventHandler();												// 폼 재설정 후 이벤트핸들러 호출
    setEnterKeyEventHandler();                                      // 폼 재설정 후 이벤트핸들러 호출
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

    var lo_form1 = document.bo_head_search_form;
    var lo_form2 = document.bo_head_idea_search_form;

	if(flag == '1'){			// 부서(팀),지역,지국 초기화
		// 부서(팀) 초기화
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
		lo_form2.frdt.value = "";
		lo_form2.todt.value = "";
		lo_form2.frdt.focus();
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
    var lo_form1 = document.bo_head_search_form;

	if(lo_form1.bonm.value == ''){
		lo_form1.bocd.value = '';
		list_search();
	}else{
	    // 부서(팀)코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >지국Info
      &gt; </b> 지국장정보</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<!--검색 -->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="bo_head_search_form" method="post" action="">
	<input type="hidden" name="pageno" value ="1">							<!-- 현재 페이지 번호 -->
	<input type="hidden" name="pagesize" value ="<%= moveListCount%>">		<!-- 한 화면당 리스트 항목 수 -->
	<input type="hidden" name="js_fn_nm" value ="page_move">
	<input type="hidden" name="common_deptcd" value ="">                    <!-- 공통 부서(팀)코드 -->
	<input type="hidden" name="bocd" value ="">                         	<!-- 지국지사코드 -->
	<input type="hidden" name="prn" value ="">
	<input type="hidden" name="bjjgseq" value ="">
	<input type="hidden" name="bjjuminno" value ="">
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
  <tr>
    <td bgcolor="#EBE9DC" width="40" class="sea_top">
      <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">팀&nbsp;</td>
    <td bgcolor="#EBE9DC" width="80" class="sea_top">
	    <select name="deptcd" onChange="area_search();" class="sel_all">
<%
			writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
	    </select>
    </td>
    <td bgcolor="#EBE9DC" class="sea_top" width="40">
     <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle"> 지역</td>
    <td bgcolor="#EBE9DC" class="sea_top" width="100">
        <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--지역코드, 지역명 목록-->
<%
			writeAreaOpt(session, out, true);
%>
        </select>
    </td>
    <td bgcolor="#EBE9DC" class="sea_top" width="40">
      <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국
    </td>
    <td bgcolor="#EBE9DC" class="sea_top" width="160">
      <input name="bonm" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
      <input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--지국검색팝업-->
      <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서(팀),지역,지국 초기화-->
    </td>
	<td rowspan="2" bgcolor="#EBE9DC" class="sea_top" align="right">
      <input type="image" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"><!--목록 조회-->
    </td>
  </tr>
  <tr>
    <td bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">계약</td>
    <td bgcolor="#EBE9DC" width="80">
	  <select name="jmgystgb" class="sel_all">
	  	<option value="">전체</option>
	  	<%= ds.curjmgystgbOptHtml("") %>	<!--계약상태구분 목록-->
	  </select>
    </td>
    <td colspan="2" bgcolor="#EBE9DC" align="left" width="140">
      <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국장명
      <input name="bo_headnm" type="text" size="10" class="text_box">
    </td>
    <td colspan="2"bgcolor="#EBE9DC" align="left" width="200">
      <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">보증인명
      <input name="bjnm" type="text" size="10" class="text_box">
	</td>
  </tr>
  <tr bgcolor="#927F5B">
	<td colspan="7" height="1">
		<!--line -->
	</td>
  </tr>
  <tr>
    <td height="3" colspan="10">
      <!--여백-->
    </td>
  </tr>
</form>
</table>
<!--리스트 -->
<table width="830" border="0" cellspacing="0" align="center" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="bo_head_list_id">
	<tr align="center"  bgcolor="#dddddd" height="23">
		<td class="gray" width="60" bgcolor="#dddddd" height="23"> 팀&nbsp; </td>
		<td class="gray" width="60" bgcolor="#dddddd"> 지역 </td>
		<td class="gray" width="60" bgcolor="#dddddd"> 지국 </td>
		<td class="gray" width="65" bgcolor="#dddddd"> 지국장 </td>
		<td class="gray" width="55" bgcolor="#dddddd"> 구분 </td>
		<td class="gray" width="305"> 주소 </td>
		<td class="gray" width="80" bgcolor="#dddddd"> 지국 전화번호 </td>
		<td class="gray" width="80" bgcolor="#dddddd"> 지국장 휴대폰 </td>
		<td class="gray" width="65" bgcolor="#dddddd"> 보증인 </td>
	</tr>
     <%-- 초기화면 목록 반복 시작 --%>
    <%for(int j=0; j<moveListCount; j++){%>
	<tr>
		<td class="gray" width="60"> &nbsp; </td>
		<td class="gray" width="60"> &nbsp; </td>
		<td class="gray" width="60"> &nbsp; </td>
		<td class="gray" width="65"> &nbsp; </td>
		<td class="gray" width="55" align="center"> &nbsp; </td>
		<td class="gray" width="305"> &nbsp; </td>
		<td class="gray" width="80" align="center"> &nbsp; </td>
		<td class="gray" width="80" align="center"> &nbsp; </td>
		<td class="gray" width="65"> &nbsp; </td>
	</tr>
	<%}%>
    <%-- 초기화면 목록 반복 끝 --%>
	<tr align="right" height="23">
		<td colspan="10" bgcolor="#dddddd" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>총건수 건</b>
		</td>
	</tr>
</table>
<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
  <tr>
    <td align="center" height="2">
      <!--여백-->
    </td>
  </tr>
  <tr>
    <td align="center" height="24" bgcolor="#E8E8E8">
	    <!--JSP PAGE START---------------------------------------------------------------------------------->
	    <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
	    <jsp:param name = "pageno" 			value="0"/>
	    <jsp:param name = "totalcnt" 		value="0"/>
	    <jsp:param name = "js_fn_nm" 		value="page_move"/>
	    <jsp:param name = "pagesize" 		value="<%= moveListCount%>"/>
	    <jsp:param name = "page_set_gubun" 	value="0"/>
	    </jsp:include>
	    <!--JSP PAGE END------------------------------------------------------------------------------------>
    </td>
  </tr>
</table>
<!--list end-->
<br>
<!--지국장 상세정보 ---------------------------------------------------------------------------------------->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr>
    <td height="25" bgcolor="#EBE9DC" class="title" width="200">지국장 Profile</td>
    <td bgcolor="#EBE9DC" class="title" align="right">
		<input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:detail_save();">
	</td>
  <tr>
    <td height="3">
      <!--여백-->
    </td>
  </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
<form name="bo_head_detail_form" method="post" action="">
	<input type="hidden" name="bocd" value="">
	<input type="hidden" name="prn" value="">
	<input type="hidden" name="bjjgseq" value="">
	<input type="hidden" name="bjjuminno" value="">

	<!-- 가족 사항 목록 히든 폼 시작-->
	<input name="seq"  type="hidden" value="1">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="2">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="3">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="4">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="5">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="6">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="7">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="8">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >
	<!-- 가족 사항 목록 히든 폼 끝-->

  <tr valign="top">
    <td width="50%">
      <!--지국장 프로필 -->
      <table width="410"  border="0" cellspacing="0" class="gray" bgcolor="#FFFFFF" cellpadding="2" id="bohead_dtl1">
        <tr>
          <td  rowspan="6" class="gray" align="center" width="120">
            <!--지국장사진 100*125 style="border: #333333 1px solid;" 이미지가 없을경우 img_no.gif -->
            <img src="/html/comm_img/img_no.gif" width="100" height="125" style="border: #333333 1px solid;">
          </td>
          <td  bgcolor="#dddddd" class="gray">지국명</td>
          <td  class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td  bgcolor="#dddddd" class="gray">지국장명</td>
          <td  class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td  bgcolor="#dddddd" class="gray">계약일자</td>
          <td  class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td  bgcolor="#dddddd" class="gray">주민번호</td>
          <td  class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td  bgcolor="#dddddd" class="gray" width="100">최종학력</td>
          <td  class="gray">
	        <select name="lastschir" size="1" class="sel_all">  <!--최종학력 코드, 최종학력 목록-->
	            <option value='' selected>----------</option>
	        </select>
          </td>
        </tr>
        <tr>
          <td  bgcolor="#dddddd" class="gray" width="100">출생지</td>
          <td  class="gray">
	        <select name="nativ" size="1" class="sel_all">  <!--출생지 코드, 출생지 목록-->
	            <option value='' selected>----------</option>
	        </select>
          </td>
        </tr>
      </table>
    </td>
    <td align="right">
	<!--경력 title-->
	<table width="410" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF">
  <tr bgcolor="#dddddd">
    <td colspan="2" class="gray">경력 </td>
  </tr></table>
  <!--경력 title end-->
      <!-- iframe-->
      <iframe name="jgjangir_dtl" src="/html/brinfo/ss_brinfo_1221_l.htm" frameborder="0"  height="120" width="410" marginheight="0" marginwidth="0" scrolling="yes"></iframe>
	  <!-- 경력list iframe end-->
    </td>
  </tr>
  <tr>
    <td colspan="2" height="10">
      <!--여백 -->
    </td>
  </tr>
  <tr>
    <td valign="top">
      <!--가족관계 -->
      <table width="410" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF">
        <tr bgcolor="#dddddd">
          <td  colspan="3" class="gray">가족관계</td>
        </tr>
      </table>
 <!--가족관계 title end-->
      <!-- iframe-->
      <iframe name="bo_headfaml_dtl" src="/html/brinfo/ss_brinfo_1222_l.htm" frameborder="0"  height="115" width="410" marginheight="0" marginwidth="0" scrolling="yes"></iframe>
	  <!-- 가족관계list iframe end-->
    </td>
    <td align="right">
      <!--개인특성 -->
      <table width="410" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="bohead_dtl2">
        <tr>
          <td colspan="2" bgcolor="#dddddd" class="gray">개인특성</td>
        </tr>
        <tr>
          <td   bgcolor="#dddddd" width="100" class="gray">취미</td>
          <td width="310" class="gray" >
            <input name="hby" type="text" value="" size="20" class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">특기</td>
          <td width="310" class="gray" >
            <input name="spc" type="text" value="" size="20"  class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">종교</td>
          <td width="310" class="gray" >
            <input name="relg" type="text" value="" size="20"  class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">음주</td>
          <td width="310" class="gray" >
            <input name="drink" type="text" value="" size="20"  class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">흡연</td>
          <td width="310" class="gray" >
            <input name="smok" type="text" size="20"  class="text_box">
          </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td colspan="2" height="10">
      <!--여백 -->
    </td>
  </tr>
  <tr>
    <td valign="top"  colspan="2">

      <!--주소 및 연락처 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="adddrphone_dtl">
        <tr bgcolor="#dddddd">
          <td colspan="4" class="gray">주소 및 연락처</td>
        </tr>
        <tr>
          <td width="100" bgcolor="#dddddd" class="gray">우편번호</td>
          <td width="100" class="gray">&nbsp;</td>
          <td width="100" bgcolor="#dddddd" class="gray">주소</td>
          <td class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td width="100" bgcolor="#dddddd" class="gray">자택전화</td>
          <td width="100" class="gray">&nbsp;</td>
          <td width="100" bgcolor="#dddddd" class="gray">지국장 휴대폰</td>
          <td class="gray">&nbsp;</td>
        </tr>
      </table>

    </td>
  </tr>
  <tr>
    <td colspan="2" height="10">
      <!--여백 -->
    </td>
  </tr>
  <tr>
    <td valign="top"  colspan="2">


      <!--보증인정보 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="bjinfo_dtl">
        <tr bgcolor="#dddddd">
          <td colspan="4" class="gray">보증인 정보</td>
        </tr>
        <tr>
          <td width="100" bgcolor="#dddddd" class="gray">성명</td>
          <td width="315" class="gray">&nbsp;</td>
          <td width="100" bgcolor="#dddddd" class="gray">주민등록번호</td>
          <td class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">전화번호</td>
          <td colspan="3" class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">주소</td>
          <td colspan="3" class="gray">&nbsp; </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td colspan="2" height="10">
      <!--여백 -->
    </td>
  </tr>

</form>
</table>


<!--지국장 소견-->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
	<tr>
		<td  height="25" bgcolor="#EBE9DC" class="title">지국장 소견</td>
	</tr>
	<tr>
		<td height="3">
		<!--여백-->
		</td>
	</tr>
</table>

<!-- 지국장 소견 검색 시작-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="bo_head_idea_search_form" method="post" action="">
	<input type="hidden" name="pageno" value ="1">							<!-- 현재 페이지 번호 -->
	<input type="hidden" name="pagesize" value ="<%= ideaListCount%>">		<!-- 한 화면당 리스트 항목 수 -->
	<input type="hidden" name="js_fn_nm" value ="page_move_idea">
	<input type="hidden" name="prn" value ="">								<!--지국장 주민번호-->
	<tr>
		<td bgcolor="#EBE9DC" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">작성기간</td>
		<td bgcolor="#EBE9DC" width="200">
			<input name="frdt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="시작일자" dataType="date">
			-
			<input name="todt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="종료일자" dataType="date">
			<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--기간 초기화-->
		</td>
		<td bgcolor="#EBE9DC" align="left" width="400">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">작성자명
			<input name="bo_headnm" type="text" size="10">
		</td>
			<td height="25" bgcolor="#EBE9DC" align="right">
			<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search_idea();window.event.returnValue=false;">
		</td>
	</tr>
	<tr bgcolor="#927F5B">
		<td colspan="4" height="1">
		<!--line -->
		</td>
	</tr>
	<tr>
	<td height="3" colspan="4">
		<!--여백-->
		</td>
	</tr>
</form>
</table>
<!-- 지국장 소견 검색 끝-->

<!-- 지국장 소견 목록,등록(상세) 시작 -->
<table width="830" border="0" cellspacing="0" align="center" cellpadding="0" class="gray" bgcolor="#FFFFFF">
<tr>
    <td width="490" valign="top">

	<!--지국장 소견 목록 시작-->
	<table width="489" border="0"  cellpadding="1" cellspacing="0" id="bo_head_idea_list_id">
		<tr align="center"  bgcolor="#dddddd" height="23">
			<td class="gray" width="50" bgcolor="#dddddd" > 순번 </td>
			<td class="gray" width="100" bgcolor="#dddddd"> 작성자명 </td>
			<td class="gray" width="100" bgcolor="#dddddd"> 작성일자 </td>
			<td class="gray" bgcolor="#dddddd"> 소견 </td>
		</tr>
	<%-- 초기화면 목록 반복 시작 --%>
	<%for(int j=0; j<ideaListCount; j++){%>
	<tr>
		<td class="gray" width="50" height="23"> &nbsp; </td>
		<td class="gray" width="100"> &nbsp; </td>
		<td class="gray" width="100"> &nbsp; </td>
		<td class="gray"> &nbsp; </td>
	</tr>
	<%}%>
	<%-- 초기화면 목록 반복 끝 --%>
	<tr bgcolor="#dddddd">
		<td colspan="4" class="gray" height="23"  align="right">
			<img src="/html/comm_img/ic_arr06.gif" align="absmiddle" width="7" height="7"> <b> 총건수 건 </b>
		</td>
	</tr>
	</table>

	<!-- 지국장 소견 페이지 이동 -->
	<table width="490" border="0" cellspacing="0" cellpadding="1" class="title2" id="page_move_idea">
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
	                <jsp:param name = "js_fn_nm" 	value="page_move_idea"/>
	                <jsp:param name = "pagesize" 	value="<%= ideaListCount%>"/>
	                <jsp:param name = "page_set_gubun" 	value="0"/>
	            </jsp:include>
	            <!--JSP PAGE END------------------------------------------------------------------------------------>
	        </td>
	    </tr>
	</table>
	<!-- 지국장 소견 페이지 이동 -->

	</td>
    <td width="340" valign="top">
	    <table width="339" border="0"  cellpadding="1" cellspacing="0">
    	<form name="bo_head_idea_detail_form" method="post" action="">
    		<input type="hidden" name="accflag" value="I">	<!--등록(I), 수정(U), 삭제(D) 구분자-->
    		<input type="hidden" name="prn" value="">		<!--지국장 주민번호-->
    		<input type="hidden" name="seq" value="">		<!--순번-->

			<tr align="center"  bgcolor="#dddddd">
				<td class="gray" bgcolor="#dddddd" height="23"> 소견 등록/상세 </td>
			</tr>
	        <tr>
	            <td class="gray" height="180">
	                <textarea name="idea1" cols="45" rows="11" id="idea1_id"></textarea>
	            </td>
	        </tr>
		</form>
		</table>
	    <table width="340" border="0" cellspacing="0" cellpadding="0" class="title2" id="move_button_id">
	        <tr>
	            <td align="center" height="2">
	            <!--여백-->
	            </td>
	        </tr>
	        <tr>
	            <td align="center" height="24" bgcolor="#E8E8E8">
	                <input type="image" id="add_id" src="/html/comm_img/bu_new.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:add();">
	                <input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:save();">
	                <input type="image" id="del_id" src="/html/comm_img/bu_del.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:del();">
	                <!-- 취소 버튼 -->
	                <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" onclick="javascript:cancel();">
	            </td>
	        </tr>
	    </table>

	</td>
</tr>
</table>

<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
