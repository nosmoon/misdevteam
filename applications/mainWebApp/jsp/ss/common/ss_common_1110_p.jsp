<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_common_1110_a.jsp
* 기능 : 지국 검색 팝업
* 작성일자 : 2003-12-08
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<html>
<head>
<title>::: 지국찾기::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// 이벤트 변수
window.returnValue	 = "";

// 이벤트 핸들러 초기화
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
    init();
    check_enter_search();
    document.bo_search_form.srch_word.focus();
}

// 전달 매개변수 처리
function init(){
    var lo_form = document.bo_search_form;

    var ls_args = ":"; // dialog argument
    // dialog에 argument로 던져진 문자열을 ":" 로 split
    if(window.dialogArguments){
       if(window.dialogArguments.indexOf(":") == -1){
           alert("유효하지 않은 arguments 입니다.");
           window.returnValue = "";
           window.close();
        }
       ls_args = window.dialogArguments;
    }
    ga_args = ls_args.split(":");  	//ga_args[0] 부서코드, ga_args[1] 지역코드

    if(ga_args[0] != ""){ 			//부서코드
		lo_form.deptcd.value = ga_args[0];
    }
    if(ga_args[1] != ""){ 			//지역코드
		lo_form.areacd.value = ga_args[1];
    }
    if(ga_args[2] != ""){ 			//지국지사명
		lo_form.bonm.value   = ga_args[2];
    }

}

// 엔터키에 의한 검색 결과로 지국명을 가진 경우 지국명으로 검색을 수행한다.
function check_enter_search(){
    var lo_form1 = document.bo_search_form;

	if(lo_form1.bonm.value != ''){
		lo_form1.addr3.value = '';
	    lo_form1.action = "/ss/common/1115";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}	 
}

// 폼 유효성 체크
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// 지국,부서,지역정보 선택
function popup_select(bocd, bonm, deptcd, deptnm, areacd, areanm){
    window.returnValue = bocd+"\n"+bonm+"\n"+deptcd+"\n"+deptnm+"\n"+areacd+"\n"+areanm;
    window.close();
}

//동 지국 검색
function list_search(){
    var lo_form1 = document.bo_search_form;


	if(isEmpty(lo_form1.srch_word)){
		alert("검색어는 필수입력항목 입니다.");
        lo_form1.srch_word.focus();
        lo_form1.srch_word.select();
		return
	}
	if(jsGetCheckedValue(lo_form1,"flag") == "0"){ //지국명으로 검색일 경우
		lo_form1.addr3.value = "";
		lo_form1.bonm.value = lo_form1.srch_word.value;
    }else{ //동명으로 검색할 경우
		lo_form1.addr3.value = lo_form1.srch_word.value;
		lo_form1.bonm.value = "";
    }

    lo_form1.action = "/ss/common/1115";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}


/*
// 동 지국 검색
function list_search_addr3(){
    var lo_form1 = document.bo_search_form;

    // 읍/면/동 입력을  "/ss/common/1115" 서블릿으로 보낸다
	if(lo_form1.addr3.value == ''){
		alert("읍/면/동을 입력하세요");
		return
	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	lo_form1.bonm.value = '';
    lo_form1.action = "/ss/common/1115";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 지국명 지국 검색
function list_search_bonm(){
    var lo_form1 = document.bo_search_form;

    // 지국명 입력을 "/ss/common/1115" 서블릿으로 보낸다
	if(lo_form1.bonm.value == ''){
		alert("지국이름을 입력하세요");
		return
	}

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

	lo_form1.addr3.value = '';
    lo_form1.action = "/ss/common/1115";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}
*/


// 팝업 종료
function close_modal(){
    window.close();
}

// rowspan 되어 있는 2개의 로우에서 마우스 OUT 시 색깔 변경 /
function change_row_color_out(obj){
	// 목록을 포함하는 테이블
	lo_table = obj.parentNode;
    for (i=0; i < lo_table.rows.length; i++) {
    	if(lo_table.rows(i) == obj){
            lo_table.rows(i).style.backgroundColor = "#F2F2F2";
			if( (i%2) == 0 && lo_table.rows(i-1) != null){	    // 짝수이면 자신보다 1 더 작은 홀수 로우까지 변경
                lo_table.rows(i-1).style.backgroundColor = "#F2F2F2";
			}else if( (i%2) == 1 && lo_table.rows(i+1) != null){	// 홀수이면 자신보다 1 더 큰 짝수 로우까지 변경
                lo_table.rows(i+1).style.backgroundColor = "#F2F2F2";
			}
        }
    }
}

// rowspan 되어 있는 2개의 로우에서 마우스 IN 시 색깔 변경
function change_row_color_in(obj){
	// 목록을 포함하는 테이블
	lo_table = obj.parentNode;
    for (i=0; i < lo_table.rows.length; i++) {
    	if(lo_table.rows(i) == obj){
            lo_table.rows(i).style.backgroundColor = "#CCCCBB";
			if( (i%2) == 0 && lo_table.rows(i-1) != null){	    // 짝수이면 자신보다 1 더 작은 홀수 로우까지 변경
                lo_table.rows(i-1).style.backgroundColor = "#CCCCBB";
			}else if( (i%2) == 1 && lo_table.rows(i+1) != null){	// 홀수이면 자신보다 1 더 큰 짝수 로우까지 변경
                lo_table.rows(i+1).style.backgroundColor = "#CCCCBB";
			}
        }
    }
}

// Enter Key 처리
function check_enter(flag) { 
	if(event.keyCode == 13){
		if(flag == '1'){
			list_search_addr3();
		}else if(flag =='2'){
			list_search_bonm();
		}  
	} 
}

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">
<!--팝업 사이즈 450*270-->
<table width="700" border="0" cellspacing="0" cellpadding="0" height="450">
	<tr>
		<td height="76">
			<!--top img -->
			<table width=100% border=0 cellpadding=0 cellspacing=0>
				<tr>
					<td width="16"> <img src="/html/comm_img/bo_find_01.gif" width=16 height=76 ></td>
					<td width=72> <img src="/html/comm_img/bo_find_02.gif" width=72 height=76 ></td>
					<td width=133> <img src="/html/comm_img/bo_find_03.gif" width=133 height=76 ></td>
					<td background="/html/comm_img/zip_find_04.gif" >&nbsp;</td>
				</tr>
			</table>
		<!--top img end -->
		</td>
	</tr>
  	<tr>
    	<td align="center" class="pup" valign="top">
			<!--지국 검색 입력 부분 시작-->
			<table width="680" border="0" cellspacing="0" cellpadding="1">
<form name="bo_search_form" method="post" action="" >
	<input name="deptcd" type="hidden" value ="">		<!-- 부서코드 -->
	<input name="areacd" type="hidden" value ="">	    <!-- 지역코드 -->
	<input type="hidden" name="addr3" value="">
	<input type="hidden" name="bonm" value="">
                <tr>
					<td><img src="/html/comm_img/ic_arr02.gif" width="7" height="11"></td>
					<td>'지국명을 혹은 읍/면/동'입력을 선택하신 후, 검색어를 입력하시고 '<font color="#0066cc">지국찾기</font>'를 클릭해 주세요.( * 는 폐쇄지국 )</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;<input type="radio" name="flag" value="0" checked>지국명
                        <input type="radio" name="flag" value="1">읍/면/동&nbsp;&nbsp;
						<input size="16" id="srch_word" name="srch_word" class="text_box" onkeydown="if(window.event.keyCode=='13'){list_search();window.event.returnValue=false;}" title="읍/면/동 입력시에는 읍/면/동 글자는 제외하고 입력하세요.">
						<input type="image" src="/html/comm_img/bu_findgi.gif" board="0" border="0" align="absmiddle" width="64" height="19"  onclick='list_search();window.event.returnValue=false;' style="cursor:hand">
					</td>
				</tr>
<!--	
				<tr>
					<td width="7"><img src="/html/comm_img/ic_arr02.gif" width="7" height="11"></td>
					<td>'읍/면/동'자를 제외하고 입력하신후, '<font color="#0066cc">지국찾기</font>'를 클릭해 주세요</td>
				</tr>
				<tr>
					<td width="7">&nbsp;</td>
					<td>&nbsp;읍/면/동
						<input size="16" id="addr3" name="addr3" class="text_box" style="ime-mode:active;" onKeyDown="check_enter('1');">
						<img src="/html/comm_img/bu_findgi.gif" board="0" border="0" align="absmiddle" width="64" height="19"  onclick='list_search_addr3()' style="cursor:hand">
					</td>
				</tr>
				<tr>
					<td width="7"><img src="/html/comm_img/ic_arr02.gif" width="7" height="11"></td>
					<td>지국이름을 입력하신후, '<font color="#0066cc">지국찾기</font>'를 클릭해 주세요</td>
				</tr>
				<tr>
					<td width="7">&nbsp;</td>
					<td>&nbsp;지국이름
					<input size="16" id="bonm" name="bonm" class="text_box" style="ime-mode:active;" onKeyDown="check_enter('2');">
					<img src="/html/comm_img/bu_findgi.gif" board="0" border="0" align="absmiddle" width="64" height="19" onclick='list_search_bonm()' style="cursor:hand"></td>
				</tr>
-->				
				<tr>
					<td colspan="2" height="15">
					<!--주소가 나오는 곳과의 여백을 위한공간 -->
					</td>
				</tr>
</form>
			</table>
			<!--지국 검색 입력 부분 끝-->

            <!--지국 검색 결과가 없을 경우 출력 시작-->
			<table width="680" border="0" cellspacing="0" cellpadding="3" id="bo_notfound_id">
			</table>
            <!--지국 검색 결과가 없을 경우 출력 끝-->
			<br>
            <!--지국 검색 결과가 있을 경우 출력 시작-->
			<table width="680" border="1" cellspacing="0" align="center" class="gray" cellpadding="1" bgcolor="#FFFFFF" bordercolor="#FFFFFF" id="bo_list_id">
			</table>
            <!--지국 검색 결과가 있을 경우 출력 끝-->
		</td>
	</tr>
	<tr>
		<td align="center" height="7">
		<!--하단여백-->
		</td>
	</tr>
	<tr>
		<td align="center" height="27"  bgcolor="#959595"><input type="image" src="/html/comm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=true;"></td>
	</tr>
</table>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="680" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
