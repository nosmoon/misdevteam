<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1600_a.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-�������-�ʱ�ȭ��
* �ۼ����� : 2004-03-29
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_INIT_CYEXTNDataSet ds = (SS_L_PROMSTAF_INIT_CYEXTNDataSet)request.getAttribute("ds");
    int promstafListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
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
	document.promstaf_search_form.stafnm.focus();
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
function list_search(){
    var lo_form1 = document.promstaf_search_form;


    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

	// ��� ��� ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/extn/1605";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �󼼺���
function detail_view(stafclsfcd, stafno){
    var lo_form1 = document.promstaf_list_form;

    // ��������ڵ�, �����ȣ�� "/ss/extn/1610" �������� ������
    lo_form1.stafclsfcd.value = stafclsfcd;
    lo_form1.stafno.value = stafno;
    lo_form1.action = "/ss/extn/1610";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.promstaf_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;

    // ��� ��� ��ȸ������ "/ss/extn/1605" �������� ������
    lo_form1.action = "/ss/extn/1605";
    lo_form1.target = "ifrm";

    lo_form1.submit();
    return;
}

// ���̹���� ��� ����Ʈ
function print_list(){
    var lo_form1 = document.promstaf_search_form;


    if(!check_all(lo_form1)) return;				// form ��ȿ�� üũ

	// ��â�� ����Ʈ�� ���� window�� ����.
	var opt = ",toolbar=no,menubar=yes,location=no,scrollbars=yes,status=yes,resizable=yes";
    var lw_print_window = window.open("about:blank", "print_target", "left=" + 0 + ",top=" +  0 + ",width=" + 800 + ",height=" + 600  + opt );
	lw_print_window.resizeTo(screen.availWidth, screen.availHeight);
    lo_form1.action = "/ss/extn/1615";
    lo_form1.target = "print_target";
    lo_form1.submit();
    lw_print_window.focus();
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
    if(window.event) window.event.returnValue = false;
    var lo_form1 = document.promstaf_search_form;

	if(flag == '1'){			// �μ�,����,���� �ʱ�ȭ
	}else if(flag == '2'){		// �Ⱓ �ʱ�ȭ
		lo_form1.frdt.value = "";
		lo_form1.todt.value = "";
		lo_form1.frdt.focus();
	}else if(flag == '3'){		// ��Ÿ �ʱ�ȭ
	}
}

//-->
</script>

</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle">
      Ȯ����Ȳ &gt; </b> ���̹�Ȯ�� > �������</td>
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
	<!--�˻� ����-->
	<table width="830" border="0" cellspacing="0" cellpadding="2" id="code_search">
	<form name="promstaf_search_form" method="post" >
		<input name="pageno" type="hidden" value ="1">			                	<!-- ���� ������ ��ȣ -->
		<input name="pagesize" type="hidden" value ="<%= promstafListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
		<input name="js_fn_nm" type="hidden" value ="page_move">
		<input name="applySession" type="hidden" value ="">   	<!-- ���� ���� ���� -->
		<tr>
			<td bgcolor="#EBE9DC" class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�������
			</td>
			<td bgcolor="#EBE9DC" class="title">
				<select name="stafclsfcd" class="sel_all">
					<%= ds.curstafclsfcdOptHtml("40") %>	<!-- ���̹�Ȯ��	-->
				</select>
			</td>
			<td bgcolor="#EBE9DC" class="title" width="70"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">������
			</td>
			<td bgcolor="#EBE9DC" class="title">
				<select name="cntrstatcd" class="sel_all">
					<option value="" selected>��ü</option>
					<%= ds.curcntrstatcdOptHtml("10") %>
				</select>
			</td>

            <td height="25" bgcolor="#EBE9DC"  class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ
	            <input name="frdt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="��������" dataType="date">
	            -
	            <input name="todt" type="text" class="text_box" value="<%= Util.getDate2()%>" size="10" caption="��������" dataType="date">
	            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--�Ⱓ �ʱ�ȭ-->
        	</td>
			<td bgcolor="#EBE9DC" class="title" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�����</td>
			<td bgcolor="#EBE9DC" class="title" width="60">
				<input name="stafnm" type="text" style="ime-mode:active;" size="8" class="text_box">
			</td>
			<td bgcolor="#EBE9DC" class="title" width="60"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�����ڸ�</td>
			<td bgcolor="#EBE9DC" class="title" width="60">
				<input name="cnvsstafnm" type="text" style="ime-mode:active;" size="8" class="text_box">
			</td>
			<td bgcolor="#EBE9DC" class="title" align="right">
				<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="javascript:list_search();window.event.returnValue=false;"><!--��� ��ȸ-->
			</td>
		</tr>
		<tr>
			<td height="3" colspan="6">
				<!--����-->
			</td>
		</tr>
	</form>
	</table>
	<!--���̹���� �˻� ��-->

	<table width="830" border="0"  cellpadding="1" cellspacing="0">
		<tr>
			<td  height="27" bgcolor="#EBE9DC" class="title">���̹���� ��� </td>
			<td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="50">
				<input type="image" id="print_id" src="/html/comm_img/bu_print.gif" width="39" height="19" align="absmiddle" onclick="javascript:print_list();jsInit();window.event.returnValue=false;">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
			<!--����-->
			</td>
		</tr>
	</table>


	<!--���̹���� ��� ����-->
	<table width="830" border="0"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="promstaf_list_id">
	<form name="promstaf_list_form" method="post" action="" >
		<input name="stafclsfcd" type="hidden" value="">
		<input name="stafno" type="hidden" value="">

		<tr align="center" height="23">
			<td width="150" bgcolor="#dddddd" class="gray">�����</td>
			<td width="150" bgcolor="#dddddd" class="gray">�����ڸ�</td>
			<td width="150" bgcolor="#dddddd" class="gray">�������</td>
			<td width="150" bgcolor="#dddddd" class="gray">�޴�����ȣ</td>
			<td bgcolor="#dddddd" class="gray">�̸���</td>
		</tr>

        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
        <%for(int i=0; i<promstafListCount; i++){%>
		<tr>
			<td width="150" class="gray">&nbsp;</td>
			<td width="150" class="gray">&nbsp;</td>
			<td width="150" class="gray">&nbsp;</td>
			<td width="150" class="gray">&nbsp;</td>
			<td class="gray">&nbsp;</td>
		</tr>
        <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>

		<tr bgcolor="#dddddd">
			<td  height="23" class="gray" colspan="11" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
			</td>
		</tr>

	</form>
	</table>
    <!-- ������ �̵� -->
    <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_id">
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
                    <jsp:param name = "pagesize" 	value="<%= promstafListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->
	<!--���̹���� ��� ��-->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!--���� -->
    </td>
  </tr>
  <td>

    <table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
      <tr>
        <td  height="25" bgcolor="#EBE9DC" class="title">�󼼳���</td>
      </tr>
      <tr>
        <td height="3">
          <!--����-->
        </td>
      </tr>
    </table>

    <!--���̹���� �� ����-->
	<table width="830" border="0"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="promstaf_detail_id">
		<tr>
			<td rowspan="4" width="80" bgcolor="#EBE9DC" class="gray">�������</td>
			<td width="100" bgcolor="#dddddd" class="gray">����</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">�������</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">�ֹε�Ϲ�ȣ</td>
			<td class="gray">&nbsp;</td>
		</tr>
        <tr>
			<td width="100" bgcolor="#dddddd" class="gray">��ȭ��ȣ</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">�޴�����ȣ</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">�̸���<font color="red">&nbsp;</font></td>
			<td class="gray">&nbsp;</td>
        </tr>
        <tr>
			<td width="100" bgcolor="#dddddd" class="gray">�ּ�</td>
			<td colspan="5"  class="gray">&nbsp;</td>
        </tr>
        <tr >
			<td width="100" bgcolor="#dddddd" class="gray">�����</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">������</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">���¹�ȣ</td>
			<td class="gray">&nbsp;</td>
        </tr>
		<tr>
			<td rowspan="2" width="80" bgcolor="#EBE9DC" class="gray">����������</td>
			<td width="100" bgcolor="#dddddd" class="gray">����</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">�������</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">�ֹε�Ϲ�ȣ</td>
			<td class="gray">&nbsp;</td>
		</tr>
        <tr>
			<td width="100" bgcolor="#dddddd" class="gray">��ȭ��ȣ</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">�޴�����ȣ</td>
			<td width="120" class="gray">&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">�̸���<font color="red">&nbsp;</font></td>
			<td class="gray">&nbsp;</td>
        </tr>
	</table>
	<!--���̹���� �� ��-->

    </td>
  </tr>
</table>
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="100%" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
