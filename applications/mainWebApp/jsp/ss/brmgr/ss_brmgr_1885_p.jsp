<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<html>
<head>
<title>����Ʈ ������Ȳ ��</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sal.css" type="text/css">
<script language="javascript" src="/html/comm_js/common.js"></script>
<script language="javascript">
<!--

	//�������ʱ�ȭ�� ��ư������ EventHandlerȣ��
	function jsInit(){

		setEventHandler();
		setEnterKeyEventHandler();

		}

    function list_search() {
        var lo_form1 = document.hous_thrw_form;

		lo_form1.action = "/ss/brmgr/1886";
		lo_form1.target = "ifrm";
		lo_form1.method = "post";
        lo_form1.submit();

        return;
    }
-->
</script>
</head>
<body onload="jsInit();list_search();" bgcolor="#FFFFFF" class="scroll1">
<!--��������-->
<%--
<table id="bo_info_id" width="810" border="0" cellpadding="2" cellspacing="0"  align="center" class="gray">
<tr><td>
<form name="bo_info_form" method="post" action="">
<input type="text" name="bocd" value="<%=request.getParameter("bocd")%>">:bocd<br>
<input type="text" name="invsgdt" value="<%=request.getParameter("invsgdt")%>">:invsgdt<br>
<input type="text" name="invsgno" value="<%=request.getParameter("invsgno")%>">:invsgno<br>
<input type="text" name="addrcd" value="<%=request.getParameter("addrcd")%>">:addrcd<br>
<input type="text" name="dongno" value="<%=request.getParameter("dongno")%>">:dongno<br>
</form>
</td></tr>
</table>
--%>
<!--���Ը�ü�� ��Ȳ-->
<%--
<table id="apt_thrw_info_id" width="810" border="0" cellpadding="2" cellspacing="0"  align="center" class="gray">
<tr><td>
<form name="apt_thrw_info_form" method="post" action="" >
<input type="text" name="areanm" value="">:areanm<br>
<input type="text" name="bonm" value="">:bonm<br>
<input type="text" name="zip" value="">:zip<br>
<input type="text" name="addr" value="">:addr<br>
<input type="text" name="addrnm" value="">:addrnm<br>
<input type="text" name="pyong" value="">:pyong<br>
<input type="text" name="hoscnt" value="">:hoscnt<br>
<input type="text" name="cho_cnt" value="">:cho_cnt<br>
<input type="text" name="cho_rate" value="">:cho_rate<br>
<input type="text" name="jung_cnt" value="">:jung_cnt<br>
<input type="text" name="jung_rate" value="">:jung_rate<br>
<input type="text" name="dong_cnt" value="">:dong_cnt<br>
<input type="text" name="dong_rate" value="">:dong_rate<br>
<input type="text" name="invsghhmm" value="">:invsghhmm<br>
<input type="text" name="invsgpers" value="">:invsgpers<br>
<input type="text" name="addrcdnm" value="">:addrcdnm<br>
<input type="text" name="dongno" value="">:dongno<br>
<input type="text" name="remk" value="">:remk<br>
</form>
</td></tr>
</table>
--%>
<table id="boemp_search_id" width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="boemp_search_form" method="post" action="" >
	<tr>
		<td bgcolor="#EBE9DC" width="38" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;</td>
	    <td bgcolor="#EBE9DC" class="title" width="80"><input name="deptnm" type="text" size="4" class="text_box" style="width:70;" readonly></td>
        <td bgcolor="#EBE9DC" width="38" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
	    <td bgcolor="#EBE9DC" class="title" width="80"><input name="areanm" type="text" size="4" class="text_box" style="width:70;" readonly></td>
    	<td bgcolor="#EBE9DC" class="title" width="38""><img src="/html/comm_img/ic_title.gif" width="12" height="7">����</td>
	    <td bgcolor="#EBE9DC" class="title" width="90"><input name="bonm" type="text" size="4" class="text_box" style="width:70;" readonly></td>
    	<td bgcolor="#EBE9DC" class="title" width="60""><img src="/html/comm_img/ic_title.gif" width="12" height="7">�ٷΰ���</td>
	    <td bgcolor="#EBE9DC" class="title" width="*"><input name="qsearch" type="text" class="text_box" value="" style="width:100;" readonly></td>
    </tr>
</form>
</table>

<table border="0" cellpadding="0" cellspacing="0">
<tr><td height="3"></td></tr>
</table>

<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����Ʈ ������Ȳ ��</td>
  </tr>
  <tr>
    <td height="2">
      <!--����-->
    </td>
  </tr>
</table>
<!--����Ʈ ������Ȳ ���系�� �� -->
<table id="thrw_head_id" width="830" border="0" align="center" cellpadding="2" cellspacing="0" class="gray" >
<form name="thrw_head_form" method="post" action="" >
<input name="bocd" type="hidden" value="">
  <tr>
    <td class="gray" width="90" bgcolor="#dddddd">�ּ�</td>
    <td colspan="5" class="gray">
        <input name="zip" type="text" size="7" tabIndex="1" class="text_box" value="" style="width:70;" readonly>
        <input name="addrcdnm" type="text" tabIndex="3" class="text_box" value="" style="width:264;" readonly>
        <input name="addrcdnm" type="text" tabIndex="3" class="text_box" value="" style="width:199;" readonly>
        ����Ʈ
        <input name="dongno" type="text" tabIndex="3" class="text_box" value="" style="width:62;" readonly>
        ��</td>
  </tr>
  <tr>
    <td width="90" class="gray" bgcolor="#dddddd">����Ʈ����</td>
    <td width="340" class="gray">
      <input name="pyong" type="text" style="ime-mode:disabled;text-align:center" class="text_box" tabIndex="4" size="10" value="">
      ����
    </td>
    <td  class="gray" width="70" bgcolor="#dddddd">��������</td>
    <td  class="gray" width="140">
      <input name="mvindt" type="text" style="ime-mode:disabled;text-align:center" class="text_box" tabIndex="5" size="10" value="" readonly>
    </td>
    <td  class="gray" width="*" bgcolor="#dddddd">����� </td>
    <td  class="gray">
      <input name="hoscnt" type="text" style="ime-mode:disabled;text-align:right" class="text_box" tabIndex="5" size="5" value="">
    </td>
  </tr>
  <tr>
    <td class="gray" width="90" bgcolor="#dddddd">�����Ͻ�</td>
    <td class="gray">
      <input name="year" type="text" class="text_box" maxlength="4" tabIndex="6" value="" size="4" dataType="number" len="4" caption="����⵵" notEmpty>
      ��
      <input name="month" type="text" size="2" tabIndex="7" maxlength="2" value="" class="text_box" dataType="number" len="2" caption="�����" maxValue="12" notEmpty>
      ��
      <input name="day" type="text" size="2" tabIndex="8" maxlength="2" value="" class="text_box" dataType="number" len="2" caption="������" maxValue="31">
      ��
      <input name="hour" type="text" size="2" tabIndex="9" maxlength="2" value="" class="text_box" dataType="number" len="2" caption="�ð�" maxValue="24">
      ��
      <input name="minute" type="text" size="2" tabIndex="10" maxlength="2" value="" class="text_box" dataType="number" len="2" caption="��" maxValue="59">
      �а�
    </td>
    <td  class="gray" bgcolor="#dddddd">����ڱ���</td>
    <td  class="gray" >
      <%-- ��ϱ���1, ��ϱ���2 ���� --%>
      <select id="sel_regtype1_id" name="sel_regtype1" class="sel_all" tabIndex="3" onChange="">
        <option value="">����</option>
      </select>
      <select id="sel_regtype2_id" name="sel_regtype2" class="sel_all" tabIndex="3" onChange="">
        <option value="">����</option>
      </select>    </td>
    <td class="gray" bgcolor="#dddddd" >�����ڸ�</td>
    <td class="gray" >
      <input name="invsgpers" type="text" size="10" tabIndex="11" class="text_box" value="">
    </td>
  </tr>
</form>
</table>
<br>

<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title" height="25"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">ȣ�� ���Ը�ü ��Ȳ
<%--    <img src="/html/commun/images/bu_me01.gif" onClick="medi_ynmpop();" style="cursor:hand;" width="104" align="absmiddle"></td>--%>
<%--    <img src="/html/comm_img/bu_me01.gif" onClick="medi_ynmpop();" style="cursor:hand;" width="104" align="absmiddle">
      &nbsp;&nbsp;( �߾� J, ���� D, �ѱ� UH, �Ѱܷ� UG, ���� UA, �Ѱ� H, �Ű� FA, ���� UB, �ڸ����췲�� KH )--%>
    </td>
  </tr>
  <tr>
    <td height="2">
      <!--����-->
    </td>
  </tr>
</table>
<table id="hous_thrw_id" width="830" border="0" cellpadding="2" cellspacing="0"  align="center" class="gray">
<form name="hous_thrw_form" method="post" action="" >
    <input type=hidden name=bocd            value="<%=request.getParameter("bocd")%>">
	<input type=hidden name=accflag 		value="">
    <input type=hidden name=hmflag		 	value="">
    <input type=hidden name=zip	 			value="">
    <input type=hidden name=addr     	 	value="">
	<input type=hidden name=addrcd 		 	value="<%=request.getParameter("addrcd")%>">
    <input type=hidden name=dongno		 	value="<%=request.getParameter("dongno")%>">
    <input type=hidden name=pyong1	 		value="">
    <input type=hidden name=hoscnt1	     	value="">
	<input type=hidden name=invsgdt 		value="<%=request.getParameter("invsgdt")%>">
    <input type=hidden name=invsgno		 	value="<%=request.getParameter("invsgno")%>">
    <input type=hidden name=invsghhmm	 	value="">
    <input type=hidden name=invsgpers     	value="">
  <tr align="center" bgcolor="#dddddd">
    <td align="center" class="gray" width="50" height="24" > ��</td>
    <td align="center" width="40" class="gray" height="24"> 1ȣ </td>
    <td align="center" width="40" class="gray" height="24"> 2ȣ </td>
    <td align="center" width="40" class="gray" height="24"> 3ȣ </td>
    <td align="center" width="40" class="gray" height="24"> 4ȣ </td>
    <td align="center" width="40" class="gray" height="24"> 5ȣ </td>
    <td align="center" width="40" class="gray" height="24"> 6ȣ </td>
    <td align="center" width="40" class="gray" height="24"> 7ȣ </td>
    <td align="center" width="40" class="gray" height="24"> 8ȣ </td>
    <td align="center" width="40" class="gray" height="24"> 9ȣ </td>
    <td align="center" width="40" class="gray" height="24"> 10ȣ </td>
    <td align="center" width="40" class="gray" height="24"> 11ȣ </td>
    <td align="center" width="40" class="gray" height="24"> 12ȣ </td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >1 �� </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >2 �� </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >3 �� </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >4 �� </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >5 �� </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >6 �� </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >7 �� </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >8 �� </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >9 �� </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
  <tr align="center">
    <td class="gray" width="50" >10 �� </td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
    <td class="gray"><input name="housval" type="text" size="4" class="text_box"></td>
  </tr>
</form>
</table>
<br>
<!--���Ը�ü�� ��Ȳ-->
<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title" height="25"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���Ը�ü�� ��Ȳ</td>
  </tr>
  <tr>
    <td height="2">
      <!--����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0"  align="center" cellpadding="2" class="gray">
  <tr bgcolor="#dddddd" align="center">
    <td  class="gray" bgcolor="#dddddd" align="center" width="127"> ����(����) </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="140"> ���Ժμ�(��) </td>
    <td  class="gray" bgcolor="#dddddd" align="center" width="140"> ���Է�(%) </td>
<%--    <td  class="gray" bgcolor="#dddddd" align="center" width="191"> ��޽ð�(��:��)~(��:��) </td> --%>
    <td  class="gray" bgcolor="#dddddd" align="center" width="*"> ��޻��� </td>
<%--    <td  class="gray" bgcolor="#dddddd" align="center" width="*"> ���ܻ����ż�(��) </td> --%>
  </tr>
</table>
<table id="medi_thrw_id" width="830" border="0" cellspacing="0"  align="center" cellpadding="2" class="gray">
<form name="medi_thrw_form" method="post" action="" >
  <tr>
    <input type=hidden name=medicd	 		value="">
    <input type=hidden name=qty     	 	value="">
	<input type=hidden name=qtyratio 		value="">
    <td class="gray" bgcolor="#dddddd" align="center" width="127">&nbsp;</td>
    <td  class="gray" align="right" width="140">&nbsp;</td>
    <td  class="gray" align="right" width="140">&nbsp;</td>
<%--    <td  class="gray" align="center" width="182">
      <input name="bgnhour" type="text" maxlength="2" size="1" value="" class="text_box" dataType="number" len="2" caption="��޽��۽ð�" maxValue="24">
      :
      <input name="bgnminute" type="text" maxlength="2" size="1" value="" class="text_box" dataType="number" len="2" caption="��޽��ۺ�" maxValue="59">
      ~
      <input name="endhour" type="text" maxlength="2" size="1" value="" class="text_box" dataType="number" len="2" caption="�������ð�" maxValue="24">
      :
      <input name="endminute" type="text" maxlength="2" size="1" value="" class="text_box" dataType="number" len="2" caption="��������" maxValue="59">
    </td>--%>
    <td class="gray" align="left" width="*">
      <select name="dlvstatcd" class="sel_all">
        <option value="">����</option>
      </select>
    </td>
<%--    <td class="gray" align="center" width="134">
      <input name="leaffeednosh" type="text" size="4" value="" class="text_box">
    </td>
--%>
  </tr>
</form>
</table>
<br>

<table width="830" border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td bgcolor="#EBE9DC" class="title" height="25"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���Է�(����, �߾�, ����) / Ȱ������</td>
  </tr>
  <tr>
    <td height="2">
      <!--����-->
    </td>
  </tr>
</table>
<table id="medi_thrw_rate_id" width="830" border="0" cellspacing="0"  align="center" cellpadding="2" class="gray">
<form name="medi_thrw_rate_form" method="post" action="" >
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">��ü</td>
    <td width="140" height="19" bgcolor="#dddddd" class="gray">���Ժμ�</td>
    <td width="140" bgcolor="#dddddd" class="gray"> ���Է�</td>
    <td width="*" bgcolor="#dddddd" class="gray">Ȱ������</td>
  </tr>
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">�����Ϻ�</td>
    <td width="140" class="gray" align="right">&nbsp;</td>
    <td width="140" class="gray" align="right">&nbsp;</td>
    <td width="*" bgcolor="#ffffff" class="gray" rowspan="3">&nbsp;</td>
  </tr>
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">�߾��Ϻ�</td>
    <td width="140" class="gray" align="right">&nbsp;</td>
    <td width="140" class="gray" align="right">&nbsp;</td>
  </tr>
  <tr align="center">
    <td width="127" height="19" bgcolor="#dddddd" class="gray">�����Ϻ�</td>
    <td width="140" class="gray" align="right">&nbsp;</td>
    <td width="140" class="gray" align="right">&nbsp;</td>
  </tr>
</form>
</table>

<br><p>
<br><p>

<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
