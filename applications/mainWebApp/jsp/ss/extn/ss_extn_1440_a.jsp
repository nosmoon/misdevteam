<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1440_a.jsp
* ��� : Ȯ����Ȳ-Ȯ��������-���/��ȸ-�ʱ�ȭ��
* �ۼ����� : 2003-12-18
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
	document.sply_search_form.bonm.focus();
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

    var lo_form1 = document.sply_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>����</option>" +
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
    var lo_form1 = document.sply_search_form;
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

    var lo_form1 = document.sply_search_form;

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
		var lo_form2 = document.sply_search_form;
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
    var lo_form1 = document.sply_search_form;

    // ȭ������� ������ ���� �μ�,����, ���(��������)�� �ʼ��� ������ �� �˻��ϰ� �Ѵ�.
	if(lo_form1.deptcd.value == '' && lo_form1.bonm.value == ''){
		alert("�μ��� �����ϼ���");
		return;
    }
/*    
    if(lo_form1.areacd.value == ''){
		alert("������ �����ϼ���");
		return;
    }
*/  
    if(lo_form1.basidt.value == ''){
		alert("���(��������)�� �����ϼ���");
		return;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // Ȯ���û��� ��ȸ������ "/ss/extn/1445" �������� ������
    lo_form1.action = "/ss/extn/1445";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}


// ���
function sply_cancel(){
    var lo_form1 = document.sply_list_form;

	lo_form1.reset();
}

// ����
function sply_save(){
	var lb_submit = false;						// SUBMIT ���� ����
    var lo_form1 = document.sply_list_form;
    
    if(!check_all(lo_form1)) return;			// �� ��ȿ�� üũ

	if(lo_form1.payqty == null){				// �Է��׸��� ���� ���
		return;
	}else if(lo_form1.payqty.type == "text"){	// �Է��׸��� �Ѱ��� �ܿ�
		var ls_temp;
		lo_form1.basidtary.value = lo_form1.basidt.value;
		lo_form1.bocdary.value = lo_form1.bocd.value;
		lo_form1.payqtyary.value = lo_form1.payqty.value;
		lo_form1.uprcary.value = lo_form1.uprc.value;
		lo_form1.splyamtary.value = lo_form1.splyamt.value;
	}else{										// �Է��׸��� �������� ���

	    // ���޺μ�, ����ܰ�, �����ݾ�, ���������ڵ�, ���ÿ��θ� ���ڿ� �������� �����.
		var ls_basidtary = "";
		var ls_bocdary = "";
		var ls_payqtyary = "";
	  	var ls_uprcary	= "";
	  	var ls_splyamtary = "";
	
	    for(var i=0; i<lo_form1.payqty.length; i++) {
	    	// ��� �Է��׸��� ����ִ� ���� SKIP �Ѵ�.
	    	if( (lo_form1.payqty[i].value == '') && (lo_form1.uprc[i].value == '') && (lo_form1.splyamt[i].value == '') ){
	    		continue;
	    	}
	    	// ��� �Է��׸��� 0�� ���� SKIP �Ѵ�.
	    	if( (lo_form1.payqty[i].value == 0) && (lo_form1.uprc[i].value == 0) && (lo_form1.splyamt[i].value == 0) ){
	    		continue;
	    	}
	    	// ��� �Է��׸��� 0�� ���� SKIP �Ѵ�.
	    	if( (lo_form1.payqty[i].value == '0') && (lo_form1.uprc[i].value == '0') && (lo_form1.splyamt[i].value == '0') ){
	    		continue;
	    	}
	

	    	// ���޺μ� �׸� üũ
	    	if(lo_form1.payqty[i] == '' ){
	    		alert("���޺μ��� �Է��ϼ���");
	    		return;
	    	}
	    	// ����ܰ� �׸� üũ
	    	if(lo_form1.uprc[i] == '' ){
	    		alert("����ܰ��� �Է��ϼ���");
	    		return;
	    	}
	    	// �����ݾ� �׸� üũ
	    	if( lo_form1.splyamt[i] == '' ){
	    		alert("�����ݾ��� �Է��ϼ���");
	    		return;
	    	}
	    	
			// �� �׸��̶� �Էµ� �׸��� ������ SUBMIT �Ѵ�.
			lb_submit = true;

			ls_basidtary = ls_basidtary + lo_form1.basidt[i].value + "<%= paramGbn%>";
			ls_bocdary = ls_bocdary + lo_form1.bocd[i].value + "<%= paramGbn%>";
			ls_payqtyary = ls_payqtyary + lo_form1.payqty[i].value + "<%= paramGbn%>";
			ls_uprcary = ls_uprcary + lo_form1.uprc[i].value + "<%= paramGbn%>";
			ls_splyamtary = ls_splyamtary + lo_form1.splyamt[i].value + "<%= paramGbn%>";
	    }
		lo_form1.basidtary.value = ls_basidtary.substring(0, ls_basidtary.length-2);
		lo_form1.bocdary.value = ls_bocdary.substring(0, ls_bocdary.length-2);
		lo_form1.payqtyary.value = ls_payqtyary.substring(0, ls_payqtyary.length-2);
		lo_form1.uprcary.value = ls_uprcary.substring(0, ls_uprcary.length-2);
		lo_form1.splyamtary.value = ls_splyamtary.substring(0, ls_splyamtary.length-2);
	}

	// SUBMIT ������ Ȯ���Ͽ� ��û�� ������.
	if(lb_submit){
        // ���޺μ�, ����ܰ�, �����ݾ��� ���ڿ� ���� ������ "/ss/extn/1450" �������� ������.
        lo_form1.action = "/ss/extn/1450";
        lo_form1.target = "ifrm";
        lo_form1.submit();
	}else{
		alert("������ �׸��� �����ϴ�.");
		return;
	}
}

// �ڵ� �Է�
function set_auto_input(){
    var lo_form1 = document.sply_list_form;
	var ls_val	= deleteCommaStr(document.dummy.auto_input.value);
	
	if(lo_form1.uprc == null){					// ����ܰ��� ���� ���
		alert("�Է��׸��� �����ϴ�.");
		return;
	}else if(lo_form1.uprc.type == "text"){		// ����ܰ��� �� ���� ���
    	if(lo_form1.payqty.value == ''){
			alert("���޺μ��� �Է��ϼ���.");
			return;
    	}
        lo_form1.uprc.value = ls_val;        
        lo_form1.splyamt.value = (eval(ls_val)*eval(deleteCommaStr(lo_form1.payqty.value)))+'';
	}else{										// ����ܰ��� ���� ���� ���
	    for(var i=0; i<lo_form1.uprc.length; i++) {
	    	// ��� �ο� �� ���޺μ��� ���� �ִ� �ο��� �ܰ� �׸��� ���� �ڵ��Է�â�� �ִ� ������ ä���.
	    	if(lo_form1.payqty[i].value == ''){
	    		continue;
	    	}
	    	if(lo_form1.payqty[i].value == '0'){
	    		continue;
	    	}
	    	if(lo_form1.payqty[i].value == 0){
	    		continue;
	    	}
	    	
	        lo_form1.uprc[i].value = ls_val;	        
        	lo_form1.splyamt[i].value = (eval(ls_val)*eval(deleteCommaStr(lo_form1.payqty[i].value)))+'';
	    }
	}
    setEventHandler();
	
}

// �˻� ���� �ʱ�ȭ
function set_default(flag){

    var lo_form1 = document.sply_search_form;
		
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
    var lo_form1 = document.sply_search_form;

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

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >Ȯ����Ȳ >
		</b>Ȯ�������� &gt; ���</td>
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

	<!--Ȯ������ ��� �˻� ���� ---------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="0" class="title1" bgcolor="#EBE9DC">
	<form name="sply_search_form" method="post" action="" >
		<input name="common_deptcd" type="hidden" value ="">                    <!-- ���� �μ��ڵ� -->
        <input name="bocd" type="hidden" value ="">                    			<!-- �����ڵ� -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
		<tr>
			<td bgcolor="#D2C69B" height="30" width="230">
				<input type="checkbox" name="boextn" value="Y" checked>����
				<input type="checkbox" name="movm" value="Y" checked>�̻�
				<input type="checkbox" name="empextn" value="Y" checked>���
				<input type="checkbox" name="exgextn" value="Y" checked>ǰ����
			</td>
			<td height="30"><!--������ ���� �̹���--><img src="/html/comm_img/search4.gif" width="13" height="30"></td>
			<td bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�</td>
			<td width="80">
	            <select name="deptcd" onChange="area_search();" class="sel_all"><!-- �μ��ڵ�, �ڵ�� ��� -->
<%						 
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), false);
%>	
	            </select>
			</td>
			<td bgcolor="#EBE9DC" width="40"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
			<td width="80">
	            <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--�����ڵ�, ������ ���-->
<%
					writeAreaOpt(session, out, false);
%>                    
	            </select>
			</td>
			<td bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
			<td bgcolor="#EBE9DC" width="160">
            	<input name="bonm" type="text" style="ime-mode:active;" size="8" class="text_box"  onkeydown="bo_enter_search();">
            	<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"><!--�����˻��˾�-->
            	<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�,����,���� �ʱ�ȭ-->
            </td>
			<td bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���</td>
			<td bgcolor="#EBE9DC" width="60">
	            <input name="basidt" type="text" size="7" class="text_box" caption="���" value="<%= Util.getYyyyMm()%>" dataType="month">
	        </td>
	        <td align="right">
            	<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"></td><!--��� ��ȸ-->
			</td>
		</tr>
    </form>
	</table>
	<!--Ȯ������ ��� �˻� �� ---------------------------------------------------------------------------->

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
	<form name="dummy">
		<tr>
			<td  height="27" bgcolor="#EBE9DC" class="title">Ȯ�������� ���</td>
			<td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="300">
				<input name="auto_input" type="text" size="8" class="text_box" value="" dataType="integer" comma style="text-align:right">
				<input type="image" id="auto_input_id" src="/html/comm_img/bu_input.gif" align="absmiddle" border="0" onclick="set_auto_input();window.event.returnValue=false;">
				<input type="image" id="save_id"" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="sply_save();window.event.returnValue=false;">
				<input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" align="absmiddle" border="0" onclick="sply_cancel();window.event.returnValue=false;">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
				<!--����-->
			</td>
		</tr>
	</form>		
	</table>

    <!--Ȯ������ ��� ��� ���� ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="sply_list_id">
    <form name="sply_list_form" method="post" action="" >
        <input name="basidt" type="hidden" value ="">
        <input name="bocd" type="hidden" value ="">
        <input name="basidtary" type="hidden" value ="">
        <input name="bocdary" type="hidden" value ="">
        <input name="payqtyary" type="hidden" value ="">
        <input name="uprcary" type="hidden" value ="">
        <input name="splyamtary" type="hidden" value ="">

		<tr bgcolor="#dddddd" align="center">
			<td rowspan="2" class="gray">����</td>
			<td width="45" rowspan="2" class="gray">�ǵ���</td>
			<td width="45" rowspan="2" class="gray">����</td>
			<td width="45" rowspan="2" class="gray">�̻�</td>
			<td width="45" rowspan="2" class="gray">���</td>
			<td width="45" rowspan="2" class="gray">ǰ����</td>
			<td width="45" rowspan="2" class="gray">��</td>
			<td colspan="6" class="gray">�ְ�����</td>
			<td width="55" rowspan="2" class="gray" bgcolor="#dddddd">���޺μ�</td>
			<td width="55" rowspan="2" class="gray">����ܰ�</td>
			<td width="60" rowspan="2" class="gray">�����ݾ�</td>
		</tr>
		<tr bgcolor="#dddddd" align="center">
			<td width="40" class="gray">APT</td>
			<td width="40" class="gray">����</td>
			<td width="40" class="gray">����</td>
			<td width="40" class="gray">�繫��</td>
			<td width="40" class="gray">��</td>
			<td width="40" class="gray">��Ÿ</td>
		</tr>
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>		
		<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td class="gray" align="left">&nbsp;</td>
			<td width="45" class="gray" align="left">&nbsp;</td>
			<td width="45" class="gray" align="right">&nbsp;</td>
			<td width="45" class="gray" align="right">&nbsp;</td>
			<td width="45" class="gray" align="right">&nbsp;</td>
			<td width="45" class="gray" align="right">&nbsp;</td>
			<td width="45" class="gray" align="right">&nbsp;</td>
			<td width="40" class="gray" align="right">&nbsp;</td>
			<td width="40" class="gray" align="right">&nbsp;</td>
			<td width="40" class="gray" align="right">&nbsp;</td>
			<td width="40" class="gray" align="right">&nbsp;</td>
			<td width="40" class="gray" align="right">&nbsp;</td>
			<td width="40" class="gray" align="right">&nbsp;</td>
			<td width="55" class="gray" align="center"><input name="text" type="text" size="7" class="text_box"></td>
			<td width="55" class="gray" align="center"><input name="text" type="text" size="7" class="text_box"></td>
			<td width="60" class="gray" align="center"><input name="text" type="text" size="8" class="text_box"></td>
		</tr>
		<%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
        
		<tr bgcolor="#dddddd">
			<td colspan="16" class="gray" height="23">
				<div align="right">
					<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �������ݾ� �� </b>&nbsp;&nbsp;&nbsp;					
					<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
				</div>
			</td>
		</tr>

    </form>
    </table>
    <!--Ȯ������ ��� ��� �� ---------------------------------------------------------------------------->

	</td>
  </tr>
  <tr>
    <td height="10">
      <!------����--- -->
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
