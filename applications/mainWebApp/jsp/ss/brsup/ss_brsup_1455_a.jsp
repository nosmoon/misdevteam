<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1455_a.jsp
* ��� : ��������-���غ���-���(�������)-�ʱ�ȭ��
* �ۼ����� : 2004-02-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");
	String paramGbn = "##";
    applySession = true;	// ���� ���� ����
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
	document.cost_search_form.bonm.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ���� �˻�
function area_search(){

    var lo_form1 = document.cost_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>����</option>" +
                  "</select>"
        document.all.areacd_id.outerHTML = str;
        return;
    }

    // �μ�(��)�ڵ尪�� "/ss/common/1100" �������� ������
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1100";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ����ã�� �˾�
function bo_search(){
    var lo_form1 = document.cost_search_form;
    var	deptcd = lo_form1.deptcd.value;
    var areacd = lo_form1.areacd.value;
    var bonm   = lo_form1.bonm.value;

	var ls_return = jsNewModalWinNoS("/ss/common/1110", deptcd+":"+areacd+":"+bonm, "725","480");
    var la_str;

    if(ls_return.indexOf("\n") != -1){
        la_str = ls_return.split("\n");
        lo_form1.bocd.value = la_str[0];
        lo_form1.bonm.value = la_str[1];
/*
        lo_form1.deptcd.value = la_str[2];
        lo_form1.areacd.outerHTML =
        		'<select name="areacd" size="1" id="areacd_id" class="sel_all">' +
        		'<option value="' +
        		la_str[4] +
        		'" selected>' +
        		la_str[5] +
        		'</option>';
*/
	    // ��� �˻��� ��� ó��
	    if(gs_request == 'L'){
	    	gs_request = 'N';
	    	list_search();
	    }

    }
	return;
}

// ����Ű�� ���� ����ã��
function bo_enter_search(){
    var e = window.event;
    if(!e || e.keyCode != "13") return;
    window.event.returnValue=false;

    var lo_form1 = document.cost_search_form;

    //�������� �������� ������ �����˻��˾��� ����.
	if(lo_form1.bonm.value == ''){
		bo_search();
		return;
	}

    // �μ�(��)�ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
    lo_form1.action = "/ss/common/1113";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}


// ����Ű�� ���� ����ã�� ���ó��
function bo_enter_search_result(no){
	// �˻������ �Ѱ��̹Ƿ� �˻�â�� ������� �����Ѵ�.
	if(no == '1'){
		var lo_form1 = ifrm.document.bo_detail_form;
		var lo_form2 = document.cost_search_form;
/*
		lo_form2.deptcd.value = lo_form1.deptcd.value;
        lo_form2.areacd.outerHTML =
        		'<select name="areacd" size="1" id="areacd_id" class="sel_all">' +
        		'<option value="' +
        		lo_form1.areacd.value +
        		'" selected>' +
        		lo_form1.areanm.value +
        		'</option>';
*/
		lo_form2.bocd.value = lo_form1.bocd.value;
		lo_form2.bonm.value = lo_form1.bonm.value;
	// �˻������ ���ų� �������̹Ƿ� ����ã�� �˾��� ����.
	}else if(no == '2'){
		bo_search();
	}
}

// ��Ϻ���
function list_search()
{
    var lo_form1 = document.cost_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ȭ������� ������ ���� �μ�(��),����,�⵵�� �ʼ��� ������ �� �˻��ϰ� �Ѵ�.
	if(lo_form1.deptcd.value == '' && lo_form1.bonm.value == ''){
		alert("���� �����ϼ���");
		return;
    }

/*
    if(lo_form1.areacd.value == ''){
		alert("������ �����ϼ���");
		return;
    }
*/

    if(lo_form1.basidt.value == ''){
		alert("�⵵�� �����ϼ���");
		return;
    }

    // Ȯ���û��� ��ȸ������ "/ss/brsup/1460" �������� ������
    lo_form1.action = "/ss/brsup/1460";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ��ü����, ���
function check_all_chk(bool){
    var lo_form1 = document.cost_list_form;

    if(lo_form1.splychrgclamtyn==null) {					// ���õ� ���� ���� ���
        return;
    } else if(lo_form1.splychrgclamtyn.type=="checkbox") {	// �Ѱ��� ���
        lo_form1.splychrgclamtyn.checked = bool;
    } else {												// �������� ���
        for(var i=0; i<lo_form1.splychrgclamtyn.length; i++) {
            lo_form1.splychrgclamtyn[i].checked = bool;
        }
    }
}

// ���
function cost_cancel(){
    var lo_form1 = document.cost_list_form;

	lo_form1.reset();
}


// ����
function cost_save(){
    var lo_form1 = document.cost_list_form;

	if(lo_form1.splychrgclamtyn == null){					// üũ�ڽ��� ���� ��
		return;
	}else if(lo_form1.splychrgclamtyn.type == "checkbox"){	// üũ�ڽ��� �Ѱ� �϶�
        lo_form1.basidtary.value = lo_form1.splychrgclamtyn.value.substring(0, 4);
        lo_form1.bocdary.value = lo_form1.splychrgclamtyn.value.substring(4, 9);
        if(lo_form1.splychrgclamtyn.checked){
            lo_form1.checkedary.value = "Y";
        }else{
            lo_form1.checkedary.value = "N";
        }
	}else{													// üũ�ڽ��� ���� ���϶�
        // ��������, ���������ڵ�, ���ÿ��θ� ���ڿ� �������� �����.
        var	ls_temp;
        var ls_basidtary = "";
        var ls_bocdary = "";
        var	ls_checkedary = "";
        for(var i=0; i<lo_form1.splychrgclamtyn.length; i++) {

            ls_temp = lo_form1.splychrgclamtyn[i].value;
            ls_basidtary = ls_basidtary + ls_temp.substring(0, 4) + "<%= paramGbn%>";
            ls_bocdary = ls_bocdary + ls_temp.substring(4, 9) + "<%= paramGbn%>";

            if(lo_form1.splychrgclamtyn[i].checked){
                ls_checkedary = ls_checkedary + "Y" + "<%= paramGbn%>";
            }else{
                ls_checkedary = ls_checkedary + "N" + "<%= paramGbn%>";
            }
        }
        lo_form1.basidtary.value = ls_basidtary.substring(0, ls_basidtary.length-2);
        lo_form1.bocdary.value = ls_bocdary.substring(0, ls_bocdary.length-2);
        lo_form1.checkedary.value = ls_checkedary.substring(0, ls_checkedary.length-2);
	}
    // ��������, ���������ڵ�, ���ÿ��θ� ���ڿ� ������ "/ss/brsup/1465" �������� ������.
    lo_form1.action = "/ss/brsup/1465";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �˻� ���� �ʱ�ȭ
function set_default(flag){

    var lo_form1 = document.cost_search_form;

	if(flag == '1'){			// �μ�(��),����,���� �ʱ�ȭ
		// �μ�(��) �ʱ�ȭ
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search();" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.curcommlistOptHtml(""), false); %>'
									+'</select>';
		// ���� �ʱ�ȭ
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" id="areacd_id" class="sel_all">'
									+'<% writeAreaOpt(session, out, false); %>'
									+'</select>';
		// �����ڵ�,������ �ʱ�ȭ, ��Ŀ���̵�
		lo_form1.bocd.value = "";
		lo_form1.bonm.value = "";
		lo_form1.bonm.focus();
	}else if(flag == '2'){		// �Ⱓ �ʱ�ȭ
	}else if(flag == '3'){		// ��Ÿ �ʱ�ȭ
	}
}

// ��� ��ȸ�� �������� ������ ��� �����˻� �� ��� ��ȸ�� �����Ѵ�.
// �̰�� �ܼ� �����˻��� �����˻� �� ��� ��ȸ�� �����ؾ� �ϴ°� �����ؾ� �ϰ� �����ȸ�� �����ؾ� �ϴ� ���� gs_request �������� L �� �����Ѵ�.
var gs_request = 'N';	// N : ��û����, L : ��ȸ��û

// ��û �÷��� ����
function set_request(flag){
	gs_request = flag;
}

// �����˻��� ���� ��� ��ȸ
function bo_list_search(){
    var lo_form1 = document.cost_search_form;

	if(lo_form1.bonm.value == ''){
		lo_form1.bocd.value = '';
		list_search();
	}else{
	    // �μ�(��)�ڵ�,�����ڵ�,��������  "/ss/common/1113" �������� ������
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
	    lo_form1.action = "/ss/common/1113";
	    lo_form1.target = "ifrm";
	    lo_form1.submit();
	}
}

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" margin class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >��������
       </b>���غ��� &gt; ��� </td>
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
      <!--���غ��� ��� �˻� ���� ---------------------------------------------------------------------------->
      <table width="830" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" id="cost_search_id">
      <form name="cost_search_form" method="post" action="" >
        <input name="common_deptcd" type="hidden" value ="">                    <!-- ���� �μ�(��)�ڵ� -->
        <input name="bocd" type="hidden" value ="">                    			<!-- �����ڵ� -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
        <tr>
          <td bgcolor="#EBE9DC" width="40" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;</td>
          <td width="80" class="title">
            <select name="deptcd" onChange="area_search();" class="sel_all"><!-- �μ�(��)�ڵ�, �ڵ�� ��� -->
<%
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), false);
%>
            </select>
          </td>
          <td bgcolor="#EBE9DC" width="40" class="title"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
          <td width="80" class="title">
            <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--�����ڵ�, ������ ���-->
<%
					writeAreaOpt(session, out, false);
%>
            </select>
          </td>
          <td bgcolor="#EBE9DC" width="40" class="title">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
          <td bgcolor="#EBE9DC" width="160" class="title">
            <input name="bonm" type="text" style="ime-mode:active;" size="8" class="text_box" onkeydown="bo_enter_search();">
            <input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"><!--�����˻��˾�-->
            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
          </td>
          <td width="42" class="title">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���</td>
          <td width="64" class="title">
            <input name="basidt" type="text" size="7" class="text_box" caption="���" value="<%= Util.getYear()%>" dataType="integer">
          </td>
          <td width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ϸ�</td>
          <td class="title">
            <select name="accflag" size="1"class="sel_all">
              <option value="" selected>��ü</option>
              <option value="Y">�ϳ�</option>
              <option value="N">�̳�</option>
            </select>
          </td>
          <td align="right" class="title">
            <input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"></td><!--��� ��ȸ-->
          </td>
        </tr>
	  </form>
      </table>
         <!--���غ��� ��� �˻� �� ---------------------------------------------------------------------------->
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
          <td  height="27" bgcolor="#EBE9DC" class="title">���غ��� �����</td>
          <td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="240">
			<input type="image" id="ckeck_all_chk_true_id" src="/html/comm_img/bu_all01.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(true)">
            <input type="image" id="ckeck_all_chk_false_id" src="/html/comm_img/bu_all02.gif" width="64" height="19" align="absmiddle" border="0" onclick="javascript:check_all_chk(false)">
            <input type="image" id="cancel_id" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:cost_cancel()">
            <input type="image" id="save_id" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:cost_save()">
          </td>
        </tr>
        <tr>
          <td height="3" colspan="2">
            <!--����-->
          </td>
        </tr>
      </table>

    <!--���غ��� ��� ��� ���� ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
    <form name="cost_list_form" method="post" action="" >
        <input name="basidt" type="hidden" value ="">
        <input name="bocd" type="hidden" value ="">
        <input name="basidtary" type="hidden" value ="">
        <input name="bocdary" type="hidden" value ="">
        <input name="checkedary" type="hidden" value ="">

		<tr bgcolor="#dddddd" align="center">
			<td rowspan="2" width="70" class="gray">��&nbsp;</td>
			<td rowspan="2" width="70" class="gray">����</td>
			<td rowspan="2" class="gray">����</td>
			<td colspan="2" width="120" class="gray">����ܰ�</td>
			<td colspan="2" width="120" class="gray">�����ܰ�</td>
			<td rowspan="2" width="70" class="gray">û���ݾ�</td>
			<td rowspan="2" width="70" class="gray">������</td>
			<td rowspan="2" width="70" class="gray">�Ա�</td>
			<td rowspan="2" width="70" class="gray">�ϳ�����</td>
		</tr>
		<tr bgcolor="#dddddd" align="center">
			<td width="60" class="gray">��û</td>
			<td width="60" class="gray">�ݾ�</td>
			<td width="60" class="gray">����</td>
			<td width="60" class="gray">�ݾ�</td>
		</tr>

        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
		<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td width="70" class="gray">&nbsp;</td>
			<td width="70" class="gray">&nbsp;</td>
			<td class="gray">&nbsp;</td>
			<td width="60" class="gray">&nbsp;</td>
			<td width="60" class="gray">&nbsp;</td>
			<td width="60" class="gray">&nbsp;</td>
			<td width="60" class="gray">&nbsp;</td>
			<td width="70" class="gray">&nbsp;</td>
			<td width="70" class="gray"><input type="checkbox" name="checkbox">&nbsp;</td>
			<td width="70" class="gray"><input type="checkbox" name="checkbox">&nbsp;</td>
			<td width="70" class="gray">&nbsp;</td>
		</tr>
		<%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
		<tr bgcolor="#dddddd" height="23">
			<td colspan="11" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѱݾ� �� </b>&nbsp;&nbsp;&nbsp;
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
			</td>
		</tr>
    </form>
    </table>
    <!--���غ��� ��� ��� �� ---------------------------------------------------------------------------->

	</td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->

</body>
</html>
