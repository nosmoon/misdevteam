<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1340_a.jsp
* ��� : Ȯ����Ȳ-���Ȯ��-�۱ݰ���-�ʱ�ȭ��
* �ۼ����� : 2003-12-15
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EMPCAMPNODataSet ds = (SS_L_EMPCAMPNODataSet)request.getAttribute("ds");
	int rmttListCount	= 10;		// �� ȭ��� ����Ʈ �׸� ��
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
	document.rmtt_search_form.frdt.focus();
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
function list_search()
{
    var lo_form1 = document.rmtt_search_form;

	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

    // ȭ������� ������ ���� ���Ȯ���ȸ �Ǵ� �Ⱓ�� �ʼ��� ������ �� �˻��ϰ� �Ѵ�.
    if( (lo_form1.rdr_extncampno.value == '') && ((lo_form1.frdt.value == '') || (lo_form1.frdt.value == '')) ){
		alert("Ȯ���ȸ �Ǵ� �Ⱓ�� �����ϼ���");
		return;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // Ȯ���û��� ��ȸ������ "/ss/extn/1350" �������� ������
    lo_form1.action = "/ss/extn/1350";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �۱� ��� ����Ʈ
function print_list(){
    var lo_form1 = document.rmtt_search_form;

    // ȭ������� ������ ���� ���Ȯ���ȸ �Ǵ� �Ⱓ�� �ʼ��� ������ �� �˻��ϰ� �Ѵ�.
    if( (lo_form1.rdr_extncampno.value == '') && ((lo_form1.frdt.value == '') || (lo_form1.frdt.value == '')) ){
		alert("Ȯ���ȸ �Ǵ� �Ⱓ�� �����ϼ���");
		return;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// ��â�� ����Ʈ�� ���� window�� ����.
    opt = ",toolbar=no,menubar=yes,location=no,scrollbars=yes,status=no,resizable=yes";
    var lw_print_window = window.open("about:blank", "print_target", "left=" + 0 + ",top=" +  0 + ",width=" + 800 + ",height=" + 600  + opt );
    lo_form1.action = "/ss/extn/1360";
    lo_form1.target = "print_target";
    lo_form1.submit();
    lw_print_window.focus();
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.rmtt_search_form;

    // ȭ������� ������ ���� ���Ȯ���ȸ �Ǵ� �Ⱓ�� �ʼ��� ������ �� �˻��ϰ� �Ѵ�.
    if( (lo_form1.rdr_extncampno.value == '') && ((lo_form1.frdt.value == '') || (lo_form1.frdt.value == '')) ){
		alert("Ȯ���ȸ �Ǵ� �Ⱓ�� �����ϼ���");
		return;
    }

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // Ȯ���û��� ��ȸ������ "/ss/extn/1350" �������� ������
    lo_form1.action = "/ss/extn/1350";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >Ȯ����Ȳ
       </b>���Ȯ�� &gt; �۱� </td>
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

    <!--���Ȯ�� ���� �˻� ���� ---------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" id="rmtt_search_id">
		<form name="rmtt_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                <!-- ���� ������ ��ȣ -->
        <input name="pagesize" type="hidden" value ="<%= rmttListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
		<tr>
			<td class="title"  bgcolor="#EBE9DC" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">Ȯ���ȸ</td>
			<td class="title"  width="120">
				<select name="rdr_extncampno" class="sel_all">
					<option value='' selected>����</option>
					<%= ds.curcommlistOptHtml("") %><!-- ���Ȯ���ȸ��ȣ, ���Ȯ���ȸ�� ��� -->
				</select>
			</td>
			<td class="title"  bgcolor="#EBE9DC" width="50"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ</td>
			<td class="title"  width="200">
	            <input name="frdt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="��������" dataType="date">
	            -
	            <input name="todt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="��������" dataType="date">
			</td>
			<td class="title"  bgcolor="#EBE9DC" width="50"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
			<td class="title"  width="80">
				<select name="sortflag" class="sel_all">
					<option value="" selected>����</option>
					<option value="1">��ȸ</option>
					<option value="2">ȸ��</option>
					<option value="3">����</option>
				</select>
			</td>
			<td class="title"  align="right">
		        <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;">
			</td>
		</tr>

		</form>
	</table>
    <!--���Ȯ�� ���� �˻� �� ---------------------------------------------------------------------------->

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
			<td  height="27" bgcolor="#EBE9DC" class="title">���Ȯ���ȸ �۱ݸ��</td>
			<td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="50">
				<input type="image" src="/html/comm_img/bu_print.gif" width="39" height="19" onclick="jsInit();javascript:print_list();window.event.returnValue=false;">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
			<!--����-->
			</td>
		</tr>
	</table>

    <!--���Ȯ�� ���� ��� ���� ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="rmtt_list_id">
    <form name="rmtt_list_form" method="post" action="" >
        <input name="print" type="hidden" value ="">
		<tr bgcolor="#DDDDDD" height="23">
			<td width="100" class="gray" align="center">��ȸ��</td>
			<td width="90"  class="gray" align="center">�̸�</td>
			<td width="100" class="gray" align="center">ȸ��</td>
			<td width="90"  class="gray" align="center">�μ�</td>
			<td width="100" class="gray" align="center">������</td>
			<td width="100" class="gray" align="center">����</td>
			<td width="150" class="gray" align="center">���¹�ȣ</td>
			<td class="gray" align="center">�ݾ�</td>
		</tr>
        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
        <%for(int i=0; i<rmttListCount; i++){%>
        <tr>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90"  class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90"  class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="150" class="gray" align="center">&nbsp;</td>
			<td class="gray" align="center">&nbsp;</td>
        </tr>
        <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
		<tr bgcolor="#dddddd">
			<td colspan="8" class="gray" align="right" height="23">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѱݾ� �� </b>&nbsp;&nbsp;&nbsp;
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
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
                    <jsp:param name = "pagesize" 	value="<%= rmttListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->

    <!--���Ȯ�� ���� ��� �� ---------------------------------------------------------------------------->
	</td>
  </tr>
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
