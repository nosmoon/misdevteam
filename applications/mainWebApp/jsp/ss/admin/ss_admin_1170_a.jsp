<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1170_a.jsp
* 기능 : 관리자-마이그레이션-현황-초기화면
* 작성일자 : 2004-03-12
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
    int listCount = 10;		// 화면 당 항목수
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
function area_search(){
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
}

// 지국찾기 팝업
// 지국지사코드, 지국지사명이 팝업으로부터 넘어온다. 두 값의 구분자는 "\n"
function bo_search(){
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

	if(lo_form1.deptcd.value == '' && lo_form1.bonm.value == ''){
		alert("팀을 선택하세요.");
		return;
	}
/*
	if(lo_form1.areacd.value == ''){
		alert("지역을 선택하세요.");
		return;
	}
*/
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	// 목록 검색조건을 "/ss/admin/1175" 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1175";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 전체선택, 취소
function check_all_chk(bool){
    var lo_form1 = document.mig_list_form;

    if(lo_form1.endcnfmyn==null) {						// 선택된 건이 없는 경우
        return;
    } else if(lo_form1.endcnfmyn.type=="checkbox") {	// 한건인 경우
        lo_form1.endcnfmyn.checked = bool;
    } else {											// 여러건인 경우
        for(var i=0; i<lo_form1.endcnfmyn.length; i++) {
            lo_form1.endcnfmyn[i].checked = bool;
        }
    }
}

// 취소
function mig_cancel(){
    var lo_form1 = document.mig_list_form;

	lo_form1.reset();
}


// 저장
function mig_save(){
    var lo_form1 = document.mig_list_form;
	if(lo_form1.endcnfmyn == null){						// 체크박스가 없을 때
		return;
	}else if(lo_form1.endcnfmyn.type == "checkbox"){	// 체크박스가 한개 일때
        lo_form1.bocdary.value = lo_form1.bocd.value;
        if(lo_form1.endcnfmyn.checked){
            lo_form1.checkedary.value = "Y";
        }else{
            lo_form1.checkedary.value = "N";
        }
	}else{												// 체크박스가 여러 개일때
	    // 지국지사코드, 선택여부를 문자열 집합으로 만든다.
		var ls_bocdary = "";
		var	ls_checkedary = "";
	    for(var i=0; i<lo_form1.endcnfmyn.length; i++) {

			ls_bocdary = ls_bocdary + lo_form1.bocd[i].value + "<%= paramGbn%>";

	        if(lo_form1.endcnfmyn[i].checked){
			    ls_checkedary = ls_checkedary + "Y" + "<%= paramGbn%>";
	        }else{
			    ls_checkedary = ls_checkedary + "N" + "<%= paramGbn%>";
	        }
	    }
		lo_form1.bocdary.value = ls_bocdary.substring(0, ls_bocdary.length-2);
		lo_form1.checkedary.value = ls_checkedary.substring(0, ls_checkedary.length-2);
    }

    // 지국지사코드, 선택여부를 문자열 집합을 "/ss/admin/1180" 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1180";
    lo_form1.target = "ifrm";
    lo_form1.submit();
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

//-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >관리자
		> </b>작업 &gt; 마이그레이션 현황</td>
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

	<!--마이그레이션 현황 검색 시작 ---------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
	<form name="mig_search_form" method="post" action="" >
		<input name="common_deptcd" type="hidden" value ="">                    	<!-- 공통 부서(팀)코드 -->
		<input name="bocd" type="hidden" value ="">                    				<!-- 지국코드 -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   	<!-- 세션 적용 여부 -->
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
			<td width="220">
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국
				<input name="bonm" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
            	<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;" border="0"><!--지국검색팝업-->
            	<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서(팀),지역,지국 초기화-->
			</td>
			</td>
			<td width="160">
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">완료
	            <select name="endcnfmyn" size="1" class="sel_all"><!--완료여부-->
	            	<option value="" selected>전체</option>
	            	<option value="Y">완료</option>
	            	<option value="N">미완료</option>
	            </select>
			</td>
			<td bgcolor="#EBE9DC" align="right">
				<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;" border="0" >
			</td>
		</tr>
	</form>
	</table>
	<!--마이그레이션 현황 검색 끝 ---------------------------------------------------------------------------->

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
			<td  height="27" bgcolor="#EBE9DC" class="title">마이그레이션 현황 목록</td>
			<td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="240">
				<input type="image" id="ckeck_all_chk_true_id" src="/html/comm_img/bu_all01.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(true)">
				<input type="image" id="ckeck_all_chk_false_id" src="/html/comm_img/bu_all02.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(false)">
				<input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:mig_cancel()">
				<input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:mig_save()">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
			<!--여백-->
			</td>
		</tr>
	</table>

    <!--마이그레이션 현황 목록 시작 ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="mig_list_id">
	<form name="mig_list_form" method="post" action="" >
		<input name="bocdary" type="hidden" value ="">                    				<!-- 지국코드 -->
        <input name="checkedary" type="hidden" value ="">

		<tr bgcolor="#dddddd" align="center">
			<td width="90" rowspan="2" height="23" class="gray" align="center"> 팀&nbsp; </td>
			<td width="90" rowspan="2" height="23" class="gray" align="center"> 지역 </td>
			<td width="100" rowspan="2" height="23" class="gray" align="center"> 지국 </td>
			<td width="240" colspan="2" height="23" class="gray" align="center"> DB업로드 </td>
			<td width="240" colspan="2" height="23" class="gray" align="center"> DB전환 </td>
			<td rowspan="2" height="23" class="gray" align="center"> 완료 </td>
		</tr>
		<tr bgcolor="#dddddd" align="center">
			<td width="120" height="23" class="gray" align="center"> 시작일자 </td>
			<td width="120" height="23" class="gray" align="center"> 종료일자 </td>
			<td width="120" height="23" class="gray" align="center"> 시작일자 </td>
			<td width="120" height="23" class="gray" align="center"> 종료일자 </td>
		</tr>

        <%-- 초기화면 목록 반복 시작 --%>
		<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td width="90" class="gray" align="center">&nbsp; </td>
			<td width="90" class="gray" align="center">&nbsp; </td>
			<td width="100" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td class="gray" align="center"><input type="checkbox" name="checkbox">&nbsp;</td>
		</tr>
		<%}%>
        <%-- 초기화면 목록 반복 끝 --%>

		<tr bgcolor="#dddddd" height="23">
			<td colspan="8" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건</b>
			</td>
		</tr>
	</form>
    </table>
    <!--마이그레이션 현황 목록 끝 ---------------------------------------------------------------------------->

  <tr>
    <td height="10">
      <!------여백--- -->
    </td>
  </tr>

</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
