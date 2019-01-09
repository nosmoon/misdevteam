<%@ page contentType="text/html; charset=euc-kr" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_common_1400_p.jsp
* 기능 		 : 공통 지국 찾기 (검색 버튼에 의한 팝업 화면)
* 작성일자 	 : 2003-12-09
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 :
* 수정자 	 :
* 수정일자 	 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<head>
<title>::::지국검색::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
</head>

<!--JavaScript COMMON START------------------------------------------------------------------------->
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<!--JavaScript COMMON END--------------------------------------------------------------------------->
<script language="JavaScript">
<!--
window.returnValue	 = "";
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
    setInputBackgroundColor();

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

    ga_args = ls_args.split(":");  //  검색구분(B:지국명, D:동명) + ":" + 검색어(지국명,동명)
    if(ga_args[1] != ""){
        if(ga_args[0] == "B"){
            lo_form.bonm.value     	= ga_args[1];
            lo_form.srch_word.value = ga_args[1];
            lo_form.bonm.select();
            lo_form.action = "/ss/slcommon/1410";
            lo_form.target = "ifrm";
            lo_form.submit();
        }else{
            lo_form.addr3.value     = ga_args[1];
			lo_form.srch_word.value = ga_args[1];
            lo_form.addr3.select();
            lo_form.action = "/ss/slcommon/1410";
            lo_form.target = "ifrm";
            lo_form.submit();
        }
    }
}

/**
 * form 단위로 유효성을 검증한 예제
 */
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

//지국 선택
function popup_select(bocd, bonm, deptcd, deptnm, areacd, areanm){
    window.returnValue = bocd + "\n" + bonm + "\n" + deptcd + "\n" + deptnm + "\n" + areacd + "\n" + areanm;
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

    lo_form1.action = "/ss/slcommon/1410";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

/*
//동 지국 검색
function list_search_addr3(){
    var lo_form1 = document.bo_search_form;

	if(trim(lo_form1.addr3.value) == ""){
		alert("읍/면/동을 입력하세요");
		return
	}
	lo_form1.bonm.value = "";
    lo_form1.action = "/ss/slcommon/1410";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

//지국명 지국 검색
function list_search_bonm(){
    var lo_form1 = document.bo_search_form;

	if(trim(lo_form1.bonm.value) == ""){
		alert("지국이름을 입력하세요");
		return
	}
	lo_form1.addr3.value = "";
    lo_form1.action = "/ss/slcommon/1410";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}
*/

//팝업 종료
function close_modal(){
    window.close();
}

//rowspan 되어 있는 2개의 로우에서 마우스 OUT 시 색깔 변경
function change_row_color_out(obj){
    for (i=0; i < document.all.bo_list_id.rows.length; i++) {
    	if(document.all.bo_list_id.rows(i) == obj){
            //document.all.bo_list_id.rows(i).style.backgroundColor = "#F2F2F2";
            document.all.bo_list_id.rows(i).className = "out";
			if( (i%2) == 0 && document.all.bo_list_id.rows(i-1) != null){	    // 짝수이면 자신보다 1 더 작은 홀수 로우까지 변경
                //document.all.bo_list_id.rows(i-1).style.backgroundColor = "#F2F2F2";
                document.all.bo_list_id.rows(i-1).className = "out";
			}else if( (i%2) == 1 && document.all.bo_list_id.rows(i+1) != null){	// 홀수이면 자신보다 1 더 큰 짝수 로우까지 변경
                //document.all.bo_list_id.rows(i+1).style.backgroundColor = "#F2F2F2";
                document.all.bo_list_id.rows(i+1).className = "out";
			}
        }
    }
}

//rowspan 되어 있는 2개의 로우에서 마우스 IN 시 색깔 변경
function change_row_color_in(obj){
    for (i=0; i < document.all.bo_list_id.rows.length; i++) {
    	if(document.all.bo_list_id.rows(i) == obj){
            //document.all.bo_list_id.rows(i).style.backgroundColor = "#CCCCBB";
            document.all.bo_list_id.rows(i).className = "over";
			if( (i%2) == 0 && document.all.bo_list_id.rows(i-1) != null){	    // 짝수이면 자신보다 1 더 작은 홀수 로우까지 변경
                //document.all.bo_list_id.rows(i-1).style.backgroundColor = "#CCCCBB";
                document.all.bo_list_id.rows(i-1).className = "over";
			}else if( (i%2) == 1 && document.all.bo_list_id.rows(i+1) != null){	// 홀수이면 자신보다 1 더 큰 짝수 로우까지 변경
                //document.all.bo_list_id.rows(i+1).style.backgroundColor = "#CCCCBB";
                document.all.bo_list_id.rows(i+1).className = "over";
			}
        }
    }
}
//-->
</script>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" class="scroll1" onload="jsInit()">
<!--팝업 사이즈 450*270-->
<table width="680" border="0" cellspacing="0" cellpadding="0" height="450">
	<tr>
		<td width="100%" height="76">
			<!--top img -->
			<table width=100% border=0 cellpadding=0 cellspacing=0 bgcolor="#959595">
				<tr>
					<td width="16"> <img src="/html/comm_img/bo_find_01.gif" width=16 height=76 ></td>
					<td width=72> <img src="/html/comm_img/bo_find_02.gif" width=72 height=76 ></td>
					<td width=133> <img src="/html/comm_img/bo_find_03.gif" width=133 height=76 ></td>
					<td background="/html/comm_img/zip_find_04.gif">&nbsp;</td>
				</tr>
		  </table>
		<!--top img end -->
		</td>
	</tr>
  	<tr>
    	<td align="center" class="pup" valign="top">
			<!--지국 검색 입력 부분 시작-->
			<table width="680" border="0" cellpadding="1" cellspacing="0">
<form name="bo_search_form" method="post" action="">
             <input type="hidden" name="addr3" value="">
             <input type="hidden" name="bonm" value="">
                <tr>
					<td><img src="/html/comm_img/ic_arr02.gif" width="7" height="11"></td>
					<td>'지국명을 혹은 읍/면/동'입력을 선택하신 후, 검색어를 입력하시고 '<font color="#0066cc">지국찾기</font>'를 클릭해 주세요.</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;<input type="radio" name="flag" value="0" checked>지국명
                        <input type="radio" name="flag" value="1">읍/면/동&nbsp;&nbsp;
						<input size="16" id="srch_word" name="srch_word" class="text_box" onkeydown="if(window.event.keyCode=='13'){list_search();window.event.returnValue=false;}" title="읍/면/동 입력시에는 읍/면/동 글자는 제외하고 입력하세요.">
						<input type="image" src="/html/comm_img/bu_findgi.gif" board="0" border="0" align="absmiddle" width="64" height="19"  onclick='list_search();window.event.returnValue=false;' style="cursor:hand">
					</td>
				</tr>
				<!--tr>
					<td><img src="/html/comm_img/ic_arr02.gif" width="7" height="11"></td>
					<td>'읍/면/동'자를 제외하고 입력하신후, '<font color="#0066cc">지국찾기</font>'를 클릭해 주세요</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;읍/면/동
						<input size="16" id="addr3" name="addr3" class="text_box" onkeydown="if(window.event.keyCode=='13'){list_search_addr3();window.event.returnValue=false;}">
						<input type="image" src="/html/comm_img/bu_findgi.gif" board="0" border="0" align="absmiddle" width="64" height="19"  onclick='list_search_addr3();window.event.returnValue=false;' style="cursor:hand">
					</td>
				</tr>
				<tr>
					<td><img src="/html/comm_img/ic_arr02.gif" width="7" height="11"></td>
					<td>지국이름을 입력하신후, '<font color="#0066cc">지국찾기</font>'를 클릭해 주세요</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;지국이름
					<input size="16" id="bonm" name="bonm" class="text_box" onkeydown="if(window.event.keyCode=='13'){list_search_bonm();window.event.returnValue=false;}">
					<input type="image" src="/html/comm_img/bu_findgi.gif" board="0" border="0" align="absmiddle" width="64" height="19" onclick='list_search_bonm();window.event.returnValue=false;' style="cursor:hand"></td>
				</tr-->
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
    <td align="center" height="27"  bgcolor="#959595"><input type="image" src="/html/comm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;"></a></td>
  </tr>
</table>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
