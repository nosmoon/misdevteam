<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1600_a.jsp
* ��� : ��������-Billing�ڵ���ü-���γ���
* �ۼ����� : 2004-03-22
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_PYMT_INITDataSet ds = (SS_L_PYMT_INITDataSet)request.getAttribute("ds");
    applySession = false;	// ���� ���� ����
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
    }

	// �����ڸ�� ��ȸ
	function pymt_list() {
		var lo_form = document.pymt_form;

		if(!check_all(lo_form)) return;

		lo_form.method = "post";
		lo_form.target = "ifrm";
		lo_form.action = "/ss/brsup/1710";
		lo_form.submit();
	}

	// ���ΰ���� ��ȸ
	function pymtcntr_list() {
		var lo_form = document.pymtcntr_form;

		if(!check_all(lo_form)) return;

		lo_form.method = "post";
		lo_form.target = "ifrm";
		lo_form.action = "/ss/brsup/1720";
		lo_form.submit();
	}

	// ���γ��� ��ȸ
	function pymtptcr_list() {
		var lo_form = document.pymtptcr_form;

		if(!check_all(lo_form)) return;

		lo_form.method = "post";
		lo_form.target = "ifrm";
		lo_form.action = "/ss/brsup/1730";
		lo_form.submit();
	}

	// �� ��ȿ�� üũ
	function check_all(form){
	    if(!validate(form)) return false;
	    else{
	        makeValue(form);
	        return true;
	    }
	}
-->
</script>
</head>
<body onload="jsInit()" bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >��������
      > </b> Billing�ڵ���ü &gt; ���γ���</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<!--������ ���� ū���̺� -->
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td valign="top">
      <!-- �ڵ���ü ������ ��ϰ˻� -->
      <table width="830" border="0"  cellpadding="0" cellspacing="0" align="center">
      <form name="pymt_form" method="post" action="">
        <tr>
          <td height="26" bgcolor="#D2C69B"  class="title" width="120">�ڵ���ü ������
            ���</td>
          <td height="26" bgcolor="#EBE9DC"  class="title" width="30"><img src="/html/comm_img/search4.gif" width="13" height="26"></td>
          <td height="26" bgcolor="#EBE9DC"  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ü����
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title">
            <select name="shftclsf" class="sel_all">
              <option value="" selected>��ü</option>
              <%=ds.rsltcurOptHtml("")%>
            </select>
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="70"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ü����
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title">
            <select name="shftstatclsfcd" class="sel_all">
              <option value="" selected>��ü</option>
              <option value="10">��û��</option>
              <option value="20">��ü��</option>
              <option value="30">����</option>
            </select>
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="110"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������/�����ڸ�
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="100">
            <input name="pymt" type="text" size="8" class="text_box" notEmpty caption="������/�����ڸ�">
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" align="right">
            <input type="image" onclick="pymt_list();window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif" width="36"  align="absmiddle">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="8">
            <!--����-->
          </td>
        </tr>
      </form>
      </table>
      <!-- �ڵ���ü ������ ��ϰ˻� �� -->
      <!--Ÿ��Ʋ ��-->
      <!-- �ڵ���ü ������ ���-->
      <table width="830" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray">
        <tr align="center" bgcolor="#dddddd" >
          <td width="90" class="gray" >������</td>
          <td width="80" class="gray" >������</td>
          <td width="200" class="gray" >������ �ֹ�(�����)��ȣ</td>
          <td width="80" class="gray" >������</td>
          <td width="80" class="gray" >�����</td>
          <td width="143" class="gray" >����/ī���ȣ</td>
          <td width="70" class="gray" >��ü���ÿ�</td>
          <td width="70" class="gray" >����</td>
        </tr>
        <tr>
          <td height="120" colspan="8" class="gray" style="padding:0;"><iframe src="/html/brsup/ss_brsup_1710_l.html" name="ifrm_1" width="830" height="120" frameborder="0" marginheight="0" marginwidth="0" scrolling="yes"></iframe></td>
          </tr>
      </table>
      <!-- �ڵ���ü ������ ��� end-->
    </td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���ѿ��� -->
    </td>
  </tr>
  <tr>
    <td valign="top">
      <!-- ���ΰ�� ��ϰ˻� -->
      <table width="830" border="0"  cellpadding="0" cellspacing="0" align="center">
      <form name="pymtcntr_form" method="post" action="">
        <tr>
          <td height="26" bgcolor="#D2C69B"  class="title" width="120">���ΰ�� ���</td>
          <td height="26" bgcolor="#EBE9DC"  class="title" width="30"><img src="/html/comm_img/search4.gif" width="13" height="26"></td>
          <td height="26" bgcolor="#EBE9DC"  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��������</td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="150">
            <select name="subsstat" class="sel_all">
              <option value="" selected>��ü</option>
              <option value="10">������</option>
              <option value="20">����</option>
            </select>
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" align="right">
            <input type="image" onclick="pymtcntr_list();window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif" width="36"  align="absmiddle">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="4">
            <!--����-->
          </td>
        </tr>
      </form>
      </table>
      <!-- �˻� �� -->
      <!--  ���-->
      <table width="830" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray">
        <tr bgcolor="#dddddd" >
          <td width="70" class="gray" align="center" >������</td>
          <td width="70" class="gray" align="center" >���ڹ�ȣ</td>
          <td width="70" class="gray" align="center" >�����ڸ�</td>
          <td width="40" class="gray" align="center" >��ü</td>
          <td width="40" class="gray" align="center" >�μ�</td>
          <td width="60" class="gray" align="center" >�ܰ�</td>
          <td width="60" class="gray" align="center" >���ÿ�</td>
          <td width="60" class="gray" align="center" >��ü����</td>
          <td width="60" class="gray" align="center" >��ü����</td>
          <td width="50" class="gray" align="center" >�����ȣ</td>
          <td width="155" align="center" class="gray" >����ּ�</td>
          <td width="70" class="gray" align="center" >����</td>
        </tr>
        <tr  >
          <td height="120" colspan="12" class="gray" style="padding:0;"><iframe src="/html/brsup/ss_brsup_1720_l.html" name="ifrm_2" width="830" height="120" frameborder="0" marginheight="0" marginwidth="0" scrolling="yes"></iframe></td>
          </tr>
      </table>
      <!--��� end-->
    </td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���ѿ��� -->
    </td>
  </tr>
  <tr>
    <td valign="top">
      <!-- ���γ��� ��ϰ˻� -->
      <table width="830" border="0"  cellpadding="0" cellspacing="0" align="center">
      <form name="pymtptcr_form" method="post" action="">
        <tr>
          <td height="26" bgcolor="#D2C69B"  class="title" width="120">���γ��� ���</td>
          <td height="26" bgcolor="#EBE9DC"  class="title" width="30"><img src="/html/comm_img/search4.gif" width="13" height="26"></td>
          <td height="26" bgcolor="#EBE9DC"  class="title" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">û����</td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="160">
            <input name="f_basidt" value="<%=Util.getDate2().substring(0,7)%>" type="text" size="8" class="text_box" notEmpty dataType=month caption="û����">
            -
            <input name="t_basidt" value="<%=Util.getDate2().substring(0,7)%>" type="text" size="8" class="text_box" notEmpty dataType=month caption="û����">
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="71"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ü����
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="136">
            <select name="shftclsfcd" class="sel_all">
              <option value="" selected>��ü</option>
              <%=ds.rsltcurOptHtml("")%>
            </select>
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">û�����</td>
          <td height="26" bgcolor="#EBE9DC" class="title" width="150">
            <select name="erryn" class="sel_all">
              <option value="" selected>��ü</option>
              <option value="N">����</option>
              <option value="Y">����</option>
            </select>
          </td>
          <td height="26" bgcolor="#EBE9DC" class="title" align="right">
            <input type="image" onclick="pymtptcr_list();window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif" width="36"  align="absmiddle"></td>
        </tr>
        <tr>
          <td height="3" colspan="8">
            <!--����-->
          </td>
        </tr>
      </form>
      </table>
      <!-- �˻� �� -->
      <!--  ���-->
      <table width="830" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray">
        <tr bgcolor="#dddddd" >
          <td width="72" class="gray" align="center" >������</td>
          <td width="72" class="gray" align="center" >���ڹ�ȣ</td>
          <td width="72" class="gray" align="center" >�����ڸ�</td>
          <td width="42" class="gray" align="center" >��ü</td>
          <td width="42" class="gray" align="center" >�μ�</td>
          <td width="62" class="gray" align="center" >�ܰ�</td>
          <td width="62" class="gray" align="center" >û����</td>
          <td width="74" class="gray" align="center" >��������</td>
          <td width="124" class="gray" align="center" >��ü����</td>
          <td width="53" align="center" class="gray" >���</td>
          <td width="132" align="center" class="gray" >����</td>
        </tr>
        <tr>
          <td height="120" colspan="11" class="gray" style="padding:0;"><iframe src="/html/brsup/ss_brsup_1730_l.html" name="ifrm_3" width="830" height="120" frameborder="0" marginheight="0" marginwidth="0" scrolling="yes"></iframe></td>
          </tr>
      </table>
      <!--��� end-->
    </td>
  </tr>
</table>
<!--������ ���� ū���̺� ��-->
<br>
<br>
<iframe name="ifrm" width="0" height="0"></iframe>
</body>
</html>