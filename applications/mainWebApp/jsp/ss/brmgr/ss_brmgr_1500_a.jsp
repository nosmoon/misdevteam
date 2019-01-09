<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1500_a.jsp
* 기능 : 지국경영-공정위위약금-초기화면
* 작성일자 : 2004-02-23
* 작성자 : 김성규
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //	dataset 인스턴스 선언부분
	SS_L_FCT_FRFT_INITDataSet ds = (SS_L_FCT_FRFT_INITDataSet)request.getAttribute("ds");
    int fctListCount = 10;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.list_search_form.bonm.focus(); //초기화면의 부서(팀) 코드 Focus
}
// form 단위로 유효성을 검증
function check_all(form){
	if(!validate(form)) return false;
	else{
		makeValue(form);
		return true;
	}
}
// Form Elements를 초기화
function clearFormElements(form){
	var c = form.elements;
	if(!c.length) return;

	for( var i = 0; i < c.length ; i++){
		c[i].value = "";
		if (c[i].type == 'checkbox') {
			c[i].checked = false;
		}
	}
}

// 지역 검색
function area_search(flag){
    if(flag == '1'){        // 검색 폼 지역 검색
	    var lo_form1 = document.list_search_form;
        if(lo_form1.deptcd.value == '') {
            var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                          "<option value='' selected>전체</option>" +
                      "</select>"
            document.all.areacd_id.outerHTML = str;
            return;
        }

        // 부서(팀)코드값을 "/ss/common/1100" 서블릿으로 보낸다
        lo_form1.action = "/ss/common/1100";
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
        lo_form1.target = "ifrm";
        lo_form1.submit();

    }else if(flag == '2'){  // 상세 폼 공정위위약금 지역 검색
	    var lo_form1 = document.detail_form;
        if(lo_form1.deptcd.value == '') {
            var str = "<select id=fct_frft_areacd_id name=\"areacd\" class=\"sel_all\">" +
                          "<option value='' selected>선택</option>" +
                      "</select>"
            document.all.fct_frft_areacd_id.outerHTML = str;
            return;
        }

        // 부서(팀)코드값을 "/ss/common/1107" 서블릿으로 보낸다
        lo_form1.action = "/ss/common/1107";
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
        lo_form1.target = "ifrm";
        lo_form1.submit();
   }
}

// 공정위 위약금 리스트 조회
function list_search() {
	var lo_form1 = document.list_search_form;

    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';

	if(!check_all(lo_form1)) return;

    // 검색 조건을 "/ss/brmgr/1510" 서블릿으로 보낸다
	lo_form1.action = "/ss/brmgr/1510";
	lo_form1.target = "ifrm";
	lo_form1.submit();

}

// 지국찾기 팝업
// 지국찾기가 2개이므로 매개변수를 통해 구분해 처리한다.
function bo_search(no){
    if(no == '1'){				// 검색 폼 지국검색
	    var lo_form1 = document.list_search_form;
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
    }else if(no == '2'){			// 상세 폼 지국검색
	    var lo_form1 = document.detail_form;
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
            		'<select name="areacd" size="1" id="fct_frft_areacd_id" class="sel_all">' +
            		'<option value="' +
            		la_str[4] +
            		'" selected>' +
            		la_str[5] +
            		'</option>';
        }
    }
	return;
}

// 검색/상세 폼 검색 구분 전역변수
var gs_no;

// 엔터키에 의한 지국찾기
function bo_enter_search(no){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    if(no == '1'){					// 검색 폼 지국검색
	    var lo_form1 = document.list_search_form;

	    //지국명이 존재하지 않으면 지국검색팝업을 띄운다.
		if(lo_form1.bonm.value == ''){
			bo_search('1');
			return;
		}

    }else if(no == '2'){			// 상세 폼 지국검색
	    var lo_form1 = document.detail_form;

	    //지국명이 존재하지 않으면 지국검색팝업을 띄운다.
		if(lo_form1.bonm.value == ''){
			bo_search('2');
			return;
		}
	}

	// 전역변수에 검색/상세 구분값 설정
	gs_no = no;

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
		// 검색 폼
		if(gs_no == '1'){
			var lo_form1 = ifrm.document.bo_detail_form;
			var lo_form2 = document.list_search_form;
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
			var lo_form2 = document.detail_form;

			lo_form2.deptcd.value = lo_form1.deptcd.value;
	        lo_form2.areacd.outerHTML =
	        		'<select name="areacd" size="1" id="fct_frft_areacd_id" class="sel_all">' +
	        		'<option value="' +
	        		lo_form1.areacd.value +
	        		'" selected>' +
	        		lo_form1.areanm.value +
	        		'</option>';
			lo_form2.bocd.value = lo_form1.bocd.value;
			lo_form2.bonm.value = lo_form1.bonm.value;
		}

	// 검색결과가 없거나 여러건이므로 지국찾기 팝업을 띄운다.
	}else if(no == '2'){
		bo_search(gs_no);
	}
}

// 상세보기
function detail_view(impndt, deptcd, areacd, bocd, viltresn){
    var lo_form1 = document.detail_form;

    // 부과일자, 지국지사코드, 지역코드를 "/ss/brmgr/1520" 서블릿으로 보낸다
    lo_form1.impndt_pk.value = impndt;
    lo_form1.deptcd_pk.value = deptcd;
    lo_form1.areacd_pk.value = areacd;
    lo_form1.bocd.value = bocd;
    lo_form1.viltresn_pk.value = viltresn;

    lo_form1.action = "/ss/brmgr/1520";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {

    var lo_form1 = document.list_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 검색 조건을 "/ss/brmgr/1510" 서블릿으로 보낸다
    lo_form1.action = "/ss/brmgr/1510";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 등록, 수정, 삭제
function fct_frft_aceess(accflag1){

	var lo_form1 = document.detail_form;

	// 추가 버튼
	if (accflag1 == 'I') {
		clearFormElements(lo_form1);

	    if(lo_form1.deptcd.value == '') {
	        var str = "<select id=fct_frft_areacd_id name=\"areacd\" class=\"sel_all\">" +
	                      "<option value='' selected>선택</option>" +
	                  "</select>"
	        document.all.fct_frft_areacd_id.outerHTML = str;
	    }

		lo_form1.accflag.value = accflag1;
		document.all.cancel_id.disabled = true;	//취소버튼 비활성화
		return;
	// 저장
	} else if (accflag1 == 'U') {
		// 등록
		if (lo_form1.accflag.value == 'I') {
			if(!validate(lo_form1)) {
				return false;
			}

    		if(!check_all(lo_form1)) return;								// 폼 유효성 체크

			lo_form1.action = "/ss/brmgr/1530";
			lo_form1.target = "ifrm";
			lo_form1.submit();
		// 수정
		} else if (isEmpty(lo_form1.accflag.value) || lo_form1.accflag.value == 'U') {
			if ( lo_form1.impndt.value.length == 0 || lo_form1.viltresn.value.length == 0 || lo_form1.bocd.value.length == 0 )
			{
				alert("수정할 공정위 위약금 내역을 위에서 선택하십시요");
				return false;
			}
			if(!validate(lo_form1)) {
				return false;
			}

    		if(!check_all(lo_form1)) return;								// 폼 유효성 체크

			lo_form1.accflag.value = accflag1;
			lo_form1.action = "/ss/brmgr/1540";
			lo_form1.target = "ifrm";
			lo_form1.submit();
		}
	// 삭제
	} else if (accflag1 == 'D') {
		if ( lo_form1.impndt.value.length == 0 || lo_form1.viltresn.value.length == 0 || lo_form1.bocd.value.length == 0 )
		{
			alert("삭제할 공정위 위약금 내역을 위에서 선택하십시요");
			return false;
		}
    	if(!check_all(lo_form1)) return;								// 폼 유효성 체크

		lo_form1.accflag.value = accflag1;
		lo_form1.action = "/ss/brmgr/1550";
		lo_form1.target = "ifrm";
		lo_form1.submit();
	}
}

//취소 버튼
function reset_detail_view_form() {
	var lo_form1 = document.detail_form;
	lo_form1.reset();
	setEventHandler();						//이벤트핸들러 호출
}


// 목록에서 선택된 로우 전역변수
var go_sel_row;

// 선택된 로우 색깔 바꾸기
function change_sel_row(obj){
	go_sel_row = obj;
	obj.style.backgroundColor='#BFD2DD';
	lo_table = obj.parentNode;
	for(i=1; i<lo_table.rows.length-2; i++){
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

    var lo_form1 = document.list_search_form;	// 검색 폼
    var lo_form2 = document.detail_form;		// 상세 폼

	if(flag == '1'){			// 검색 부서(팀),지역,지국 초기화
		// 부서(팀) 초기화
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search(\'1\');" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.deptlistOptHtml(""), true); %>'
									+'</select>';
		// 지역 초기화
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" class="sel_all" id="areacd_id">'
									+'<% writeAreaOpt(session, out, true); %>'
									+'</select>';
		// 지국코드,지국명 초기화, 포커스이동
		lo_form1.bocd.value = "";
		lo_form1.bonm.value = "";
		lo_form1.bonm.focus();
	}else if(flag == '2'){		// 상세 부서(팀),지역,지국 초기화
		// 부서(팀) 초기화
		lo_form2.deptcd.outerHTML =  '<select name="deptcd" size="1" class="sel_all" notEmpty caption="팀" onChange="area_search(\'2\');">'
									+'<% writeDeptOpt(session, out, ds.deptlistOptHtml(""), false); %>'
									+'</select>';
		// 지역 초기화
		lo_form2.areacd.outerHTML =  '<select name="areacd" size="1" class="sel_all" notEmpty caption="지역" id="fct_frft_areacd_id">'
									+'<% writeAreaOpt(session, out, false); %>'
									+'</select>';
		// 지국코드,지국명 초기화, 포커스이동
		lo_form2.bocd.value = "";
		lo_form2.bonm.value = "";
		lo_form2.bonm.focus();
	}else if(flag == '4'){		// 기간 초기화
	}else if(flag == '5'){		// 기타 초기화
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
    var lo_form1 = document.list_search_form;

	if(lo_form1.bonm.value == ''){
		lo_form1.bocd.value = '';
		list_search();
	}else{
		gs_no = '1';

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
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >지국경영
      &gt; </b> 공정위위약금</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
<tr><td>

<!--공정위위약금 검색 시작-->
<table width="830" border="0" cellspacing="0" cellpadding="2">
<form name="list_search_form" method="post" action="">
	<input name="common_deptcd" type="hidden" value ="">                    <!-- 공통 부서(팀)코드 -->
	<input name="bocd" type="hidden" value ="" maxlength="5" >
	<input name="pageno" type="hidden" value ="1">
	<input name="pagesize" type="hidden" value ="<%= fctListCount%>">
	<input name="js_fn_nm" type="hidden" value ="page_move">
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->

	<tr>
		<td bgcolor="#EBE9DC" width="40" class="sea_top">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">팀&nbsp;</td>
		<td bgcolor="#EBE9DC" width="80" class="sea_top">
			<select name="deptcd" size="1" class="sel_all" caption="팀" onChange="area_search('1');">
<%
			writeDeptOpt(session, out, ds.deptlistOptHtml(""), true);
%>
			</select>
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="80">
			<select name="areacd" size="1" class="sel_all" id="areacd_id">
<%
				writeAreaOpt(session, out, true);
%>
			</select>
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="160">
			<input name="bonm" type="text" style="ime-mode:active;" size="8" class="text_box" onkeydown="bo_enter_search('1');">
			<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" style="cursor:hand" width="39" height="19" align="absmiddle" onclick="javascript:bo_search('1');window.event.returnValue=false;"><!--지국검색팝업-->
			<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서(팀),지역,지국 초기화-->
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="60">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부과기간</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="180">
			<input name="frdt" type="text" size="10" class="text_box" dataType="date">
			-
			<input name="todt" type="text" size="10" class="text_box" dataType="date">
		</td>
		<td rowspan="2" bgcolor="#EBE9DC" class="sea_top" align="right">
			<input type="image" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"><!--목록 조회-->
		</td>
	</tr>
	<tr>
		<td bgcolor="#EBE9DC" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">사유</td>
		<td colspan="3" bgcolor="#EBE9DC" align="left">
			<select name="viltresn" size="1" class="sel_all">
				<option value="" selected>전체</option>
				<%= ds.viltresnlistOptHtml("") %>
			</select>
		</td>
		<td colspan="2" bgcolor="#EBE9DC">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">독자명
			<input name="rdrnm" type="text" style="ime-mode:active;" size="8" class="text_box">
		</td>
		<td colspan="2" bgcolor="#EBE9DC">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">심의결과
			<select name="delbocom" class="sel_all">
				<option value="" selected>전체</option>
				<%= ds.delbocomlistOptHtml("") %>
			</select>
		</td>
	</tr>
	<tr bgcolor="#927F5B">
		<td colspan="10" height="1">
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
<!--공정위위약금 검색 끝-->

<!--공정위위약금 목록 시작-->
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="fct_frft_list">
	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray" width="65"> 부과일자 </td>
		<td rowspan="2" class="gray" width="50"> 지국 </td>
		<td rowspan="2" class="gray" width="85"> 위약사유 </td>
		<td rowspan="2" class="gray" width="60"> 독자명 </td>
		<td rowspan="2" class="gray" width="60"> 심의 </td>
		<td rowspan="2" class="gray" width="60"> 위약금액 </td>
		<td height="17" colspan="3" class="gray"> 본사 </td>
		<td colspan="3" class="gray"> 지국 </td>
		<td rowspan="2" class="gray" width="60"> 보류금액&nbsp; </td>
	</tr>
	<tr align="center">
		<td  bgcolor="#dddddd" class="gray" width="65"> 입금액 </td>
		<td  bgcolor="#dddddd" class="gray" width="65"> 입금일자 </td>
		<td  bgcolor="#dddddd" class="gray" width="65"> 미납금액 </td>
		<td  bgcolor="#dddddd" class="gray" width="65"> 입금액 </td>
		<td  bgcolor="#dddddd" class="gray" width="65"> 입금일자 </td>
		<td  bgcolor="#dddddd" class="gray" width="65"> 미납금액 </td>
	</tr>

	<%-- 초기화면 목록 반복 시작 --%>
	<%for(int i=0; i<fctListCount; i++){%>
	<tr>
		<td class="gray" align="center" width="65">&nbsp;</td>
		<td class="gray" width="50">&nbsp; </td>
		<td class="gray" width="85">&nbsp; </td>
		<td class="gray" width="60">&nbsp; </td>
		<td class="gray" align="center" width="60">&nbsp; </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
		<td class="gray" align="right" width="65">&nbsp; </td>
		<td class="gray" align="center" width="65">&nbsp; </td>
		<td class="gray" align="right" width="65">&nbsp; </td>
		<td class="gray" align="right" width="65">&nbsp; </td>
		<td class="gray" align="center" width="65">&nbsp; </td>
		<td class="gray" align="right" width="65">&nbsp; </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
	</tr>
    <%}%>
    <%-- 초기화면 목록 반복 끝 --%>

	<tr bgcolor="#dddddd" height="23">
		<td colspan="5" align="center" class="gray"> 계 </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
		<td class="gray" align="center" width="60"> - </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
		<td class="gray" align="center" width="60"> - </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
	</tr>
	<tr bgcolor="#dddddd" align="right">
	  	<td colspan="13" class="gray" height="23">
	  		<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>총건수 건</b>
	   </td>
	</tr>
</table>
<!--공정위위약금 목록 끝-->

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
                <jsp:param name = "pagesize" 	value="<%= fctListCount%>"/>
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
	<!--여백 -->
</td>
</tr>
<td>


<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr>
    <td  height="25" bgcolor="#EBE9DC" class="title">위약금 상세내역</td>
  </tr>
  <tr>
    <td height="3">
      <!--여백-->
    </td>
  </tr>
</table>

<!--공정위위약금 상세 시작-->
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="fct_frft_detail">
<form name="detail_form" method="post" action="">
	<input type="hidden" name="common_deptcd" value ="">
	<input type="hidden" name="bocd" value ="" maxlength="5" >                   <!-- 공통 부서(팀)코드 -->
	<input type="hidden" name="accflag" value ="I" maxlength="5" >
	<input type="hidden" name="impndt_pk" value="">
	<input type="hidden" name="deptcd_pk" value="">
	<input type="hidden" name="areacd_pk" value="">
	<input type="hidden" name="viltresn_pk" value="">

	<tr>
		<td bgcolor="#dddddd" class="gray" width="90">지국
		</td>
		<td class="gray" width="250">팀&nbsp;
			<select name="deptcd" size="1" class="sel_all" notEmpty caption="팀" onChange="area_search('2');">
<%
			writeDeptOpt(session, out, ds.deptlistOptHtml(""), false);
%>
			</select>
			지역
			<select name="areacd" size="1" class="sel_all" notEmpty caption="지역" id="fct_frft_areacd_id">
<%
			writeAreaOpt(session, out, false);
%>
			</select>
		</td>
		<td class="gray" colspan="2">
			지국
			<input name="bonm" type="text" notEmpty style="ime-mode:active;" size="8" class="text_box" onkeydown="bo_enter_search('2');">
			<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" style="cursor:hand" height="19" align="absmiddle" onclick="javascript:bo_search('2');window.event.returnValue=false;"><!--지국검색팝업-->
			<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--부서(팀),지역,지국 초기화-->
		</td>
		<td bgcolor="#dddddd" class="gray" width="90">위반건수</td>
		<td class="gray">
			<input name="viltnoit" type="text" size="4" class="text_box"> 건
		</td>
	</tr>

	<tr>
		<td width="90" height="26" bgcolor="#dddddd" class="gray">부과일자 </td>
		<td class="gray" width="250">
			<input type="text" name="impndt" notEmpty caption="부과일자" class="text_box" dataType="date">
		</td>
		<td width="90" bgcolor="#dddddd" class="gray">독자명 </td>
		<td colspan="3" class="gray">
			<input type="text" style="ime-mode:active;" name="rdrnm" caption="독자명" class="text_box">
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="90">부과금액 </td>
		<td class="gray" width="250">
			<input type="text" name="frftimpnamt" class="text_box" caption="부과금액" dataType="number" style="text-align:right" comma>
		</td>
		<td width="90" bgcolor="#dddddd" class="gray">보류금액 </td>
		<td colspan="3" class="gray">
			<input type="text" name="resamt" class="text_box" caption="보류금액" dataType="number"  style="text-align:right" comma>
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="90">심의결과 </td>
		<td class="gray" width="250">
			<select name="delbocom" caption="심의결과" class="sel_all">
				<option value="" selected>선택</option>
				<%= ds.delbocomlistOptHtml("") %>
			</select>
		</td>
		<td width="90" bgcolor="#dddddd" class="gray">위약사유</td>
		<td colspan="3" class="gray">
			<select name="viltresn" notEmpty  size="1" class="sel_all" caption="위약사유" >
				<option value="" selected>선택</option>
				<%= ds.viltresnlistOptHtml("") %>
			</select>
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="90">본사입금액 </td>
		<td class="gray" width="250">
			<input type="text" caption="본사입금액" class="text_box" dataType="number" name="hdqtrcpmamt" style="text-align:right" comma>
		</td>
		<td width="90" bgcolor="#dddddd" class="gray">본사입금일자 </td>
		<td class="gray">
			<input type="text" name="hdqtrcpmdt" dataType="date" caption="본사입금일자" class="text_box">
		</td>
		<td width="90" bgcolor="#dddddd" class="gray">본사미납금액 </td>
		<td class="gray">
			<input type="text" name="hdqtun_pymtamt" class="text_box" caption="본사미납금액" dataType="number" style="text-align:right" comma>
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="90">지국입금액 </td>
		<td class="gray" width="250">
			<input type="text" name="borcpmamt" class="text_box" caption="지국입금액" dataType="number" style="text-align:right" comma>
		</td>
		<td width="90" bgcolor="#dddddd" class="gray">지국입금일자 </td>
		<td class="gray" width="200">
			<input type="text" name="borcpmdt" caption="지국입금일자" dataType="date" class="text_box">
		</td>
		<td bgcolor="#dddddd" class="gray" width="90">지국미납금액 </td>
		<td class="gray">
			<input type="text" name="boun_pymtamt" class="text_box" caption="지국미납금액" dataType="number" style="text-align:right" comma>
		</td>
	</tr>
</form>
</table>

<!--button -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
	<tr>
		<td align="center" height="2">
		<!--여백-->
		</td>
	</tr>
	<tr>
		<td align="center" height="24" bgcolor="#E8E8E8">
			<input type="image" id="add_id" border="0" src="/html/comm_img/bu_new.gif" width="39" style="cursor:hand" height="19" align="absmiddle" border="0" onclick="javascript:fct_frft_aceess('I')">
			<input type="image" id="save_id" border="0" src="/html/comm_img/bu_save.gif" width="39" style="cursor:hand" height="19" align="absmiddle" border="0" onclick="fct_frft_aceess('U')">
			<input type="image" id="del_id" border="0" src="/html/comm_img/bu_del.gif" width="39" style="cursor:hand" height="19" align="absmiddle" border="0" onclick="javascript:fct_frft_aceess('D')">
			<input type="image" id="cancel_id" border="0" src="/html/comm_img/bu_cancel.gif" width="39" style="cursor:hand" height="19" align="absmiddle" border="0" onclick="reset_detail_view_form()">
		</td>
	</tr>
</table>

</td>
</tr>
</table>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
