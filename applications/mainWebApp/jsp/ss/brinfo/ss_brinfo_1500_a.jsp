<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1500_a.jsp
* ��� : ����Info-���������ڱ���Ȳ-�ʱ�ȭ��
* �ۼ����� : 2004-05-19
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
	int asetListCount = 10;	// �� ȭ��� ������ �׸� ��
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
	document.aset_search_form.bonm.focus(); 	//�ʱ�ȭ���� ������ Focus
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
    var lo_form1 = document.aset_search_form;
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

    var lo_form1 = document.aset_search_form

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


// ��Ϻ���
function list_search(){
    var lo_form1 = document.aset_search_form;

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/brinfo/1510";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.aset_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ��ȸ������ "/ss/move/1010" �������� ������
    lo_form1.action = "/ss/move/1010";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}


//������ ��ȸ
function detail_view(deptcd, areacd, bocd, seq) {
	var lo_form1 = document.aset_detail_form;
	lo_form1.deptcd.value = deptcd;
	lo_form1.areacd.value = areacd;
	lo_form1.bocd.value = bocd;
	lo_form1.seq.value = seq;

	lo_form1.action = "/ss/brinfo/1520";
	lo_form1.target = "ifrm";
	lo_form1.submit();

}

// ����
function save() {
	var lo_form1 = document.aset_detail_form;

	// �μ�,����,���������ڵ�,������  ���翩�θ� Ȯ���Ѵ�.
	if(lo_form1.deptcd.value == '' || lo_form1.areacd.value == '' || lo_form1.bocd.value == '' || lo_form1.seq.value == '' ){
        alert("�ش����� Ŭ���ϼ���.");
        return;
	}

	// üũ�ڽ� ���ÿ��ο� ���� 'Y' �Ǵ� 'N' ����
	var c = lo_form1.elements;

	if(!c.length) return;
	for( var i = 0; i < c.length ; i++){

		if (c[i].type == 'checkbox' && c[i].checked == true) {
			c[i].value = 'Y';
		} else if (c[i].type == 'checkbox' && c[i].checked == false) {
			c[i].value = 'N';
		}
	}

	lo_form1.action = "/ss/brinfo/1530";
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

    var lo_form1 = document.aset_search_form;

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
    var lo_form1 = document.aset_search_form;

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
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="javascript:jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >����Info
      &gt; </b> ������������Ȳ</td>
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

<!--�˻� -->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="aset_search_form" method="post" action="">
	<input type="hidden" name="common_deptcd" value ="">                   	<!-- ���� �μ��ڵ� -->
	<input type="hidden" name="bocd" value ="">                         	<!-- ���������ڵ� -->
	<input type="hidden" name="pageno" value ="1">							<!-- ���� ������ ��ȣ -->
	<input type="hidden" name="pagesize" value ="<%= asetListCount%>">		<!-- �� ȭ��� ����Ʈ �׸� �� -->
	<input type="hidden" name="js_fn_nm" value ="page_move">
	<input name="applySession" type="hidden" value ="<%= applySession%>"> 	<!-- ���� ���� ���� -->

	<tr>
		<td bgcolor="#EBE9DC" width="50" class="sea_top"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;</td>
		<td bgcolor="#EBE9DC" width="100" class="sea_top" align="left">
		  <select name="deptcd" size="1" class="sel_all" onChange="area_search();">
		    <%	writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true); %>
		  </select>
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="50""><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
		  ����</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="200" align="left">
		  <select name="areacd" size="1" class="sel_all" id="areacd_id">
			<%	writeAreaOpt(session, out, true); %>
		  </select>
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="50""><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
		</td>
		<td bgcolor="#EBE9DC" class="sea_top" width="180" align="left">
		  <input name="bonm" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
		  <input type="image" src="/html/comm_img/bu_search02.gif" width="39" style="cursor:hand" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;">
		  <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�,����,���� �ʱ�ȭ-->
		</td>
        <td bgcolor="#EBE9DC" rowspan="2" align="right" class="sea_top">
			<input type="image" src="/html/comm_img/bu_search01.gif" width="39" height="35" border="0" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"><!--��� ��ȸ-->
		</td>
	</tr>
	<tr>
		<td colspan="2" bgcolor="#EBE9DC" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
			�������
		  	<input name="presi_nm" type="text" size="10" class="text_box" style="ime-mode:active;">
		</td>
		<td colspan="2" bgcolor="#EBE9DC" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
			�����繫�Ǽ�����
		  	<input name="booffi_roomownr" type="text" size="10" class="text_box" style="ime-mode:active;">
		</td>
		<td colspan="2" bgcolor="#EBE9DC" ><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
			ä��Ȯ�����Ǽ�����
		  	<input name="bondprsvobjvolownr" type="text" size="10" class="text_box" style="ime-mode:active;">
		</td>
	<tr>
	<tr bgcolor="#927F5B">
		<td colspan="7" height="1">
			<!--line -->
		</td>
	</tr>
</form>
</table>

</td>
</tr>
<tr>
<td height="3">
<!--����-->
</td>
</tr>
<tr>
<td>

<!--����Ʈ -->
<table width="830" border="0" cellspacing="0" align="center" class="gray" bgcolor="#FFFFFF" cellpadding="1" id="leasamt_list">
<form name="aset_list_form" method="post" action="">
	<input name="deptcd" type="hidden" value ="" maxlength="5">		<!--�μ��ڵ�-->
	<input name="areacd" type="hidden" value ="" maxlength="5">     <!--�����ڵ�-->
	<input name="bocd" type="hidden" value ="" maxlength="5">       <!--���������ڵ�-->
	<input name="seq" type="hidden" value ="" maxlength="5">        <!--����-->

	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray" width="60"> ������ </td>
		<td rowspan="2" class="gray" width="60">������ </td>
		<td rowspan="2" class="gray" width="70"> �����ݾ� </td>
		<td rowspan="2" class="gray" width="70"> ��ü������ </td>
		<td class="gray" colspan="2"> ä��Ȯ�� </td>
		<td rowspan="2" class="gray" width="60"> ����� </td>
		<td class="gray" width="80" > �����繫�� </td>
		<td class="gray" width="80" > ä��Ȯ������ </td>
		<td class="gray" colspan="2"> ���� �Ⱓ </td>
		<td rowspan="2" class="gray"> ���缭����ȣ </td>
	</tr>
	<tr align="center">
		<td bgcolor="#dddddd" class="gray" width="70"> �ݾ� </td>
		<td bgcolor="#dddddd" class="gray" width="50">���� </td>
		<td bgcolor="#dddddd" class="gray" width="80"> ������ </td>
		<td bgcolor="#dddddd" class="gray" width="80"> ������ </td>
		<td bgcolor="#dddddd" class="gray" width="70"> ����� </td>
		<td bgcolor="#dddddd" class="gray" width="70">������ </td>
	</tr>

	<%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
	<%for(int i=0; i<asetListCount; i++){%>
	<tr>
		<td class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray" align="right" width="70">&nbsp;</td>
		<td class="gray" align="right">&nbsp;</td>
		<td class="gray" align="right" width="70" >&nbsp;</td>
		<td class="gray" align="right">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray" align="center">&nbsp;</td>
		<td class="gray" align="center">&nbsp;</td>
		<td class="gray">&nbsp;</td>
	</tr>
    <%}%>
    <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>

	<tr bgcolor="#dddddd" align="right">
		<td colspan="12" height="23" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> �������ݾ� ��</b>&nbsp;&nbsp;&nbsp;
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> �ѰǼ� ��</b>
		</td>
	</tr>
</form>
</table>

<!-- ������ �̵� -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_move">
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
                <jsp:param name = "pagesize" 	value="<%= asetListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->

<br>

<!--������ -->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
	<tr>
		<td  height="25" bgcolor="#EBE9DC" class="title">�󼼳���</td>
	</tr>
	<tr>
		<td height="3">
		<!--����-->
		</td>
	</tr>
</table>

<table width="830" border="0" cellspacing="0" align="center" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="detail_list">
<form name="aset_detail_form" method="post" action="">
	<input name="deptcd" type="hidden" value ="" maxlength="5">		<!--�μ��ڵ�-->
	<input name="areacd" type="hidden" value ="" maxlength="5">     <!--�����ڵ�-->
	<input name="bocd" type="hidden" value ="" maxlength="5">       <!--���������ڵ�-->
	<input name="seq" type="hidden" value ="" maxlength="5">        <!--����-->

	<tr>
		<td  bgcolor="#dddddd" width="153" class="gray">��&nbsp;</td>
		<td class="gray" width="250" >&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >����</td>
		<td class="gray" width="100" >&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >������</td>
		<td class="gray" width="120" >&nbsp;</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" width="153" class="gray">������</td>
		<td class="gray" width="250" >&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >�����</td>
		<td class="gray" colspan="3" >&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">ä��Ȯ������</td>
		<td class="gray" width="250">
			�������
			<input type="checkbox" name="bondregiconf" value="Y">
			���ε
			<input type="checkbox" name="bndregi" value="Y">
			������
			<input type="checkbox" name="bondwarrp" value="Y">
		</td>
		<td class="gray" bgcolor="#dddddd" width="100">��������</td>
		<td class="gray" colspan="3">
			��༭
			<input type="checkbox" name="leascntrp" value="Y">
			���ε
			<input type="checkbox" name="leasregi" value="Y">
			����
			<input type="checkbox" name="leasexch_note" value="Y">
			��������
			<input type="checkbox" name="leasloandeed" value="Y">
		</td>
	</tr>
	<tr>
	<td bgcolor="#dddddd" width="153" class="gray">�����缭��</td>
		<td class="gray" width="250">
			����
			<input type="checkbox" name="prvoffideciddocuyn" value="Y">
			����
			<input type="checkbox" name="curroffideciddocuyn" value="Y">
		</td>
		<td class="gray" bgcolor="#dddddd" width="100">�����缭��</td>
		<td class="gray" colspan="3">
			����
			<input type="checkbox" name="prvhdqtdeciddocuyn" value="Y">
			����
			<input type="checkbox" name="currhdqtdeciddocuyn" value="Y">
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">�����繫�� �ε���ǥ��</td>
		<td class="gray" colspan="5">&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">ä��Ȯ������ �ε���ǥ�� </td>
		<td class="gray" colspan="5">&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">���</td>
		<td class="gray" colspan="5">
			<textarea name="remk" rows="3" cols="90" >&nbsp;</textarea>
		</td>
	</tr>
</form>
</table>

<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr>
    <td align="center" height="2">
      <!--����-->
    </td>
  </tr>
  <tr>
    <td align="center" height="24" bgcolor="#E8E8E8">
    	<img src="/html/comm_img/bu_save.gif" width="39" style="cursor:hand" height="19" align="absmiddle" border="0" onclick="javascript:save()">
    </td>
  </tr>
</table>
<br>
<br>

    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="800" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
