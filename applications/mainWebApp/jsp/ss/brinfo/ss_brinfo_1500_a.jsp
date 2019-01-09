<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1500_a.jsp
* 기능 : 지국Info-전세지원자금현황-초기화면
* 작성일자 : 2004-05-19
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
	int asetListCount = 10;	// 한 화면당 보여줄 항목 수
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
	document.aset_search_form.bonm.focus(); 	//초기화면의 지국명 Focus
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
    var lo_form1 = document.aset_search_form;
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
    var lo_form1 = document.aset_search_form;

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

    var lo_form1 = document.aset_search_form

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
		var lo_form2 = document.aset_search_form;
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
    var lo_form1 = document.aset_search_form;

    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	// 조회조건을 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/brinfo/1510";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.aset_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 조회조건을 "/ss/move/1010" 서블릿으로 보낸다
    lo_form1.action = "/ss/move/1010";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}


//상세정보 조회
function detail_view(deptcd, areacd, bocd, seq) {
	var lo_form1 = document.aset_detail_form;
	lo_form1.deptcd.value = deptcd;
	lo_form1.areacd.value = areacd;
	lo_form1.bocd.value = bocd;
	lo_form1.seq.value = seq;

	lo_form1.action = "/ss/brinfo/1520";
	lo_form1.target = "ifrm";
	lo_form1.submit();

}

// 저장
function save() {
	var lo_form1 = document.aset_detail_form;

	// 부서,지역,지국지사코드,순번의  존재여부를 확인한다.
	if(lo_form1.deptcd.value == '' || lo_form1.areacd.value == '' || lo_form1.bocd.value == '' || lo_form1.seq.value == '' ){
        alert("해당목록을 클릭하세요.");
        return;
	}

	// 체크박스 선택여부에 따른 'Y' 또는 'N' 설정
	var c = lo_form1.elements;

	if(!c.length) return;
	for( var i = 0; i < c.length ; i++){

		if (c[i].type == 'checkbox' && c[i].checked == true) {
			c[i].value = 'Y';
		} else if (c[i].type == 'checkbox' && c[i].checked == false) {
			c[i].value = 'N';
		}
	}

	lo_form1.action = "/ss/brinfo/1530";
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

    var lo_form1 = document.aset_search_form;

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
    var lo_form1 = document.aset_search_form;

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
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="javascript:jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >지국Info
      &gt; </b> 전세지원금현황</td>
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

<!--검색 -->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="aset_search_form" method="post" action="">
	<input type="hidden" name="common_deptcd" value ="">                   	<!-- 공통 부서코드 -->
	<input type="hidden" name="bocd" value ="">                         	<!-- 지국지사코드 -->
	<input type="hidden" name="pageno" value ="1">							<!-- 현재 페이지 번호 -->
	<input type="hidden" name="pagesize" value ="<%= asetListCount%>">		<!-- 한 화면당 리스트 항목 수 -->
	<input type="hidden" name="js_fn_nm" value ="page_move">
	<input name="applySession" type="hidden" value ="<%= applySession%>"> 	<!-- 세션 적용 여부 -->

	<tr>
		<td bgcolor="#EBE9DC" width="50" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">팀&nbsp;</td>
		<td bgcolor="#EBE9DC" width="100" class="sea_top" align="left">
		  <select name="deptcd" size="1" class="sel_all" onChange="area_search();">
		    <%	writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true); %>
		  </select>
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="50""><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
		  지역</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="200" align="left">
		  <select name="areacd" size="1" class="sel_all" id="areacd_id">
			<%	writeAreaOpt(session, out, true); %>
		  </select>
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="50""><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="180" align="left">
		  <input name="bonm" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
		  <input type="image" src="/html/comm_img/bu_search02.gif" width="39" style="cursor:hand" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;">
		  <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
		</td>
        <td bgcolor="#EBE9DC" rowspan="2" align="right" class="sea_top">
			<input type="image" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"><!--목록 조회-->
		</td>
	</tr>
	<tr>
		<td colspan="2" bgcolor="#EBE9DC" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
			지국장명
		  	<input name="presi_nm" type="text" size="10" class="text_box" style="ime-mode:active;">
		</td>
		<td colspan="2" bgcolor="#EBE9DC" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
			지국사무실소유주
		  	<input name="booffi_roomownr" type="text" size="10" class="text_box" style="ime-mode:active;">
		</td>
		<td colspan="2" bgcolor="#EBE9DC" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
			채권확보물권소유주
		  	<input name="bondprsvobjvolownr" type="text" size="10" class="text_box" style="ime-mode:active;">
		</td>
	<tr>
	<tr bgcolor="#927F5B">
		<td colspan="7" height="1">
			<!--line -->
		</td>
	</tr>
</form>
</table>

</td>
</tr>
<tr>
<td height="3">
<!--여백-->
</td>
</tr>
<tr>
<td>

<!--리스트 -->
<table width="830" border="0" cellspacing="0" align="center" class="gray" bgcolor="#FFFFFF" cellpadding="1" id="leasamt_list">
<form name="aset_list_form" method="post" action="">
	<input name="deptcd" type="hidden" value ="" maxlength="5">		<!--부서코드-->
	<input name="areacd" type="hidden" value ="" maxlength="5">     <!--지역코드-->
	<input name="bocd" type="hidden" value ="" maxlength="5">       <!--지국지사코드-->
	<input name="seq" type="hidden" value ="" maxlength="5">        <!--순번-->

	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray" width="60"> 지국명 </td>
		<td rowspan="2" class="gray" width="60">지국장 </td>
		<td rowspan="2" class="gray" width="70"> 지원금액 </td>
		<td rowspan="2" class="gray" width="70"> 전체보증금 </td>
		<td class="gray" colspan="2"> 채권확보 </td>
		<td rowspan="2" class="gray" width="60"> 현담당 </td>
		<td class="gray" width="80" > 지국사무실 </td>
		<td class="gray" width="80" > 채권확보물권 </td>
		<td class="gray" colspan="2"> 전세 기간 </td>
		<td rowspan="2" class="gray"> 결재서류번호 </td>
	</tr>
	<tr align="center">
		<td bgcolor="#dddddd" class="gray" width="70"> 금액 </td>
		<td bgcolor="#dddddd" class="gray" width="50">종류 </td>
		<td bgcolor="#dddddd" class="gray" width="80"> 소유주 </td>
		<td bgcolor="#dddddd" class="gray" width="80"> 소유주 </td>
		<td bgcolor="#dddddd" class="gray" width="70"> 계약일 </td>
		<td bgcolor="#dddddd" class="gray" width="70">만료일 </td>
	</tr>

	<%-- 초기화면 목록 반복 시작 --%>
	<%for(int i=0; i<asetListCount; i++){%>
	<tr>
		<td class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray" align="right" width="70">&nbsp;</td>
		<td class="gray" align="right">&nbsp;</td>
		<td class="gray" align="right" width="70" >&nbsp;</td>
		<td class="gray" align="right">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray" align="center">&nbsp;</td>
		<td class="gray" align="center">&nbsp;</td>
		<td class="gray">&nbsp;</td>
	</tr>
    <%}%>
    <%-- 초기화면 목록 반복 끝 --%>

	<tr bgcolor="#dddddd" align="right">
		<td colspan="12" height="23" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> 총지원금액 원</b>&nbsp;&nbsp;&nbsp;
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> 총건수 건</b>
		</td>
	</tr>
</form>
</table>

<!-- 페이지 이동 -->
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
                <jsp:param name = "pageno" 		value="0"/>
                <jsp:param name = "totalcnt" 	value="0"/>
                <jsp:param name = "js_fn_nm" 	value="page_move"/>
                <jsp:param name = "pagesize" 	value="<%= asetListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->

<br>

<!--상세정보 -->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
	<tr>
		<td  height="25" bgcolor="#EBE9DC" class="title">상세내역</td>
	</tr>
	<tr>
		<td height="3">
		<!--여백-->
		</td>
	</tr>
</table>

<table width="830" border="0" cellspacing="0" align="center" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="detail_list">
<form name="aset_detail_form" method="post" action="">
	<input name="deptcd" type="hidden" value ="" maxlength="5">		<!--부서코드-->
	<input name="areacd" type="hidden" value ="" maxlength="5">     <!--지역코드-->
	<input name="bocd" type="hidden" value ="" maxlength="5">       <!--지국지사코드-->
	<input name="seq" type="hidden" value ="" maxlength="5">        <!--순번-->

	<tr>
		<td  bgcolor="#dddddd" width="153" class="gray">팀&nbsp;</td>
		<td class="gray" width="250" >&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >지역</td>
		<td class="gray" width="100" >&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >지국명</td>
		<td class="gray" width="120" >&nbsp;</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" width="153" class="gray">지국장</td>
		<td class="gray" width="250" >&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >현담당</td>
		<td class="gray" colspan="3" >&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">채권확보서류</td>
		<td class="gray" width="250">
			등기필증
			<input type="checkbox" name="bondregiconf" value="Y">
			등기부등본
			<input type="checkbox" name="bndregi" value="Y">
			보증서
			<input type="checkbox" name="bondwarrp" value="Y">
		</td>
		<td class="gray" bgcolor="#dddddd" width="100">전세서류</td>
		<td class="gray" colspan="3">
			계약서
			<input type="checkbox" name="leascntrp" value="Y">
			등기부등본
			<input type="checkbox" name="leasregi" value="Y">
			각서
			<input type="checkbox" name="leasexch_note" value="Y">
			차용증서
			<input type="checkbox" name="leasloandeed" value="Y">
		</td>
	</tr>
	<tr>
	<td bgcolor="#dddddd" width="153" class="gray">국결재서류</td>
		<td class="gray" width="250">
			전임
			<input type="checkbox" name="prvoffideciddocuyn" value="Y">
			현임
			<input type="checkbox" name="curroffideciddocuyn" value="Y">
		</td>
		<td class="gray" bgcolor="#dddddd" width="100">본결재서류</td>
		<td class="gray" colspan="3">
			전임
			<input type="checkbox" name="prvhdqtdeciddocuyn" value="Y">
			현임
			<input type="checkbox" name="currhdqtdeciddocuyn" value="Y">
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">지국사무실 부동산표시</td>
		<td class="gray" colspan="5">&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">채권확보물권 부동산표시 </td>
		<td class="gray" colspan="5">&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">비고</td>
		<td class="gray" colspan="5">
			<textarea name="remk" rows="3" cols="90" >&nbsp;</textarea>
		</td>
	</tr>
</form>
</table>

<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr>
    <td align="center" height="2">
      <!--여백-->
    </td>
  </tr>
  <tr>
    <td align="center" height="24" bgcolor="#E8E8E8">
    	<img src="/html/comm_img/bu_save.gif" width="39" style="cursor:hand" height="19" align="absmiddle" border="0" onclick="javascript:save()">
    </td>
  </tr>
</table>
<br>
<br>

    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="800" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
