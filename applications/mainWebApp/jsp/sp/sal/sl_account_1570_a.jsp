<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/comm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_account_1570_a.jsp
* ��� 	 	 : �Ǹ�����-�渮-����(����) ����������  �ʱ�ȭ��
* �ۼ����� 	 : 2012-07-30
* �ۼ��� 	 : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    int maxline = 6;			// ���⳻�� ��� ���ڵ��
    int maxline2 = 15;			// �Աݳ��� ��� ���ڵ��
%>

<html>
<head>
<script language="javascript">

	//�������ʱ�ȭ�� ��ư������ EventHandlerȣ��
	function jsInit(){

		setEventHandler();
		setEnterKeyEventHandler();
		setInputBackgroundColor();
	}

	// Ÿ��߼ۺμ� ����Ʈ ��ȸ(����Ű)
	function list_search_enter(tab_id) {
        	if(event.keyCode == 13) list_search(tab_id);
	}


	// ����IS���� ����͸� ����Ʈ ��ȸ
	function list_search(tab_id) {

		if(tab_id == 0) {
			lo_form = document.subsfeeadjm01_search_form;
	    		lo_form.action = "1571";
		} else {
			lo_form = document.subsfeeadjm02_search_form;
			lo_form.action = "1572";
		}

	    lo_form.method = "post";
	    lo_form.target = "ifrm";
	    check_all(lo_form);
	}


	// submit�� ȣ��
	function check_all(form){
	        if(!validate(form)) return false;
	        else{
	            makeValue(form);
	            form.submit();
	        }
	}


	//��¹�ư display ����
	function validate_print(p1, p2) {
		document.all['img_taxform01'].style.display = "none";
    		document.all['img_taxform01'].style.display = p1;
    		
		document.all['img_taxform02'].style.display = "none";
    		document.all['img_taxform02'].style.display = p2;
	}
	

	// �ŷ���ǥ ���
	function print_taxform(print_type) {
	        var ls_return = "";
	        var lo_form = document.subsfeeadjm01_search_form;
	        var s_sale_yymm = lo_form.sale_yymm.value.replace(/\//g,'');
		var url = "";

		if(print_type == "1") {
			//��꼭 ���
			url = "/servlet/account/1573";
		} else {
			//���ݰ�꼭 ���
			url = "/servlet/account/1575";
		}
			
	        ls_return = jsNewModalWinNoS(url, s_sale_yymm, "680", "500");
	        return;
        }
	
	
	// TAB ����
	function tab_change(tab_id, fr, to) {
		var i = 1, j = 1, a = 1, b = 4;
		var tab_list_id = "tb_" + tab_id.substring(3);
		
		document.all['td_subsfeeadjm01'].background = "/html/comm_img/tb_05.gif";
		document.all['td_subsfeeadjm02'].background = "/html/comm_img/tb_05.gif";
		document.all[tab_id].background = "/html/comm_img/tb1_05.gif";
		
		for(i=1; i<=6; i++) {
			document.all['tdt_0'+i].background = "/html/comm_img/tb_0" + j + ".gif";
			j = (j>=3)?1:j+1;
		}
		j=4;
		for(i=1; i<=6; i++) {
			if(i==2||i==5) {
			} else {
				document.all['td_0'+i].background = "/html/comm_img/tb_0" + j + ".gif";
			}
			j = (j>=6)?4:j+1;
		}
		

		for(i=fr; i<=to; i++ ) {
			document.all["tdt_0"+i].background = "/html/comm_img/tb1_0" + a + ".gif";
			if(i==2||i==5) {
			} else {
				document.all["td_0"+i].background = "/html/comm_img/tb1_0"  + b + ".gif";
			}
			a++, b++;
		}
		
		document.all['tb_subsfeeadjm01'].style.display = "none";
		document.all['tb_subsfeeadjm02'].style.display = "none";
		document.all[tab_list_id].style.display = "inline";
	}


</script>
<title>�渮-����(����)</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
</head>
<body onload="jsInit();" bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">�渮
      &gt; </b>����������</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<table id="subsfeeadjm_tab_id" width="830" border="0"  align="center" cellpadding="0" cellspacing="0" bgcolor="#ffffff">
<tr>
	<td width="5"  height=3 background="/html/comm_img/tb1_01.gif" id="tdt_01"></td>
        <td width="80" height=3 background="/html/comm_img/tb1_02.gif" id="tdt_02"></td>
        <td width="5"  height=3 background="/html/comm_img/tb1_03.gif" id="tdt_03"></td>
	<td width="5"  height=3 background="/html/comm_img/tb_01.gif"  id="tdt_04"></td>
        <td width="80" height=3 background="/html/comm_img/tb_02.gif"  id="tdt_05"></td>
        <td width="5"  height=3 background="/html/comm_img/tb_03.gif"  id="tdt_06"></td>
	<td width="*"></td>
</tr>
<tr>
	<td background="/html/comm_img/tb1_04.gif" height="20" width="5"  id="td_01"></td>
	<td background="/html/comm_img/tb1_05.gif" height="20" width="80" align="center" id="td_subsfeeadjm01" onclick="tab_change(this.id, 1, 3);">���⳻��</td>
	<td background="/html/comm_img/tb1_06.gif" height="20" width="5"  id="td_03"></td>
	<td background="/html/comm_img/tb_04.gif" height="20" width="5"   id="td_04"></td>
	<td background="/html/comm_img/tb_05.gif" height="20" width="80"  align="center" id="td_subsfeeadjm02" onclick="tab_change(this.id, 4, 6);">�Աݳ���</td>
   	<td background="/html/comm_img/tb_06.gif" height="20" width="5"   id="td_06"></td>
        <td width="*">&nbsp;</td>
</tr>
</table>
<!--���⳻�� TAB ����------------------------------------------------------------------------------------------------------------->
<table id="tb_subsfeeadjm01" width="830" border="0" cellspacing="0" cellpadding="2" align="center" style="display:inline">
<tr>
	<td>
<!--���⳻�� �˻� start-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="subsfeeadjm01_search_form" method="post" action="" >

  <tr>
    <td bgcolor="#EBE9DC" class="title" width="65"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������</td>
    <td bgcolor="#EBE9DC" class="title" width="58">
      <input name="sale_yymm" type="text" tabIndex="1" size="7" class="text_box" value="<%=Util.getDate().substring(0,6)%>" dataType="month" caption="�ŷ���ǥ(�˻�)" onkeydown="list_search_enter(0);">
    </td>
    <td bgcolor="#EBE9DC" class="title" width="*" align="left">
      <a href="javascript:list_search(0);"><img src="/html/comm_img/bu_search.gif" width="36" height="19" align="absright" ></a>&nbsp;
    </td>
  </tr>
  <tr>
    <td height="3" colspan="3">
      <!--����-->
    </td>
  </tr>
  </form>
</table>
<table id="subsfeeadjm01_list_id" width="830" border="0"  align="center" cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff">
  <tr align="center" >
    <td width="*" height="25" class="gray" bgcolor="#dddddd">�ŷ�ó</td>
    <td width="150" height="25" class="gray" bgcolor="#dddddd">���ڸ�</td>
    <td width="150" height="25" class="gray" bgcolor="#dddddd">�ݾ�</td>
  </tr>
    <%-- page_rec ��ŭ �ʱ� ��������ä��� --%>
    <%
		for (int i=0; i < maxline; i++) {
    %>
  <tr align="left" >
    <td align="right" class="gray">&nbsp;</td>
    <td align="right" class="gray">&nbsp;</td>
    <td align="right" class="gray">&nbsp;</td>
  </tr>
    <%
	}
    %>
  <tr  bgcolor="#dddddd" align="right" >
    <td align="center" class="gray" height="23" colspan="2">��&nbsp;&nbsp;��</td>
    <td align="right"  class="gray">0&nbsp;</td>
  </tr>
  <tr>
</table>

<!--��꼭 ����κ�-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr>
    <td bgcolor="#EBE9DC" height="3">
      <!--����-->
    </td>
  </tr>
  <tr>
    <td bgcolor="#EBE9DC" width="*" align="right">
      <a href="javascript:print_taxform(1);"><img id="img_taxform01" src="/html/comm_img/bu_print06.gif" align="absright" style="display:none"></a>&nbsp;
      <a href="javascript:print_taxform(2);"><img id="img_taxform02" src="/html/comm_img/bu_print08.gif" align="absright" style="display:none"></a>&nbsp;
    </td>
  </tr>
  <tr>
    <td bgcolor="#EBE9DC" height="3">
      <!--����-->
    </td>
  </tr>
</table>
<table id="subsfeeadjm01_taxlist_id" width="830" border="0"  align="center" cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff">
  <tr align="center" >
    <td width="*" height="25" class="gray" bgcolor="#dddddd">�ŷ�ó</td>
    <td width="80" height="25" class="gray" bgcolor="#dddddd">�μ�</td>
    <td width="150" height="25" class="gray" bgcolor="#dddddd">�ݾ�</td>
    <td width="150" height="25" class="gray" bgcolor="#dddddd">���౸��</td>
  </tr>
    <%-- page_rec ��ŭ �ʱ� ��������ä��� --%>
    <%
		for (int i=0; i < maxline; i++) {
    %>
  <tr align="left" >
    <td align="right" class="gray">&nbsp;</td>
    <td align="right" class="gray">&nbsp;</td>
    <td align="right" class="gray">&nbsp;</td>
    <td align="right" class="gray">&nbsp;</td>
  </tr>
    <%
	}
    %>
</table>
	</td>
</tr>
</table>
<!--�Աݳ��� TAB ����------------------------------------------------------------------------------------------------------------->
<table id="tb_subsfeeadjm02" width="830" border="0" cellspacing="0" cellpadding="2" align="center" style="display:none">
<tr>
	<td>
<!--�Աݳ��� �˻� start-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="subsfeeadjm02_search_form" method="post" action="" >

  <tr>
    <td bgcolor="#EBE9DC" class="title" width="65"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ա�����</td>
    <td bgcolor="#EBE9DC" class="title" width="160">
      <input name="fr_dt" type="text" tabIndex="1" size="10" class="text_box" value="<%=Util.getDate()%>" dataType="date" caption="�Ա�����(�˻�)from">&nbsp;~
      <input name="to_dt" type="text" tabIndex="1" size="10" class="text_box" value="<%=Util.getDate()%>" dataType="date" caption="�Ա�����(�˻�)to" onkeydown="list_search_enter(1);">
    </td>
    <td bgcolor="#EBE9DC" class="title" width="*" align="left">
      <a href="javascript:list_search(1);"><img src="/html/comm_img/bu_search.gif" width="36" height="19" align="absright" ></a>&nbsp;
    </td>
  </tr>
  <tr>
    <td height="3" colspan="3">
      <!--����-->
    </td>
  </tr>
  </form>
</table>
<table id="subsfeeadjm02_list_id" width="830" border="0"  align="center" cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff">
  <tr align="center" >
    <td width="80" height="25" class="gray" bgcolor="#dddddd">�Ա�����</td>
    <td width="*" height="25" class="gray" bgcolor="#dddddd">�ŷ�ó</td>
    <td width="150" height="25" class="gray" bgcolor="#dddddd">���ڸ�</td>
    <td width="150" height="25" class="gray" bgcolor="#dddddd">����</td>
    <td width="150" height="25" class="gray" bgcolor="#dddddd">�ݾ�</td>
  </tr>
    <%
		for (int i=0; i < maxline2; i++) {
    %>
  <tr align="left" >
    <td align="right" class="gray">&nbsp;</td>
    <td align="right" class="gray">&nbsp;</td>
    <td align="right" class="gray">&nbsp;</td>
    <td align="right" class="gray">&nbsp;</td>
    <td align="right" class="gray">&nbsp;</td>
  </tr>
    <%
	}
    %>
  <tr  bgcolor="#dddddd" align="right" >
    <td align="center" class="gray" height="23" colspan="4">��&nbsp;&nbsp;��</td>
    <td align="right"  class="gray">0&nbsp;</td>
  </tr>
  <tr>
</table>
	</td>
</tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=00 height=00></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
