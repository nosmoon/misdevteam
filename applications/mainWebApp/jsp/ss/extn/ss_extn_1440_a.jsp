<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1440_a.jsp
* 기능 : 확장현황-확장지원비-등록/조회-초기화면
* 작성일자 : 2003-12-18
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
	document.sply_search_form.bonm.focus();
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

    var lo_form1 = document.sply_search_form;
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
    var lo_form1 = document.sply_search_form;
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

    var lo_form1 = document.sply_search_form;

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
		var lo_form2 = document.sply_search_form;
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
    var lo_form1 = document.sply_search_form;

    // 화면제어와 성능을 위해 부서,지역, 년월(기준일자)를 필수로 선택한 후 검색하게 한다.
	if(lo_form1.deptcd.value == '' && lo_form1.bonm.value == ''){
		alert("부서를 선택하세요");
		return;
    }
/*    
    if(lo_form1.areacd.value == ''){
		alert("지역을 선택하세요");
		return;
    }
*/  
    if(lo_form1.basidt.value == ''){
		alert("년월(기준일자)을 선택하세요");
		return;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 확장신청목록 조회조건을 "/ss/extn/1445" 서블릿으로 보낸다
    lo_form1.action = "/ss/extn/1445";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}


// 취소
function sply_cancel(){
    var lo_form1 = document.sply_list_form;

	lo_form1.reset();
}

// 저장
function sply_save(){
	var lb_submit = false;						// SUBMIT 결정 변수
    var lo_form1 = document.sply_list_form;
    
    if(!check_all(lo_form1)) return;			// 폼 유효성 체크

	if(lo_form1.payqty == null){				// 입력항목이 없을 경우
		return;
	}else if(lo_form1.payqty.type == "text"){	// 입력항목이 한건일 겨우
		var ls_temp;
		lo_form1.basidtary.value = lo_form1.basidt.value;
		lo_form1.bocdary.value = lo_form1.bocd.value;
		lo_form1.payqtyary.value = lo_form1.payqty.value;
		lo_form1.uprcary.value = lo_form1.uprc.value;
		lo_form1.splyamtary.value = lo_form1.splyamt.value;
	}else{										// 입력항목이 여러건일 경우

	    // 지급부수, 수당단가, 지원금액, 지국지사코드, 선택여부를 문자열 집합으로 만든다.
		var ls_basidtary = "";
		var ls_bocdary = "";
		var ls_payqtyary = "";
	  	var ls_uprcary	= "";
	  	var ls_splyamtary = "";
	
	    for(var i=0; i<lo_form1.payqty.length; i++) {
	    	// 모든 입력항목이 비어있는 행은 SKIP 한다.
	    	if( (lo_form1.payqty[i].value == '') && (lo_form1.uprc[i].value == '') && (lo_form1.splyamt[i].value == '') ){
	    		continue;
	    	}
	    	// 모든 입력항목이 0인 행은 SKIP 한다.
	    	if( (lo_form1.payqty[i].value == 0) && (lo_form1.uprc[i].value == 0) && (lo_form1.splyamt[i].value == 0) ){
	    		continue;
	    	}
	    	// 모든 입력항목이 0인 행은 SKIP 한다.
	    	if( (lo_form1.payqty[i].value == '0') && (lo_form1.uprc[i].value == '0') && (lo_form1.splyamt[i].value == '0') ){
	    		continue;
	    	}
	

	    	// 지급부수 항목 체크
	    	if(lo_form1.payqty[i] == '' ){
	    		alert("지급부수를 입력하세요");
	    		return;
	    	}
	    	// 수당단가 항목 체크
	    	if(lo_form1.uprc[i] == '' ){
	    		alert("수당단가를 입력하세요");
	    		return;
	    	}
	    	// 지원금액 항목 체크
	    	if( lo_form1.splyamt[i] == '' ){
	    		alert("지원금액을 입력하세요");
	    		return;
	    	}
	    	
			// 한 항목이라도 입력된 항목이 있으면 SUBMIT 한다.
			lb_submit = true;

			ls_basidtary = ls_basidtary + lo_form1.basidt[i].value + "<%= paramGbn%>";
			ls_bocdary = ls_bocdary + lo_form1.bocd[i].value + "<%= paramGbn%>";
			ls_payqtyary = ls_payqtyary + lo_form1.payqty[i].value + "<%= paramGbn%>";
			ls_uprcary = ls_uprcary + lo_form1.uprc[i].value + "<%= paramGbn%>";
			ls_splyamtary = ls_splyamtary + lo_form1.splyamt[i].value + "<%= paramGbn%>";
	    }
		lo_form1.basidtary.value = ls_basidtary.substring(0, ls_basidtary.length-2);
		lo_form1.bocdary.value = ls_bocdary.substring(0, ls_bocdary.length-2);
		lo_form1.payqtyary.value = ls_payqtyary.substring(0, ls_payqtyary.length-2);
		lo_form1.uprcary.value = ls_uprcary.substring(0, ls_uprcary.length-2);
		lo_form1.splyamtary.value = ls_splyamtary.substring(0, ls_splyamtary.length-2);
	}

	// SUBMIT 변수를 확인하여 요청을 보낸다.
	if(lb_submit){
        // 지급부수, 수당단가, 지원금액의 문자열 집합 정보를 "/ss/extn/1450" 서블릿으로 보낸다.
        lo_form1.action = "/ss/extn/1450";
        lo_form1.target = "ifrm";
        lo_form1.submit();
	}else{
		alert("저장할 항목이 없습니다.");
		return;
	}
}

// 자동 입력
function set_auto_input(){
    var lo_form1 = document.sply_list_form;
	var ls_val	= deleteCommaStr(document.dummy.auto_input.value);
	
	if(lo_form1.uprc == null){					// 수당단가가 없을 경우
		alert("입력항목이 없습니다.");
		return;
	}else if(lo_form1.uprc.type == "text"){		// 수당단가가 한 건일 경우
    	if(lo_form1.payqty.value == ''){
			alert("지급부수를 입력하세요.");
			return;
    	}
        lo_form1.uprc.value = ls_val;        
        lo_form1.splyamt.value = (eval(ls_val)*eval(deleteCommaStr(lo_form1.payqty.value)))+'';
	}else{										// 수당단가가 여러 건일 경우
	    for(var i=0; i<lo_form1.uprc.length; i++) {
	    	// 모든 로우 중 지급부수의 값이 있는 로우의 단가 항목의 값을 자동입력창에 있는 값으로 채운다.
	    	if(lo_form1.payqty[i].value == ''){
	    		continue;
	    	}
	    	if(lo_form1.payqty[i].value == '0'){
	    		continue;
	    	}
	    	if(lo_form1.payqty[i].value == 0){
	    		continue;
	    	}
	    	
	        lo_form1.uprc[i].value = ls_val;	        
        	lo_form1.splyamt[i].value = (eval(ls_val)*eval(deleteCommaStr(lo_form1.payqty[i].value)))+'';
	    }
	}
    setEventHandler();
	
}

// 검색 조건 초기화
function set_default(flag){

    var lo_form1 = document.sply_search_form;
		
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
    var lo_form1 = document.sply_search_form;

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
		<td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >확장현황 >
		</b>확장지원비 &gt; 등록</td>
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

	<!--확장지원 비용 검색 시작 ---------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="0" class="title1" bgcolor="#EBE9DC">
	<form name="sply_search_form" method="post" action="" >
		<input name="common_deptcd" type="hidden" value ="">                    <!-- 공통 부서코드 -->
        <input name="bocd" type="hidden" value ="">                    			<!-- 지국코드 -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
		<tr>
			<td bgcolor="#D2C69B" height="30" width="230">
				<input type="checkbox" name="boextn" value="Y" checked>지국
				<input type="checkbox" name="movm" value="Y" checked>이사
				<input type="checkbox" name="empextn" value="Y" checked>사원
				<input type="checkbox" name="exgextn" value="Y" checked>품앗이
			</td>
			<td height="30"><!--구분을 위한 이미지--><img src="/html/comm_img/search4.gif" width="13" height="30"></td>
			<td bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서</td>
			<td width="80">
	            <select name="deptcd" onChange="area_search();" class="sel_all"><!-- 부서코드, 코드명 목록 -->
<%						 
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), false);
%>	
	            </select>
			</td>
			<td bgcolor="#EBE9DC" width="40"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역</td>
			<td width="80">
	            <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--지역코드, 지역명 목록-->
<%
					writeAreaOpt(session, out, false);
%>                    
	            </select>
			</td>
			<td bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국</td>
			<td bgcolor="#EBE9DC" width="160">
            	<input name="bonm" type="text" style="ime-mode:active;" size="8" class="text_box"  onkeydown="bo_enter_search();">
            	<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"><!--지국검색팝업-->
            	<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
            </td>
			<td bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">년월</td>
			<td bgcolor="#EBE9DC" width="60">
	            <input name="basidt" type="text" size="7" class="text_box" caption="년월" value="<%= Util.getYyyyMm()%>" dataType="month">
	        </td>
	        <td align="right">
            	<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"></td><!--목록 조회-->
			</td>
		</tr>
    </form>
	</table>
	<!--확장지원 비용 검색 끝 ---------------------------------------------------------------------------->

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
	<form name="dummy">
		<tr>
			<td  height="27" bgcolor="#EBE9DC" class="title">확장지원비 등록</td>
			<td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="300">
				<input name="auto_input" type="text" size="8" class="text_box" value="" dataType="integer" comma style="text-align:right">
				<input type="image" id="auto_input_id" src="/html/comm_img/bu_input.gif" align="absmiddle" border="0" onclick="set_auto_input();window.event.returnValue=false;">
				<input type="image" id="save_id"" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="sply_save();window.event.returnValue=false;">
				<input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" align="absmiddle" border="0" onclick="sply_cancel();window.event.returnValue=false;">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
				<!--여백-->
			</td>
		</tr>
	</form>		
	</table>

    <!--확장지원 비용 목록 시작 ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="sply_list_id">
    <form name="sply_list_form" method="post" action="" >
        <input name="basidt" type="hidden" value ="">
        <input name="bocd" type="hidden" value ="">
        <input name="basidtary" type="hidden" value ="">
        <input name="bocdary" type="hidden" value ="">
        <input name="payqtyary" type="hidden" value ="">
        <input name="uprcary" type="hidden" value ="">
        <input name="splyamtary" type="hidden" value ="">

		<tr bgcolor="#dddddd" align="center">
			<td rowspan="2" class="gray">지국</td>
			<td width="45" rowspan="2" class="gray">실독자</td>
			<td width="45" rowspan="2" class="gray">지국</td>
			<td width="45" rowspan="2" class="gray">이사</td>
			<td width="45" rowspan="2" class="gray">사원</td>
			<td width="45" rowspan="2" class="gray">품앗이</td>
			<td width="45" rowspan="2" class="gray">계</td>
			<td colspan="6" class="gray">주거형태</td>
			<td width="55" rowspan="2" class="gray" bgcolor="#dddddd">지급부수</td>
			<td width="55" rowspan="2" class="gray">수당단가</td>
			<td width="60" rowspan="2" class="gray">지원금액</td>
		</tr>
		<tr bgcolor="#dddddd" align="center">
			<td width="40" class="gray">APT</td>
			<td width="40" class="gray">빌라</td>
			<td width="40" class="gray">주택</td>
			<td width="40" class="gray">사무실</td>
			<td width="40" class="gray">상가</td>
			<td width="40" class="gray">기타</td>
		</tr>
        <%-- 초기화면 목록 반복 시작 --%>		
		<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td class="gray" align="left">&nbsp;</td>
			<td width="45" class="gray" align="left">&nbsp;</td>
			<td width="45" class="gray" align="right">&nbsp;</td>
			<td width="45" class="gray" align="right">&nbsp;</td>
			<td width="45" class="gray" align="right">&nbsp;</td>
			<td width="45" class="gray" align="right">&nbsp;</td>
			<td width="45" class="gray" align="right">&nbsp;</td>
			<td width="40" class="gray" align="right">&nbsp;</td>
			<td width="40" class="gray" align="right">&nbsp;</td>
			<td width="40" class="gray" align="right">&nbsp;</td>
			<td width="40" class="gray" align="right">&nbsp;</td>
			<td width="40" class="gray" align="right">&nbsp;</td>
			<td width="40" class="gray" align="right">&nbsp;</td>
			<td width="55" class="gray" align="center"><input name="text" type="text" size="7" class="text_box"></td>
			<td width="55" class="gray" align="center"><input name="text" type="text" size="7" class="text_box"></td>
			<td width="60" class="gray" align="center"><input name="text" type="text" size="8" class="text_box"></td>
		</tr>
		<%}%>
        <%-- 초기화면 목록 반복 끝 --%>
        
		<tr bgcolor="#dddddd">
			<td colspan="16" class="gray" height="23">
				<div align="right">
					<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총지원금액 원 </b>&nbsp;&nbsp;&nbsp;					
					<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
				</div>
			</td>
		</tr>

    </form>
    </table>
    <!--확장지원 비용 목록 끝 ---------------------------------------------------------------------------->

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
