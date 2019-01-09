<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1400_a.jsp
* 기능 : VacationStop 비용 초기화면
* 작성일자 : 2004-05-25
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_VSCOST_INITDataSet ds = (SS_L_VSCOST_INITDataSet)request.getAttribute("ds");
    int moveListCount = 20;	// 한 화면당 리스트 항목 수
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
	document.vscost_search_form.bonm.focus();
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
    var lo_form1 = document.vscost_search_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';								// 페이지번호 초기화

	// 목록 조회조건을 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/reader/1410";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.vscost_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 이사독자 신청목록 조회조건을 "/ss/reader/1410" 서블릿으로 보낸다
    lo_form1.action = "/ss/reader/1410";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 지역 검색
function area_search(){
    var lo_form1 = document.vscost_search_form;
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
    var lo_form1 = document.vscost_search_form;

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

    var lo_form1 = document.vscost_search_form;

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
		var lo_form2 = document.vscost_search_form;
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

// 검색 조건 초기화
function set_default(flag){

    var lo_form1 = document.vscost_search_form;

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
		lo_form1.frdt.value = "";
		lo_form1.todt.value = "";
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
    var lo_form1 = document.vscost_search_form;

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
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >독자현황
      &gt; </b> Vacation Stop &gt; 비용</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr>
    <td>

	<!--VacationStop 비용 검색 시작-->
	<table width="830" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC">
	<form name="vscost_search_form" method="post" action="" >
		<input name="pageno" type="hidden" value ="1">			                <!-- 현재 페이지 번호 -->
		<input name="pagesize" type="hidden" value ="<%= moveListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
		<input name="js_fn_nm" type="hidden" value ="page_move">
		<input name="common_deptcd" type="hidden" value ="">                    <!-- 공통 부서(팀)코드 -->
		<input name="bocd" type="hidden" value ="">                         	<!-- 지국지사코드 -->
		<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->

		<tr>
			<td class="title"  bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">팀&nbsp;</td>
			<td class="title"  width="80">
                <select name="deptcd" onChange="area_search();" class="sel_all"><!-- 부서(팀)코드, 코드명 목록 -->
<%
					writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
                </select>
			</td>
			<td class="title"  bgcolor="#EBE9DC" width="40"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역</td>
			<td class="title"  width="100">
                <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--지역코드, 지역명 목록-->
<%
					writeAreaOpt(session, out, true);
%>
                </select>
			</td>
			<td class="title"  bgcolor="#EBE9DC" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국</td>
			<td class="title"  width="160">
				<input name="bonm" type="text" size="10" class="text_box" value="" style="ime-mode:active;" onkeydown="bo_enter_search();">
				<input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;">
				<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서(팀),지역,지국 초기화-->
			</td>
			<td class="title"  width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간</td>
			<td class="title"  width="180">
				<input name="frdt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="기간" dataType="date">
				-
				<input name="todt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="기간" dataType="date">
				<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--부서(팀),지역,지국 초기화-->
			</td>
			<td class="title"  align="right">
				<input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;">
			</td>
		</tr>
	</form>
	</table>
	<!--VacationStop 비용 검색 끝-->
     </td>
  </tr>
  <tr>
    <td height="10">

	<!--VacationStop 비용 목록 시작-->
	<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="vscost_list_id">
		<tr bgcolor="#DDDDDD" height="23">
			<td class="gray" align="center" width="70">권역</td>
			<td class="gray" align="center" width="110">휴가지</td>
			<td class="gray" align="center" width="60">팀&nbsp;</td>
			<td class="gray" align="center" width="60">지역</td>
			<td class="gray" align="center" width="80">지국</td>
			<td class="gray" align="center" width="60">배달부수</td>
			<td class="gray" align="center" width="60">단가</td>
			<td class="gray" align="center" width="60">금액</td>
			<td class="gray" width="90" align="center">마감기준일자</td>
			<td class="gray" align="center">마감기간</td>
		</tr>
		<%-- 초기화면 목록 반복 시작 --%>
		<%for(int i=0; i<moveListCount; i++){%>
		<tr>
			<td class="gray" align="center" width="70">&nbsp;</td>
			<td class="gray" align="center" width="110">&nbsp;</td>
			<td class="gray" align="center" width="60">&nbsp;</td>
			<td class="gray" align="center" width="60">&nbsp;</td>
			<td class="gray" align="center" width="80">&nbsp;</td>
			<td class="gray" align="center" width="60">&nbsp;</td>
			<td class="gray" align="right" width="60">&nbsp;</td>
			<td class="gray" align="right" width="60">&nbsp;</td>
			<td class="gray" align="center" width="90">&nbsp;</td>
			<td class="gray" align="center">&nbsp;</td>
		</tr>
	<%}%>
	<%-- 초기화면 목록 반복 끝 --%>
		<tr bgcolor="#DDDDDD" align="right">
			<td  height="23" class="gray" colspan="10">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7">  <b>총금액 원 </b>&nbsp;&nbsp;
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7">  <b>총건수 건 </b>
			</td>
		</tr>
	</table>
	<!--VacationStop 비용 목록 끝 -->
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
                    <jsp:param name = "pagesize" 	value="<%= moveListCount%>"/>
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
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" height="0" width="0" ></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
