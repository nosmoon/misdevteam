<%@ page contentType="text/html; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1200_a.jsp
* 기능 : 관리자-마이그레이션-검증-초기화면
* 작성일자 : 2004-03-11
* 작성자 : 노상현
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
    String paramGbn = "##";
    applySession = true;	// 세션 적용 여부
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
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
function area_search(flag){
    if(flag == '1'){        // 검색 폼 지역 검색
	    var lo_form1 = document.mig_search_form;
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
    }else if(flag == '2'){  // 상세 폼 사고지국 지역 검색
	    var lo_form1 = document.mig_detail_form;
        if(lo_form1.deptcd.value == '') {
            var str = "<select id=accd_areacd_id name=\"areacd\" class=\"sel_all\">" +
                          "<option value='' selected>선택</option>" +
                      "</select>"
            document.all.accd_areacd_id.outerHTML = str;
            return;
        }

        // 부서(팀)코드값을 "/ss/common/1106" 서블릿으로 보낸다
        lo_form1.action = "/ss/common/1106";
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
        lo_form1.target = "ifrm";
        lo_form1.submit();
   }
}

// 지국찾기 팝업
// 확장현황은 지국찾기가 2개이므로 매개변수를 통해 구분해 처리한다.
// 지국지사코드, 지국지사명이 팝업으로부터 넘어온다. 두 값의 구분자는 "\n"
function bo_search(bocd){
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

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

	// 목록 검색조건을 "/ss/admin/1205" 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1205";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 전체선택, 취소
function check_all_chk(bool){
    var lo_form1 = document.mig_detail_form;

    if(lo_form1.sp_desc==null) {							// 선택된 건이 없는 경우
        return;
    } else if(lo_form1.sp_desc.type=="checkbox") {			// 한건인 경우
        lo_form1.sp_desc.checked = bool;
    } else {												// 여러건인 경우
        for(var i=0; i<lo_form1.sp_desc.length; i++) {
            lo_form1.sp_desc[i].checked = bool;
        }
    }
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.mig_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	// 목록 검색조건을 "/ss/admin/1205" 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1205";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

function mecd_list(str) {
	var form2 = document.mig_search_form;

	// 업무구분값과 코드구분값을 "/pilot/1014" 서블릿으로 보낸다

	//form2.ciTeamcd.value = form1.txtTeamcd.value;
	//form2.ciDstccd.value = form1.txtDstccd.value;
	form2.bocd.value = str;
	form2.action = "/ss/admin/1210";
	form2.target = "ifrm";
	form2.submit();
	//ifrm.location = "/jsp/ss/sl_basic_1014_l.jsp";
}

// TAB클릭시 해당 레이어 표시 또는 숨김
function displayTab(tapValue) {
	var form = document.mig_search_form;
	form.tabKey.value = tapValue;
	if(tapValue == "tab11"){			// 지명별 현황
		form.action = "/ss/admin/1210";
		form.target = "ifrm";
		form.submit();
	} else if(tapValue == "tab12") {	// 구역별 현황
		form.action = "/ss/admin/1215";
		form.target = "ifrm";
		form.submit();
	} else if(tapValue == "tab13") {	// 수금방법별 현황
		form.action = "/ss/admin/1220";
		form.target = "ifrm";
		form.submit();
	} else if(tapValue == "tab14") {

	} else if(tapValue == "tab15") {
		form.action = "/ss/admin/1230";
		form.target = "ifrm";
		form.submit();
	}
}

// TAB의 배경색 바꾸기
function set_background_color(){
    var forms = document.forms;
    var elements;
    for(var i=0; i<forms.length; i++){
    	elements = forms(i).elements;
    	for(var j=0; j<elements.length; j++){
            if(elements(j).tagName != "INPUT") continue;
        	if(elements(j).readOnly){
            	elements(j).style.backgroundColor = "#E6E6E6";
            	elements(j).style.color = "#6B6B6B";
        	}else{
            	elements(j).style.backgroundColor = "#FFFFFF";
                elements(j).style.color = "#000000";
        	}
        }
    }
}

//매체 tab 전체에 대한 display 설정
function set_on_off_medi_tab(curr_tab_id, i_total_count){
    var ls_tab_id = "";
	for(var i=0; i<i_total_count; i++){
        ls_tab_id = "tab_" + i;

    	if(curr_tab_id == ls_tab_id){
        	set_medi_tab(document.all(ls_tab_id), "on");
    	}else{
        	set_medi_tab(document.all(ls_tab_id), "off");
        }
    }
}

//매체 tab "ON/OFF"
function set_medi_tab(o_this, s_on_off){
	var lo_cells = o_this.cells;
    //alert(o_this.id);
    var count = 1;
    for (i=0; i < o_this.rows.length; i++) {
        for (j=0; j < o_this.rows(i).cells.length; j++) {
            //alert(o_this.rows(i).cells(j).outerHTML );
            o_this.rows(i).cells(j).className = s_on_off + "_" + count++;
        }
    }
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

    var lo_form1 = document.mig_search_form;

	if(flag == '1'){			// 부서(팀),지역,지국 초기화
		// 부서(팀) 초기화
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
	    // 부서(팀)코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

//////////////////// print ////////////////
var tempHtmlContent;

function printDiv () {
   if (document.all && window.print) {
       window.onbeforeprint = beforeDivs;
       window.onafterprint = afterDivs;
       window.print();
   }
}
function beforeDivs () {
   if (document.all) {
       var rng = document.all("pDiv").createTextRange( );
       if (rng!=null) {
           alert(rng.htmlText);
           tempHtmlContent = rng.htmlText;
           rng.pasteHTML("<table border=0 align=center><tr><td align=center>"
                                       + document.all("pDiv").innerHTML + "</td></tr></table>");
       }
   }
}
function afterDivs () {
   if (document.all) {
       var rng = document.all("pDiv").createTextRange( );
           if (rng!=null) {
                       rng.pasteHTML(tempHtmlContent);
           }
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
  <td width="400"><tr>
    <td>

	<!--마이그레이션 검색 시작 ---------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
	<form name="mig_search_form" method="post" action="" >
		<input type="hidden" name="tabKey" value="tab11">
        <input name="pageno" type="hidden" value ="1">			                	<!-- 현재 페이지 번호 -->
        <input name="pagesize" type="hidden" value ="<%=migListCount%>">			<!-- 한 화면당 리스트 항목 수 -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
		<input name="common_deptcd" type="hidden" value ="">                    	<!-- 공통 부서(팀)코드 -->
		<input name="bocd" type="hidden" value ="">                    				<!-- 지국코드 -->
        <input name="applySession" type="hidden" value ="<%=applySession%>">   	<!-- 세션 적용 여부 -->
		<tr>
			<td bgcolor="#EBE9DC" width="135" >
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">팀&nbsp;
	            <select name="deptcd" onChange="area_search('1');" class="sel_all">	<!-- 부서(팀)코드, 코드명 목록 -->
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
            	<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서(팀),지역,지국 초기화-->
            </td>
			</td>
			<td colspan="2">
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간
			<input name="frdt" type="text" class="text_box"  value="<%= Util.getDate2()%>" size="10" caption="시작일자" dataType="date">
			-
			<input name="todt" type="text" class="text_box"  value="<%= Util.getDate2()%>" size="10" caption="종료일자" dataType="date">
			</td>
			<td bgcolor="#EBE9DC" rowspan="2" width="40" align="right">
				<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;" border="0" >
			</td>
		</tr>
	</form>
	</table>
	<!--마이그레이션 검색 끝 ---------------------------------------------------------------------------->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
    <td height="10">

    <!--마이그레이션 목록 시작 ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="mig_list_id">
		<tr bgcolor="#dddddd" align="center">
			<td width="50" height="23" class="gray" rowspan=2> 지역명 </td>
			<td width="80" height="23" class="gray" rowspan=2> 담당명 </td>
			<td width="80" height="23" class="gray" rowspan=2> 지국명 </td>
			<td width="200" height="23" class="gray" colspan=2> 독자DB </td>
			<td width="200" height="23" class="gray" colspan=2> 빌링DB </td>
			<td width="50" height="23" class="gray" rowspan=2> 완료확인 </td>
			<td width="100" height="23" class="gray" rowspan=2> 확인일자 </td>
		</tr>
		<tr bgcolor="#dddddd" align="center">
			<td width="100" height="23" class="gray"> UPLOAD </td>
			<td width="100" height="23" class="gray"> 전환완료 </td>
			<td width="100" height="23" class="gray"> UPLOAD </td>
			<td width="100" height="23" class="gray"> 전환완료 </td>
		</tr>

    <%-- 초기화면 목록 반복 시작 --%>
    <%for(int i=0; i<migListCount; i++){%>
		<tr>
			<td width="50" height="23" class="gray"> &nbsp; </td>
			<td width="80" height="23" class="gray"> &nbsp; </td>
			<td width="80" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
			<td width="50" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
		</tr>
    <%}%>
    <%-- 초기화면 목록 반복 끝 --%>
	<tr bgcolor="#dddddd">
		<td colspan="7" align="center" class="gray">
            <!-- 페이지 이동 -->
            <table border="0" cellspacing="0" cellpadding="0" id="page_move">
                <tr>
                    <td align="center" height="2">
                    <!--여백-->
                    </td>
                </tr>
                <tr>
                    <td align="center" height="20">
                    <!--JSP PAGE START---------------------------------------------------------------------------------->
                    <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                            <jsp:param name = "pageno" 		value="1"/>
                            <jsp:param name = "totalcnt" 	value="0"/>
                            <jsp:param name = "js_fn_nm" 	value="page_move"/>
                            <jsp:param name = "pagesize" 	value="<%=migListCount%>"/>
                            <jsp:param name = "page_set_gubun" 	value="0"/>
                    </jsp:include>
                    <!--JSP PAGE END------------------------------------------------------------------------------------>
                    </td>
                </tr>
            </table>
            <!-- 페이지 이동 -->
		</td>
		<td colspan="2" class="gray" align="center">
			<div align="right"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총건수: <b>0 건</b></div>
		</td>
	</tr>
    </table>

    <!--마이그레이션 목록 끝 ---------------------------------------------------------------------------->
    </td>
  </tr>
  <tr>
	<td>
      <table width="830" border="0" cellspacing="0" cellpadding="0" align="center"  style="visibility:visible" class="title2">
		<tr>
          <td colspan="5" width="330" height="3">
            <!--tab 여백-->
          </td>
        </tr>
        <tr>
          <td width="100">
            <!--tab 1-->
            <table id="tab_0" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:displayTab('tab11');set_on_off_medi_tab(this.id, 5);" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb3_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb3_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb3_03.gif" width=5 height=3 ></td>
              </tr>
              <tr>
                <td background="/html/comm_img/tb3_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb3_05.gif">지명별</td>
                <td background="/html/comm_img/tb3_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 1 end-->
          </td>
          <td width="100">
            <!--tab2-->
            <table id="tab_1" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_medi_tab(this.id, 5);displayTab('tab12');" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
              </tr>

              <tr>
                <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb4_05.gif">구역별</td>
                <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 2 end-->
          </td>
          <td width="100">
            <!--tab3-->
            <table id="tab_2" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_medi_tab(this.id, 5);displayTab('tab13');" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
              </tr>
              <tr>
                <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb4_05.gif">수금방법별</td>
                <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 3 end-->
          </td>
          <td width="100">
            <!--tab3-->
            <table id="tab_3" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_medi_tab(this.id, 5);displayTab('tab14');" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
              </tr>
              <tr>
                <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb4_05.gif">자동이체독자</td>
                <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 3 end-->
          </td>
          <td width="100">
            <!--tab3-->
            <table id="tab_4" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_medi_tab(this.id, 5);displayTab('tab15');" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
              </tr>
              <tr>
                <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb4_05.gif">오류독자조회</td>
                <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 3 end-->
          </td>
          <td width="230">
		  </td>
		  <td width="100">
            <span style="cursor:hand" onclick="printDiv();">[인쇄]</span>
            <!--tab 여백-->
          </td>
        </tr>
      </table>

	</td>
  </tr>
  <tr>
  	<td>
	  <table width="830" border="0" cellspacing="0" cellpadding="0" class="gray" id="mig_mecd">
	  <div id="pDiv" align="center">
      <form name="form_list" method="post" action="">
      <tr>
        <td height="25" align="left" class="gray">&nbsp;지국도우미</td>
        <td height="25" align="left" class="gray">&nbsp;CRM시스템</td>
      </tr>
      <tr>
        <td width="50%">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr bgcolor="#dddddd" align="center">
              <td height="23" class="gray">지명</td>
              <td class="gray">유가</td>
              <td class="gray">준유가</td>
              <td class="gray">무가</td>
              <td class="gray">기타</td>
              <td class="gray">배부수</td>
              <td class="gray">중지독자</td>
            </tr>
            <%-- 목록 반복 시작 --%>
            <%for(int i=0; i<migListCount; i++){%>
            <tr>
              <td height="23" class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
			<%}%>
			<tr bgcolor="#dddddd">
              <td height="23" colspan="7" class="gray">
				<%-- 합계 --%>&nbsp;
			  </td>
			</tr>
          </table>
		</td>
        <td width="50%">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr bgcolor="#dddddd" align="center">
              <td height="23" class="gray">지명</td>
              <td class="gray">유가</td>
              <td class="gray">준유가</td>
              <td class="gray">무가</td>
              <td class="gray">기타</td>
              <td class="gray">배부수</td>
              <td class="gray">중지독자</td>
            </tr>
            <%-- 목록 반복 시작 --%>
            <%for(int i=0; i<migListCount; i++){%>
            <tr>
              <td height="23" class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
			<%}%>
			<tr bgcolor="#dddddd">
              <td height="23" colspan="7" class="gray">
				<%-- 합계 --%> &nbsp;
			  </td>
			</tr>
        </table>
		</td>
      </tr>
	</form>
	</div>
    </table>
	</td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<%--

--%>
</body>
</html>
