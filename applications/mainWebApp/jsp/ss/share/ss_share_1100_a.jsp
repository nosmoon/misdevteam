<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1100_l.jsp
* ��� : �������� Ÿ��߼ۺμ� ��ȸȭ��
* �ۼ����� : 2003-11-20
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
    int listCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
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
	document.taslm_othqty_search_form.invsgdt.focus();
}

// form ������ ��ȿ���� ������ ����
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

//Ÿ��߼ۺμ� �˻� ��ȸ
function list_search(){
    var lo_form1 = document.taslm_othqty_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ��¥������ "/ss/share/1110" �������� ������
    lo_form1.action = "/ss/share/1110";
    lo_form1.target = "ifrm";
    lo_form1.submit();

}

// ������ �̵�
function page_move(pageno) {

    var lo_form1 = document.taslm_othqty_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    // "/ss/share/1110" �������� ������
    lo_form1.action = "/ss/share/1110";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >��������
      &gt; </b> Ÿ��߼ۺμ�</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>

<!--Ÿ��߼ۺμ� �˻� ����-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="taslm_othqty_search_form" method="post" action="" >
    <input type="hidden" name="pageno" value ="1">
    <input type="hidden" name="pagesize" value ="<%= listCount%>">	<!-- �� ȭ��� ����Ʈ �׸� �� -->
    <input type="hidden" name="js_fn_nm" value ="page_move">

	<tr>
		<td bgcolor="#EBE9DC" width="70" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�������</td>
		<td bgcolor="#EBE9DC" class="title" width="300">
			<input name="invsgdt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="�������" dataType="date">
			-
			<input name="invsgdt2" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="�������" dataType="date"> ��) 20040101
		</td>
		<td bgcolor="#EBE9DC" class="title"" align="right">
			<input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" class="sel_all" onclick="javascript:list_search()">
		</td>
	</tr>
	<tr>
		<td height="3" colspan="4">
		<!--����-->
		</td>
	</tr>
</form>
</table>
<!--Ÿ��߼ۺμ� �˻� ��-->

<!--Ÿ��߼ۺμ� ��� ����-->
<table width="830" border="0" cellspacing="0" cellpadding="1" align="center" bgcolor="#FFFFFF" class="gray" id="othqty_list_id">
	<tr bgcolor="#dddddd" align="center" height="23">
		<td class="gray">�������</td>
		<td class="gray" width="120">��&nbsp;</td>
		<td class="gray" width="120">����</td>
		<td class="gray" width="120">����</td>
		<td class="gray" width="120">�߾��Ϻ�</td>
		<td class="gray" width="120">�����Ϻ�</td>
		<td class="gray" width="120">��Ÿ</td>
	</tr>
	<%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
	<%for(int i=0; i<listCount; i++){%>
	<tr>
		<td class="gray" align="center"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
		<td class="gray" width="120"> &nbsp;</td>
	</tr>
	<%}%>
	<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
	<tr bgcolor="#dddddd" align="right">
		<td colspan="7" class="gray" height="23">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
		</td>
	</tr>
</table>
<!--Ÿ��߼ۺμ� ��� ��-->

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
	                <jsp:param name = "pagesize" 	value="<%= listCount%>"/>
	                <jsp:param name = "page_set_gubun" 	value="0"/>
	        </jsp:include>
	        <!--JSP PAGE END------------------------------------------------------------------------------------>
		</td>
  	</tr>
</table>
<!-- ������ �̵� -->
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
