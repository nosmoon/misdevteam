<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1240_a.jsp
* ��� : ��������-�Ź�������ǰ-���(�������)-�ʱ�ȭ��
* �ۼ����� : 2004-02-07
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
	String paramGbn = "##";
    applySession = true;	// ���� ���� ����
    int listCount = 10;		// ȭ��� �׸��
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
	document.cost_search_form.bonm.focus();
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

    var lo_form1 = document.cost_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>����</option>" +
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
    var lo_form1 = document.cost_search_form;
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

    var lo_form1 = document.cost_search_form;

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
		var lo_form2 = document.cost_search_form;
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
function list_search()
{
    var lo_form1 = document.cost_search_form;

    // ȭ������� ������ ���� �μ�(��),������ �ʼ��� ������ �� �˻��ϰ� �Ѵ�.
	if(lo_form1.deptcd.value == '' && lo_form1.bonm.value == ''){
		alert("���� �����ϼ���");
		return;
    }
/*
    if(lo_form1.areacd.value == ''){
		alert("������ �����ϼ���");
		return;
    }
*/
    if(!check_all(lo_form1)) return;			// �� ��ȿ�� üũ

    // Ȯ���û��� ��ȸ������ "/ss/brsup/1245" �������� ������
    lo_form1.action = "/ss/brsup/1245";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���
function cost_cancel(){
    var lo_form1 = document.cost_list_form;

	lo_form1.reset();
}

// ��� �󼼺���
function detail_view(basidt, deptcd, areacd, bocd){
	// �� ȭ�� ó���� ���� hidden ���� ����Ѵ�.
    var lo_form1 = document.detail_form;

    // �Ź�������ǰ��� ��������, �����ڵ带 "/ss/brsup/1250" �������� ������
    lo_form1.basidt.value = basidt;
    lo_form1.deptcd.value = deptcd;
    lo_form1.areacd.value = areacd;
    lo_form1.bocd.value = bocd;

    lo_form1.action = "/ss/brsup/1250";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����
function cost_save(){
    var lo_form1 = document.cost_list_form;

	if(lo_form1.clamt == null){					// ���ݾ� �Է��׸��� ���� ���
		return;
	}else if(lo_form1.clamt.type == "text"){	// ���ݾ� �Է��׸��� �� ���� ���
		// ���ݾ��� �Էµ��� ���� ���
		if(lo_form1.clamt.value == ''){
			return;
		}
		lo_form1.basidtary.value = lo_form1.basidt.value;
		lo_form1.deptcdary.value = lo_form1.deptcd.value;
		lo_form1.areacdary.value = lo_form1.areacd.value;
		lo_form1.bocdary.value = lo_form1.bocd.value;
		lo_form1.clamtary.value = lo_form1.clamt.value;
		lo_form1.rcpmpersnmary.value = lo_form1.rcpmpersnm.value;

	}else{										// ���ݾ� �Է��׸��� ���� ���� ���
	    // ��������, �μ�(��)�ڵ�, �����ڵ�, ���������ڵ�, ���ݾ�, �Ա��ڸ� �� ���ڿ� �������� �����.
		var ls_basidtary = "";
		var ls_deptcdary = "";
		var ls_areacdary = "";
		var ls_bocdary = "";
		var ls_clamtary = "";
		var ls_rcpmpersnmary = "";

	    for(var i=0; i<lo_form1.clamt.length; i++) {
	    	if(lo_form1.clamt[i].value == ''){	// ���ݾ��� ���� ���� skip �Ѵ�.
	    		continue;
	    	}

			ls_basidtary = ls_basidtary + lo_form1.basidt[i].value + "<%= paramGbn%>";
			ls_deptcdary = ls_deptcdary + lo_form1.deptcd[i].value + "<%= paramGbn%>";
			ls_areacdary = ls_areacdary + lo_form1.areacd[i].value + "<%= paramGbn%>";
			ls_bocdary = ls_bocdary + lo_form1.bocd[i].value + "<%= paramGbn%>";
			ls_clamtary = ls_clamtary + lo_form1.clamt[i].value + "<%= paramGbn%>";
			ls_rcpmpersnmary = ls_rcpmpersnmary + lo_form1.rcpmpersnm[i].value + "<%= paramGbn%>";
	    }
		lo_form1.basidtary.value = ls_basidtary.substring(0, ls_basidtary.length-2);
		lo_form1.deptcdary.value = ls_deptcdary.substring(0, ls_deptcdary.length-2);
		lo_form1.areacdary.value = ls_areacdary.substring(0, ls_areacdary.length-2);
		lo_form1.bocdary.value = ls_bocdary.substring(0, ls_bocdary.length-2);
		lo_form1.clamtary.value = ls_clamtary.substring(0, ls_clamtary.length-2);
		lo_form1.rcpmpersnmary.value = ls_rcpmpersnmary.substring(0, ls_rcpmpersnmary.length-2);
	}
    // ��������, �μ�(��)�ڵ�, �����ڵ�, ���������ڵ�, ���ݾ�, �Ա��ڸ� ���ڿ� ���������� "/ss/brsup/1255" �������� ������.
    lo_form1.action = "/ss/brsup/1255";
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

    var lo_form1 = document.cost_search_form;

	if(flag == '1'){			// �μ�(��),����,���� �ʱ�ȭ
		// �μ�(��) �ʱ�ȭ
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search();" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.curcommlistOptHtml(""), false); %>'
									+'</select>';
		// ���� �ʱ�ȭ
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" id="areacd_id" class="sel_all">'
									+'<% writeAreaOpt(session, out, false); %>'
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
    var lo_form1 = document.cost_search_form;

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
-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >��������
       </b>�Ź�������ǰ &gt; ��� </td>
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
      <!--�Ź�������ǰ ��� �˻� ���� ---------------------------------------------------------------------------->
      <table width="830" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" id="cost_search_id">
      <form name="cost_search_form" method="post" action="" >
        <input name="common_deptcd" type="hidden" value ="">                    <!-- ���� �μ�(��)�ڵ� -->
        <input name="bocd" type="hidden" value ="">                    			<!-- �����ڵ� -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
        <tr>
          <td bgcolor="#EBE9DC" width="40" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;</td>
          <td width="80" class="title">
            <select name="deptcd" onChange="area_search();" class="sel_all"><!-- �μ�(��)�ڵ�, �ڵ�� ��� -->
<%
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), false);
%>
            </select>
          </td>
          <td bgcolor="#EBE9DC" width="40" class="title"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
          <td width="80" class="title">
            <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--�����ڵ�, ������ ���-->
<%
					writeAreaOpt(session, out, false);
%>
            </select>
          </td>
          <td bgcolor="#EBE9DC" width="40" class="title">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
          <td bgcolor="#EBE9DC" width="180" class="title">
            <input name="bonm" type="text" style="ime-mode:active;" size="8" class="text_box" onkeydown="bo_enter_search();">
            <input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"><!--�����˻��˾�-->
            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
          </td>
          <td width="42" class="title">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���</td>
          <td width="64" class="title">
            <input name="basidt" type="text" size="7" class="text_box" caption="���" value="<%= Util.getYyyyMm()%>" dataType="month">
          </td>
          <td width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ϸ�</td>
          <td class="title">
            <select name="accflag" size="1" class="sel_all">
              <option value="" selected>��ü</option>
              <option value="Y">�ϳ�</option>
              <option value="N">�̳�</option>
            </select>
          </td>
          <td align="right" class="title">
            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"></td><!--��� ��ȸ-->
          </td>
        </tr>
	  </form>
      </table>
         <!--�Ź�������ǰ ��� �˻� �� ---------------------------------------------------------------------------->
    </td>
  </tr>
  <tr>
    <td height="3">
      <!------����--- -->
    </td>
  </tr>
  <tr>
    <td height="10">

	<!--Ÿ��Ʋ�ڽ�-->
	<table width="830" border="0"  cellpadding="1" cellspacing="0">
		<tr>
			<td  height="27" bgcolor="#EBE9DC" class="title">�Ź�������ǰ �����</td>
			<td  height="27" bgcolor="#EBE9DC" class="title" width="200" align="right">
				<input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:cost_save()">
            <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:cost_cancel()">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
			<!--����-->
			</td>
		</tr>
	</table>

    <!--�Ź�������ǰ ��� ��� ���� ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
    <form name="cost_list_form" method="post" action="" >
        <input name="basidtary" type="hidden" value ="">		<!--�������� ���� ���ڿ�-->
        <input name="deptcdary" type="hidden" value ="">		<!--�μ�(��)�ڵ� ���� ���ڿ�-->
        <input name="areacdary" type="hidden" value ="">		<!--�����ڵ� ���� ���ڿ�-->
        <input name="bocdary" type="hidden" value ="">			<!--���������ڵ� ���� ���ڿ�-->
        <input name="clamtary" type="hidden" value ="">			<!--���ݾ� ���� ���ڿ�-->
        <input name="rcpmpersnmary" type="hidden" value ="">	<!--�Ա��ڸ� ���� ���ڿ�-->

		<tr bgcolor="#dddddd" align="center" height="23">
			<td width="100" class="gray">��&nbsp;</td>
			<td width="100" class="gray">����</td>
			<td class="gray">����</td>
			<td width="90" class="gray">��ǰ���</td>
			<td width="90" class="gray">�Աݾ�</td>
			<td width="90" class="gray">�ܾ�</td>
			<td width="100" class="gray">�Ա���</td>
			<td width="100" class="gray">�ϳ�����</td>
		</tr>

        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
		<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td width="100" class="gray">&nbsp;</td>
			<td width="100" class="gray">&nbsp;</td>
			<td class="gray">&nbsp;</td>
			<td width="90" class="gray">&nbsp;</td>
			<td width="90" class="gray"><input name="text" type="text" size="10" class="text_box" value=""></td>
			<td width="90" class="gray">&nbsp;</td>
			<td width="100" class="gray"><input name="text" type="text" size="10" class="text_box" value=""></td>
			<td width="100" class="gray">&nbsp;</td>
		</tr>
		<%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
		<tr bgcolor="#dddddd" height="23">
			<td colspan="8" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
			</td>
		</tr>
    </form>
    </table>
    <!--�Ź�������ǰ ��� ��� �� ---------------------------------------------------------------------------->

	</td>
  </tr>
  <tr>
    <td height="10">
      <!------����--- -->
    </td>
  </tr>
  <tr>
	<td>
    <!--�Ź�������ǰ ��� �� ���� ---------------------------------------------------------------------------->
    <table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
	</table>
    <!--�Ź�������ǰ ��� �� �� ---------------------------------------------------------------------------->
  </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<!-- ���ȭ�鿡�� ��, ���� �� �̺�Ʈ�� �߻��ϰ� ���� ���������ڵ� ���� ����ϹǷ�, �� �̺�Ʈ�� ó���ϱ� ���� ������ ���� hidden���� �����.-->
<form name="detail_form" method="post" style="display:none">
    <input name="basidt" type="hidden" value ="">		<!--�������� -->
    <input name="deptcd" type="hidden" value ="">		<!--�μ�(��)�ڵ� -->
    <input name="areacd" type="hidden" value ="">		<!--�����ڵ� -->
    <input name="bocd" type="hidden" value ="">			<!--���������ڵ� -->
</form>

</body>
</html>
