<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1000_a.jsp
* 기능 : 확장현황-제휴확장신청현황-초기화면
* 작성일자 : 2007-11-16
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_JM_EXTN_INITDataSet ds = (SS_L_RDR_JM_EXTN_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
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
	document.extn_search_form.corrbonm.focus();
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

// 확장자 소속 검색(20050418 김대섭 수정 : 사이버센터확장 추가)
function extnblng_search(){
    var lo_form1 = document.extn_search_form;
    if( (lo_form1.rdr_extntypecd.value == '') || (lo_form1.rdr_extntypecd.value == '40') || (lo_form1.rdr_extntypecd.value == '50')  || (lo_form1.rdr_extntypecd.value == '70')) {
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
//	    var bonm   = lo_form1.rdr_extnbonm.value;

		var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");
        var la_str;

        if(ls_return.indexOf("\n") != -1){
            la_str = ls_return.split("\n");
            lo_form1.rdr_extnbocd.value = la_str[0];
//            lo_form1.rdr_extnbonm.value = la_str[1];

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
//	    lo_form1.bonm.value = lo_form2.rdr_extnbonm.value;

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
			lo_form2.corrbocd.value = lo_form1.bocd.value;
			lo_form2.corrbonm.value = lo_form1.bonm.value;

		// 확장(권유)지국지사
		}else if(gs_no == '2'){
			var lo_form2 = document.extn_search_form;
			lo_form2.rdr_extnbocd.value = lo_form1.bocd.value;
//			lo_form2.rdr_extnbonm.value = lo_form1.bonm.value;

		}
	// 검색결과가 없거나 여러건이므로 지국찾기 팝업을 띄운다.
	}else if(no == '2'){

		bo_search(gs_no);
	}
}

// 목록보기(20050418 김대섭 수정:사이버센터 추가)
function list_search()
{
    var tmp_fromdt;
    var tmp_todt;
    var tmp_resultdt;
    var dt_check_user;

    var lo_form1 = document.extn_search_form;

	//기간구분 선택은 필수
	if(lo_form1.fromtogb.value == ''){
		alert("기간구분을 선택하세요");
		return;
	}

	//기간 검색은 필수
	if(lo_form1.fromdt.value == '' || lo_form1.todt.value == ''){
		alert("기간을 입력하세요");
		return;
	}

//    dt_check_user = "%=session.getAttribute("uid")%";

//    if( dt_check_user != "c190053" ) {

      tmp_fromdt = new Date(lo_form1.fromdt.value);
      tmp_todt   = new Date(lo_form1.todt.value);
      tmp_resultdt = ((tmp_todt.getTime() - tmp_fromdt.getTime()) / (1000 * 60 * 60 * 24) );
      tmp_resultdt = Math.floor(tmp_resultdt);
      if( tmp_resultdt > 31 ) {
        alert("조회시작일자와 조회종료일자의 간격일은\n시스템의 과부하로 인해 31일을 넘을 수 없습니다.\n확인하시고 재조회 하십시요!");
        return;
      } else if( tmp_resultdt < 0 ) {
        alert("조회시작일자가 조회종료일자 이후의 일자입니다.\n확인하시고 재조회 하십시요!");
        return;
      }

//    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';

	// URL을 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/extn/1075";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기
function detail_view(rdr_extntypecd, aplcpathcd, rdr_extndt, rdr_extnno, rdr_no, medicd, cntrno, mangno, boheadcnfmyn){
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

    if( boheadcnfmyn == "확인" ) {
      lo_form1.boheadcnfmyn.value = "Y";
    } else {
      lo_form1.boheadcnfmyn.value = "N";
    }

    lo_form1.action = "/ss/extn/1077";
    lo_form1.target = "ifrm";

    lo_form1.submit();
}

// 페이지 이동(20050418 김대섭 수정:사이버센터 추가)
function page_move(pageno) {
    var lo_form1 = document.extn_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

	//기간구분 선택은 필수
	if(lo_form1.fromtogb.value == ''){
		alert("기간구분을 선택하세요");
		return;
	}

	//기간 검색은 필수
	if(lo_form1.fromdt.value == '' || lo_form1.todt.value == ''){
		alert("기간을 입력하세요");
		return;
	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    lo_form1.action = "/ss/extn/1075";
    lo_form1.target = "ifrm";
    lo_form1.submit();
/*
	// 확장 유형별로 적절한 URL을 선택하여 해당 서블릿으로 보낸다.
    if(lo_form1.rdr_extntypecd.value == ''){		// 전체
        lo_form1.action = "/ss/extn/1020";
    }else if(lo_form1.rdr_extntypecd.value == '10'){	// 사원
        lo_form1.action = "/ss/extn/1040";
    }else if(lo_form1.rdr_extntypecd.value == '20'){	// 품앗이
        lo_form1.action = "/ss/extn/1050";
    }else if(lo_form1.rdr_extntypecd.value == '30'){	// 지국자체
        lo_form1.action = "/ss/extn/1060";
    }else if(lo_form1.rdr_extntypecd.value == '40'){	// 자진신청
        lo_form1.action = "/ss/extn/1030";
    }else if(lo_form1.rdr_extntypecd.value == '50'){	// 사이버
        lo_form1.action = "/ss/extn/1030";
    }else if(lo_form1.rdr_extntypecd.value == '70'){	// 사이버센터
        lo_form1.action = "/ss/extn/1030";
    }else if(lo_form1.rdr_extntypecd.value == '80'){	// 캠페인확장(20050718 김대섭 추가)
        lo_form1.action = "/ss/extn/1030";
    }

    lo_form1.target = "ifrm";
    lo_form1.submit();
*/
}

// 검색조건 변경(20050418 김대섭 수정:사이버센터 추가)
function changeSearchHTML(){
	var lv_rdr_extntypecd = document.extn_search_form.rdr_extntypecd.value;	// 확장유형
	var lv_select1 = document.all.extnblngcd.value;				// 확장자 소속 select
    var lo_table2 = document.all.extn_search_info_bo_id       	// 지국 검색 테이블


	var ls_nm = '';                                         	// 이름 검색

	if(lv_rdr_extntypecd == '10'){				// 사원확장
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">사원명'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독자'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '20'){		// 품앗이확장
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">확장자'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독자'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
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
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독자'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '40'){		// 자진신청
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">신청자'+
                    '&nbsp;<input name="aplcpersnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독자'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
					'';
		lo_table2.rows[0].cells[1].innerHTML = ls_nm;

	}else if(lv_rdr_extntypecd == '50' || lv_rdr_extntypecd == '70'){		// 사이버, 사이버센터
		ls_nm =
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">확장자'+
                    '&nbsp;<input name="extnflnm" type="text" size="8" class="text_box">'+
                    '&nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독자'+
                    '&nbsp;<input name="rdrnm" type="text" size="8" class="text_box">'+
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
									+'<% writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									+'</select>';
		// 지역 초기화
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" id="areacd_id" class="sel_all">'
									+'<% writeAreaOpt(session, out, true); %>'
									+'</select>';
		// 지국코드,지국명 초기화, 포커스이동
		lo_form1.corrbocd.value = "";
		lo_form1.corrbonm.value = "";
		lo_form1.corrbonm.focus();
	}else if(flag == '2'){		// 권유지국 부서,지역,지국 초기화
		// 부서 초기화
		lo_form1.extn_deptcd.outerHTML =  '<select name="extn_deptcd" onChange="area_search(\'2\');" class="sel_all">'
										 +'<% writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									     +'</select>';
		// 지역 초기화
		lo_form1.extn_areacd.outerHTML =  '<select name="extn_areacd" size="1" id="extn_areacd_id" class="sel_all">'
										 +'<% writeAreaOpt(session, out, true); %>'
										 +'</select>';
		// 지국코드,지국명 초기화, 포커스이동
		lo_form1.rdr_extnbocd.value = "";
//		lo_form1.rdr_extnbonm.value = "";
//		lo_form1.rdr_extnbonm.focus();
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

//	if(lo_form1.corrbonm.value == '' && lo_form1.rdr_extnbonm.value == ''){
	if(lo_form1.corrbonm.value == ''){
		lo_form1.corrbocd.value = '';
		lo_form1.rdr_extnbocd.value = '';
		gs_request = 'L';
	}else if(lo_form1.corrbonm.value == ''){
		lo_form1.corrbocd.value = '';
		gs_request = 'LE';
/*	}else if(lo_form1.rdr_extnbonm.value == ''){
		lo_form1.rdr_extnbocd.value = '';
		gs_request = 'LC';*/
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
//	    lo_form1.bonm.value = lo_form2.rdr_extnbonm.value;

		gs_no = '2';

		// 부서코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

//enter key 처리
function check_enter(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    set_request();bo_list_search();window.event.returnValue=false;
}

function fn_fromtogb_chg( obj ) {
  var lo_form1 = document.extn_search_form;

  if( obj.value == '1' ) {
    lo_form1.incmgdt.disabled = 'inline';
  } else {
    lo_form1.incmgdt.disabled = false;
  }
}
-->
</script>
</head>


<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1"  onload="jsInit()" onkeydown="check_enter();">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >확장현황
        &gt; </b> 제휴확장 신청현황 </td>
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
        <tr bgcolor="#EBE9DC">	<!-- rows[0] -->
            <td class="sea_top" height="27">
                <table width="100%" border="0" cellspacing="0" cellpadding="1">
                    <tr>
                        <td width="200">
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서
                            <select name="deptcd" onChange="area_search('1');" class="sel_all"><!-- 부서코드, 코드명 목록 -->
<%--
                                <option value='' selected>전체</option>
                                <%= ds.curdeptcdOptHtml("") %>
--%>
<%
writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
                            </select>
                      	</td>
                      	<td width="200">
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역
                            <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--지역코드, 지역명 목록-->
<%--
                                <option value='' selected>전체</option>
--%>
<%
writeAreaOpt(session, out, true);
%>
                            </select>
						</td>
						<td>
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국&nbsp;&nbsp;&nbsp;
                            <input name="corrbonm" type="text" style="ime-mode:active;" size="10" class="text_box" onkeydown="bo_enter_search('1');window.event.cancelBubble=true;">
                            <input type="image" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search('1');window.event.returnValue=false;"> <!--지국검색팝업-->
                            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
                        </td>
					</tr>
<%--
					<tr>
                        <!-- 권유지국 시작(품앗이확장인 경우 보여준다) -->
                        <td width="200">
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서
                            <select name="extn_deptcd" onChange="area_search('2');" class="sel_all"><!-- 부서코드, 코드명 목록 -->
%--
                                <option value='' selected>전체</option>
                                <%= ds.curdeptcdOptHtml("") %>
--%
%
//writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%
                            </select>
                     	</td>
                      	<td width="200">
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역
                            <select name="extn_areacd" size="1" id="extn_areacd_id" class="sel_all">  <!--지역코드, 지역명 목록-->
%--
                                <option value='' selected>전체</option>
--%
%
//writeAreaOpt(session, out, true);
%
                            </select>
                      	</td>
                      	<td>
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국
                            <input name="rdr_extnbonm" type="text" style="ime-mode:active;" size="10" class="text_box" onkeydown="bo_enter_search('2');window.event.cancelBubble=true;">
                            <input type="image" src="/html/comm_img/bu_search04.gif" width="86" height="19" align="absmiddle" onclick="javascript:bo_search('2');window.event.returnValue=false;">
                            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
                        </td>
                        <!-- 권유지국 끝 -->
                    </tr>
                    --%>
                </table>
            </td>
            <td rowspan="2" width="43" class="sea_top" align="right">
				<input type="image" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="set_request();bo_list_search();window.event.returnValue=false;"><!--확장목록 조회-->
			</td>
        </tr>

        <tr bgcolor="#EBE9DC">	<!-- rows[1] -->
            <td>
                <table width="100%" border="0" cellspacing="0" cellpadding="1" id="extn_search_info_bo_id">
            		<tr>
            			<td width="394">
			                <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간
			                <select name="fromtogb" class="sel_all" onchange="fn_fromtogb_chg(this);">
			                    <option value=''>선택</option>
			                    <option value="1" selected>신청</option>
                                <option value="2">확장</option>
			                    <option value="3">확인</option>
			                </select>
			                <input name="fromdt" type="text" size="10" value="<%= Util.getDate2()%>" class="text_box" caption="시작일자" dataType="date">
			                -
			                <input name="todt" type="text" size="10" value="<%= Util.getDate2()%>" class="text_box" caption="종료일자" dataType="date">
                            &nbsp;입력일자 <input name="incmgdt" type="text" size="10" value="<%= Util.getDate2()%>" class="text_box" caption="입력일자" dataType="date" disabled>
						</td>
						<td align="left">
			                &nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">확장자
			                <input name="extnflnm" type="text" size="8" class="text_box" style="ime-mode:active;">
			                &nbsp;<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독자
			                <input name="rdrnm" type="text" size="8" class="text_box" style="ime-mode:active;">
						</td>
						<td align="left">&nbsp;
<%--
							<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">경로
							<select name="aplcpathcd" size="1" class="sel_all">
			                    <option value="" selected>전체</option>
			                    <%= ds.curaplcpathcdOptHtml("") %>                              <!-- 신청경로코드, 코드명 목록 -->
							</select>
--%>
						</td>
					</tr>
				</table>
<!--신청자,납부자 포함
                <table width="100%" border="0" cellspacing="0" cellpadding="1" id="extn_search_info_bo_id">
            		<tr>
            			<td width="270">
			                <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간
			                <select name="fromtogb" class="sel_all">
			                    <option value='' selected>선택</option>
			                    <option value="1">신청</option>
			                    <option value="3">확인</option>
			                </select>
			                <input name="fromdt" type="text" size="10" value="<%= Util.getDate2()%>" class="text_box" caption="시작일자" dataType="date">
			                -
			                <input name="todt" type="text" size="10" value="<%= Util.getDate2()%>" class="text_box" caption="종료일자" dataType="date">
						</td>
						<td align="left">
			                &nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">확장자
			                <input name="extnflnm" type="text" size="8" class="text_box" style="ime-mode:active;">
			                &nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">신청자
			                <input name="aplcpersnm" type="text" size="8" class="text_box" style="ime-mode:active;">
			                &nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구독자
			                <input name="rdrnm" type="text" size="8" class="text_box" style="ime-mode:active;">
			                &nbsp; <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">납부자
			                <input name="pymtflnm" type="text" size="8" class="text_box" style="ime-mode:active;">
						</td>
					</tr>
				</table>
-->

            </td>
        </tr>
        <tr bgcolor="#EBE9DC">
            <td height="27" colspan="2">
                <table width="100%" border="0" cellspacing="0" cellpadding="1">
                    <tr>
<%--
                    	<td width="402">
			            	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">유형
			                <select name="rdr_extntypecd" onChange="changeSearchHTML();extnblng_search();" class="sel_all">
			                    <option value='' selected>전체</option>
			                    %= ds.curextntypecdOptHtml("") %<!-- 확장유형코드, 코드명 목록 -->
			                </select>
			                &nbsp;&nbsp;<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">확장자소속
			                <select name="extnblngcd" id="extnblngcd_id" class="sel_all" onChange="changeSearchHTML();">
			                  <option value='' selected>전체</option>
			                </select>
			         	</td>
			         	<td>
                			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">매체
	                		<select name="medicd" class="sel_all"><!-- 매체코드, 코드명 목록 -->
%
							writeMediOpt(session, out, ds.curmedicdOptHtml(""), true);
%
                			</select>
--%>
                       <td>
			                <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">제휴코드
			                <select name="subscnfmstatcd" class="sel_all">
			                    <option value='' selected>전체</option>
			                    <%= ds.curcampcdOptHtml("")%><!-- 제휴마케팅 코드, 코드명 목록 -->
			                </select>
			                &nbsp;&nbsp;<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">제휴사
			                <select name="subscnfmstatcd" class="sel_all">
			                    <option value='' selected>전체</option>
			                    <%= ds.curcampcompcdOptHtml("")%><!-- 제휴사코드, 코드명 목록 -->
			                </select>
                       </td>
                       <td>
			                <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">확인
			                <select name="bo_headcnfmyn" class="sel_all"><!--확인구분-->
			                  <option value='' selected>전체</option>
			                  <option value='Y'>확인</option>
			                  <option value='N'>미확인</option>
<%--20050430 김대섭 수정(확인보류 추가)--%>
			                  <option value='B'>확인보류</option>
			                </select>
			                &nbsp;&nbsp;<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">오류
			                <select name="subscnfmstatcd" class="sel_all">
			                    <option value='' selected>전체</option>
			                    <%= ds.cursubscnfmstatcdOptHtml("")%><!-- 오류코드, 코드명 목록 -->
			                </select>
                       </td>
			      	</tr>
			   	</table>
            </td>
        </tr>
        <tr bgcolor="#927F5B">
          <td colspan="11" style height="1">
            <!--line -->
          </td>
        </tr>
        <tr>
          <td colspan="11" style height="3">
            <!--여백 -->
          </td>
        </tr>
    </form>
    </table>
    <!--확장 검색 끝 -------------------------------------------------------------------------->

    <!--확장 목록 시작 -------------------------------------------------------------------------->
    <table width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" id="extn_list_id">
    <form name="extn_list_form" method="post" action="" >
	    <input name="rdr_extntypecd" type="hidden" value ="">
	    <input name="aplcpathcd" type="hidden" value ="">
	    <input name="rdr_extndt" type="hidden" value ="">
	    <input name="rdr_extnno" type="hidden" value ="">
	    <input name="rdr_no" type="hidden" value ="">
	    <input name="medicd" type="hidden" value ="">
	    <input name="cntrno" type="hidden" value ="">
	    <input name="mangno" type="hidden" value ="">
        <input name="boheadcnfmyn" type="hidden" value="">
        <tr bgcolor="#DDDDDD" height="23">
            <td class="gray" align="center" width="80">독자번호</td>
            <td class="gray" align="center" width="*">구독자</td>
            <td class="gray" align="center" width="90">유가월</td>
            <td class="gray" align="center" width="40">부수</td>
            <td class="gray" align="center" width="60">자동이체</td>
            <td class="gray" align="center" width="60">지역</td>
            <td class="gray" align="center" width="70">지국</td>
            <td class="gray" align="center" width="65">신청일자</td>
            <td class="gray" align="center" width="75">확장일자</td>
            <td class="gray" align="center" width="65">확인일자</td>
            <td class="gray" align="center" width="40">확인</td>
            <td class="gray" align="center" width="40">오류</td>
        </tr>
        <%-- 초기화면 목록 반복 시작 --%>
        <%for(int i=0; i<extnListCount; i++){%>
        <tr>
            <td class="gray" align="center" width="80">&nbsp;</td>
            <td class="gray" align="center" width="*">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
            <td class="gray" align="center" width="40">&nbsp;</td>
            <td class="gray" align="center" width="60">&nbsp;</td>
            <td class="gray" align="center" width="60">&nbsp;</td>
            <td class="gray" align="center" width="70">&nbsp;</td>
            <td class="gray" align="center" width="65">&nbsp;</td>
            <td class="gray" align="center" width="75">&nbsp;</td>
            <td class="gray" align="center" width="65">&nbsp;</td>
            <td class="gray" align="center" width="40">&nbsp;</td>
            <td class="gray" align="center" width="40">&nbsp;</td>
        </tr>
        <%}%>
        <%-- 초기화면 목록 반복 끝 --%>

        <tr bgcolor="#DDDDDD" align="right">
            <td height="23" class="gray" colspan="12">
                <img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 조선닷컴 건</b>&nbsp;&nbsp;&nbsp;
                <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">  <b> 총부수 부</b>&nbsp;&nbsp;&nbsp;&nbsp;
                <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">  <b> 총건수 건</b>
            </td>
        </tr>
    </form>
    </table>
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
                    <jsp:param name = "pagesize" 	value="<%= extnListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- 페이지 이동 -->
    <!--확장 목록 끝 -------------------------------------------------------------------------->

</tr>
<tr>
    <td height="10">
        <!--여백-->
    </td>
</tr>
<tr>
    <td valign="top">
	<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr>
			<td  height="25" bgcolor="#EBE9DC" class="title">확장신청 상세내역</td>
		</tr>
		<tr>
			<td height="3">
			<!--여백-->
			</td>
		</tr>
	</table>

    <!--확장 상세 시작 -------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="1" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="extn_detail_id">

	    <!--일반정보 시작-->
	    <tr>
	        <td rowspan="2" class="gray" bgcolor="#EBE9DC"> 확장일반</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 확장유형</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 신청경로</td>
	        <td width="150" class="gray">&nbsp;</td>
            <td width="80" class="gray" bgcolor="#dddddd"> 신청페이지</td>
            <td width="150" class="gray">&nbsp;</td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> 매체</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 부수</td>
	        <td colspan="3" class="gray" align="right">&nbsp;</td>
	    </tr>
	    <!--일반정보 끝-->

	    <!--확장자 시작-->
        <%--
        <tr>
            <td class="gray" bgcolor="#EBE9DC"> 확장자</td>
            <td width="80" class="gray" bgcolor="#dddddd"> 성명</td>
            <td width="150" class="gray">&nbsp;</td>
            <td width="80" class="gray" bgcolor="#dddddd"> 전화번호</td>
            <td width="150" class="gray">&nbsp;</td>
            <td width="80" class="gray" bgcolor="#dddddd"> 휴대폰번호</td>
            <td width="150" class="gray">&nbsp;</td>
        </tr>
        --%>
	    <!--확장자 끝-->

	    <!--신청자 시작-->
	    <tr>
	        <td rowspan="2" class="gray" bgcolor="#EBE9DC"> 신청자</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 성명</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 전화번호</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 휴대폰번호</td>
	        <td width="150" class="gray">&nbsp;</td>
	    </tr>
        <tr>
            <td width="80" class="gray" bgcolor="#dddddd"> 이메일</td>
            <td width="150" class="gray">&nbsp;</td>
            <td width="80" class="gray" bgcolor="#dddddd"> 독자와의 관계</td>
            <td colspan="3" class="gray">&nbsp;</td>
        </tr>
	    <!--신청자 끝-->

	    <!--구독자 시작-->
	    <tr>
	        <td class="gray" bgcolor="#EBE9DC"> 구독자</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 성명</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 전화번호</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 휴대폰번호</td>
	        <td width="150" class="gray">&nbsp;</td>
	    </tr>
	    <!--구독자 끝-->

	    <!--납부자 시작-->
        <%--
        <tr>
            <td class="gray" bgcolor="#EBE9DC"> 납부자</td>
            <td width="80" class="gray" bgcolor="#dddddd"> 성명</td>
            <td width="150" class="gray">&nbsp;</td>
            <td width="80" class="gray" bgcolor="#dddddd"> 전화번호</td>
            <td width="150" class="gray">&nbsp;</td>
            <td width="80" class="gray" bgcolor="#dddddd"> 휴대폰번호</td>
            <td width="150" class="gray">&nbsp;</td>
        </tr>
        --%>
	    <!--납부자 끝-->

	    <!--배달정보 시작-->
	    <tr>
	        <td rowspan="5" class="gray" bgcolor="#EBE9DC"> 배달정보</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 배달주소</td>
	        <td colspan="5" class="gray">&nbsp;</td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> 지국명</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 지국전화번호</td>
	        <td colspan="3" class="gray">&nbsp;</td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> 배달희망일</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd">주거형태</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd">주거구분</td>
	        <td width="150" class="gray">&nbsp;</td>
	    </tr>
        <tr>
          <td width="80" class="gray" bgcolor="#dddddd">유가월</td>
          <td width="150" class="gray">&nbsp;</td>
          <td width="80" class="gray" bgcolor="#dddddd">무가기간</td>
          <td width="150" class="gray">&nbsp;</td>
          <td width="80" class="gray" bgcolor="#dddddd">이체여부</td>
          <td width="150" class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td width="80" class="gray" bgcolor="#dddddd">사은품</td>
          <td width="*" colspan="5" class="gray">&nbsp;</td>
        </tr>
	    <!--배달정보 끝-->

	    <!--독자비고 시작-->
	    <tr>
	        <td class="gray" bgcolor="#EBE9DC"> 독자비고</td>
	        <td colspan="6" class="gray">
	            <textarea name="aplcpersremk" style="ime-mode:active;" rows="3" cols="99" class="scroll1">&nbsp;</textarea>
	        </td>
	    </tr>
	    <!--독자비고 끝-->

	    <!--지국 시작-->
	    <tr>
	        <td rowspan="2" class="gray" bgcolor="#EBE9DC"> 지국</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 확인여부</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd"> 일시</td>
	        <td colspan="3" class="gray">&nbsp;</td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> 비고</td>
	        <td colspan="5" class="gray">
	            <textarea name="remk" style="ime-mode:active;" rows="3" cols="86" class="scroll1">&nbsp;</textarea>
	        </td>
	    </tr>
	    <!--지국 끝-->

	    <!--상담원 시작-->
	    <tr>
	        <td rowspan="2" class="gray" bgcolor="#EBE9DC">상담원</td>
	        <td width="80" class="gray" bgcolor="#dddddd">이름</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd">확인여부</td>
	        <td width="150" class="gray">&nbsp;</td>
	        <td width="80" class="gray" bgcolor="#dddddd">일시</td>
	        <td width="150" class="gray">&nbsp;</td>
	    </tr>
	    <tr>
	        <td width="80" class="gray" bgcolor="#dddddd"> 비고</td>
	        <td colspan="5" class="gray">
	            <textarea name="procmsg" style="ime-mode:active;" rows="3" cols="86" class="scroll1">&nbsp;</textarea>
	        </td>
	    </tr>
	    <!--상담원 끝-->
	</table>
    <!--확장 상세 끝 -------------------------------------------------------------------------->

    </td>
</tr>
</table>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<!--엔터키에 의한 지국검색을위한 폼-->
<form name="bo_enter_search_form" method="post" action="" style="display:none";>
    <input name="deptcd" type="hidden" value ="">	<!--부서코드-->
    <input name="areacd" type="hidden" value ="">	<!--지역코드-->
    <input name="bonm" type="hidden" value ="">		<!--지국명-->
</form>
</body>
</html>
