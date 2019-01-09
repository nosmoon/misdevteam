<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1300_a.jsp
* 기능 : 확장현황-사원확장-수당관리-초기화면
* 작성일자 : 2003-12-15
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EMPCAMPNODataSet ds = (SS_L_EMPCAMPNODataSet)request.getAttribute("ds");
	String paramGbn = "##";
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
	document.alon_search_form.frdt.focus();
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
function list_search()
{
    var lo_form1 = document.alon_search_form;

    // 화면제어와 성능을 위해 사원확장대회 또는 기간을 필수로 선택한 후 검색하게 한다.
    if( (lo_form1.rdr_extncampno.value == '') && ((lo_form1.frdt.value == '') || (lo_form1.frdt.value == '')) ){
		alert("확장대회 또는 기간을 선택하세요");
		return;
    }

    if(!check_all(lo_form1)) return;								// 폼 유효성 체크

    // 확장신청목록 조회조건을 "/ss/extn/1310" 서블릿으로 보낸다
    lo_form1.action = "/ss/extn/1310";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 전체선택, 취소
function check_all_chk(bool){
    var lo_form1 = document.alon_list_form;

    if(lo_form1.payyn==null) {								// 선택된 건이 없는 경우
        return;
    } else if(lo_form1.payyn.type=="checkbox") {			// 한건인 경우
        lo_form1.payyn.checked = bool;
    } else {												// 여러건인 경우
        for(var i=0; i<lo_form1.payyn.length; i++) {
            lo_form1.payyn[i].checked = bool;
        }
    }
}

// 취소
function alon_cancel(){
    var lo_form1 = document.alon_list_form;

	lo_form1.reset();
}

// 수당 상세보기
function alon_detail_view(rdr_extncampno, empseq){
    var lo_form1 = document.alon_list_form;

    // 사원확장수당 확장대회번호, 사원일련번호를 "/ss/extn/1320" 서블릿으로 보낸다
    lo_form1.rdr_extncampno.value = rdr_extncampno;
    lo_form1.empseq.value = empseq;
    lo_form1.action = "/ss/extn/1320";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// 저장
function alon_save(){
    var lo_form1 = document.alon_list_form;
	// 체크박스가 없으면 처리하지 않는다.
	if(lo_form1.payyn == null){
		return;
	}
    // 사원확장대회번호, 사원일련번호, 선택여부를 문자열 집합으로 만든다.
	var	ls_temp;
	var ls_rdr_extncampnoary = "";
	var ls_empseqary = "";
	var	ls_checkedary = "";
    for(var i=0; i<lo_form1.payyn.length; i++) {

		ls_temp = lo_form1.payyn[i].value;
		ls_rdr_extncampnoary = ls_rdr_extncampnoary + ls_temp.substring(0, ls_temp.length-6) + "<%= paramGbn%>";
		ls_empseqary = ls_empseqary + ls_temp.substring(6, ls_temp.length) + "<%= paramGbn%>";

        if(lo_form1.payyn[i].checked){
		    ls_checkedary = ls_checkedary + "Y" + "<%= paramGbn%>";
        }else{
		    ls_checkedary = ls_checkedary + "N" + "<%= paramGbn%>";
        }
    }
	lo_form1.rdr_extncampnoary.value = ls_rdr_extncampnoary.substring(0, ls_rdr_extncampnoary.length-2);
	lo_form1.empseqary.value = ls_empseqary.substring(0, ls_empseqary.length-2);
	lo_form1.checkedary.value = ls_checkedary.substring(0, ls_checkedary.length-2);

    // 기준일자, 지국지사코드, 선택여부를 문자열 집합을 "/ss/extn/1330" 서블릿으로 보낸다.
    lo_form1.action = "/ss/extn/1330";
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

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >확장현황
       </b>사원확장 &gt; 수당 </td>
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
      <!--사원확장 수당 검색 시작 ---------------------------------------------------------------------------->
      <table width="830" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" id="alon_search_id">
      <form name="alon_search_form" method="post" action="" >
        <tr>
          <td class="title"  bgcolor="#EBE9DC" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">확장대회
          </td>
          <td class="title" >
            <select name="rdr_extncampno" class="sel_all">
                <option value='' selected>선택</option>
                <%= ds.curcommlistOptHtml("") %><!-- 사원확장대회번호, 사원확장대회명 목록 -->
            </select>
          </td>
          <td class="title"  bgcolor="#EBE9DC" width="50"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">기간</td>
          <td class="title" >
            <input name="frdt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="시작일자" dataType="date">
            -
            <input name="todt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="종료일자" dataType="date">
          </td>
          <td class="title"  bgcolor="#EBE9DC" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">처리</td>
          <td class="title"  width="120">
            <select name="payyn" size="1"class="sel_all">
              <option value="" selected>전체</option>
              <option value="Y">지급</option>
              <option value="N">미지급</option>
            </select>
          </td>
          <td class="title"  width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">사원명</td>
          <td class="title" >
            <input name="empnm" type="text" style="ime-mode:active;" size="12" class="text_box">
          </td>
          <td class="title"  align="right">
	        <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;">
          </td>
        </tr>

	  </form>
      </table>
         <!--사원확장 수당 검색 끝 ---------------------------------------------------------------------------->
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
          <td  height="27" bgcolor="#EBE9DC" class="title">사원확장대회 수당목록</td>
          <td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="240">
			<input type="image" id="check_all_chk_true_id" src="/html/comm_img/bu_all01.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(true)">
            <input type="image" id="check_all_chk_false_id" src="/html/comm_img/bu_all02.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(false)">
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

    <!--사원확장 수당 목록 시작 ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="alon_list_id">
    <form name="alon_list_form" method="post" action="" >
        <input name="rdr_extncampno" type="hidden" value ="">
        <input name="rdr_extncampnoary" type="hidden" value ="">
        <input name="empseqary" type="hidden" value ="">
        <input name="checkedary" type="hidden" value ="">
		<tr height="25" bgcolor="#DDDDDD">
			<td width="100" class="gray" align="center">대회명</td>
			<td width="90" class="gray" align="center">시작일자</td>
			<td width="90" class="gray" align="center">종료일자</td>
			<td width="80" class="gray" align="center">사원명</td>
			<td width="100" class="gray" align="center">회사</td>
			<td width="100" class="gray" align="center">부서</td>
			<td width="90" class="gray" align="center">계</td>
			<td class="gray" align="center">송금</td>
			<td width="90" class="gray"align="center">송금일자</td>
		</tr>

        <%-- 초기화면 목록 반복 시작 --%>		
		<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center">&nbsp;</td>
			<td width="80" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center">&nbsp;</td>
	        <td class="gray" align="center"><input type="checkbox" name="checkbox" value="">&nbsp;</td>
			<td width="90" class="gray"align="center">&nbsp;</td>
		</tr>
		<%}%>
        <%-- 초기화면 목록 반복 끝 --%>

		<tr bgcolor="#dddddd" align="right">
			<td colspan="6" class="gray" align="right"> 계&nbsp;</td>
			<td width="95" class="gray" align="right"> &nbsp;</td>
			<td colspan="2" class="gray">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 건 </b>
			</td>
		</tr>
    </form>
    </table>
    <!--사원확장 수당 목록 끝 ---------------------------------------------------------------------------->
	</td>
  </tr>
  <tr>
    <td height="10">
      <!------여백--- -->
    </td>
  </tr>
  <tr>
	<td>
    <!--사원확장 수당 상세 시작 ---------------------------------------------------------------------------->
    <table border="0" cellspacing="0" cellpadding="0" id="alon_detail_id">
	</table>
    <!--사원확장 수당 상세 끝 ---------------------------------------------------------------------------->
  </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
