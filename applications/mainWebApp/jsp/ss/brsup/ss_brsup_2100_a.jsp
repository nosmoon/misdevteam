<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brsup_2100_a.jsp
* 기능 	 	 : 지국지원-컴퓨터AS
* 작성일자 	 : 2004-03-15
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%--
상세화면에서 지국검색을 하면 해당지국의 등록된 컴퓨터 목록을 가져온다.
--%>
<%
    //	dataset 인스턴스 선언부분
    SS_L_ASREQDataSet ds = (SS_L_ASREQDataSet)request.getAttribute("ds");  // request dataset
    int moveListCount = 5;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
%>
<html>
<head>
<script language="javascript">
<!--
	
//페이지초기화시 버튼설정및 EventHandler호출
function jsInit(){			
		
	setEventHandler();		
	setEnterKeyEventHandler();	
	setInputBackgroundColor();	
	document.as_search_form.bonm.focus();
}
		
// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 컴퓨터AS접수 리스트 조회(엔터키)
function list_search_enter(){
    if(event.keyCode == 13) list_search();
} 

// 컴퓨터AS접수 리스트 조회
function list_search(){	
    var lo_form = document.as_search_form;

    if(lo_form.pageno.value == '') {
        lo_form.pageno.value = 1;
    }

    if(!check_all(lo_form)) return;								// 폼 유효성 체크
	lo_form.pageno.value = '1';									// 페이지번호 초기화

    lo_form.method = "post";
    lo_form.action = "/ss/brsup/2110";
    lo_form.target = "ifrm";
    lo_form.submit();
} 

// 컴퓨터AS접수 상세보기
function bocomp_view(bocd,invsgdt,invsgno,eqpno){	
	var lo_form = document.comp_detail_form;
	lo_form.flag.value = 'A';
	lo_form.bocd.value = bocd;
	lo_form.regdt.value = invsgdt;
	lo_form.regno.value = invsgno;
	lo_form.eqpno.value = eqpno;
	
	check_all(lo_form);
	lo_form.action = "/ss/brsup/2120";
	lo_form.target = "ifrm";
	lo_form.submit();
		
	document.all("cancel_btn").disabled = false;
	document.all("bo_btn").disabled = true;
	lo_form.bonm.readOnly = true;
    lo_form.accflag.value = 'U';
}


// 선택한 장비 상세보기
function bocomp_search(){	
	var lo_form = document.comp_detail_form;
	
	//선택된 컴퓨터 항목 체크
	if(! lo_form.computernm.value == ''){
		lo_form.flag.value = 'C';
		lo_form.eqpno.value = lo_form.computernm.value;
		
		check_all(lo_form);
		lo_form.action = "/ss/brsup/2120";
		lo_form.target = "ifrm";
	    lo_form.submit(); 
	    
		document.all("cancel_btn").disabled = false;
	}
}

// 컴퓨터AS접수 수정란 clear
function bocomp_cancel(){
	var lo_form = document.comp_detail_form;	// 상세정보 폼
	
	if(lo_form.flag.value == 'A'){
		check_all(lo_form);
		lo_form.action = "/ss/brsup/2120";
		lo_form.target = "ifrm";
		lo_form.submit();
			
		document.all("cancel_btn").disabled = false;
		document.all("bo_btn").disabled = true;
		lo_form.bonm.readOnly = true;
    	lo_form.accflag.value = 'U';
	
	} else if(lo_form.flag.value == 'C') {
		lo_form.eqpno.value = lo_form.computernm.value;
		
		check_all(lo_form);
		lo_form.action = "/ss/brsup/2120";
		lo_form.target = "ifrm";
	    lo_form.submit(); 
	    
		document.all("cancel_btn").disabled = false;
	
	} else {
		lo_form.reset();	
		return;
	}

}

// 컴퓨터AS접수 추가
function bocomp_append(){

	var lo_form = document.comp_detail_form;	// 상세정보 폼
	for( var i =0; i< lo_form.length; i++){
		if(lo_form(i).name == "as_stat"){
			lo_form(i).outerHTML =  '<select name="as_stat" class="sel_all" tabIndex="4" onkeydown="list_search_enter();">'+
									'<%=ds.curasstatOptHtml("")%>'+
									'</select>';
		}else{						
			lo_form(i).value = "";
		}			
	}

	lo_form.bonm.readOnly = false;		
    document.all.modlcd.innerText = '';
    document.all.kndcd.innerText = '';
    document.all.makecmpy.innerText = '';
    document.all.os.innerText = '';
    document.all.memolicapa.innerText = '';
    document.all.hddcapa.innerText = '';
    document.all.monitormakecmpy.innerText = '';
    document.all.monitormodl.innerText = '';
    document.all.monitorsize.innerText = '';
    document.all.printerkind.innerText = '';
    document.all.printermakecmpy.innerText = '';
    document.all.printermodl.innerText = '';

	document.all.computer_id.outerHTML = '<select id="computer_id" name="computernm" class="sel_all" onChange="bocomp_search();">'
										+'<option value="">지국을 선택하세요.</option>'
										+'</select>';

	lo_form.computernm.focus();
	
	document.all("cancel_btn").disabled = true;
	document.all("bo_btn").disabled = false;
	lo_form.bonm.readOnly = false;
	setInputBackgroundColor();	
	
	lo_form.accflag.value = 'I';
	
}

// 컴퓨터AS접수 수정
function bocomp_edit(){
	var lo_form = document.comp_detail_form;

	//필수항목 채웠나체크
	if(lo_form.computernm.value == '' || lo_form.req_rmk.value == '' ) {
		alert("필수항목(*)을 입력해주세요.");
		return;
	}
	
	if(lo_form.accflag.value == 'D'){								// 삭제시 예외발생하면 'U'로 변경한다.
		lo_form.accflag.value = 'U';
	}
	
    if(lo_form.accflag.value != 'I') {	   
    	lo_form.accflag.value = 'U';
    }
    
	check_all(lo_form);
	
	lo_form.action = "/ss/brsup/2130";
	lo_form.target = "ifrm";
	lo_form.method = "post";
	lo_form.submit();
}

// 컴퓨터AS접수 삭제
function bocomp_del(){
	var lo_form = document.comp_detail_form;

	if(lo_form.eqpno.value == '' || lo_form.computernm.value == '' ) {	// 코드값을 체크하는 구문이 들어간다. 보완해야 함.
		alert("삭제할 AS목록을 선택후 삭제해주세요.");
		return;
	}

	var yesno = confirm("삭제하시겠습니까?");
	if(yesno){
	    if(!check_all(lo_form1)) return;								// 폼 유효성 체크
		lo_form.accflag.value = 'D';
		lo_form.action = "/ss/brsup/2130";
		lo_form.target = "ifrm";
		lo_form.method = "post";
	    lo_form.submit();
	}
}

	
// 지역 검색
function area_search(){

	lo_form1 = document.as_search_form;
	
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
function bo_search(no){

	// 검색폼
	if(no == '1'){
		var lo_form1 = document.as_search_form;
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
	// 상세폼	
	}else if(no == '2'){
		var lo_form1 = document.comp_detail_form;
	    var	deptcd = "";
	    var areacd = "";			
	    var bonm   = lo_form1.bonm.value;
	
		var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");			
	    var la_str;
	
	    if(ls_return.indexOf("\n") != -1){
	        la_str = ls_return.split("\n");
	        lo_form1.bocd.value = la_str[0];
	        lo_form1.bonm.value = la_str[1];
	        
		    // 지국 검색이 완료되면 컴퓨터기종정보를 가져온다.
		    compu_info();
	    }	    
	}			
}


// 검색/상세 폼 구분을 위한 전역변수
var gs_no;

// 엔터키에 의한 지국찾기
function bo_enter_search(no){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

	//검색/상세 폼 구분을 위한 전역변수 서정
	gs_no = no;
	
	//검색폼
	if(no == '1'){
    	var lo_form1 = document.as_search_form;
    	
	    //지국명이 존재하지 않으면 지국검색팝업을 띄운다.
		if(lo_form1.bonm.value == ''){
			bo_search('1');
			return; 
		}
		
	    // 부서코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	//상세폼
    }else if(no == '2'){
    	var lo_form1 = document.comp_detail_form;

	    //지국명이 존재하지 않으면 지국검색팝업을 띄운다.
		if(lo_form1.bonm.value == ''){
			bo_search('2');
			return; 
		}
		
	    // 지국명을  "/ss/common/1113" 서블릿으로 보낸다
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
    }
}
    

// 엔터기에 의한 지국찾기 결과처리
function bo_enter_search_result(no){
	// 검색결과가 한건이므로 검색창에 결과값을 설정한다.
	if(no == '1'){
	
		//검색폼
		if(gs_no == '1'){
			var lo_form1 = ifrm.document.bo_detail_form;
			var lo_form2 = document.as_search_form;
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
		//상세폼
		}else if(gs_no == '2'){
			var lo_form1 = ifrm.document.bo_detail_form;
			var lo_form2 = document.comp_detail_form;
			
			lo_form2.bocd.value = lo_form1.bocd.value;
			lo_form2.bonm.value = lo_form1.bonm.value;	
			
	    	// 컴퓨터기종정보를 가져온다.
			compu_info();
		}		
		
	// 검색결과가 없거나 여러건이므로 지국찾기 팝업을 띄운다.
	}else if(no == '2'){
		bo_search(gs_no);
	}
}

// 상세폼의 컴퓨터기종정보를 가져온다.
function compu_info(){
	var lo_form1 = document.comp_detail_form;
	lo_form1.action = "/ss/brsup/2140";
	lo_form1.target = "ifrm";
	lo_form1.method = "post";
	check_all(lo_form1);	    
	lo_form1.submit();
}

// 페이지 이동
function page_move(pageno) {
    var lo_form1 = document.move_search_form;

    // 화면 페이지번호를 설정한다.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 이사독자 신청목록 조회조건을 "/ss/brsup/2110" 서블릿으로 보낸다
    lo_form1.action = "/ss/brsup/2110";
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

    var lo_form1 = document.as_search_form;			// 검색 폼
    var lo_form2 = document.comp_detail_form;		// 상세 폼
		
	if(flag == '1'){			// 검색 부서,지역,지국 초기화
		// 부서 초기화
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search(\'S\');" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									+'</select>';
		// 지역 초기화								
		lo_form1.areacd.outerHTML =  '<select name="areacd" id="areacd_id" class="sel_all">'
									+'<% writeAreaOpt(session, out, true); %>'
									+'</select>';
		// 지국코드,지국명 초기화, 포커스이동
		lo_form1.bocd.value = "";
		lo_form1.bonm.value = "";
		lo_form1.bonm.focus();
	}else if(flag == '2'){		// 상세 지국 초기화
		// 지국코드,지국명 초기화, 포커스이동
		lo_form2.bocd.value = "";
		lo_form2.bonm.value = "";
		lo_form2.bonm.focus();
		
		// 컴퓨터 목록 초기화
		document.all.computer_id.outerHTML = '<select id="computer_id" name="computernm" class="sel_all" onChange="bocomp_search();">'
											+'<option value="">지국을 선택하세요.</option>'
											+'</select>';
		
	}else if(flag == '4'){		// 기간 초기화
	}else if(flag == '5'){		// 기타 초기화
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
    var lo_form1 = document.as_search_form;

	if(lo_form1.bonm.value == ''){
		lo_form1.bocd.value = '';
		list_search();
	}else{
		gs_no = '1';
		
	    // 부서코드,지역코드,지국명을  "/ss/common/1113" 서블릿으로 보낸다
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}	    
}

-->
</script>
<title>통신실</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle"> 지국지원 
      &gt; </b>컴퓨터 A/S 접수</td>
  </tr>
  <tr> 
    <td height="10"> 
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>

<!-- 컴퓨터 A/S 접수 검색 시작-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="as_search_form" method="post" action="" >
    <input name="pageno" type="hidden" value ="1">			                <!-- 현재 페이지 번호 -->
    <input name="pagesize" type="hidden" value ="<%= moveListCount%>">	    <!-- 한 화면당 리스트 항목 수 -->
    <input name="js_fn_nm" type="hidden" value ="page_move">
    <input name="common_deptcd" type="hidden" value ="">                    <!-- 공통 부서코드 -->
    <input name="bocd" type="hidden" value ="">                         	<!-- 지국지사코드 -->
    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
  
	<tr>
		<td bgcolor="#EBE9DC" class="sea_top" colspan="3">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">부서
			&nbsp;
            <select name="deptcd" onChange="area_search('S');" class="sel_all"><!-- 부서코드, 코드명 목록 -->
	<%						 
				writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
	%>					
            </select>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지역
			&nbsp;
            <select name="areacd" id="areacd_id" class="sel_all">  <!--지역코드, 지역명 목록-->
	<%
				writeAreaOpt(session, out, true);
	%>                    
            </select>
			&nbsp;&nbsp;&nbsp;
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" colspan="2">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">지국
			&nbsp;
			<input name="bonm" type="text" style="ime-mode:active;" size="12" class="text_box" value=""  onkeydown="bo_enter_search('1');">
			&nbsp;
			<input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" onclick="javascript:bo_search('1');window.event.returnValue=false;"> <!--지국검색팝업-->
			<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
			&nbsp;&nbsp;&nbsp;&nbsp;
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" rowspan="2" align="right">
			<input type="image" onclick="set_request('L');bo_list_search();window.event.returnValue=false;" src="/html/comm_img/bu_search01.gif" width="39" height="35">
		</td>
  </tr>
  <tr> 
    <td bgcolor="#EBE9DC" width="43">
    	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간</td>
    <td bgcolor="#EBE9DC"  width="80">
      <select name="dt_kind" class="sel_all" tabIndex="1">
        <option value="" selected>전체</option>
        <option value="R">신청</option>
        <option value="A">접수</option>
        <option value="N">완료</option>
      </select>
    </td>
    <td bgcolor="#EBE9DC" width="200">
      <input name="search_dt1" type="text" size="10" tabIndex="2" class="text_box" value="<%=Util.getYear()+"0101"%>" dataType=date caption="기간(검색)">
      - 
      <input name="search_dt2" type="text" size="10" tabIndex="3" class="text_box" value="<%=Util.getDate()%>" dataType=date caption="기간(검색)">
    </td>
    <td bgcolor="#EBE9DC" width="150"><img src="/html/comm_img/ic_title.gif" width="12" height="7">처리상태&nbsp;
      <select name="as_stat" class="sel_all" tabIndex="4" onkeydown="list_search_enter();">
        <option value="">전체</option>
        <%=ds.curasstatOptHtml("")%>
      </select> 
    </td>
    <td bgcolor="#EBE9DC" > 
      &nbsp;
    </td>
  </tr>
  <tr> 
    <td height="4" colspan="4"> 
      <!--여백-->
    </td>
  </tr>
</form>
</table>
<!-- 컴퓨터 A/S 접수 검색 끝-->

<!-- 컴퓨터 A/S 접수 목록 시작-->
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr> 
    <td>
     
	<table id="as_list_id" width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" >
		<tr bgcolor="#DDDDDD" height="23"> 
			<td width="50" class="gray"align="center">순번</td>
			<td class="gray" align="center"> A/S 요청내용</td>
			<td width="70" class="gray" align="center">상태</td>
			<td width="70" class="gray" align="center">신청일자</td>
			<td width="70" class="gray" align="center">접수일자</td>
			<td width="70" class="gray" align="center">완료일자</td>
		</tr>
        <%-- 초기화면 목록 반복 시작 --%>
		<%for(int i=0; i < moveListCount; i++) {%>
		<tr> 
			<td width="50" class="gray"align="center">&nbsp;</td>
			<td class="gray" align="center">&nbsp;</td>
			<td width="70" class="gray" align="center">&nbsp;</td>
			<td width="70" class="gray" align="center">&nbsp;</td>
			<td width="70" class="gray" align="center">&nbsp;</td>
			<td width="70" class="gray" align="center">&nbsp;</td>
		</tr>
		<%}%>
		<tr  bgcolor="#dddddd" align="right" > 
			<td  colspan="6" class="gray" height="23">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
			</td>
		</tr>
		
	</table>
	<!--버튼-->
	<table id="as_list_nav_id" width="830" border="0" cellspacing="0" align="center" cellpadding="0" class="title2">
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
<!-- 컴퓨터 A/S 접수 목록 끝-->
      
    </td>
  </tr>
  <tr>
    <td height="10"> 
      <!--여백 -->
    </td>
  </tr>
  <tr> 
    <td> 
    
<!-- 컴퓨터 A/S 접수 상세 시작-->
    
      <table width="830" border="0" cellspacing="0" cellpadding="2">
        <tr> 
          <td bgcolor="#EBE9DC" class="title" width="747">상세내역</td>
          <td bgcolor="#EBE9DC" class="title" align="right" width="75"><font color="red">*</font> 
            필수항목</td>
        </tr>
        <tr> 
          <td height="2" colspan="2"> 
            <!--여백-->
          </td>
        </tr>
      </table>
      <table width="830" border="0"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff">
      <form name="comp_detail_form" method="post" action="" > 
        <input name="accflag" type="hidden"  value="">
		<input name="flag" type="hidden"  value="">  <!--검색에서의 호출인지 상세에서의 호출인지여부-->
		<input name="regdt" type="hidden"  value="">  
		<input name="regno" type="hidden"  value="">  
		<input name="eqpno" type="hidden"  value="">  
	    <input name="common_deptcd" type="hidden" value ="">                    <!-- 공통 부서코드 -->
	    <input name="bocd" type="hidden" value ="">                         	<!-- 지국지사코드 -->
	    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- 세션 적용 여부 -->
		
		  <tr align="left" > 
		    <td height="25" bgcolor="#dddddd" width="75" class="gray">지국<font color="red">*</font>
			</td>
		    <td class="gray" width="200" height="25" colspan="3"> 
				<input name="bonm" type="text" style="ime-mode:active;" size="12" class="text_box" value=""  onkeydown="bo_enter_search('2');">
				&nbsp;
				<input name="bo_btn" type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" onclick="javascript:bo_search('2');window.event.returnValue=false;"> <!--지국검색팝업-->
				<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--부서,지역,지국 초기화-->
				&nbsp;&nbsp;
		    </td>
		    <td bgcolor="#dddddd" width="72" class="gray" height="25">컴퓨터명</td>
		    <td class="gray" width="119" height="25" colspan="3">
		      <select id="computer_id" name="computernm" class="sel_all" onChange="bocomp_search();">
		        <option value="">지국을 선택하세요.</option>
        		<%=ds.curcomplistOptHtml("")%>
		      </select> 
		    </td>
		  </tr>
		  
		  <tr align="left" > 
		    <td height="25" bgcolor="#dddddd" class="gray">처리상태<font color="red">*</font></td>
		    <td class="gray" width="100" height="25"> 
		      <select name="as_stat" class="sel_all" tabIndex="4" onkeydown="list_search_enter();">
		        <%=ds.curasstatOptHtml("")%>
		      </select> 
		    </td>
		    <td bgcolor="#dddddd" width="72" class="gray" height="25">모델</td>
		    <td class="gray" width="119" height="25"> 
		    <span id="modlcd">&nbsp;</span>
		    </td>
		    <td width="100" height="25" bgcolor="#dddddd" class="gray">컴퓨터기종</td>
		    <td colspan="3" class="gray" height="25" > 
		    <span id="kndcd">&nbsp;</span>
		    </td>
		  </tr>
		  <tr align="left" > 
		    <td bgcolor="#dddddd" class="gray" height="25">제작회사</td>
		    <td width="100" class="gray" height="25"> 
		    <span id="makecmpy">&nbsp;</span>
		    </td>
		    <td height="25" bgcolor="#dddddd" width="72" class="gray">OS 환경</td>
		    <td class="gray" width="119" height="25"> 
		    <span id="os">&nbsp;</span>
		    </td>
		    <td bgcolor="#dddddd" width="110" class="gray" height="25">메모리 용량(MB)</td>
		    <td class="gray" width="93" height="25"> 
		    <span id="memolicapa">&nbsp;</span>
		    </td>
		    <td bgcolor="#dddddd" class="gray" width="110" height="25">HDD 용량(GB)</td>
		    <td class="gray" width="85" height="25"> 
		    <span id="hddcapa">&nbsp;</span>
		    </td>
		  </tr>
		  <tr align="left" > 
		    <td height="16" bgcolor="#dddddd" class="gray">모니터</td>
		    <td colspan="7" class="gray"> 
		      <table width="100%" cellpadding="2" cellspacing="0" border="0" class="gray" >
		        <tr align="left" > 
		          <td width="72" height="16" bgcolor="#dddddd" class="gray">제작회사</td>
		          <td width="165" class="gray"> 
		    		<span id="monitormakecmpy">&nbsp;</span>
		          </td>
		          <td width="72" height="16" bgcolor="#dddddd" class="gray">모델</td>
		          <td width="165" class="gray"> 
		    		<span id="monitormodl">&nbsp;</span>
		          </td>
		          <td width="72" bgcolor="#dddddd" class="gray">크기</td>
		          <td class="gray"> 
		    		<span id="monitorsize">&nbsp;</span>
		          </td>
		        </tr>
		      </table>
		    </td>
		  </tr>
		  <tr align="left" > 
		    <td height="16" bgcolor="#dddddd" class="gray">프린터</td>
		    <td colspan="7" class="gray"> 
		      <table width="100%" cellpadding="2" cellspacing="0" border="0" class="gray" >
		        <tr align="left" > 
		          <td width="72" height="16" bgcolor="#dddddd" class="gray">종류</td>
		          <td width="165" class="gray"> 
		    		<span id="printerkind">&nbsp;</span>
		          </td>
		          <td width="72" height="16" bgcolor="#dddddd" class="gray">제작회사</td>
		          <td width="165" class="gray"> 
		    		<span id="printermakecmpy">&nbsp;</span>
		          </td>
		          <td width="72" bgcolor="#dddddd" class="gray">모델</td>
		          <td class="gray"> 
		    		<span id="printermodl">&nbsp;</span>
		          </td>
		        </tr>
		      </table>
		    </td>
		  </tr>
		  <tr align="left" > 
		    <td height="67" bgcolor="#dddddd" class="gray">비고</td>
		    <td colspan="7" class="gray"> 
		      <textarea name="remk" cols="99" rows="3" class="scroll1" readonly></textarea>
		    </td>
		  </tr>
		  <tr align="left" > 
		    <td height="16" bgcolor="#dddddd" class="gray">A/S요청내용<font color="red">*</font></td>
		    <td colspan="7" class="gray"> 
		      <textarea name="req_rmk" cols="99" rows="3" class="scroll1"></textarea>
		    </td>
		  </tr>
		</form>
		</table>
<!-- 컴퓨터 A/S 접수 상세 끝-->
		
		<!--버튼-->
		<table width="829" border="0" cellspacing="0" cellpadding="0" class="title2">
		  <tr> 
		    <td align="center" height="2"> 
		      <!--여백-->
		    </td>
		  </tr>
		  <tr> 
		    <td align="center" height="24" bgcolor="#E8E8E8">
	          	<input type="image" src="/html/comm_img/bu_new.gif" name="insert_btn" value="" align="absmiddle" 
	          		onclick="bocomp_append();window.event.returnValue=false;">
	          	<input type="image" src="/html/comm_img/bu_save.gif" name="update_btn" value="" align="absmiddle" 
	          		onclick="bocomp_edit();window.event.returnValue=false;">
	          	<input type="image" src="/html/comm_img/bu_del.gif" name="delete_btn" value="" align="absmiddle" 
	          		onclick="bocomp_del();;window.event.returnValue=false;">
	          	<input type="image" src="/html/comm_img/bu_cancel.gif" name="cancel_btn" value="" align="absmiddle" 
	          		onclick="bocomp_cancel();window.event.returnValue=false;">   
		    </td>
		  </tr>
		</table>
</td>
  </tr>
</table>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
