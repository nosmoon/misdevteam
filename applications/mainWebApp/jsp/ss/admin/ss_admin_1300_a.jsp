<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1300_a.jsp
* ��� : ������-���ϸ���-���ޱ���-�ʱ�ȭ��
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_MIGLBASI_INITDataSet ds = (SS_L_MIGLBASI_INITDataSet)request.getAttribute("ds");
    int paybasiListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
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
	document.paybasi_search_form.cmpycd.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ȸ�纰 ��ü �˻�
function medi_search(flag){
    if(flag == '1'){        // �˻� �� ��ü �˻�
	    var lo_form1 = document.paybasi_search_form;

        if(lo_form1.cmpycd.value == '') {
            var str = "<select id=medicd_id name=\"medicd\" class=\"sel_all\">" +
                          "<option value='' selected>��ü</option>" +
                      "</select>"
            document.all.medicd_id.outerHTML = str;
            return;
        }

        // ȸ���ڵ尪�� "/ss/common/1160" �������� ������
        lo_form1.action = "/ss/common/1160";
        lo_form1.target = "ifrm";
        lo_form1.submit();
    }else if(flag == '2'){  // �� �� ��ü �˻�
	    var lo_form1 = document.paybasi_detail_form;
        if(lo_form1.cmpycd.value == '') {
            var str = "<select id=detail_medicd_id name=\"medicd_sel\" class=\"sel_all\" onChange=\"medicd_changed();\">" +
                          "<option value='' selected>����</option>" +
                      "</select>"
            document.all.detail_medicd_id.outerHTML = str;
            return;
        }

        // ȸ���ڵ尪�� "/ss/common/1161" �������� ������
        lo_form1.action = "/ss/common/1161";
        lo_form1.target = "ifrm";
        lo_form1.submit();
   }
}

// ���ޱ��к� ���ޱ��� �˻�
function paybasi_search(flag){
    if(flag == '1'){        // �˻� �� ���ޱ��� �˻�
	    var lo_form1 = document.paybasi_search_form;

        if(lo_form1.payclsfcd.value == '') {
            var str = "<select id=paybasi_id name=\"paybasi\" class=\"sel_all\">" +
                          "<option value='' selected>��ü</option>" +
                      "</select>"
            document.all.paybasi_id.outerHTML = str;
            return;
        }

        // ���ޱ����ڵ尪�� "/ss/common/1162" �������� ������
        lo_form1.action = "/ss/common/1162";
        lo_form1.target = "ifrm";
        lo_form1.submit();
    }else if(flag == '2'){  // �� �� ���ޱ��� �˻�
	    var lo_form1 = document.paybasi_detail_form;
        if(lo_form1.payclsfcd.value == '') {
            var str = "<select id=detail_paybasi_id name=\"paybasicd_sel\" class=\"sel_all\" onChange=\"paybasicd_changed();\">" +
                          "<option value='' selected>����</option>" +
                      "</select>"
            document.all.detail_paybasi_id.outerHTML = str;
            return;
        }

        // ȸ���ڵ尪�� "/ss/common/1163" �������� ������
        lo_form1.action = "/ss/common/1163";
        lo_form1.target = "ifrm";
        lo_form1.submit();
   }
}

// ��Ϻ���
function list_search()
{
    var lo_form1 = document.paybasi_search_form;

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// ��� �˻� ������ "/ss/admin/1305" �������� ������.
    lo_form1.action = "/ss/admin/1305";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �󼼺���
function detail_view(cmpycd, medicd, payclsfcd, paybasicd){
    var lo_form1 = document.paybasi_list_form;
    // ȸ���ڵ�,��ü�ڵ�,���ޱ����ڵ�,���ޱ����ڵ带  "/ss/admin/1310" �������� ������
    lo_form1.cmpycd.value = cmpycd;
    lo_form1.medicd.value = medicd;
    lo_form1.payclsfcd.value = payclsfcd;
    lo_form1.paybasicd.value = paybasicd;
    lo_form1.action = "/ss/admin/1310";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �߰�
function add()
{
    var lo_form1 = document.paybasi_detail_form;	        		// ������ ��

	// ȭ�� ����
    var c_form2_elements = lo_form1.elements;
    for( var i =0; i< c_form2_elements.length; i++){
     	c_form2_elements(i).value = "";
    }
	// üũ�ڽ�
	lo_form1.rdrgradsumyn.checked = false;
	lo_form1.vdtyyn.checked = false;

	// select 
	document.all.cmpycd_td_id.innerHTML = 		'<select name="cmpycd_sel" class="sel_all" onChange="cmpycd_changed();medi_search(\'2\')">' +
												'<option value="" selected>����</option>' +
												'<%= ds.curcmpycdOptHtml("") %>' +
												'</select>';
	document.all.medicd_td_id.innerHTML = 		'<select name="medicd_sel" class="sel_all" id="detail_medicd_id" onChange="medicd_changed();">' +
												'<option value="" selected>����</option>' +
												'</select>';
	document.all.payclsfcd_td_id.innerHTML 	=	'<select name="payclsfcd_sel" class="sel_all" onChange="payclsfcd_changed();paybasi_search(\'2\')" id="detail_payclsfcd_id">' +
												'<option value="" selected>����</option>' +
												'<%= ds.curpayclsfcdOptHtml("") %>' +
												'</select>';
	document.all.paybasicd_td_id.innerHTML 	= 	'<select name="paybasicd_sel" class="sel_all" id="detail_paybasicd_id" onChange="paybasicd_changed();">' +
												'<option value="" selected>����</option>' +
												'</select>';

	//ù��° �������� ���� ����
	if(lo_form1.pontcalcclsfcd_sel == null){			// ����
		//ó������ ����.
	}else if(lo_form1.pontcalcclsfcd_sel == "radio"){	// �Ѱ��� ����
		lo_form1.pontcalcclsfcd_sel.checked = true;
	}else{												// �������� ����
		lo_form1.pontcalcclsfcd_sel[0].checked = true;
	}
	// �������� ����
	for(i=0; i<lo_form1.pontcalcclsfcd_sel.length; i++){
		if(lo_form1.pontcalcclsfcd_sel[i].checked){
			pontcalcclsfcd_changed(i);
		}		
	}
	
	document.all.cancel_id.disabled=true;							// ��ҹ�ư ��Ȱ��ȭ
	setInputBackgroundColor();										// readOnly ���� Ȱ��ȭ

    lo_form1.accflag.value = 'I';									// �۾������� �Է����� ����
}

// ����
function save(){
   	var lo_form1 = document.paybasi_detail_form						// ������ ��

	// ȸ���ڵ� üũ
    if(lo_form1.cmpycd.value == ''){
        alert("ȸ���ڵ带 �����ϼ���.");
        return;
    }
	// ��ü�ڵ� üũ
    if(lo_form1.medicd.value == ''){
        alert("��ü�ڵ带 �����ϼ���.");
        return;
    }
	// ���ޱ����ڵ� üũ
    if(lo_form1.payclsfcd.value == ''){
        alert("���ޱ����ڵ带 �����ϼ���.");
        return;
    }
	// ���ޱ����ڵ� üũ
    if(lo_form1.paybasicd.value == ''){
        alert(" ���ޱ����ڵ带 �����ϼ���.");
        return;
    }


	//���������ڵ� üũ
    if(lo_form1.pont.value == '' && lo_form1.pontrate.value == ''){
        alert(" �������п� ���� ����Ʈ Ȥ�� ����Ʈ������ �Է��ϼ���.");
        return;
    }

	if(lo_form1.accflag.value == 'D'){								// ������ ���ܹ߻��ϸ� 'U'�� �����Ѵ�.
		lo_form1.accflag.value = 'U';
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ


	// ���ڵ���ջ꿩��, ��ȿ����
	if(lo_form1.rdrgradsumyn.checked){
		lo_form1.rdrgradsumyn.value = 'Y';
	}else{
		lo_form1.rdrgradsumyn.value = 'N';
	}
	
	if(lo_form1.vdtyyn.checked){
		lo_form1.vdtyyn.value = 'Y';
	}else{
		lo_form1.vdtyyn.value = 'N';
	}

    if(lo_form1.accflag.value == 'I') {	        					// �ű��Է��� ��
        lo_form1.action = "/ss/admin/1315";
    } else if(lo_form1.accflag.value == 'U') {						// ���������� ��
        lo_form1.action = "/ss/admin/1320";
    } else {
      return;
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����
function del(){
    var lo_form1 = document.paybasi_detail_form;					// ������ ��

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	// �ش��׸��� ���翩�θ� Ȯ���Ѵ�.
    if(lo_form1.cmpycd.value == '' || lo_form1.medicd.value == '' || lo_form1.payclsfcd.value == '' || lo_form1.paybasicd.value == '') {
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }

	var yesno = confirm("�����Ͻðڽ��ϱ�?");
	if(yesno){
	    lo_form1.accflag.value = 'D';									// �۾������� ����('D')�� ����
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/admin/1325";
	    lo_form1.submit();
	}	    
}

// ���
function cancel(){

	var lo_form1 = document.paybasi_detail_form;
	lo_form1.reset();                                               // �� �缳��

	//���������ڵ� ����
	for(i=0; i<lo_form1.pontcalcclsfcd_sel.length; i++){
		if(lo_form1.pontcalcclsfcd_sel[i].checked){
			pontcalcclsfcd_changed(i);
		}		
	}

	setEventHandler();												// �� �缳�� �� �̺�Ʈ�ڵ鷯 ȣ��
    setEnterKeyEventHandler();                                      // �� �缳�� �� �̺�Ʈ�ڵ鷯 ȣ��
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.paybasi_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ��� ��ȸ������ "/ss/admin/1305" �������� ������
    lo_form1.action = "/ss/admin/1305";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���� ȸ���ڵ� select ����
function cmpycd_changed(){
	var lo_form1 = document.paybasi_detail_form;
	
	lo_form1.cmpycd.value = lo_form1.cmpycd_sel.value;
}

// ���� ��ü�ڵ� select ����
function medicd_changed(){
	var lo_form1 = document.paybasi_detail_form;
	
	lo_form1.medicd.value = lo_form1.medicd_sel.value;
}

// ���� �����ڵ� select ����
function payclsfcd_changed(){
	var lo_form1 = document.paybasi_detail_form;
	
	lo_form1.payclsfcd.value = lo_form1.payclsfcd_sel.value;
}

// ���� �����ڵ� select ����
function paybasicd_changed(){
	var lo_form1 = document.paybasi_detail_form;
	
	lo_form1.paybasicd.value = lo_form1.paybasicd_sel.value;
}

// ������������ radio ����
function pontcalcclsfcd_changed(sel_idx){
	var lo_form1 = document.paybasi_detail_form;

	if(sel_idx == '0'){
		lo_form1.pont.readOnly = false;
		lo_form1.pontrate.value = "";
		lo_form1.pontrate.readOnly = true;
	}else if(sel_idx == '1'){
		lo_form1.pontrate.readOnly = false;
		lo_form1.pont.value = "";
		lo_form1.pont.readOnly = true;
	}
	
	//���������ڵ� ����
	for(i=0; i<lo_form1.pontcalcclsfcd_sel.length; i++){
		if(lo_form1.pontcalcclsfcd_sel[i].checked){
			lo_form1.pontcalcclsfcd.value = lo_form1.pontcalcclsfcd_sel[i].value;
		}		
	}
	setInputBackgroundColor();
	
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

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" class="title1" onload="jsInit();pontcalcclsfcd_changed('0');">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777"  class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >������
      &gt; </b> ���ϸ��� > ���ޱ���</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top">

	<!--���ޱ��� �˻� ���� ---------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="2">
    <form name="paybasi_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">
        <input name="pagesize" type="hidden" value ="<%= paybasiListCount %>">
        <input name="js_fn_nm" type="hidden" value ="page_move">

		<tr>
			<td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">ȸ��</td>
			<td bgcolor="#EBE9DC" class="title" width="150">
				<select name="cmpycd" class="sel_all" onChange="javascript:medi_search('1')">	<!--�˻����� ��ü�˻�-->
					<option value="" selected>��ü</option>
					<%= ds.curcmpycdOptHtml("") %>
				</select>
			</td>
			<td bgcolor="#EBE9DC" class="title" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ü</td>
			<td bgcolor="#EBE9DC" class="title" width="150">
				<select name="medicd" class="sel_all" id="medicd_id">
					<option value="" selected>��ü</option>
				</select>
			</td>
			<td bgcolor="#EBE9DC" class="title" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����<strong></strong></td>
			<td bgcolor="#EBE9DC" class="title" width="150">
				<select name="payclsfcd" class="sel_all" onChange="javascript:paybasi_search('1')">	<!--�˻����� ���ޱ��ذ˻�-->
					<option value="" selected>��ü</option>
					<%= ds.curpayclsfcdOptHtml("") %>
				</select>
			</td>
			<td bgcolor="#EBE9DC" class="title" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
			<td bgcolor="#EBE9DC" class="title" width="150">
				<select name="paybasicd" class="sel_all" id="paybasicd_id">
					<option value="" selected>��ü</option>
				</select>
			</td>
			<td bgcolor="#EBE9DC" class="title" align="right">
	            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="8">
				<!--����-->
			</td>
		</tr>
	</form>
	</table>
	<!--���ޱ��� �˻� �� ---------------------------------------------------------------------------->


    <!-- ���ޱ��� ��� ���� --------------------------------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="paybasi_list_id">
    <form name="paybasi_list_form" method="post" action="">
        <input name="cmpycd" type="hidden" value ="">			<!--ȸ���ڵ�-->
        <input name="medicd" type="hidden" value ="">           <!--��ü�ڵ�-->
        <input name="payclsfcd" type="hidden" value ="">        <!--���ޱ���-->
        <input name="paybasicd" type="hidden" value ="">        <!--���ޱ���-->
		<tr align="center" bgcolor="#dddddd" height="23">
			<td class="gray">ȸ��</td>
			<td width="110" class="gray">��ü</td>
			<td width="110" class="gray">����</td>
			<td width="130" class="gray">���ޱ���</td>
			<td width="60" class="gray">����Ʈ</td>
			<td width="60" class="gray">����</td>
			<td width="60" class="gray">�������</td>
			<td width="60" class="gray">��������</td>
			<td width="60" class="gray">����ȯ��</td>
		</tr>
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
        <%for(int i=0; i<paybasiListCount; i++){%>
		<tr>
			<td class="gray" align="center"> &nbsp; </td>
			<td class="gray" width="110" align="center"> &nbsp; </td>
			<td class="gray" width="110" align="center"> &nbsp; </td>
			<td class="gray" width="130" align="center"> &nbsp; </td>
			<td class="gray" width="60" align="right"> &nbsp; </td>
			<td class="gray" width="60" align="right"> &nbsp; </td>
			<td class="gray" width="60" align="right"> &nbsp; </td>
			<td class="gray" width="60" align="right"> &nbsp; </td>
			<td class="gray" width="60" align="right"> &nbsp; </td>
		</tr>
        <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>

		<tr align="right">
			<td  colspan="9" bgcolor="#dddddd" class="gray" height="23">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
			</td>
		</tr>
	</form>
	</table>
    <!-- ������ �̵� -->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="title2" id="page_move">
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
                    <jsp:param name = "pagesize" 	value="<%= paybasiListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->
    <!-- ���ޱ��� ��� �� --------------------------------------------------------------------------------------------------->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!--����-->
    </td>
  </tr>
  <tr>
    <td>

	<!--�� -->
	<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
		<tr>
		  <td  height="27" bgcolor="#EBE9DC" class="title">�����׸� �󼼳���</td>
		  <td bgcolor="#EBE9DC" class="title" width="120" align="right">(<font color="red">*
		    </font>�ʼ��׸�)</td>
		</tr>
		<tr>
		  <td height="3" colspan="2">
		    <!--����-->
		  </td>
		</tr>
	</table>

	<!-- ���ޱ��� �� ���� --------------------------------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="paybasi_detail_id">
    <form name="paybasi_detail_form" method="post" action="">
        <input type="hidden" name="accflag" value="I">          <!--�Է�(I),����(U),����(D) �����ʵ� �ʱⰪ(I)-->
	    <input name="cmpycd" type="hidden" value ="">			<!--ȸ���ڵ�-->
	    <input name="medicd" type="hidden" value ="">           <!--��ü�ڵ�-->
	    <input name="payclsfcd" type="hidden" value ="">        <!--���ޱ���-->
	    <input name="paybasicd" type="hidden" value ="">        <!--���ޱ���-->
	    <input name="pontcalcclsfcd" type="hidden" value ="">   <!--��������-->

		<tr>
			<td bgcolor="#dddddd" class="gray"> ȸ��<font color="red">*</font></td>
			<td colspan="3" class="gray" width="200"  id="cmpycd_td_id">
				<select name="cmpycd_sel" class="sel_all" onChange="cmpycd_changed();medi_search('2')">	<!--������ ��ü�˻�-->
					<option value="" selected>����</option>
					<%= ds.curcmpycdOptHtml("") %>
				</select>
			</td>			
			<td width="150" bgcolor="#dddddd" class="gray"> ��������<font color="red">*</font></td>
			<td width="150" bgcolor="#dddddd" class="gray"> ����Ʈ</td>
			<td class="gray" width="130">
				<input name="pont" type="text" size="8"  class="text_box" dataType="integer" comma >
			</td>			
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> ��ü<font color="red">*</font></td>
			<td colspan="3" class="gray"  width="200" id="medicd_td_id">
				<select name="medicd_sel" class="sel_all" id="detail_medicd_id" onChange="medicd_changed();">
					<option value="" selected>����</option>
				</select>
			</td>
			<td width="150" bgcolor="#dddddd" class="gray"> 
<%--�������������ڵ� ������ư ���--%>			
<%for(int i=0; i<ds.curpontcalcclsfcd.size(); i++){
		String checked = "";
		SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord curpontcalcclsfcdRec = (SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord)ds.curpontcalcclsfcd.get(i);
		if(i == 0){ checked = "checked";}else{ checked = ""; }
%>
		<input type="radio" name="pontcalcclsfcd_sel" value="<%= curpontcalcclsfcdRec.cicodeval%>" onclick="pontcalcclsfcd_changed('<%= i%>');" <%=checked%>><%= curpontcalcclsfcdRec.cicdnm%></input>
<%}%>
			</td>
			<td bgcolor="#dddddd" class="gray"> ����Ʈ����</td>
			<td class="gray" width="130">
				<input name="pontrate" type="text" size="8"  class="text_box" >
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> ���ޱ����ڵ�<font color="red">*</font></td>
			<td colspan="3" class="gray" width="200" id="payclsfcd_td_id">
				<select name="payclsfcd_sel" class="sel_all" onChange="payclsfcd_changed();paybasi_search('2')" id="detail_payclsfcd_id">	<!--������ ���ޱ��ذ˻�-->
					<option value="" selected>����</option>
					<%= ds.curpayclsfcdOptHtml("") %>
				</select>
			</td>
			<td width="150" rowspan="2" bgcolor="#dddddd" class="gray"> �д���� </td>
			<td width="150" bgcolor="#dddddd" class="gray"> ����<font color="red">*</font></td>
			<td class="gray" width="130">
				<input name="hdqtallmratio" type="text" size="8"  class="text_box" caption="����д����" notEmpty>
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> ���ޱ����ڵ�<font color="red">*</font></td>
			<td colspan="3" class="gray" width="200" id="paybasicd_td_id">
				<select name="paybasicd_sel" class="sel_all" id="detail_paybasicd_id" onChange="paybasicd_changed();">
					<option value="" selected>����</option>
				</select>
			</td>
			<td bgcolor="#dddddd" class="gray" width="95"> ��������<font color="red">*</font></td>
			<td class="gray" width="130">
				<input name="boallmratio" type="text" size="8"  class="text_box"  caption="��������д����" notEmpty>
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> ���ڵ���ջ꿩��</td>
			<td class="gray" width="50">
				<input name="rdrgradsumyn" value="" type="checkbox" size="8"  class="text_box">
			</td>
			<td bgcolor="#dddddd" class="gray" width="150"> ��ȿ����</td>
			<td class="gray" width="50">
				<input name="vdtyyn" value="" type="checkbox" size="8"  class="text_box">
			</td>
			<td colspan="2" bgcolor="#dddddd" class="gray">����ȯ��<font color="red">*</font></td>
			<td class="gray" width="130">
				<input name="adjmexchrate" type="text" size="8"  class="text_box"  caption="����ȯ��" notEmpty>
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> ���� </td>
			<td colspan="6" class="gray">
				<textarea name="descri" cols="96" rows="3" class="scroll1"></textarea>
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> ���޽������� </td>
			<td colspan="6" class="gray">
				<textarea name="paypointdescri" cols="96" rows="3" class="scroll1"></textarea>
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray"> ��� </td>
			<td colspan="6" class="gray">
				<textarea name="remk" cols="96" rows="3" class="scroll1"></textarea>
			</td>
		</tr>
	</form>
	</table>
	<!-- ���ޱ��� �� �� --------------------------------------------------------------------------------------------------->

    <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
        <tr>
            <td align="center" height="2">
            <!--����-->
            </td>
        </tr>
        <tr>
            <td align="center" height="24" bgcolor="#E8E8E8">
                <input type="image" id="add_id" src="/html/comm_img/bu_new.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:add();">
                <input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:save();">
                <input type="image" id="del_id" src="/html/comm_img/bu_del.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:del();">
                <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" onclick="javascript:cancel();">
            </td>
        </tr>
    </table>

    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>