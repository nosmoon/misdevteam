<%@ page language="java" contentType="text/html; charset=euc-kr"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1401_a.jsp
* ��� : �ʰ��Ա�ó�� �ʱ�ȭ��
* �ۼ����� : 2003-12-09
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset �ν��Ͻ� ����κ�
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

// ȭ�� open�� event����
function init(){
	setEventHandler();
	//setEnterKeyEventHandler();
	setInputBackgroundColor();
}

// ��ȸ������ �Ա����� �ʵ��� �Է°��� �Ұ��� ���θ� �����Ѵ�
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

// �ʰ��Ա�ó������ combo box���ú���� ȣ������ �ʵ��� �Է°��� �Ұ��� ���θ� �����Ѵ�
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

// �ʰ��Ա�ó����� ��������ȸ�Ѵ�
function list_search(){
    var lo_form1 = document.list_form;
	var lo_form2 = document.detail_form;


	if(!validate(lo_form1)) { return false; }
    else{
        makeValue(lo_form1);
    }

    // �������а��� �ڵ屸�а��� "/ps/bill/1406" URL�� PUBBillkServlet������ ȣ���Ѵ�
    lo_form1.action = "/ps/bill/1406";
    lo_form1.target = "ifrm";
    lo_form1.submit();
	setEventHandler();
}

// �������� ǥ���Ѵ�
function detail_view(str0,str1,str2,str3,str4,str5,str6,str7,str8,str9) {
    var lo_form1 = document.list_form;
	var lo_form2 = document.detail_form;
	var selectedval = lo_form1.excsrcpmporcyn.options[lo_form1.excsrcpmporcyn.selectedIndex].value

	if(selectedval != '010' || str6 != ''){
        alert("�̹� ó���� ����Ÿ�Դϴ�.");
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

// ������ �������� �̵��Ѵ�.
function page_move(curr_page_no) {
    var lo_form3 = document.list_form;

    if(!curr_page_no) {
        lo_form3.curr_page_no.value = '1';
    } else {
        lo_form3.curr_page_no.value = curr_page_no;
    }

    list_search();
}

// �������� �űԵ�� ó���Ѵ�
function detail_insert() {
    var lo_form1 = document.detail_form;

	if(!validate(detail_form)) { return false; }
    else{
        makeValue(detail_form);
    }

	// flag�� �Է����� �����Ѵ�
	lo_form1.accflag.value = 'I';

    var ls_check = confirm("���� �Ͻðڽ��ϱ�?");
    if(!ls_check) return ;

    lo_form1.method = "post";
    lo_form1.action = "/ps/bill/1411";
    lo_form1.target = "ifrm";
    lo_form1.submit();
	setEventHandler();
}

/**
 * form ������ ��ȿ���� ����
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
 * form element ������ ��ȿ���� ����
 */
function check_obj(detail_form){
    for(var i=0; i< detail_form.elements.length; i++){
        var obj = detail_form.elements(i);
        if(!validateObj(detail_form, obj)) return false; // �ʵ� Object ������ ��ȿ�� ����
    }
    makeValue(detail_form);
    detail_form.submit();
}


function jsDebugSortedObj(objSorted){
    for(var i=0; i<objSorted.length; i++){
        alert(objSorted[i].tabIndex + " : " + objSorted[i].name);
    }
}

// Check Box�� Header�� ���ý� ȣ��ȴ�
function checkAll()
{
var size = document.list_form.chkhead.checked;
var len  = document.list_form.chk.length;
    if(document.list_form.chk == null) {						// ���õ� ���� ���� ���
		return;
    } else if (document.list_form.chk.type == "checkbox"){		// �Ѱ��� ���
		list_form.chk.checked = size;
    } else {
      for(var i=0; i<len; i++) {								// �������� ���
		if(!document.list_form.chk[i].disabled){
          list_form.chk[i].checked = size;
		}
      }
    }
}

// Check Box�� ������ Row�� ���ý� ȣ��ȴ�
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

// ������ư ���ý� ȣ��ȴ�
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
                alert(i+"��° ������ ����Ÿ�� ��������� �ƴմϴ� .");
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
		alert("������ ����� üũ�Ͻʽÿ�");
		return false;
	}
	lo_form.rdr_no.value=rdr_no;
	lo_form.medicd.value=medicd;
	lo_form.termsubsno.value=termsubsno;
	lo_form.seq.value=seq;
	lo_form.procclsf.value=procclsfyn;

    var ls_check = confirm("���� �Ͻðڽ��ϱ�?");
    if(!ls_check) return ;

	lo_form.accflag.value="D";
    lo_form.action = "/ps/bill/1421";
    lo_form.target = "ifrm";
    lo_form.submit();
	setEventHandler();
}

// �ش� �ε����� key_obj�� üũ�Ǿ��ִ����� ���� concat_str�� ����� ���ڿ��� �����Ѵ�.
// array_obj�� collection type�̴�.
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

// ���ڸ�,��ü�� ã��
function search_rdr_info() {

	var lo_form = document.detail_form;
	var ls_bocd = lo_form.slt_bocd.value;

	if(ls_bocd == null || ls_bocd == "" || ls_bocd.length == 0) {
		alert("���ڰ˻����� ���缱���� ����Ǿ�� �մϴ�.");
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

// ���ڹ�ȣ�� �������� set
function setReader(rdr_no,medicd,termsubsno,rdrnm,medinm){
    var lo_form1 = document.detail_form;
    lo_form1.rdr_no.value= rdr_no;
    lo_form1.medicd.value= medicd;
    lo_form1.termsubsno.value= termsubsno;
    lo_form1.rdrnm.value= rdrnm;
    lo_form1.medinm.value= medinm;
    setEventHandler();
}

//ȭ���ʱ�ȭ
function detail_reset() {
    var lo_form1 = document.detail_form;

    var lo_form1    = detail_form;

    // ó�� ���� flag�� �ʱ�ȭ��Ų��
    lo_form1.accflag.value = '';

    lo_form1.action = "/ps/bill/1401";
    lo_form1.target = "ifrm";
    lo_form1.method = "post";
    lo_form1.submit();

    lo_form1.reset();
	setEventHandler();

    return;
}

// �ʰ��Ա� ó������Ʈ �μ�
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
        <td  bgcolor="#797777" height="25" class="home"><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle"><b>����
        &gt; </b>�ʰ��Ա�ó��</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
<form name="detail_form" method="post" action="">
<input type="hidden" name="accflag" value="">
<input type="hidden" name="setFunction" >
<!-- �������� �ڵ� ���� -->
<input name="bocd" type="hidden" value ="">
    <tr>
       <td valign="top" align="center">
      <table width="830" border="0" cellspacing="0" cellpadding="2">
        <tr>
          <td bgcolor="#EBE9DC" class="title"><b>�ʰ��Ա�</b></td>
          <td bgcolor="#EBE9DC" class="title" align="right" width="120">
            <img src="/html/comm_img/bu1_reset.gif" width="73"  align="absmiddle" border="0" style="cursor:hand"
		 		 onclick="javascript:detail_reset();window.event.returnValue=false;">
            <img src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0"
				 onclick="javascript:detail_insert();window.event.returnValue=false;" style="cursor:hand"></td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--����-->
          </td>
        </tr>
      </table>


      <table  cellspacing="0" width="830" cellpadding="2" border="0" class="gray" bgcolor="#FFFFFF">

        <tr>
          <td width="110" bgcolor="#dddddd"  class="gray" > ó������<font color="red">*</font></td>
          <td width="110" class="gray" >
            <input type="text" name="procdt" size="10" tabIndex="1" class="text_box" caption="ó������" value="<%=Util.getDate()%>" datatype="date" notEmpty >
          </td>
		  <td width="70" bgcolor="#dddddd" class="gray" > ó������<font color="red">*</font></td>
          <td width="100" class="gray" >
            <select name="slt_bocd" size="1" tabIndex="2" class="sel_all" notEmpty caption="ó������">
            <option value="" >����</option>
			<%= ds.asinbocdcurOptHtml("") %>
            </select>
          </td>
          <td width="70" bgcolor="#dddddd" class="gray" > ���ڹ�ȣ<font color="red">*</font></td>
          <td class="gray" >
            <input type="text" name="rdr_no" size="9" maxlength="9" tabIndex="3" class="text_box" caption="���ڹ�ȣ"
                   len="9" notEmpty  >
            <input type="text" name="medicd" size="3" maxlength="3" tabIndex="4" class="text_box" caption="��ü�ڵ�"
                   notEmpty   >
            <input type="text" name="termsubsno" size="4"  maxlength="4" tabIndex="5" class="text_box" caption="���ⱸ����ȣ"
                   len="4" notEmpty  onblur="search_rdr_info();window.event.returnValue=false;">
            <input type="text" name="rdrnm" size="10" value=""   notEmpty readOnly>
            <input type="text" name="medinm" size="10" value=""   notEmpty readOnly>
          </td>
        </tr>
        <tr>
          <td width="110" bgcolor="#dddddd" class="gray" > �ʰ��Ա�ó������<font color="red">*</font></td>
          <td width="110" class="gray" >
            <select name="procclsf" size="1" class="sel_all" tabIndex="6" onchange="javascript:disableExcs()">
			<%= ds.excsrcpmporcclsfOptHtml("") %>
            </select>
          </td>
          <td width="70" bgcolor="#dddddd" class="gray" > ó���ݾ�<font color="red">*</font></td>
          <td width="100" class="gray" >
            <input type="text" name="procamt" size="10" tabIndex="7" class="text_box" style='text-align:right;'  caption="�ݾ�" datatype="number" comma notEmpty>
          </td>
          <td width="70" bgcolor="#dddddd" class="gray" > ����ȣ��</td>
          <td class="gray" >
            <input type="text" name="subsfrser_no" size="6" class="nolinemust"   readonly> ~
            <input type="text" name="substoser_no" size="6" class="nolinemust"   readonly>&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="text" name="extdtms" size="6" tabIndex="8" class="text_box_gray" readonly>&nbsp;ȣ
          </td>
        </tr>
		<tr>
		  <td width="60" bgcolor="#dddddd" class="gray" > �޸�</td>
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
            <!--����-->
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
          <td  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��û�⵵<font color="red">*</font></td>
          <td  class="title" width="70">
            <input type="text" name="subsyy" size="4" maxlength="4" class="text_box" value="<%=Util.getYear()%>">
          </td>
          <td  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">ó������<font color="red">*</font></td>
          <td  class="title" width="100">
            <select name="slt_bocd" size="1" class="sel_all" notEmpty caption="ó������" >
			<option value="" >����</option>
            <%= ds.asinbocdcurOptHtml("") %>
            </select>
          </td>
          <td  class="title" width="120"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�ʰ��Ա�ó������</td>
          <td  class="title" >
            <select name="excsrcpmporcyn" size="1" class="sel_all" onchange="javascript:disableRcpm()"   caption="�ʰ��Ա�ó������">
            <%= ds.excsrcpmporcynOptHtml("") %>
            </select>
          </td>
          <td  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">ó������</td>
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
            <!--����-->
          </td>
        </tr>
      </table>
      <!--list iframe -->
<!--�˻� -->
<table width="830" border="0" cellspacing="0" cellpadding="2">
  <tr>
    <td bgcolor="#EBE9DC" class="title"><b>�󼼸��</b></td>
    <td bgcolor="#EBE9DC" class="title" width="100" align="right">
	  <img src="/html/comm_img/bu_print.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:print();window.event.returnValue=false;" style="cursor:hand">
      <img src="/html/comm_img/bu_del01.gif" width="36" height="19" align="absmiddle" onclick ="javascript:list_delete();window.event.returnValue=false;" style="cursor:hand"></td>
  </tr>
  <tr>
    <td height="3" colspan="2">
      <!--����-->
    </td>
  </tr>
</table>
<!--����Ʈ -->
<table  width="830" cellspacing="0" cellpadding="1" border="0" class="gray" bgcolor="#FFFFFF"  id="list_info">
  <tr bgcolor="#dddddd">
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chkhead">
    </td>
    <td width="130" class="gray" align="center" > ���ڹ�ȣ </td>
    <td width="60"  class="gray" align="center" > ���� </td>
    <td width="80"  class="gray" align="center" > ������ü </td>
    <td width="80"  class="gray" align="center" > ó������ </td>
	<td width="60"  class="gray" align="center" > ó������ </td>
    <td width="110" class="gray" align="center" > ���������Ⱓ </td>
    <td width="110" class="gray" align="center" > ���屸���Ⱓ </td>
    <td width="80"  class="gray" align="center" > �Ǹűݾ� </td>
    <td width="80"  class="gray" align="center" > �ݾ� </td>
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
              <!--����-->
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


