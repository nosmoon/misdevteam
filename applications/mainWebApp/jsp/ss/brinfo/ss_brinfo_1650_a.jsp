<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brinfo_1650_a.jsp
* 기능 	 	 : 지국info-SMS 초기화면
* 작성일자 	 : 2004-04-02
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //	dataset 인스턴스 선언부분
    chosun.ciis.ss.sls.common.ds.SS_L_NWBUSEOCDDataSet ds = (chosun.ciis.ss.sls.common.ds.SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");  // request dataset
    applySession = true;	// 세션 적용 여부
%>
<html>
<head>
<script language="javascript">
<!--

// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.sms_search_form.bonm.focus();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 전달사항 상세보기
function list_search() {
	var lo_form1 = document.sms_search_form;

	if(lo_form1.bocd.value == ''){
		alert("지국을 검색해 주세요");
		return;
	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	lo_form1.action = "/ss/brinfo/1660";
	lo_form1.target = "ifrm";
	lo_form1.submit();
}

// sms정보 수정
/*
function sms_edit(){
	var lo_form1 = document.sms_form;

	if(lo_form1.smsset_check.checked) lo_form1.smsset.value="Y";
	if(lo_form1.emailset_check.checked) lo_form1.emailset.value="Y";

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	lo_form1.action = "/ss/brinfo/1670";
	lo_form1.target = "ifrm";
	lo_form1.method = "post";
	lo_form1.submit();
}
*/

// 지역 검색
function area_search(){

    var lo_form1 = document.sms_search_form;
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
    var lo_form1 = document.sms_search_form;

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

    var lo_form1 = document.sms_search_form;

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
		var lo_form2 = document.sms_search_form;
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

    var lo_form1 = document.sms_search_form;

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
    var lo_form1 = document.sms_search_form;

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
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
</head>
<!--Body 시작-------------------------------------------------------------------------------------------------->
<!--body bgcolor="#FFFFFF" topmargin=0 leftmargin=5-->
<body onload="jsInit();" bgcolor="#F8F7F7"  leftmargin="0" topmargin="0" class="scroll1">

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >지국Info
      &gt; </b> 발송노선 &gt; SMS </td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <form name="sms_search_form" method="post" action="" >
    <input name="common_deptcd" type="hidden" value ="">                    <!-- 공통 부서코드 -->
    <input name="bocd" type="hidden" value ="">                         	<!-- 지국지사코드 -->
    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
	<tr>
		<td bgcolor="#EBE9DC" class="sea_top" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">팀&nbsp;
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="80">
            <select name="deptcd" onChange="area_search();" class="sel_all"><!-- 부서코드, 코드명 목록 -->
	<%
				writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true);
	%>
            </select>
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="80">
            <select name="areacd" id="areacd_id" class="sel_all">  <!--지역코드, 지역명 목록-->
	<%
				writeAreaOpt(session, out, true);
	%>
            </select>
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="180">
			<input name="bonm" type="text" style="ime-mode:active;" size="12" class="text_box" value=""  onkeydown="bo_enter_search();">
			<input type="image" src="/html/comm_img/bu_search02.gif" width="36" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--지국검색팝업-->
			<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" align="right">
			<input type="image" onclick="set_request('L');bo_list_search();window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif">
		</td>
  </tr>
  <tr bgcolor="#927F5B">
	<td colspan="7" height="1">
		<!--line -->
	</td>
  </tr>
  <tr>
    <td height="4" colspan="4">
      <!--여백-->
    </td>
  </tr>
  </form>
</table>
<!--입력테이블 시작-------------------------------------------------------------------------------------------------->

<table bgcolor="#FFFFFF" width="830" height="25" border="0" cellpadding="1" cellspacing="0" class="gray" align="center">
<form name="sms_form" method="post" action="" >
	<input name="smsset" type="hidden" value="">
	<input name="emailset" type="hidden" value="">
	<tr>
		<td height="27" width="150" bgcolor="#dddddd" class="gray"><font class="gdt">&nbsp;&nbsp;SMS 수신번호1</font></td>
		<td width="300" height="27" class="gray">&nbsp;&nbsp;<font class="cow"><input type="text" name="sms1" size="12" maxlength="11" align="absmiddle" value=""></font></td>
		<td width="400" height="27" colspan="2" class="gray"><font class="su">*</font><font class="su"> SMS 수신번호는 '-' 없이 입력하십시오.</font></td>
	</tr>
	</tr>
		<td height="27" width="150" bgcolor="#dddddd" class="gray"><font class="gdt">&nbsp;&nbsp;SMS 수신번호2</font></td>
		<td width="300" height="27" class="gray">&nbsp;&nbsp;<font class="cow"><input type="text" name="sms2" size="12" maxlength="11" align="absmiddle" value=""></font></td>
		<td width="400" height="27" colspan="2" class="gray"><font class="su">*</font><font class="su"> SMS 수신번호 1개이상 입력시 전부 수신됩니다.</font></td>
	</tr>
	<tr>
		<td height="27" width="150" bgcolor="#dddddd" class="gray"><font class="gdt">&nbsp;&nbsp;SMS 수신번호3</font></td>
		<td width="260" height="27" class="gray">&nbsp;&nbsp;<font class="cow"><input type="text" name="sms3" size="12" maxlength="11" align="absmiddle" value=""></font></td>
		<td height="27" width="110" bgcolor="#dddddd" class="gray"><font class="gdt">&nbsp;&nbsp;E-MAIL</font></td>
		<td width="270" height="27" class="gray"><font class="cow">&nbsp;&nbsp;<input type="text" name="emailnm" size="30" maxlength="30" value=""></font></td>
	</tr>
	<tr>
		<td width="150" height="27" bgcolor="#dddddd" class="gray"><font class="gdt">&nbsp;&nbsp;SMS 수신설정</font></td>

  		<td width="300" height="27" class="gray">&nbsp;&nbsp;<font class="cow">
  			<input name="smsset_check" size="20" type="checkbox" value="Y">&nbsp;&nbsp;SMS 통보
  			<input name="emailset_check" size="20" type="checkbox" value="Y">&nbsp;&nbsp;EMAIL 통보</font>
  		</td>
		<td height="27" colspan="2" class="gray">&nbsp;</td>
	</tr>
</form>
</table>
	<!--button -->
	<%--
	<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
	  <tr>
	    <td align="center" height="2" bgcolor="#FFFFFF">
	      <!--여백-->
	    </td>
	  </tr>
	  <tr>
	    <td align="center" height="24" bgcolor="#E8E8E8">
          	<input type="image" src="/html/comm_img/bu_save.gif" name="update_btn" value="" align="absmiddle"
          		onclick="sms_edit();window.event.returnValue=false;">
	    </td>
	  </tr>
	</table>
	--%>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="00" height="00"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
<!--Body 종료-------------------------------------------------------------------------------------------------->
</html>
