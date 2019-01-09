<%@ page language="java" contentType="text/html; charset=euc-kr"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1401_a.jsp
* 기능 : 초과입금처리 초기화면
* 작성일자 : 2003-12-09
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset 인스턴스 선언부분
    PS_C_EXCSRCPMPROCDataSet ds = (PS_C_EXCSRCPMPROCDataSet)request.getAttribute("ds");
%>

<html>
<head>

<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
</head>

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">

// 화면 open시 event설정
function init(){
	setEventHandler();
	//setEnterKeyEventHandler();
	setInputBackgroundColor();
}

// 조회조건의 입금일자 필드의 입력가능 불가능 여부를 설정한다
function disableRcpm(){

    var lo_form1 = document.list_form;

	var selectedval = lo_form1.excsrcpmporcyn.options[lo_form1.excsrcpmporcyn.selectedIndex].value

	if(selectedval == '020'){
		lo_form1.procdtbgn.readOnly = false;
		lo_form1.procdtend.readOnly = false;
		lo_form1.procdtbgn.style.backgroundColor ="#ffffff";
		lo_form1.procdtend.style.backgroundColor ="#ffffff";
	}else{
		lo_form1.procdtbgn.value = '';
		lo_form1.procdtend.value = '';
		lo_form1.procdtbgn.readOnly = true;
		lo_form1.procdtend.readOnly = true;
		lo_form1.procdtbgn.style.backgroundColor ="#E8E8E8";
		lo_form1.procdtend.style.backgroundColor ="#E8E8E8";
	}
	setEventHandler();
}

// 초과입금처리구분 combo box선택변경시 호수연장 필드의 입력가능 불가능 여부를 설정한다
function disableExcs(){

    var lo_form1 = document.detail_form;

	var selectedval = lo_form1.procclsf.options[lo_form1.procclsf.selectedIndex].value
	if(selectedval == '020'){
		lo_form1.extdtms.value    = "1";
		lo_form1.extdtms.readOnly = false;
		lo_form1.extdtms.style.backgroundColor ="#ffffff";
	}else{
		lo_form1.extdtms.value    = "";
		lo_form1.extdtms.readOnly = true;
		lo_form1.extdtms.style.backgroundColor ="#E8E8E8";
	}
}

// 초과입금처리대상 내역을조회한다
function list_search(){
    var lo_form1 = document.list_form;
	var lo_form2 = document.detail_form;


	if(!validate(lo_form1)) { return false; }
    else{
        makeValue(lo_form1);
    }

    // 업무구분값과 코드구분값을 "/ps/bill/1406" URL로 PUBBillkServlet서블릿을 호출한다
    lo_form1.action = "/ps/bill/1406";
    lo_form1.target = "ifrm";
    lo_form1.submit();
	setEventHandler();
}

// 상세정보를 표기한다
function detail_view(str0,str1,str2,str3,str4,str5,str6,str7,str8,str9) {
    var lo_form1 = document.list_form;
	var lo_form2 = document.detail_form;
	var selectedval = lo_form1.excsrcpmporcyn.options[lo_form1.excsrcpmporcyn.selectedIndex].value

	if(selectedval != '010' || str6 != ''){
        alert("이미 처리된 데이타입니다.");
		return;
	}
    lo_form2.slt_bocd.value = str0;
	lo_form2.rdr_no.value = str1;
	lo_form2.rdrnm.value = str2;
	lo_form2.medinm.value = str3;
	lo_form2.subsfrser_no.value = str4;
	lo_form2.substoser_no.value = str5;
	lo_form2.procamt.value = str7;
	lo_form2.medicd.value = str8;
	lo_form2.termsubsno.value = str9;
}

// 선택한 페이지로 이동한다.
function page_move(curr_page_no) {
    var lo_form3 = document.list_form;

    if(!curr_page_no) {
        lo_form3.curr_page_no.value = '1';
    } else {
        lo_form3.curr_page_no.value = curr_page_no;
    }

    list_search();
}

// 상세정보를 신규등록 처리한다
function detail_insert() {
    var lo_form1 = document.detail_form;

	if(!validate(detail_form)) { return false; }
    else{
        makeValue(detail_form);
    }

	// flag를 입력으로 지정한다
	lo_form1.accflag.value = 'I';

    var ls_check = confirm("저장 하시겠습니까?");
    if(!ls_check) return ;

    lo_form1.method = "post";
    lo_form1.action = "/ps/bill/1411";
    lo_form1.target = "ifrm";
    lo_form1.submit();
	setEventHandler();
}

/**
 * form 단위로 유효성을 검증
 */
function check_all(detail_form){
    if(!validate(detail_form)) { return false; }
    else{
        makeValue(detail_form);
        detail_form.submit();
        return true;
    }
}


/**
 * form element 단위로 유효성을 검증
 */
function check_obj(detail_form){
    for(var i=0; i< detail_form.elements.length; i++){
        var obj = detail_form.elements(i);
        if(!validateObj(detail_form, obj)) return false; // 필드 Object 단위별 유효성 검증
    }
    makeValue(detail_form);
    detail_form.submit();
}


function jsDebugSortedObj(objSorted){
    for(var i=0; i<objSorted.length; i++){
        alert(objSorted[i].tabIndex + " : " + objSorted[i].name);
    }
}

// Check Box의 Header를 선택시 호출된다
function checkAll()
{
var size = document.list_form.chkhead.checked;
var len  = document.list_form.chk.length;
    if(document.list_form.chk == null) {						// 선택된 건이 없는 경우
		return;
    } else if (document.list_form.chk.type == "checkbox"){		// 한건인 경우
		list_form.chk.checked = size;
    } else {
      for(var i=0; i<len; i++) {								// 여러건인 경우
		if(!document.list_form.chk[i].disabled){
          list_form.chk[i].checked = size;
		}
      }
    }
}

// Check Box의 각각의 Row를 선택시 호출된다
function checkOne(){
var len  = document.list_form.chk.length;
var check = true;
	for (var i=0; i<len; i++){
		if((!list_form.chk[i].checked) && (!list_form.chk[i].disabled) ) {
    		check = false;
		}
	}
	document.list_form.chkhead.checked = check;
	window.event.cancelBubble=true;
}

// 삭제버튼 선택시 호출된다
function list_delete() {
	var lo_form = document.list_form;
	var rdr_no="";
	var medicd="";
	var termsubsno="";
	var seq="";

	var procclsfyn="";

	var len  = document.list_form.chk.length;


    for(var i = 0; i < len; i++){
        if(lo_form.chk[i].checked){
            var temp=lo_form.chk[i].value;
            var ss = temp.split("##");
            if(ss[4].length <= 0) {
                alert(i+"번째 선택한 데이타는 삭제대상이 아닙니다 .");
                return false;
            } else {
                rdr_no += "##"+ss[0];
                medicd += "##"+ss[1];
                termsubsno += "##" +ss[2];
                seq += "##"+ss[3];
                procclsfyn += "##"+ss[4];
            }
        }
    }
    if(rdr_no != ""){
		rdr_no = rdr_no.substr(2);
		medicd = medicd.substr(2);
		termsubsno = termsubsno.substr(2);
		seq = seq.substr(2);
		procclsfyn = procclsfyn.substr(2);
	} else {
		alert("삭제할 목록을 체크하십시요");
		return false;
	}
	lo_form.rdr_no.value=rdr_no;
	lo_form.medicd.value=medicd;
	lo_form.termsubsno.value=termsubsno;
	lo_form.seq.value=seq;
	lo_form.procclsf.value=procclsfyn;

    var ls_check = confirm("삭제 하시겠습니까?");
    if(!ls_check) return ;

	lo_form.accflag.value="D";
    lo_form.action = "/ps/bill/1421";
    lo_form.target = "ifrm";
    lo_form.submit();
	setEventHandler();
}

// 해당 인덱스의 key_obj가 체크되어있는지에 따라서 concat_str로 연결된 문자열을 조합한다.
// array_obj는 collection type이다.
function concatenate_with_delimiter(array_obj, concat_str, key_obj) {
    var ls_ret_str = "";
    var ls_obj_val;

    for(var i=0; i<array_obj.length; i++) {
        if(key_obj[i].checked) {
            ls_obj_val = array_obj[i].value;
            //if(ls_obj_val=="") ls_obj_val = null;
            ls_ret_str += (concat_str + ls_obj_val);
        }
    }

    ls_ret_str = ls_ret_str.substr(concat_str.length);

    return ls_ret_str;
}

// 독자명,매체명 찾기
function search_rdr_info() {

	var lo_form = document.detail_form;
	var ls_bocd = lo_form.slt_bocd.value;

	if(ls_bocd == null || ls_bocd == "" || ls_bocd.length == 0) {
		alert("독자검색전에 지사선택이 선행되어야 합니다.");
		lo_form.slt_bocd.focus();
           return false;
	}

    lo_form.action="/ps/bill/1431";
    lo_form.target="ifrm";
    lo_form.submit();
    lo_form.rdr_no.value= "";
    lo_form.medicd.value= "";
    lo_form.termsubsno.value= "";
    lo_form.rdrnm.value= "";
    lo_form.medinm.value= "";
}

// 독자번호로 독자정보 set
function setReader(rdr_no,medicd,termsubsno,rdrnm,medinm){
    var lo_form1 = document.detail_form;
    lo_form1.rdr_no.value= rdr_no;
    lo_form1.medicd.value= medicd;
    lo_form1.termsubsno.value= termsubsno;
    lo_form1.rdrnm.value= rdrnm;
    lo_form1.medinm.value= medinm;
    setEventHandler();
}

//화면초기화
function detail_reset() {
    var lo_form1 = document.detail_form;

    var lo_form1    = detail_form;

    // 처리 구분 flag를 초기화시킨다
    lo_form1.accflag.value = '';

    lo_form1.action = "/ps/bill/1401";
    lo_form1.target = "ifrm";
    lo_form1.method = "post";
    lo_form1.submit();

    lo_form1.reset();
	setEventHandler();

    return;
}

// 초과입금 처리리스트 인쇄
function print() {
    var lo_form1 = document.list_form;


    if(!validate(list_form)) { return false; }
    else{
        makeValue(list_form);
    }

    lo_form1.action = "/ps/bill/1426";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

</script>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="init()">

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
        <td  bgcolor="#797777" height="25" class="home"><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle"><b>수금
        &gt; </b>초과입금처리</td>
  </tr>
  <tr>
    <td height="10">
      <!--내용을 위한 여백-->
    </td>
  </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
<form name="detail_form" method="post" action="">
<input type="hidden" name="accflag" value="">
<input type="hidden" name="setFunction" >
<!-- 지국지사 코드 설정 -->
<input name="bocd" type="hidden" value ="">
    <tr>
       <td valign="top" align="center">
      <table width="830" border="0" cellspacing="0" cellpadding="2">
        <tr>
          <td bgcolor="#EBE9DC" class="title"><b>초과입금</b></td>
          <td bgcolor="#EBE9DC" class="title" align="right" width="120">
            <img src="/html/comm_img/bu1_reset.gif" width="73"  align="absmiddle" border="0" style="cursor:hand"
		 		 onclick="javascript:detail_reset();window.event.returnValue=false;">
            <img src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0"
				 onclick="javascript:detail_insert();window.event.returnValue=false;" style="cursor:hand"></td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--여백-->
          </td>
        </tr>
      </table>


      <table  cellspacing="0" width="830" cellpadding="2" border="0" class="gray" bgcolor="#FFFFFF">

        <tr>
          <td width="110" bgcolor="#dddddd"  class="gray" > 처리일자<font color="red">*</font></td>
          <td width="110" class="gray" >
            <input type="text" name="procdt" size="10" tabIndex="1" class="text_box" caption="처리일자" value="<%=Util.getDate()%>" datatype="date" notEmpty >
          </td>
		  <td width="70" bgcolor="#dddddd" class="gray" > 처리지사<font color="red">*</font></td>
          <td width="100" class="gray" >
            <select name="slt_bocd" size="1" tabIndex="2" class="sel_all" notEmpty caption="처리지사">
            <option value="" >선택</option>
			<%= ds.asinbocdcurOptHtml("") %>
            </select>
          </td>
          <td width="70" bgcolor="#dddddd" class="gray" > 독자번호<font color="red">*</font></td>
          <td class="gray" >
            <input type="text" name="rdr_no" size="9" maxlength="9" tabIndex="3" class="text_box" caption="독자번호"
                   len="9" notEmpty  >
            <input type="text" name="medicd" size="3" maxlength="3" tabIndex="4" class="text_box" caption="매체코드"
                   notEmpty   >
            <input type="text" name="termsubsno" size="4"  maxlength="4" tabIndex="5" class="text_box" caption="정기구독번호"
                   len="4" notEmpty  onblur="search_rdr_info();window.event.returnValue=false;">
            <input type="text" name="rdrnm" size="10" value=""   notEmpty readOnly>
            <input type="text" name="medinm" size="10" value=""   notEmpty readOnly>
          </td>
        </tr>
        <tr>
          <td width="110" bgcolor="#dddddd" class="gray" > 초과입금처리구분<font color="red">*</font></td>
          <td width="110" class="gray" >
            <select name="procclsf" size="1" class="sel_all" tabIndex="6" onchange="javascript:disableExcs()">
			<%= ds.excsrcpmporcclsfOptHtml("") %>
            </select>
          </td>
          <td width="70" bgcolor="#dddddd" class="gray" > 처리금액<font color="red">*</font></td>
          <td width="100" class="gray" >
            <input type="text" name="procamt" size="10" tabIndex="7" class="text_box" style='text-align:right;'  caption="금액" datatype="number" comma notEmpty>
          </td>
          <td width="70" bgcolor="#dddddd" class="gray" > 연장호수</td>
          <td class="gray" >
            <input type="text" name="subsfrser_no" size="6" class="nolinemust"   readonly> ~
            <input type="text" name="substoser_no" size="6" class="nolinemust"   readonly>&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="text" name="extdtms" size="6" tabIndex="8" class="text_box_gray" readonly>&nbsp;호
          </td>
        </tr>
		<tr>
		  <td width="60" bgcolor="#dddddd" class="gray" > 메모</td>
            <td colspan="5" class="gray" >
              <input type="text" name="memo" size="50" tabIndex="9" class="text_box">
            </td>
		</tr>

    </table>
    </td>
    </tr>
    </form>
        <tr>
            <td height="10" colspan="2">
            <!--여백-->
            </td>
        </tr>
	<form name="list_form" method="post" action="">
    <input type="hidden" name="accflag">
	<input type="hidden" name="medicd">
    <input type="hidden" name="seq">
    <input type="hidden" name="rdr_no">
    <input type="hidden" name="termsubsno">
	<input type="hidden" name="procclsf">
    <input name="curr_page_no" type="hidden" value ="1">
    <input name="records_per_page" type="hidden" value ="10">
    <input name="js_fn_nm" type="hidden" value ="page_move">
    <input name="bocd" type="hidden" value ="">
    <tr><td>
      <table width="830" border="0" cellspacing="0" cellpadding="2">
        <tr bgcolor="#EBE9DC">
          <td  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">신청년도<font color="red">*</font></td>
          <td  class="title" width="70">
            <input type="text" name="subsyy" size="4" maxlength="4" class="text_box" value="<%=Util.getYear()%>">
          </td>
          <td  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">처리지사<font color="red">*</font></td>
          <td  class="title" width="100">
            <select name="slt_bocd" size="1" class="sel_all" notEmpty caption="처리지사" >
			<option value="" >선택</option>
            <%= ds.asinbocdcurOptHtml("") %>
            </select>
          </td>
          <td  class="title" width="120"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">초과입금처리여부</td>
          <td  class="title" >
            <select name="excsrcpmporcyn" size="1" class="sel_all" onchange="javascript:disableRcpm()"   caption="초과입금처리여부">
            <%= ds.excsrcpmporcynOptHtml("") %>
            </select>
          </td>
          <td  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">처리일자</td>
          <td  class="title">
            <input type="text" name="procdtbgn" size="11"  class="readonly_box" dataType="date" readonly>
            -
            <input type="text" name="procdtend" size="11"  class="readonly_box" dataType="date" readonly>
            <input type="image" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" border="0"
			 onclick="javascript:list_search();window.event.returnValue=false;" style="cursor:hand">
          </td>

        </tr>
        <tr>
          <td height="3" colspan="6">
            <!--여백-->
          </td>
        </tr>
      </table>
      <!--list iframe -->
<!--검색 -->
<table width="830" border="0" cellspacing="0" cellpadding="2">
  <tr>
    <td bgcolor="#EBE9DC" class="title"><b>상세목록</b></td>
    <td bgcolor="#EBE9DC" class="title" width="100" align="right">
	  <img src="/html/comm_img/bu_print.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:print();window.event.returnValue=false;" style="cursor:hand">
      <img src="/html/comm_img/bu_del01.gif" width="36" height="19" align="absmiddle" onclick ="javascript:list_delete();window.event.returnValue=false;" style="cursor:hand"></td>
  </tr>
  <tr>
    <td height="3" colspan="2">
      <!--여백-->
    </td>
  </tr>
</table>
<!--리스트 -->
<table  width="830" cellspacing="0" cellpadding="1" border="0" class="gray" bgcolor="#FFFFFF"  id="list_info">
  <tr bgcolor="#dddddd">
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chkhead">
    </td>
    <td width="130" class="gray" align="center" > 독자번호 </td>
    <td width="60"  class="gray" align="center" > 성명 </td>
    <td width="80"  class="gray" align="center" > 구독매체 </td>
    <td width="80"  class="gray" align="center" > 처리구분 </td>
	<td width="60"  class="gray" align="center" > 처리일자 </td>
    <td width="110" class="gray" align="center" > 기존구독기간 </td>
    <td width="110" class="gray" align="center" > 연장구독기간 </td>
    <td width="80"  class="gray" align="center" > 판매금액 </td>
    <td width="80"  class="gray" align="center" > 금액 </td>
  </tr>
  <tr>
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chk">
    </td>
    <td width="130" class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="110" class="gray" align="center" > &nbsp; </td>
	<td width="110" class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
  </tr>
  <tr>
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chk">
    </td>
    <td width="130" class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="110" class="gray" align="center" > &nbsp; </td>
	<td width="110" class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
  </tr>
  <tr>
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chk">
    </td>
    <td width="130" class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="110" class="gray" align="center" > &nbsp; </td>
	<td width="110" class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
  </tr>
  <tr>
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chk">
    </td>
    <td width="130" class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="110" class="gray" align="center" > &nbsp; </td>
	<td width="110" class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
  </tr>
  <tr>
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chk">
    </td>
    <td width="130" class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="110" class="gray" align="center" > &nbsp; </td>
	<td width="110" class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
  </tr>
  <tr>
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chk">
    </td>
    <td width="130" class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="110" class="gray" align="center" > &nbsp; </td>
	<td width="110" class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
  </tr>
  <tr>
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chk">
    </td>
    <td width="130" class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="110" class="gray" align="center" > &nbsp; </td>
	<td width="110" class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
  </tr>
  <tr>
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chk">
    </td>
    <td width="130" class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="110" class="gray" align="center" > &nbsp; </td>
	<td width="110" class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
  </tr>
  <tr>
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chk">
    </td>
    <td width="130" class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="110" class="gray" align="center" > &nbsp; </td>
	<td width="110" class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
  </tr>
  <tr>
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chk">
    </td>
    <td width="130" class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="110" class="gray" align="center" > &nbsp; </td>
	<td width="110" class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
  </tr>
</table>
<!---button-->
        <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="navi">
          <tr>
            <td align="center" height="2">
              <!--여백-->
            </td>
          </tr>
          <tr>
             <td colspan=5 align="center" bgcolor="#E8E8E8">
                      <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
                      <jsp:param name = "curr_page_no" 		value="0"/>
                      <jsp:param name = "total_records" 		value="0"/>
                      <jsp:param name = "js_fn_nm" 			value=""/>
                      <jsp:param name = "records_per_page" 	value="10"/>
                      <jsp:param name = "page_set_gubun" 		value="0"/>
                      </jsp:include>

                      <!--JSP PAGE END------------------------------------------------------------------------------------>
              </td>
          </tr>
        </table>
    </td>
  </tr>
</form>
</table>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=800 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>


