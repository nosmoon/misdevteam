<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1500_a.jsp
* ��� : �����濵-�����������-�ʱ�ȭ��
* �ۼ����� : 2004-02-23
* �ۼ��� : �輺��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //	dataset �ν��Ͻ� ����κ�
	SS_L_FCT_FRFT_INITDataSet ds = (SS_L_FCT_FRFT_INITDataSet)request.getAttribute("ds");
    int fctListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.list_search_form.bonm.focus(); //�ʱ�ȭ���� �μ�(��) �ڵ� Focus
}
// form ������ ��ȿ���� ����
function check_all(form){
	if(!validate(form)) return false;
	else{
		makeValue(form);
		return true;
	}
}
// Form Elements�� �ʱ�ȭ
function clearFormElements(form){
	var c = form.elements;
	if(!c.length) return;

	for( var i = 0; i < c.length ; i++){
		c[i].value = "";
		if (c[i].type == 'checkbox') {
			c[i].checked = false;
		}
	}
}

// ���� �˻�
function area_search(flag){
    if(flag == '1'){        // �˻� �� ���� �˻�
	    var lo_form1 = document.list_search_form;
        if(lo_form1.deptcd.value == '') {
            var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                          "<option value='' selected>��ü</option>" +
                      "</select>"
            document.all.areacd_id.outerHTML = str;
            return;
        }

        // �μ�(��)�ڵ尪�� "/ss/common/1100" �������� ������
        lo_form1.action = "/ss/common/1100";
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
        lo_form1.target = "ifrm";
        lo_form1.submit();

    }else if(flag == '2'){  // �� �� ����������� ���� �˻�
	    var lo_form1 = document.detail_form;
        if(lo_form1.deptcd.value == '') {
            var str = "<select id=fct_frft_areacd_id name=\"areacd\" class=\"sel_all\">" +
                          "<option value='' selected>����</option>" +
                      "</select>"
            document.all.fct_frft_areacd_id.outerHTML = str;
            return;
        }

        // �μ�(��)�ڵ尪�� "/ss/common/1107" �������� ������
        lo_form1.action = "/ss/common/1107";
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
        lo_form1.target = "ifrm";
        lo_form1.submit();
   }
}

// ������ ����� ����Ʈ ��ȸ
function list_search() {
	var lo_form1 = document.list_search_form;

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';

	if(!check_all(lo_form1)) return;

    // �˻� ������ "/ss/brmgr/1510" �������� ������
	lo_form1.action = "/ss/brmgr/1510";
	lo_form1.target = "ifrm";
	lo_form1.submit();

}

// ����ã�� �˾�
// ����ã�Ⱑ 2���̹Ƿ� �Ű������� ���� ������ ó���Ѵ�.
function bo_search(no){
    if(no == '1'){				// �˻� �� �����˻�
	    var lo_form1 = document.list_search_form;
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
    }else if(no == '2'){			// �� �� �����˻�
	    var lo_form1 = document.detail_form;
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
            		'<select name="areacd" size="1" id="fct_frft_areacd_id" class="sel_all">' +
            		'<option value="' +
            		la_str[4] +
            		'" selected>' +
            		la_str[5] +
            		'</option>';
        }
    }
	return;
}

// �˻�/�� �� �˻� ���� ��������
var gs_no;

// ����Ű�� ���� ����ã��
function bo_enter_search(no){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    if(no == '1'){					// �˻� �� �����˻�
	    var lo_form1 = document.list_search_form;

	    //�������� �������� ������ �����˻��˾��� ����.
		if(lo_form1.bonm.value == ''){
			bo_search('1');
			return;
		}

    }else if(no == '2'){			// �� �� �����˻�
	    var lo_form1 = document.detail_form;

	    //�������� �������� ������ �����˻��˾��� ����.
		if(lo_form1.bonm.value == ''){
			bo_search('2');
			return;
		}
	}

	// ���������� �˻�/�� ���а� ����
	gs_no = no;

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
		// �˻� ��
		if(gs_no == '1'){
			var lo_form1 = ifrm.document.bo_detail_form;
			var lo_form2 = document.list_search_form;
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
		// �� ��
		}else if(gs_no == '2'){
			var lo_form1 = ifrm.document.bo_detail_form;
			var lo_form2 = document.detail_form;

			lo_form2.deptcd.value = lo_form1.deptcd.value;
	        lo_form2.areacd.outerHTML =
	        		'<select name="areacd" size="1" id="fct_frft_areacd_id" class="sel_all">' +
	        		'<option value="' +
	        		lo_form1.areacd.value +
	        		'" selected>' +
	        		lo_form1.areanm.value +
	        		'</option>';
			lo_form2.bocd.value = lo_form1.bocd.value;
			lo_form2.bonm.value = lo_form1.bonm.value;
		}

	// �˻������ ���ų� �������̹Ƿ� ����ã�� �˾��� ����.
	}else if(no == '2'){
		bo_search(gs_no);
	}
}

// �󼼺���
function detail_view(impndt, deptcd, areacd, bocd, viltresn){
    var lo_form1 = document.detail_form;

    // �ΰ�����, ���������ڵ�, �����ڵ带 "/ss/brmgr/1520" �������� ������
    lo_form1.impndt_pk.value = impndt;
    lo_form1.deptcd_pk.value = deptcd;
    lo_form1.areacd_pk.value = areacd;
    lo_form1.bocd.value = bocd;
    lo_form1.viltresn_pk.value = viltresn;

    lo_form1.action = "/ss/brmgr/1520";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {

    var lo_form1 = document.list_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // �˻� ������ "/ss/brmgr/1510" �������� ������
    lo_form1.action = "/ss/brmgr/1510";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���, ����, ����
function fct_frft_aceess(accflag1){

	var lo_form1 = document.detail_form;

	// �߰� ��ư
	if (accflag1 == 'I') {
		clearFormElements(lo_form1);

	    if(lo_form1.deptcd.value == '') {
	        var str = "<select id=fct_frft_areacd_id name=\"areacd\" class=\"sel_all\">" +
	                      "<option value='' selected>����</option>" +
	                  "</select>"
	        document.all.fct_frft_areacd_id.outerHTML = str;
	    }

		lo_form1.accflag.value = accflag1;
		document.all.cancel_id.disabled = true;	//��ҹ�ư ��Ȱ��ȭ
		return;
	// ����
	} else if (accflag1 == 'U') {
		// ���
		if (lo_form1.accflag.value == 'I') {
			if(!validate(lo_form1)) {
				return false;
			}

    		if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

			lo_form1.action = "/ss/brmgr/1530";
			lo_form1.target = "ifrm";
			lo_form1.submit();
		// ����
		} else if (isEmpty(lo_form1.accflag.value) || lo_form1.accflag.value == 'U') {
			if ( lo_form1.impndt.value.length == 0 || lo_form1.viltresn.value.length == 0 || lo_form1.bocd.value.length == 0 )
			{
				alert("������ ������ ����� ������ ������ �����Ͻʽÿ�");
				return false;
			}
			if(!validate(lo_form1)) {
				return false;
			}

    		if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

			lo_form1.accflag.value = accflag1;
			lo_form1.action = "/ss/brmgr/1540";
			lo_form1.target = "ifrm";
			lo_form1.submit();
		}
	// ����
	} else if (accflag1 == 'D') {
		if ( lo_form1.impndt.value.length == 0 || lo_form1.viltresn.value.length == 0 || lo_form1.bocd.value.length == 0 )
		{
			alert("������ ������ ����� ������ ������ �����Ͻʽÿ�");
			return false;
		}
    	if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

		lo_form1.accflag.value = accflag1;
		lo_form1.action = "/ss/brmgr/1550";
		lo_form1.target = "ifrm";
		lo_form1.submit();
	}
}

//��� ��ư
function reset_detail_view_form() {
	var lo_form1 = document.detail_form;
	lo_form1.reset();
	setEventHandler();						//�̺�Ʈ�ڵ鷯 ȣ��
}


// ��Ͽ��� ���õ� �ο� ��������
var go_sel_row;

// ���õ� �ο� ���� �ٲٱ�
function change_sel_row(obj){
	go_sel_row = obj;
	obj.style.backgroundColor='#BFD2DD';
	lo_table = obj.parentNode;
	for(i=1; i<lo_table.rows.length-2; i++){
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

    var lo_form1 = document.list_search_form;	// �˻� ��
    var lo_form2 = document.detail_form;		// �� ��

	if(flag == '1'){			// �˻� �μ�(��),����,���� �ʱ�ȭ
		// �μ�(��) �ʱ�ȭ
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search(\'1\');" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.deptlistOptHtml(""), true); %>'
									+'</select>';
		// ���� �ʱ�ȭ
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" class="sel_all" id="areacd_id">'
									+'<% writeAreaOpt(session, out, true); %>'
									+'</select>';
		// �����ڵ�,������ �ʱ�ȭ, ��Ŀ���̵�
		lo_form1.bocd.value = "";
		lo_form1.bonm.value = "";
		lo_form1.bonm.focus();
	}else if(flag == '2'){		// �� �μ�(��),����,���� �ʱ�ȭ
		// �μ�(��) �ʱ�ȭ
		lo_form2.deptcd.outerHTML =  '<select name="deptcd" size="1" class="sel_all" notEmpty caption="��" onChange="area_search(\'2\');">'
									+'<% writeDeptOpt(session, out, ds.deptlistOptHtml(""), false); %>'
									+'</select>';
		// ���� �ʱ�ȭ
		lo_form2.areacd.outerHTML =  '<select name="areacd" size="1" class="sel_all" notEmpty caption="����" id="fct_frft_areacd_id">'
									+'<% writeAreaOpt(session, out, false); %>'
									+'</select>';
		// �����ڵ�,������ �ʱ�ȭ, ��Ŀ���̵�
		lo_form2.bocd.value = "";
		lo_form2.bonm.value = "";
		lo_form2.bonm.focus();
	}else if(flag == '4'){		// �Ⱓ �ʱ�ȭ
	}else if(flag == '5'){		// ��Ÿ �ʱ�ȭ
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
    var lo_form1 = document.list_search_form;

	if(lo_form1.bonm.value == ''){
		lo_form1.bocd.value = '';
		list_search();
	}else{
		gs_no = '1';

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
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >�����濵
      &gt; </b> �����������</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
<tr><td>

<!--����������� �˻� ����-->
<table width="830" border="0" cellspacing="0" cellpadding="2">
<form name="list_search_form" method="post" action="">
	<input name="common_deptcd" type="hidden" value ="">                    <!-- ���� �μ�(��)�ڵ� -->
	<input name="bocd" type="hidden" value ="" maxlength="5" >
	<input name="pageno" type="hidden" value ="1">
	<input name="pagesize" type="hidden" value ="<%= fctListCount%>">
	<input name="js_fn_nm" type="hidden" value ="page_move">
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->

	<tr>
		<td bgcolor="#EBE9DC" width="40" class="sea_top">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;</td>
		<td bgcolor="#EBE9DC" width="80" class="sea_top">
			<select name="deptcd" size="1" class="sel_all" caption="��" onChange="area_search('1');">
<%
			writeDeptOpt(session, out, ds.deptlistOptHtml(""), true);
%>
			</select>
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="80">
			<select name="areacd" size="1" class="sel_all" id="areacd_id">
<%
				writeAreaOpt(session, out, true);
%>
			</select>
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="160">
			<input name="bonm" type="text" style="ime-mode:active;" size="8" class="text_box" onkeydown="bo_enter_search('1');">
			<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" style="cursor:hand" width="39" height="19" align="absmiddle" onclick="javascript:bo_search('1');window.event.returnValue=false;"><!--�����˻��˾�-->
			<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="60">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�ΰ��Ⱓ</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="180">
			<input name="frdt" type="text" size="10" class="text_box" dataType="date">
			-
			<input name="todt" type="text" size="10" class="text_box" dataType="date">
		</td>
		<td rowspan="2" bgcolor="#EBE9DC" class="sea_top" align="right">
			<input type="image" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"><!--��� ��ȸ-->
		</td>
	</tr>
	<tr>
		<td bgcolor="#EBE9DC" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
		<td colspan="3" bgcolor="#EBE9DC" align="left">
			<select name="viltresn" size="1" class="sel_all">
				<option value="" selected>��ü</option>
				<%= ds.viltresnlistOptHtml("") %>
			</select>
		</td>
		<td colspan="2" bgcolor="#EBE9DC">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���ڸ�
			<input name="rdrnm" type="text" style="ime-mode:active;" size="8" class="text_box">
		</td>
		<td colspan="2" bgcolor="#EBE9DC">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���ǰ��
			<select name="delbocom" class="sel_all">
				<option value="" selected>��ü</option>
				<%= ds.delbocomlistOptHtml("") %>
			</select>
		</td>
	</tr>
	<tr bgcolor="#927F5B">
		<td colspan="10" height="1">
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
<!--����������� �˻� ��-->

<!--����������� ��� ����-->
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="fct_frft_list">
	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray" width="65"> �ΰ����� </td>
		<td rowspan="2" class="gray" width="50"> ���� </td>
		<td rowspan="2" class="gray" width="85"> ������� </td>
		<td rowspan="2" class="gray" width="60"> ���ڸ� </td>
		<td rowspan="2" class="gray" width="60"> ���� </td>
		<td rowspan="2" class="gray" width="60"> ����ݾ� </td>
		<td height="17" colspan="3" class="gray"> ���� </td>
		<td colspan="3" class="gray"> ���� </td>
		<td rowspan="2" class="gray" width="60"> �����ݾ�&nbsp; </td>
	</tr>
	<tr align="center">
		<td  bgcolor="#dddddd" class="gray" width="65"> �Աݾ� </td>
		<td  bgcolor="#dddddd" class="gray" width="65"> �Ա����� </td>
		<td  bgcolor="#dddddd" class="gray" width="65"> �̳��ݾ� </td>
		<td  bgcolor="#dddddd" class="gray" width="65"> �Աݾ� </td>
		<td  bgcolor="#dddddd" class="gray" width="65"> �Ա����� </td>
		<td  bgcolor="#dddddd" class="gray" width="65"> �̳��ݾ� </td>
	</tr>

	<%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
	<%for(int i=0; i<fctListCount; i++){%>
	<tr>
		<td class="gray" align="center" width="65">&nbsp;</td>
		<td class="gray" width="50">&nbsp; </td>
		<td class="gray" width="85">&nbsp; </td>
		<td class="gray" width="60">&nbsp; </td>
		<td class="gray" align="center" width="60">&nbsp; </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
		<td class="gray" align="right" width="65">&nbsp; </td>
		<td class="gray" align="center" width="65">&nbsp; </td>
		<td class="gray" align="right" width="65">&nbsp; </td>
		<td class="gray" align="right" width="65">&nbsp; </td>
		<td class="gray" align="center" width="65">&nbsp; </td>
		<td class="gray" align="right" width="65">&nbsp; </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
	</tr>
    <%}%>
    <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>

	<tr bgcolor="#dddddd" height="23">
		<td colspan="5" align="center" class="gray"> �� </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
		<td class="gray" align="center" width="60"> - </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
		<td class="gray" align="center" width="60"> - </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
		<td class="gray" align="right" width="60">&nbsp; </td>
	</tr>
	<tr bgcolor="#dddddd" align="right">
	  	<td colspan="13" class="gray" height="23">
	  		<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>�ѰǼ� ��</b>
	   </td>
	</tr>
</table>
<!--����������� ��� ��-->

<!-- ������ �̵� -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
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
                <jsp:param name = "js_fn_nm" 	value="page_move"/>
                <jsp:param name = "pagesize" 	value="<%= fctListCount%>"/>
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
	<!--���� -->
</td>
</tr>
<td>


<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr>
    <td  height="25" bgcolor="#EBE9DC" class="title">����� �󼼳���</td>
  </tr>
  <tr>
    <td height="3">
      <!--����-->
    </td>
  </tr>
</table>

<!--����������� �� ����-->
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="fct_frft_detail">
<form name="detail_form" method="post" action="">
	<input type="hidden" name="common_deptcd" value ="">
	<input type="hidden" name="bocd" value ="" maxlength="5" >                   <!-- ���� �μ�(��)�ڵ� -->
	<input type="hidden" name="accflag" value ="I" maxlength="5" >
	<input type="hidden" name="impndt_pk" value="">
	<input type="hidden" name="deptcd_pk" value="">
	<input type="hidden" name="areacd_pk" value="">
	<input type="hidden" name="viltresn_pk" value="">

	<tr>
		<td bgcolor="#dddddd" class="gray" width="90">����
		</td>
		<td class="gray" width="250">��&nbsp;
			<select name="deptcd" size="1" class="sel_all" notEmpty caption="��" onChange="area_search('2');">
<%
			writeDeptOpt(session, out, ds.deptlistOptHtml(""), false);
%>
			</select>
			����
			<select name="areacd" size="1" class="sel_all" notEmpty caption="����" id="fct_frft_areacd_id">
<%
			writeAreaOpt(session, out, false);
%>
			</select>
		</td>
		<td class="gray" colspan="2">
			����
			<input name="bonm" type="text" notEmpty style="ime-mode:active;" size="8" class="text_box" onkeydown="bo_enter_search('2');">
			<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" style="cursor:hand" height="19" align="absmiddle" onclick="javascript:bo_search('2');window.event.returnValue=false;"><!--�����˻��˾�-->
			<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
		</td>
		<td bgcolor="#dddddd" class="gray" width="90">���ݰǼ�</td>
		<td class="gray">
			<input name="viltnoit" type="text" size="4" class="text_box"> ��
		</td>
	</tr>

	<tr>
		<td width="90" height="26" bgcolor="#dddddd" class="gray">�ΰ����� </td>
		<td class="gray" width="250">
			<input type="text" name="impndt" notEmpty caption="�ΰ�����" class="text_box" dataType="date">
		</td>
		<td width="90" bgcolor="#dddddd" class="gray">���ڸ� </td>
		<td colspan="3" class="gray">
			<input type="text" style="ime-mode:active;" name="rdrnm" caption="���ڸ�" class="text_box">
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="90">�ΰ��ݾ� </td>
		<td class="gray" width="250">
			<input type="text" name="frftimpnamt" class="text_box" caption="�ΰ��ݾ�" dataType="number" style="text-align:right" comma>
		</td>
		<td width="90" bgcolor="#dddddd" class="gray">�����ݾ� </td>
		<td colspan="3" class="gray">
			<input type="text" name="resamt" class="text_box" caption="�����ݾ�" dataType="number"  style="text-align:right" comma>
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="90">���ǰ�� </td>
		<td class="gray" width="250">
			<select name="delbocom" caption="���ǰ��" class="sel_all">
				<option value="" selected>����</option>
				<%= ds.delbocomlistOptHtml("") %>
			</select>
		</td>
		<td width="90" bgcolor="#dddddd" class="gray">�������</td>
		<td colspan="3" class="gray">
			<select name="viltresn" notEmpty  size="1" class="sel_all" caption="�������" >
				<option value="" selected>����</option>
				<%= ds.viltresnlistOptHtml("") %>
			</select>
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="90">�����Աݾ� </td>
		<td class="gray" width="250">
			<input type="text" caption="�����Աݾ�" class="text_box" dataType="number" name="hdqtrcpmamt" style="text-align:right" comma>
		</td>
		<td width="90" bgcolor="#dddddd" class="gray">�����Ա����� </td>
		<td class="gray">
			<input type="text" name="hdqtrcpmdt" dataType="date" caption="�����Ա�����" class="text_box">
		</td>
		<td width="90" bgcolor="#dddddd" class="gray">����̳��ݾ� </td>
		<td class="gray">
			<input type="text" name="hdqtun_pymtamt" class="text_box" caption="����̳��ݾ�" dataType="number" style="text-align:right" comma>
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="90">�����Աݾ� </td>
		<td class="gray" width="250">
			<input type="text" name="borcpmamt" class="text_box" caption="�����Աݾ�" dataType="number" style="text-align:right" comma>
		</td>
		<td width="90" bgcolor="#dddddd" class="gray">�����Ա����� </td>
		<td class="gray" width="200">
			<input type="text" name="borcpmdt" caption="�����Ա�����" dataType="date" class="text_box">
		</td>
		<td bgcolor="#dddddd" class="gray" width="90">�����̳��ݾ� </td>
		<td class="gray">
			<input type="text" name="boun_pymtamt" class="text_box" caption="�����̳��ݾ�" dataType="number" style="text-align:right" comma>
		</td>
	</tr>
</form>
</table>

<!--button -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
	<tr>
		<td align="center" height="2">
		<!--����-->
		</td>
	</tr>
	<tr>
		<td align="center" height="24" bgcolor="#E8E8E8">
			<input type="image" id="add_id" border="0" src="/html/comm_img/bu_new.gif" width="39" style="cursor:hand" height="19" align="absmiddle" border="0" onclick="javascript:fct_frft_aceess('I')">
			<input type="image" id="save_id" border="0" src="/html/comm_img/bu_save.gif" width="39" style="cursor:hand" height="19" align="absmiddle" border="0" onclick="fct_frft_aceess('U')">
			<input type="image" id="del_id" border="0" src="/html/comm_img/bu_del.gif" width="39" style="cursor:hand" height="19" align="absmiddle" border="0" onclick="javascript:fct_frft_aceess('D')">
			<input type="image" id="cancel_id" border="0" src="/html/comm_img/bu_cancel.gif" width="39" style="cursor:hand" height="19" align="absmiddle" border="0" onclick="reset_detail_view_form()">
		</td>
	</tr>
</table>

</td>
</tr>
</table>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
