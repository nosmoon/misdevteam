<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1010_a.jsp
* 기능 : 독자현황-독자정보-독자이력 초기화면
* 작성일자 : 2003-12-27
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
    int rdrhstyListCount = 5;	// 한 화면당 리스트 항목 수
	int hstyListCount = 5;		// 한 화면당 리스트 항목 수(이력 목록)
    int subsHstyListCount = 5;	// 한 화면당 리스트 항목 수
    applySession = true;		// 세션 적용 여부
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--

// 페이지 초기화
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
}


// form 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}


// 지역 검색
function area_search(){

    var lo_form1 = document.rdrhsty_search_form;
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

// 지국찾기 팝업
function bo_search(){
    var lo_form1 = document.rdrhsty_search_form;
    var	deptcd = lo_form1.deptcd.value;
    var areacd = lo_form1.areacd.value;
    var bonm   = lo_form1.bonm.value;

	var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");
    var la_str;

    if(ls_return.indexOf("\n") != -1){
        la_str = ls_return.split("\n");
        lo_form1.bocd.value = la_str[0];
        lo_form1.bonm.value = la_str[1];
        lo_form1.deptcd.value = la_str[2];

        lo_form1.areacd.outerHTML =
        		'<select name="areacd" size="1" id="areacd_id" class="sel_all">' +
        		'<option value="' +
        		la_str[4] +
        		'" selected>' +
        		la_str[5] +
        		'</option>';
    }
	return;
}

// 엔터키에 의한 지국찾기
function bo_enter_search(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    var lo_form1 = document.rdrhsty_search_form;

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
		var lo_form2 = document.rdrhsty_search_form;
		
		lo_form2.deptcd.value = lo_form1.deptcd.value;
        lo_form2.areacd.outerHTML =
        		'<select name="areacd" size="1" id="areacd_id" class="sel_all">' +
        		'<option value="' +
        		lo_form1.areacd.value +
        		'" selected>' +
        		lo_form1.areanm.value +
        		'</option>';
		lo_form2.bocd.value = lo_form1.bocd.value;
		lo_form2.bonm.value = lo_form1.bonm.value;
	// 검색결과가 없거나 여러건이므로 지국찾기 팝업을 띄운다.
	}else if(no == '2'){
		bo_search();
	}
}

// 목록보기
function rdrhsty_list_search(){
    var lo_form1 = document.rdrhsty_search_form;

    // 독자번호, 이름 중 하나는 검색항목으로 입력되어야 한다.
    if(    (lo_form1.rdr_no.value 		== '')
    	&& (lo_form1.rdrnm.value 		== '') ){
    	alert("독자번호, 이름 중 적어도 하나는 입력해야 합니다.");
		return;
    }

	// 독자번호항목 9자리 검사
	if( (lo_form1.rdr_no.value != '') && (lo_form1.rdr_no.value.length != 9)){
		alert("독자번호는 9자리입니다.");
		return;
	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';

	// 검색 항목 정보를 /ss/reader/1015 서블릿으로 보낸다.
    lo_form1.action = "/ss/reader/1015";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기
function rdrhsty_detail_view(bocd, rdr_no){
    var lo_form1 = document.rdrhsty_list_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 지국지사코드, 독자번호를 "/ss/reader/1020" 서블릿으로 보낸다
	lo_form1.bocd.value = bocd;
    lo_form1.rdr_no.value = rdr_no;
    lo_form1.action = "/ss/reader/1020";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 구독 상세 보기
function subs_detail_view(medicd){
    var lo_form1 = document.rdrhsty_list_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 지국지사코드, 독자번호, 매체코드를 "/ss/reader/1025" 서블릿으로 보낸다
    lo_form1.medicd.value = medicd;
    lo_form1.action = "/ss/reader/1025";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.rdrhsty_search_form;

    // 독자번호, 이름 중 하나는 검색항목으로 입력되어야 한다.
    if(    (lo_form1.rdr_no.value 		== '')
    	&& (lo_form1.rdrnm.value 		== '') ){
    	alert("독자번호, 이름 중 적어도 하나는 입력해야 합니다.");
		return;
    }

	// 독자번호항목 9자리 검사
	if( (lo_form1.rdr_no.value != '') && (lo_form1.rdr_no.value.length != 9)){
		alert("독자번호는 9자리입니다.");
		return;
	}

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    // 독자이력검색 조회조건을 "/ss/reader/1015" 서블릿으로 보낸다
    lo_form1.action = "/ss/reader/1015";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 구독이력 페이지 이동
function page_move_subs_hsty(pageno){
    var lo_form1 = document.hsty_list_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    // 구독이력 조회조건을 "/ss/reader/1030" 서블릿으로 보낸다
    lo_form1.action = "/ss/reader/1030";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 이사이력 페이지 이동
function page_move_clam_hsty(pageno){
    var lo_form1 = document.hsty_list_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    // 이사이력 조회조건을 "/ss/reader/1040" 서블릿으로 보낸다
    lo_form1.action = "/ss/reader/1040";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 휴독이력 페이지 이동
function page_move_stop_hsty(pageno){
    var lo_form1 = document.hsty_list_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    // 휴독이력 조회조건을 "/ss/reader/1045" 서블릿으로 보낸다
    lo_form1.action = "/ss/reader/1045";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 구독이력 조회
function subs_hsty_search(){
    var lo_form1 = document.hsty_search_form;					// 이력 검색 폼
    var lo_form2 = document.rdrhsty_list_form;                  // 이력 목록 폼
	
	// 목록폼에 지국지사코드,독자번호를 체크한다.
    if( lo_form2.bocd.value	== '' || lo_form2.rdr_no.value == '' ){
    	alert("독자조회 후 독자를 선택하세요.");
		return;
    }

    // 기간은 필수 입력항목이다.
    if( lo_form1.frdt.value	== '' || lo_form1.todt.value == '' ){
    	alert("기간을 입력하세요.");
		return;
    }
    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 지국지사코드, 독자번호, 매체코드를 "/ss/reader/1030" 서블릿으로 보낸다
	lo_form1.bocd.value = lo_form2.bocd.value;
    lo_form1.rdr_no.value = lo_form2.rdr_no.value;
    lo_form1.action = "/ss/reader/1030";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 수금이력 조회
// 별도의 페이지 이동 함수가 없다.
function clam_hsty_search(yymm){
    var lo_form1 = document.hsty_search_form;						// 이력 검색 폼
    var lo_form2 = document.rdrhsty_list_form;						// 이력 목록 폼

	// 목록폼에 지국지사코드,독자번호를 체크한다.
    if( lo_form2.bocd.value	== '' || lo_form2.rdr_no.value == '' ){
    	alert("독자조회 후 독자를 선택하세요.");
		return;
    }

    // 기준년월을 초기화한다.
	// 최초 수금이력 조회는 현재년월을 전달하지 않는다.
	// 수금이력 목록 조회 후 이전, 이후 조회는 현재년월을 수금이력 목록 폼에서 얻는다.
	if(yymm == 'prev'){				// 이전
		lo_form1.basiyymm.value = lo_form1.prevyymm.value
	}else if(yymm == 'next'){		// 이후
		lo_form1.basiyymm.value = lo_form1.nextyymm.value
	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 지국지사코드, 독자번호, 매체코드를 "/ss/reader/1035" 서블릿으로 보낸다
	lo_form1.bocd.value = lo_form2.bocd.value;
    lo_form1.rdr_no.value = lo_form2.rdr_no.value;
    lo_form1.action = "/ss/reader/1035";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 이사이력 조회
function movm_hsty_search(){
    var lo_form1 = document.hsty_search_form;						// 이력 검색 폼
    var lo_form2 = document.rdrhsty_list_form;						// 이력 목록 폼

	// 목록폼에 지국지사코드,독자번호를 체크한다.
    if( lo_form2.bocd.value	== '' || lo_form2.rdr_no.value == '' ){
    	alert("독자조회 후 독자를 선택하세요.");
		return;
    }

    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 지국지사코드, 독자번호, 매체코드를 "/ss/reader/1040" 서블릿으로 보낸다
	lo_form1.bocd.value = lo_form2.bocd.value;
    lo_form1.rdr_no.value = lo_form2.rdr_no.value;
    lo_form1.action = "/ss/reader/1040";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 휴독이력 조회
function stop_hsty_search(){
    var lo_form1 = document.hsty_search_form;						// 이력 검색 폼
    var lo_form2 = document.rdrhsty_list_form;						// 이력 목록 폼

	// 목록폼에 지국지사코드,독자번호를 체크한다.
    if( lo_form2.bocd.value	== '' || lo_form2.rdr_no.value == '' ){
    	alert("독자조회 후 독자를 선택하세요.");
		return;
    }

    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 지국지사코드, 독자번호, 매체코드를 "/ss/reader/1045" 서블릿으로 보낸다
	lo_form1.bocd.value = lo_form2.bocd.value;
    lo_form1.rdr_no.value = lo_form2.rdr_no.value;
    lo_form1.action = "/ss/reader/1045";
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
	for(i=1; i<lo_table.rows.length; i++){
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

    var lo_form1 = document.rdrhsty_search_form;
		
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

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="sea_top" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >독자현황
    &gt; </b> 독자정보 &gt; 독자이력 </td>
</tr>
<tr>
    <td height="10">
        <!--내용을 위한 여백-->
    </td>
</tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
    <tr>
        <td width="550" valign="top">

        <!--독자이력 검색 시작-->
        <table width="550" border="0" cellspacing="0" cellpadding="2">
        <form name="rdrhsty_search_form" method="post" action="" >
            <input name="pageno" type="hidden" value ="1">			        		<!-- 현재 페이지 번호 -->
            <input name="pagesize" type="hidden" value ="<%= rdrhstyListCount%>">	<!-- 한 화면당 리스트 항목 수 -->
            <input name="js_fn_nm" type="hidden" value ="page_move">
            <input name="common_deptcd" type="hidden" value ="">                   	<!-- 공통 부서코드 -->
            <input name="bocd" type="hidden" value ="">                    			<!-- 지국코드 -->
        	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->

            <tr bgcolor="#EBE9DC">
                <td width="67" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서</td>
                <td width="80" class="sea_top">
                    <select name="deptcd" onChange="area_search();" class="sel_all">
<%						 
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true);
%>					
                    </select>
                </td>
                <td bgcolor="#EBE9DC" width="55" class="sea_top"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역</td>
                <td width="85" class="sea_top">
                    <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--지역코드, 지역명 목록-->
<%
					writeAreaOpt(session, out, true);
%>                    
                    </select>
                </td>
                <td bgcolor="#EBE9DC" width="48" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국</td>
                <td width="130" class="sea_top">
                    <input name="bonm" type="text" size="8" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
                    <input type="image" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"><!--지국검색팝업-->
                    <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
                </td>
                <td bgcolor="#EBE9DC" rowspan="2" align="right" class="sea_top">
                    <input type="image" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="javascript:rdrhsty_list_search();window.event.returnValue=false;"><!--목록 조회-->
                </td>
            </tr>
            <tr bgcolor="#EBE9DC">
                <td width="67"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">독자번호</td>
                <td width="80"><input name="rdr_no" type="text" size="10" class="text_box"></td>
                <td bgcolor="#EBE9DC" width="55"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">독자명</td>
                <td colspan="3"><input name="rdrnm" type="text" size="10" class="text_box"></td>
            </tr>
            <tr bgcolor="#927F5B">
                <td colspan="7" hight="1">
                <!--line-->
                </td>
            </tr>
            <tr>
                <td colspan="7" height="3">
                <!--여백-->
                </td>
            </tr>
        </form>
        </table>
        <!--독자이력 검색 끝-->

      	<!--독자이력 목록 시작-->
        <table width="550"  cellpadding="0" cellspacing="0" class="gray" bgcolor="#ffffff" id="rdrhsty_list_id">
		<form name="rdrhsty_list_form" method="post" action="" >
		    <input name="bocd" type="hidden" value ="">									<!--지국지사코드-->
		    <input name="rdr_no" type="hidden" value ="">								<!--독자번호-->
		    <input name="medicd" type="hidden" value ="">								<!--매체코드-->

            <tr bgcolor="#DDDDDD">
                <td class="gray" align="center" width="50" height="24"> 지국</td>
                <td class="gray" align="center" width="70" height="24"> 독자번호</td>
                <td class="gray" align="center" width="60" height="24"> 독자명</td>
                <td class="gray" align="center" width="100" height="24"> 전화번호</td>
                <td class="gray" align="center" width="240" height="24"> 주소</td>
                <td class="gray" align="center" width="30" height="24" width="30" > 구독</td>
            </tr>

            <%-- 초기화면 목록 반복 시작 --%>
            <%for(int i=0; i<rdrhstyListCount; i++){%>
            <tr>
                <td class="gray" align="center" height="21">&nbsp;</td>
                <td class="gray" align="center" height="21">&nbsp;</td>
                <td class="gray" align="center" height="21">&nbsp;</td>
                <td class="gray" align="center" height="21">&nbsp;</td>
                <td class="gray" align="center" height="21">&nbsp;</td>
                <td class="gray" align="center" height="21" width="30">&nbsp;</td>
            </tr>
            <%}%>
            <%-- 초기화면 목록 반복 끝 --%>

            <tr bgcolor="#E8E8E8" align="right">
                <td  height="25" class="gray" colspan="6">
                    <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총건수 <b> 0 건</b>
                </td>
            </tr>
        </form>
      	<table>

        <!-- 페이지 이동 -->
        <table width="550" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
            <tr>
                <td align="center" height="2">
                <!--여백-->
                </td>
            </tr>
            <tr>
                <td align="center" height="24" bgcolor="#E8E8E8">
                <!--JSP PAGE START---------------------------------------------------------------------------------->
                <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                        <jsp:param name = "pageno" 	value="0"/>
                        <jsp:param name = "totalcnt" 	value="0"/>
                        <jsp:param name = "js_fn_nm" 	value="page_move"/>
                        <jsp:param name = "pagesize" 	value="<%= rdrhstyListCount%>"/>
                        <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
                </td>
            </tr>
        </table>
        <!-- 페이지 이동 -->

      	<!--독자이력 목록 끝-->

        </td>
        <td width="280" valign="top">

      	<!--독자이력 상세 시작-->
        <table width="280" border="0" cellspacing="0" cellpadding="0" bgcolor="#EBE9DC">
            <tr>
                <td class="title" height="23">독자 상세내역</td>
            </tr>
            <tr>
            <tr>
                <td colspan="7" height="3">
                <!--여백-->
                </td>
            </tr>
                <td bgcolor="#FFFFFF" valign="top">

                    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="gray" bgcolor="#FFFFFF"  id="rdr_detail_id">
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray"> 독자번호</td>
                            <td class="gray" width="70">&nbsp;</td>
                            <td class="gray" width="70" bgcolor="#DDDDDD">독자명</td>
                            <td class="gray" width="70">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> 전화번호</td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td class="gray" width="70" bgcolor="#DDDDDD">휴대폰번호</td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> 이메일</td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> 마일리지</td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> 우편번호</td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> 주소</td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> 주거형태</td>
                            <td class="gray" width="70">&nbsp;</td>
                            <td class="gray" width="70" bgcolor="#DDDDDD">주거구분</td>
                            <td class="gray" width="70">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> 평형</td>
                            <td class="gray" width="70">&nbsp;</td>
                            <td class="gray" width="70" bgcolor="#DDDDDD">투입장소</td>
                            <td class="gray" width="70">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70">구독일자 </td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                    </table>

                </td>
            </tr>
        </table>
        <!--독자이력 상세 끝-->
        </td>
	<tr>
        <td width="550" valign="top">
		<!--구독,수금,휴독,이사 이력 목록 시작-->
        <table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#EBE9DC">
            <tr>
                <td class="title" height="23" align="right">
				<!--구독,수금,휴독,이사 이력 검색 시작-->
				<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#EBE9DC" id="hsty_search_id">
				<form name="hsty_search_form" method="post" action="" >
                    <input name="pageno" type="hidden" value ="1">			        		<!-- 현재 페이지 번호 -->
                    <input name="pagesize" type="hidden" value ="<%= hstyListCount%>">		<!-- 한 화면당 리스트 항목 수 -->
                    <input name="bocd" type="hidden" value ="">								<!--지국지사코드-->
                    <input name="rdr_no" type="hidden" value ="">							<!--독자번호-->
					<!-- 수금 이력 hidden 파라미터 시작 -->
                    <input name="basiyymm" type="hidden" value ="">						<!-- 현재 기준년월 -->
                    <input name="prevyymm" type="hidden" value ="">							<!-- 이전 년월 -->
                    <input name="nextyymm" type="hidden" value ="">							<!-- 이후 년월 -->
					<!-- 수금 이력 hidden 파라미터 끝 -->
					<tr>
						<td height="2"></td>
					</tr>
					<tr>
						<td>
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간
                            <input name="frdt" type="text" size="10" class="text_box" dataType="date">
							-
							<input name="todt" type="text" size="10" class="text_box" dataType="date">
                            &nbsp;&nbsp;
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">매체
                            <select name="medicd" class="sel_all" id="hsty_search_medicd_id"><!--매체코드-->
                                <option>독자검색후 선택하세요.</option>
                            </select>
						</td>
					</tr>
					<tr>
						<td height="2"></td>
					</tr>
					<tr>
						<td>
                            <img src="/html/comm_img/bu_his01.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:subs_hsty_search()"><!--구독이력 조회-->
                            <img src="/html/comm_img/bu_his02.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:clam_hsty_search()"><!--수금이력 조회, 매개변수를 전달하지 않는다.-->
                            <img src="/html/comm_img/bu_his03.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:movm_hsty_search()"><!--이사이력 조회-->
                            <img src="/html/comm_img/bu_his04.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:stop_hsty_search()"><!--휴독이력 조회-->
                        </td>
					</tr>
					<tr>
						<td height="2"></td>
					</tr>
				</form>
				</table>
				<!--구독,수금,휴독,이사 이력 검색 끝-->
                </td>
            </tr>
                <td colspan="7" height="3">
                <!--여백-->
                </td>
            </tr>
                <td bgcolor="#FFFFFF" valign="top">
                    <table width="550"  cellpadding="0" cellspacing="0" bgcolor="#ffffff" class="gray" id="hsty_list_id">
						<tr bgcolor="#dddddd" align="center">
							<td width="200" class="gray" height="23"> 구독기간 </td>
							<td width="100" class="gray" height="23"> 지국명 </td>
							<td width="150" class="gray" height="23"> 매체명 </td>
							<td width="100" class="gray" height="23"> 확장유형 </td>
						</tr>
	                    
	        			<%-- 초기화면 목록 반복 시작 --%>
					    <%for(int i=0; i<subsHstyListCount; i++){%>
						<tr>
						    <td width="200" align="center" class="gray"> &nbsp; </td>
						    <td Width="100" class="gray"> &nbsp; </td>
						    <td width="150" class="gray"> &nbsp; </td>
						    <td width="100" class="gray"> &nbsp; </td>
						</tr>
						<%}%>
	        			<%-- 초기화면 목록 반복 끝 --%>
                    </table>

                    <!-- 페이지 이동 -->
                    <table width="550" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_hsty">
                        <tr>
                            <td align="center" height="2">
                            <!--여백-->
                            </td>
                        </tr>
                        <tr>
                            <td align="center" height="24" bgcolor="#E8E8E8">
                            <!--JSP PAGE START---------------------------------------------------------------------------------->
                            <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                                    <jsp:param name = "pageno" 	value="0"/>
                                    <jsp:param name = "totalcnt" 	value="0"/>
                                    <jsp:param name = "js_fn_nm" 	value="page_move"/>
                                    <jsp:param name = "pagesize" 	value="<%= hstyListCount%>"/>
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
		<!--구독,수금,휴독,이사 이력 목록 끝-->
        </td>
        <td>
      	<!--구독 상세 시작-->
        <table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#EBE9DC">
            <tr>
                <td class="title" height="23">구독 상세내역</td>
            </tr>
            <tr>
            <tr>
                <td colspan="7" height="3">
                <!--여백-->
                </td>
            </tr>
                <td bgcolor="#FFFFFF" valign="top">
                    <table width="280" border="0" cellpadding="0" cellspacing="0"  align="top" class="gray" id="subs_detail_id">
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">매체명</td>
                            <td bgcolor="#FFFFFF" class="gray" colspan="3">
                                <select name="select" class="sel_all">
                                	<option>독자검색후 선택하세요.</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">단가</td>
                            <td bgcolor="#FFFFFF" class="gray" align="right" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">유료부수</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray" align="right">부</td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">준유가부수</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray" align="right">부</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">무료부수</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray" align="right"> 부</td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">무료구분</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray" align="right">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">확장일자</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp; </td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">확장유형</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">확장자</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp; </td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">확장비용</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">구독일자</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">수금방법</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">유가월</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">분기</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">이전일자</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">판촉물</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        <!--구독 상세 끝-->
        </td>
    </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
