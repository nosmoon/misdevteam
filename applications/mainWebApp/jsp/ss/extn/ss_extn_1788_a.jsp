<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1788_a.jsp
* 기능 : 확장현황-사이버확장-비용관리(지원)-초기화면
* 작성일자 : 2004-04-09
* 작성자 : 고윤홍
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
	document.cost_search_form.bonm.focus();
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
function area_search()
{
    var lo_form1 = document.cost_search_form;
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
    var lo_form1 = document.cost_search_form;
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

    var lo_form1 = document.cost_search_form;

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
		var lo_form2 = document.cost_search_form;
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
function list_search()
{
    var lo_form1 = document.cost_search_form;

    // 화면제어와 성능을 위해 부서,지역을 필수로 선택한 후 검색하게 한다.
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
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 확장신청목록 조회조건을 "/ss/extn/1790" 서블릿으로 보낸다
    lo_form1.action = "/ss/extn/1790";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 전체선택, 취소
function check_all_chk(bool){
    var lo_form1 = document.cost_list_form;

    if(lo_form1.splychrgclamtyn==null) {						// 선택된 건이 없는 경우
        return;
    } else if(lo_form1.splychrgclamtyn.type=="checkbox") {		// 한건인 경우
        lo_form1.splychrgclamtyn.checked = bool;
    } else {													// 여러건인 경우
        for(var i=0; i<lo_form1.splychrgclamtyn.length; i++) {
            lo_form1.splychrgclamtyn[i].checked = bool;
        }
    }
}

// 취소
function cost_cancel(){
    var lo_form1 = document.cost_list_form;

	lo_form1.reset();
}

// 비용 상세보기
function cost_detail_view(basidt, bocd){
    var lo_form1 = document.cost_list_form;

    // 사이버확장비용 기준일자, 지국코드를 "/ss/extn/1792" 서블릿으로 보낸다
    lo_form1.basidt.value = basidt;
    lo_form1.bocd.value = bocd;
    lo_form1.action = "/ss/extn/1792";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 저장
function cost_save(){
    var lo_form1 = document.cost_list_form;

	if(lo_form1.splychrgclamtyn== null){					// 체크박스가 없을 때
		return;
	}else if(lo_form1.splychrgclamtyn.type == "checkbox"){	// 체크박스가 한개 일때
        lo_form1.basidtary.value = lo_form1.splychrgclamtyn.value.substring(0, 6);
        lo_form1.bocdary.value = lo_form1.splychrgclamtyn.value.substring(6, 11);
        if(lo_form1.splychrgclamtyn.checked){
            lo_form1.checkedary.value = "Y";
        }else{
            lo_form1.checkedary.value = "N";
        }
	}else{													// 체크박스가 여러 개일때
	    // 기준일자, 지국지사코드, 선택여부를 문자열 집합으로 만든다.
		var	ls_temp;
		var ls_basidtary = "";
		var ls_bocdary = "";
		var	ls_checkedary = "";
	    for(var i=0; i<lo_form1.splychrgclamtyn.length; i++) {
	
			ls_temp = lo_form1.splychrgclamtyn[i].value;
			ls_basidtary = ls_basidtary + ls_temp.substring(0, ls_temp.length-5) + "<%= paramGbn%>";
			ls_bocdary = ls_bocdary + ls_temp.substring(6, ls_temp.length) + "<%= paramGbn%>";
	
	        if(lo_form1.splychrgclamtyn[i].checked){
			    ls_checkedary = ls_checkedary + "Y" + "<%= paramGbn%>";
	        }else{
			    ls_checkedary = ls_checkedary + "N" + "<%= paramGbn%>";
	        }
	    }
		lo_form1.basidtary.value = ls_basidtary.substring(0, ls_basidtary.length-2);
		lo_form1.bocdary.value = ls_bocdary.substring(0, ls_bocdary.length-2);
		lo_form1.checkedary.value = ls_checkedary.substring(0, ls_checkedary.length-2);
    }
	// 지원담당 처리 구분
	lo_form1.accflag.value = 'S';
	// 영업담당 수금여부 체크박스를 전송가능하게 한다.
	lo_form1.busnchrgclamtyn.disabled=false;
    // 기준일자, 지국지사코드, 선택여부를 문자열 집합과 지원담당 처리구분 정보를 "/ss/extn/1794" 서블릿으로 보낸다.
    lo_form1.action = "/ss/extn/1794";
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

    var lo_form1 = document.cost_search_form;
		
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
    var lo_form1 = document.cost_search_form;

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
       </b>사이버확장 &gt; 비용 </td>
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
      <!--사이버확장 비용 검색 시작 ---------------------------------------------------------------------------->
      <table width="830" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC">
      <form name="cost_search_form" method="post" action="" >
        <input name="common_deptcd" type="hidden" value ="">                    <!-- 공통 부서코드 -->
        <input name="bocd" type="hidden" value ="">                    			<!-- 지국코드 -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
        <tr>
          <td class="title"  bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서</td>
          <td class="title"  width="80">
            <select name="deptcd" onChange="area_search();" class="sel_all">	<!-- 부서코드, 코드명 목록 -->
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
          <td class="title"  bgcolor="#EBE9DC" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국</td>
          <td class="title"  bgcolor="#EBE9DC" width="160">
            <input name="bonm" type="text" style="ime-mode:active;" size="8" class="text_box" onkeydown="bo_enter_search();">
            <input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"><!--지국검색팝업-->
            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
          </td>
          <td class="title"  width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">년월</td>
          <td class="title"  width="60">
            <input name="basidt" type="text" size="7" class="text_box" caption="년월" value="<%= Util.getYyyyMm()%>" dataType="month">
          </td>
			<!-- 입금 송금 구분 시작 -->
          <td class="title"  width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구분</td>
          <td class="title"  width="60">
            <select name="accflag" size="1"  class="sel_all">
              <option value="" selected>전체</option>
              <option value="1">입금</option>
              <option value="2">송금</option>
              <option value="3">제로</option>
            </select>
          </td>
			<!-- 입금 송금 구분 끝 -->
          <td class="title"  width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">완료</td>
          <td class="title"  width="60">
            <select name="splychrgclamtyn" size="1"class="sel_all">
              <option value="" selected>전체</option>
              <option value="Y">완납</option>
              <option value="N">미납</option>
            </select>
          </td>
          <td class="title"  align="right">
            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"></td><!--목록 조회-->
          </td>
        </tr>
	  </form>
      </table>
      <!--사이버확장 비용 검색 끝 ---------------------------------------------------------------------------->

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
          <td  height="27" bgcolor="#EBE9DC" class="title">사이버확장대회 비용목록</td>
          <td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="240">
			<input type="image" id="ckeck_all_chk_true_id" src="/html/comm_img/bu_all01.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(true)">
            <input type="image" id="ckeck_all_chk_false_id" src="/html/comm_img/bu_all02.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(false)">
            <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:cost_cancel()">
            <input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:cost_save()">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--여백-->
          </td>
        </tr>
      </table>

    <!--사이버확장 비용 목록 시작 ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
    <form name="cost_list_form" method="post" action="" >
        <input name="basidt" type="hidden" value ="">
        <input name="bocd" type="hidden" value ="">
        <input name="basidtary" type="hidden" value ="">
        <input name="bocdary" type="hidden" value ="">
        <input name="checkedary" type="hidden" value ="">
        <input name="accflag" type="hidden" value ="">
      <tr bgcolor="#dddddd" align="center">
        <td width="110" class="gray" align="center"> 년월 </td>
        <td width="110" class="gray" align="center"> 지역 </td>
        <td width="110" class="gray" align="center"> 지국 </td>
        <td width="100" class="gray" align="center"> 비용금액 </td>
        <td width="90" class="gray" align="center"> 담당수금 </td>
        <td width="90" class="gray" align="center"> 입금 </td>
        <td width="110" class="gray" align="center"> 입금일자 </td>
        <td width="110" class="gray" align="center"> 지국구분 </td>
      </tr>
      <tr>
        <td colspan="10" class="gray" align="center"> 검색조건을 입력하고 조회버튼을 누르세요. </td>
      </tr>
    </form>
    </table>
    <!--사이버확장 비용 목록 끝 ---------------------------------------------------------------------------->
	</td>
  </tr>
  <tr>
    <td height="10">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
	<td>
    <!--사이버확장 비용 상세 시작 ---------------------------------------------------------------------------->
    <table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
	</table>
    <!--사이버확장 비용 상세 끝 ---------------------------------------------------------------------------->
  </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
