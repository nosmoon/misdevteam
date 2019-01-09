<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1300_a.jsp
* 기능 : 지국Info-지국조직현황-초기화면
* 작성일자 : 2004-02-02
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : 판매국요청으로 지국종사원 중 사이버확장요원 등록 현황을 보여주기
* 수정자 : 김대섭
* 수정일자 : 2004/11/12
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_L_BOEMP_INITDataSet ds = (SS_L_BOEMP_INITDataSet)request.getAttribute("ds");
    int moveListCount = 20;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부

	//		String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// 업무구분코드(판매국장,지원부장,영업부장은 목록 조회 옵션을 보여준다.)

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
	document.boemp_search_form.bonm.focus();
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
    var lo_form1 = document.boemp_search_form;

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

	// 지국조직현황 목록 조회조건을 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/brinfo/1310";
    lo_form1.target = "ifrm";
    check_all(lo_form1);
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {

    var lo_form1 = document.boemp_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    // "/ss/brinfo/1310" 서블릿으로 보낸다
    lo_form1.action = "/ss/brinfo/1310";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 지역 검색
function area_search(){
    var lo_form1 = document.boemp_search_form;
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


// 상세목록 보기(팝업)
function detail_view(bocd){

    var lo_form1 = document.boemp_list_form;

    // 지국지사코드를 "/ss/brinfo/1315" 서블릿으로 보낸다
    lo_form1.bocd.value = bocd;

    var ls_win      = "scrollbars=yes,toolbar=no,location=no,directories=no,width=855, height=455 resizable=no,mebar=no,left=140,top=50";
    window.open("about:blank" , "emp_pop", ls_win);

    // 판매지국 독자화면으로 새창을 띄운다.
    lo_form1.action = "/ss/brinfo/1315";
    lo_form1.target = "emp_pop";
    lo_form1.submit();

}


// 지국찾기 팝업
function bo_search(){
    var lo_form1 = document.boemp_search_form;
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

    var lo_form1 = document.boemp_search_form;

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
		var lo_form2 = document.boemp_search_form;
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

    var lo_form1 = document.boemp_search_form;

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
	}else if(flag == '3'){		// 기타 초기화
	}
}

// 목록에서 선택된 로우 전역변수
var go_sel_row;

// 선택된 로우 색깔 바꾸기
function change_sel_row(obj){
	go_sel_row = obj;
	obj.style.backgroundColor='#BFD2DD';
	lo_table = obj.parentNode;
	for(i=1; i<lo_table.rows.length-2; i++){
		if(lo_table.rows[i] != go_sel_row && i != 1){
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
    var lo_form1 = document.boemp_search_form;

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
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >지국Info
      &gt; </b> 지국조직현황</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>

<!--검색시작-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="boemp_search_form" method="post" action="" >
	<input type="hidden" name="pageno" value ="1">				<!-- 현재 페이지 번호 -->
	<input type="hidden" name="pagesize" value ="<%= moveListCount%>">	<!-- 한 화면당 리스트 항목 수 -->
	<input type="hidden" name="js_fn_nm" value ="page_move">
	<input type="hidden" name="common_deptcd" value ="">                    <!-- 공통 부서(팀)코드 -->
	<input type="hidden" name="bocd" value ="">                         	<!-- 지국지사코드 -->
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
	<tr>
		<td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">팀&nbsp;</td>
	<td bgcolor="#EBE9DC" class="title" width="80">
		<select name="deptcd" onChange="area_search();" class="sel_all">
<%
			writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
	    </select>
    </td>
    <td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역</td>
    <td bgcolor="#EBE9DC" class="title" width="80">
        <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--지역코드, 지역명 목록-->
<%
			writeAreaOpt(session, out, true);
%>
        </select>
    </td>
    <td bgcolor="#EBE9DC" class="title" width="50""><img src="/html/comm_img/ic_title.gif" width="12" height="7">지국</td>
    <td bgcolor="#EBE9DC" class="title" width="150">
		<input type="text" name="bonm" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
		<input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--지국검색팝업-->
		<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서(팀),지역,지국 초기화-->
    </td>

<%--20041112 김대섭 추가--%>
    <td bgcolor="#EBE9DC" class="title" width="200">
		<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">조회구분
		&nbsp;
		<select name="viewflag" size="1" class="sel_all">
			<option value="1" selected>팀별</option>
			<option value="2">지역별</option>
			<option value="3">지국별</option>
		</select>
	</td>


<%--판매국장,지원부장은 부서(팀),지역,지국별 선택가능--%>
<%--if("110".equals(jobcd) || "120".equals(jobcd)){--%>
<%--
    <td bgcolor="#EBE9DC" class="title" width="200">
		<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">조회구분
		&nbsp;
		<select name="viewflag" size="1" class="sel_all">
			<option value="1" selected>팀별</option>
			<option value="2">지역별</option>
			<option value="3">지국별</option>
		</select>
	</td>
--%>
<%--영업부장은 지역,지국별 선택가능--%>
<%--}else if("310".equals(jobcd)){--%>
<%--
    <td bgcolor="#EBE9DC" class="title" width="200">
		<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">조회구분
		&nbsp;
		<select name="viewflag" size="1" class="sel_all">
			<option value="2" selected>지역별</option>
			<option value="3">지국별</option>
		</select>
	</td>
--%>
<%--}--%>

    <td bgcolor="#EBE9DC" class="title" align="right">
      <input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="right" onclick="set_request('L');bo_list_search();window.event.returnValue=false;">
    </td>
  </tr>
  <tr>
    <td height="3" colspan="6">
      <!--여백-->
    </td>
  </tr>
 </form>
</table>
<!--검색끝-->

<!--list start-->
<table width="830" border="0" cellspacing="0" align="center" class="gray" cellpadding="1" bgcolor="#FFFFFF" id="boemp_list_id">

<form name="boemp_list_form" method="post" action="" >
    <input name="bocd" type="hidden" value ="">

	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray">팀&nbsp;</td>
		<td rowspan="2" class="gray" width="60">지역</td>
		<td rowspan="2" class="gray" width="60">지국</td>
		<td rowspan="2" class="gray" width="60">발송부수</td>
		<td rowspan="2" class="gray" width="45">총무</td>
		<td colspan="5" class="gray">배달원</td>
		<td rowspan="2" class="gray" width="45">삽지</td>
		<td rowspan="2" class="gray" width="45">경리</td>
		<td rowspan="2" class="gray" width="45">주방</td>
		<td rowspan="2" class="gray" width="45">기타</td>
		<td rowspan="2" class="gray" width="40">계</td>
		<td rowspan="2" class="gray" width="55">사이버</td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="45">전문</td>
		<td class="gray" width="45">주부</td>
		<td class="gray" width="45">알바</td>
		<td class="gray" width="45">기타</td>
		<td class="gray" width="40">계</td>
	</tr>
     <%-- 초기화면 목록 반복 시작 --%>
    <%for(int j=0; j<moveListCount; j++){%>
	<tr>
		<td class="gray" > &nbsp; </td>
		<td class="gray" width="60" > &nbsp; </td>
		<td class="gray" width="60" > &nbsp; </td>
		<td class="gray" align="right" width="60" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="40" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="40" > &nbsp; </td>
		<td class="gray" align="right" width="55" > &nbsp; </td>
	</tr>
	<%}%>
    <%-- 초기화면 목록 반복 끝 --%>
	<tr bgcolor="#dddddd">
		<td  colspan="4" class="gray" align="right">소계&nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="40"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="40"> &nbsp; </td>
		<td class="gray" align="right" width="55"> &nbsp; </td>
	</tr>
	<tr align="right" height="23">
		<td colspan="16" bgcolor="#dddddd" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>총건수 건</b>
		</td>
	</tr>
</form>
</table>
<!---button-->
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
	    <jsp:param name = "pageno" 			value="0"/>
	    <jsp:param name = "totalcnt" 		value="0"/>
	    <jsp:param name = "js_fn_nm" 		value="page_move"/>
	    <jsp:param name = "pagesize" 		value="<%= moveListCount%>"/>
	    <jsp:param name = "page_set_gubun" 	value="0"/>
	    </jsp:include>
	    <!--JSP PAGE END------------------------------------------------------------------------------------>
    </td>
  </tr>
</table>
<!--list end-->
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
