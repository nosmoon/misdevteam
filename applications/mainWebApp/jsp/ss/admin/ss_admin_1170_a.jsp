<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1170_a.jsp
* ��� : ������-���̱׷��̼�-��Ȳ-�ʱ�ȭ��
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
	String paramGbn = "##";
    applySession = true;	// ���� ���� ����
    int listCount = 10;		// ȭ�� �� �׸��
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

    // �μ�(��)�ڵ尪�� "/ss/common/1100" �������� ������
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

	if(lo_form1.deptcd.value == '' && lo_form1.bonm.value == ''){
		alert("���� �����ϼ���.");
		return;
	}
/*
	if(lo_form1.areacd.value == ''){
		alert("������ �����ϼ���.");
		return;
	}
*/
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// ��� �˻������� "/ss/admin/1175" �������� ������.
    lo_form1.action = "/ss/admin/1175";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ��ü����, ���
function check_all_chk(bool){
    var lo_form1 = document.mig_list_form;

    if(lo_form1.endcnfmyn==null) {						// ���õ� ���� ���� ���
        return;
    } else if(lo_form1.endcnfmyn.type=="checkbox") {	// �Ѱ��� ���
        lo_form1.endcnfmyn.checked = bool;
    } else {											// �������� ���
        for(var i=0; i<lo_form1.endcnfmyn.length; i++) {
            lo_form1.endcnfmyn[i].checked = bool;
        }
    }
}

// ���
function mig_cancel(){
    var lo_form1 = document.mig_list_form;

	lo_form1.reset();
}


// ����
function mig_save(){
    var lo_form1 = document.mig_list_form;
	if(lo_form1.endcnfmyn == null){						// üũ�ڽ��� ���� ��
		return;
	}else if(lo_form1.endcnfmyn.type == "checkbox"){	// üũ�ڽ��� �Ѱ� �϶�
        lo_form1.bocdary.value = lo_form1.bocd.value;
        if(lo_form1.endcnfmyn.checked){
            lo_form1.checkedary.value = "Y";
        }else{
            lo_form1.checkedary.value = "N";
        }
	}else{												// üũ�ڽ��� ���� ���϶�
	    // ���������ڵ�, ���ÿ��θ� ���ڿ� �������� �����.
		var ls_bocdary = "";
		var	ls_checkedary = "";
	    for(var i=0; i<lo_form1.endcnfmyn.length; i++) {

			ls_bocdary = ls_bocdary + lo_form1.bocd[i].value + "<%= paramGbn%>";

	        if(lo_form1.endcnfmyn[i].checked){
			    ls_checkedary = ls_checkedary + "Y" + "<%= paramGbn%>";
	        }else{
			    ls_checkedary = ls_checkedary + "N" + "<%= paramGbn%>";
	        }
	    }
		lo_form1.bocdary.value = ls_bocdary.substring(0, ls_bocdary.length-2);
		lo_form1.checkedary.value = ls_checkedary.substring(0, ls_checkedary.length-2);
    }

    // ���������ڵ�, ���ÿ��θ� ���ڿ� ������ "/ss/admin/1180" �������� ������.
    lo_form1.action = "/ss/admin/1180";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �˻� ���� �ʱ�ȭ
function set_default(flag){

    var lo_form1 = document.mig_search_form;

	if(flag == '1'){			// �μ�(��),����,���� �ʱ�ȭ
		// �μ�(��) �ʱ�ȭ
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

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >������
		> </b>�۾� &gt; ���̱׷��̼� ��Ȳ</td>
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

	<!--���̱׷��̼� ��Ȳ �˻� ���� ---------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
	<form name="mig_search_form" method="post" action="" >
		<input name="common_deptcd" type="hidden" value ="">                    	<!-- ���� �μ�(��)�ڵ� -->
		<input name="bocd" type="hidden" value ="">                    				<!-- �����ڵ� -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   	<!-- ���� ���� ���� -->
		<tr>
			<td bgcolor="#EBE9DC" width="135" >
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;
	            <select name="deptcd" onChange="area_search('1');" class="sel_all">	<!-- �μ�(��)�ڵ�, �ڵ�� ��� -->
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
			<td width="220">
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
				<input name="bonm" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
            	<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;" border="0"><!--�����˻��˾�-->
            	<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
			</td>
			</td>
			<td width="160">
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ϸ�
	            <select name="endcnfmyn" size="1" class="sel_all"><!--�ϷῩ��-->
	            	<option value="" selected>��ü</option>
	            	<option value="Y">�Ϸ�</option>
	            	<option value="N">�̿Ϸ�</option>
	            </select>
			</td>
			<td bgcolor="#EBE9DC" align="right">
				<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;" border="0" >
			</td>
		</tr>
	</form>
	</table>
	<!--���̱׷��̼� ��Ȳ �˻� �� ---------------------------------------------------------------------------->

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
			<td  height="27" bgcolor="#EBE9DC" class="title">���̱׷��̼� ��Ȳ ���</td>
			<td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="240">
				<input type="image" id="ckeck_all_chk_true_id" src="/html/comm_img/bu_all01.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(true)">
				<input type="image" id="ckeck_all_chk_false_id" src="/html/comm_img/bu_all02.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(false)">
				<input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:mig_cancel()">
				<input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:mig_save()">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
			<!--����-->
			</td>
		</tr>
	</table>

    <!--���̱׷��̼� ��Ȳ ��� ���� ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="mig_list_id">
	<form name="mig_list_form" method="post" action="" >
		<input name="bocdary" type="hidden" value ="">                    				<!-- �����ڵ� -->
        <input name="checkedary" type="hidden" value ="">

		<tr bgcolor="#dddddd" align="center">
			<td width="90" rowspan="2" height="23" class="gray" align="center"> ��&nbsp; </td>
			<td width="90" rowspan="2" height="23" class="gray" align="center"> ���� </td>
			<td width="100" rowspan="2" height="23" class="gray" align="center"> ���� </td>
			<td width="240" colspan="2" height="23" class="gray" align="center"> DB���ε� </td>
			<td width="240" colspan="2" height="23" class="gray" align="center"> DB��ȯ </td>
			<td rowspan="2" height="23" class="gray" align="center"> �Ϸ� </td>
		</tr>
		<tr bgcolor="#dddddd" align="center">
			<td width="120" height="23" class="gray" align="center"> �������� </td>
			<td width="120" height="23" class="gray" align="center"> �������� </td>
			<td width="120" height="23" class="gray" align="center"> �������� </td>
			<td width="120" height="23" class="gray" align="center"> �������� </td>
		</tr>

        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
		<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td width="90" class="gray" align="center">&nbsp; </td>
			<td width="90" class="gray" align="center">&nbsp; </td>
			<td width="100" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td class="gray" align="center"><input type="checkbox" name="checkbox">&nbsp;</td>
		</tr>
		<%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>

		<tr bgcolor="#dddddd" height="23">
			<td colspan="8" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� ��</b>
			</td>
		</tr>
	</form>
    </table>
    <!--���̱׷��̼� ��Ȳ ��� �� ---------------------------------------------------------------------------->

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
