<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1000_a.jsp
* ��� : ��������-�Ź�������ǰ-���-�ʱ�ȭ��
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_NWSPITEM_CDLSTDataSet ds = (SS_L_NWSPITEM_CDLSTDataSet)request.getAttribute("ds");
    int nwspitemListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
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
	document.nwspitem_search_form.itemclsf.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ��ǰ��� �˻�
// form_name : select �����ϴ� ���̸�, type : ��ü���Կ���, select : select element
// hidden form �� �̿��Ѵ�.
function item_list_search(form_name, type, select){
    var lo_form1 = document.item_list_form;

	// ������ ��ȭ���� ���� ó������ �ʴ´�.
	if(form_name == document.nwspitem_detail_form.name && document.nwspitem_detail_form.accflag.value == 'U'){
		return;
	}
	
    // �� �̸�, Ÿ��, ���õ� ��ǰ�����ڵ带 "/ss/brsup/1005" �������� ������
    lo_form1.form_name.value = form_name;
    lo_form1.type.value = type;
    lo_form1.itemclsf.value = select.value;
    lo_form1.action = "/ss/brsup/1005";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ��Ϻ���
function list_search()
{
    var lo_form1 = document.nwspitem_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';

	// �Ź�������ǰ ��� ��ȸ������ "/ss/brsup/1010" �������� ������.
    lo_form1.action = "/ss/brsup/1010";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �󼼺���
function detail_view(itemcd){
    var lo_form1 = document.nwspitem_list_form;

    // ��ǰ�ڵ带 "/ss/brsup/1015" �������� ������
    lo_form1.itemcd.value = itemcd;
    lo_form1.action = "/ss/brsup/1015";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����
function update(){
	var lo_form1 = document.nwspitem_detail_form;

    if(!check_all(lo_form1)) return;
    lo_form1.action = "/ss/brsup/1020";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �߰�
function add(){

	var lo_form1 = document.nwspitem_detail_form;
	lo_form1.itemclsf.outerHTML 		= 	default_form.itemclsf.outerHTML;			// ��ǰ����
	lo_form1.itemcd.outerHTML 			= 	default_form.itemcd.outerHTML;				// ��ǰ��
	lo_form1.sendclsf.outerHTML 		= 	default_form.sendclsf.outerHTML;			// �߼۱���
	lo_form1.costclsf.outerHTML 		= 	default_form.costclsf.outerHTML;			// ���û������
	lo_form1.rcpmchrgpersclsf.outerHTML = 	default_form.rcpmchrgpersclsf.outerHTML;	// �Աݴ����
	lo_form1.clamchrgpersclsf.outerHTML = 	default_form.clamchrgpersclsf.outerHTML;	// û�������
	lo_form1.remk.value 				= 	'';											// ����
	lo_form1.uprc.value 				= 	'';											// �ܰ�
	lo_form1.qunt.value 				= 	'';											// ����
	lo_form1.aplcfrdt.value 			= 	'';											// ��û��������
	lo_form1.aplctodt.value 			= 	'';											// ��û��������
	lo_form1.aplcclostm.value 			= 	'';											// ��û�����ð�
	
	// accflag ����
	lo_form1.accflag.value = 'A';
}


// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.nwspitem_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // �Ź�������ǰ ��� ��ȸ������ "/ss/brsup/1010" �������� ������
    lo_form1.action = "/ss/brsup/1010";
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

function popupimg(){
	var lo_form1 = document.nwspitem_detail_form;
//	var url = "/ss/brsup/1016?itemcd=" + lo_form1.item.value;
//	alert(lo_form1.item);	
	window.open("/ss/brsup/1017?itemcd=" + lo_form1.item.value, "�˾��̹���","menubar=no, toolbar=no, location=no, scrollbars=no, width=510, height=570");	
}

//-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >��������
		> </b>�Ź�������ǰ &gt; ���</td>
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

	<!-- �Ź�������ǰ �˻� ���� -->
	<table width="830" border="0" cellspacing="0" cellpadding="2"  bgcolor="#EBE9DC">
    <form name="nwspitem_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                	<!-- ���� ������ ��ȣ -->
        <input name="pagesize" type="hidden" value ="<%= nwspitemListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
        <input name="js_fn_nm" type="hidden" value ="page_move">

		<tr>
			<td bgcolor="#EBE9DC" width="70" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ǰ����</td>
			<td width="130" class="title">
				<select name="itemclsf" class="sel_all" onChange="item_list_search(this.form.name, 'Y', this)">
					<option value="" selected>��ü</option>
					<%= ds.curitemclsfcdOptHtml("") %>                              <!-- ��ǰ�����ڵ�, �ڵ�� ��� -->
				</select>
			</td>
			<td bgcolor="#EBE9DC" width="70" class="title"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ǰ��</td>
			<td width="103" class="title">
				<select name="itemcd" class="sel_all">
					<option value="" selected>��ü</option>
				</select>
			</td>
			<td width="100" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���û������</td>
			<td width="120" class="title">
				<select name="costclsf" class="sel_all">
					<option value="" selected>��ü</option>
					<%= ds.curcostclsfcdOptHtml("") %>                              <!-- ���û�������ڵ�, �ڵ�� ��� -->
				</select>
			</td>
			<td width="70" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�߼۱���</td>
			<td class="title">
				<select name="sendclsf" class="sel_all">
					<option value="" selected>��ü</option>
					<%= ds.cursendclsfcdOptHtml("") %>                              <!-- �߼۱����ڵ�, �ڵ�� ��� -->
				</select>
			</td>
			<td align="right" class="title">
				<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;" border="0" >
			</td>
		</tr>
	</form>
	</table>
	<!-- �Ź�������ǰ �˻� �� -->

</td>
</tr>
<tr>
<td height="3">
<!--����-->
</td>
</tr>
<tr>
<td>

	<!-- �Ź�������ǰ ��� ���� -->
	<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#ffffff" id="nwspitem_list_id">
    <form name="nwspitem_list_form" method="post" action="" >
        <input name="itemcd" type="hidden" value ="">					<!-- ��ǰ�ڵ� -->

		<tr bgcolor="#dddddd" height="23">
			<td class="gray" align="center">��ǰ��</td>
			<td width="100" class="gray" align="center">��ǰ�ڵ�</td>
			<td width="150" class="gray" align="center">��ǰ����</td>
			<td width="100" class="gray" align="center">�߼۱���</td>
			<td width="100" class="gray" align="center">���û������</td>
			<td width="100" class="gray" align="center">�ܰ�</td>
			<td width="100" class="gray" align="center">������</td>
		</tr>
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
        <%for(int i=0; i<nwspitemListCount; i++){%>
		<tr>
			<td class="gray"> &nbsp; </td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="150" class="gray">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="right">&nbsp;</td>
			<td width="100" class="gray" align="right">&nbsp;</td>
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
                    <jsp:param name = "pagesize" 	value="<%= nwspitemListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->
	<!-- �Ź�������ǰ ��� �� -->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!------����--- -->
    </td>
  </tr>
  <tr>
    <td height="10">
	  <!--Ÿ��Ʋ�ڽ�-->
	  <table width="830" border="0"  cellpadding="1" cellspacing="0">
	    <tr>
	      <td  height="27" bgcolor="#EBE9DC" class="title">��ǰ���</td>
	    </tr>
	    <tr>
	      <td height="3">
	        <!--����-->
	      </td>
	    </tr>
	  </table>

	<!-- �Ź�������ǰ �� ���� -->
	<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#ffffff" id="nwspitem_detail_id">
	<form name="nwspitem_detail_form" method="post" action="" enctype="multipart/form-data">
        <input name="accflag" type="hidden" value ="A">					<!-- accflag(��:D, ��Ÿ:A) -->
        <input name="item" type="hidden" value ="0">					<!-- ��ǰ�ڵ� -->
        
		<tr>
			<td width="120" height = "166" class="gray" rowspan="6"><img name = "thumbnailimg" src="/html/img/No_Image.GIF" onclick="popupimg()" width="120" height="166" align="absmiddle"></td>
			<td width="110" class="gray" bgcolor="#dddddd">��ǰ����<font color="#FF0000">*</font></td>
			<td width="240" class="gray">
				<select name="itemclsf" class="sel_all" onChange="item_list_search(this.form.name, 'N', this)" caption="��ǰ����" notEmpty>
					<%= ds.curitemclsfcdOptHtml("") %>                              <!-- ��ǰ�����ڵ�, �ڵ�� ��� -->
				</select>
			</td>
			<td width="110" bgcolor="#dddddd" class="gray" width="89">��ǰ��<font color="#FF0000">*</font></td>
			<td width="250" class="gray">
				<select name="itemcd" class="sel_all" caption="��ǰ��" notEmpty>
					<option value="" selected>��ǰ���� ����</option>
				</select>
			</td>
		</tr>
		
		<tr>
			<td width="110" bgcolor="#dddddd" width="89" class="gray">�߼۱���<font color="#FF0000">*</font></td>
			<td width="240" class="gray" caption="�߼۱���" notEmpty>
				<select name="sendclsf" class="sel_all">
					<option value="" selected>����</option>
					<%= ds.cursendclsfcdOptHtml("") %>                              <!-- �߼۱����ڵ�, �ڵ�� ��� -->
				</select>
			</td>
			<td width="110" bgcolor="#dddddd" class="gray">�Աݴ����<font color="#FF0000">*</font><br>
			</td>
			<td width="250" class="gray">
				<select name="rcpmchrgpersclsf" class="sel_all" caption="�Աݴ����" notEmpty>
					<option value="" selected>����</option>
					<%= ds.curchrgpersclsfcdOptHtml("") %>                        	<!-- ����ڱ����ڵ�, �ڵ�� ��� -->
				</select>
			</td>
			
		</tr>
		
		<tr>
			<td width="110" class="gray"  bgcolor="#dddddd">���û������<font color="#FF0000">*</font></td>
			<td width="240" class="gray" >
				<select name="costclsf" class="sel_all" caption="���û������" notEmpty>
					<option value="" selected>����</option>
					<%= ds.curcostclsfcdOptHtml("") %>                              <!-- ���û�������ڵ�, �ڵ�� ��� -->
				</select>
			</td>
			<td width="110" class="gray" bgcolor="#dddddd">û�������<font color="#FF0000">*</font></td>
			<td width="250" class="gray">
				<select name="clamchrgpersclsf" class="sel_all" caption="û�������" notEmpty>
					<option value="" selected>����</option>
					<%= ds.curchrgpersclsfcdOptHtml("") %>                        	<!-- ����ڱ����ڵ�, �ڵ�� ��� -->
				</select>
			</td>
		</tr>
		
		<tr>
			<td bgcolor="#dddddd" class="gray" width="110">�ܰ�<font color="#FF0000">*</font></td>
			<td width="240" class="gray">
				<input name="uprc" type="text" size="10" class="text_box" value="" style="text-align:right" dataType="integer" comma caption="�ܰ�" notEmpty>
			</td>
			<td class="gray"  bgcolor="#dddddd" width="110"> ����<font color="#FF0000">*</font></td>
			<td class="gray" width="250">
				<input name="qunt" type="text" size="10" class="text_box" value="" style="text-align:right" dataType="integer" comma caption="����" notEmpty>
			</td>
		</tr>
		<tr>
			
			<td bgcolor="#dddddd" class="gray" width="110">��û�����ð�<font color="#FF0000">*</font></td>
			<td class="gray" width="240">
				<input name="aplcclostm" type="text" size="10" class="text_box" style="text-align:right" dataType="24hr" caption="��û�����ð�" notEmpty>
			</td>
			<td class="gray" width="110" bgcolor="#dddddd">��û�Ⱓ<font color="#FF0000">*</font></td>
			<td class="gray" width="250">
				<input name="aplcfrdt" type="text" size="10" class="text_box" dataType="date" caption="��û�Ⱓ" notEmpty>
				-
				<input name="aplctodt" type="text" size="10" class="text_box" dataType="date" caption="��û�Ⱓ" notEmpty>
			</td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray" width="110">����� �̹���</td>
			<td class="gray" width="240"><input type="file" name="thumbnail"></td>
			<td class="gray" width="110" bgcolor="#dddddd">�˾� �̹���</td>
			<td class="gray" width="250"><input type="file" name="popup"></td>
		</tr>
		<tr>
			<td bgcolor="#dddddd" class="gray" width="120">����<br></td>
			<td colspan="4" class="gray" width="*">
				<textarea style="ime-mode:active;" name="remk" cols="93" rows="3" class="scroll1"></textarea>
			</td>
		</tr>
	</form>
	</table>
	<!-- �Ź�������ǰ �� �� -->
	<!--button-->
	<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
		<tr>
			<td align="center"  bgcolor="#E8E8E8" height="25">
				<input type="image" src="/html/comm_img/bu_new.gif" width="39" height="19" align="absmiddle" border="0" onclick="add()" border="0">
				<input type="image" src="/html/comm_img/bu_save.gif" width="39" height="19" border="0" align="absmiddle" onclick="update()" border="0">
			</td>
		</tr>
	</table>

    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<!-- ��ǰ���� select ���ý� ��ǰ��� select�� �����Ű�� ���� ��-->
<!-- document���� ������ ��ǰ���� select, ��ǰ��� select �׸���� �����ϹǷ� form �̸�, Ÿ��(��ü���Կ���)�� request�� �����Ѵ�.-->
<form name="item_list_form" method="post" action="" style="display:none">
	<input name="form_name" type="hidden" value ="">				<!-- form �̸� -->
	<input name="type" type="hidden" value ="">			           	<!-- ��ü���Կ��� (Y:����, N:������)-->
	<input name="itemclsf" type="hidden" value ="">			   		<!-- ��ǰ�����ڵ�-->
</form>
<!-- ȭ�� �ʱ�ȭ�� ���� ǰ-->
<form name="default_form" method="post" action="" style="display:none">
	<select name="itemclsf" class="sel_all" onChange="item_list_search(this.form.name, 'N', this)">
		<%= ds.curitemclsfcdOptHtml("") %>                              <!-- ��ǰ�����ڵ�, �ڵ�� ��� -->
	</select>
	<select name="itemcd" class="sel_all">
		<option value="" selected>��ǰ������ �����ϼ���.</option>
	</select>
	<select name="sendclsf" class="sel_all">
		<option value="" selected>����</option>
		<%= ds.cursendclsfcdOptHtml("") %>                              <!-- �߼۱����ڵ�, �ڵ�� ��� -->
	</select>
	<select name="costclsf" class="sel_all">
		<option value="" selected>����</option>
		<%= ds.curcostclsfcdOptHtml("") %>                              <!-- ���û�������ڵ�, �ڵ�� ��� -->
	</select>
	<select name="rcpmchrgpersclsf" class="sel_all">
		<option value="" selected>����</option>
		<%= ds.curchrgpersclsfcdOptHtml("") %>                        	<!-- ����ڱ����ڵ�, �ڵ�� ��� -->
	</select>
	<select name="clamchrgpersclsf" class="sel_all">
		<option value="" selected>����</option>
		<%= ds.curchrgpersclsfcdOptHtml("") %>                        	<!-- ����ڱ����ڵ�, �ڵ�� ��� -->
	</select>
</form>
</body>
</html>
