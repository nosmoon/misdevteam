<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1200_a.jsp
* ��� : ����Info-����������-�ʱ�ȭ��
* �ۼ����� : 2004-02-02
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	SS_L_BO_HEAD_INITDataSet ds = (SS_L_BO_HEAD_INITDataSet)request.getAttribute("ds");
    int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��(������ ���)
    int ideaListCount = 7;	// �� ȭ��� ����Ʈ �׸� ��(������ �Ұ� ���)
    applySession = true;	// ���� ���� ����
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.bo_head_search_form.bonm.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ������ ��Ϻ���
function list_search(){
    var lo_form1 = document.bo_head_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

	// ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/brinfo/1210";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �Ұ� ��� ����
function list_search_idea(){
    var lo_form1 = document.bo_head_idea_search_form;

	// �ֹι�ȣ üũ
	if(lo_form1.prn.value == ''){
        alert("������ ��Ͽ��� �������� �����ϼ���.");
        return;
	}
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

	// ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/brinfo/1240";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�(������ ���)
function page_move(pageno) {

    var lo_form1 = document.bo_head_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    // "/ss/brinfo/1210" �������� ������
    lo_form1.action = "/ss/brinfo/1210";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�(������ �Ұ� ���)
function page_move_idea(pageno) {

    var lo_form1 = document.bo_head_idea_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    // "/ss/brinfo/1240" �������� ������
    lo_form1.action = "/ss/brinfo/1240";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���� �˻�
function area_search(){
    var lo_form1 = document.bo_head_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>��ü</option>" +
                  "</select>"
        document.all.areacd_id.outerHTML = str;
        return;
    }

    // �μ�(��)�ڵ尪�� "/ss/common/1100" �������� ������
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1100";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����ã�� �˾�
function bo_search(){
    var lo_form1 = document.bo_head_search_form;
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
	    // ��� �˻��� ��� ó��
	    if(gs_request == 'L'){
	    	gs_request = 'N';
	    	list_search();
	    }
    }
	return;
}

// ����Ű�� ���� ����ã��
function bo_enter_search(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    var lo_form1 = document.bo_head_search_form;

    //�������� �������� ������ �����˻��˾��� ����.
	if(lo_form1.bonm.value == ''){
		bo_search();
		return;
	}

    // �μ�(��)�ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1113";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����Ű�� ���� ����ã�� ���ó��
function bo_enter_search_result(no){
	// �˻������ �Ѱ��̹Ƿ� �˻�â�� ������� �����Ѵ�.
	if(no == '1'){
		var lo_form1 = ifrm.document.bo_detail_form;
		var lo_form2 = document.bo_head_search_form;
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
	// �˻������ ���ų� �������̹Ƿ� ����ã�� �˾��� ����.
	}else if(no == '2'){
		bo_search();
	}
}

// �󼼺���(������)
function detail_view(bocd,prn,bjjgseq,bjjuminno){
    var lo_form1 = document.bo_head_detail_form;

    //  "/ss/brinfo/1220" �������� ������

    lo_form1.bocd.value = bocd;
    lo_form1.prn.value = prn;
    lo_form1.bjjgseq.value = bjjgseq;
    lo_form1.bjjuminno.value = bjjuminno;
    lo_form1.action = "/ss/brinfo/1220";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �󼼺���(������ �Ұ�)
function detail_view_idea(prn, seq){
    var lo_form1 = document.bo_head_idea_detail_form;

    //  "/ss/brinfo/1220" �������� ������

    lo_form1.prn.value = prn;
    lo_form1.seq.value = seq;
    lo_form1.action = "/ss/brinfo/1250";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����
function detail_save(){
    var lo_form1 = document.bo_head_detail_form;

    if(!check_all(lo_form1)) return;

    // "/ss/brinfo/1230" �������� ������
    lo_form1.bocd.value = lo_form1.bocd.value;
    lo_form1.prn.value = lo_form1.prn.value;
    lo_form1.bjjgseq.value = lo_form1.bjjgseq.value;
    lo_form1.bjjuminno.value = lo_form1.bjjuminno.value;

    setFamilyInfo();

    lo_form1.action = "/ss/brinfo/1230";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �������� iframe �� ���� bo_head_detail_form�� �����ϴ� �ʵ忡 ����
function setFamilyInfo(){
    var lo_form1 = bo_headfaml_dtl.document.bo_headfaml_form;
    var lo_form2 = document.bo_head_detail_form;

    if(!check_all(lo_form1)) return;
    if(!check_all(lo_form2)) return;

    for(var i=0; i<lo_form1.flnm.length; i++){
    	lo_form2.flnm[i].value = lo_form1.flnm[i].value;
    	lo_form2.rshp[i].value = lo_form1.rshp[i].value;
    	lo_form2.bidt[i].value = lo_form1.bidt[i].value;
    }
}


// ������ �Ұ� �� �߰�
function add(){
	var lo_form1 = document.bo_head_idea_detail_form;
	// �Ұ� �ʱ�ȭ
	lo_form1.idea1.outerHTML = '<textarea name="idea1" cols="45" rows="11" id="idea1_id"></textarea>';

	// �۾������� ���('I')�� ����
	lo_form1.accflag.value = 'I';

	// ��� ��ư ��Ȱ��ȭ
	document.all.cancel_id.disabled = true;
}

// ������ �Ұ� �� ����
function save(){
	var lo_form1 = document.bo_head_idea_detail_form;

    if(lo_form1.prn.value == '') {		// �ֹι�ȣ ���翩�θ� Ȯ���Ѵ�.
        alert("������ ��Ͽ��� �������� �����ϼ���.");
        return;
    }

	if(lo_form1.accflag.value == 'D'){								// ������ ���ܹ߻��ϸ� 'U'�� �����Ѵ�.
		lo_form1.accflag.value = 'U';
	}

    if(lo_form1.accflag.value == 'I') {	        					// �ű��Է��� ��
        lo_form1.action = "/ss/brinfo/1260";
    } else if(lo_form1.accflag.value == 'U') {						// ���������� ��
        lo_form1.action = "/ss/brinfo/1270";
    } else {
      return;
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �Ұ� �� ����
function del(){
	var lo_form1 = document.bo_head_idea_detail_form;

    if(lo_form1.prn.value == '' || lo_form1.seq.value == '') {		// �ֹι�ȣ, ���� ���翩�θ� Ȯ���Ѵ�.
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }

	var yesno = confirm("�����Ͻðڽ��ϱ�?");
	if(yesno){
	    lo_form1.accflag.value = 'D';								// �۾������� ����('D')�� ����
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/brinfo/1280";
	    lo_form1.submit();
	}
}

// ������ �Ұ� �� ���
function cancel(){
	var lo_form1 = document.bo_head_idea_detail_form;
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	lo_form1.reset();

	setEventHandler();												// �� �缳�� �� �̺�Ʈ�ڵ鷯 ȣ��
    setEnterKeyEventHandler();                                      // �� �缳�� �� �̺�Ʈ�ڵ鷯 ȣ��
}

// ��Ͽ��� ���õ� �ο� ��������
var go_sel_row;

// ���õ� �ο� ���� �ٲٱ�
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

// ��Ͽ��� ���콺 IN
function mouse_in(obj){
	if(obj != go_sel_row){
		obj.style.backgroundColor='#CCCCBB';
	}
}

// ��Ͽ��� ���콺 OUT
function mouse_out(obj){
	if(obj != go_sel_row){
		obj.style.backgroundColor='#FFFFFF';
	}
}

// �˻� ���� �ʱ�ȭ
function set_default(flag){

    var lo_form1 = document.bo_head_search_form;
    var lo_form2 = document.bo_head_idea_search_form;

	if(flag == '1'){			// �μ�(��),����,���� �ʱ�ȭ
		// �μ�(��) �ʱ�ȭ
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search();" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									+'</select>';
		// ���� �ʱ�ȭ
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" id="areacd_id" class="sel_all">'
									+'<% writeAreaOpt(session, out, true); %>'
									+'</select>';
		// �����ڵ�,������ �ʱ�ȭ, ��Ŀ���̵�
		lo_form1.bocd.value = "";
		lo_form1.bonm.value = "";
		lo_form1.bonm.focus();
	}else if(flag == '2'){		// �Ⱓ �ʱ�ȭ
		lo_form2.frdt.value = "";
		lo_form2.todt.value = "";
		lo_form2.frdt.focus();
	}else if(flag == '3'){		// ��Ÿ �ʱ�ȭ
	}
}

// ��� ��ȸ�� �������� ������ ��� �����˻� �� ��� ��ȸ�� �����Ѵ�.
// �̰�� �ܼ� �����˻��� �����˻� �� ��� ��ȸ�� �����ؾ� �ϴ°� �����ؾ� �ϰ� �����ȸ�� �����ؾ� �ϴ� ���� gs_request �������� L �� �����Ѵ�.
var gs_request = 'N';	// N : ��û����, L : ��ȸ��û

// ��û �÷��� ����
function set_request(flag){
	gs_request = flag;
}

// �����˻��� ���� ��� ��ȸ
function bo_list_search(){
    var lo_form1 = document.bo_head_search_form;

	if(lo_form1.bonm.value == ''){
		lo_form1.bocd.value = '';
		list_search();
	}else{
	    // �μ�(��)�ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >����Info
      &gt; </b> ����������</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<!--�˻� -->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="bo_head_search_form" method="post" action="">
	<input type="hidden" name="pageno" value ="1">							<!-- ���� ������ ��ȣ -->
	<input type="hidden" name="pagesize" value ="<%= moveListCount%>">		<!-- �� ȭ��� ����Ʈ �׸� �� -->
	<input type="hidden" name="js_fn_nm" value ="page_move">
	<input type="hidden" name="common_deptcd" value ="">                    <!-- ���� �μ�(��)�ڵ� -->
	<input type="hidden" name="bocd" value ="">                         	<!-- ���������ڵ� -->
	<input type="hidden" name="prn" value ="">
	<input type="hidden" name="bjjgseq" value ="">
	<input type="hidden" name="bjjuminno" value ="">
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
  <tr>
    <td bgcolor="#EBE9DC" width="40" class="sea_top">
      <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;</td>
    <td bgcolor="#EBE9DC" width="80" class="sea_top">
	    <select name="deptcd" onChange="area_search();" class="sel_all">
<%
			writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
	    </select>
    </td>
    <td bgcolor="#EBE9DC" class="sea_top" width="40">
     <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle"> ����</td>
    <td bgcolor="#EBE9DC" class="sea_top" width="100">
        <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
<%
			writeAreaOpt(session, out, true);
%>
        </select>
    </td>
    <td bgcolor="#EBE9DC" class="sea_top" width="40">
      <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
    </td>
    <td bgcolor="#EBE9DC" class="sea_top" width="160">
      <input name="bonm" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
      <input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--�����˻��˾�-->
      <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
    </td>
	<td rowspan="2" bgcolor="#EBE9DC" class="sea_top" align="right">
      <input type="image" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"><!--��� ��ȸ-->
    </td>
  </tr>
  <tr>
    <td bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���</td>
    <td bgcolor="#EBE9DC" width="80">
	  <select name="jmgystgb" class="sel_all">
	  	<option value="">��ü</option>
	  	<%= ds.curjmgystgbOptHtml("") %>	<!--�����±��� ���-->
	  </select>
    </td>
    <td colspan="2" bgcolor="#EBE9DC" align="left" width="140">
      <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�������
      <input name="bo_headnm" type="text" size="10" class="text_box">
    </td>
    <td colspan="2"bgcolor="#EBE9DC" align="left" width="200">
      <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�����θ�
      <input name="bjnm" type="text" size="10" class="text_box">
	</td>
  </tr>
  <tr bgcolor="#927F5B">
	<td colspan="7" height="1">
		<!--line -->
	</td>
  </tr>
  <tr>
    <td height="3" colspan="10">
      <!--����-->
    </td>
  </tr>
</form>
</table>
<!--����Ʈ -->
<table width="830" border="0" cellspacing="0" align="center" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="bo_head_list_id">
	<tr align="center"  bgcolor="#dddddd" height="23">
		<td class="gray" width="60" bgcolor="#dddddd" height="23"> ��&nbsp; </td>
		<td class="gray" width="60" bgcolor="#dddddd"> ���� </td>
		<td class="gray" width="60" bgcolor="#dddddd"> ���� </td>
		<td class="gray" width="65" bgcolor="#dddddd"> ������ </td>
		<td class="gray" width="55" bgcolor="#dddddd"> ���� </td>
		<td class="gray" width="305"> �ּ� </td>
		<td class="gray" width="80" bgcolor="#dddddd"> ���� ��ȭ��ȣ </td>
		<td class="gray" width="80" bgcolor="#dddddd"> ������ �޴��� </td>
		<td class="gray" width="65" bgcolor="#dddddd"> ������ </td>
	</tr>
     <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
    <%for(int j=0; j<moveListCount; j++){%>
	<tr>
		<td class="gray" width="60"> &nbsp; </td>
		<td class="gray" width="60"> &nbsp; </td>
		<td class="gray" width="60"> &nbsp; </td>
		<td class="gray" width="65"> &nbsp; </td>
		<td class="gray" width="55" align="center"> &nbsp; </td>
		<td class="gray" width="305"> &nbsp; </td>
		<td class="gray" width="80" align="center"> &nbsp; </td>
		<td class="gray" width="80" align="center"> &nbsp; </td>
		<td class="gray" width="65"> &nbsp; </td>
	</tr>
	<%}%>
    <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
	<tr align="right" height="23">
		<td colspan="10" bgcolor="#dddddd" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>�ѰǼ� ��</b>
		</td>
	</tr>
</table>
<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
  <tr>
    <td align="center" height="2">
      <!--����-->
    </td>
  </tr>
  <tr>
    <td align="center" height="24" bgcolor="#E8E8E8">
	    <!--JSP PAGE START---------------------------------------------------------------------------------->
	    <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
	    <jsp:param name = "pageno" 			value="0"/>
	    <jsp:param name = "totalcnt" 		value="0"/>
	    <jsp:param name = "js_fn_nm" 		value="page_move"/>
	    <jsp:param name = "pagesize" 		value="<%= moveListCount%>"/>
	    <jsp:param name = "page_set_gubun" 	value="0"/>
	    </jsp:include>
	    <!--JSP PAGE END------------------------------------------------------------------------------------>
    </td>
  </tr>
</table>
<!--list end-->
<br>
<!--������ ������ ---------------------------------------------------------------------------------------->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr>
    <td height="25" bgcolor="#EBE9DC" class="title" width="200">������ Profile</td>
    <td bgcolor="#EBE9DC" class="title" align="right">
		<input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:detail_save();">
	</td>
  <tr>
    <td height="3">
      <!--����-->
    </td>
  </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
<form name="bo_head_detail_form" method="post" action="">
	<input type="hidden" name="bocd" value="">
	<input type="hidden" name="prn" value="">
	<input type="hidden" name="bjjgseq" value="">
	<input type="hidden" name="bjjuminno" value="">

	<!-- ���� ���� ��� ���� �� ����-->
	<input name="seq"  type="hidden" value="1">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="2">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="3">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="4">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="5">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="6">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="7">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >

	<input name="seq"  type="hidden" value="8">
	<input name="flnm" type="hidden" value="" >
	<input name="rshp" type="hidden" value="" >
	<input name="bidt" type="hidden" value="" >
	<!-- ���� ���� ��� ���� �� ��-->

  <tr valign="top">
    <td width="50%">
      <!--������ ������ -->
      <table width="410"  border="0" cellspacing="0" class="gray" bgcolor="#FFFFFF" cellpadding="2" id="bohead_dtl1">
        <tr>
          <td  rowspan="6" class="gray" align="center" width="120">
            <!--��������� 100*125 style="border: #333333 1px solid;" �̹����� ������� img_no.gif -->
            <img src="/html/comm_img/img_no.gif" width="100" height="125" style="border: #333333 1px solid;">
          </td>
          <td  bgcolor="#dddddd" class="gray">������</td>
          <td  class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td  bgcolor="#dddddd" class="gray">�������</td>
          <td  class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td  bgcolor="#dddddd" class="gray">�������</td>
          <td  class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td  bgcolor="#dddddd" class="gray">�ֹι�ȣ</td>
          <td  class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td  bgcolor="#dddddd" class="gray" width="100">�����з�</td>
          <td  class="gray">
	        <select name="lastschir" size="1" class="sel_all">  <!--�����з� �ڵ�, �����з� ���-->
	            <option value='' selected>----------</option>
	        </select>
          </td>
        </tr>
        <tr>
          <td  bgcolor="#dddddd" class="gray" width="100">�����</td>
          <td  class="gray">
	        <select name="nativ" size="1" class="sel_all">  <!--����� �ڵ�, ����� ���-->
	            <option value='' selected>----------</option>
	        </select>
          </td>
        </tr>
      </table>
    </td>
    <td align="right">
	<!--��� title-->
	<table width="410" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF">
  <tr bgcolor="#dddddd">
    <td colspan="2" class="gray">��� </td>
  </tr></table>
  <!--��� title end-->
      <!-- iframe-->
      <iframe name="jgjangir_dtl" src="/html/brinfo/ss_brinfo_1221_l.htm" frameborder="0"  height="120" width="410" marginheight="0" marginwidth="0" scrolling="yes"></iframe>
	  <!-- ���list iframe end-->
    </td>
  </tr>
  <tr>
    <td colspan="2" height="10">
      <!--���� -->
    </td>
  </tr>
  <tr>
    <td valign="top">
      <!--�������� -->
      <table width="410" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF">
        <tr bgcolor="#dddddd">
          <td  colspan="3" class="gray">��������</td>
        </tr>
      </table>
 <!--�������� title end-->
      <!-- iframe-->
      <iframe name="bo_headfaml_dtl" src="/html/brinfo/ss_brinfo_1222_l.htm" frameborder="0"  height="115" width="410" marginheight="0" marginwidth="0" scrolling="yes"></iframe>
	  <!-- ��������list iframe end-->
    </td>
    <td align="right">
      <!--����Ư�� -->
      <table width="410" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="bohead_dtl2">
        <tr>
          <td colspan="2" bgcolor="#dddddd" class="gray">����Ư��</td>
        </tr>
        <tr>
          <td   bgcolor="#dddddd" width="100" class="gray">���</td>
          <td width="310" class="gray" >
            <input name="hby" type="text" value="" size="20" class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">Ư��</td>
          <td width="310" class="gray" >
            <input name="spc" type="text" value="" size="20"  class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">����</td>
          <td width="310" class="gray" >
            <input name="relg" type="text" value="" size="20"  class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">����</td>
          <td width="310" class="gray" >
            <input name="drink" type="text" value="" size="20"  class="text_box">
          </td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">��</td>
          <td width="310" class="gray" >
            <input name="smok" type="text" size="20"  class="text_box">
          </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td colspan="2" height="10">
      <!--���� -->
    </td>
  </tr>
  <tr>
    <td valign="top"  colspan="2">

      <!--�ּ� �� ����ó -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="adddrphone_dtl">
        <tr bgcolor="#dddddd">
          <td colspan="4" class="gray">�ּ� �� ����ó</td>
        </tr>
        <tr>
          <td width="100" bgcolor="#dddddd" class="gray">�����ȣ</td>
          <td width="100" class="gray">&nbsp;</td>
          <td width="100" bgcolor="#dddddd" class="gray">�ּ�</td>
          <td class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td width="100" bgcolor="#dddddd" class="gray">������ȭ</td>
          <td width="100" class="gray">&nbsp;</td>
          <td width="100" bgcolor="#dddddd" class="gray">������ �޴���</td>
          <td class="gray">&nbsp;</td>
        </tr>
      </table>

    </td>
  </tr>
  <tr>
    <td colspan="2" height="10">
      <!--���� -->
    </td>
  </tr>
  <tr>
    <td valign="top"  colspan="2">


      <!--���������� -->
      <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="bjinfo_dtl">
        <tr bgcolor="#dddddd">
          <td colspan="4" class="gray">������ ����</td>
        </tr>
        <tr>
          <td width="100" bgcolor="#dddddd" class="gray">����</td>
          <td width="315" class="gray">&nbsp;</td>
          <td width="100" bgcolor="#dddddd" class="gray">�ֹε�Ϲ�ȣ</td>
          <td class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">��ȭ��ȣ</td>
          <td colspan="3" class="gray">&nbsp;</td>
        </tr>
        <tr>
          <td bgcolor="#dddddd" width="100" class="gray">�ּ�</td>
          <td colspan="3" class="gray">&nbsp; </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td colspan="2" height="10">
      <!--���� -->
    </td>
  </tr>

</form>
</table>


<!--������ �Ұ�-->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
	<tr>
		<td  height="25" bgcolor="#EBE9DC" class="title">������ �Ұ�</td>
	</tr>
	<tr>
		<td height="3">
		<!--����-->
		</td>
	</tr>
</table>

<!-- ������ �Ұ� �˻� ����-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="bo_head_idea_search_form" method="post" action="">
	<input type="hidden" name="pageno" value ="1">							<!-- ���� ������ ��ȣ -->
	<input type="hidden" name="pagesize" value ="<%= ideaListCount%>">		<!-- �� ȭ��� ����Ʈ �׸� �� -->
	<input type="hidden" name="js_fn_nm" value ="page_move_idea">
	<input type="hidden" name="prn" value ="">								<!--������ �ֹι�ȣ-->
	<tr>
		<td bgcolor="#EBE9DC" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�ۼ��Ⱓ</td>
		<td bgcolor="#EBE9DC" width="200">
			<input name="frdt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="��������" dataType="date">
			-
			<input name="todt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="��������" dataType="date">
			<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--�Ⱓ �ʱ�ȭ-->
		</td>
		<td bgcolor="#EBE9DC" align="left" width="400">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�ۼ��ڸ�
			<input name="bo_headnm" type="text" size="10">
		</td>
			<td height="25" bgcolor="#EBE9DC" align="right">
			<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search_idea();window.event.returnValue=false;">
		</td>
	</tr>
	<tr bgcolor="#927F5B">
		<td colspan="4" height="1">
		<!--line -->
		</td>
	</tr>
	<tr>
	<td height="3" colspan="4">
		<!--����-->
		</td>
	</tr>
</form>
</table>
<!-- ������ �Ұ� �˻� ��-->

<!-- ������ �Ұ� ���,���(��) ���� -->
<table width="830" border="0" cellspacing="0" align="center" cellpadding="0" class="gray" bgcolor="#FFFFFF">
<tr>
    <td width="490" valign="top">

	<!--������ �Ұ� ��� ����-->
	<table width="489" border="0"  cellpadding="1" cellspacing="0" id="bo_head_idea_list_id">
		<tr align="center"  bgcolor="#dddddd" height="23">
			<td class="gray" width="50" bgcolor="#dddddd" > ���� </td>
			<td class="gray" width="100" bgcolor="#dddddd"> �ۼ��ڸ� </td>
			<td class="gray" width="100" bgcolor="#dddddd"> �ۼ����� </td>
			<td class="gray" bgcolor="#dddddd"> �Ұ� </td>
		</tr>
	<%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
	<%for(int j=0; j<ideaListCount; j++){%>
	<tr>
		<td class="gray" width="50" height="23"> &nbsp; </td>
		<td class="gray" width="100"> &nbsp; </td>
		<td class="gray" width="100"> &nbsp; </td>
		<td class="gray"> &nbsp; </td>
	</tr>
	<%}%>
	<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
	<tr bgcolor="#dddddd">
		<td colspan="4" class="gray" height="23"  align="right">
			<img src="/html/comm_img/ic_arr06.gif" align="absmiddle" width="7" height="7"> <b> �ѰǼ� �� </b>
		</td>
	</tr>
	</table>

	<!-- ������ �Ұ� ������ �̵� -->
	<table width="490" border="0" cellspacing="0" cellpadding="1" class="title2" id="page_move_idea">
	    <tr>
	        <td align="center" height="2">
	        <!--����-->
	        </td>
	    </tr>
	    <tr>
	        <td align="center" height="24" bgcolor="#E8E8E8">
	            <!--JSP PAGE START---------------------------------------------------------------------------------->
	            <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
	                <jsp:param name = "pageno" 		value="0"/>
	                <jsp:param name = "totalcnt" 	value="0"/>
	                <jsp:param name = "js_fn_nm" 	value="page_move_idea"/>
	                <jsp:param name = "pagesize" 	value="<%= ideaListCount%>"/>
	                <jsp:param name = "page_set_gubun" 	value="0"/>
	            </jsp:include>
	            <!--JSP PAGE END------------------------------------------------------------------------------------>
	        </td>
	    </tr>
	</table>
	<!-- ������ �Ұ� ������ �̵� -->

	</td>
    <td width="340" valign="top">
	    <table width="339" border="0"  cellpadding="1" cellspacing="0">
    	<form name="bo_head_idea_detail_form" method="post" action="">
    		<input type="hidden" name="accflag" value="I">	<!--���(I), ����(U), ����(D) ������-->
    		<input type="hidden" name="prn" value="">		<!--������ �ֹι�ȣ-->
    		<input type="hidden" name="seq" value="">		<!--����-->

			<tr align="center"  bgcolor="#dddddd">
				<td class="gray" bgcolor="#dddddd" height="23"> �Ұ� ���/�� </td>
			</tr>
	        <tr>
	            <td class="gray" height="180">
	                <textarea name="idea1" cols="45" rows="11" id="idea1_id"></textarea>
	            </td>
	        </tr>
		</form>
		</table>
	    <table width="340" border="0" cellspacing="0" cellpadding="0" class="title2" id="move_button_id">
	        <tr>
	            <td align="center" height="2">
	            <!--����-->
	            </td>
	        </tr>
	        <tr>
	            <td align="center" height="24" bgcolor="#E8E8E8">
	                <input type="image" id="add_id" src="/html/comm_img/bu_new.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:add();">
	                <input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:save();">
	                <input type="image" id="del_id" src="/html/comm_img/bu_del.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:del();">
	                <!-- ��� ��ư -->
	                <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" onclick="javascript:cancel();">
	            </td>
	        </tr>
	    </table>

	</td>
</tr>
</table>

<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
