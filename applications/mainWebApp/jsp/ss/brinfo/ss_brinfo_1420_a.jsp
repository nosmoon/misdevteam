<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1420_a.jsp
* ��� : ����Info-������ǰ��Ȳ-��-�ʱ�ȭ��
* �ۼ����� : 2004-01-26
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%--
	1. ������ǰ��Ȳ-��Ȳȭ���� ��Ͽ��� ��ȭ������ �б��ϴ� ��쵵 ó���ϱ� ���� request���� ���������ڵ带 �˻��Ѵ�.
		1. ���������ڵ尡 �����ϸ� ��Ȳ-���ȭ�鿡�� �б��� ���
		2. ���������ڵ尡 �������� ������ �޴����� ������ ���
	2. ��Ȳ-���ȭ�鿡�� �б��� ���� jsInit()���� request�� ��� �μ��ڵ�(�� �ڵ�), �����ڵ�, ���������ڵ�,���������,��ǰ�з��ڵ� ������ �̿��Ͽ�
		�˻������� �����ϰ� �����ȸ�� �����Ѵ�.

--%>
<%
	SS_L_ASET_INITDataSet ds = (SS_L_ASET_INITDataSet)request.getAttribute("ds");
    int moveListCount = 15;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����

    // ��Ȳ-���ȭ�鿡���� �б�ó���� ���� request ����
    String deptcd = "";                	// �μ��ڵ�(�� �ڵ�)
    String areacd = "";               	// �����ڵ�
    String areanm = "";  				// ������
    String bocd = "";                 	// ���������ڵ�
    String bonm = "";       			// ���������
    String asetclascd = "";         	// ��ǰ�з��ڵ�

    deptcd = Util.checkString(request.getParameter("deptcd"));                	// �μ��ڵ�(�� �ڵ�)
    areacd = Util.checkString(request.getParameter("areacd"));               		// �����ڵ�
    areanm = Util.Uni2Ksc(Util.checkString(request.getParameter("areanm")));  	// ������
    bocd = Util.checkString(request.getParameter("bocd"));                     	// ���������ڵ�
    bonm = Util.Uni2Ksc(Util.checkString(request.getParameter("bonm")));       	// ���������
    asetclascd = Util.checkString(request.getParameter("asetclascd"));         	// ��ǰ�з��ڵ�
%>

<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
var gs_deptcd 		= '<%= deptcd %>';
var gs_areacd 		= '<%= areacd %>';
var gs_areanm		= '<%= areanm %>';
var gs_bocd 		= '<%= bocd %>';
var gs_bonm 		= '<%= bonm %>';
var gs_asetclascd 	= '<%= asetclascd %>';

// ����� ����
// ��Ȳ-��Ͽ��� �󼼷� �б�� ��ȸ �׸��� �Ѱ��� ���� �� ȭ����� �����ش�.
// �̸� ���ؼ� ���ó���ϴ� ȭ�鿡�� ������ �Ѱ��� ��� ������ ��ǰ�Ϸù�ȣ�� �����Ѵ�.
var gs_list_cnt	= "";
var gs_asetseq 	= "";

// ����� ���� ����
function set_list_cnt(cnt, asetseq){
	gs_list_cnt = cnt;
}

// ����� ������ Ȯ�� �� �Ѱ��� ��� �� ȣ��
function check_list_cnt(){
	if(gs_list_cnt = '1'){
		var asetseq = gs_asetseq;
		// �������� �ʱ�ȭ
		gs_list_cnt = "";
		gs_asetseq = "";
		detail_view(gs_bocd, asetseq);
	}
}

// set_search_from_list
function set_search_from_list(){
	var lo_form1 = document.aset_search_form;
	lo_form1.deptcd.value = gs_deptcd;
    var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                  "<option value=''>��ü</option>" +
                  "<option value='"+gs_areacd+"' selected>"+gs_areanm+"</option>" +
              "</select>"
    document.all.areacd_id.outerHTML = str;
    lo_form1.bocd.value = gs_bocd;
    lo_form1.bonm.value = gs_bonm;
    lo_form1.asetclascd.value = gs_asetclascd;
    lo_form1.frdt.value = "";
    lo_form1.todt.value = "";
}

// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.aset_search_form.bonm.focus();
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
    var lo_form1 = document.aset_search_form;


	if(lo_form1.bocd.value == ''){
		alert("������ �����ϼ���");
		return;
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

	// ������ǰ��Ȳ ��� ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/brinfo/1425";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// page �̵�
function page_move(pageno) {
    var lo_form1 = document.aset_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    lo_form1.action = "/ss/brinfo/1425";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �󼼺���
function detail_view(bocd, asetseq){
    var lo_form1 = document.aset_list_form;

    // ���������ڵ�, ��ǰ�Ϸù�ȣ�� "/ss/brinfo/1430" �������� ������
    lo_form1.bocd.value = bocd;
    lo_form1.asetseq.value = asetseq;
    lo_form1.action = "/ss/brinfo/1430";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���� �˻�
function area_search(){
    var lo_form1 = document.aset_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>��ü</option>" +
                  "</select>"
        document.all.areacd_id.outerHTML = str;
        return;
    }

    // ����(��)�ڵ尪�� "/ss/common/1100" �������� ������
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1100";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����ã�� �˾�
function bo_search(){
    var lo_form1 = document.aset_search_form;
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

    var lo_form1 = document.aset_search_form;

    //�������� �������� ������ �����˻��˾��� ����.
	if(lo_form1.bonm.value == ''){
		bo_search();
		return;
	}

    // ����(��)�ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
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
		var lo_form2 = document.aset_search_form;
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

    var lo_form1 = document.aset_search_form;

	if(flag == '1'){			// ����(��),����,���� �ʱ�ȭ
		// ����(��) �ʱ�ȭ
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
    var lo_form1 = document.aset_search_form;

	if(lo_form1.bonm.value == ''){
		lo_form1.bocd.value = '';
		list_search();
	}else{
	    // ����(��)�ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="title1"
	onload	=	"jsInit();
				<%if(!"".equals(bocd)){%>
					set_search_from_list();list_search();
				<%}%>
">

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >����Info
      &gt; </b> ������ǰ��Ȳ &gt; ��</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr>
    <td width="500" valign="top">

	<!--������ǰ�� �˻� ���� -->
	<table width="500" border="0"  cellpadding="2" cellspacing="0">
	<form name="aset_search_form" method="post" action="" >
		<input name="pageno" type="hidden" value ="1">			                <!-- ���� ������ ��ȣ -->
		<input name="pagesize" type="hidden" value ="<%= moveListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
		<input name="js_fn_nm" type="hidden" value ="page_move">
		<input type="hidden" name="common_deptcd" value ="">                    <!-- ���� ����(��)�ڵ� -->
		<input type="hidden" name="bocd" value ="">                         	<!-- ���������ڵ� -->
		<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->

		<tr>
			<td bgcolor="#EBE9DC" colspan="4" class="sea_top" >
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;
				<select name="deptcd" onChange="area_search();" class="sel_all">
<%
				writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
			    </select>
	          	<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
		        <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
<%
				writeAreaOpt(session, out, true);
%>
		        </select>
			</td>
			<td bgcolor="#EBE9DC" class="sea_top""><img src="/html/comm_img/ic_title.gif" width="12" height="7">����
			</td>
			<td bgcolor="#EBE9DC" class="sea_top">
				<input type="text" name="bonm" size="7" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
				<input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search02.gif" width="39"  align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--�����˻��˾�-->
				<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--����(��),����,���� �ʱ�ȭ-->
			</td>
			<td bgcolor="#EBE9DC" rowspan="3" align="right" width="40" class="sea_top">
				<input type="image" id="search_id" border="0" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;">
			</td>
		</tr>
		<tr>
			<td bgcolor="#EBE9DC" width="65"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ǰ�з�</td>
			<td bgcolor="#EBE9DC" width="120">
				<select name="asetclascd" class="sel_all">
					<option value="" selected>��ü</option>
	<%
	for(int i=0; i<ds.asetclascd.size(); i++){
		SS_L_ASET_INITASETCLASCDRecord asetclascdRec = (SS_L_ASET_INITASETCLASCDRecord)ds.asetclascd.get(i);
	%>
              		<option value="<%= asetclascdRec.cicodeval%>"><%= asetclascdRec.cicdnm%></option>
	<%}%>
				</select>
			</td>
			<td bgcolor="#EBE9DC" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ǰ��</td>
			<td bgcolor="#EBE9DC" colspan="3">
				<input type="text" name="asetnm" size="16" class="text_box">
			</td>
		</tr>
		<tr>
			<td bgcolor="#EBE9DC" width="65"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��������</td>
			<td bgcolor="#EBE9DC" colspan="5">
				<input name="frdt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="��������" dataType="date">
				-
				<input name="todt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="��������" dataType="date">
			</td>
		</tr>
		<tr bgcolor="#927F5B">
			<td colspan="7" style height"1">
			<!--line -->
			</td>
		</tr>
		<tr>
			<td colspan="7" height="3">
			<!--���� -->
			</td>
		</tr>
	</form>
	</table>
	<!--������ǰ�� �˻� �� -->

	<!--������ǰ�� ��� ���� -->
	<table width="500" border="0" cellspacing="0"  cellpadding="1" bgcolor="#FFFFFF" class="gray" id="aset_list_id">
	<form name="aset_list_form" method="post" action="">
		<input type="hidden" name="bocd" value="">   	<!--���������ڵ�-->
		<input type="hidden" name="asetseq" value="">   <!--��ǰ�Ϸù�ȣ-->

		<tr bgcolor="#dddddd" height="23">
			<td width="60" class="gray" align="center" > ��ȣ </td>
			<td width="150" class="gray" align="center"> �з� </td>
			<td width="180" class="gray" align="center"> ��ǰ�� </td>
			<td class="gray" align="center"> �������� </td>
		</tr>
		<%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
		<%for(int i=0; i<moveListCount; i++){%>
		<tr>
			<td class="gray" align="center" width="60" > &nbsp; </td>
			<td class="gray" width="150"> &nbsp; </td>
			<td class="gray" width="180"> &nbsp; </td>
			<td class="gray" align="center"> &nbsp; </td>
		</tr>
		<%}%>
		<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>

		<tr bgcolor="#dddddd" >
			<td colspan="4" class="gray" height="23" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> �ѰǼ� ��</b>
			</td>
		</tr>
	</form>
	</table>
	<!--������ǰ�� ��� �� -->

	<!-- ������ �̵�-->
	<table width="500" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
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
			<jsp:param name = "pagesize" 	value="<%= moveListCount%>"/>
			<jsp:param name = "page_set_gubun" 	value="0"/>
			</jsp:include>
			<!--JSP PAGE END------------------------------------------------------------------------------------>
			</td>
		</tr>
	</table>
	<!-- ������ �̵�-->

    </td>
    <td width="340" valign="top">

	<table width="100%" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr>
			<td  height="25" bgcolor="#EBE9DC" class="title">������ǰ ��</td>
		</tr>
		<tr>
			<td height="3">
			<!--����-->
			</td>
		</tr>
	</table>

	<!--������ǰ�� �� ���� -->
	<table width="100%" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="aset_detail_id">
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;��ȣ </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;��ǰ�з� </td>
			<td class="gray"> &nbsp;</td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;��ǰ�� </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;��� </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;������ </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;����ó </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;�������� </td>
			<td class="gray"> &nbsp;</td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;���Աݾ� </td>
			<td class="gray"> &nbsp;</td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;���������� </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" width="100" class="gray" he> &nbsp;������������ </td>
			<td class="gray">
				<textarea cols="27" rows="6" class="scroll1" readOnly>&nbsp;</textarea>
			</td>
		</tr>
		<tr height="23">
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;������� </td>
			<td class="gray"> &nbsp; </td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;��� </td>
			<td class="gray">
				<textarea cols="27" rows="5" class="scroll1" readOnly>&nbsp;</textarea>
			</td>
		</tr>
	</table>
	<!--������ǰ�� �� �� -->

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
