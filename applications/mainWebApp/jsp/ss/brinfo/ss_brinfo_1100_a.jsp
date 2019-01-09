<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1100_a.jsp
* 기능 : 지국Info-지국현황-초기화면
* 작성일자 : 2004-02-02
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_L_BOINFO_INITDataSet ds = (SS_L_BOINFO_INITDataSet)request.getAttribute("ds");
    int listCount = 10;	// 한 화면당 리스트 항목 수
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
	document.boinfo_search_form.bonm.focus();
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
    var lo_form1 = document.boinfo_search_form;
    var lo_form2 = document.boinfo_detail_form;

    // 상세 폼의 기준년월을 지운다.
    lo_form2.basi_yymm.value = '';

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	lo_form1.pageno.value = '1';									// 페이지번호 초기화

	// 지국현황 목록 조회조건을 해당 서블릿으로 보낸다.
    lo_form1.action = "/ss/brinfo/1110";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기
function detail_view(bocd){
    var lo_form1 = document.boinfo_detail_form;
    var lo_form2 = document.boinfo_detail_form;

    // 상세 폼의 기준년월을 지운다.
    lo_form2.basi_yymm.value = '';

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    // 지국지사코드를 "/ss/brinfo/1120" 서블릿으로 보낸다
    lo_form1.bocd.value = bocd;
    lo_form1.action = "/ss/brinfo/1120";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기-상세에서 호출
function detail_view_detail(){
    var lo_form1 = document.boinfo_detail_form;

	if(lo_form1.bocd.value == ''){
		alert("목록에서 지국을 선택하세요.");
	}
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 지국지사코드를 "/ss/brinfo/1120" 서블릿으로 보낸다
    lo_form1.action = "/ss/brinfo/1120";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {

    var lo_form1 = document.boinfo_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
    // "/ss/brinfo/1110" 서블릿으로 보낸다
    lo_form1.action = "/ss/brinfo/1110";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 지역 검색
function area_search(){
    var lo_form1 = document.boinfo_search_form;
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
    var lo_form1 = document.boinfo_search_form;
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

    var lo_form1 = document.boinfo_search_form;

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
		var lo_form2 = document.boinfo_search_form;
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

    var lo_form1 = document.boinfo_search_form;

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

// 목록 조회시 지국명이 존재할 경우 지국검색 후 목록 조회를 수행한다.
// 이경우 단순 지국검색과 지국검색 후 목록 조회를 수행해야 하는가 구분해야 하고 목록조회를 수행해야 하는 경우는 gs_request 변수값을 L 로 설정한다.
var gs_request = 'N';	// N : 요청없음, L : 조회요청

// 요청 플래그 설정
function set_request(flag){
	gs_request = flag;
}

// 지국검색을 통한 목록 조회
function bo_list_search(){
    var lo_form1 = document.boinfo_search_form;

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
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >지국Info
      &gt; </b> 지국현황</td>
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
      <table width="830" border="0" cellspacing="0" cellpadding="2">
	  <form name="boinfo_search_form" method="post" action="" >
	    <input type="hidden" name="pageno" value ="1">							<!-- 현재 페이지 번호 -->
	    <input type="hidden" name="pagesize" value ="<%= listCount%>">			<!-- 한 화면당 리스트 항목 수 -->
	    <input type="hidden" name="js_fn_nm" value ="page_move">
	    <input type="hidden" name="common_deptcd" value ="">                    <!-- 공통 부서(팀)코드 -->
	    <input type="hidden" name="bocd" value ="">                         	<!-- 지국지사코드 -->
	    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
        <tr>
          <td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">팀&nbsp;</td>
          <td bgcolor="#EBE9DC" width="80" class="title">
		    <select name="deptcd" onChange="area_search();" class="sel_all">
<%
				writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
		    </select>
          </td>
          <td bgcolor="#EBE9DC" class="title" width="50""><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
            지역</td>
          <td bgcolor="#EBE9DC" class="title" width="80"">
	        <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--지역코드, 지역명 목록-->
<%
				writeAreaOpt(session, out, true);
%>
	        </select>
          </td>
          <td bgcolor="#EBE9DC" class="title" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국</td>
	      <td bgcolor="#EBE9DC" class="title" width="160">
	        <input type="text" name="bonm" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
	        <input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--지국검색팝업-->
	        <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서(팀),지역,지국 초기화-->
	      </td>
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
      <!--리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_list_id">
        <tr bgcolor="#dddddd" align="center" height="23">
          <td height="23" class="gray"> 팀&nbsp;</td>
          <td class="gray" width="70"> 지역</td>
          <td class="gray" width="70"> 지국</td>
          <td class="gray" width="70"> 지국장</td>
          <td class="gray" width="310"> 주소</td>
          <td class="gray" width="90"> 지국 전화번호</td>
          <td class="gray" width="90"> 지국장 휴대폰</td>
        </tr>
     <%-- 초기화면 목록 반복 시작 --%>
    <%for(int j=0; j<listCount; j++){%>
        <tr>
          <td class="gray"> &nbsp;</td>
          <td class="gray" width="70"> &nbsp;</td>
          <td class="gray" width="70"> &nbsp;</td>
          <td class="gray" width="70"> &nbsp;</td>
          <td class="gray" width="340"> &nbsp;</td>
          <td class="gray" width="90" align="center"> &nbsp;</td>
          <td class="gray" width="90" align="center"> &nbsp;</td>
        </tr>
	<%}%>
    <%-- 초기화면 목록 반복 끝 --%>
        <tr align="right" height="23">
          <td colspan="9" bgcolor="#dddddd" class="gray">
          	<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>총건수 건</b></td>
        </tr>
      </table>
      <!---button-->
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
		    <jsp:param name = "pageno" 			value="0"/>
		    <jsp:param name = "totalcnt" 		value="0"/>
		    <jsp:param name = "js_fn_nm" 		value="page_move"/>
		    <jsp:param name = "pagesize" 		value="<%= listCount%>"/>
		    <jsp:param name = "page_set_gubun" 	value="0"/>
		    </jsp:include>
		    <!--JSP PAGE END------------------------------------------------------------------------------------>
          </td>
        </tr>
      </table>
	<!--list end-->
    </td>
  </tr>
  <tr>
    <td height="10">
      <!--여백 -->
    </td>
  </tr>
  <tr>
    <td height="10">
      <table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
  	  <!--상세 조회 폼 시작-->
	  <form name="boinfo_detail_form" method="post" action="">
		<input type="hidden" name="bocd" value="">

        <tr>
          <td height="25" bgcolor="#EBE9DC" class="title" width="80"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국현황</td>
          <!--지국명 변경을 위한 td 항목 -->
          <td height="25" bgcolor="#EBE9DC" class="title" width="600" align="left" id="boinfo_detail_bonm_id">&nbsp;</td>
	      <td bgcolor="#EBE9DC" class="title" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">년월</td>
	      <td bgcolor="#EBE9DC" class="title" width="80">
	        <input type="text" name="basi_yymm" size="7" value="" class="text_box" dataType="month" caption="년월">
	      </td>
	      <td bgcolor="#EBE9DC" class="title" align="right">
	        <input type="image" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="right" onclick="javascript:detail_view_detail();window.event.returnValue=false;">
	      </td>
        </tr>

      </form>
      <!--상세 조회 폼 끝-->
      </table>
    </td>
  </tr>
  <tr>
    <td height="3">
      <!--여백 -->
    </td>
  </tr>
  <tr>
    <td>
      <!--조직 (현재) 리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail1">
	    <tr bgcolor="#D5DACD">
          <td colspan="11" align="center" class="gray"><b>조직 (현재)</b></td>
        </tr>
		<tr bgcolor="#dddddd" align="center">
		  <td rowspan="2" class="gray"> 총무 </td>
		  <td colspan="5" class="gray" width="375" align="center"> 배달 </td>
		  <td rowspan="2" class="gray" width="75"> 삽지 </td>
		  <td rowspan="2" class="gray" width="75"> 경리 </td>
		  <td rowspan="2" class="gray" width="75"> 주방 </td>
		  <td rowspan="2" class="gray" width="75"> 기타 </td>
		  <td rowspan="2" class="gray"> 총계 </td>
		</tr>
		<tr bgcolor="#dddddd"  align="center">
		  <td class="gray" width="75"> 전문 </td>
		  <td class="gray" width="75"> 주부 </td>
		  <td class="gray" width="75"> 알바 </td>
		  <td class="gray" width="75"> 기타 </td>
		  <td class="gray" width="75"> 계 </td>
		</tr>
		<tr align="right">
		  <td class="gray" width="75">&nbsp;</td>
		  <td class="gray" width="75">&nbsp;</td>
		  <td class="gray" width="75">&nbsp;</td>
		  <td class="gray" width="75">&nbsp;</td>
		  <td class="gray" width="75">&nbsp;</td>
		  <td class="gray" width="75">&nbsp;</td>
		  <td class="gray" width="75">&nbsp;</td>
		  <td class="gray" width="75">&nbsp;</td>
		  <td class="gray" width="75">&nbsp;</td>
		  <td class="gray" width="75">&nbsp;</td>
		  <td class="gray">&nbsp;</td>
		</tr>
      </table>
    </td>
  </tr>
  <tr>
    <td height="7">
      <!--여백 -->
    </td>
  </tr>
  <tr>
    <td>
      <!--확장/중지 리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="boinfo_detail2">
	    <tr bgcolor="#D5DACD">
          <td colspan="15" align="center" class="gray"><b>확장/중지</b></td>
        <tr>
        <tr align="center">
          <td  rowspan="2" bgcolor="#dddddd" class="gray" width="55"> 확장</td>
          <td class="gray" bgcolor="#dddddd" width="55" > 신청</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 직원</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 요원</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 이전</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 본사</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 계</td>
          <td class="gray" bgcolor="#dddddd" width="55"> 확장율</td>
          <td  rowspan="2" bgcolor="#dddddd" class="gray" width="55"> 중지</td>
          <td class="gray" bgcolor="#dddddd" width="55" > 이사</td>
          <td class="gray" bgcolor="#dddddd" width="55" > 거절</td>
          <td class="gray" bgcolor="#dddddd" width="55" > 타지구독</td>
          <td class="gray" bgcolor="#dddddd" width="55" > 기타</td>
          <td class="gray" bgcolor="#dddddd" width="55" > 계</td>
          <td class="gray" bgcolor="#dddddd" width="55" > 중지율</td>
        </tr>
        <tr >
          <td class="gray" align="right" width="55">&nbsp;</td>
          <td class="gray" align="right" width="55">&nbsp;</td>
          <td class="gray" align="right" width="55">&nbsp;</td>
          <td class="gray" align="right" width="55">&nbsp;</td>
          <td class="gray" align="right" width="55">&nbsp;</td>
          <td class="gray" align="right" width="55">&nbsp;</td>
          <td class="gray" align="right" width="55">&nbsp;</td>
          <td class="gray" align="right" width="55" >&nbsp;</td>
          <td class="gray" align="right" width="55" >&nbsp;</td>
          <td class="gray" align="right" width="55" >&nbsp;</td>
          <td class="gray" align="right" width="55" >&nbsp;</td>
          <td class="gray" align="right" width="55" >&nbsp;</td>
          <td class="gray" align="right" width="55" >&nbsp;</td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td height="7">
      <!--여백 -->
    </td>
  </tr>
  <tr>
    <td>
      <!--부수 리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail3">
	    <tr bgcolor="#D5DACD">
          <td colspan="17" align="center" class="gray"><b>부수</b></td>
        <tr>
        <tr bgcolor="#dddddd" align="center">
          <td  rowspan="2" class="gray" width="70"> 발송부수 </td>
          <td  rowspan="2" class="gray" width="70" bgcolor="#dddddd"> 당월유가 </td>
          <td colspan="6" class="gray"> 준유가 </td>
          <td  rowspan="2" class="gray" width="70"> 홍보지 </td>
          <td  rowspan="2" class="gray" width="70"> 기증지 </td>
          <td  rowspan="2" class="gray" width="70"> 예비지 </td>
          <td colspan="6" class="gray"> 겸영지 </td>
        </tr>
        <tr bgcolor="#dddddd" align="center">
          <td class="gray" width="40"> 1후수 </td>
          <td class="gray" width="40"> 2후수 </td>
          <td class="gray" width="40"> 3후수 </td>
          <td class="gray" width="40"> 4후수 </td>
          <td class="gray" width="40"> 5후수+ </td>
          <td class="gray" width="40"> 계 </td>
          <td class="gray" width="40"> 스포츠 </td>
          <td class="gray" width="40"> 소년 </td>
          <td class="gray" width="40"> 한경 </td>
          <td class="gray" width="40"> 헤럴드 </td>
          <td class="gray" width="40"> 기타 </td>
          <td class="gray" width="40"> 계 </td>
        </tr>
        <tr align="right">
          <td class="gray" width="70" >&nbsp;</td>
          <td class="gray" width="70" >&nbsp;</td>
          <td class="gray" width="40">&nbsp;</td>
          <td class="gray" width="40">&nbsp;</td>
          <td class="gray" width="40">&nbsp;</td>
          <td class="gray" width="40">&nbsp;</td>
          <td class="gray" width="40">&nbsp;</td>
          <td class="gray" width="40">&nbsp; </td>
          <td class="gray" width="70" >&nbsp;</td>
          <td class="gray" width="70" >&nbsp;</td>
          <td class="gray" width="70" >&nbsp;</td>
          <td class="gray" width="40">&nbsp;</td>
          <td class="gray" width="40">&nbsp;</td>
          <td class="gray" width="40">&nbsp;</td>
          <td class="gray" width="40">&nbsp;</td>
          <td class="gray" width="40">&nbsp;</td>
          <td class="gray" width="40">&nbsp;</td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td height="7">
      <!--여백 -->
    </td>
  </tr>
  <tr>
    <td>
      <!--성장리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail4">
	    <tr bgcolor="#D5DACD">
          <td colspan="12" align="center" class="gray"><b>성장</b></td>
        <tr>
        <tr align="center">
          <td  colspan="3" class="gray" bgcolor="#dddddd"> 전월부수 </td>
          <td colspan="3" class="gray" bgcolor="#dddddd"> 당월부수 </td>
          <td colspan="3" class="gray" bgcolor="#dddddd"> 성장부수(전월대비) </td>
          <td colspan="3" class="gray" bgcolor="#dddddd"> 성장부수(전년대비) </td>
        </tr>
        <tr align="center">
          <td class="gray" width="69" bgcolor="#dddddd" > 당월유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd" > 준유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd" > 계 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 당월유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 준유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 계 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 당월유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 준유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 계 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 당월유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 준유가 </td>
          <td class="gray" width="69" bgcolor="#dddddd"> 계 </td>
        </tr>
        <tr align="right">
          <td class="gray" width="69" >&nbsp;</td>
          <td class="gray" width="69" >&nbsp;</td>
          <td class="gray" width="69" >&nbsp;</td>
          <td class="gray" width="69" >&nbsp;</td>
          <td class="gray" width="69" >&nbsp;</td>
          <td class="gray" width="69" >&nbsp;</td>
          <td class="gray" width="69" >&nbsp;</td>
          <td class="gray" width="69" >&nbsp;</td>
          <td class="gray" width="69" >&nbsp;</td>
          <td class="gray" width="69" >&nbsp;</td>
          <td class="gray" width="69" >&nbsp;</td>
          <td class="gray" width="69" >&nbsp;</td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td height="7">
      <!--여백 -->
    </td>
  </tr>
  <tr>
    <td>
      <!--마감리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail5">

        <tr bgcolor="#D5DACD">
          <td colspan="11" align="center" class="gray"><b>마감</b></td>
        <tr>
        <tr bgcolor="#dddddd" align="center">
          <td rowspan="2" class="gray" width="80" bgcolor="#dddddd"> 목표액 </td>
          <td colspan="5" class="gray"> 총수금액 </td>
          <td  rowspan="2" class="gray" width="80"> 전월수금액 </td>
          <td rowspan="2" class="gray" width="80"> 전월대비 </td>
          <td  rowspan="2" class="gray" width="80"> 지역전단 </td>
          <td  rowspan="2" class="gray" width="80"> 조선IS전단 </td>
          <td rowspan="2" class="gray" width="80"> 전단수금액 </td>
        </tr>
        <tr align="center">
          <td bgcolor="#dddddd" class="gray" width="69"> 지로수금 </td>
          <td  bgcolor="#dddddd" class="gray" width="69"> 방문수금 </td>
          <td bgcolor="#dddddd" class="gray" width="69"> 자동이체 </td>
          <td bgcolor="#dddddd" class="gray" width="69"> 기타 </td>
          <td bgcolor="#dddddd" class="gray" width="69"> 소계 </td>
        </tr>
        <tr align="right">
          <td class="gray" width="80">&nbsp;</td>
          <td class="gray" width="69">&nbsp;</td>
          <td class="gray" width="69">&nbsp;</td>
          <td class="gray" width="69">&nbsp;</td>
          <td class="gray" width="69">&nbsp;</td>
          <td class="gray" width="69">&nbsp;</td>
          <td class="gray" width="80">&nbsp;</td>
          <td class="gray" width="80">&nbsp;</td>
          <td class="gray" width="80">&nbsp;</td>
          <td class="gray" width="80">&nbsp;</td>
          <td class="gray" width="80">&nbsp;</td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td height="5">
      <!--여백 -->
    </td>
  </tr>
  <tr>
    <td>
      <!--지대리스트 -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="boinfo_detail6">
	    <tr bgcolor="#D5DACD">
          <td colspan="5" align="center" class="gray"><b>지대</b></td>
        <tr>
        <tr bgcolor="#dddddd" align="center">
          <td class="gray" width="166" > 본지 </td>
          <td class="gray" width="166" > 소년 </td>
          <td class="gray" width="166" > 주간 </td>
          <td class="gray" width="166" > 스포츠 </td>
          <td class="gray" width="166" > 계 </td>
        </tr>
        <tr align="right">
          <td class="gray" width="166" >&nbsp;</td>
          <td class="gray" width="166" >&nbsp;</td>
          <td class="gray" width="166" >&nbsp;</td>
          <td class="gray" width="166" >&nbsp;</td>
          <td class="gray" width="166" >&nbsp;</td>
        </tr>
      </table>
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
