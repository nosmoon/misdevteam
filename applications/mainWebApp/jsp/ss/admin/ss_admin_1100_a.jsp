<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1100_a.jsp
* ��� : ������-���̱׷��̼�-��ȯ-�ʱ�ȭ��
* �ۼ����� : 2004-03-12
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");
    int migListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<style>
	.on_1{background-image:url("/html/comm_img/tb3_01.gif");}
	.on_2{background-image:url("/html/comm_img/tb3_02.gif");}
	.on_3{background-image:url("/html/comm_img/tb3_03.gif");}
	.on_4{background-image:url("/html/comm_img/tb3_04.gif");}
	.on_5{background-image:url("/html/comm_img/tb3_05.gif");}
	.on_6{background-image:url("/html/comm_img/tb3_06.gif");}
	.off_1{background-image:url("/html/comm_img/tb4_01.gif");}
	.off_2{background-image:url("/html/comm_img/tb4_02.gif");}
	.off_3{background-image:url("/html/comm_img/tb4_03.gif");}
	.off_4{background-image:url("/html/comm_img/tb4_04.gif");}
	.off_5{background-image:url("/html/comm_img/tb4_05.gif");}
	.off_6{background-image:url("/html/comm_img/tb4_06.gif");}
</style>

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript" src="/html/comm_js/progress.js"></script>	<!--�۾� ����� ���� �ڹٽ�ũ��Ʈ-->
<script language="JavaScript">
<!--
// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.mig_search_form.bonm.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ���� �˻�
function area_search(){
    var lo_form1 = document.mig_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>��ü</option>" +
                  "</select>"
        document.all.areacd_id.outerHTML = str;
        return;
    }

    // �μ��ڵ尪�� "/ss/common/1100" �������� ������
    lo_form1.action = "/ss/common/1100";
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����ã�� �˾�
// ���������ڵ�, ����������� �˾����κ��� �Ѿ�´�. �� ���� �����ڴ� "\n"
function bo_search(){
    var lo_form1 = document.mig_search_form;
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

// ����DB���ε� ���� Ȯ��
function showError(){

    var lo_form1 = document.mig_list_form;

    // ���� �˻� �� Ŭ�� üũ
    if(lo_form1.bocd.value == ''){
    	alert("���� �˻� �� Ŭ���ϼ���");
    	return;
    }
    
    opt = ",toolbar=no,menubar=no,location=no,scrollbars=yes,status=no";
    var lo_win = window.open("about:blank;", "error_window", "left=0,top=0" + ",width=" + "700" + ",height=" + "500"  + opt );
    
    lo_win.focus();
    lo_form1.action = "/ss/admin/1113";
    lo_form1.target = "error_window";
    lo_form1.submit();
    	
}

// ����Ű�� ���� ����ã��
function bo_enter_search(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    var lo_form1 = document.mig_search_form;

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
		var lo_form2 = document.mig_search_form;
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

// ��Ϻ���
function list_search(){
    var lo_form1 = document.mig_search_form;

    // ���� �˻� �� Ŭ�� üũ
    if(lo_form1.bocd.value == ''){
    	alert("���� �˻� �� Ŭ���ϼ���");
    	return;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// ��� �˻������� "/ss/admin/1105" �������� ������.
    lo_form1.action = "/ss/admin/1105";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �۾��̷� ��Ϻ���
function hsty_search(){
    var lo_form1 = document.mig_hsty_form;
    var lo_form2 = document.mig_search_form;

	// ���������ڵ带 �˻������� �����´�.
	lo_form1.bocd.value = lo_form2.bocd.value;

    // ���� �˻� �� Ŭ�� üũ
    if(lo_form1.bocd.value == ''){
    	alert("���� �˻� �� Ŭ���ϼ���");
    	return;
    }
    
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

    // ���� ���õ� ��� ���� �۾����а��� ���� �ش� �������� ������.
    if(lo_form1.workclsf.value == "BU"){
	    lo_form1.action = "/ss/admin/1130";
    }else if(lo_form1.workclsf.value == "LU"){
	    lo_form1.action = "/ss/admin/1135";
    }else if(lo_form1.workclsf.value == "BC"){
	    lo_form1.action = "/ss/admin/1140";
    }else if(lo_form1.workclsf.value == "LC"){
	    lo_form1.action = "/ss/admin/1145";
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �۾����� ��Ϻ���
function ptcr_search(workno){
    var lo_form1 = document.mig_ptcr_form;
    var lo_form2 = document.mig_search_form;

	// ���������ڵ带 �˻������� �����´�.
	lo_form1.bocd.value = lo_form2.bocd.value;

    // ���� �˻� �� Ŭ�� üũ
    if(lo_form1.bocd.value == ''){
    	alert("���� �˻� �� Ŭ���ϼ���");
    	return;
    }
	// �۾���ȣ ����
	lo_form1.workno.value = workno;

    // �̷� ��ȸ �� Ŭ�� üũ
    if(lo_form1.bocd.value == '' || lo_form1.workclsf.value == ''){
    	alert("�̷� ��ȸ �׸��� Ŭ���ϼ���");
    	return;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

    // ���� ���õ� ��� ���� �۾����а��� ���� �ش� �������� ������.
    if(lo_form1.workclsf.value == "BU"){
	    lo_form1.action = "/ss/admin/1150";
    }else if(lo_form1.workclsf.value == "LU"){
	    lo_form1.action = "/ss/admin/1155";
    }else if(lo_form1.workclsf.value == "BC"){
	    lo_form1.action = "/ss/admin/1160";
    }else if(lo_form1.workclsf.value == "LC"){
	    lo_form1.action = "/ss/admin/1165";
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���� DB ���ε�
function bo_db_upload(){
    var lo_form1 = document.mig_list_form;

    // ���� �˻� �� Ŭ�� üũ
    if(lo_form1.bocd.value == ''){
    	alert("���� �˻� �� Ŭ���ϼ���");
    	return;
    }

    // ������ üũ
    if(lo_form1.bonm.value == ''){
    	alert("�������� �Է��ϼ���.");
    	return;
    }

	lo_form1.accflag.value = 'BU';									// accflag ����('BU':���� DB ���ε�, 'LU':���� DB ���ε�, 'BC':���� DB ��ȯ, 'LC':���� DB ��ȯ)
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// ���������ڵ�, �������� "/ss/admin/1110" �������� ������.
    lo_form1.action = "/ss/admin/1110";
    lo_form1.target = "ifrm";
    lo_form1.submit();
	jsShowProgress();		// �۾� ��� ���̱�
}

/*
// ���� DB ���ε�
function bill_db_upload(){
    var lo_form1 = document.mig_list_form;

    // ���� �˻� �� Ŭ�� üũ
    if(lo_form1.bocd.value == ''){
    	alert("���� �˻� �� Ŭ���ϼ���");
    	return;
    }

	lo_form1.accflag.value = 'LU';									// accflag ����('BU':���� DB ���ε�, 'LU':���� DB ���ε�, 'BC':���� DB ��ȯ, 'LC':���� DB ��ȯ)
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// ���������ڵ�, �������� "/ss/admin/1115" �������� ������.
    lo_form1.action = "/ss/admin/1115";
    lo_form1.target = "ifrm";
    lo_form1.submit();
	jsShowProgress();		// �۾� ��� ���̱�
}
*/

// ���� DB ��ȯ
function bo_db_convert(){
    var lo_form1 = document.mig_list_form;

    // ���� �˻� �� Ŭ�� üũ
    if(lo_form1.bocd.value == ''){
    	alert("���� �˻� �� Ŭ���ϼ���");
    	return;
    }

	lo_form1.accflag.value = 'BC';									// accflag ����('BU':���� DB ���ε�, 'LU':���� DB ���ε�, 'BC':���� DB ��ȯ, 'LC':���� DB ��ȯ)
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// ���������ڵ�, �������� "/ss/admin/1120" �������� ������.
    lo_form1.action = "/ss/admin/1120";
    lo_form1.target = "ifrm";
    lo_form1.submit();
	jsShowProgress();		// �۾� ��� ���̱�
}

/*
// ���� DB ��ȯ
function bill_db_convert(){
    var lo_form1 = document.mig_list_form;

    // ���� �˻� �� Ŭ�� üũ
    if(lo_form1.bocd.value == ''){
    	alert("���� �˻� �� Ŭ���ϼ���");
    	return;
    }

	lo_form1.accflag.value = 'LC';									// accflag ����('BU':���� DB ���ε�, 'LU':���� DB ���ε�, 'BC':���� DB ��ȯ, 'LC':���� DB ��ȯ)
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// ���������ڵ�, �������� "/ss/admin/1125" �������� ������.
    lo_form1.action = "/ss/admin/1125";
    lo_form1.target = "ifrm";
    lo_form1.submit();
	jsShowProgress();		// �۾� ��� ���̱�
}
*/

//tab ��ü�� ���� display ����
function set_on_off_tab(curr_tab_id, i_total_count){
    var ls_tab_id = "";
	for(var i=0; i<i_total_count; i++){
        ls_tab_id = "tab_" + i;

    	if(curr_tab_id == ls_tab_id){
        	set_tab(document.all(ls_tab_id), "on");
    	}else{
        	set_tab(document.all(ls_tab_id), "off");
        }
    }
}
//tab "ON/OFF"
function set_tab(o_this, s_on_off){
	var lo_cells = o_this.cells;
    var count = 1;
    for (i=0; i < o_this.rows.length; i++) {
        for (j=0; j < o_this.rows(i).cells.length; j++) {
            o_this.rows(i).cells(j).className = s_on_off + "_" + count++;
        }
    }
}

//�� ���ý� �۾����� ����
function set_workclsf(workclsf){
	var lo_form1 = document.mig_hsty_form;
	var lo_form2 = document.mig_ptcr_form;
	// �۾�����
	lo_form1.workclsf.value = workclsf;
	lo_form2.workclsf.value = workclsf;
}

// ������ �̵�(�۾��̷�)
function page_move_hsty(pageno) {
    var lo_form1 = document.mig_hsty_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ���� ���õ� ��� ���� �۾����а��� ���� �ش� �������� ������.
    if(lo_form1.workclsf.value == "BU"){
	    lo_form1.action = "/ss/admin/1130";
    }else if(lo_form1.workclsf.value == "LU"){
	    lo_form1.action = "/ss/admin/1135";
    }else if(lo_form1.workclsf.value == "BC"){
	    lo_form1.action = "/ss/admin/1140";
    }else if(lo_form1.workclsf.value == "LC"){
	    lo_form1.action = "/ss/admin/1145";
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�(�۾�����)
function page_move_ptcr(pageno) {
    var lo_form1 = document.mig_ptcr_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ���� ���õ� ��� ���� �۾����а��� ���� �ش� �������� ������.
    if(lo_form1.workclsf.value == "BU"){
	    lo_form1.action = "/ss/admin/1150";
    }else if(lo_form1.workclsf.value == "LU"){
	    lo_form1.action = "/ss/admin/1155";
    }else if(lo_form1.workclsf.value == "BC"){
	    lo_form1.action = "/ss/admin/1160";
    }else if(lo_form1.workclsf.value == "LC"){
	    lo_form1.action = "/ss/admin/1165";
    }
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

    var lo_form1 = document.mig_search_form;
		
	if(flag == '1'){			// �μ�,����,���� �ʱ�ȭ
		// �μ� �ʱ�ȭ
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search();" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true); %>'
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
    var lo_form1 = document.mig_search_form;

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

//-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >������
		> </b>�۾� &gt; ���̱׷��̼�</td>
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

	<!--���̱׷��̼� �˻� ���� ---------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
	<form name="mig_search_form" method="post" action="" >
		<input name="common_deptcd" type="hidden" value ="">                    	<!-- ���� �μ��ڵ� -->
		<input name="bocd" type="hidden" value ="">                    				<!-- �����ڵ� -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   	<!-- ���� ���� ���� -->
		<tr>
			<td bgcolor="#EBE9DC" width="135" >
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�
	            <select name="deptcd" onChange="area_search('1');" class="sel_all">	<!-- �μ��ڵ�, �ڵ�� ��� -->
<%
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true);
%>
	            </select>
			</td>
			<td width="165" >
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
	            <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--�����ڵ�, ������ ���-->
<%
					writeAreaOpt(session, out, true);
%>
	            </select>
			</td>
			<td width="180">
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
				<input name="bonm" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
            	<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;" border="0"><!--�����˻��˾�-->
            	<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�,����,���� �ʱ�ȭ-->
            </td>
			</td>
			<td bgcolor="#EBE9DC" align="right">
				<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;" border="0" >
			</td>
		</tr>
	</form>
	</table>
	<!--���̱׷��̼� �˻� �� ---------------------------------------------------------------------------->

    </td>
  </tr>
  <tr>
    <td height="2">
      <!------����--- -->
    </td>
  </tr>
  <tr>
    <td height="10">

    <!--���̱׷��̼� ��� ���� ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="mig_list_id">
	<form name="mig_list_form" method="post" action="" >
		<input name="bocd" type="hidden" value ="">                    				<!-- �����ڵ� -->
		<input name="bonm" type="hidden" value ="">                    				<!-- ������ -->
		<input name="accflag" type="hidden" value ="">                    			<!--accflag ����('BU':���� DB ���ε�, 'LU':���� DB ���ε�, 'BC':���� DB ��ȯ, 'LC':���� DB ��ȯ)-->

		<tr bgcolor="#dddddd" align="center" height="23">
			<td class="gray" align="center"> ���� </td>
			<td width="165" class="gray" align="center"> �����Ͻ� </td>
			<td width="165" class="gray" align="center"> �����Ͻ� </td>
			<td width="150" class="gray" align="center"> �۾����� </td>
			<td width="200" class="gray" align="center"> ó�� </td>
		</tr>
		<tr height="23">
			<td class="gray" align="left"> &nbsp;����DB���ε� </td>
			<td width="165" class="gray" align="center"> &nbsp; </td>
			<td width="165" class="gray" align="center"> &nbsp; </td>
			<td width="150" class="gray" align="center"> &nbsp; </td>
			<td width="200" class="gray" align="left">&nbsp;&nbsp;
				<input type="image" src="/html/comm_img/bu_bodbup.gif" width="96" height="19" align="absmiddle" onclick="javascript:bo_db_upload();window.event.returnValue=false;" border="0">
			</td>
		</tr>
<%--		
		<tr height="23">
			<td class="gray" align="left"> &nbsp;����DB���ε� </td>
			<td width="165" class="gray" align="center"> &nbsp; </td>
			<td width="165" class="gray" align="center"> &nbsp; </td>
			<td width="150" class="gray" align="center"> &nbsp; </td>
			<td width="200" class="gray" align="left">&nbsp;&nbsp;
				<input type="image" src="/html/comm_img/bu_billdbup.gif" width="96" height="19" align="absmiddle" onclick="javascript:bill_db_upload();window.event.returnValue=false;" border="0">
			</td>
		</tr>
--%>		
		<tr height="23">
			<td class="gray"align="left"> &nbsp;����DB��ȯ </td>
			<td width="165" class="gray"align="center"> &nbsp; </td>
			<td width="165" class="gray"align="center"> &nbsp; </td>
			<td width="150" class="gray"align="center"> &nbsp; </td>
			<td width="200" class="gray"align="left">&nbsp;&nbsp;
				<input type="image" src="/html/comm_img/bu_bodbch.gif" width="84" height="19" align="absmiddle" onclick="javascript:bo_db_convert();window.event.returnValue=false;" border="0">
			</td>
		</tr>
<%--		
		<tr height="23">
			<td class="gray"align="left"> &nbsp;����DB��ȯ </td>
			<td width="165" class="gray"align="center"> &nbsp; </td>
			<td width="165" class="gray"align="center"> &nbsp; </td>
			<td width="150" class="gray"align="center"> &nbsp; </td>
			<td width="200" class="gray"align="left">&nbsp;&nbsp;
				<input type="image" src="/html/comm_img/bu_billdbch.gif" width="84" height="19" align="absmiddle" onclick="javascript:bill_db_convert();window.event.returnValue=false;" border="0">
			</td>
		</tr>
--%>		
	</form>
    </table>
    <!--���̱׷��̼� ��� �� ---------------------------------------------------------------------------->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!------����--- -->
    </td>
  </tr>
  <tr>
    <td>

      <!--Ÿ��Ʋ�ڽ�-->
      <table width="830" border="0"  cellpadding="1" cellspacing="0">
        <tr>
          <td  height="27" bgcolor="#EBE9DC" class="title">���̱׷��̼� �̷�</td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--����-->
          </td>
        </tr>
      </table>

    </td>
  </tr>
  <tr>
    <td>

<%--
	<!-- ���̱׷��̼�  �̷� �� ���� ���� -->
	<table width="830" border="0" cellspacing="0" cellpadding="0" align="left">
		<tr>
		<td width="100">

		<!--����DB���ε� �۾��̷� �� ���� -->
		<table id="tab_0" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_tab(this.id, 4);set_workclsf('BU');hsty_search();;window.event.returnValue=false;" style="cursor:hand">
			<tr>
				<td background="/html/comm_img/tb3_01.gif" width=5 height=3 ></td>
				<td background="/html/comm_img/tb3_02.gif" height=3 ></td>
				<td background="/html/comm_img/tb3_03.gif" width=5 height=3 ></td>
			</tr>
			<tr>
				<td background="/html/comm_img/tb3_04.gif" height="17" style width="5"></td>
				<td background="/html/comm_img/tb3_05.gif" height="17" align="center">����DB���ε�</td>
				<td background="/html/comm_img/tb3_06.gif" height="17" style width="5"></td>
			</tr>
		</table>
		<!--����DB���ε� �۾��̷� �� �� -->

		</td>
		<td width="100">
		<!--����DB���ε� �۾��̷� �� ���� -->
		<table id="tab_1" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_tab(this.id, 4);set_workclsf('LU');hsty_search();;window.event.returnValue=false;" style="cursor:hand">
			<tr>
				<td background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
				<td background="/html/comm_img/tb4_02.gif" height=3 ></td>
				<td background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
			</tr>
			<tr>
				<td background="/html/comm_img/tb4_04.gif" height="17" style width="5"></td>
				<td background="/html/comm_img/tb4_05.gif" height="17" align="center" >����DB���ε�</td>
				<td background="/html/comm_img/tb4_06.gif" height="17" style width="5"></td>
			</tr>
		</table>
		<!--����DB���ε� �۾��̷� �� �� -->
		</td>
		<td width="100">

		<!--�����ڷ���ȯ �۾��̷� �� ���� -->
		<table id="tab_2" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_tab(this.id, 4);set_workclsf('BC');hsty_search();;window.event.returnValue=false;" style="cursor:hand">
			<tr>
				<td background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
				<td background="/html/comm_img/tb4_02.gif" height=3 ></td>
				<td background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
			</tr>
			<tr>
				<td background="/html/comm_img/tb4_04.gif" height="17" style width="5"></td>
				<td background="/html/comm_img/tb4_05.gif" height="17" align="center">�����ڷ���ȯ</td>
				<td background="/html/comm_img/tb4_06.gif" height="17" style width="5"></td>
			</tr>
		</table>
		<!--�����ڷ���ȯ �۾��̷� �� �� -->

		</td>
		<td width="100">

		<!--�����ڷ���ȯ �۾��̷� �� ���� -->
		<table id="tab_3" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_tab(this.id, 4);set_workclsf('LC');hsty_search();;window.event.returnValue=false;" style="cursor:hand">
			<tr>
				<td background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
				<td background="/html/comm_img/tb4_02.gif" height=3 ></td>
				<td background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
			</tr>
			<tr>
				<td background="/html/comm_img/tb4_04.gif" height="17" style width="5"></td>
				<td background="/html/comm_img/tb4_05.gif" height="17" align="center">�����ڷ���ȯ</td>
				<td background="/html/comm_img/tb4_06.gif" height="17" style width="5"></td>
			</tr>
		</table>
		<!--�����ڷ���ȯ �۾��̷� �� �� -->

		</td>
		<td width="430">
		</td>
--%>		

	<!-- ���̱׷��̼�  �̷� �� ���� ���� -->
	<table width="830" border="0" cellspacing="0" cellpadding="0" align="left">
		<tr>
		<td width="100">




		<!--����DB���ε� �۾��̷� �� ���� -->
		<table id="tab_0" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_tab(this.id, 2);set_workclsf('BU');hsty_search();;window.event.returnValue=false;" style="cursor:hand">
			<tr>
				<td background="/html/comm_img/tb3_01.gif" width=5 height=3 ></td>
				<td background="/html/comm_img/tb3_02.gif" height=3 ></td>
				<td background="/html/comm_img/tb3_03.gif" width=5 height=3 ></td>
			</tr>
			<tr>
				<td background="/html/comm_img/tb3_04.gif" height="17" style width="5"></td>
				<td background="/html/comm_img/tb3_05.gif" height="17" align="center">����DB���ε�</td>
				<td background="/html/comm_img/tb3_06.gif" height="17" style width="5"></td>
			</tr>
		</table>
		<!--����DB���ε� �۾��̷� �� �� -->

		</td>
		<td width="100">

		<!--�����ڷ���ȯ �۾��̷� �� ���� -->
		<table id="tab_1" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_tab(this.id, 2);set_workclsf('BC');hsty_search();;window.event.returnValue=false;" style="cursor:hand">
			<tr>
				<td background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
				<td background="/html/comm_img/tb4_02.gif" height=3 ></td>
				<td background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
			</tr>
			<tr>
				<td background="/html/comm_img/tb4_04.gif" height="17" style width="5"></td>
				<td background="/html/comm_img/tb4_05.gif" height="17" align="center">�����ڷ���ȯ</td>
				<td background="/html/comm_img/tb4_06.gif" height="17" style width="5"></td>
			</tr>
		</table>
		<!--�����ڷ���ȯ �۾��̷� �� �� -->
		</td>

		<td width="610">
		</td>




		</tr>
	</table>
	<!-- ���̱׷��̼� �̷� �� ���� �� -->

    </td>
  </tr>
  <tr>
    <td height="2">
      <!------����--- -->
    </td>
  </tr>
  <tr>
    <td>

	<!-- ���̱׷��̼� �̷� ��� ���� -->
    <table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="mig_hsty_id">
		<tr bgcolor="#dddddd" align="center">
			<td width="120" height="23" class="gray"> �����Ͻ� </td>
			<td width="120" height="23" class="gray"> �����Ͻ� </td>
			<td height="23" class="gray"> �۾��� </td>
			<td width="500" height="23" class="gray"> �۾���� </td>
		</tr>
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
	    <%for(int i=0; i<migListCount; i++){%>
	    <tr>
			<td width="120" height="23" class="gray"> &nbsp; </td>
			<td width="120" height="23" class="gray"> &nbsp; </td>
			<td height="23" class="gray"> &nbsp; </td>
			<td width="500" height="23" class="gray"> &nbsp; </td>
	    </tr>
	    <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
		<tr bgcolor="#dddddd" height="23">
			<td colspan="4" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
			</td>
		</tr> 
    </table>
	<!-- ���̱׷��̼� �̷� ��� �� -->

    </td>
  </tr>
  <tr>
    <td height="2">
      <!------����--- -->
    </td>
  </tr>
  <tr>
    <td>


    <!-- ������ �̵� -->
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_hsty">
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
                    <jsp:param name = "js_fn_nm" 	value="page_move_hsty"/>
                    <jsp:param name = "pagesize" 	value="<%= migListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!------����--- -->
    </td>
  </tr>
  <tr>
    <td>

      <!--Ÿ��Ʋ�ڽ�-->
      <table width="830" border="0"  cellpadding="1" cellspacing="0">
        <tr>
          <td  height="27" bgcolor="#EBE9DC" class="title">���̱׷��̼� ����</td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--����-->
          </td>
        </tr>
      </table>

    </td>
  </tr>
  <tr>
    <td>

	<!-- ���̱׷��̼� ���� ��� ���� -->
    <table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="mig_ptcr_id">
		<tr bgcolor="#dddddd" align="center" height="23">
			<td width="120" class="gray">�ð�(����/����)</td>
			<td width="140" class="gray">���̺�(�ҽ�/Ÿ��)</td>
			<td width="110" class="gray">������(����/��ȯ)</td>
			<td class="gray">����(�ڵ�/�޼���)</td>
		</tr>
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
	    <%for(int i=0; i<migListCount; i++){%>
		<tr align="center">
			<td width="120" class="gray">&nbsp;</td>
			<td width="140" class="gray">&nbsp;</td>
			<td width="110" class="gray">&nbsp;</td>
			<td rowspan="2" class="gray">&nbsp;</td>
		</tr>
		<tr align="center">
			<td width="120" class="gray">&nbsp;</td>
			<td width="140" class="gray">&nbsp;</td>
			<td width="110" class="gray">&nbsp;</td>
		</tr>
	    <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
		<tr bgcolor="#dddddd" height="23">
			<td colspan="4" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
			</td>
		</tr>    
    </table>
	<!-- ���̱׷��̼� ���� ��� �� -->

    </td>
  </tr>
  <tr>
    <td height="2">
      <!------����--- -->
    </td>
  </tr>
  <tr>
    <td>

    <!-- ������ �̵� -->
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_ptcr">
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
                    <jsp:param name = "js_fn_nm" 	value="page_move_ptcr"/>
                    <jsp:param name = "pagesize" 	value="<%= migListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->


    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<form name="mig_hsty_form" method="post" action="" style="display:none;">
    <input name="pageno" type="hidden" value ="1">			                <!-- ���� ������ ��ȣ -->
    <input name="pagesize" type="hidden" value ="<%= migListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
    <input name="js_fn_nm" type="hidden" value ="page_move_hsty">
	<input name="bocd" type="hidden" value ="">                    			<!-- �����ڵ� -->
	<input name="workclsf" type="hidden" value ="">                    		<!-- �۾����� -->
	<input name="workno" type="hidden" value ="">                    		<!-- �۾���ȣ -->
</form>

<form name="mig_ptcr_form" method="post" action="" style="display:none;">
    <input name="pageno" type="hidden" value ="1">			                <!-- ���� ������ ��ȣ -->
    <input name="pagesize" type="hidden" value ="<%= migListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
    <input name="js_fn_nm" type="hidden" value ="page_move_ptcr">
	<input name="bocd" type="hidden" value ="">                    			<!-- �����ڵ� -->
	<input name="workclsf" type="hidden" value ="">                    		<!-- �۾����� -->
	<input name="workno" type="hidden" value ="">                    		<!-- �۾���ȣ -->
</form>

</body>
</html>
