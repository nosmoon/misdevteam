<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1100_a.jsp
* ��� : �����濵-���ϸ�����Ȳ-�ʱ�ȭ��
* �ۼ����� : 2004-03-06
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
	SS_L_MIGLLMMTCLOS_INITDataSet ds = (SS_L_MIGLLMMTCLOS_INITDataSet)request.getAttribute("ds");
    int listCount = 10;		// �� ȭ��� ����Ʈ �׸� ��
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
	document.migllmmtclos_search_form.bonm.focus();
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
    var lo_form1 = document.migllmmtclos_search_form;

	if(lo_form1.basidt.value ==''){
        alert("����� �Է����ּ���.");
        lo_form1.basidt.focus();
        return;
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

	// ����ã�� ��� ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/brmgr/1110";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �󼼺���
function detail_view(bocd,frdt,todt){
    var lo_form1 = document.milgpay_list_form;

    // ���������ڵ带 "/ss/brmgr/1120" �������� ������
    lo_form1.bocd.value = bocd;
    lo_form1.frdt.value = frdt;
    lo_form1.todt.value = todt;
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ
    lo_form1.action = "/ss/brmgr/1120";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {

    var lo_form1 = document.migllmmtclos_search_form;

	if(lo_form1.basidt.value ==''){
        alert("����� �Է����ּ���.");
        lo_form1.basidt.focus();
        return;
	}

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    // "/ss/brmgr/1110" �������� ������
    lo_form1.action = "/ss/brmgr/1110";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�2
function page_move2(pageno) {

    var lo_form1 = document.milgpay_list_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    // "/ss/brmgr/1120" �������� ������
    lo_form1.action = "/ss/brmgr/1120";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���� �˻�
function area_search(){
    var lo_form1 = document.migllmmtclos_search_form;
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
    var lo_form1 = document.migllmmtclos_search_form;
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

    var lo_form1 = document.migllmmtclos_search_form;

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
		var lo_form2 = document.migllmmtclos_search_form;
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

    var lo_form1 = document.migllmmtclos_search_form;

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
    var lo_form1 = document.migllmmtclos_search_form;

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
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >�����濵
      &gt; </b> ���ϸ�����Ȳ</td>
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

	<!-- ���ϸ�����Ȳ �˻� ���� -->
	<table width="830" border="0" cellspacing="0" cellpadding="2">
	<form name="migllmmtclos_search_form" method="post" action="">
		<input type="hidden" name="pageno" value ="1">							<!-- ���� ������ ��ȣ -->
		<input type="hidden" name="pagesize" value ="<%= listCount%>">			<!-- �� ȭ��� ����Ʈ �׸� �� -->
		<input type="hidden" name="js_fn_nm" value ="page_move">
		<input type="hidden" name="common_deptcd" value ="">                    <!-- ���� �μ�(��)�ڵ� -->
		<input type="hidden" name="bocd" value ="">                         	<!-- ���������ڵ� -->
		<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->

		<tr>
			<td bgcolor="#EBE9DC" width="40" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;</td>
			<td bgcolor="#EBE9DC" width="80" class="title">
				<select name="deptcd" onChange="area_search();" class="sel_all">
<%
			    writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
		    	</select>
			</td>
			<td bgcolor="#EBE9DC" class="title" width="40""><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
			<td bgcolor="#EBE9DC" class="title" width="80"">
				<select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
<%
				writeAreaOpt(session, out, true);
%>
	        	</select>
          	</td>
			<td bgcolor="#EBE9DC" class="title" width="40"">
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
			</td>
			<td bgcolor="#EBE9DC" class="title" width="140"">
				<input name="bonm" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
				<input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--�����˻��˾�-->
				<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
			</td>
			<td bgcolor="#EBE9DC" class="title" width="40"">
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���
			</td>
			<td bgcolor="#EBE9DC" class="title" width="100">
				<input name="basidt" type="text" size="7" class="text_box" caption="���" value="<%= Util.getYyyyMm()%>" dataType="month">
			</td>
			<td bgcolor="#EBE9DC" class="title" align="right">
				<input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="8">
			<!--����-->
			</td>
		</tr>
	</form>
	</table>
	<!-- ���ϸ�����Ȳ �˻� �� -->

	<!-- ���ϸ�����Ȳ ��� ���� -->
	<table width="830" border="0" cellspacing="0"  cellpadding="1" class="gray" bgcolor="#FFFFFF" id="migllmmtclos_list_id">
	<form name="milgpay_list_form" method="post" action="">
		<input type="hidden" name="bocd" value="">
		<input type="hidden" name="frdt" value="">
		<input type="hidden" name="todt" value="">
		<input type="hidden" name="pageno" value ="1">					<!-- ���� ������ ��ȣ -->
		<input type="hidden" name="pagesize" value ="<%= listCount%>">	<!-- �� ȭ��� ����Ʈ �׸� �� -->
		<input type="hidden" name="js_fn_nm" value ="page_move2">

		<tr align="center" bgcolor="#dddddd" height="23">
			<td width="120" class="gray"> ��&nbsp; </td>
			<td width="120" class="gray"> ���� </td>
			<td width="120" class="gray"> ���� </td>
			<td class="gray"> ���ްǼ� </td>
			<td width="120" class="gray"> ��������Ʈ </td>
			<td width="120" class="gray"> ����д�� </td>
			<td width="120" class="gray"> �����д�� </td>
		</tr>
		<%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
		<%for(int j=0; j<listCount; j++){%>
		<tr>
			<td class="gray" width="120">&nbsp;</td>
			<td class="gray" width="120">&nbsp;</td>
			<td class="gray" width="120">&nbsp;</td>
			<td class="gray" align="right">&nbsp;</td>
			<td class="gray" width="120" align="right">&nbsp;</td>
			<td class="gray" width="120" align="right">&nbsp;</td>
			<td class="gray" width="120" align="right">&nbsp;</td>
		</tr>
		<%}%>
		<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
		<tr bgcolor="#dddddd">
			<td colspan="3" class="gray" align="center" height="23"> �� </td>
			<td class="gray" align="right">&nbsp;</td>
			<td class="gray" align="right">&nbsp;</td>
			<td class="gray" align="right">&nbsp;</td>
			<td class="gray" align="right">&nbsp;</td>
		</tr>
		<tr bgcolor="#dddddd" align="right">
			<td colspan="7" height="23" class="gray">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> �ѰǼ� �� </b>
			</td>
		</tr>
	</form>
	</table>
	<!-- ���ϸ�����Ȳ ��� �� -->

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
			<jsp:param name = "pageno" 			value="0"/>
			<jsp:param name = "totalcnt" 		value="0"/>
			<jsp:param name = "js_fn_nm" 		value="page_move"/>
			<jsp:param name = "pagesize" 		value="<%= listCount%>"/>
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
			<td  height="25" bgcolor="#EBE9DC" class="title">������Ȳ �󼼳���</td>
		</tr>
		<tr>
			<td height="3">
			<!--����-->
			</td>
		</tr>
	</table>

	<!-- ���ϸ�����Ȳ �� ���� -->
	<table width="830" border="0" cellspacing="0"  cellpadding="1" class="gray" bgcolor="#FFFFFF" id="milgpay_detail_id">
		<tr align="center" bgcolor="#dddddd" height="23">
			<td width="70" class="gray"> �������� </td>
			<td class="gray"> ���ڸ� </td>
			<td width="70" class="gray">��ü</td>
			<td width="50" class="gray">����Ʈ</td>
			<td width="100" class="gray">���ޱ���</td>
			<td width="100" class="gray">���ޱ���</td>
			<td width="50" class="gray">ȯ��</td>
			<td width="65" class="gray">�����</td>
			<td width="65" class="gray">����д�</td>
			<td width="65" class="gray">�����д�</td>
		</tr>
		<%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
		<%for(int j=0; j<listCount; j++){%>
		<tr>
			<td class="gray" width="70" align="center">&nbsp;</td>
			<td class="gray">&nbsp;</td>
			<td class="gray" width="70">&nbsp;</td>
			<td class="gray" width="50" align="right">&nbsp;</td>
			<td class="gray" width="100">&nbsp;</td>
			<td class="gray" width="100" align="center">&nbsp;</td>
			<td class="gray" width="50" align="right">&nbsp;</td>
			<td class="gray" width="65" align="right">&nbsp;</td>
			<td class="gray" width="65" align="right">&nbsp;</td>
			<td class="gray" width="65" align="right">&nbsp;</td>
		</tr>
		<%}%>
		<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
		<tr bgcolor="#dddddd" align="right">
			<td colspan="10" class="gray" height="23">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> �ѰǼ� �� </b>
			</td>
		</tr>
	</table>

	<!-- ������ �̵� -->
	<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move2">
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
			<jsp:param name = "js_fn_nm" 		value="page_move2"/>
			<jsp:param name = "pagesize" 		value="<%= listCount%>"/>
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
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
