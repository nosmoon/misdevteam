<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1330_a.jsp
* ��� : ������-���ϸ���-����-�ʱ�ȭ��
* �ۼ����� : 2003-12-17
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	int migclosListCount = 10;
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.migclos_search_form.frdt.focus();
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
function migclos_list_search(){
    var lo_form1 = document.migclos_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';
    
    // ��ȸ������ "/ss/admin/1335" �������� ������
    lo_form1.action = "/ss/admin/1335";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �󼼺���
function migclos_detail_view(basidt){

    var lo_form1 = document.migclos_list_form;
    // Ȯ��������ȣ�� "/ss/admin/1340" �������� ������
    lo_form1.basidt.value = basidt;
    lo_form1.action = "/ss/admin/1340";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �߰�
function migclos_add()
{
    var lo_form1 = document.migclos_detail_form;	                // ������ ��
	var lo_table1 = document.all.migclos_detail_title_id;		    // ������ Ÿ��Ʋ ���̺�
	var lo_table2 = document.all.migclos_detail_id;		        	// ������ ��ȸ���� ���̺�

	// ȭ������
	lo_table1.rows[0].cells[0].innerText = '���ϸ������� ���';		// ��ȭ�� ���� ����
	lo_table2.rows[4].cells[1].innerText = 'N';						// �������� ����
	lo_form1.basidt.readOnly=false;									// �������� �Է��׸� Ȱ��ȭ
	document.all.cancel_id.disabled=true;							// ��ҹ�ư ��Ȱ��ȭ
	setInputBackgroundColor();										// readOnly ���� Ȱ��ȭ

	// ���� �׸��� �����ϰ� ȭ�� ����
    var c_form2_elements = lo_form1.elements;
    for( var i =0; i< c_form2_elements.length; i++){
		if(c_form2_elements(i) != lo_form1.closyn){
            c_form2_elements(i).value = "";
		}
    }
    setEventHandler();
    
    lo_form1.accflag.value = 'I';									// �۾������� �Է����� ����
}

// ����
function migclos_save(){
   	var lo_form1 = document.migclos_detail_form;					// ������ ��

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
	lo_form1.basidt.disabled=false;									// �������� �Է��׸� Ȱ��ȭ

    if(lo_form1.accflag.value == 'I') {	        					// �ű��Է��� ��
        lo_form1.action = "/ss/admin/1345";
    } else if(lo_form1.accflag.value == 'U') {						// ���������� ��
        lo_form1.action = "/ss/admin/1350";
    } else {
      return;
    }
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����
function migclos_del(){
    var lo_form1 = document.migclos_detail_form;					// ������ ��

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    if(lo_form1.basidt.value == '') {								// �������� ���翩�θ� Ȯ���Ѵ�.
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }

	var yesno = confirm("�����Ͻðڽ��ϱ�?");
	if(yesno){
		lo_form1.basidt.disabled=false;									// �������� �Է��׸� Ȱ��ȭ
	
	    lo_form1.accflag.value = 'D';									// �۾������� ����('D')�� ����
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/admin/1355";
	    lo_form1.submit();
	}	    
}

// ���
function migclos_cancel(){

    var lo_form1 = document.migclos_detail_form;	       			// ������ ��
	var lo_table1 = document.all.migclos_detail_title_id;		   	// ������ Ÿ��Ʋ ���̺�
	var lo_table2 = document.all.migclos_detail_id;		        	// ������ ��ȸ���� ���̺�

//	lo_table1.rows[0].cells[0].innerText = '���ϸ������� ��';		// ��ȭ�� ���� ����
	lo_form1.reset();												// ������ ���� �� �缳��
	setEventHandler();												// �� �缳�� �� �̺�Ʈ�ڵ鷯 ȣ��
    setEnterKeyEventHandler();                                      // �� �缳�� �� �̺�Ʈ�ڵ鷯 ȣ��
}

// ����
function migclos_close(){
    var lo_form1 = document.migclos_detail_form;					// ������ ��

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    if(lo_form1.basidt.value == '') {								// �������� ���翩�θ� Ȯ���Ѵ�.
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }

	lo_form1.basidt.disabled=false;									// �������� �Է��׸� Ȱ��ȭ
    lo_form1.accflag.value = 'Y';									// �۾������� �������� ����
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/admin/1360";
    lo_form1.submit();
}

// ���� ���
function migclos_colsecancel(){
    var lo_form1 = document.migclos_detail_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    if(lo_form1.basidt.value == '') {								// �������� ���翩�θ� Ȯ���Ѵ�.
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }
	lo_form1.basidt.disabled=false;									// �������� �Է��׸� Ȱ��ȭ
    lo_form1.accflag.value = 'N';									// �۾������� ������ҷ� ����
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/admin/1365";
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {

    var lo_form1 = document.migclos_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }
    // Ȯ���ȸ��� ��ȸ������ "/ss/admin/1335" �������� ������
    lo_form1.action = "/ss/admin/1335";
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

    var lo_form1 = document.migclos_search_form;
		
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
        <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >������ >
        </b>���ϸ��� &gt; ���� </td>
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

    <!-- ���ϸ������� �˻� ���� --------------------------------------------------------------------------------------------------->
    <table width="489" border="0"  cellpadding="1" cellspacing="0">
    <form name="migclos_search_form" method="post" action="" >
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
	            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:migclos_list_search();window.event.returnValue=false;">
        	</td>
        </tr>
        <tr>
            <td height="3">
            <!--����-->
            </td>
        </tr>
    </form>
    </table>
    <!-- ���ϸ������� �˻� �� --------------------------------------------------------------------------------------------------->

    <!-- ���ϸ������� ��� ���� --------------------------------------------------------------------------------------------------->
    <table width="490"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="migclos_list_id">
    <form name="migclos_list_form" method="post" action="">
        <input name="basidt" type="hidden" value ="">
        <tr bgcolor="#DDDDDD" height="25">
            <td class="gray" align="center">��������(���)</td>
            <td class="gray" align="center" width="90">��������</td>
            <td class="gray" align="center" width="90">��������</td>
            <td class="gray" align="center" width="90">�����������</td>
        </tr>
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
        <%for(int i=0; i<migclosListCount; i++){%>
        <tr height="25">
            <td class="gray" align="center">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
            <td class="gray" align="center" width="90">&nbsp;</td>
        </tr>
        <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
        <tr bgcolor="#DDDDDD" align="right">
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
                    <jsp:param name = "pagesize" 	value="<%= migclosListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->
    <!-- ���ϸ������� ��� �� --------------------------------------------------------------------------------------------------->
</td>
<td width="340" valign="top">

	<!-- ���ϸ������� ���/�� ���� --------------------------------------------------------------------------------------------------->
    <table id="migclos_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
        <tr>
            <td height="25" bgcolor="#EBE9DC" class="title">���ϸ������� ���</td>
        </tr>
        <tr>
            <td height="3">
            <!--����-->
            </td>
        </tr>
    </table>
    <table id="migclos_detail_id" width="340" border="0" cellspacing="0" cellpadding="2" bgcolor="#ffffff" class="gray">
    <form name="migclos_detail_form" method="post" action="">
        <input type="hidden" name="accflag" value="I">          <!-- �Է�(I),����(U),����(D) �����ʵ� �ʱⰪ(I) -->
        <input type="hidden" name="closyn" value="">            <!-- ���ϸ������� �������� -->
        <tr>
            <td bgcolor="#dddddd"  width="90" class="gray" height="25">��������(���)<font color="#FF0000">*</font></td>
            <td colspan="3" class="gray" height="25">
                <input name="basidt" type="text" size="7" class="text_box" value="" caption="��������(���)" dataType="month" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" width="90" class="gray" height="25">��������<font color="#FF0000">*</font></td>
            <td colspan="3" class="gray" height="25">
                <input name="frdt" type="text" size="10" class="text_box" value=""  caption="��������" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" width="90" class="gray" height="25">��������<font color="#FF0000">*</font></td>
            <td colspan="3" class="gray" height="25">
                <input name="todt" type="text" size="10" class="text_box" value="" caption="��������" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" width="90" class="gray" height="25">�����������<font color="#FF0000">*</font></td>
            <td colspan="3" class="gray" height="25">
                <input name="closdt" type="text" size="10" class="text_box" value="" caption="�����������" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td  bgcolor="#dddddd" width="90" class="gray" height="25">��������</td>
            <td colspan="3" class="gray" height="25"> N </td>
        </tr>
    </form>
    </table>

    <!---button-->
    <table width="340" border="0" cellspacing="0" cellpadding="0" class="title2" id="migclos_button_id">
        <tr>
            <td align="center" height="2">
            <!--����-->
            </td>
        </tr>
        <tr>
            <td align="center" height="24" bgcolor="#E8E8E8">
                <input type="image" id="add_id" src="/html/comm_img/bu_new.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:migclos_add();">
                <input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:migclos_save();">
                <input type="image" id="del_id" src="/html/comm_img/bu_del.gif" width="39" height="19" border="0" align="absmiddle" onclick="javascript:migclos_del();">
                <!-- ��� ��ư -->
                <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" onclick="javascript:migclos_cancel();">
                <input type="image" id="close_id" src="/html/comm_img/bu_ma.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:migclos_close();">
                <input type="image" id="closecancel_id" src="/html/comm_img/bu_cancel01.gif" width="64" height="19" align="absmiddle" onclick="javascript:migclos_colsecancel();">
            </td>
        </tr>
    </table>
    <!-- ���ϸ������� ���/�� �� --------------------------------------------------------------------------------------------------->
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
