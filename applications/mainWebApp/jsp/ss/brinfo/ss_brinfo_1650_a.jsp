<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brinfo_1650_a.jsp
* ��� 	 	 : ����info-SMS �ʱ�ȭ��
* �ۼ����� 	 : 2004-04-02
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //	dataset �ν��Ͻ� ����κ�
    chosun.ciis.ss.sls.common.ds.SS_L_NWBUSEOCDDataSet ds = (chosun.ciis.ss.sls.common.ds.SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");  // request dataset
    applySession = true;	// ���� ���� ����
%>
<html>
<head>
<script language="javascript">
<!--

// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.sms_search_form.bonm.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ���޻��� �󼼺���
function list_search() {
	var lo_form1 = document.sms_search_form;

	if(lo_form1.bocd.value == ''){
		alert("������ �˻��� �ּ���");
		return;
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	lo_form1.action = "/ss/brinfo/1660";
	lo_form1.target = "ifrm";
	lo_form1.submit();
}

// sms���� ����
/*
function sms_edit(){
	var lo_form1 = document.sms_form;

	if(lo_form1.smsset_check.checked) lo_form1.smsset.value="Y";
	if(lo_form1.emailset_check.checked) lo_form1.emailset.value="Y";

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	lo_form1.action = "/ss/brinfo/1670";
	lo_form1.target = "ifrm";
	lo_form1.method = "post";
	lo_form1.submit();
}
*/

// ���� �˻�
function area_search(){

    var lo_form1 = document.sms_search_form;
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
    var lo_form1 = document.sms_search_form;

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

    var lo_form1 = document.sms_search_form;

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
		var lo_form2 = document.sms_search_form;
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

// �˻� ���� �ʱ�ȭ
function set_default(flag){

    var lo_form1 = document.sms_search_form;

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
    var lo_form1 = document.sms_search_form;

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
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
</head>
<!--Body ����-------------------------------------------------------------------------------------------------->
<!--body bgcolor="#FFFFFF" topmargin=0 leftmargin=5-->
<body onload="jsInit();" bgcolor="#F8F7F7"  leftmargin="0" topmargin="0" class="scroll1">

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >����Info
      &gt; </b> �߼۳뼱 &gt; SMS </td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <form name="sms_search_form" method="post" action="" >
    <input name="common_deptcd" type="hidden" value ="">                    <!-- ���� �μ��ڵ� -->
    <input name="bocd" type="hidden" value ="">                         	<!-- ���������ڵ� -->
    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
	<tr>
		<td bgcolor="#EBE9DC" class="sea_top" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="80">
            <select name="deptcd" onChange="area_search();" class="sel_all"><!-- �μ��ڵ�, �ڵ�� ��� -->
	<%
				writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true);
	%>
            </select>
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="80">
            <select name="areacd" id="areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
	<%
				writeAreaOpt(session, out, true);
	%>
            </select>
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="180">
			<input name="bonm" type="text" style="ime-mode:active;" size="12" class="text_box" value=""  onkeydown="bo_enter_search();">
			<input type="image" src="/html/comm_img/bu_search02.gif" width="36" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--�����˻��˾�-->
			<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�,����,���� �ʱ�ȭ-->
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" align="right">
			<input type="image" onclick="set_request('L');bo_list_search();window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif">
		</td>
  </tr>
  <tr bgcolor="#927F5B">
	<td colspan="7" height="1">
		<!--line -->
	</td>
  </tr>
  <tr>
    <td height="4" colspan="4">
      <!--����-->
    </td>
  </tr>
  </form>
</table>
<!--�Է����̺� ����-------------------------------------------------------------------------------------------------->

<table bgcolor="#FFFFFF" width="830" height="25" border="0" cellpadding="1" cellspacing="0" class="gray" align="center">
<form name="sms_form" method="post" action="" >
	<input name="smsset" type="hidden" value="">
	<input name="emailset" type="hidden" value="">
	<tr>
		<td height="27" width="150" bgcolor="#dddddd" class="gray"><font class="gdt">&nbsp;&nbsp;SMS ���Ź�ȣ1</font></td>
		<td width="300" height="27" class="gray">&nbsp;&nbsp;<font class="cow"><input type="text" name="sms1" size="12" maxlength="11" align="absmiddle" value=""></font></td>
		<td width="400" height="27" colspan="2" class="gray"><font class="su">*</font><font class="su"> SMS ���Ź�ȣ�� '-' ���� �Է��Ͻʽÿ�.</font></td>
	</tr>
	</tr>
		<td height="27" width="150" bgcolor="#dddddd" class="gray"><font class="gdt">&nbsp;&nbsp;SMS ���Ź�ȣ2</font></td>
		<td width="300" height="27" class="gray">&nbsp;&nbsp;<font class="cow"><input type="text" name="sms2" size="12" maxlength="11" align="absmiddle" value=""></font></td>
		<td width="400" height="27" colspan="2" class="gray"><font class="su">*</font><font class="su"> SMS ���Ź�ȣ 1���̻� �Է½� ���� ���ŵ˴ϴ�.</font></td>
	</tr>
	<tr>
		<td height="27" width="150" bgcolor="#dddddd" class="gray"><font class="gdt">&nbsp;&nbsp;SMS ���Ź�ȣ3</font></td>
		<td width="260" height="27" class="gray">&nbsp;&nbsp;<font class="cow"><input type="text" name="sms3" size="12" maxlength="11" align="absmiddle" value=""></font></td>
		<td height="27" width="110" bgcolor="#dddddd" class="gray"><font class="gdt">&nbsp;&nbsp;E-MAIL</font></td>
		<td width="270" height="27" class="gray"><font class="cow">&nbsp;&nbsp;<input type="text" name="emailnm" size="30" maxlength="30" value=""></font></td>
	</tr>
	<tr>
		<td width="150" height="27" bgcolor="#dddddd" class="gray"><font class="gdt">&nbsp;&nbsp;SMS ���ż���</font></td>

  		<td width="300" height="27" class="gray">&nbsp;&nbsp;<font class="cow">
  			<input name="smsset_check" size="20" type="checkbox" value="Y">&nbsp;&nbsp;SMS �뺸
  			<input name="emailset_check" size="20" type="checkbox" value="Y">&nbsp;&nbsp;EMAIL �뺸</font>
  		</td>
		<td height="27" colspan="2" class="gray">&nbsp;</td>
	</tr>
</form>
</table>
	<!--button -->
	<%--
	<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
	  <tr>
	    <td align="center" height="2" bgcolor="#FFFFFF">
	      <!--����-->
	    </td>
	  </tr>
	  <tr>
	    <td align="center" height="24" bgcolor="#E8E8E8">
          	<input type="image" src="/html/comm_img/bu_save.gif" name="update_btn" value="" align="absmiddle"
          		onclick="sms_edit();window.event.returnValue=false;">
	    </td>
	  </tr>
	</table>
	--%>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="00" height="00"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
<!--Body ����-------------------------------------------------------------------------------------------------->
</html>
