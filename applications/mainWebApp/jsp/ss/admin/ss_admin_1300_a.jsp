<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1300_a.jsp
* 기능 : 관리자-마일리지-지급기준-초기화면
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_MIGLBASI_INITDataSet ds = (SS_L_MIGLBASI_INITDataSet)request.getAttribute("ds");
    int paybasiListCount = 10;	// 한 화면당 리스트 항목 수
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
	document.paybasi_search_form.cmpycd.focus();
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 회사별 매체 검색
function medi_search(flag){
    if(flag == '1'){        // 검색 폼 매체 검색
	    var lo_form1 = document.paybasi_search_form;

        if(lo_form1.cmpycd.value == '') {
            var str = "<select id=medicd_id name=\"medicd\" class=\"sel_all\">" +
                          "<option value='' selected>전체</option>" +
                      "</select>"
            document.all.medicd_id.outerHTML = str;
            return;
        }

        // 회사코드값을 "/ss/common/1160" 서블릿으로 보낸다
        lo_form1.action = "/ss/common/1160";
        lo_form1.target = "ifrm";
        lo_form1.submit();
    }else if(flag == '2'){  // 상세 폼 매체 검색
	    var lo_form1 = document.paybasi_detail_form;
        if(lo_form1.cmpycd.value == '') {
            var str = "<select id=detail_medicd_id name=\"medicd_sel\" class=\"sel_all\" onChange=\"medicd_changed();\">" +
                          "<option value='' selected>선택</option>" +
                      "</select>"
            document.all.detail_medicd_id.outerHTML = str;
            return;
        }

        // 회사코드값을 "/ss/common/1161" 서블릿으로 보낸다
        lo_form1.action = "/ss/common/1161";
        lo_form1.target = "ifrm";
        lo_form1.submit();
   }
}

// 지급구분별 지급기준 검색
function paybasi_search(flag){
    if(flag == '1'){        // 검색 폼 지급기준 검색
	    var lo_form1 = document.paybasi_search_form;

        if(lo_form1.payclsfcd.value == '') {
            var str = "<select id=paybasi_id name=\"paybasi\" class=\"sel_all\">" +
                          "<option value='' selected>전체</option>" +
                      "</select>"
            document.all.paybasi_id.outerHTML = str;
            return;
        }

        // 지급구분코드값을 "/ss/common/1162" 서블릿으로 보낸다
        lo_form1.action = "/ss/common/1162";
        lo_form1.target = "ifrm";
        lo_form1.submit();
    }else if(flag == '2'){  // 상세 폼 지급기준 검색
	    var lo_form1 = document.paybasi_detail_form;
        if(lo_form1.payclsfcd.value == '') {
            var str = "<select id=detail_paybasi_id name=\"paybasicd_sel\" class=\"sel_all\" onChange=\"paybasicd_changed();\">" +
                          "<option value='' selected>선택</option>" +
                      "</select>"
            document.all.detail_paybasi_id.outerHTML = str;
            return;
        }

        // 회사코드값을 "/ss/common/1163" 서블릿으로 보낸다
        lo_form1.action = "/ss/common/1163";
        lo_form1.target = "ifrm";
        lo_form1.submit();
   }
}

// 목록보기
function list_search()
{
    var lo_form1 = document.paybasi_search_form;

    // 화면페이지 번호를 초기화한다.
    lo_form1.pageno.value = '1';
    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	// 목록 검색 조건을 "/ss/admin/1305" 서블릿으로 보낸다.
    lo_form1.action = "/ss/admin/1305";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세보기
function detail_view(cmpycd, medicd, payclsfcd, paybasicd){
    var lo_form1 = document.paybasi_list_form;
    // 회사코드,매체코드,지급구분코드,지급기준코드를  "/ss/admin/1310" 서블릿으로 보낸다
    lo_form1.cmpycd.value = cmpycd;
    lo_form1.medicd.value = medicd;
    lo_form1.payclsfcd.value = payclsfcd;
    lo_form1.paybasicd.value = paybasicd;
    lo_form1.action = "/ss/admin/1310";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 추가
function add()
{
    var lo_form1 = document.paybasi_detail_form;	        		// 상세정보 폼

	// 화면 정리
    var c_form2_elements = lo_form1.elements;
    for( var i =0; i< c_form2_elements.length; i++){
     	c_form2_elements(i).value = "";
    }
	// 체크박스
	lo_form1.rdrgradsumyn.checked = false;
	lo_form1.vdtyyn.checked = false;

	// select 
	document.all.cmpycd_td_id.innerHTML = 		'<select name="cmpycd_sel" class="sel_all" onChange="cmpycd_changed();medi_search(\'2\')">' +
												'<option value="" selected>선택</option>' +
												'<%= ds.curcmpycdOptHtml("") %>' +
												'</select>';
	document.all.medicd_td_id.innerHTML = 		'<select name="medicd_sel" class="sel_all" id="detail_medicd_id" onChange="medicd_changed();">' +
												'<option value="" selected>선택</option>' +
												'</select>';
	document.all.payclsfcd_td_id.innerHTML 	=	'<select name="payclsfcd_sel" class="sel_all" onChange="payclsfcd_changed();paybasi_search(\'2\')" id="detail_payclsfcd_id">' +
												'<option value="" selected>선택</option>' +
												'<%= ds.curpayclsfcdOptHtml("") %>' +
												'</select>';
	document.all.paybasicd_td_id.innerHTML 	= 	'<select name="paybasicd_sel" class="sel_all" id="detail_paybasicd_id" onChange="paybasicd_changed();">' +
												'<option value="" selected>선택</option>' +
												'</select>';

	//첫번째 산정구분 라디오 선택
	if(lo_form1.pontcalcclsfcd_sel == null){			// 없음
		//처리하지 않음.
	}else if(lo_form1.pontcalcclsfcd_sel == "radio"){	// 한개의 라디오
		lo_form1.pontcalcclsfcd_sel.checked = true;
	}else{												// 여러개의 라디오
		lo_form1.pontcalcclsfcd_sel[0].checked = true;
	}
	// 산정구분 설정
	for(i=0; i<lo_form1.pontcalcclsfcd_sel.length; i++){
		if(lo_form1.pontcalcclsfcd_sel[i].checked){
			pontcalcclsfcd_changed(i);
		}		
	}
	
	document.all.cancel_id.disabled=true;							// 취소버튼 비활성화
	setInputBackgroundColor();										// readOnly 배경색 활성화

    lo_form1.accflag.value = 'I';									// 작업구분을 입력으로 설정
}

// 저장
function save(){
   	var lo_form1 = document.paybasi_detail_form						// 상세정보 폼

	// 회사코드 체크
    if(lo_form1.cmpycd.value == ''){
        alert("회사코드를 선택하세요.");
        return;
    }
	// 매체코드 체크
    if(lo_form1.medicd.value == ''){
        alert("매체코드를 선택하세요.");
        return;
    }
	// 지급구분코드 체크
    if(lo_form1.payclsfcd.value == ''){
        alert("지급구분코드를 선택하세요.");
        return;
    }
	// 지급기준코드 체크
    if(lo_form1.paybasicd.value == ''){
        alert(" 지급기준코드를 선택하세요.");
        return;
    }


	//산정구분코드 체크
    if(lo_form1.pont.value == '' && lo_form1.pontrate.value == ''){
        alert(" 산정구분에 따른 포인트 혹은 포인트요율을 입력하세요.");
        return;
    }

	if(lo_form1.accflag.value == 'D'){								// 삭제시 예외발생하면 'U'로 변경한다.
		lo_form1.accflag.value = 'U';
	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크


	// 독자등급합산여부, 유효여부
	if(lo_form1.rdrgradsumyn.checked){
		lo_form1.rdrgradsumyn.value = 'Y';
	}else{
		lo_form1.rdrgradsumyn.value = 'N';
	}
	
	if(lo_form1.vdtyyn.checked){
		lo_form1.vdtyyn.value = 'Y';
	}else{
		lo_form1.vdtyyn.value = 'N';
	}

    if(lo_form1.accflag.value == 'I') {	        					// 신규입력일 때
        lo_form1.action = "/ss/admin/1315";
    } else if(lo_form1.accflag.value == 'U') {						// 수정저장일 때
        lo_form1.action = "/ss/admin/1320";
    } else {
      return;
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 삭제
function del(){
    var lo_form1 = document.paybasi_detail_form;					// 상세정보 폼

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
	// 해당항목의 존재여부를 확인한다.
    if(lo_form1.cmpycd.value == '' || lo_form1.medicd.value == '' || lo_form1.payclsfcd.value == '' || lo_form1.paybasicd.value == '') {
        alert("해당목록을 클릭 후 삭제하세요.");
        return;
    }

	var yesno = confirm("삭제하시겠습니까?");
	if(yesno){
	    lo_form1.accflag.value = 'D';									// 작업구분을 삭제('D')로 세팅
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/admin/1325";
	    lo_form1.submit();
	}	    
}

// 취소
function cancel(){

	var lo_form1 = document.paybasi_detail_form;
	lo_form1.reset();                                               // 폼 재설정

	//산정구분코드 설정
	for(i=0; i<lo_form1.pontcalcclsfcd_sel.length; i++){
		if(lo_form1.pontcalcclsfcd_sel[i].checked){
			pontcalcclsfcd_changed(i);
		}		
	}

	setEventHandler();												// 폼 재설정 후 이벤트핸들러 호출
    setEnterKeyEventHandler();                                      // 폼 재설정 후 이벤트핸들러 호출
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.paybasi_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 목록 조회조건을 "/ss/admin/1305" 서블릿으로 보낸다
    lo_form1.action = "/ss/admin/1305";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 상세폼 회사코드 select 변경
function cmpycd_changed(){
	var lo_form1 = document.paybasi_detail_form;
	
	lo_form1.cmpycd.value = lo_form1.cmpycd_sel.value;
}

// 상세폼 매체코드 select 변경
function medicd_changed(){
	var lo_form1 = document.paybasi_detail_form;
	
	lo_form1.medicd.value = lo_form1.medicd_sel.value;
}

// 상세폼 구분코드 select 변경
function payclsfcd_changed(){
	var lo_form1 = document.paybasi_detail_form;
	
	lo_form1.payclsfcd.value = lo_form1.payclsfcd_sel.value;
}

// 상세폼 기준코드 select 변경
function paybasicd_changed(){
	var lo_form1 = document.paybasi_detail_form;
	
	lo_form1.paybasicd.value = lo_form1.paybasicd_sel.value;
}

// 요율산정기준 radio 변경
function pontcalcclsfcd_changed(sel_idx){
	var lo_form1 = document.paybasi_detail_form;

	if(sel_idx == '0'){
		lo_form1.pont.readOnly = false;
		lo_form1.pontrate.value = "";
		lo_form1.pontrate.readOnly = true;
	}else if(sel_idx == '1'){
		lo_form1.pontrate.readOnly = false;
		lo_form1.pont.value = "";
		lo_form1.pont.readOnly = true;
	}
	
	//산정구분코드 설정
	for(i=0; i<lo_form1.pontcalcclsfcd_sel.length; i++){
		if(lo_form1.pontcalcclsfcd_sel[i].checked){
			lo_form1.pontcalcclsfcd.value = lo_form1.pontcalcclsfcd_sel[i].value;
		}		
	}
	setInputBackgroundColor();
	
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

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" class="title1" onload="jsInit();pontcalcclsfcd_changed('0');">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777"  class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >관리자
      &gt; </b> 마일리지 > 지급기준</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top">

	<!--지급기준 검색 시작 ---------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="2">
    <form name="paybasi_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">
        <input name="pagesize" type="hidden" value ="<%= paybasiListCount %>">
        <input name="js_fn_nm" type="hidden" value ="page_move">

		<tr>
			<td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">회사</td>
			<td bgcolor="#EBE9DC" class="title" width="150">
				<select name="cmpycd" class="sel_all" onChange="javascript:medi_search('1')">	<!--검색폼의 매체검색-->
					<option value="" selected>전체</option>
					<%= ds.curcmpycdOptHtml("") %>
				</select>
			</td>
			<td bgcolor="#EBE9DC" class="title" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">매체</td>
			<td bgcolor="#EBE9DC" class="title" width="150">
				<select name="medicd" class="sel_all" id="medicd_id">
					<option value="" selected>전체</option>
				</select>
			</td>
			<td bgcolor="#EBE9DC" class="title" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">구분<strong></strong></td>
			<td bgcolor="#EBE9DC" class="title" width="150">
				<select name="payclsfcd" class="sel_all" onChange="javascript:paybasi_search('1')">	<!--검색폼의 지급기준검색-->
					<option value="" selected>전체</option>
					<%= ds.curpayclsfcdOptHtml("") %>
				</select>
			</td>
			<td bgcolor="#EBE9DC" class="title" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기준</td>
			<td bgcolor="#EBE9DC" class="title" width="150">
				<select name="paybasicd" class="sel_all" id="paybasicd_id">
					<option value="" selected>전체</option>
				</select>
			</td>
			<td bgcolor="#EBE9DC" class="title" align="right">
	            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="8">
				<!--여백-->
			</td>
		</tr>
	</form>
	</table>
	<!--지급기준 검색 끝 ---------------------------------------------------------------------------->


    <!-- 지급기준 목록 시작 --------------------------------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="paybasi_list_id">
    <form name="paybasi_list_form" method="post" action="">
        <input name="cmpycd" type="hidden" value ="">			<!--회사코드-->
        <input name="medicd" type="hidden" value ="">           <!--매체코드-->
        <input name="payclsfcd" type="hidden" value ="">        <!--지급구분-->
        <input name="paybasicd" type="hidden" value ="">        <!--지급기준-->
		<tr align="center" bgcolor="#dddddd" height="23">
			<td class="gray">회사</td>
			<td width="110" class="gray">매체</td>
			<td width="110" class="gray">구분</td>
			<td width="130" class="gray">지급기준</td>
			<td width="60" class="gray">포인트</td>
			<td width="60" class="gray">요율</td>
			<td width="60" class="gray">본사비율</td>
			<td width="60" class="gray">지국비율</td>
			<td width="60" class="gray">정산환율</td>
		</tr>
        <%-- 초기화면 목록 반복 시작 --%>
        <%for(int i=0; i<paybasiListCount; i++){%>
		<tr>
			<td class="gray" align="center"> &nbsp; </td>
			<td class="gray" width="110" align="center"> &nbsp; </td>
			<td class="gray" width="110" align="center"> &nbsp; </td>
			<td class="gray" width="130" align="center"> &nbsp; </td>
			<td class="gray" width="60" align="right"> &nbsp; </td>
			<td class="gray" width="60" align="right"> &nbsp; </td>
			<td class="gray" width="60" align="right"> &nbsp; </td>
			<td class="gray" width="60" align="right"> &nbsp; </td>
			<td class="gray" width="60" align="right"> &nbsp; </td>
		</tr>
        <%}%>
        <%-- 초기화면 목록 반복 끝 --%>

		<tr align="right">
			<td  colspan="9" bgcolor="#dddddd" class="gray" height="23">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
			</td>
		</tr>
	</form>
	</table>
    <!-- 페이지 이동 -->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="title2" id="page_move">
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
                    <jsp:param name = "pagesize" 	value="<%= paybasiListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- 페이지 이동 -->
    <!-- 지급기준 목록 끝 --------------------------------------------------------------------------------------------------->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!--여백-->
    </td>
  </tr>
  <tr>
    <td>

	<!--상세 -->
	<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr>
		  <td  height="27" bgcolor="#EBE9DC" class="title">지급항목 상세내역</td>
		  <td bgcolor="#EBE9DC" class="title" width="120" align="right">(<font color="red">*
		    </font>필수항목)</td>
		</tr>
		<tr>
		  <td height="3" colspan="2">
		    <!--여백-->
		  </td>
		</tr>
	</table>

	<!-- 지급기준 상세 시작 --------------------------------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="paybasi_detail_id">
    <form name="paybasi_detail_form" method="post" action="">
        <input type="hidden" name="accflag" value="I">          <!--입력(I),수정(U),삭제(D) 구분필드 초기값(I)-->
	    <input name="cmpycd" type="hidden" value ="">			<!--회사코드-->
	    <input name="medicd" type="hidden" value ="">           <!--매체코드-->
	    <input name="payclsfcd" type="hidden" value ="">        <!--지급구분-->
	    <input name="paybasicd" type="hidden" value ="">        <!--지급기준-->
	    <input name="pontcalcclsfcd" type="hidden" value ="">   <!--산정구분-->

		<tr>
			<td bgcolor="#dddddd" class="gray"> 회사<font color="red">*</font></td>
			<td colspan="3" class="gray" width="200"  id="cmpycd_td_id">
				<select name="cmpycd_sel" class="sel_all" onChange="cmpycd_changed();medi_search('2')">	<!--상세폼의 매체검색-->
					<option value="" selected>선택</option>
					<%= ds.curcmpycdOptHtml("") %>
				</select>
			</td>			
			<td width="150" bgcolor="#dddddd" class="gray"> 산정구분<font color="red">*</font></td>
			<td width="150" bgcolor="#dddddd" class="gray"> 포인트</td>
			<td class="gray" width="130">
				<input name="pont" type="text" size="8"  class="text_box" dataType="integer" comma >
			</td>			
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> 매체<font color="red">*</font></td>
			<td colspan="3" class="gray"  width="200" id="medicd_td_id">
				<select name="medicd_sel" class="sel_all" id="detail_medicd_id" onChange="medicd_changed();">
					<option value="" selected>선택</option>
				</select>
			</td>
			<td width="150" bgcolor="#dddddd" class="gray"> 
<%--요율산정구분코드 라디오버튼 출력--%>			
<%for(int i=0; i<ds.curpontcalcclsfcd.size(); i++){
		String checked = "";
		SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord curpontcalcclsfcdRec = (SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord)ds.curpontcalcclsfcd.get(i);
		if(i == 0){ checked = "checked";}else{ checked = ""; }
%>
		<input type="radio" name="pontcalcclsfcd_sel" value="<%= curpontcalcclsfcdRec.cicodeval%>" onclick="pontcalcclsfcd_changed('<%= i%>');" <%=checked%>><%= curpontcalcclsfcdRec.cicdnm%></input>
<%}%>
			</td>
			<td bgcolor="#dddddd" class="gray"> 포인트요율</td>
			<td class="gray" width="130">
				<input name="pontrate" type="text" size="8"  class="text_box" >
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> 지급구분코드<font color="red">*</font></td>
			<td colspan="3" class="gray" width="200" id="payclsfcd_td_id">
				<select name="payclsfcd_sel" class="sel_all" onChange="payclsfcd_changed();paybasi_search('2')" id="detail_payclsfcd_id">	<!--상세폼의 지급기준검색-->
					<option value="" selected>선택</option>
					<%= ds.curpayclsfcdOptHtml("") %>
				</select>
			</td>
			<td width="150" rowspan="2" bgcolor="#dddddd" class="gray"> 분담비율 </td>
			<td width="150" bgcolor="#dddddd" class="gray"> 본사<font color="red">*</font></td>
			<td class="gray" width="130">
				<input name="hdqtallmratio" type="text" size="8"  class="text_box" caption="본사분담비율" notEmpty>
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> 지급기준코드<font color="red">*</font></td>
			<td colspan="3" class="gray" width="200" id="paybasicd_td_id">
				<select name="paybasicd_sel" class="sel_all" id="detail_paybasicd_id" onChange="paybasicd_changed();">
					<option value="" selected>선택</option>
				</select>
			</td>
			<td bgcolor="#dddddd" class="gray" width="95"> 지국지사<font color="red">*</font></td>
			<td class="gray" width="130">
				<input name="boallmratio" type="text" size="8"  class="text_box"  caption="지국지사분담비율" notEmpty>
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> 독자등급합산여부</td>
			<td class="gray" width="50">
				<input name="rdrgradsumyn" value="" type="checkbox" size="8"  class="text_box">
			</td>
			<td bgcolor="#dddddd" class="gray" width="150"> 유효여부</td>
			<td class="gray" width="50">
				<input name="vdtyyn" value="" type="checkbox" size="8"  class="text_box">
			</td>
			<td colspan="2" bgcolor="#dddddd" class="gray">정산환율<font color="red">*</font></td>
			<td class="gray" width="130">
				<input name="adjmexchrate" type="text" size="8"  class="text_box"  caption="정산환율" notEmpty>
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> 설명 </td>
			<td colspan="6" class="gray">
				<textarea name="descri" cols="96" rows="3" class="scroll1"></textarea>
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> 지급시점설명 </td>
			<td colspan="6" class="gray">
				<textarea name="paypointdescri" cols="96" rows="3" class="scroll1"></textarea>
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> 비고 </td>
			<td colspan="6" class="gray">
				<textarea name="remk" cols="96" rows="3" class="scroll1"></textarea>
			</td>
		</tr>
	</form>
	</table>
	<!-- 지급기준 상세 끝 --------------------------------------------------------------------------------------------------->

    <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
        <tr>
            <td align="center" height="2">
            <!--여백-->
            </td>
        </tr>
        <tr>
            <td align="center" height="24" bgcolor="#E8E8E8">
                <input type="image" id="add_id" src="/html/comm_img/bu_new.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:add();">
                <input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:save();">
                <input type="image" id="del_id" src="/html/comm_img/bu_del.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:del();">
                <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" onclick="javascript:cancel();">
            </td>
        </tr>
    </table>

    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>