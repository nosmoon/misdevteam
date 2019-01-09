<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1665_a.jsp
* 기능 : 확장현황-사이버확장-수당-초기화면
* 작성일자 : 2004-09-10
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_CYEXPAY_INITDataSet ds = (SS_L_PROMSTAF_CYEXPAY_INITDataSet)request.getAttribute("ds");
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
	document.alon_search_form.bonm.focus();
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

    var lo_form1 = document.alon_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>선택</option>" +
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
    var lo_form1 = document.alon_search_form;
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

    var lo_form1 = document.alon_search_form;

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
		var lo_form2 = document.alon_search_form;
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
    var lo_form1 = document.alon_search_form;

    // 화면제어와 성능을 위해 부서,지역을 필수로 선택한 후 검색하게 한다.   
/*
	if(lo_form1.deptcd.value == '' && lo_form1.bonm.value == ''){
		alert("부서를 선택하세요");
		return;
    }    
    
    if(lo_form1.areacd.value == ''){
		alert("지역을 선택하세요");
		return;
    }
*/  
    if(!check_all(lo_form1)) return;							// 폼 유효성 체크

    // 조회조건을 "/ss/extn/1170" 서블릿으로 보낸다
    lo_form1.action = "/ss/extn/1170";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 전체선택, 취소
function check_all_chk(bool){
    var lo_form1 = document.alon_list_form;

    if(lo_form1.alonadjmyn==null) {								// 선택된 건이 없는 경우
        return;
    } else if(lo_form1.alonadjmyn.type=="checkbox") {			// 한건인 경우
        lo_form1.alonadjmyn.checked = bool;
    } else {													// 여러건인 경우
        for(var i=0; i<lo_form1.alonadjmyn.length; i++) {
            lo_form1.alonadjmyn[i].checked = bool;
        }
    }
}

// 취소
function alon_cancel(){
    var lo_form1 = document.alon_list_form;

	lo_form1.reset();
}


// 저장
function alon_save(){
    var lo_form1 = document.alon_list_form;
    
	if(lo_form1.alonadjmyn == null){					// 체크박스가 없을 때
		return;
	}else if(lo_form1.alonadjmyn.type == "checkbox"){	// 체크박스가 한개 일때
        lo_form1.rdr_extndtary.value = lo_form1.alonadjmyn.value.substring(0, 8);
        lo_form1.rdr_extnnoary.value = lo_form1.alonadjmyn.value.substring(8, 14);
        if(lo_form1.alonadjmyn.checked){
            lo_form1.checkedary.value = "Y";
        }else{
            lo_form1.checkedary.value = "N";
        }
	}else{													// 체크박스가 여러 개일때
	    // 확장일자, 확장번호, 선택여부를 문자열 집합으로 만든다.
		var	ls_temp;
		var ls_rdr_extndtary = "";
		var ls_rdr_extnnoary = "";
		var	ls_checkedary = "";
	    for(var i=0; i<lo_form1.alonadjmyn.length; i++) {
	
			ls_temp = lo_form1.alonadjmyn[i].value;
			ls_rdr_extndtary = ls_rdr_extndtary + ls_temp.substring(0, ls_temp.length-5) + "<%= paramGbn%>";
			ls_rdr_extnnoary = ls_rdr_extnnoary + ls_temp.substring(6, ls_temp.length) + "<%= paramGbn%>";
	
	        if(lo_form1.alonadjmyn[i].checked){
			    ls_checkedary = ls_checkedary + "Y" + "<%= paramGbn%>";
	        }else{
			    ls_checkedary = ls_checkedary + "N" + "<%= paramGbn%>";
	        }
	    }
		lo_form1.rdr_extndtary.value = ls_rdr_extndtary.substring(0, ls_rdr_extndtary.length-2);
		lo_form1.rdr_extnnoary.value = ls_rdr_extnnoary.substring(0, ls_rdr_extnnoary.length-2);
		lo_form1.checkedary.value = ls_checkedary.substring(0, ls_checkedary.length-2);
    }
    
    // 확장일자, 확장번호, 선택여부를 문자열 집합 정보를 "/ss/extn/1775" 서블릿으로 보낸다.
    lo_form1.action = "/ss/extn/1775";
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

    var lo_form1 = document.alon_search_form;
		
	if(flag == '1'){			// 부서,지역,지국 초기화
		// 부서 초기화
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
    var lo_form1 = document.alon_search_form;

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

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >확장현황
       </b>사이버확장 &gt; 수당 </td>
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
      <!--사이버확장 수당 검색 시작 ---------------------------------------------------------------------------->
      <table width="830" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" id="alon_search_id">
      <form name="alon_search_form" method="post" action="" >
        <input name="common_deptcd" type="hidden" value ="">                    <!-- 공통 부서코드 -->
        <input name="bocd" type="hidden" value ="">                    			<!-- 지국코드 -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
        <tr>
          <td class="title"  bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서</td>
          <td class="title"  width="80">
            <select name="deptcd" onChange="area_search();" class="sel_all"><!-- 부서코드, 코드명 목록 -->
<%						 
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), false);
%>	
            </select>
          </td>
          <td class="title"  bgcolor="#EBE9DC" width="40"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역</td>
          <td class="title"  width="80">
            <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--지역코드, 지역명 목록-->
<%
					writeAreaOpt(session, out, false);
%>                    
            </select>
          </td>
          <td class="title"  bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국</td>
          <td class="title"  bgcolor="#EBE9DC" width="160">
            <input name="bonm" type="text" style="ime-mode:active;" size="8" class="text_box" onkeydown="bo_enter_search();">
            <input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"><!--지국검색팝업-->
            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
          </td>
          <td class="title"  align="right">
            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"></td><!--목록 조회-->
          </td>
        </tr>
	  </form>
      </table>
         <!--사이버확장 수당 검색 끝 ---------------------------------------------------------------------------->
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
          <td  height="27" bgcolor="#EBE9DC" class="title">사이버확장대회 수당목록</td>
          <td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="240">
			<input type="image" id="ckeck_all_chk_true_id" src="/html/comm_img/bu_all01.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(true)">
            <input type="image" id="ckeck_all_chk_false_id" src="/html/comm_img/bu_all02.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(false)">
            <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:alon_cancel()">
            <input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:alon_save()">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--여백-->
          </td>
        </tr>
      </table>

    <!--사이버확장 수당 목록 시작 ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="alon_list_id">
    <form name="alon_list_form" method="post" action="" >
        <input name="rdr_extndt" type="hidden" value ="">
        <input name="rdr_extnno" type="hidden" value ="">
        <input name="rdr_extndtary" type="hidden" value ="">
        <input name="rdr_extnnoary" type="hidden" value ="">
        <input name="checkedary" type="hidden" value ="">
        <input name="accflag" type="hidden" value ="">
        
		<tr bgcolor="#dddddd" align="center" height="23">
			<td width="70" class="gray" align="center">확장일자</td>
			<td width="70" class="gray" align="center">요원명</td>
			<td width="70" class="gray" align="center">독자명</td>
			<td width="60" class="gray" align="center">매체</td>
			<td width="50" class="gray" align="center">부수</td>
			<td width="80" class="gray" align="center">지역</td>
			<td width="80" class="gray" align="center">지국</td>
			<td width="80" class="gray" align="center">확인일자</td>
			<td width="100" class="gray" align="center">오류</td>
			<td width="80" class="gray" align="center">수당</td>
			<td width="80" class="gray" align="center">정산일자</td>
			<td class="gray" align="center">정산여부</td>
		</tr>
		
        <%-- 초기화면 목록 반복 시작 --%>		
		<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td width="70" class="gray" align="center">&nbsp;</td>
			<td width="70" class="gray" align="center">&nbsp;</td>
			<td width="70" class="gray" align="center">&nbsp;</td>
			<td width="60" class="gray" align="center">&nbsp;</td>
			<td width="50" class="gray" align="center">&nbsp;</td>
			<td width="80" class="gray" align="center">&nbsp;</td>
			<td width="80" class="gray" align="center">&nbsp;</td>
			<td width="80" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="80" class="gray" align="center">&nbsp;</td>
			<td width="80" class="gray" align="center">&nbsp;</td>
			<td class="gray" align="center">&nbsp;</td>
		</tr>
		<%}%>
        <%-- 초기화면 목록 반복 끝 --%>
		
    </form>
    </table>
    <!--사이버확장 수당 목록 끝 ---------------------------------------------------------------------------->
	</td>
  </tr>
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
