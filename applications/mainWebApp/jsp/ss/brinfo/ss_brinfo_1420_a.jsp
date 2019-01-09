<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1420_a.jsp
* 기능 : 지국Info-지국비품현황-상세-초기화면
* 작성일자 : 2004-01-26
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%--
	1. 지국비품현황-현황화면의 목록에서 상세화면으로 분기하는 경우도 처리하기 위해 request에서 지국지사코드를 검색한다.
		1. 지국지사코드가 존재하면 현황-목록화면에서 분기한 경우
		2. 지국지사코드가 존재하지 않으면 메뉴에서 선택한 경우
	2. 현황-목록화면에서 분기한 경우는 jsInit()에서 request에 담긴 부서코드(팀 코드), 지역코드, 지국지사코드,지국지사명,비품분류코드 정보를 이용하여
		검색조건을 설정하고 목록조회를 수행한다.

--%>
<%
	SS_L_ASET_INITDataSet ds = (SS_L_ASET_INITDataSet)request.getAttribute("ds");
    int moveListCount = 15;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부

    // 현황-목록화면에서의 분기처리를 위한 request 정보
    String deptcd = "";                	// 부서코드(팀 코드)
    String areacd = "";               	// 지역코드
    String areanm = "";  				// 지역명
    String bocd = "";                 	// 지국지사코드
    String bonm = "";       			// 지국지사명
    String asetclascd = "";         	// 비품분류코드

    deptcd = Util.checkString(request.getParameter("deptcd"));                	// 부서코드(팀 코드)
    areacd = Util.checkString(request.getParameter("areacd"));               		// 지역코드
    areanm = Util.Uni2Ksc(Util.checkString(request.getParameter("areanm")));  	// 지역명
    bocd = Util.checkString(request.getParameter("bocd"));                     	// 지국지사코드
    bonm = Util.Uni2Ksc(Util.checkString(request.getParameter("bonm")));       	// 지국지사명
    asetclascd = Util.checkString(request.getParameter("asetclascd"));         	// 비품분류코드
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
var gs_deptcd 		= '<%= deptcd %>';
var gs_areacd 		= '<%= areacd %>';
var gs_areanm		= '<%= areanm %>';
var gs_bocd 		= '<%= bocd %>';
var gs_bonm 		= '<%= bonm %>';
var gs_asetclascd 	= '<%= asetclascd %>';

// 목록의 갯수
// 현황-목록에서 상세로 분기시 조회 항목이 한개인 경우는 상세 화면까지 보여준다.
// 이를 위해서 목록처리하는 화면에서 갯수가 한개인 경우 갯수와 비품일련번호를 설정한다.
var gs_list_cnt	= "";
var gs_asetseq 	= "";

// 목록의 갯수 설정
function set_list_cnt(cnt, asetseq){
	gs_list_cnt = cnt;
}

// 목록의 갯수를 확인 후 한개인 경우 상세 호출
function check_list_cnt(){
	if(gs_list_cnt = '1'){
		var asetseq = gs_asetseq;
		// 전역변수 초기화
		gs_list_cnt = "";
		gs_asetseq = "";
		detail_view(gs_bocd, asetseq);
	}
}

// set_search_from_list
function set_search_from_list(){
	var lo_form1 = document.aset_search_form;
	lo_form1.deptcd.value = gs_deptcd;
    var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                  "<option value=''>전체</option>" +
                  "<option value='"+gs_areacd+"' selected>"+gs_areanm+"</option>" +
              "</select>"
    document.all.areacd_id.outerHTML = str;
    lo_form1.bocd.value = gs_bocd;
    lo_form1.bonm.value = gs_bonm;
    lo_form1.asetclascd.value = gs_asetclascd;
    lo_form1.frdt.value = "";
    lo_form1.todt.value = "";
}

// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.aset_search_form.bonm.focus();
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
    var lo_form1 = document.aset_search_form;


	if(lo_form1.bocd.value == ''){
		alert("지국을 선택하세요");
		return;
	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

	// 지국비품현황 목록 조회조건을 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/brinfo/1425";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// page 이동
function page_move(pageno) {
    var lo_form1 = document.aset_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    lo_form1.action = "/ss/brinfo/1425";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기
function detail_view(bocd, asetseq){
    var lo_form1 = document.aset_list_form;

    // 지국지사코드, 비품일련번호를 "/ss/brinfo/1430" 서블릿으로 보낸다
    lo_form1.bocd.value = bocd;
    lo_form1.asetseq.value = asetseq;
    lo_form1.action = "/ss/brinfo/1430";
    lo_form1.target = "ifrm";
    lo_form1.submit();
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

    // 부터(팀)코드값을 "/ss/common/1100" 서블릿으로 보낸다
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

    var lo_form1 = document.aset_search_form;

    //지국명이 존재하지 않으면 지국검색팝업을 띄운다.
	if(lo_form1.bonm.value == ''){
		bo_search();
		return;
	}

    // 부터(팀)코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
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

	if(flag == '1'){			// 부터(팀),지역,지국 초기화
		// 부터(팀) 초기화
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
    var lo_form1 = document.aset_search_form;

	if(lo_form1.bonm.value == ''){
		lo_form1.bocd.value = '';
		list_search();
	}else{
	    // 부터(팀)코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="title1"
	onload	=	"jsInit();
				<%if(!"".equals(bocd)){%>
					set_search_from_list();list_search();
				<%}%>
">

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >지국Info
      &gt; </b> 지국비품현황 &gt; 상세</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr>
    <td width="500" valign="top">

	<!--지국비품상세 검색 시작 -->
	<table width="500" border="0"  cellpadding="2" cellspacing="0">
	<form name="aset_search_form" method="post" action="" >
		<input name="pageno" type="hidden" value ="1">			                <!-- 현재 페이지 번호 -->
		<input name="pagesize" type="hidden" value ="<%= moveListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
		<input name="js_fn_nm" type="hidden" value ="page_move">
		<input type="hidden" name="common_deptcd" value ="">                    <!-- 공통 부터(팀)코드 -->
		<input type="hidden" name="bocd" value ="">                         	<!-- 지국지사코드 -->
		<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->

		<tr>
			<td bgcolor="#EBE9DC" colspan="4" class="sea_top" >
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">팀&nbsp;
				<select name="deptcd" onChange="area_search();" class="sel_all">
<%
				writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
			    </select>
	          	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역
		        <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--지역코드, 지역명 목록-->
<%
				writeAreaOpt(session, out, true);
%>
		        </select>
			</td>
			<td bgcolor="#EBE9DC" class="sea_top""><img src="/html/comm_img/ic_title.gif" width="12" height="7">지국
			</td>
			<td bgcolor="#EBE9DC" class="sea_top">
				<input type="text" name="bonm" size="7" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
				<input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search02.gif" width="39"  align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--지국검색팝업-->
				<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부터(팀),지역,지국 초기화-->
			</td>
			<td bgcolor="#EBE9DC" rowspan="3" align="right" width="40" class="sea_top">
				<input type="image" id="search_id" border="0" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;">
			</td>
		</tr>
		<tr>
			<td bgcolor="#EBE9DC" width="65"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">비품분류</td>
			<td bgcolor="#EBE9DC" width="120">
				<select name="asetclascd" class="sel_all">
					<option value="" selected>전체</option>
	<%
	for(int i=0; i<ds.asetclascd.size(); i++){
		SS_L_ASET_INITASETCLASCDRecord asetclascdRec = (SS_L_ASET_INITASETCLASCDRecord)ds.asetclascd.get(i);
	%>
              		<option value="<%= asetclascdRec.cicodeval%>"><%= asetclascdRec.cicdnm%></option>
	<%}%>
				</select>
			</td>
			<td bgcolor="#EBE9DC" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">비품명</td>
			<td bgcolor="#EBE9DC" colspan="3">
				<input type="text" name="asetnm" size="16" class="text_box">
			</td>
		</tr>
		<tr>
			<td bgcolor="#EBE9DC" width="65"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구입일자</td>
			<td bgcolor="#EBE9DC" colspan="5">
				<input name="frdt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="구입일자" dataType="date">
				-
				<input name="todt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="구입일자" dataType="date">
			</td>
		</tr>
		<tr bgcolor="#927F5B">
			<td colspan="7" style height"1">
			<!--line -->
			</td>
		</tr>
		<tr>
			<td colspan="7" height="3">
			<!--여백 -->
			</td>
		</tr>
	</form>
	</table>
	<!--지국비품상세 검색 끝 -->

	<!--지국비품상세 목록 시작 -->
	<table width="500" border="0" cellspacing="0"  cellpadding="1" bgcolor="#FFFFFF" class="gray" id="aset_list_id">
	<form name="aset_list_form" method="post" action="">
		<input type="hidden" name="bocd" value="">   	<!--지국지사코드-->
		<input type="hidden" name="asetseq" value="">   <!--비품일련번호-->

		<tr bgcolor="#dddddd" height="23">
			<td width="60" class="gray" align="center" > 번호 </td>
			<td width="150" class="gray" align="center"> 분류 </td>
			<td width="180" class="gray" align="center"> 비품명 </td>
			<td class="gray" align="center"> 구입일자 </td>
		</tr>
		<%-- 초기화면 목록 반복 시작 --%>
		<%for(int i=0; i<moveListCount; i++){%>
		<tr>
			<td class="gray" align="center" width="60" > &nbsp; </td>
			<td class="gray" width="150"> &nbsp; </td>
			<td class="gray" width="180"> &nbsp; </td>
			<td class="gray" align="center"> &nbsp; </td>
		</tr>
		<%}%>
		<%-- 초기화면 목록 반복 끝 --%>

		<tr bgcolor="#dddddd" >
			<td colspan="4" class="gray" height="23" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> 총건수 건</b>
			</td>
		</tr>
	</form>
	</table>
	<!--지국비품상세 목록 끝 -->

	<!-- 페이지 이동-->
	<table width="500" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
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
			<jsp:param name = "pagesize" 	value="<%= moveListCount%>"/>
			<jsp:param name = "page_set_gubun" 	value="0"/>
			</jsp:include>
			<!--JSP PAGE END------------------------------------------------------------------------------------>
			</td>
		</tr>
	</table>
	<!-- 페이지 이동-->

    </td>
    <td width="340" valign="top">

	<table width="100%" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr>
			<td  height="25" bgcolor="#EBE9DC" class="title">지국비품 상세</td>
		</tr>
		<tr>
			<td height="3">
			<!--여백-->
			</td>
		</tr>
	</table>

	<!--지국비품상세 상세 시작 -->
	<table width="100%" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="aset_detail_id">
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;번호 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;비품분류 </td>
			<td class="gray"> &nbsp;</td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;비품명 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;사양 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;제조원 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;구입처 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;구입일자 </td>
			<td class="gray"> &nbsp;</td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;구입금액 </td>
			<td class="gray"> &nbsp;</td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;본사지원금 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" width="100" class="gray" he> &nbsp;유지보수내용 </td>
			<td class="gray">
				<textarea cols="27" rows="6" class="scroll1" readOnly>&nbsp;</textarea>
			</td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;폐기일자 </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;비고 </td>
			<td class="gray">
				<textarea cols="27" rows="5" class="scroll1" readOnly>&nbsp;</textarea>
			</td>
		</tr>
	</table>
	<!--지국비품상세 상세 끝 -->

    </td>
  </tr>
</table>
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
