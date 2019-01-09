<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1200_a.jsp
* ��� : Ȯ����Ȳ-���Ȯ��-��ȸ����-�ʱ�ȭ��
* �ۼ����� : 2003-12-10
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_XTN_EMPCAMP_INITDataSet ds = (SS_L_RDR_XTN_EMPCAMP_INITDataSet)request.getAttribute("ds");
	int campListCount = 14;
    int mediListCount = 8;
	String paramGbn = "##";
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
	document.camp_search_form.frdt.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ��ȸ ��Ϻ���
function camp_list_search(){
    var lo_form1 = document.camp_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';
    // Ȯ���ȸ��� ��ȸ������ "/ss/extn/1205" �������� ������
    lo_form1.action = "/ss/extn/1205";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ��ȸ �󼼺���
function camp_detail_view(rdr_extncampno){
    var lo_form1 = document.camp_list_form;
    // ���Ȯ���ȸ��ȣ�� "/ss/extn/1210" �������� ������
    lo_form1.rdr_extncampno.value = rdr_extncampno;
    lo_form1.action = "/ss/extn/1210";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �߰�
function camp_add()
{
    var lo_form1 = document.camp_detail_form;	                    // ������ ��
	var lo_table1 = document.all.camp_detail_title_id;		        // ������ Ÿ��Ʋ ���̺�
	var lo_table2 = document.all.camp_detail_id;		        	// ������ ��ȸ���� ���̺�
	lo_table1.rows[0].cells[0].innerText = '���Ȯ���ȸ ���';
	lo_table2.rows[4].cells[1].innerText = 'N';

	document.all.cancel_id.disabled=true;							// ��ҹ�ư ��Ȱ��ȭ

	// ���� �׸��� �����ϰ� ȭ�� ����
    var c_form2_elements = lo_form1.elements;
    for( var i =0; i< c_form2_elements.length; i++){
		if(c_form2_elements(i) != lo_form1.closyn){
            c_form2_elements(i).value = "";
		}
    }

    lo_form1.accflag.value = 'I';									// �۾������� �Է����� ����
}

// ����
// �Լ� �ܺ� ���� ���� mediListCount : ȭ�鿡 ����� ��ü���� ����� ����
// �Լ� �ܺ� ���� ���� paramGbn : �׸� ���ڿ��� ���� �� ������
function camp_save(){
   var lo_form1 = document.camp_detail_form;
	if(lo_form1.accflag.value == 'D'){								// ������ ���ܹ߻��ϸ� 'U'�� �����Ѵ�.
		lo_form1.accflag.value = 'U';
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    
	// �������� < �������� üũ
	if(lo_form1.frdt.value >= lo_form1.todt.value){
		alert("�������ڰ� �������ں��� �۰ų� �����ϴ�.");
    	setEventHandler();
		return;
	}
	
	// ����������� < �������� üũ
	if(lo_form1.todt.value > lo_form1.closdt.value){
		alert("����������ڰ� �������ں��� �۽��ϴ�.");
    	setEventHandler();
		return;
	}
    
	var li_count = <%= mediListCount %>;   							// ��ü���� ��� �Է��׸� ����

	var ls_temp = '';
	
	// ���ϸ�ü ���� üũ
    for( var i = 1; i<= li_count; i++) {
		ls_temp =  document.all("medicd"+i).value;
		if(ls_temp != ''){
			for( var j = 1; j<= li_count && i != j; j++){
				if(ls_temp == document.all("medicd"+j).value){
					alert("���� ��ü�� �ߺ� ���õ� �� �����ϴ�.");
					return;
				}
			}
		}   	
	}	

    // ��ü������ ���ڿ� �������� �����.
	var ls_medicdary = "";
	var ls_alonamtary = "";
	var ls_qtyaplydtary = "";
	var ls_basivalqtyary = "";

    // ȭ�鿡 ��µ� ��ü���� ��� �Է��׸��� �˻����� ���� �ִ� �׸� ���� �׸񺰷� ���ڿ��� �����.
    for( var i = 1; i<= li_count; i++) {
    
    	// ��ü�� �������� ���� ���� �����Ѵ�.
    	if(document.all("medicd"+i).value == null || document.all("medicd"+i).value == ""){
    		// ��ü�� �������� ���� ��� ����,�μ���������,���غμ��� �����ϸ� ���
    		if(document.all("alonamt"+i).value != ''){
    			alert("��ü�� ������ �� ������ �Է��ϼ���");
    			setEventHandler();
    			return;
    		}
    		if(document.all("qtyaplydt"+i).value != ''){
    			alert("��ü�� ������ �� �μ��������ڸ� �Է��ϼ���");
    			setEventHandler();
    			return;
    		}
    		if(document.all("basivalqty"+i).value != ''){
    			alert("��ü�� ������ �� ���غμ��� �Է��ϼ���");
    			setEventHandler();
    			return;
    		}
    		continue;
    	}
    	// ��ü�� ������ ���, ����, �μ���������, ���غμ� ���� üũ
    	if(document.all("medicd"+i).value != null && document.all("medicd"+i).value != ""){
    		if(document.all("alonamt"+i).value == null || document.all("alonamt"+i).value == ""){
    			alert("���õ� ��ü�� ������ �Է��ϼ���");
    			setEventHandler();
    			return;
    		}
    		if(document.all("qtyaplydt"+i).value == null || document.all("qtyaplydt"+i).value == ""){
    			alert("���õ� ��ü�� �μ��������ڸ� �Է��ϼ���");
    			setEventHandler();
    			return;
    		}
    		if(document.all("basivalqty"+i).value == null || document.all("basivalqty"+i).value == ""){
    			alert("���õ� ��ü�� ���غμ��� �Է��ϼ���");
    			setEventHandler();
    			return;
    		}
    	}
    	
        if(document.all("medicd"+i).value != null && document.all("medicd"+i).value != ""){
            ls_medicdary = ls_medicdary + document.all("medicd"+i).value + "<%= paramGbn%>";
        }
        if(document.all("alonamt"+i).value != null && document.all("alonamt"+i).value != ""){
            ls_alonamtary = ls_alonamtary + document.all("alonamt"+i).value + "<%= paramGbn%>";
        }
        if(document.all("qtyaplydt"+i).value != null && document.all("qtyaplydt"+i).value != ""){
            ls_qtyaplydtary = ls_qtyaplydtary + document.all("qtyaplydt"+i).value + "<%= paramGbn%>";
        }
        if(document.all("basivalqty"+i).value != null && document.all("basivalqty"+i).value != ""){
            ls_basivalqtyary = ls_basivalqtyary + document.all("basivalqty"+i).value + "<%= paramGbn%>";
        }
    }

	lo_form1.medicdary.value = ls_medicdary.substring(0, ls_medicdary.length-2);
	lo_form1.alonamtary.value = ls_alonamtary.substring(0, ls_alonamtary.length-2);
	lo_form1.qtyaplydtary.value = ls_qtyaplydtary.substring(0, ls_qtyaplydtary.length-2);
	lo_form1.basivalqtyary.value = ls_basivalqtyary.substring(0, ls_basivalqtyary.length-2);

    if(lo_form1.accflag.value == 'I') {	        					// �ű��Է��� ��
        lo_form1.action = "/ss/extn/1215";
    } else if(lo_form1.accflag.value == 'U') {						// ���������� ��
        lo_form1.action = "/ss/extn/1220";
    } else {
      return;
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����
function camp_del(){
    var lo_form1 = document.camp_detail_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    if(lo_form1.rdr_extncampno.value == '') {						// Ȯ���ȸ��ȣ ���翩�θ� Ȯ���Ѵ�.
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }

	var yesno = confirm("�����Ͻðڽ��ϱ�?");
	if(yesno){
	    lo_form1.accflag.value = 'D';									// �۾������� ����('D')�� ����
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/extn/1225";
	    lo_form1.submit();
	}	    
}

// ���
function camp_cancel(){

    // ������ ���� ���� reset ���ش�.
    var lo_form1 = document.camp_detail_form;	                    // ������ ��
	var lo_table1 = document.all.camp_detail_title_id;		        // ������ Ÿ��Ʋ ���̺�
	var lo_table2 = document.all.camp_detail_id;		        	// ������ ��ȸ���� ���̺�

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

//	lo_table1.rows[0].cells[0].innerText = '���Ȯ���ȸ ��';
//	lo_table2.rows[4].cells[1].innerText = 'Y';

	lo_form1.reset();

	setEventHandler();												// �� �缳�� �� �̺�Ʈ�ڵ鷯 ȣ��
    setEnterKeyEventHandler();                                      // �� �缳�� �� �̺�Ʈ�ڵ鷯 ȣ��
}

// ��ü�ڵ� ���ý� ���� �Է��׸� ����
function medicd_change(sel_num, medicd, alonamt, qtyaplydt, basivalqty){
	if(medicd.selectedIndex == 0){
		alonamt.value="";
		qtyaplydt.value="";
		basivalqty.value="";
	}
}

// ����
function camp_close(){
    var lo_form1 = document.camp_detail_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    if(lo_form1.rdr_extncampno.value == '') {						// Ȯ���ȸ��ȣ ���翩�θ� Ȯ���Ѵ�.
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }
    lo_form1.accflag.value = 'Y';									// �۾������� �������� ����
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/extn/1230";
    lo_form1.submit();
}

// ���� ���
function camp_colsecancel(){
    var lo_form1 = document.camp_detail_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    if(lo_form1.rdr_extncampno.value == '') {						// Ȯ���ȸ��ȣ ���翩�θ� Ȯ���Ѵ�.
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }
    lo_form1.accflag.value = 'N';									// �۾������� ������ҷ� ����
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/extn/1235";
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.camp_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }
    // Ȯ���ȸ��� ��ȸ������ "/ss/extn/1205" �������� ������
    lo_form1.action = "/ss/extn/1205";
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

// �˻� ���� �ʱ�ȭ
function set_default(flag){

    var lo_form1 = document.camp_search_form;
		
	if(flag == '1'){			// �μ�,����,���� �ʱ�ȭ
	}else if(flag == '2'){		// �Ⱓ �ʱ�ȭ
		lo_form1.frdt.value = "";
		lo_form1.todt.value = "";
		lo_form1.frdt.focus();
	}else if(flag == '3'){		// ��Ÿ �ʱ�ȭ
	}		
}

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1"  onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >Ȯ����Ȳ >
        </b>���Ȯ�� &gt; ��ȸ </td>
    </tr>
    <tr>
        <td height="10">
        <!--������ ���� ����-->
        </td>
    </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<tr>
    <td width="490" valign="top">

    <!-- ���Ȯ���ȸ �˻� ���� --------------------------------------------------------------------------------------------------->
    <table width="489" border="0"  cellpadding="1" cellspacing="0">
    <form name="camp_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">
        <input name="pagesize" type="hidden" value ="10">
        <input name="js_fn_nm" type="hidden" value ="page_move">
        <tr>
            <td height="25" bgcolor="#EBE9DC"  class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ
	            <input name="frdt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="��������" dataType="date">
	            -
	            <input name="todt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="��������" dataType="date">
	            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--�Ⱓ �ʱ�ȭ-->
        	</td>
        	<td height="25" bgcolor="#EBE9DC"  class="title" align="right">
	            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:camp_list_search();window.event.returnValue=false;">
        	</td>
        </tr>
        <tr>
            <td height="3">
            <!--����-->
            </td>
        </tr>
    </form>
    </table>
    <!-- ���Ȯ���ȸ �˻� �� --------------------------------------------------------------------------------------------------->

    <!-- ���Ȯ���ȸ ��� ���� --------------------------------------------------------------------------------------------------->
    <table width="490"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="camp_list_id">
    <form name="camp_list_form" method="post" action="">
        <input name="rdr_extncampno" type="hidden" value ="">
        <tr height="25">
            <td class="gray" align="center" bgcolor="#DDDDDD"> ��ȸ��</td>
            <td class="gray" align="center" width="90" bgcolor="#DDDDDD">��������</td>
            <td class="gray" align="center" width="90" bgcolor="#DDDDDD">��������</td>
            <td class="gray" align="center" width="90" bgcolor="#DDDDDD">�����������</td>
        </tr>
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
        <%for(int i=0; i<campListCount; i++){%>
        <tr height="25">
            <td class="gray" align="center">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
        </tr>
        <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
        <tr bgcolor="#E8E8E8" align="right">
            <td height="25" class="gray" colspan="4">
                <img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
            </td>
        </tr>
    </form>
    </table>

    <!-- ������ �̵� -->
    <table width="490" border="0" cellspacing="0" cellpadding="2" class="title2" id="page_move">
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
                    <jsp:param name = "pagesize" 	value="<%= campListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->
    <!-- ���Ȯ���ȸ ��� �� --------------------------------------------------------------------------------------------------->
</td>
<td width="340" valign="top">

	<!-- ���Ȯ���ȸ ���/�� ���� --------------------------------------------------------------------------------------------------->
    <table id="camp_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
        <tr>
            <td height="25" bgcolor="#EBE9DC" class="title">���Ȯ���ȸ ���</td>
        </tr>
        <tr>
            <td height="3">
            <!--����-->
            </td>
        </tr>
    </table>
    <table id="camp_detail_id" width="340" border="0" cellspacing="0" cellpadding="2" bgcolor="#ffffff" class="gray">
    <form name="camp_detail_form" method="post" action="">
        <input type="hidden" name="accflag" value="I">          <!-- �Է�(I),����(U),����(D) �����ʵ� �ʱⰪ(I) -->
        <input type="hidden" name="rdr_extncampno" value="">    <!-- ���Ȯ���ȸ��ȣ -->
        <input type="hidden" name="closyn" value="">            <!-- ���Ȯ���ȸ �������� -->
        <input type="hidden" name="medicdary" value="">         <!-- ��ü���� ���ڿ� ���� -->
        <input type="hidden" name="alonamtary" value="">        <!-- ����ݾ� ���ڿ� ���� -->
        <input type="hidden" name="qtyaplydtary" value="">      <!-- �μ��������� ���ڿ� ���� -->
        <input type="hidden" name="basivalqtyary" value="">     <!-- ���غμ� ���ڿ� ���� -->
        <tr>
            <td bgcolor="#dddddd"  class="gray" height="25">��ȸ��<font color="#FF0000">*</td>
            <td colspan="3" class="gray" height="25">
                <input name="campnm" type="text" size="20" class="text_box" value="" caption="��ȸ��" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">��������<font color="#FF0000">*</td>
            <td colspan="3" class="gray" height="25">
                <input name="frdt" type="text" size="10" class="text_box" value=""  caption="��������" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">��������<font color="#FF0000">*</td>
            <td colspan="3" class="gray" height="25">
                <input name="todt" type="text" size="10" class="text_box" value="" caption="��������" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">�����������<font color="#FF0000">*</td>
            <td colspan="3" class="gray" height="25">
                <input name="closdt" type="text" size="10" class="text_box" value="" caption="�����������" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td  bgcolor="#dddddd" class="gray" height="25">��������</td>
            <td colspan="3" class="gray" height="25"> N </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">������������<font color="#FF0000">*</td>
            <td colspan="3" class="gray" height="25">
                <input name="alonpayplandt" type="text" size="10" class="text_box" value="" caption="������������" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">���</td>
            <td colspan="3" class="gray" height="25">
                <input name="remk" type="text" style="ime-mode:active;" size="35" class="text_box" value="">
            </td>
        </tr>
        <tr align="center" bgcolor="#EBE9DC">
            <td width="110" class="gray" height="25">��ü</td>
            <td width="75" class="gray" height="25">����</td>
            <td width="80" class="gray" height="25">�μ���������</td>
            <td width="75" class="gray" height="25">���غμ�</td>
        </tr>
    <%-- ��ü ��� �ݺ� ���� --%>
    <%for(int i=0; i<mediListCount; i++){%>
        <tr>
            <td class="gray" height="25" align="center">
        <%-- �ϳ��� ��ü�� �ʼ� �Է��׸� --%>
        <%if( i== 0 ){%>
                <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" class="sel_all" caption="��ü����" notEmpty onchange="javascript:medicd_change(<%= i+1 %>, medicd<%= i+1 %>, alonamt<%= i+1 %>,  qtyaplydt<%= i+1 %>, basivalqty<%= i+1 %>);">
        <%}else{%>
                <select name="medicd<%= i+1 %>" id="medicd<%= i+1 %>" class="sel_all" caption="��ü����" onchange="javascript:medicd_change(<%= i+1 %>, medicd<%= i+1 %>, alonamt<%= i+1 %>,  qtyaplydt<%= i+1 %>, basivalqty<%= i+1 %>);">
        <%}%>
<!-- ��ü�ڵ�, �ڵ�� ��� -->
<%
					writeMediOpt(session, out, ds.curmedicdOptHtml(""), false);
%> 
                </select>
            </td>
            <td class="gray" height="25" align="center">
                <input name="alonamt<%= i+1 %>" id="alonamt<%= i+1 %>" type="text" style="text-align:right" value="" size="8" class="text_box" caption="����" dataType="integer" comma>
            </td>
            <td class="gray" height="25" align="center">
                <input name="qtyaplydt<%= i+1 %>" id="qtyaplydt<%= i+1 %>" type="text" value="" size="10" class="text_box" caption="�μ���������" dataType="date">
            </td>
            <td class="gray" height="25" align="center">
                <input name="basivalqty<%= i+1 %>" id="basivalqty<%= i+1 %>" type="text"  style="text-align:right" value="" size="8" class="text_box" caption="���غμ�" dataType="integer">
            </td>
        </tr>
    <%}%>
    <%-- ��ü ��� �ݺ� �� --%>
    </form>
    </table>

    <!---button-->
    <table width="340" border="0" cellspacing="0" cellpadding="0" class="title2" id="camp_button_id">
        <tr>
            <td align="center" height="2">
            <!--����-->
            </td>
        </tr>
        <tr>
            <td align="center" height="24" bgcolor="#E8E8E8">
                <input type="image" id="add_id" src="/html/comm_img/bu_new.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:camp_add();">
                <input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:camp_save();">
                <input type="image" id="del_id" src="/html/comm_img/bu_del.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:camp_del();">
                <!-- ��� ��ư -->
                <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" onclick="javascript:camp_cancel();">
                <input type="image" id="close_id" src="/html/comm_img/bu_ma.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:camp_close();">
                <input type="image" id="closecancel_id" src="/html/comm_img/bu_cancel01.gif" width="64" height="19" align="absmiddle" onclick="javascript:camp_colsecancel();">
            </td>
        </tr>
    </table>
    <!-- ���Ȯ���ȸ ���/�� �� --------------------------------------------------------------------------------------------------->
    </td>
  </tr>
  <tr>
    <td colspan="2" height="5">
      <!--����-->
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
