<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_cns_1200_a.jsp
* ��� : ����-���� �ʱ�ȭ��
* �ۼ����� : 2004-07-15
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : ��ȭ�鿡 ���ִ����� �߰�
* ������ : ��뼷
* �������� : 2005-03-07
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : ��ȭ�鿡 19��ǥ �߰�
* ������ : ��뼷
* �������� : 2005-03-15
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_DSCT_INITDataSet ds = (SS_L_RDR_DSCT_INITDataSet)request.getAttribute("ds");
    int moveListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
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
	document.rdr_dsct_search_form.bonm.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ��Ϻ���
function list_search(){
    var lo_form1 = document.rdr_dsct_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

	// ���ں��� ��� ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/cns/1210";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// page �̵�
function page_move(pageno) {
    var lo_form1 = document.rdr_dsct_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

	// ���ں��� ��� ��ȸ������ �ش� �������� ������.
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    lo_form1.action = "/ss/cns/1210";
    lo_form1.target = "ifrm";
    lo_form1.submit();

}

// �󼼺���
function detail_view(regdt, regno){
    var lo_form1 = document.rdr_dsct_list_form;

    // �������, ��Ϲ�ȣ�� "/ss/cns/2120" �������� ������
    lo_form1.regdt.value = regdt;
    lo_form1.regno.value = regno;
    lo_form1.action = "/ss/cns/1220";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����ã�� �˾�
function bo_search(){
    var lo_form1 = document.rdr_dsct_search_form;
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

    var lo_form1 = document.rdr_dsct_search_form;

    //�������� �������� ������ �����˻��˾��� ����.
	if(lo_form1.bonm.value == ''){
		bo_search();
		return;
	}

    // �μ��ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
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
		var lo_form2 = document.rdr_dsct_search_form;
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

// ���� �˻�
function area_search(){
    var lo_form1 = document.rdr_dsct_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>��ü</option>" +
                  "</select>"
        document.all.areacd_id.outerHTML = str;
        return;
    }

    // �μ��ڵ尪�� "/ss/common/1100" �������� ������
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1100";
    lo_form1.target = "ifrm";
    lo_form1.submit();
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

    var lo_form1 = document.rdr_dsct_search_form;

	if(flag == '1'){			// �μ�,����,���� �ʱ�ȭ
		// �μ� �ʱ�ȭ
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
    var lo_form1 = document.rdr_dsct_search_form;

	if(lo_form1.bonm.value == ''){
		lo_form1.bocd.value = '';
		list_search();
	}else{
	    // �μ��ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}



//����Ű�� ���� �����ȣ �˻�2(������)
function zip_enter_search(i_pageno){

    var e = window.event;
    if(!e || e.keyCode != "13") return;

	var ls_medicd = rdr_dsct_detail_form.medicd.value;
	if(ls_medicd == '210' || ls_medicd == '220' || ls_medicd == '230' || ls_medicd == '240' || ls_medicd == '270' || ls_medicd == '420' || ls_medicd == '421' || ls_medicd == '422'){
		pb_rdr_enter_search('1');
		window.event.returnValue = false;
		return;
	}

	//�����ȣ ������ �ƴ϶�� zip_search �Լ��� call �Ѵ�.
	if(!validate_zip(rdr_dsct_detail_form.dlvzip.value)){
        zip_search(i_pageno);
		window.event.returnValue = false;
        return;
    }else{

		var lo_form = document.zip_search_form;
	    lo_form.zip.value = rdr_dsct_detail_form.dlvzip.value;
	    lo_form.pageno.value = i_pageno;   // ��������ȣ
	    lo_form.pagesize.value = "10000";  // ������������( �� �������� �ִ� ���ڵ� ��)

	    if(!check_all(zip_search_form, "/ss/common/1152")) return;

    }

}

//�˻���ư�� ���� �����ȣ �˻�(�˾�)2(������)
function zip_search(i_pageno){

	var ls_medicd = rdr_dsct_detail_form.medicd.value;
	if(ls_medicd == '210' || ls_medicd == '220' || ls_medicd == '230' || ls_medicd == '240' || ls_medicd == '270' || ls_medicd == '420' || ls_medicd == '421' || ls_medicd == '422'){
		pb_rdr_enter_search('2');
		window.event.returnValue = false;
		return;
	}

    var job_flg = "A"; //��ü �˻� "A" , ������ �˻� "S"
    var ls_name = deleteHyphen(trim(rdr_dsct_detail_form.dlvzip.value) + ":" + job_flg);
	var lo_form = document.rdr_dsct_detail_form;
	var ls_uri = "/ss/common/1150";
    var ls_return = jsNewModalWinNoS(ls_uri, ls_name, "430", "410");

	var la_str;
	if(ls_return.indexOf("\n") != -1){
    	la_str = ls_return.split("\n");
        lo_form.dlvzip.value = la_str[0];
		lo_form.dlvaddr.value = la_str[1];
        lo_form.bocd.value = la_str[4];
		lo_form.bonm.value = la_str[5];
		lo_form.telno1.value = la_str[6];
		lo_form.telno2.value = la_str[7];
		lo_form.telno3.value = la_str[8];
	}
	return;
}

//����Ű�� ���� �����ȣ �˻� �� �˻� ����� �Ѱ��϶�, ����� �ʵ忡 ����
function set_zip_search_result(){

	var zip_form 		= ifrm.document.zip_detail_form; 		// ifrm �� ��ȸ�� ��� form
	var lo_form 	    = document.rdr_dsct_detail_form;	 	// ���� ȭ�鳻 ���ڻ���

	lo_form.dlvzip.value 	= zip_form.zip.value;
	lo_form.dlvaddr.value 	= zip_form.addr.value;
}

// �����ȣ ��ȿ�� ����
function validate_zip(s_zip){
	if(trim(s_zip) == "") return false;
    var format = /^(\d{3})(-{0,1})(\d{3})$/;
    return isValidFormat(s_zip, format);
}



// �߰�
function add(){
    var lo_form1 = document.rdr_dsct_detail_form;	                // ������ ��

	// ���� �׸��� �����ϰ� ȭ�� ����
    var c_form2_elements = lo_form1.elements;
    for( var i =0; i< c_form2_elements.length; i++){
		c_form2_elements(i).value = "";
    }

	document.all.path_id.innerHTML = '&nbsp;TM';
	document.all.acpndt_id.innerHTML = '&nbsp;';
	document.all.boprocyn_id.innerHTML = '&nbsp;';
	document.all.boprocdt_id.innerHTML = '&nbsp;';
	document.all.cns_empnm_id.innerHTML = '<%= Util.getSessionParameterValue(request, "emp_nm", false)%>&nbsp;';
	document.all.cnscnfmtm_id.innerHTML = '&nbsp;';

	lo_form1.medicd.value='110'	//�����Ϻ� �⺻
    lo_form1.jobflag.value = 'D';									// �۾������� �������� ����
    lo_form1.accflag.value = 'I';									// ó�������� �Է����� ����
}

// ����
function save(){
   var lo_form1 = document.rdr_dsct_detail_form;

    lo_form1.jobflag.value = 'D';									// �۾������� �������� ����

	if(lo_form1.accflag.value == 'D'){								// ������ ���ܹ߻��ϸ� 'U'�� �����Ѵ�.
		lo_form1.accflag.value = 'U';
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ


    //���ּ� üũ
	if(lo_form1.dlvzip.value == '' || lo_form1.dlvaddr.value == '' || lo_form1.dlvdtlsaddr.value == ''){
		//������ �ʿ����.
		if(lo_form1.dscttypecd.value == '50' || lo_form1.dscttypecd.value == '60' || lo_form1.dscttypecd.value == '70' || lo_form1.dscttypecd.value == '80' || lo_form1.dscttypecd.value == '90' || lo_form1.dscttypecd.value == '95'){
			;
		}else{
			alert("�ּҸ� �Է��ϼ���");
			return;
		}
	}

	//������ üũ
	if(lo_form1.rdrnm.value == ''){
		alert("������ ������ �Է��ϼ���");
		return;
	}

	//�������� üũ
	if(lo_form1.dscttypecd.value == ''){
		alert("���� ������ �����ϼ���");
		return;
	}

	//���� �Ǵ� ���� üũ
	if(lo_form1.titl.value == '' || lo_form1.cont.value == ''){
		alert("���� �Ǵ� ������ �Է��ϼ���");
		return;
	}

	//����Ȯ�ο���
	if(lo_form1.cnscnfmyn_chk.checked){
		lo_form1.cnscnfmyn.value = 'Y';
	}else{
		lo_form1.cnscnfmyn.value = 'N';
	}

    //��������ó������(ó���ҿ�ð�,�����ݽǽ�)�� ������ �������
    lo_form1.bo_procreqitm.value = lo_form1.hdn_bo_procreqitm.value;
    lo_form1.bo_cnfmtel.value = lo_form1.hdn_bo_cnfmtel.value;

    if(lo_form1.accflag.value == 'I') {	        					// �ű��Է��� ��
        lo_form1.action = "/ss/cns/1550";
    } else if(lo_form1.accflag.value == 'U') {						// ���������� ��
    	lo_form1.pageno.value = document.rdr_dsct_search_form.pageno.value;
        lo_form1.action = "/ss/cns/1560";
    }

    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����
function del(){
    var lo_form1 = document.rdr_dsct_detail_form;
    lo_form1.jobflag.value = 'D';									// �۾������� �������� ����

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// ����, ��ȣ ���翩�θ� Ȯ���Ѵ�
    if(lo_form1.dt.value == '' || lo_form1.no.value == '') {
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }

	var yesno = confirm("�����Ͻðڽ��ϱ�?");
	if(yesno){
	    lo_form1.accflag.value = 'D';								// �۾������� ����('D')�� ����
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/cns/1570";
	    lo_form1.submit();
	}
}


// ���ǵ��ڰ˻�
function pb_rdr_enter_search(flag){
	if(flag == '1'){
	    var e = window.event;
	    if(!e || e.keyCode != "13") return;
	}
	var lo_form = document.rdr_dsct_detail_form;
	var ls_uri = "/ss/cns/1500";
	var ls_rdrnm = lo_form.rdrnm.value;
	var ls_medicd = lo_form.medicd.value;

	if(ls_medicd != '210' && ls_medicd != '220' && ls_medicd != '230' && ls_medicd != '240' && ls_medicd != '270' && ls_medicd != '420' && ls_medicd != '421' && ls_medicd != '422'){
		alert("���Ǹ�ü ���ý� ���ǵ��ڸ� �˻��մϴ�.");
		window.event.returnValue = false;
		return;
	}
    var ls_return = jsNewModalWinNoS(ls_uri, ls_rdrnm+":"+ls_medicd, "800", "410");

	var la_str;
	if(ls_return.indexOf("\n") != -1){

		// �����ڵ�,������, ������ȭ��ȣ �ʱ�ȭ
		lo_form.bocd.value = "";
		lo_form.bonm.value = "";
		lo_form.telno1.value = "";
		lo_form.telno2.value = "";
		lo_form.telno3.value = "";

    	la_str = ls_return.split("\n");
        lo_form.rdr_no.value = la_str[0];
        lo_form.rdrnm.value = la_str[1];
        lo_form.medicd.value = la_str[2];
        lo_form.aplcperstel_no1.value = la_str[3];
        lo_form.bocd.value = la_str[4];
		lo_form.bonm.value = la_str[5];

		var la_ret6 = la_str[6];
		if(la_ret6.indexOf("-") != -1){
			var ls_telno = la_ret6.split("-");
			lo_form.rdrtel_no1.value = ls_telno[0];
			lo_form.rdrtel_no2.value = ls_telno[1];
			lo_form.rdrtel_no3.value = ls_telno[2];
		}

		var la_ret7 = la_str[7];
		if(la_ret7.indexOf("-") != -1){
			var ls_telno2 = la_ret7.split("-");
			lo_form.rdrptph_no1.value = ls_telno2[0];
			lo_form.rdrptph_no2.value = ls_telno2[1];
			lo_form.rdrptph_no3.value = ls_telno2[2];
		}

        lo_form.dlvzip.value = la_str[8];
		lo_form.dlvaddr.value = la_str[9];
		lo_form.dlvdtlsaddr.value = la_str[10];

		var la_ret11 = la_str[11];
		if(la_ret11.indexOf("-") != -1){
			var ls_telno3 = la_ret11.split("-");
			lo_form.telno1.value = ls_telno3[0];
			lo_form.telno2.value = ls_telno3[1];
			lo_form.telno3.value = ls_telno3[2];
		}

	}
	setEventHandler();
	window.event.returnValue = false;
	return;
}

//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">

<form name="rdr_dsct_list_form" method="post" action="" >
    <input name="regdt" type="hidden" value ="">
    <input name="regno" type="hidden" value ="">
</form>


<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >������Ȳ
      &gt; </b> ���ں��� </td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td>
      <!--���ں������� �˻�-->
      <table width="830" border="0" cellspacing="0" cellpadding="2">

      <form name="rdr_dsct_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                <!-- ���� ������ ��ȣ -->
        <input name="pagesize" type="hidden" value ="<%= moveListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
        <input type="hidden" name="common_deptcd" value ="">                    <!-- ���� �μ��ڵ� -->
        <input type="hidden" name="bocd" value ="">                         	<!-- ���������ڵ� -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->

        <tr>
          <td bgcolor="#EBE9DC" width="40" class="sea_top">	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�</td>
          <td width="236" class="sea_top" bgcolor="#EBE9DC" >
            <select name="deptcd" onChange="area_search();" class="sel_all"><!-- �μ��ڵ�, �ڵ�� ��� -->
<%
					writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
            </select>
			&nbsp;
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
			&nbsp;
            <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
<%
					writeAreaOpt(session, out, true);
%>
            </select>&nbsp;
		  </td>
		  <td class="sea_top" bgcolor="#EBE9DC">
          	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
          </td>
          <td class="sea_top" bgcolor="#EBE9DC">
			<input name="bonm" type="text" size="12" class="text_box" value="" style="ime-mode:active;" onkeydown="bo_enter_search();">
			<input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" style="cursor:hand" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--�����˻��˾�-->
			<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�,����,���� �ʱ�ȭ-->
          </td>
          <td bgcolor="#EBE9DC" class="sea_top" width="40">
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���</td>
          <td colspan="3" bgcolor="#EBE9DC" class="sea_top" align="left">
			<select name="acpnpathcd" size="1" class="sel_all">
                <option value="" selected>��ü</option>
                <%= ds.acpnpathcdOptHtml("") %>                              <!-- ��û����ڵ�, �ڵ�� ��� -->
          </td>

          <td bgcolor="#EBE9DC" rowspan="2" width="52" align="right" class="sea_top">
            <input type="image" id="search_id" border="0" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;">
          </td>
        </tr>
        <tr>
          <td bgcolor="#EBE9DC" width="40"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ</td>
          <td width="236" bgcolor="#EBE9DC">
            <select name="fromtogb" size="1" onChange="" class="sel_all">
              <option value="">����</option>
              <option value="1">�������</option>
              <option value="2" selected>��������</option>
              <option value="3">ó������</option>
            </select>
            <input name="frdt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="�Ⱓ" dataType="date">
            -
            <input name="todt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="�Ⱓ" dataType="date">
          </td>
          <td bgcolor="#EBE9DC" width="40">
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
          <td width="140" bgcolor="#EBE9DC">
            <select name="dscttypecd" onChange="" class="sel_all"> <!-- ������������ �ڵ�,�ڵ�� ���-->
              <option value="" selected>��ü</option>
              <%= ds.dscttypecdOptHtml("")%>
            </select>
          </td>

          <td width="49" bgcolor="#EBE9DC"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">Ȯ��</td>
          <td width="80" bgcolor="#EBE9DC">
            <select name="bocnfmyn" onChange="" class="sel_all">
			  <option value="" selected>��ü</option>
              <option value="Y">Ȯ��</option>
              <option value="N">��Ȯ��</option>
            </select>
          </td>
          <td width="47" bgcolor="#EBE9DC"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">ó��</td>
          <td width="83" bgcolor="#EBE9DC">
            <select name="boprocyn" onChange="" class="sel_all">
			  <option value="" selected>��ü</option>
              <option value="Y">ó��</option>
              <option value="N">��ó��</option>
            </select>
          </td>
        </tr>

        <tr>
          <td colspan="8" bgcolor="#EBE9DC">
          	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���ڸ�
            <input name="rdrnm" type="text" size="10"  style="ime-mode:active;" class="text_box" value="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���ڹ�ȣ
            <input name="rdr_no" type="text" size="10"  style="ime-mode:active;" class="text_box" value="">&nbsp;&nbsp;&nbsp;
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����&nbsp;
            <input name="titl" type="text" size="22"  style="ime-mode:active;" class="text_box" value="">&nbsp;
          	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����&nbsp;&nbsp;&nbsp;&nbsp;
            <input name="cont" type="text" size="24"  style="ime-mode:active;" class="text_box" value="">
        </tr>


        <tr bgcolor="#927F5B">
          <td colspan="10" hight="1"><!--line--></td>
        </tr>
		   <tr>
          <td colspan="10" height="3"><!--����--></td>
        </tr>
      </form>
      </table>
      <!--���ں������� �˻� ��-->
      <!--���ں������� ��� ����-->
		<table cellpadding="0" cellspacing="0" id="rdr_dsct_list_id">
		<tr><td>
		<table width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff">

		  <tr bgcolor="#DDDDDD" height="23">
		    <td class="gray" align="center" width="68">���ڸ�</td>
		    <td class="gray" align="center" width="68">��������</td>
		    <td class="gray" align="center" width="65">����</td>
		    <td class="gray" align="center">����</td>
		    <td class="gray" align="center" width="100">������/ó����</td>
		    <td class="gray" align="center" width="55">����</td>
		    <td class="gray" align="center" width="68">����</td>
		    <td class="gray" align="center" width="50">����Ȯ��</td>
		    <td class="gray" align="center" width="55">���</td>
		    <td class="gray" align="center" width="68">ó������</td>
		  </tr>
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
        <%for(int i=0; i<moveListCount; i++){%>
		  <tr>
		    <td class="gray" width="68" align="center">&nbsp;</td>
		    <td class="gray" width="68" align="center">&nbsp;</td>
		    <td class="gray" width="65" align="center">&nbsp;</td>
		    <td class="gray">&nbsp;</td>
		    <td class="gray" width="100" align="center">&nbsp;</td>
		    <td class="gray" width="55" align="center">&nbsp;</td>
		    <td class="gray" width="68" align="center">&nbsp;</td>
		    <td class="gray" width="50" align="center">&nbsp;</td>
		    <td class="gray" width="55" align="center">&nbsp;</td>
		    <td class="gray" width="68" align="center">&nbsp;</td>
		  </tr>

        <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>

        <tr bgcolor="#dddddd" align="right">
            <td  height="23" class="gray" colspan="10">
                <img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
            </td>
        </tr>
		</table>
		<!---button-->
		<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
        <tr>
            <td align="center" height="2" colspan="10">
            <!--����-->
            </td>
        </tr>
        <tr>
            <td align="center" height="24" bgcolor="#E8E8E8" colspan="10">
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
    </td></tr>
    </table>
    <!-- ������ �̵� -->
    <!-- ���ں��� ��� �� -------------------------------------------------------------------------->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!--����-->
    </td>
  </tr>
  <tr>
    <td>

    <!--���ں��� �� ���� -------------------------------------------------------------------------->
	<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center" id="rdr_dsct_detail_id">
		<tr>
			<td  height="25" bgcolor="#EBE9DC" class="title" width="700">���ں��� ��( <font color="red"> ��Ͻ� ��ü�� ���� �����ϼ���. ���ڸ� �˻��� ���Ǹ�ü�� ���� ó���մϴ�. </font> )</td>
			<td align="right"  bgcolor="#EBE9DC" height="25" class="title">
				<input type="image" src="/html/comm_img/bu_new.gif" width="39" height="19" align="absmiddle" border="0" onclick="add()" border="0">
				<input type="image" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" onclick="save()" border="0">
				<input type="image" src="/html/comm_img/bu_del.gif" width="39" height="19" align="absmiddle" border="0" onclick="del()" border="0">
			</td>
		</tr>
		<tr>
			<td height="3"></td>
		</tr>
	</table>

	<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF">
	<form name="rdr_dsct_detail_form" method="post" action="" >
		<input name="jobflag" type="hidden" value="D">	<!--�������-->
		<input name="accflag" type="hidden" value="I">
		<input name="bocd" type="hidden" value="">
		<input name="dt" type="hidden" value="">		<!--�������-->
		<input name="no" type="hidden" value="">		<!--��Ϲ�ȣ-->
		<input name="cnscnfmyn" type="hidden" value=""><!--����Ȯ�ο���-->
		<input name="rdr_no" type="hidden" value="">	<!--���ڹ�ȣ(���ǵ��� �˻��� ���)-->
		<input name="aplcperstel_no1" type="hidden" value="">	<!--���ⱸ����ȣ(���ǵ��� �˻��� ���)-->

		<input name="pageno" type="hidden" value =""><!--�˻����� ��������ȣ-->

		<!--�����Ϲ� ����-->
		<tr>
			<td width="110" class="gray" bgcolor="#EBE9DC">�����Ϲ�</td>
			<td width="100" class="gray" bgcolor="#dddddd">��û���</td>
			<td	width="140" class="gray" id="path_id">&nbsp;TM</td>
			<td width="100" class="gray" bgcolor="#dddddd">�����Ͻ�</td>
			<td width="380" class="gray" colspan="3" id="acpndt_id">&nbsp;</td>
		</tr>
		<!--�����Ϲ� ��-->
		<!--�������� ����-->
		<tr>
			<td rowspan="4" width="110" class="gray" bgcolor="#EBE9DC">��������</td>
			<td width="100" class="gray" bgcolor="#dddddd">���ڸ�<font color="red">*</font></td>
			<td width="140" class="gray">
	        	<input name="rdrnm" type="text" size="10" style="ime-mode:active;" class="text_box" notEmpty caption="���ڸ�" onkeydown="pb_rdr_enter_search('1');">&nbsp;
			</td>
			<td width="100" class="gray" bgcolor="#dddddd">��ȭ��ȣ</td>
			<td width="140" class="gray">
				<input name="rdrtel_no1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrtel_no2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrtel_no3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">
			</td>
	        <td width="100" class="gray" bgcolor="#dddddd"> ��ü<font color="red">*</font></td>
	        <td width="140" class="gray">
				<select name="medicd" class="sel_all">
					<option value="">����</option>
					<option value="110" selected>�����Ϻ�</option>
					<option value="111">���Լ��ɱ���</option>
					<option value="116">���ִ�����</option><%--20050307 ��뼷 �߰� --%>
					<option value="117">19��ǥ</option><%--20050315 ��뼷 �߰� --%>
					<option value="120">�����պ�ȣ</option>
					<option value="130">�ҳ�����</option>
					<option value="210">�ְ�����</option>
					<option value="220">��������</option>
					<option value="230">������</option>
					<option value="240">��������</option>
					<option value="270">��������</option>
					<option value="420">TEPS</option>
					<option value="421">W.Village</option>
					<option value="422">ENNOBLE</option>
					<option value="424">¡�⽺ĭ</option>
					<option value="610">����������</option>
					<option value="11J">��������4~5��</option>
					<option value="11K">��������6~7��</option>
				</select>
			</td>
		</tr>
		<tr>
			<td width="100" class="gray" bgcolor="#dddddd">�޴�����ȣ</td>
			<td width="140" class="gray">
	        	<input name="rdrptph_no1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrptph_no2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">-
				<input name="rdrptph_no3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box">
			</td>
			<td width="100" class="gray" bgcolor="#dddddd">�̸���</td>
			<td width="380" class="gray" colspan="3">
	        	<input name="rdremail" type="text" size="50" style="ime-mode:active;" class="text_box">&nbsp;
			</td>
		</tr>
		<tr>
			<td width="100" class="gray" bgcolor="#dddddd">�ּ�<font color="red">*</font></td>
			<td width="620" colspan="5" class="gray">
				<input name="dlvzip" type="text" size="8"  class="text_box" caption="�����ȣ" onkeydown="zip_enter_search(1);">
				<input type="image" src="/html/comm_img/bu_search03.gif" width="39" height="19" align="absmiddle" style="cursor:hand;" onclick="zip_search();window.event.returnValue=false;">
				<input name="dlvaddr" type="text" size="40" class="text_box" readonly>
				<input name="dlvdtlsaddr" type="text" size="40" class="text_box" style="ime-mode:active;">
			</td>
		</tr>
		<tr>
			<td width="100" class="gray" bgcolor="#dddddd">������<font color="red">*</font></td>
			<td width="140" class="gray">
	        	<input name="bonm" type="text" size="10" style="ime-mode:active;" class="text_box" readOnly>&nbsp;
			</td>
			<td width="100" class="gray" bgcolor="#dddddd">������ȭ��ȣ</td>
			<td width="380" class="gray" colspan="3">
				<input name="telno1" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box" readOnly>-
				<input name="telno2" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box" readOnly>-
				<input name="telno3" type="text" size="4" style="ime-mode:active;" dataType="number" class="text_box" readOnly>
			</td>
		</tr>
		<!--�������� ��-->

		<!--������ ����-->
		<tr>
			<td width="110" class="gray" bgcolor="#EBE9DC" rowspan="5">������</td>
			<td width="100" class="gray" bgcolor="#dddddd">����<font color="red">*</font></td>
			<td width="140" class="gray">
				<select name="dscttypecd" class="sel_all">
                  <option value="" selected>��ü</option>
                  <%= ds.dscttypecdOptHtml("")%>
                </select>
<%--     			<option value="" selected>����</option>
					<option value="10">����</option>
					<option value="20">��������</option>
					<option value="30">����������</option>
					<option value="35">�ڵ���ü</option>
					<option value="40">����</option>
	              	<option value="45">��Ÿ(����)</option>
					<option value="50">����</option>
					<option value="60">�ǰ�</option>
					<option value="70">����</option>
					<option value="80">��������</option>
					<option value="90">����</option>
	              	<option value="95">��Ÿ(���)</option>
--%>
			</td>
			<td width="100" class="gray" bgcolor="#dddddd">����<font color="red">*</font></td>
			<td width="380" class="gray" colspan="3">
	        	<input name="titl" type="text" size="60" style="ime-mode:active;" class="text_box">&nbsp;
			</td>
		</tr>
		<tr>
			<td width="100" class="gray" bgcolor="#dddddd">����<font color="red">*</font></td>
			<td width="620" class="gray" colspan="5" align="center">
				<textarea name="cont" style="ime-mode:active;" rows="7" cols="87" class="scroll1"></textarea>
			</td>
		</tr>
		<!--������ ��-->

		<!--ó������ ����-->
		<tr>
<!--			<td rowspan="2" width="110" class="gray" bgcolor="#EBE9DC">ó������</td>-->
			<td width="100" class="gray" bgcolor="#dddddd">ó������</td>
			<td width="140" class="gray" id="boprocyn_id">&nbsp;</td>
			<td width="100" class="gray" bgcolor="#dddddd">ó���Ͻ�</td>
			<td width="380" class="gray" colspan="3" id="boprocdt_id">&nbsp;</td>
		</tr>
		<tr>
			<td width="100" class="gray" bgcolor="#dddddd">ó������</td>
			<td width="620" class="gray" colspan="5">
				<textarea name="boproccont" style="ime-mode:active;" rows="7" cols="87" class="scroll1"></textarea>
			</td>
		</tr>
		<tr>
			<td width="100" height="25" class="gray" bgcolor="#dddddd">ó�����</td>
			<td width="620" class="gray" colspan="5">&nbsp;ó���ҿ�ð�&nbsp;
              <select name="bo_procreqitm" class="sel_all" style="width:162;">
					<option value="" selected>����</option>
					<option value="10">30�� �̳�</option>
					<option value="20">30�� ~ 1�ð� �̳�</option>
					<option value="30">1�ð� �̻�</option>
              </select>
              &nbsp;&nbsp;&nbsp;�����ݽǽ�&nbsp;
              <select name="bo_cnfmtel" class="sel_all" style="width:55;">
					<option value="" selected>����</option>
					<option value="Y">Y</option>
					<option value="N">N</option>
              </select>
              <input type="hidden" name="hdn_bo_procreqitm" value="">
              <input type="hidden" name="hdn_bo_cnfmtel" value="">
			</td>
		</tr>
		<!--ó������ ��-->

		<!--���� ����-->
		<tr>
			<td rowspan="3" width="110" class="gray" bgcolor="#EBE9DC">����</td>
			<td width="100" class="gray" bgcolor="#dddddd">�̸�</td>
			<td width="140" class="gray" id="cns_empnm_id"><%= Util.getSessionParameterValue(request, "emp_nm", false)%>&nbsp;</td>
			<td width="100" class="gray" bgcolor="#dddddd">Ȯ�ο���</td>
			<td width="140" class="gray">
	        	<input type="checkbox" name="cnscnfmyn_chk">&nbsp;
			</td>
			<td width="100" class="gray" bgcolor="#dddddd">�Ͻ�</td>
			<td width="140" class="gray" id="cnscnfmtm_id">&nbsp;</td>
		</tr>
		<tr>
			<td width="100" class="gray" bgcolor="#dddddd">���</td>
			<td colspan="5" class="gray">
				<textarea name="remk" style="ime-mode:active;" rows="7" cols="87" class="scroll1"></textarea>
			</td>
		</tr>
		<tr>
			<td width="100" height="28" class="gray" bgcolor="#dddddd">ó�����</td>
			<td width="620" class="gray" colspan="5">&nbsp;ó���ҿ�ð�&nbsp;
              <select name="cns_procreqitm" class="sel_all" style="width:162;">
					<option value="" selected>����</option>
					<option value="10">30�� �̳�</option>
					<option value="20">30�� ~ 1�ð� �̳�</option>
					<option value="30">1�ð� �̻�</option>
              </select>
              &nbsp;&nbsp;&nbsp;�����ݽǽ�&nbsp;
              <select name="cns_cnfmtel" class="sel_all" style="width:55;">
					<option value="" selected>����</option>
					<option value="Y">Y</option>
					<option value="N">N</option>
              </select>
			</td>
		</tr>
		<!--���� ��-->

	</form>
	</table>

    <!--���ں��� �� �� -------------------------------------------------------------------------->
    </td>
  </tr>
</table>
<br><br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
