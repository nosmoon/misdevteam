<%@ page contentType="text/html; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1785_a.jsp
* ��� : ������������-Billing�ڵ���ü-��û���-�ʱ�ȭ��
* �ۼ����� : 2004-04-26
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = false;	// ���� ���� ����

    SS_L_APLC_MANG_INITDataSet ds = (SS_L_APLC_MANG_INITDataSet)request.getAttribute("ds");
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

// �����ȸ
function list_search(pageno, rp_clsf) {
	var lo_form = document.list_search_form;

	// ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form.pageno.value = '1';
    } else {
        lo_form.pageno.value = pageno;
    }

    // �˻������� �����Ѵ�.
    // 1:������,2:������,3:�������ں�,4:����������,5:��û���ɺ�,6:ī��纰
    /*
    if(!rp_clsf) {
        lo_form.rp_clsf.value = '1';
    } else {
        lo_form.rp_clsf.value = rp_clsf;
    }
    */
    if(rp_clsf!=null) {
        lo_form.rp_clsf.value = rp_clsf;
    }

	if(!check_all(lo_form)) return;

	lo_form.method = "post";
	lo_form.action = "/ss/brsup/1786";
	lo_form.target = "ifrm";
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

// ����Ű ��Ƴ���
function f_list_search() {
    if(event.keyCode == 13) list_search();
}
-->
</script>
</head>
<body onload="jsInit()" bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" class="scroll1">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >��������
      > </b>Billing�ڵ���ü &gt; ��û���</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
<form name="list_search_form" method="post" action="">
  <input name="pageno" type="hidden" value ="1">			                <!-- ���� ������ ��ȣ -->
  <input name="pagesize" type="hidden" value ="<%= moveListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
  <input name="js_fn_nm" type="hidden" value ="list_search">
  <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
  <input type="hidden" name="rp_clsf" value="1">
  <tr>
    <td bgcolor="#EBE9DC"  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�˻�����
    </td>
    <td bgcolor="#EBE9DC" class="title" width="180">
      <input name="fr_dt" type="text" size="10" maxlength="10" class="text_box" value="<%=Util.getDate2()%>" dataType="date" notEmpty caption="�˻���������">
      ~<input name="to_dt" type="text" onkeydown="f_list_search()" size="10" maxlength="10" class="text_box" value="<%=Util.getDate2()%>" dataType="date" notEmpty caption="�˻�������">
    </td>
    <td bgcolor="#EBE9DC"  class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ü����
    </td>
    <td bgcolor="#EBE9DC" class="title">
      <select name="shftclsf" class="sel_all">
          <option value="" selected>��ü</option>
          <%=ds.shftclsfOptHtml("")%>
      </select>
      <input type="image" onclick="list_search(1,1);window.event.returnValue=false;" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle">
    </td>
  </tr>
  <tr>
    <td height="3" colspan="4">
      <!--����-->
    </td>
  </tr>
</form>
</table>
<!--tab start -->
<table id="tab_id" width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr valign="bottom">
    <td width="100" onclick="list_search(1,1);window.event.returnValue=false;" style="cursor:hand;">
      <!--tab 1-->
      <table border=0 cellpadding=0 cellspacing=0 width="100%">
        <tr>
          <td height=3 ><img src="/html/comm_img/tb3_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb3_02.gif" height=3 ></td>
          <td height=3 ><img src="/html/comm_img/tb3_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb3_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb3_05.gif"><font color="#FFFFFF">������</font></td>
          <td background="/html/comm_img/tb3_06.gif"  style width="5"></td>
        </tr>
      </table>
      <!--tab 1 end-->
    </td>
    <td width="100" onclick="list_search(1,2);window.event.returnValue=false;" style="cursor:hand;">
      <!--tab2-->
      <table border=0 cellpadding=0 cellspacing=0 width="100%">
        <tr>
          <td height=3 ><img src="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
          <td height=3 ><img src="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb4_05.gif">������</td>
          <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
        </tr>
      </table>
      <!--tab 2 end-->
    </td>
    <td width="100"  onclick="list_search(1,3);window.event.returnValue=false;" style="cursor:hand;">
      <!--tab3-->
      <table border=0 cellpadding=0 cellspacing=0 width="100%">
        <tr>
          <td height=3 ><img src="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
          <td height=3 ><img src="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb4_05.gif">�������ں�</td>
          <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
        </tr>
      </table>
      <!--tab 3 end-->
    </td>
    <td width="100"  onclick="list_search(1,4);window.event.returnValue=false;" style="cursor:hand;">
      <!--tab4-->
      <table border=0 cellpadding=0 cellspacing=0 width="100%">
        <tr>
          <td height=3 ><img src="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
          <td height=3 ><img src="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb4_05.gif">����������</td>
          <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
        </tr>
      </table>
      <!--tab 4 end-->
    </td>
    <td width="100"  onclick="list_search(1,5);window.event.returnValue=false;" style="cursor:hand;">
      <!--tab5-->
      <table border=0 cellpadding=0 cellspacing=0 width="100%">
        <tr>
          <td height=3 ><img src="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
          <td height=3 ><img src="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb4_05.gif">��û���ɺ�</td>
          <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
        </tr>
      </table>
      <!--tab 5 end-->
    </td>
    <td width="100"  onclick="list_search(1,6);window.event.returnValue=false;" style="cursor:hand;">
      <!--tab6-->
      <table border=0 cellpadding=0 cellspacing=0 width="100%">
        <tr>
          <td height=3 ><img src="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
          <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
          <td height=3 ><img src="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
        </tr>
        <tr>
          <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
          <td  align="center" background="/html/comm_img/tb4_05.gif">ī��纰</td>
          <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
        </tr>
      </table>
      <!--tab 6 end-->
    </td>
    <td width="430" height="30">
      <!--tab ���� ����� ���ؼ� �ذŴϱ�.���� ����������-->
    </td>
  </tr>
</table>
<!--tab end -->
<!--������ ���� -->
<table id="header_id" width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr>
    <td height="25" bgcolor="#EBE9DC" class="title">������ ���</td>
  </tr>
  <tr>
    <td height="3">
      <!--����-->
    </td>
  </tr>
</table>
<!--list-->
<table id="body_id" width="830" border="0" cellpadding="1" cellspacing="0" align="center" bgcolor="#FFFFFF"  class="gray" >
  <tr align="center" bgcolor="#dddddd" >
    <td width="94" class="gray" >������</td>
    <td width="92" class="gray">����IS</td>
    <td width="92" class="gray">TM</td>
    <td width="92" class="gray">����</td>
    <td width="92" class="gray">����</td>
    <td width="92" class="gray">���ڿ��</td>
    <td width="92" class="gray">����</td>
    <td width="92" class="gray">��Ÿ</td>
    <td width="92" class="gray">��</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
  <tr>
    <td class="gray" >&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
    <td class="gray">&nbsp;</td>
  </tr>
</table>
<!--��ư-->
<table id="nav_id" width="830" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center">
  <tr>
    <td align="center" height="25" bgcolor="#E8E8E8">
    	<img src="/html/comm_img/bu_first01.gif" alt="10������ ������" border="0" >
        <img src="/html/comm_img/bu_prev01.gif" >
        <img src="/html/comm_img/bu_next01.gif" alt="����������" border="0" >
        <img src="/html/comm_img/bu_end01.gif" border="0" alt="10������ �ڷ�">
    </td>
  </tr>
</table>
<!--������ �� -->
<br>
<br>
<iframe name="ifrm" width="0" height="0"></iframe>
</body>
</html>
