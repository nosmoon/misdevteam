<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1300_a.jsp
* ��� : Ȯ����Ȳ-���Ȯ��-�������-�ʱ�ȭ��
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
	String paramGbn = "##";
    int listCount = 10;		// ȭ��� �׸��
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
	document.alon_search_form.frdt.focus();
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
    var lo_form1 = document.alon_search_form;

    // ȭ������� ������ ���� ���Ȯ���ȸ �Ǵ� �Ⱓ�� �ʼ��� ������ �� �˻��ϰ� �Ѵ�.
    if( (lo_form1.rdr_extncampno.value == '') && ((lo_form1.frdt.value == '') || (lo_form1.frdt.value == '')) ){
		alert("Ȯ���ȸ �Ǵ� �Ⱓ�� �����ϼ���");
		return;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // Ȯ���û��� ��ȸ������ "/ss/extn/1310" �������� ������
    lo_form1.action = "/ss/extn/1310";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ��ü����, ���
function check_all_chk(bool){
    var lo_form1 = document.alon_list_form;

    if(lo_form1.payyn==null) {								// ���õ� ���� ���� ���
        return;
    } else if(lo_form1.payyn.type=="checkbox") {			// �Ѱ��� ���
        lo_form1.payyn.checked = bool;
    } else {												// �������� ���
        for(var i=0; i<lo_form1.payyn.length; i++) {
            lo_form1.payyn[i].checked = bool;
        }
    }
}

// ���
function alon_cancel(){
    var lo_form1 = document.alon_list_form;

	lo_form1.reset();
}

// ���� �󼼺���
function alon_detail_view(rdr_extncampno, empseq){
    var lo_form1 = document.alon_list_form;

    // ���Ȯ����� Ȯ���ȸ��ȣ, ����Ϸù�ȣ�� "/ss/extn/1320" �������� ������
    lo_form1.rdr_extncampno.value = rdr_extncampno;
    lo_form1.empseq.value = empseq;
    lo_form1.action = "/ss/extn/1320";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����
function alon_save(){
    var lo_form1 = document.alon_list_form;
	// üũ�ڽ��� ������ ó������ �ʴ´�.
	if(lo_form1.payyn == null){
		return;
	}
    // ���Ȯ���ȸ��ȣ, ����Ϸù�ȣ, ���ÿ��θ� ���ڿ� �������� �����.
	var	ls_temp;
	var ls_rdr_extncampnoary = "";
	var ls_empseqary = "";
	var	ls_checkedary = "";
    for(var i=0; i<lo_form1.payyn.length; i++) {

		ls_temp = lo_form1.payyn[i].value;
		ls_rdr_extncampnoary = ls_rdr_extncampnoary + ls_temp.substring(0, ls_temp.length-6) + "<%= paramGbn%>";
		ls_empseqary = ls_empseqary + ls_temp.substring(6, ls_temp.length) + "<%= paramGbn%>";

        if(lo_form1.payyn[i].checked){
		    ls_checkedary = ls_checkedary + "Y" + "<%= paramGbn%>";
        }else{
		    ls_checkedary = ls_checkedary + "N" + "<%= paramGbn%>";
        }
    }
	lo_form1.rdr_extncampnoary.value = ls_rdr_extncampnoary.substring(0, ls_rdr_extncampnoary.length-2);
	lo_form1.empseqary.value = ls_empseqary.substring(0, ls_empseqary.length-2);
	lo_form1.checkedary.value = ls_checkedary.substring(0, ls_checkedary.length-2);

    // ��������, ���������ڵ�, ���ÿ��θ� ���ڿ� ������ "/ss/extn/1330" �������� ������.
    lo_form1.action = "/ss/extn/1330";
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

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >Ȯ����Ȳ
       </b>���Ȯ�� &gt; ���� </td>
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
      <table width="830" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" id="alon_search_id">
      <form name="alon_search_form" method="post" action="" >
        <tr>
          <td class="title"  bgcolor="#EBE9DC" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">Ȯ���ȸ
          </td>
          <td class="title" >
            <select name="rdr_extncampno" class="sel_all">
                <option value='' selected>����</option>
                <%= ds.curcommlistOptHtml("") %><!-- ���Ȯ���ȸ��ȣ, ���Ȯ���ȸ�� ��� -->
            </select>
          </td>
          <td class="title"  bgcolor="#EBE9DC" width="50"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ</td>
          <td class="title" >
            <input name="frdt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="��������" dataType="date">
            -
            <input name="todt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="��������" dataType="date">
          </td>
          <td class="title"  bgcolor="#EBE9DC" width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">ó��</td>
          <td class="title"  width="120">
            <select name="payyn" size="1"class="sel_all">
              <option value="" selected>��ü</option>
              <option value="Y">����</option>
              <option value="N">������</option>
            </select>
          </td>
          <td class="title"  width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�����</td>
          <td class="title" >
            <input name="empnm" type="text" style="ime-mode:active;" size="12" class="text_box">
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
          <td  height="27" bgcolor="#EBE9DC" class="title">���Ȯ���ȸ ������</td>
          <td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="240">
			<input type="image" id="check_all_chk_true_id" src="/html/comm_img/bu_all01.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(true)">
            <input type="image" id="check_all_chk_false_id" src="/html/comm_img/bu_all02.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(false)">
            <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:alon_cancel()">
            <input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:alon_save()">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--����-->
          </td>
        </tr>
      </table>

    <!--���Ȯ�� ���� ��� ���� ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="alon_list_id">
    <form name="alon_list_form" method="post" action="" >
        <input name="rdr_extncampno" type="hidden" value ="">
        <input name="rdr_extncampnoary" type="hidden" value ="">
        <input name="empseqary" type="hidden" value ="">
        <input name="checkedary" type="hidden" value ="">
		<tr height="25" bgcolor="#DDDDDD">
			<td width="100" class="gray" align="center">��ȸ��</td>
			<td width="90" class="gray" align="center">��������</td>
			<td width="90" class="gray" align="center">��������</td>
			<td width="80" class="gray" align="center">�����</td>
			<td width="100" class="gray" align="center">ȸ��</td>
			<td width="100" class="gray" align="center">�μ�</td>
			<td width="90" class="gray" align="center">��</td>
			<td class="gray" align="center">�۱�</td>
			<td width="90" class="gray"align="center">�۱�����</td>
		</tr>

        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>		
		<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center">&nbsp;</td>
			<td width="80" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center">&nbsp;</td>
	        <td class="gray" align="center"><input type="checkbox" name="checkbox" value="">&nbsp;</td>
			<td width="90" class="gray"align="center">&nbsp;</td>
		</tr>
		<%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>

		<tr bgcolor="#dddddd" align="right">
			<td colspan="6" class="gray" align="right"> ��&nbsp;</td>
			<td width="95" class="gray" align="right"> &nbsp;</td>
			<td colspan="2" class="gray">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
			</td>
		</tr>
    </form>
    </table>
    <!--���Ȯ�� ���� ��� �� ---------------------------------------------------------------------------->
	</td>
  </tr>
  <tr>
    <td height="10">
      <!------����--- -->
    </td>
  </tr>
  <tr>
	<td>
    <!--���Ȯ�� ���� �� ���� ---------------------------------------------------------------------------->
    <table border="0" cellspacing="0" cellpadding="0" id="alon_detail_id">
	</table>
    <!--���Ȯ�� ���� �� �� ---------------------------------------------------------------------------->
  </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
