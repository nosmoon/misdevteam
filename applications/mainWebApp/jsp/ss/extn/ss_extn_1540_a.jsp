<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1540_a.jsp
* ��� : Ȯ����Ȳ-Ȯ��뿪���-(Ȯ����)-�ʱ�ȭ��
* �ۼ����� : 2003-12-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_SERVCLOS_INITDataSet ds = (SS_L_RDR_EXTN_SERVCLOS_INITDataSet)request.getAttribute("ds");
	int servListCount = 20;
    int mediListCount = 13;
	String paramGbn = "##";
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
	document.serv_search_form.frdt.focus();
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
function serv_list_search(){
    var lo_form1 = document.serv_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';
    // Ȯ��뿪��븶�� ��� ��ȸ������ "/ss/extn/1545" �������� ������
    lo_form1.action = "/ss/extn/1545";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �󼼺���
function serv_detail_view(basidt){
    var lo_form1 = document.serv_list_form;
    // Ȯ��뿪��븶�� �������ڸ� "/ss/extn/1550" �������� ������
    lo_form1.basidt.value = basidt;
    lo_form1.action = "/ss/extn/1550";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����
function serv_close(){
    var lo_form1 = document.serv_detail_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    if(lo_form1.basidt.value == '') {								// �������� ���翩�θ� Ȯ���Ѵ�.
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }

	lo_form1.basidt.disabled=false;									// �������� �Է��׸� Ȱ��ȭ

    lo_form1.accflag.value = 'SY';									// �۾������� ������� �������� ����
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/extn/1555";
    lo_form1.submit();
}

// ���� ���
function serv_colsecancel(){
    var lo_form1 = document.serv_detail_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    if(lo_form1.basidt.value == '') {								// �������� ���翩�θ� Ȯ���Ѵ�.
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }

	lo_form1.basidt.disabled=false;									// �������� �Է��׸� Ȱ��ȭ

    lo_form1.accflag.value = 'SN';									// �۾������� ������� ������ҷ� ����
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/extn/1560";
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.serv_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }
    // Ȯ��뿪��븶�� ��� ��ȸ������ "/ss/extn/1545" �������� ������
    lo_form1.action = "/ss/extn/1545";
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

    var lo_form1 = document.serv_search_form;
		
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
        </b>����ISȮ�� &gt; ���� </td>
    </tr>
    <tr>
        <td height="10">
        <!--������ ���� ����-->
        </td>
    </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<tr>
    <td width="400" valign="top">

    <!-- Ȯ��뿪��븶�� �˻� ���� --------------------------------------------------------------------------------------------------->
    <table width="400" border="0"  cellpadding="1" cellspacing="0">
    <form name="serv_search_form" method="post" action="" >
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
	            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:serv_list_search();window.event.returnValue=false;">
        	</td>
        </td>
        </tr>
        <tr>
            <td height="3">
            <!--����-->
            </td>
        </tr>
    </form>
    </table>
    <!-- Ȯ��뿪��븶�� �˻� �� --------------------------------------------------------------------------------------------------->

    <!-- Ȯ��뿪��븶�� ��� ���� --------------------------------------------------------------------------------------------------->
    <table width="400"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="serv_list_id">
    <form name="serv_list_form" method="post" action="">
        <input name="basidt" type="hidden" value ="">
        <tr>
            <td height="25" class="gray"  align="center" bgcolor="#DDDDDD"> ��������(���)</td>
            <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD">
              ��������</td>
            <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD">
              ��������</td>
            <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD">
              ��������</td>
        </tr>
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
        <%for(int i=0; i<servListCount; i++){%>
        <tr>
            <td height="25" class="gray" align="center">&nbsp;</td>
            <td class="gray" align="center" height="25" width="90">&nbsp;</td>
            <td class="gray" align="center" height="25" width="90">&nbsp;</td>
            <td class="gray" align="center" height="25" width="90">&nbsp;</td>
        </tr>
        <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
        <tr bgcolor="#E8E8E8" align="right">
            <td  height="25" class="gray" colspan="4">
                <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�ѰǼ� <b> ��</b>
            </td>
        </tr>
    </form>
    </table>

    <!-- ������ �̵� -->
    <table width="400" border="0" cellspacing="0" cellpadding="2" class="title2" id="page_move">
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
                    <jsp:param name = "pagesize" 	value="<%= servListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
                <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->
    <!-- Ȯ��뿪��븶�� ��� �� --------------------------------------------------------------------------------------------------->
</td>
<td width="430" valign="top">

	<!-- Ȯ��뿪��븶�� ���/�� ���� --------------------------------------------------------------------------------------------------->
    <table id="serv_detail_title_id" width="100%" border="0" cellspacing="0" cellpadding="2">
        <tr>
            <td height="25" bgcolor="#EBE9DC" class="title">����ISȮ�帶�� ��</td>
        </tr>
        <tr>
            <td height="3">
            <!--����-->
            </td>
        </tr>
    </table>
    <table id="serv_detail_id" width="430" border="0" cellspacing="0" cellpadding="2" bgcolor="#ffffff" class="gray">
    <form name="serv_detail_form" method="post" action="">
        <input type="hidden" name="accflag" value="">          	<!-- ����,������� �����ʵ� -->
        <input type="hidden" name="splychrgclosyn" value="">    <!-- Ȯ��뿪��븶�� ������� �������� -->
        <tr>
            <td bgcolor="#dddddd"  class="gray" height="25">��������</td>
            <td colspan="4" class="gray" height="25">
                <input name="basidt" type="text" size="20" class="text_box" value="" caption="��������"  dataType="month" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">��������</td>
            <td colspan="4" class="gray" height="25">
                <input name="frdt" type="text" size="10" class="text_box" value=""  caption="��������" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">��������</td>
            <td colspan="4" class="gray" height="25">
                <input name="todt" type="text" size="10" class="text_box" value="" caption="��������" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">��������</td>
            <td colspan="4" class="gray" height="25">
                <input name="closdt" type="text" size="10" class="text_box" value="" caption="��������" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td  bgcolor="#dddddd" class="gray" height="25">����IS ��������</td>
            <td colspan="4" class="gray" height="25"> N </td>
        </tr>
        <tr>
            <td  bgcolor="#dddddd" class="gray" height="25">������ ��������</td>
            <td colspan="4" class="gray" height="25"> N </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">û������</td>
            <td colspan="4" class="gray" height="25">
                <input name="clamdt" type="text" size="10" class="text_box" value="" caption="û������" dataType="date" notEmpty>
            </td>
        </tr>
        <tr>
            <td bgcolor="#dddddd" class="gray" height="25">���</td>
            <td colspan="4" class="gray" height="25">
                <input name="remk" type="text" size="35" class="text_box" value="">
            </td>
        </tr>
        <tr align="center" bgcolor="#EBE9DC">
            <td width="100" class="gray" height="25" align="center">��ü</td>
            <td width="100" class="gray" height="25" align="center">�μ�</td>
            <td width="75" class="gray" height="25" align="center">����Ʈ</td>
            <td width="75" class="gray" height="25" align="center">����</td>
            <td class="gray" height="25" align="center">��</td>
        </tr>
    <%-- ��ü ��� �ݺ� ���� --%>
    <%for(int i=0; i<mediListCount; i++){%>
        <tr>
            <td class="gray" height="25" align="center">&nbsp;</td>
            <td class="gray" height="25" align="center">&nbsp;</td>
            <td class="gray" height="25" align="center">&nbsp;</td>
            <td class="gray" height="25" align="center">&nbsp;</td>
            <td class="gray" height="25" align="center">&nbsp;</td>
        </tr>
    <%}%>
    <%-- ��ü ��� �ݺ� �� --%>
    </form>
    </table>

    <!---button-->
    <table width="430" border="0" cellspacing="0" cellpadding="0" class="title2" id="serv_button_id">
        <tr>
            <td align="center" height="2">
            <!--����-->
            </td>
        </tr>
        <tr>
            <td align="center" height="24" bgcolor="#E8E8E8">
                <input type="image" id="close_id" src="/html/comm_img/bu_ma.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:serv_close();">
                <input type="image" id="closecancel_id" src="/html/comm_img/bu_cancel01.gif" width="64" height="19" align="absmiddle" onclick="javascript:serv_colsecancel();">
            </td>
        </tr>
    </table>
    <!-- Ȯ��뿪��븶�� ���/�� �� --------------------------------------------------------------------------------------------------->
    </td>
  </tr>
  <tr>
    <td colspan="2" height="5">
      <!--����-->
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="400" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
