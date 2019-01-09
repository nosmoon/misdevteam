<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1240_a.jsp
* 기능 : 지국지원-신문지원물품-비용(영업담당)-초기화면
* 작성일자 : 2004-02-07
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
	String paramGbn = "##";
    applySession = true;	// 세션 적용 여부
    int listCount = 10;		// 화면당 항목수
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
	document.cost_search_form.bonm.focus();
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

    var lo_form1 = document.cost_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>선택</option>" +
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
    var lo_form1 = document.cost_search_form;
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

    var lo_form1 = document.cost_search_form;

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
		var lo_form2 = document.cost_search_form;
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
function list_search()
{
    var lo_form1 = document.cost_search_form;

    // 화면제어와 성능을 위해 부서(팀),지역을 필수로 선택한 후 검색하게 한다.
	if(lo_form1.deptcd.value == '' && lo_form1.bonm.value == ''){
		alert("팀을 선택하세요");
		return;
    }
/*
    if(lo_form1.areacd.value == ''){
		alert("지역을 선택하세요");
		return;
    }
*/
    if(!check_all(lo_form1)) return;			// 폼 유효성 체크

    // 확장신청목록 조회조건을 "/ss/brsup/1245" 서블릿으로 보낸다
    lo_form1.action = "/ss/brsup/1245";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 취소
function cost_cancel(){
    var lo_form1 = document.cost_list_form;

	lo_form1.reset();
}

// 비용 상세보기
function detail_view(basidt, deptcd, areacd, bocd){
	// 상세 화면 처리를 위해 hidden 폼을 사용한다.
    var lo_form1 = document.detail_form;

    // 신문지원물품비용 기준일자, 지국코드를 "/ss/brsup/1250" 서블릿으로 보낸다
    lo_form1.basidt.value = basidt;
    lo_form1.deptcd.value = deptcd;
    lo_form1.areacd.value = areacd;
    lo_form1.bocd.value = bocd;

    lo_form1.action = "/ss/brsup/1250";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 저장
function cost_save(){
    var lo_form1 = document.cost_list_form;

	if(lo_form1.clamt == null){					// 수금액 입력항목이 없을 경우
		return;
	}else if(lo_form1.clamt.type == "text"){	// 수금액 입력항목이 한 건인 경우
		// 수금액이 입력되지 않은 경우
		if(lo_form1.clamt.value == ''){
			return;
		}
		lo_form1.basidtary.value = lo_form1.basidt.value;
		lo_form1.deptcdary.value = lo_form1.deptcd.value;
		lo_form1.areacdary.value = lo_form1.areacd.value;
		lo_form1.bocdary.value = lo_form1.bocd.value;
		lo_form1.clamtary.value = lo_form1.clamt.value;
		lo_form1.rcpmpersnmary.value = lo_form1.rcpmpersnm.value;

	}else{										// 수금액 입력항목이 여러 건인 경우
	    // 기준일자, 부서(팀)코드, 지역코드, 지국지사코드, 수금액, 입금자명 을 문자열 집합으로 만든다.
		var ls_basidtary = "";
		var ls_deptcdary = "";
		var ls_areacdary = "";
		var ls_bocdary = "";
		var ls_clamtary = "";
		var ls_rcpmpersnmary = "";

	    for(var i=0; i<lo_form1.clamt.length; i++) {
	    	if(lo_form1.clamt[i].value == ''){	// 수금액이 없는 경우는 skip 한다.
	    		continue;
	    	}

			ls_basidtary = ls_basidtary + lo_form1.basidt[i].value + "<%= paramGbn%>";
			ls_deptcdary = ls_deptcdary + lo_form1.deptcd[i].value + "<%= paramGbn%>";
			ls_areacdary = ls_areacdary + lo_form1.areacd[i].value + "<%= paramGbn%>";
			ls_bocdary = ls_bocdary + lo_form1.bocd[i].value + "<%= paramGbn%>";
			ls_clamtary = ls_clamtary + lo_form1.clamt[i].value + "<%= paramGbn%>";
			ls_rcpmpersnmary = ls_rcpmpersnmary + lo_form1.rcpmpersnm[i].value + "<%= paramGbn%>";
	    }
		lo_form1.basidtary.value = ls_basidtary.substring(0, ls_basidtary.length-2);
		lo_form1.deptcdary.value = ls_deptcdary.substring(0, ls_deptcdary.length-2);
		lo_form1.areacdary.value = ls_areacdary.substring(0, ls_areacdary.length-2);
		lo_form1.bocdary.value = ls_bocdary.substring(0, ls_bocdary.length-2);
		lo_form1.clamtary.value = ls_clamtary.substring(0, ls_clamtary.length-2);
		lo_form1.rcpmpersnmary.value = ls_rcpmpersnmary.substring(0, ls_rcpmpersnmary.length-2);
	}
    // 기준일자, 부서(팀)코드, 지역코드, 지국지사코드, 수금액, 입금자명 문자열 집합정보를 "/ss/brsup/1255" 서블릿으로 보낸다.
    lo_form1.action = "/ss/brsup/1255";
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

    var lo_form1 = document.cost_search_form;

	if(flag == '1'){			// 부서(팀),지역,지국 초기화
		// 부서(팀) 초기화
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search();" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.curcommlistOptHtml(""), false); %>'
									+'</select>';
		// 지역 초기화
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" id="areacd_id" class="sel_all">'
									+'<% writeAreaOpt(session, out, false); %>'
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
    var lo_form1 = document.cost_search_form;

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
-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >지국지원
       </b>신문지원물품 &gt; 비용 </td>
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
      <!--신문지원물품 비용 검색 시작 ---------------------------------------------------------------------------->
      <table width="830" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" id="cost_search_id">
      <form name="cost_search_form" method="post" action="" >
        <input name="common_deptcd" type="hidden" value ="">                    <!-- 공통 부서(팀)코드 -->
        <input name="bocd" type="hidden" value ="">                    			<!-- 지국코드 -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
        <tr>
          <td bgcolor="#EBE9DC" width="40" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">팀&nbsp;</td>
          <td width="80" class="title">
            <select name="deptcd" onChange="area_search();" class="sel_all"><!-- 부서(팀)코드, 코드명 목록 -->
<%
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), false);
%>
            </select>
          </td>
          <td bgcolor="#EBE9DC" width="40" class="title"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역</td>
          <td width="80" class="title">
            <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--지역코드, 지역명 목록-->
<%
					writeAreaOpt(session, out, false);
%>
            </select>
          </td>
          <td bgcolor="#EBE9DC" width="40" class="title">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국</td>
          <td bgcolor="#EBE9DC" width="180" class="title">
            <input name="bonm" type="text" style="ime-mode:active;" size="8" class="text_box" onkeydown="bo_enter_search();">
            <input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"><!--지국검색팝업-->
            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서(팀),지역,지국 초기화-->
          </td>
          <td width="42" class="title">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">년월</td>
          <td width="64" class="title">
            <input name="basidt" type="text" size="7" class="text_box" caption="년월" value="<%= Util.getYyyyMm()%>" dataType="month">
          </td>
          <td width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">완료</td>
          <td class="title">
            <select name="accflag" size="1" class="sel_all">
              <option value="" selected>전체</option>
              <option value="Y">완납</option>
              <option value="N">미납</option>
            </select>
          </td>
          <td align="right" class="title">
            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"></td><!--목록 조회-->
          </td>
        </tr>
	  </form>
      </table>
         <!--신문지원물품 비용 검색 끝 ---------------------------------------------------------------------------->
    </td>
  </tr>
  <tr>
    <td height="3">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
    <td height="10">

	<!--타이틀박스-->
	<table width="830" border="0"  cellpadding="1" cellspacing="0">
		<tr>
			<td  height="27" bgcolor="#EBE9DC" class="title">신문지원물품 비용목록</td>
			<td  height="27" bgcolor="#EBE9DC" class="title" width="200" align="right">
				<input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:cost_save()">
            <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:cost_cancel()">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
			<!--여백-->
			</td>
		</tr>
	</table>

    <!--신문지원물품 비용 목록 시작 ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
    <form name="cost_list_form" method="post" action="" >
        <input name="basidtary" type="hidden" value ="">		<!--기준일자 집합 문자열-->
        <input name="deptcdary" type="hidden" value ="">		<!--부서(팀)코드 집합 문자열-->
        <input name="areacdary" type="hidden" value ="">		<!--지역코드 집합 문자열-->
        <input name="bocdary" type="hidden" value ="">			<!--지국지사코드 집합 문자열-->
        <input name="clamtary" type="hidden" value ="">			<!--수금액 집합 문자열-->
        <input name="rcpmpersnmary" type="hidden" value ="">	<!--입금자명 집합 문자열-->

		<tr bgcolor="#dddddd" align="center" height="23">
			<td width="100" class="gray">팀&nbsp;</td>
			<td width="100" class="gray">지역</td>
			<td class="gray">지국</td>
			<td width="90" class="gray">물품대금</td>
			<td width="90" class="gray">입금액</td>
			<td width="90" class="gray">잔액</td>
			<td width="100" class="gray">입금자</td>
			<td width="100" class="gray">완납일자</td>
		</tr>

        <%-- 초기화면 목록 반복 시작 --%>
		<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td width="100" class="gray">&nbsp;</td>
			<td width="100" class="gray">&nbsp;</td>
			<td class="gray">&nbsp;</td>
			<td width="90" class="gray">&nbsp;</td>
			<td width="90" class="gray"><input name="text" type="text" size="10" class="text_box" value=""></td>
			<td width="90" class="gray">&nbsp;</td>
			<td width="100" class="gray"><input name="text" type="text" size="10" class="text_box" value=""></td>
			<td width="100" class="gray">&nbsp;</td>
		</tr>
		<%}%>
        <%-- 초기화면 목록 반복 끝 --%>
		<tr bgcolor="#dddddd" height="23">
			<td colspan="8" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
			</td>
		</tr>
    </form>
    </table>
    <!--신문지원물품 비용 목록 끝 ---------------------------------------------------------------------------->

	</td>
  </tr>
  <tr>
    <td height="10">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
	<td>
    <!--신문지원물품 비용 상세 시작 ---------------------------------------------------------------------------->
    <table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
	</table>
    <!--신문지원물품 비용 상세 끝 ---------------------------------------------------------------------------->
  </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<!-- 목록화면에서 상세, 저장 두 이벤트가 발생하고 각각 지국지사코드 등을 사용하므로, 상세 이벤트를 처리하기 위한 별도의 폼을 hidden으로 만든다.-->
<form name="detail_form" method="post" style="display:none">
    <input name="basidt" type="hidden" value ="">		<!--기준일자 -->
    <input name="deptcd" type="hidden" value ="">		<!--부서(팀)코드 -->
    <input name="areacd" type="hidden" value ="">		<!--지역코드 -->
    <input name="bocd" type="hidden" value ="">			<!--지국지사코드 -->
</form>

</body>
</html>
