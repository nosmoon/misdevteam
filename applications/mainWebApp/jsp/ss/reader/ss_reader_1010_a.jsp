<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1010_a.jsp
* ��� : ������Ȳ-��������-�����̷� �ʱ�ȭ��
* �ۼ����� : 2003-12-27
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
    int rdrhstyListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
	int hstyListCount = 5;		// �� ȭ��� ����Ʈ �׸� ��(�̷� ���)
    int subsHstyListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;		// ���� ���� ����
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--

// ������ �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
}


// form ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}


// ���� �˻�
function area_search(){

    var lo_form1 = document.rdrhsty_search_form;
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

// ����ã�� �˾�
function bo_search(){
    var lo_form1 = document.rdrhsty_search_form;
    var	deptcd = lo_form1.deptcd.value;
    var areacd = lo_form1.areacd.value;
    var bonm   = lo_form1.bonm.value;

	var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");
    var la_str;

    if(ls_return.indexOf("\n") != -1){
        la_str = ls_return.split("\n");
        lo_form1.bocd.value = la_str[0];
        lo_form1.bonm.value = la_str[1];
        lo_form1.deptcd.value = la_str[2];

        lo_form1.areacd.outerHTML =
        		'<select name="areacd" size="1" id="areacd_id" class="sel_all">' +
        		'<option value="' +
        		la_str[4] +
        		'" selected>' +
        		la_str[5] +
        		'</option>';
    }
	return;
}

// ����Ű�� ���� ����ã��
function bo_enter_search(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    var lo_form1 = document.rdrhsty_search_form;

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
		var lo_form2 = document.rdrhsty_search_form;
		
		lo_form2.deptcd.value = lo_form1.deptcd.value;
        lo_form2.areacd.outerHTML =
        		'<select name="areacd" size="1" id="areacd_id" class="sel_all">' +
        		'<option value="' +
        		lo_form1.areacd.value +
        		'" selected>' +
        		lo_form1.areanm.value +
        		'</option>';
		lo_form2.bocd.value = lo_form1.bocd.value;
		lo_form2.bonm.value = lo_form1.bonm.value;
	// �˻������ ���ų� �������̹Ƿ� ����ã�� �˾��� ����.
	}else if(no == '2'){
		bo_search();
	}
}

// ��Ϻ���
function rdrhsty_list_search(){
    var lo_form1 = document.rdrhsty_search_form;

    // ���ڹ�ȣ, �̸� �� �ϳ��� �˻��׸����� �ԷµǾ�� �Ѵ�.
    if(    (lo_form1.rdr_no.value 		== '')
    	&& (lo_form1.rdrnm.value 		== '') ){
    	alert("���ڹ�ȣ, �̸� �� ��� �ϳ��� �Է��ؾ� �մϴ�.");
		return;
    }

	// ���ڹ�ȣ�׸� 9�ڸ� �˻�
	if( (lo_form1.rdr_no.value != '') && (lo_form1.rdr_no.value.length != 9)){
		alert("���ڹ�ȣ�� 9�ڸ��Դϴ�.");
		return;
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';

	// �˻� �׸� ������ /ss/reader/1015 �������� ������.
    lo_form1.action = "/ss/reader/1015";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �󼼺���
function rdrhsty_detail_view(bocd, rdr_no){
    var lo_form1 = document.rdrhsty_list_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ���������ڵ�, ���ڹ�ȣ�� "/ss/reader/1020" �������� ������
	lo_form1.bocd.value = bocd;
    lo_form1.rdr_no.value = rdr_no;
    lo_form1.action = "/ss/reader/1020";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���� �� ����
function subs_detail_view(medicd){
    var lo_form1 = document.rdrhsty_list_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ���������ڵ�, ���ڹ�ȣ, ��ü�ڵ带 "/ss/reader/1025" �������� ������
    lo_form1.medicd.value = medicd;
    lo_form1.action = "/ss/reader/1025";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.rdrhsty_search_form;

    // ���ڹ�ȣ, �̸� �� �ϳ��� �˻��׸����� �ԷµǾ�� �Ѵ�.
    if(    (lo_form1.rdr_no.value 		== '')
    	&& (lo_form1.rdrnm.value 		== '') ){
    	alert("���ڹ�ȣ, �̸� �� ��� �ϳ��� �Է��ؾ� �մϴ�.");
		return;
    }

	// ���ڹ�ȣ�׸� 9�ڸ� �˻�
	if( (lo_form1.rdr_no.value != '') && (lo_form1.rdr_no.value.length != 9)){
		alert("���ڹ�ȣ�� 9�ڸ��Դϴ�.");
		return;
	}

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    // �����̷°˻� ��ȸ������ "/ss/reader/1015" �������� ������
    lo_form1.action = "/ss/reader/1015";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �����̷� ������ �̵�
function page_move_subs_hsty(pageno){
    var lo_form1 = document.hsty_list_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    // �����̷� ��ȸ������ "/ss/reader/1030" �������� ������
    lo_form1.action = "/ss/reader/1030";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �̻��̷� ������ �̵�
function page_move_clam_hsty(pageno){
    var lo_form1 = document.hsty_list_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    // �̻��̷� ��ȸ������ "/ss/reader/1040" �������� ������
    lo_form1.action = "/ss/reader/1040";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �޵��̷� ������ �̵�
function page_move_stop_hsty(pageno){
    var lo_form1 = document.hsty_list_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    // �޵��̷� ��ȸ������ "/ss/reader/1045" �������� ������
    lo_form1.action = "/ss/reader/1045";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �����̷� ��ȸ
function subs_hsty_search(){
    var lo_form1 = document.hsty_search_form;					// �̷� �˻� ��
    var lo_form2 = document.rdrhsty_list_form;                  // �̷� ��� ��
	
	// ������� ���������ڵ�,���ڹ�ȣ�� üũ�Ѵ�.
    if( lo_form2.bocd.value	== '' || lo_form2.rdr_no.value == '' ){
    	alert("������ȸ �� ���ڸ� �����ϼ���.");
		return;
    }

    // �Ⱓ�� �ʼ� �Է��׸��̴�.
    if( lo_form1.frdt.value	== '' || lo_form1.todt.value == '' ){
    	alert("�Ⱓ�� �Է��ϼ���.");
		return;
    }
    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ���������ڵ�, ���ڹ�ȣ, ��ü�ڵ带 "/ss/reader/1030" �������� ������
	lo_form1.bocd.value = lo_form2.bocd.value;
    lo_form1.rdr_no.value = lo_form2.rdr_no.value;
    lo_form1.action = "/ss/reader/1030";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �����̷� ��ȸ
// ������ ������ �̵� �Լ��� ����.
function clam_hsty_search(yymm){
    var lo_form1 = document.hsty_search_form;						// �̷� �˻� ��
    var lo_form2 = document.rdrhsty_list_form;						// �̷� ��� ��

	// ������� ���������ڵ�,���ڹ�ȣ�� üũ�Ѵ�.
    if( lo_form2.bocd.value	== '' || lo_form2.rdr_no.value == '' ){
    	alert("������ȸ �� ���ڸ� �����ϼ���.");
		return;
    }

    // ���س���� �ʱ�ȭ�Ѵ�.
	// ���� �����̷� ��ȸ�� �������� �������� �ʴ´�.
	// �����̷� ��� ��ȸ �� ����, ���� ��ȸ�� �������� �����̷� ��� ������ ��´�.
	if(yymm == 'prev'){				// ����
		lo_form1.basiyymm.value = lo_form1.prevyymm.value
	}else if(yymm == 'next'){		// ����
		lo_form1.basiyymm.value = lo_form1.nextyymm.value
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ���������ڵ�, ���ڹ�ȣ, ��ü�ڵ带 "/ss/reader/1035" �������� ������
	lo_form1.bocd.value = lo_form2.bocd.value;
    lo_form1.rdr_no.value = lo_form2.rdr_no.value;
    lo_form1.action = "/ss/reader/1035";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �̻��̷� ��ȸ
function movm_hsty_search(){
    var lo_form1 = document.hsty_search_form;						// �̷� �˻� ��
    var lo_form2 = document.rdrhsty_list_form;						// �̷� ��� ��

	// ������� ���������ڵ�,���ڹ�ȣ�� üũ�Ѵ�.
    if( lo_form2.bocd.value	== '' || lo_form2.rdr_no.value == '' ){
    	alert("������ȸ �� ���ڸ� �����ϼ���.");
		return;
    }

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ���������ڵ�, ���ڹ�ȣ, ��ü�ڵ带 "/ss/reader/1040" �������� ������
	lo_form1.bocd.value = lo_form2.bocd.value;
    lo_form1.rdr_no.value = lo_form2.rdr_no.value;
    lo_form1.action = "/ss/reader/1040";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �޵��̷� ��ȸ
function stop_hsty_search(){
    var lo_form1 = document.hsty_search_form;						// �̷� �˻� ��
    var lo_form2 = document.rdrhsty_list_form;						// �̷� ��� ��

	// ������� ���������ڵ�,���ڹ�ȣ�� üũ�Ѵ�.
    if( lo_form2.bocd.value	== '' || lo_form2.rdr_no.value == '' ){
    	alert("������ȸ �� ���ڸ� �����ϼ���.");
		return;
    }

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ���������ڵ�, ���ڹ�ȣ, ��ü�ڵ带 "/ss/reader/1045" �������� ������
	lo_form1.bocd.value = lo_form2.bocd.value;
    lo_form1.rdr_no.value = lo_form2.rdr_no.value;
    lo_form1.action = "/ss/reader/1045";
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
	for(i=1; i<lo_table.rows.length; i++){
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

    var lo_form1 = document.rdrhsty_search_form;
		
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

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="sea_top" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >������Ȳ
    &gt; </b> �������� &gt; �����̷� </td>
</tr>
<tr>
    <td height="10">
        <!--������ ���� ����-->
    </td>
</tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
    <tr>
        <td width="550" valign="top">

        <!--�����̷� �˻� ����-->
        <table width="550" border="0" cellspacing="0" cellpadding="2">
        <form name="rdrhsty_search_form" method="post" action="" >
            <input name="pageno" type="hidden" value ="1">			        		<!-- ���� ������ ��ȣ -->
            <input name="pagesize" type="hidden" value ="<%= rdrhstyListCount%>">	<!-- �� ȭ��� ����Ʈ �׸� �� -->
            <input name="js_fn_nm" type="hidden" value ="page_move">
            <input name="common_deptcd" type="hidden" value ="">                   	<!-- ���� �μ��ڵ� -->
            <input name="bocd" type="hidden" value ="">                    			<!-- �����ڵ� -->
        	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->

            <tr bgcolor="#EBE9DC">
                <td width="67" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�</td>
                <td width="80" class="sea_top">
                    <select name="deptcd" onChange="area_search();" class="sel_all">
<%						 
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true);
%>					
                    </select>
                </td>
                <td bgcolor="#EBE9DC" width="55" class="sea_top"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
                <td width="85" class="sea_top">
                    <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--�����ڵ�, ������ ���-->
<%
					writeAreaOpt(session, out, true);
%>                    
                    </select>
                </td>
                <td bgcolor="#EBE9DC" width="48" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
                <td width="130" class="sea_top">
                    <input name="bonm" type="text" size="8" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
                    <input type="image" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"><!--�����˻��˾�-->
                    <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�,����,���� �ʱ�ȭ-->
                </td>
                <td bgcolor="#EBE9DC" rowspan="2" align="right" class="sea_top">
                    <input type="image" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="javascript:rdrhsty_list_search();window.event.returnValue=false;"><!--��� ��ȸ-->
                </td>
            </tr>
            <tr bgcolor="#EBE9DC">
                <td width="67"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���ڹ�ȣ</td>
                <td width="80"><input name="rdr_no" type="text" size="10" class="text_box"></td>
                <td bgcolor="#EBE9DC" width="55"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���ڸ�</td>
                <td colspan="3"><input name="rdrnm" type="text" size="10" class="text_box"></td>
            </tr>
            <tr bgcolor="#927F5B">
                <td colspan="7" hight="1">
                <!--line-->
                </td>
            </tr>
            <tr>
                <td colspan="7" height="3">
                <!--����-->
                </td>
            </tr>
        </form>
        </table>
        <!--�����̷� �˻� ��-->

      	<!--�����̷� ��� ����-->
        <table width="550"  cellpadding="0" cellspacing="0" class="gray" bgcolor="#ffffff" id="rdrhsty_list_id">
		<form name="rdrhsty_list_form" method="post" action="" >
		    <input name="bocd" type="hidden" value ="">									<!--���������ڵ�-->
		    <input name="rdr_no" type="hidden" value ="">								<!--���ڹ�ȣ-->
		    <input name="medicd" type="hidden" value ="">								<!--��ü�ڵ�-->

            <tr bgcolor="#DDDDDD">
                <td class="gray" align="center" width="50" height="24"> ����</td>
                <td class="gray" align="center" width="70" height="24"> ���ڹ�ȣ</td>
                <td class="gray" align="center" width="60" height="24"> ���ڸ�</td>
                <td class="gray" align="center" width="100" height="24"> ��ȭ��ȣ</td>
                <td class="gray" align="center" width="240" height="24"> �ּ�</td>
                <td class="gray" align="center" width="30" height="24" width="30" > ����</td>
            </tr>

            <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
            <%for(int i=0; i<rdrhstyListCount; i++){%>
            <tr>
                <td class="gray" align="center" height="21">&nbsp;</td>
                <td class="gray" align="center" height="21">&nbsp;</td>
                <td class="gray" align="center" height="21">&nbsp;</td>
                <td class="gray" align="center" height="21">&nbsp;</td>
                <td class="gray" align="center" height="21">&nbsp;</td>
                <td class="gray" align="center" height="21" width="30">&nbsp;</td>
            </tr>
            <%}%>
            <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>

            <tr bgcolor="#E8E8E8" align="right">
                <td  height="25" class="gray" colspan="6">
                    <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�ѰǼ� <b> 0 ��</b>
                </td>
            </tr>
        </form>
      	<table>

        <!-- ������ �̵� -->
        <table width="550" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
            <tr>
                <td align="center" height="2">
                <!--����-->
                </td>
            </tr>
            <tr>
                <td align="center" height="24" bgcolor="#E8E8E8">
                <!--JSP PAGE START---------------------------------------------------------------------------------->
                <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                        <jsp:param name = "pageno" 	value="0"/>
                        <jsp:param name = "totalcnt" 	value="0"/>
                        <jsp:param name = "js_fn_nm" 	value="page_move"/>
                        <jsp:param name = "pagesize" 	value="<%= rdrhstyListCount%>"/>
                        <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
                </td>
            </tr>
        </table>
        <!-- ������ �̵� -->

      	<!--�����̷� ��� ��-->

        </td>
        <td width="280" valign="top">

      	<!--�����̷� �� ����-->
        <table width="280" border="0" cellspacing="0" cellpadding="0" bgcolor="#EBE9DC">
            <tr>
                <td class="title" height="23">���� �󼼳���</td>
            </tr>
            <tr>
            <tr>
                <td colspan="7" height="3">
                <!--����-->
                </td>
            </tr>
                <td bgcolor="#FFFFFF" valign="top">

                    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="gray" bgcolor="#FFFFFF"  id="rdr_detail_id">
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray"> ���ڹ�ȣ</td>
                            <td class="gray" width="70">&nbsp;</td>
                            <td class="gray" width="70" bgcolor="#DDDDDD">���ڸ�</td>
                            <td class="gray" width="70">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> ��ȭ��ȣ</td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td class="gray" width="70" bgcolor="#DDDDDD">�޴�����ȣ</td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> �̸���</td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> ���ϸ���</td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> �����ȣ</td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> �ּ�</td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> �ְ�����</td>
                            <td class="gray" width="70">&nbsp;</td>
                            <td class="gray" width="70" bgcolor="#DDDDDD">�ְű���</td>
                            <td class="gray" width="70">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70"> ����</td>
                            <td class="gray" width="70">&nbsp;</td>
                            <td class="gray" width="70" bgcolor="#DDDDDD">�������</td>
                            <td class="gray" width="70">&nbsp;</td>
                        </tr>
                        <tr>
                            <td bgcolor="#DDDDDD" class="gray" width="70">�������� </td>
                            <td class="gray" colspan="3">&nbsp;</td>
                        </tr>
                    </table>

                </td>
            </tr>
        </table>
        <!--�����̷� �� ��-->
        </td>
	<tr>
        <td width="550" valign="top">
		<!--����,����,�޵�,�̻� �̷� ��� ����-->
        <table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#EBE9DC">
            <tr>
                <td class="title" height="23" align="right">
				<!--����,����,�޵�,�̻� �̷� �˻� ����-->
				<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#EBE9DC" id="hsty_search_id">
				<form name="hsty_search_form" method="post" action="" >
                    <input name="pageno" type="hidden" value ="1">			        		<!-- ���� ������ ��ȣ -->
                    <input name="pagesize" type="hidden" value ="<%= hstyListCount%>">		<!-- �� ȭ��� ����Ʈ �׸� �� -->
                    <input name="bocd" type="hidden" value ="">								<!--���������ڵ�-->
                    <input name="rdr_no" type="hidden" value ="">							<!--���ڹ�ȣ-->
					<!-- ���� �̷� hidden �Ķ���� ���� -->
                    <input name="basiyymm" type="hidden" value ="">						<!-- ���� ���س�� -->
                    <input name="prevyymm" type="hidden" value ="">							<!-- ���� ��� -->
                    <input name="nextyymm" type="hidden" value ="">							<!-- ���� ��� -->
					<!-- ���� �̷� hidden �Ķ���� �� -->
					<tr>
						<td height="2"></td>
					</tr>
					<tr>
						<td>
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ
                            <input name="frdt" type="text" size="10" class="text_box" dataType="date">
							-
							<input name="todt" type="text" size="10" class="text_box" dataType="date">
                            &nbsp;&nbsp;
                            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ü
                            <select name="medicd" class="sel_all" id="hsty_search_medicd_id"><!--��ü�ڵ�-->
                                <option>���ڰ˻��� �����ϼ���.</option>
                            </select>
						</td>
					</tr>
					<tr>
						<td height="2"></td>
					</tr>
					<tr>
						<td>
                            <img src="/html/comm_img/bu_his01.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:subs_hsty_search()"><!--�����̷� ��ȸ-->
                            <img src="/html/comm_img/bu_his02.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:clam_hsty_search()"><!--�����̷� ��ȸ, �Ű������� �������� �ʴ´�.-->
                            <img src="/html/comm_img/bu_his03.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:movm_hsty_search()"><!--�̻��̷� ��ȸ-->
                            <img src="/html/comm_img/bu_his04.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:stop_hsty_search()"><!--�޵��̷� ��ȸ-->
                        </td>
					</tr>
					<tr>
						<td height="2"></td>
					</tr>
				</form>
				</table>
				<!--����,����,�޵�,�̻� �̷� �˻� ��-->
                </td>
            </tr>
                <td colspan="7" height="3">
                <!--����-->
                </td>
            </tr>
                <td bgcolor="#FFFFFF" valign="top">
                    <table width="550"  cellpadding="0" cellspacing="0" bgcolor="#ffffff" class="gray" id="hsty_list_id">
						<tr bgcolor="#dddddd" align="center">
							<td width="200" class="gray" height="23"> �����Ⱓ </td>
							<td width="100" class="gray" height="23"> ������ </td>
							<td width="150" class="gray" height="23"> ��ü�� </td>
							<td width="100" class="gray" height="23"> Ȯ������ </td>
						</tr>
	                    
	        			<%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
					    <%for(int i=0; i<subsHstyListCount; i++){%>
						<tr>
						    <td width="200" align="center" class="gray"> &nbsp; </td>
						    <td Width="100" class="gray"> &nbsp; </td>
						    <td width="150" class="gray"> &nbsp; </td>
						    <td width="100" class="gray"> &nbsp; </td>
						</tr>
						<%}%>
	        			<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
                    </table>

                    <!-- ������ �̵� -->
                    <table width="550" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_hsty">
                        <tr>
                            <td align="center" height="2">
                            <!--����-->
                            </td>
                        </tr>
                        <tr>
                            <td align="center" height="24" bgcolor="#E8E8E8">
                            <!--JSP PAGE START---------------------------------------------------------------------------------->
                            <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                                    <jsp:param name = "pageno" 	value="0"/>
                                    <jsp:param name = "totalcnt" 	value="0"/>
                                    <jsp:param name = "js_fn_nm" 	value="page_move"/>
                                    <jsp:param name = "pagesize" 	value="<%= hstyListCount%>"/>
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
		<!--����,����,�޵�,�̻� �̷� ��� ��-->
        </td>
        <td>
      	<!--���� �� ����-->
        <table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#EBE9DC">
            <tr>
                <td class="title" height="23">���� �󼼳���</td>
            </tr>
            <tr>
            <tr>
                <td colspan="7" height="3">
                <!--����-->
                </td>
            </tr>
                <td bgcolor="#FFFFFF" valign="top">
                    <table width="280" border="0" cellpadding="0" cellspacing="0"  align="top" class="gray" id="subs_detail_id">
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">��ü��</td>
                            <td bgcolor="#FFFFFF" class="gray" colspan="3">
                                <select name="select" class="sel_all">
                                	<option>���ڰ˻��� �����ϼ���.</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">�ܰ�</td>
                            <td bgcolor="#FFFFFF" class="gray" align="right" colspan="3">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">����μ�</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray" align="right">��</td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">�������μ�</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray" align="right">��</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">����μ�</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray" align="right"> ��</td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">���ᱸ��</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray" align="right">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">Ȯ������</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp; </td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">Ȯ������</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">Ȯ����</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp; </td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">Ȯ����</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">��������</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">���ݹ��</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">������</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">�б�</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="70" bgcolor="#DDDDDD" class="gray">��������</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                            <td width="70" bgcolor="#DDDDDD" class="gray">���˹�</td>
                            <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        <!--���� �� ��-->
        </td>
    </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
