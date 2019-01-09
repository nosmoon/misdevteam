<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1030_a.jsp
* 기능 : 관리자-우편번호-초기화면
* 작성일자 : 2004-03-09
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : 해당지국이 없는 경우 저장가능하도록
* 수정자 : 김대섭
* 수정일자 : 2005-05-09
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");
	String paramGbn = "##";	// 문자열 집합 구분자
    int zipListCount = 5;	// 한 화면당 리스트 항목 수(초기화면)
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
	document.zip_search_form.zip.focus();
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
    var lo_form1 = document.zip_search_form;
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

// 목록보기
function list_search(){
    var lo_form1 = document.zip_search_form;

/*
	// 우편번호 체크
	if(lo_form1.deptcd.value == '' && lo_form1.areacd.value == '' && lo_form1.bocd.value == '' && lo_form1.zip.value == '' && lo_form1.addr3.value == ''){
		alert("부서,지역,지국,우편번호,읍/면/동 중 적어도 하나을 입력하세요");
		return;
	}
*/
	// 우편번호 체크
	if(lo_form1.zip.value == '' && lo_form1.addr3.value == ''){
		alert("우편번호 또는 읍/면/동을 입력하세요");
		return;
	}
	
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

	if(lo_form1.zip.value != ''){
		lo_form1.zip1.value = lo_form1.zip.value.substring(0,3);			// 우편번호 구분
		lo_form1.zip2.value = lo_form1.zip.value.substring(3,6);
	}

	// 우편번호 목록 조회조건을 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1035";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.zip_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

	// 우편번호 체크
	if(lo_form1.zip.value == '' && lo_form1.addr3.value == ''){
		alert("우편번호 또는 읍/면/동을 입력하세요");
		return;
	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 목록 조회조건을 "/ss/admin/1035" 서블릿으로 보낸다
    lo_form1.action = "/ss/admin/1035";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기
function detail_view(zip1, zip2, zip3, addr1, addr2, addr3, largedlvplac){
    var lo_form1 = document.zip_list_form;

    // 우편번호1, 우편번호2, 우편번호3 "/ss/admin/1040" 서블릿으로 보낸다
    lo_form1.zip1.value = zip1;
    lo_form1.zip2.value = zip2;
    lo_form1.zip3.value = zip3;
    lo_form1.addr1.value = addr1;
    lo_form1.addr2.value = addr2;
    lo_form1.addr3.value = addr3;
    lo_form1.largedlvplac.value = largedlvplac;
    lo_form1.action = "/ss/admin/1040";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}


// 대표지국찾기 팝업(상세)
function bo_search_detail_rep(){
    var lo_form1 = document.zip_detail_form;
    var	deptcd = "";
    var areacd = "";

	var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":", "725","480");
    var la_str;

    if(ls_return.indexOf("\n") != -1){
        la_str = ls_return.split("\n");
        bocd = la_str[0];
        bonm = la_str[1];

		// 모든 지국명, 지국코드 설정
		if(!lo_form1.bocd.length){			// 한건
            lo_form1.bocd.value = bocd;
            lo_form1.bonm.value = bocd;
		}else{								// 여러건
	        for(var i=0; i<lo_form1.bocd.length; i++) {
	            lo_form1.bocd[i].value = bocd;
	            lo_form1.bonm[i].value = bonm;
			}
        }
    }
    
    //체크박스 전체선택
    check_all_chk(true);
}

// 지국찾기 팝업(상세)
function bo_search_detail(bocd_obj, bonm_obj){
    var lo_form1 = document.zip_detail_form;
    var	deptcd = "";
    var areacd = "";

	var bonm = bonm_obj.value;

	var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");
    var la_str;

    if(ls_return.indexOf("\n") != -1){
        la_str = ls_return.split("\n");
        bocd = la_str[0];
        bonm = la_str[1];

		// 지국명, 지국코드 설정
		bonm_obj.value = bonm;
		bocd_obj.value = bocd;
    }

}

// 지국찾기 팝업(검색)
// 지국지사코드, 지국지사명이 팝업으로부터 넘어온다. 두 값의 구분자는 "\n"
function bo_search(){
    var lo_form1 = document.zip_search_form;

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


// 검색/상세 폼 검색 구분 전역변수
var gs_no;

// 지국명을 위한 전역변수
var go_bonm_obj;
// 지국코드를 위한 전역변수
var go_bocd_obj;

// 엔터키에 의한 지국찾기(상세)
function bo_enter_search_detail(bocd_obj, bonm_obj){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

	// 전역변수에 검색/상세 구분값 설정
	gs_no = '2';

	// 지국명이 존재하지 않으면 팝업을 띄운다.
	if(bonm_obj.value == ''){
		bo_search_detail(bocd_obj, bonm_obj);
		return;
	}

	//전역변수에 검색후 설정할 지국명, 지국코드 객체변수를 저장한다.
	go_bonm_obj = bonm_obj;
	go_bocd_obj = bocd_obj;

	// 전역변수에 목록조회 설정 변경
	gs_request = 'N';

    var lo_form1 = document.bo_search_form;
    lo_form1.bonm.value = bonm_obj.value;

    // 지국명을  "/ss/common/1113" 서블릿으로 보낸다
    lo_form1.action = "/ss/common/1113";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 엔터키에 의한 지국찾기
function bo_enter_search(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    var lo_form1 = document.zip_search_form;

    //지국명이 존재하지 않으면 지국검색팝업을 띄운다.
	if(lo_form1.bonm.value == ''){
		bo_search();
		return;
	}

	// 전역변수에 검색/상세 구분값 설정
	gs_no = '1';

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
		// 검색 폼
		if(gs_no == '1'){
			var lo_form1 = ifrm.document.bo_detail_form;
			var lo_form2 = document.zip_search_form;
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

		// 상세 폼
		}else if(gs_no == '2'){
			var lo_form1 = ifrm.document.bo_detail_form;

			// 전역변수에 저장된 지국명, 지국코드 객체변수에 검색된 값을 설정한다.
			go_bonm_obj.value = lo_form1.bonm.value;
			go_bocd_obj.value = lo_form1.bocd.value;
		}
	// 검색결과가 없거나 여러건이므로 지국찾기 팝업을 띄운다.
	}else if(no == '2'){
		// 검색 폼
		if(gs_no == '1'){
			bo_search();
		// 상세 폼
		}else if(gs_no == '2'){
			bo_search_detail( go_bocd_obj,go_bonm_obj);
		}
	}
}

// 전체선택, 취소
function check_all_chk(bool){
    var lo_form1 = document.zip_detail_form;

    if(lo_form1.checkyn==null) {								// 선택된 건이 없는 경우
        return;
    } else if(lo_form1.checkyn.type=="checkbox") {				// 한건인 경우
        lo_form1.checkyn.checked = bool;
    } else {													// 여러건인 경우
        for(var i=0; i<lo_form1.checkyn.length; i++) {
            lo_form1.checkyn[i].checked = bool;
        }
    }
}

// 행 추가
function row_add(){
	var lo_form1 = document.zip_detail_form;
	var lo_table = document.all.zip_detail_list_id;


	var lo_last_row;		// 마지막 로우
	var lo_row;				// 추가 로우
	var lo_cell_idx;		// 셀 인덱스

    if(lo_form1.checkyn==null) {								// 선택된 건이 없는 경우
		return;
    }else{														// 여러건인 경우
        lo_last_row = lo_table.rows(lo_table.rows.length-2);	// 총건수 로우 제외
        lo_row = lo_table.insertRow(lo_table.rows.length-1);	// 총건수 로우 제외


        // 선택체크박스는 빈 항목을 등록한다.
		lo_row.insertCell(0);
		lo_row.cells[0].innerHTML = '<input name="checkyn" type="checkbox" value="" checked>';
		lo_row.cells[0].align = "center"
		lo_row.cells[0].className = "gray";

        // 주소1,주소2,주소3,대량배달처 정보는 마지막 로우로부터 추가된 로우로 복사한다.
		for (lo_cell_idx = 1; lo_cell_idx < 5; lo_cell_idx++){
			lo_row.insertCell(lo_cell_idx);
			lo_row.cells[lo_cell_idx].innerHTML = lo_last_row.cells[lo_cell_idx].innerHTML;
			lo_row.cells[lo_cell_idx].align = lo_last_row.cells[lo_cell_idx].align;
			lo_row.cells[lo_cell_idx].className = lo_last_row.cells[lo_cell_idx].className;
		}
        // 시작번지,끝번지,지국선택 입력항목은 빈 항목을 등록한다.

        // 시작번지
		lo_row.insertCell(5);

		lo_row.cells[5].innerHTML = '<input name="bgnn" type="text" value="" size="6" class="text_box">';
		lo_row.cells[5].align = "center"
		lo_row.cells[5].className = "gray";
        // 끝번지
		lo_row.insertCell(6);
		lo_row.cells[6].innerHTML = '<input name="endn" type="text" value="" size="6" class="text_box">';
		lo_row.cells[6].align = "center"
		lo_row.cells[6].className = "gray";
        // 지국선택
		lo_row.insertCell(7);
		lo_row.cells[7].innerHTML =
				'<input name="bocd" type="hidden" value="">' +
				'<input name="bonm" type="text" value=""  style="ime-mode:active;" size="12" class="text_box" onkeydown="bo_enter_search_detail(this.parentElement.children(0), this.parentElement.children(1));"> ' +
				'<input type="image" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:bo_search_detail(this.parentElement.children(0), this.parentElement.children(1));window.event.returnValue=false;">';
		lo_row.cells[7].align = "center"
		lo_row.cells[7].className = "gray";
    }
}

// 행 삭제
function row_del(){
    var lo_form1;
    var lo_table;
    var li_checkyn_len;

    lo_form1 = document.zip_detail_form;
    lo_table = document.all.zip_detail_list_id;	  				// parent frame의 테이블 객체를 변수에 할당.

    if(lo_form1.checkyn==null) {								// 선택된 건이 없는 경우
        return;
    } else if(lo_form1.checkyn.type=="checkbox") {				// 한건인 경우
    	if(lo_form1.checkyn.checked){
        	lo_table.deleteRow(1);
        }
    } else {	                                     			// 여러건인 경우

        li_checkyn_len = lo_form1.checkyn.length;				// checkbox의 개수
        for(var i=li_checkyn_len-1; i>=0; i--) {				// 선택항목 중 역순으로
            if(lo_form1.checkyn[i].checked) {
                lo_table.deleteRow(i+1);						// 제목 메뉴 항목 제외
            }
        }
    }
}

// 20050509 김대섭 수정
// 저장
function save(){
	var lo_form1 = document.zip_detail_form;

    if(!check_all(lo_form1)) return;							// 폼 유효성 체크


	if(lo_form1.checkyn == null){								// 체크박스가 없을 때
	}else if(lo_form1.checkyn.type == "checkbox"){				// 체크박스가 한개 일때
		if(lo_form1.checkyn.checked){
			lo_form1.addr1ary.value = lo_form1.addr1.value
			lo_form1.addr2ary.value = lo_form1.addr2.value
			lo_form1.addr3ary.value = lo_form1.addr3.value
			lo_form1.largedlvplacary.value = lo_form1.largedlvplac.value
			lo_form1.bgnnary.value = lo_form1.bgnn.value
			lo_form1.endnary.value = lo_form1.endn.value

			// 지국지사코드 체크
			if(lo_form1.bocd.value == ''){
		        alert("지국지사코드가 존재하지 않습니다.");
				return;
			}
			lo_form1.bocdary.value = lo_form1.bocd.value
        }else{
        	alert("선택항목이 존재하지 않습니다.");
        	return;
        }
	}else{														// 체크박스가 여러 개일때

	    var li_count = 0;		// 선택항목 갯수

	    // 우편번호 저장 정보를 문자열 집합으로 만든다.
		var ls_addr1ary = '';
		var ls_addr2ary = '';
		var ls_addr3ary = '';
		var ls_largedlvplacary = '';
		var ls_bgnnary = '';
		var ls_endnary = '';
		var ls_bocdary = '';

		// 선택항목 갯수 계산
	    for(var i=0; i<lo_form1.checkyn.length; i++) {
	        if(lo_form1.checkyn[i].checked){
	        	li_count++;
	        }
	    }

		if(li_count == 0){										// 선택항목이 존재하지 않으면
	        alert("선택항목이 존재하지 않습니다.");
			return;
		}else{													// 선택항목이 존재하면

		    for(var i=0; i<lo_form1.checkyn.length; i++) {
		        if(lo_form1.checkyn[i].checked){
					ls_addr1ary = ls_addr1ary + lo_form1.addr1[i].value + "<%= paramGbn%>";
					ls_addr2ary = ls_addr2ary + lo_form1.addr2[i].value + "<%= paramGbn%>";
					ls_addr3ary = ls_addr3ary + lo_form1.addr3[i].value + "<%= paramGbn%>";
					ls_largedlvplacary = ls_largedlvplacary + lo_form1.largedlvplac[i].value + "<%= paramGbn%>";
					ls_bgnnary = ls_bgnnary + lo_form1.bgnn[i].value + "<%= paramGbn%>";
					ls_endnary = ls_endnary + lo_form1.endn[i].value + "<%= paramGbn%>";

					// 지국지사코드 체크
					if(lo_form1.bocd[i].value == ''){
				        alert("지국지사코드가 존재하지 않습니다.");
						return;
					}

					ls_bocdary = ls_bocdary + lo_form1.bocd[i].value + "<%= paramGbn%>";
				}
		    }

			lo_form1.addr1ary.value = ls_addr1ary.substring(0, ls_addr1ary.length-2);
			lo_form1.addr2ary.value = ls_addr2ary.substring(0, ls_addr2ary.length-2);
			lo_form1.addr3ary.value = ls_addr3ary.substring(0, ls_addr3ary.length-2);
			lo_form1.largedlvplacary.value = ls_largedlvplacary.substring(0, ls_largedlvplacary.length-2);
			lo_form1.bgnnary.value = ls_bgnnary.substring(0, ls_bgnnary.length-2);
			lo_form1.endnary.value = ls_endnary.substring(0, ls_endnary.length-2);
			lo_form1.bocdary.value = ls_bocdary.substring(0, ls_bocdary.length-2);
		}
    }
    
	lo_form1.action = "/ss/admin/1045";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}
		
/* 20050509 백업
		// 저장
		function save(){
			var lo_form1 = document.zip_detail_form;
		
		    if(!check_all(lo_form1)) return;							// 폼 유효성 체크
		
		
			if(lo_form1.checkyn == null){								// 체크박스가 없을 때
		        alert("선택항목이 존재하지 않습니다.");
				return;
			}else if(lo_form1.checkyn.type == "checkbox"){				// 체크박스가 한개 일때
				if(lo_form1.checkyn.checked){
					lo_form1.addr1ary.value = lo_form1.addr1.value
					lo_form1.addr2ary.value = lo_form1.addr2.value
					lo_form1.addr3ary.value = lo_form1.addr3.value
					lo_form1.largedlvplacary.value = lo_form1.largedlvplac.value
					lo_form1.bgnnary.value = lo_form1.bgnn.value
					lo_form1.endnary.value = lo_form1.endn.value
		
					// 지국지사코드 체크
					if(lo_form1.bocd.value == ''){
				        alert("지국지사코드가 존재하지 않습니다.");
						return;
					}
					lo_form1.bocdary.value = lo_form1.bocd.value
		        }else{
		        	alert("선택항목이 존재하지 않습니다.");
		        	return;
		        }
			}else{														// 체크박스가 여러 개일때
		
			    var li_count = 0;		// 선택항목 갯수
		
			    // 우편번호 저장 정보를 문자열 집합으로 만든다.
				var ls_addr1ary = '';
				var ls_addr2ary = '';
				var ls_addr3ary = '';
				var ls_largedlvplacary = '';
				var ls_bgnnary = '';
				var ls_endnary = '';
				var ls_bocdary = '';
		
				// 선택항목 갯수 계산
			    for(var i=0; i<lo_form1.checkyn.length; i++) {
			        if(lo_form1.checkyn[i].checked){
			        	li_count++;
			        }
			    }
		
				if(li_count == 0){										// 선택항목이 존재하지 않으면
			        alert("선택항목이 존재하지 않습니다.");
					return;
				}else{													// 선택항목이 존재하면
		
				    for(var i=0; i<lo_form1.checkyn.length; i++) {
				        if(lo_form1.checkyn[i].checked){
							ls_addr1ary = ls_addr1ary + lo_form1.addr1[i].value + "<%= paramGbn%>";
							ls_addr2ary = ls_addr2ary + lo_form1.addr2[i].value + "<%= paramGbn%>";
							ls_addr3ary = ls_addr3ary + lo_form1.addr3[i].value + "<%= paramGbn%>";
							ls_largedlvplacary = ls_largedlvplacary + lo_form1.largedlvplac[i].value + "<%= paramGbn%>";
							ls_bgnnary = ls_bgnnary + lo_form1.bgnn[i].value + "<%= paramGbn%>";
							ls_endnary = ls_endnary + lo_form1.endn[i].value + "<%= paramGbn%>";
		
							// 지국지사코드 체크
							if(lo_form1.bocd[i].value == ''){
						        alert("지국지사코드가 존재하지 않습니다.");
								return;
							}
		
							ls_bocdary = ls_bocdary + lo_form1.bocd[i].value + "<%= paramGbn%>";
						}
				    }
		
					lo_form1.addr1ary.value = ls_addr1ary.substring(0, ls_addr1ary.length-2);
					lo_form1.addr2ary.value = ls_addr2ary.substring(0, ls_addr2ary.length-2);
					lo_form1.addr3ary.value = ls_addr3ary.substring(0, ls_addr3ary.length-2);
					lo_form1.largedlvplacary.value = ls_largedlvplacary.substring(0, ls_largedlvplacary.length-2);
					lo_form1.bgnnary.value = ls_bgnnary.substring(0, ls_bgnnary.length-2);
					lo_form1.endnary.value = ls_endnary.substring(0, ls_endnary.length-2);
					lo_form1.bocdary.value = ls_bocdary.substring(0, ls_bocdary.length-2);
				}
		    }
		    
			lo_form1.action = "/ss/admin/1045";
		    lo_form1.target = "ifrm";
		    lo_form1.submit();
		}
*/

// 취소
function cancel(){
	var lo_form1 = document.zip_detail_form;
	lo_form1.reset();                                               // 폼 재설정

	setEventHandler();												// 폼 재설정 후 이벤트핸들러 호출
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

// 목록 조회시 지국명이 존재할 경우 지국검색 후 목록 조회를 수행한다.
// 이경우 단순 지국검색과 지국검색 후 목록 조회를 수행해야 하는가 구분해야 하고 목록조회를 수행해야 하는 경우는 gs_request 변수값을 L 로 설정한다.
var gs_request = 'N';	// N : 요청없음, L : 조회요청

// 요청 플래그 설정
function set_request(flag){
	gs_request = flag;
}

// 지국검색을 통한 목록 조회
function bo_list_search(){
    var lo_form1 = document.zip_search_form;

	if(lo_form1.bonm.value == ''){
		lo_form1.bocd.value = '';
		list_search();
	}else{
		gs_no = '1';

	    // 부서코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

// 검색 조건 초기화
function set_default(flag){

    var lo_form1 = document.zip_search_form;
		
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

//엔터키 목록조회
function enter_key(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;
    
    list_search();
}
-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" class="title1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >관리자
      &gt; </b> 우편번호</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top">

	<!--우편번호 검색 시작 -->
	<table width="830" border="0" cellspacing="0" cellpadding="2">
    <form name="zip_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                	<!-- 현재 페이지 번호 -->
        <input name="pagesize" type="hidden" value ="<%= zipListCount%>">	<!-- 한 화면당 리스트 항목 수 -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
		<input name="common_deptcd" type="hidden" value ="">                    	<!-- 공통 부서코드 -->
		<input name="bocd" type="hidden" value ="">                    				<!-- 지국코드 -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   	<!-- 세션 적용 여부 -->
	    <input name="zip1" type="hidden" value ="">			<!--우편번호1-->
	    <input name="zip2" type="hidden" value ="">     	<!--우편번호2-->
	    <input name="flag" type="hidden" value ="A">     	<!--검색조건-->

		<tr>
<%--		
			<td class="title" bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서</td>
			<td class="title" width="80">
	            <select name="deptcd" onChange="area_search();" class="sel_all"><!-- 부서코드, 코드명 목록 -->
<%
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true);
%>
	            </select>
			</td>
			<td class="title" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역</td>
			<td class="title" width="80">
	            <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--지역코드, 지역명 목록-->
<%
					writeAreaOpt(session, out, true);
%>
	            </select>
			</td>
			<td class="title" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국</td>
			<td class="title" width="165" >
				<input name="bonm" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
            	<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"><!--지국검색팝업-->
            	<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
			</td>
--%>			
			<td class="title" bgcolor="#EBE9DC" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">우편번호</td>
			<td class="title" bgcolor="#EBE9DC" width="70">
				<input name="zip" type="text" size="7" class="text_box" dataType="zip" onkeydown="enter_key()">
			</td>
			<td class="title" bgcolor="#EBE9DC" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">읍/면/동</td>
			<td class="title" bgcolor="#EBE9DC" width="90">
				<input name="addr3" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="enter_key()">
			</td>
			<td class="title" bgcolor="#EBE9DC" align="right">
<%--			
				<input type="image" src="/html/comm_img/bu_search03.gif" width="39" height="19" border="0" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;" border="0" >
--%>				
				<input type="image" src="/html/comm_img/bu_search03.gif" width="39" height="19" border="0" align="absmiddle" onclick="list_search();window.event.returnValue=false;" border="0" >
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
				<!--여백-->
			</td>
		</tr>
	</form>
	</table>
	<!--우편번호 검색 끝 -->

	<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr>
			<td  height="25" bgcolor="#EBE9DC" class="title">MIS 우편번호</td>
		</tr>
		<tr>
			<td height="3">
			<!--여백-->
			</td>
		</tr>
	</table>

	<!--MIS 우편번호 목록 시작 -->
	<table width="830" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="zip_list_id">
    <form name="zip_list_form" method="post" action="">
	    <input name="zip1" type="hidden" value ="">			<!--우편번호1-->
	    <input name="zip2" type="hidden" value ="">     	<!--우편번호2-->
	    <input name="zip3" type="hidden" value ="">     	<!--우편번호3-->
	    <input name="addr1" type="hidden" value ="">		<!--주소1-->
	    <input name="addr2" type="hidden" value ="">     	<!--즈소2-->
	    <input name="addr3" type="hidden" value ="">     	<!--주소3-->
	    <input name="largedlvplac" type="hidden" value ="">	<!--상세주소-->

		<tr bgcolor="#dddddd" align="center" height="23">
			<td width="65" class="gray">우편번호1</td>
			<td width="65" class="gray">우편번호2</td>
			<td width="65" class="gray">우편번호3</td>
			<td width="70" class="gray">시/도</td>
			<td width="70" class="gray">구/군</td>
			<td width="140" class="gray">읍/면/동</td>
			<td class="gray">상세주소</td>
			<td width="60" class="gray">시작번지</td>
			<td width="60" class="gray">끝번지</td>
		</tr>

        <%-- 초기화면 목록 반복 시작 --%>
        <%for(int i=0; i<zipListCount; i++){%>
		<tr align="center"">
			<td width="65" class="gray">&nbsp;</td>
			<td width="65" class="gray">&nbsp;</td>
			<td width="65" class="gray">&nbsp;</td>
			<td width="70" class="gray">&nbsp;</td>
			<td width="70" class="gray">&nbsp;</td>
			<td width="140" class="gray">&nbsp;</td>
			<td class="gray">&nbsp;</td>
			<td width="60" class="gray">&nbsp;</td>
			<td width="60" class="gray">&nbsp;</td>
		</tr>
        <%}%>
        <%-- 초기화면 목록 반복 끝 --%>
		<tr bgcolor="#dddddd" height="23">
			<td colspan="9" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
			</td>
		</tr>
	</form>
	</table>
	<!--MIS 우편번호 목록 끝 -->

    <!-- 페이지 이동 -->
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
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
                    <jsp:param name = "js_fn_nm" 	value="page_move"/>
                    <jsp:param name = "pagesize" 	value="<%= zipListCount%>"/>
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
      <!--여백-->
    </td>
  </tr>
  <tr>
    <td>

	<!--판매국 우편번호 목록 시작 -->
    <table border="0" cellspacing="0" cellpadding="0" id="zip_detail_id">
	</table>
	<!--판매국 우편번호 목록 끝 -->


    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<!--상세 우편번호에서 지국찾기를 위한 FORM-->
<form name="bo_search_form" method="post" style="display:none">
	<input name="bonm" type="hidden" value ="">				<!-- 지국명 이름 -->
</form>
</body>
</html>
