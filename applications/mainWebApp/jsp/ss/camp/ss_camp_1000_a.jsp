<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_camp_1000_a.jsp
* 기능 : 캠페인확장-신청등록-초기화면
* 작성일자 : 2005-05-26
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_CAMP_EXTN_INITDataSet ds = (SS_L_CAMP_EXTN_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
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
function area_search(flag){
    var lo_form1 = document.extn_search_form;
    if(flag == '1'){        // 일반 지국 지역 검색
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
    }else if(flag == '2'){  // 확장(권유) 지국 지역 검색
         if(lo_form1.extn_deptcd.value == '') {
            var str = "<select id=extn_areacd_id name=\"extn_areacd\" class=\"sel_all\">" +
                          "<option value='' selected>전체</option>" +
                      "</select>"
            document.all.extn_areacd_id.outerHTML = str;
            return;
        }

        // 부서코드값을 "/ss/common/1105" 서블릿으로 보낸다
        lo_form1.action = "/ss/common/1105";
	    lo_form1.common_deptcd.value = lo_form1.extn_deptcd.value;
        lo_form1.target = "ifrm";
        lo_form1.submit();
   }
}

// 확장자 소속 검색
function extnblng_search(){
    var lo_form1 = document.extn_search_form;
    if( (lo_form1.rdr_extntypecd.value == '') || (lo_form1.rdr_extntypecd.value == '40') || (lo_form1.rdr_extntypecd.value == '50')) {
       var str = "<select id=extnblngcd_id name=\"extnblngcd\" class=\"sel_all\">" +
                      "<option value='' selected>전체</option>" +
                  "</select>"
        document.all.extnblngcd_id.outerHTML = str;
        return;
    }
    // 확장유형코드값을 "/ss/extn/1010" 서블릿으로 보낸다
    lo_form1.action = "/ss/extn/1010";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 지국찾기 팝업
// 확장현황은 지국찾기가 2개이므로 매개변수를 통해 구분해 처리한다.
// 지국지사코드, 지국지사명이 팝업으로부터 넘어온다. 두 값의 구분자는 "\n"
function bo_search(no){
    var lo_form1 = document.extn_search_form;
    if(no == '1'){				// 해당지국지사(인계지국)
        var	deptcd = lo_form1.deptcd.value;
        var areacd = lo_form1.areacd.value;
	    var bonm   = lo_form1.corrbonm.value;

		var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");
        var la_str;

        if(ls_return.indexOf("\n") != -1){
            la_str = ls_return.split("\n");
            lo_form1.corrbocd.value = la_str[0];
            lo_form1.corrbonm.value = la_str[1];
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
        	if(gs_request == 'L'){			// 지국검색이 하나인 목록 검색일 경우
        		gs_request = 'N';
        		list_search();
        	}else if(gs_request == 'LC'){	// 두 지국검색 중 해당지국 검색인 경우
        		gs_request = 'N'
        		list_search();
        	}else if(gs_request == 'LE'){	// 두 지국검색 중 확장지국 검색인 경우
        		gs_request = 'N'
        		list_search();
        	}else if(gs_request == 'LCE'){	// 지국검색이 두개인 목록 중 지국 검색이 처리되지 않은 경우(해당 지국 처리부터)
        		gs_request = 'LE'
        		bo_list_search();
        	}
		}
    }else if(no == '2'){	// 확장지국지사(확장(권유)지국)
        var	deptcd = lo_form1.extn_deptcd.value;
        var areacd = lo_form1.extn_areacd.value;
	    var bonm   = lo_form1.rdr_extnbonm.value;

		var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");
        var la_str;

        if(ls_return.indexOf("\n") != -1){
            la_str = ls_return.split("\n");
            lo_form1.rdr_extnbocd.value = la_str[0];
            lo_form1.rdr_extnbonm.value = la_str[1];
/*
            lo_form1.extn_deptcd.value = la_str[2];
            lo_form1.extn_areacd.outerHTML =
            		'<select name="extn_areacd" size="1" id="areacd_id" class="sel_all">' +
            		'<option value="' +
            		la_str[4] +
            		'" selected>' +
            		la_str[5] +
            		'</option>';
*/
        	if(gs_request == 'L'){			// 지국검색이 하나인 목록 검색일 경우
        		gs_request = 'N';
        		list_search();
        	}else if(gs_request == 'LC'){	// 두 지국검색 중 해당지국 검색인 경우
        		gs_request = 'N'
        		list_search();
        	}else if(gs_request == 'LE'){	// 두 지국검색 중 확장지국 검색인 경우
        		gs_request = 'N'
        		list_search();
        	}else if(gs_request == 'LCE'){	// 지국검색이 두개인 목록 중 지국 검색이 처리되지 않은 경우(해당 지국 처리부터)
        		gs_request = 'LE'
        		bo_list_search();
        	}
		}
    }
	return;
}

// 해당지국,확장(권유)지국 구분을 위한 전역변수
var gs_no;

// 엔터키에 의한 지국찾기
function bo_enter_search(no){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

	// 엔터키 검색을 위한 별도의 폼을 이용한다.
    var lo_form1 = document.bo_enter_search_form;
    var lo_form2 = document.extn_search_form;

	// 해당지국지사
	if(no == '1'){
	    lo_form1.deptcd.value = lo_form2.deptcd.value;
	    lo_form1.areacd.value = lo_form2.areacd.value;
	    lo_form1.bonm.value = lo_form2.corrbonm.value;

	    //지국명이 존재하지 않으면 지국검색팝업을 띄운다.
		if(lo_form1.bonm.value == ''){
			bo_search('1');
			return;
		}

	// 확장(권유)지국지사
	}else if(no == '2'){
	    lo_form1.deptcd.value = lo_form2.extn_deptcd.value;
	    lo_form1.areacd.value = lo_form2.extn_areacd.value;
	    lo_form1.bonm.value = lo_form2.rdr_extnbonm.value;

	    //지국명이 존재하지 않으면 지국검색팝업을 띄운다.
		if(lo_form1.bonm.value == ''){
			bo_search('2');
			return;
		}
	}

	// 해당지국,확장(권유)지국 구분을 위한 전역변수 설정
	gs_no = no;

	// 부서코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
    lo_form1.action = "/ss/common/1113";
    lo_form1.target = "ifrm";
    lo_form1.submit();

}

// 엔터키에 의한 지국찾기 결과처리
function bo_enter_search_result(no){
	// 검색결과가 한건이므로 검색창에 결과값을 설정한다.
	if(no == '1'){

		var lo_form1 = ifrm.document.bo_detail_form;

		// 해당지국지사
		if(gs_no == '1'){
			var lo_form2 = document.extn_search_form;
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
			lo_form2.corrbocd.value = lo_form1.bocd.value;
			lo_form2.corrbonm.value = lo_form1.bonm.value;

		// 확장(권유)지국지사
		}else if(gs_no == '2'){
			var lo_form2 = document.extn_search_form;
/*
			lo_form2.extn_deptcd.value = lo_form1.deptcd.value;
	        lo_form2.extn_areacd.outerHTML =
	        		'<select name="extn_areacd" size="1" id="extn_areacd_id" class="sel_all">' +
	        		'<option value="' +
	        		lo_form1.areacd.value +
	        		'" selected>' +
	        		lo_form1.areanm.value +
	        		'</option>';
*/
			lo_form2.rdr_extnbocd.value = lo_form1.bocd.value;
			lo_form2.rdr_extnbonm.value = lo_form1.bonm.value;

		}
	// 검색결과가 없거나 여러건이므로 지국찾기 팝업을 띄운다.
	}else if(no == '2'){

		bo_search(gs_no);
	}
}

// 목록보기
function list_search()
{
    var lo_form1 = document.extn_search_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';

	// 확장 유형별로 적절한 URL을 선택하여 해당 서블릿으로 보낸다.
    if(lo_form1.rdr_extntypecd.value == ''){		// 전체
        lo_form1.action = "/ss/cns/1020";
    }else if(lo_form1.rdr_extntypecd.value == '10'){	// 사원
        lo_form1.action = "/ss/cns/1040";
    }else if(lo_form1.rdr_extntypecd.value == '20'){	// 품앗이
        lo_form1.action = "/ss/cns/1050";
    }else if(lo_form1.rdr_extntypecd.value == '30'){	// 지국자체
        lo_form1.action = "/ss/cns/1060";
    }else if(lo_form1.rdr_extntypecd.value == '40'){	// 자진신청
        lo_form1.action = "/ss/cns/1030";
    }else if(lo_form1.rdr_extntypecd.value == '50'){	// 독자권유
        lo_form1.action = "/ss/cns/1030";
    }

    lo_form1.target = "ifrm";
    lo_form1.submit();
}


// 상세보기
function detail_view(rdr_extntypecd, aplcpathcd, rdr_extndt, rdr_extnno, rdr_no, medicd, cntrno, mangno){

    var lo_form1 = document.extn_list_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 확장일자, 확장번호를 "/ss/extn/1090" 서블릿으로 보낸다
    lo_form1.rdr_extntypecd.value = rdr_extntypecd;
    lo_form1.aplcpathcd.value = aplcpathcd;
    lo_form1.rdr_extndt.value = rdr_extndt;
    lo_form1.rdr_extnno.value = rdr_extnno;
    lo_form1.rdr_no.value = rdr_no;
    lo_form1.medicd.value = medicd;
    lo_form1.cntrno.value = cntrno;
    lo_form1.mangno.value = mangno;
    lo_form1.action = "/ss/cns/1070";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.extn_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	// 확장 유형별로 적절한 URL을 선택하여 해당 서블릿으로 보낸다.
    if(lo_form1.rdr_extntypecd.value == ''){		// 전체
        lo_form1.action = "/ss/cns/1020";
    }else if(lo_form1.rdr_extntypecd.value == '10'){	// 사원
        lo_form1.action = "/ss/cns/1040";
    }else if(lo_form1.rdr_extntypecd.value == '20'){	// 품앗이
        lo_form1.action = "/ss/cns/1050";
    }else if(lo_form1.rdr_extntypecd.value == '30'){	// 지국자체
        lo_form1.action = "/ss/cns/1060";
    }else if(lo_form1.rdr_extntypecd.value == '40'){	// 자진신청
        lo_form1.action = "/ss/cns/1030";
    }else if(lo_form1.rdr_extntypecd.value == '50'){	// 독자권유
        lo_form1.action = "/ss/cns/1030";
    }

    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 검색조건 변경
function changeSearchHTML(){
	var lv_rdr_extntypecd = document.extn_search_form.rdr_extntypecd.value;	// 확장유형
	var lv_select1 = document.all.extnblngcd.value;				// 확장자 소속 select
    var lo_table2 = document.all.extn_search_info_bo_id       	// 지국 검색 테이블


	var ls_nm = '';                                         	// 이름 검색

	if(lv_rdr_extntypecd == '10'){				// 사원확장
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">사원명'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">권유자'+
//                  '&nbsp;<input name="aplcpersnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독자'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">납부자'+
//                  '&nbsp;<input name="pymtflnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '20'){		// 품앗이확장
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">확장자'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독자'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">납부자'+
//                  '&nbsp;<input name="pymtflnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '30'){		// 지국자체확장
		    if(lv_select1 == '10' || lv_select1 == '20'){   // 조선IS요원, 사설요원 확장
				ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">요원명'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">';
		    }else if(lv_select1 == '30'){		// 지국종사원 확장
		        ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">종사원'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">';
		    }else{
		        ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">확장자'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">';
		    }
                ls_nm = ls_nm +
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">신청자'+
//                  '&nbsp;<input name="aplcpersnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독자'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">납부자'+
//                  '&nbsp;<input name="pymtflnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '40'){		// 자진신청
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">신청자'+
                    '&nbsp;<input name="aplcpersnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독자'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">납부자'+
//                  '&nbsp;<input name="pymtflnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '50'){		// 사이버
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">확장자'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">신청자'+
//                  '&nbsp;<input name="aplcpersnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독자'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
//                  '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">납부자'+
//                  '&nbsp;<input name="pymtflnm" type="text" size="8" class="text_box">'
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;
	}
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

    var lo_form1 = document.extn_search_form;	// 검색 폼

	if(flag == '1'){			// 확장지국 부서,지역,지국 초기화
		// 부서 초기화
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search(\'1\');" class="sel_all">'
									+'<%// writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									+'</select>';
		// 지역 초기화
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" id="areacd_id" class="sel_all">'
									+'<% //writeAreaOpt(session, out, true); %>'
									+'</select>';
		// 지국코드,지국명 초기화, 포커스이동
		lo_form1.corrbocd.value = "";
		lo_form1.corrbonm.value = "";
		lo_form1.corrbonm.focus();
	}else if(flag == '2'){		// 권유지국 부서,지역,지국 초기화
		// 부서 초기화
		lo_form1.extn_deptcd.outerHTML =  '<select name="extn_deptcd" onChange="area_search(\'2\');" class="sel_all">'
										 +'<% //writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									     +'</select>';
		// 지역 초기화
		lo_form1.extn_areacd.outerHTML =  '<select name="extn_areacd" size="1" id="extn_areacd_id" class="sel_all">'
										 +'<% //writeAreaOpt(session, out, true); %>'
										 +'</select>';
		// 지국코드,지국명 초기화, 포커스이동
		lo_form1.rdr_extnbocd.value = "";
		lo_form1.rdr_extnbonm.value = "";
		lo_form1.rdr_extnbonm.focus();
	}else if(flag == '4'){		// 기간 초기화
	}else if(flag == '5'){		// 기타 초기화
	}
}

// 목록 조회시 지국명이 존재할 경우 지국검색 후 목록 조회를 수행한다.
// 이경우 단순 지국검색과 지국검색 후 목록 조회를 수행해야 하는가 구분해야 하고 목록조회를 수행해야 하는 경우는 gs_request 변수값을 L 로 설정한다.
var gs_request = 'N';	// N : 요청없음, L : 조회요청, LC : 두 지국검색 중 해당지국 조회, LE : 두 지국검색 중 확장지국 조회, LCE : 두 지국검색 모두 조회.

// 요청 플래그 설정
function set_request(){
    var lo_form1 = document.extn_search_form;	// 검색 폼
	if(lo_form1.corrbonm.value == '' && lo_form1.rdr_extnbonm.value == ''){
		lo_form1.corrbocd.value = '';
		lo_form1.rdr_extnbocd.value = '';
		gs_request = 'L';
	}else if(lo_form1.corrbonm.value == ''){
		lo_form1.corrbocd.value = '';
		gs_request = 'LE';
	}else if(lo_form1.rdr_extnbonm.value == ''){

		lo_form1.rdr_extnbocd.value = '';
		gs_request = 'LC';
	}else{
		gs_request = 'LCE';
	}
}

// 지국검색을 통한 목록 조회
function bo_list_search(){
    var lo_form1 = document.bo_enter_search_form;
    var lo_form2 = document.extn_search_form;

	if(gs_request == 'L'){
		list_search();
	}else if(gs_request == 'LC' || gs_request == 'LCE'){
	    lo_form1.deptcd.value = lo_form2.deptcd.value;
	    lo_form1.areacd.value = lo_form2.areacd.value;
	    lo_form1.bonm.value = lo_form2.corrbonm.value;

		gs_no = '1';

		// 부서코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}else if(gs_request == 'LE'){
	    lo_form1.deptcd.value = lo_form2.extn_deptcd.value;
	    lo_form1.areacd.value = lo_form2.extn_areacd.value;
	    lo_form1.bonm.value = lo_form2.rdr_extnbonm.value;

		gs_no = '2';

		// 부서코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

//캠페인 확장유형에 따른 이벤트목록 검색
function event_list_search( camp_type ) {

   	var lo_form1 = document.event_list_search_form;

	if( camp_type == "" ) {
		return;
	}

//	if( camp_type == "E" ) {
    lo_form1.camp_event_id.value = camp_type;
//	} else { return; }

	lo_form1.action = "/ss/camp/1101";
    lo_form1.target = "ifrm";
	lo_form1.submit();
}


var gs_no;


//엔터키에 의한 우편번호 검색(신청자)
function zip_enter_search(i_pageno){
	gs_no = '1';

    var e = window.event;
    if(!e || e.keyCode != "13") return;

	//우편번호 패턴이 아니라면 zip_search 함수를 call 한다.
	if(!validate_zip(extn_detail_form.aplcperszip.value)){
        zip_search(i_pageno);
		window.event.returnValue = false;
        return;
    }

	var lo_form = document.zip_search_form;
    lo_form.zip.value = extn_detail_form.aplcperszip.value;
    lo_form.pageno.value = i_pageno;   // 페이지번호
    lo_form.pagesize.value = "10000";  // 페이지사이즈( 한 페이지당 최대 레코드 수)

    if(!check_all(zip_search_form, "/ss/common/1152")) return;
}

//엔터키에 의한 우편번호 검색 후 검색 결과가 한건일때, 결과를 필드에 셋팅
function set_zip_search_result(){

	var zip_form 		= ifrm.document.zip_detail_form; 		// ifrm 내 조회된 결과 form
	var lo_form 	    = document.extn_detail_form;	 	// 현재 화면내 독자상세폼

	if(gs_no == '1'){
		lo_form.aplcperszip.value 	= zip_form.zip.value;
		lo_form.aplcpersaddr.value 	= zip_form.addr.value;
        lo_form.tempbocd.value = zip_form.bocd.value;
		lo_form.tempbonm.value = zip_form.bonm.value;
		lo_form.temptelno1.value = zip_form.telno1.value;
		lo_form.temptelno2.value = zip_form.telno2.value;
		lo_form.temptelno3.value = zip_form.telno3.value;

	}else{
		lo_form.dlvzip.value 	= zip_form.zip.value;
		lo_form.dlvaddr.value 	= zip_form.addr.value;
        lo_form.bocd.value = zip_form.bocd.value;
		lo_form.bonm.value = zip_form.bonm.value;
		lo_form.telno1.value = zip_form.telno1.value;
		lo_form.telno2.value = zip_form.telno2.value;
		lo_form.telno3.value = zip_form.telno3.value;

	}

	gs_no = '';
}

// 우편번호 유효성 검증
function validate_zip(s_zip){
	if(trim(s_zip) == "") return false;
    var format = /^(\d{3})(-{0,1})(\d{3})$/;
    return isValidFormat(s_zip, format);
}

//검색버튼에 의한 우편번호 검색(팝업)(신청자)
function zip_search(i_pageno){

	if(gs_no == '2'){
		zip_search2(i_pageno);
		return;
	}
	gs_no = '1';

    var job_flg = "A"; //전체 검색 "A" , 지국내 검색 "S"
    var ls_name = deleteHyphen(trim(extn_detail_form.aplcperszip.value) + ":" + job_flg);
	var lo_form = document.extn_detail_form;
	var ls_uri = "/ss/common/1150";
    var ls_return = jsNewModalWinNoS(ls_uri, ls_name, "430", "410");

	var la_str;
	if(ls_return.indexOf("\n") != -1){
    	la_str = ls_return.split("\n");
        lo_form.aplcperszip.value = la_str[0];
		lo_form.aplcpersaddr.value = la_str[1];
		lo_form.tempbocd.value = la_str[4];
		lo_form.tempbonm.value = la_str[5];
		lo_form.temptelno1.value = la_str[6];
		lo_form.temptelno2.value = la_str[7];
		lo_form.temptelno3.value = la_str[8];
	}
	return;
}

//엔터키에 의한 우편번호 검색2(구독자)
function zip_enter_search2(i_pageno){
	gs_no = '2';

    var e = window.event;
    if(!e || e.keyCode != "13") return;

	//우편번호 패턴이 아니라면 zip_search 함수를 call 한다.
	if(!validate_zip(extn_detail_form.dlvzip.value)){
        zip_search2(i_pageno);
		window.event.returnValue = false;
        return;
    }else{

		var lo_form = document.zip_search_form;
	    lo_form.zip.value = extn_detail_form.dlvzip.value;
	    lo_form.pageno.value = i_pageno;   // 페이지번호
	    lo_form.pagesize.value = "10000";  // 페이지사이즈( 한 페이지당 최대 레코드 수)

	    if(!check_all(zip_search_form, "/ss/common/1152")) return;

    }

}

//검색버튼에 의한 우편번호 검색(팝업)2(구독자)
function zip_search2(i_pageno){
	gs_no = '2';

    var job_flg = "A"; //전체 검색 "A" , 지국내 검색 "S"
    var ls_name = deleteHyphen(trim(extn_detail_form.dlvzip.value) + ":" + job_flg);
	var lo_form = document.extn_detail_form;
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


// 추가
function add(){
    var lo_form1 = document.extn_detail_form;	                // 상세정보 폼

	// 마감 항목을 제외하고 화면 정리
    var c_form2_elements = lo_form1.elements;
    for( var i =0; i< c_form2_elements.length; i++){
		c_form2_elements(i).value = "";
    }

	document.all.type_id.innerHTML = '&nbsp;자진신청';
	document.all.path_id.innerHTML = '&nbsp;TM';
	document.all.bocnfm_id.innerHTML = '&nbsp;';
	document.all.bocmfmtm_id.innerHTML = '&nbsp;';
	document.all.cns_empnm_id.innerHTML = '<%//= Util.getSessionParameterValue(request, "emp_nm", false)%>&nbsp;';
	document.all.cnscnfmtm_id.innerHTML = '&nbsp;';
	lo_form1.medicd.value='110'	//조선일보 기본

    lo_form1.jobflag.value = 'E';									// 작업구분을 확장으로 설정
    lo_form1.accflag.value = 'I';									// 처리구분을 입력으로 설정
}

// 저장
function save(){
   var lo_form1 = document.extn_detail_form;

    lo_form1.jobflag.value = 'E';									// 작업구분을 확장으로 설정

//	if(lo_form1.accflag.value == 'D'){								// 삭제시 예외발생하면 'U'로 변경한다.
//		lo_form1.accflag.value = 'U';
//	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    if(lo_form1.type_id.value == '') {
		alert("캠페인유형을 선택하세요");
		return;
    }

    if(lo_form1.camp_id.value == '') {
		alert("이벤트유형을 선택하세요");
		return;
    }

//   alert( lo_form1.type_id.value );
//   alert( lo_form1.camp_id.value );


    //매체체크
	if(lo_form1.medicd.value == ''){
		alert("매체를 선택하세요");
		return;
	}

    //구독자 주소 체크
	if(lo_form1.dlvzip.value == '' || lo_form1.dlvaddr.value == '' || lo_form1.dlvdtlsaddr.value == ''){
		alert("구독자 주소를 입력하세요");
		return;
	}

	//배달희망일자체크
	if(lo_form1.dlvhopedt.value == ''){
		alert("배달희망일자를 입력하세요");
		return;
	}

    //주거형태 체크
	if(lo_form1.resitypecd.value == ''){
		alert("주거형태를 입력하세요");
		return;
	}

	//구독자 이름 체크
	if(lo_form1.rdrnm.value == ''){
		alert("구독자 성명을 입력하세요");
		return;
	}

	//상담원확인여부
    //상담원관련부분을 제거했기 때문에 기본 N로 설정
    lo_form1.cnscnfmyn.value = 'N';

//    lo_form1.camptypecd.value = lo_form.type_id.value;
//    lo_form1.camp_event_id.value = '';

    //신규등록
    lo_form1.action = "/ss/camp/1100";

    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 삭제
function del(){
    var lo_form1 = document.extn_detail_form;

    lo_form1.jobflag.value = 'E';									// 작업구분을 확장으로 설정

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


// 신청자와 동일한 경우 구독자정보 세팅
function set_rdr_info(){
    var lo_form1 = document.extn_detail_form;

	lo_form1.rdrnm.value =       	        	lo_form1.aplcpersnm.value;
	lo_form1.rdrtel_no1.value =  				lo_form1.aplcperstel_no1.value;
	lo_form1.rdrtel_no2.value =  				lo_form1.aplcperstel_no2.value;
	lo_form1.rdrtel_no3.value =  				lo_form1.aplcperstel_no3.value;
	lo_form1.rdrptph_no1.value = 	        	lo_form1.aplcpersptph_no1.value;
	lo_form1.rdrptph_no2.value = 				lo_form1.aplcpersptph_no2.value;
	lo_form1.rdrptph_no3.value = 				lo_form1.aplcpersptph_no3.value;
	lo_form1.rdremail.value =    	        	lo_form1.aplcpersemail.value;
	lo_form1.dlvzip.value =      				lo_form1.aplcperszip.value;
	lo_form1.dlvaddr.value =     				lo_form1.aplcpersaddr.value;
	lo_form1.dlvdtlsaddr.value = 				lo_form1.aplcpersdtlsaddr.value;
	lo_form1.bocd.value =        				lo_form1.tempbocd.value;
	lo_form1.bonm.value =        				lo_form1.tempbonm.value;
	lo_form1.telno1.value =      				lo_form1.temptelno1.value;
	lo_form1.telno2.value =      				lo_form1.temptelno2.value;
	lo_form1.telno3.value =      				lo_form1.temptelno3.value;
}

//enter key 처리
function check_enter(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    set_request();bo_list_search();window.event.returnValue=false;
}
-->
</script>
</head>


<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1"  onload="jsInit()" onkeydown="check_enter();">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >캠페인
        &gt; </b>캠페인확장</td>
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

    <!--확장 검색 시작-------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" id="extn_search_id">
    <form name="extn_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                <!-- 현재 페이지 번호 -->
        <input name="pagesize" type="hidden" value ="<%= extnListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
        <input name="common_deptcd" type="hidden" value ="">                    <!-- 공통 부서코드 -->
        <input name="corrbocd" type="hidden" value ="">                         <!-- 해당지국지사코드 -->
        <input name="rdr_extnbocd" type="hidden" value ="">                     <!-- 확장지국지사코드 -->
   </form>
<tr>
    <td valign="top">
	<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr>
			<td  height="25" bgcolor="#EBE9DC" class="title" width="100">확장신청 상세</td>
			<td align="right"  bgcolor="#EBE9DC" height="25" class="title">
				<input type="image" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" onclick="save()" border="0">&nbsp;
			</td>
		</tr>
		<tr>
			<td height="3">
			<!--여백-->
			</td>
		</tr>
	</table>

    <!--확장 상세 시작 -------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="1" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="extn_detail_id">
	<form name="extn_detail_form" method="post" action="" >
		<input name="jobflag" type="hidden" value ="E">	<!--확장업무-->
		<input name="accflag" type="hidden" value ="I">
		<input name="bocd" type="hidden" value ="">
		<input name="dt" type="hidden" value ="">		<!--등록일자-->
		<input name="no" type="hidden" value ="">		<!--등록번호-->
		<input name="cnscnfmyn" type="hidden" value =""><!--상담원확인여부-->

		<input name="tempbocd" type="hidden" value ="">
		<input name="tempbonm" type="hidden" value ="">
		<input name="temptelno1" type="hidden" value ="">
		<input name="temptelno2" type="hidden" value ="">
		<input name="temptelno3" type="hidden" value ="">

		<input name="pageno" type="hidden" value =""><!--검색폼의 페이지번호-->

        <input name="camptypecd" type="hidden" value ="">
        <input name="camp_event_id" type="hidden" value ="">

	    <!--일반정보 시작-->
	    <tr>
	        <td rowspan="2" class="gray" bgcolor="#EBE9DC"> 확장일반</td>
	        <td width="80" class="gray" bgcolor="#dddddd">확장유형</td>
	        <td width="150" class="gray">캠페인확장</td>
            <input type="hidden" name="rdr_extntypecd" value="80">
	        <td width="80" class="gray" bgcolor="#dddddd">캠페인유형</td>
	        <td width="150" class="gray">
				<select name="type_id" id="type_id" class="sel_all" onchange="event_list_search(this.value);">
                  <option value="">선택</option>
                  <%= ds.curcampcdOptHtml("") %>
				</select>
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd">이벤트유형</td>
	        <td width="150" class="gray">
				<select name="camp_id" id="camp_id" class="sel_all">
                  <option value="">선택</option>
                  <%//= ds.curcampeventcdOptHtml("") %>
				</select>
            </td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> 매체<font color="red">*</font></td>
	        <td width="150" class="gray">
				<select name="medicd" class="sel_all">
                  <option value="">선택</option>
                  <%= ds.curmedicdOptHtml("") %>
				</select>
			</td>
	        <td width="80" class="gray" bgcolor="#dddddd">부수<font color="red">*</font></td>
	        <td colspan="3" class="gray" align="left">
	        	<input name="qty" type="text" size="4" style="text-align:right;" dataType="number" class="text_box" value="1" notEmpty caption="부수">&nbsp;
	        </td>
	    </tr>
	    <!--일반정보 끝-->

	    <!--신청자 시작-->
	    <tr>
	        <td rowspan="3" class="gray" bgcolor="#EBE9DC"> 신청자</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 성명<font color="red">*</font></td>
	        <td width="150" class="gray">
	        	<input name="aplcpersnm" type="text" size="10" style="ime-mode:active;" class="text_box"  notEmpty caption="신청자성명">&nbsp;
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 전화번호</td>
	        <td width="150" class="gray">
				<input name="aplcperstel_no1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="aplcperstel_no2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="aplcperstel_no3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 휴대폰번호</td>
	        <td width="150" class="gray">
	        	<input name="aplcpersptph_no1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="aplcpersptph_no2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="aplcpersptph_no3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">
			</td>
	    </tr>
        <tr>
            <td width="80" class="gray" bgcolor="#dddddd"> 이메일</td>
            <td colspan="3" class="gray">
	        	<input name="aplcpersemail" type="text" size="50" style="ime-mode:active;" class="text_box">&nbsp;
            </td>
            <td width="80" class="gray" bgcolor="#dddddd">독자 관계<font color="red">*</font></td>
            <td width="150" class="gray">
				<select name="rshpclsfcd" class="sel_all">
					<option value="" selected>선택</option>
					<option value="1">본인</option>
					<option value="2">가족</option>
					<option value="3">친척</option>
					<option value="4">친구</option>
					<option value="5">회사</option>
					<option value="6">기타</option>
					<option value="C">친지</option>
					<option value="D">업무상지인</option>
				</select>
			</td>
        </tr>
        <tr>
			<td width="80" bgcolor="#dddddd" class="gray">주소<font color="red">*</font></td>
			<td colspan="5"  class="gray">
				<input name="aplcperszip" type="text" size="8"  class="text_box" caption="우편번호 onkeydown="zip_enter_search(1);">
				<input type="image" src="/html/comm_img/bu_search03.gif" width="39" height="19" align="absmiddle" style="cursor:hand;" onclick="zip_search();window.event.returnValue=false;">
				<input name="aplcpersaddr" type="text" size="40" class="text_box" readonly>
				<input name="aplcpersdtlsaddr" type="text" size="40" class="text_box" style="ime-mode:active;">
			</td>
        </tr>
	    <!--신청자 끝-->

	    <!--구독자 시작-->
	    <tr>
	        <td rowspan="3" class="gray" bgcolor="#EBE9DC"> 구독자</td>
	        <td width="80" class="gray" bgcolor="#dddddd">성명<font color="red">*</font></td>
	        <td width="150" class="gray">
	        	<input name="rdrnm" type="text" size="10" style="ime-mode:active;" class="text_box" notEmpty caption="구독자성명">&nbsp;<input type="image" src="/html/comm_img/bu_same.gif" align="absmiddle" style="cursor:hand;" onclick="set_rdr_info();window.event.returnValue=false;">
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 전화번호</td>
	        <td width="150" class="gray">
				<input name="rdrtel_no1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrtel_no2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrtel_no3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 휴대폰번호</td>
	        <td width="150" class="gray">
	        	<input name="rdrptph_no1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrptph_no2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrptph_no3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">
			</td>
	    </tr>
        <tr>
            <td width="80" class="gray" bgcolor="#dddddd"> 이메일</td>
            <td colspan="5" class="gray">
	        	<input name="rdremail" type="text" size="50" style="ime-mode:active;" class="text_box">&nbsp;
            </td>
        </tr>
        <tr>
			<td width="80" bgcolor="#dddddd" class="gray">배달주소<font color="red">*</font></td>
			<td colspan="5"  class="gray">
				<input name="dlvzip" type="text" size="8"  class="text_box" caption="우편번호" onkeydown="zip_enter_search2(1);">
				<input type="image" src="/html/comm_img/bu_search03.gif" width="39" height="19" align="absmiddle" style="cursor:hand;" onclick="zip_search2();window.event.returnValue=false;">
				<input name="dlvaddr" type="text" size="40" class="text_box" readonly>
				<input name="dlvdtlsaddr" type="text" size="40" class="text_box" style="ime-mode:active;">
			</td>
        </tr>
	    <!--구독자 끝-->

	    <!--배달정보 시작-->
	    <tr>
	        <td rowspan="2" class="gray" bgcolor="#EBE9DC"> 배달정보</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 지국명<font color="red">*</font></td>
	        <td width="150" class="gray">
	        	<input name="bonm" type="text" size="10" style="ime-mode:active;" class="text_box" readOnly>&nbsp;
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 지국전화번호</td>
	        <td colspan="3" class="gray">
				<input name="telno1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box" readOnly>-
				<input name="telno2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box" readOnly>-
				<input name="telno3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box" readOnly>
	        </td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> 배달희망일<font color="red">*</font></td>
	        <td width="150" class="gray">
	        	<input name="dlvhopedt" type="text" size="10" class="text_box" dataType="date">&nbsp;
	        </td>
	        <td width="80" class="gray" bgcolor="#dddddd">주거형태</td>
	        <td width="150" class="gray">
				<select name="resitypecd" class="sel_all">
					<option value="" selected>선택</option>
					<option value="1">아파트</option>
					<option value="2">연립&빌라</option>
					<option value="3">주택</option>
					<option value="4">사무실</option>
					<option value="5">상가</option>
					<option value="6">기타</option>
				</select>
			</td>
	        <td width="80" class="gray" bgcolor="#dddddd">주거구분</td>
	        <td width="150" class="gray">
				<select name="resiclsfcd" class="sel_all">
					<option value="" selected>선택</option>
					<option value="1">자택</option>
					<option value="2">전세</option>
					<option value="3">자취</option>
					<option value="4">하숙</option>
					<option value="5">직장</option>
				</select>
			</td>
	    </tr>
	    <!--배달정보 끝-->

	    <!--독자비고 시작-->
	    <!--독자비고 끝-->

	    <!--지국 시작-->
	    <!--지국 끝-->

	    <!--상담원 시작-->
	    <!--상담원 끝-->
	</form>
	</table>
    <!--확장 상세 끝 -------------------------------------------------------------------------->

    </td>
</tr>
</table>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<!--엔터키에 의한 지국검색을위한 폼-->
<form name="zip_search_form" method="post" style="display:none">
    <input type=hidden name=bocd     	 value="">  <!--지국지사코드           -->
	<input type=hidden name=zip 		 value="">  <!--우편번호               -->
    <input type=hidden name=pageno		 value="">  <!--현재페이지             -->
    <input type=hidden name=pagesize	 value="">  <!--페이지당 보여줄 건수   -->
</form>
<form name="bo_enter_search_form" method="post" action="" style="display:none";>
    <input name="deptcd" type="hidden" value ="">	<!--부서코드-->
    <input name="areacd" type="hidden" value ="">	<!--지역코드-->
    <input name="bonm" type="hidden" value ="">		<!--지국명-->
</form>
<form name="event_list_search_form" method="post" action="" style="display:none";>
    <input name="camp_event_id" type="hidden" value ="">
</form>
</body>
</html>
