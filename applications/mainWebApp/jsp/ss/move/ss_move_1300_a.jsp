<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_move_1300_a.jsp
* ��� : �̻絶��-�۱�(�������)-�ʱ�ȭ��
* �ۼ����� : 2004-01-09
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
    int rmttListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
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
	document.rmtt_search_form.bonm.focus();
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

    var lo_form1 = document.rmtt_search_form;
    if(lo_form1.deptcd.value == '') {
        var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                      "<option value='' selected>��ü</option>" +
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
    var lo_form1 = document.rmtt_search_form;
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

    var lo_form1 = document.rmtt_search_form;

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
		var lo_form2 = document.rmtt_search_form;
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
function list_search(){
    var lo_form1 = document.rmtt_search_form;

    if(lo_form1.basidt.value == ''){
    	alert("����� �Է��ϼ���");
    	return;
    }

    if(!check_all(lo_form1)) return;				// form ��ȿ�� üũ

    // ȭ�������� ��ȣ�� �ʱ�ȭ�Ѵ�.
    lo_form1.pageno.value = '1';

    // �̻絶�� �۱� ��� ��ȸ������ "/ss/move/1310" �������� ������
    lo_form1.action = "/ss/move/1310";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �۱� ��� ����Ʈ
function print_list(){
    var lo_form1 = document.rmtt_search_form;

    if(lo_form1.basidt.value == ''){
    	alert("����� �Է��ϼ���");
    	return;
    }

    if(!check_all(lo_form1)) return;				// form ��ȿ�� üũ

	// ��â�� ����Ʈ�� ���� window�� ����.
    opt = ",toolbar=no,menubar=yes,location=no,scrollbars=yes,status=no,resizable=yes";
    var lw_print_window = window.open("about:blank", "print_target", "left=" + 0 + ",top=" +  0 + ",width=" + 800 + ",height=" + 600  + opt );
    lo_form1.action = "/ss/move/1320";
    lo_form1.target = "print_target";
    lo_form1.submit();
    lw_print_window.focus();
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.rmtt_search_form;

    if(lo_form1.basidt.value == ''){
    	alert("����� �Է��ϼ���");
    	return;
    }

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;				// form ��ȿ�� üũ

    // �̻絶�� ��û��� ��ȸ������ "/ss/move/1310" �������� ������
    lo_form1.action = "/ss/move/1310";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// �˻� ���� �ʱ�ȭ
function set_default(flag){

    var lo_form1 = document.rmtt_search_form;

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
    var lo_form1 = document.rmtt_search_form;

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
		<td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >�̻絶��
		> </b>�۱�</td>
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

	<!--�̻絶�� �۱� �˻� ����-->
	<table width="830" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC" id="rmtt_search_id">
    <form name="rmtt_search_form" method="post" action="" >
        <input name="pageno" type="hidden" value ="1">			                <!-- ���� ������ ��ȣ -->
        <input name="pagesize" type="hidden" value ="<%= rmttListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
        <input name="common_deptcd" type="hidden" value ="">                    <!-- ���� �μ�(��)�ڵ� -->
        <input name="bocd" type="hidden" value ="">                         	<!-- ���������ڵ� -->
        <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->

		<tr>
			<td class="title"  bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;</td>
			<td class="title"  width="80">
                <select name="deptcd" onChange="area_search();" class="sel_all"><!-- �μ�(��)�ڵ�, �ڵ�� ��� -->
<%
					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true);
%>
                </select>
			</td>
			<td class="title"  bgcolor="#EBE9DC" width="40"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
			<td class="title"  width="80" align="left">
                <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
<%
					writeAreaOpt(session, out, true);
%>
                </select>
			</td>
			<td class="title"  width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
			<td class="title"  width="180">
	            <input name="bonm" type="text" style="ime-mode:active;" size="8" class="text_box" onkeydown="bo_enter_search();">
	            <input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"><!--�����˻��˾�-->
	            <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
			</td>
			<td class="title"  width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">���</td>
			<td class="title"  width="60">
            	<input name="basidt" type="text" size="7" class="text_box" caption="���" value="<%= Util.getYyyyMm()%>" dataType="month">
			</td>

			<td class="title"  width="40"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
			<td class="title"  width="60">
				<select name="sortflag" class="sel_all">
					<option value="" selected>����</option>
					<option value="1">����</option>
					<option value="2">����</option>
				</select>
			</td>
			<td class="title"  align="right">
            	<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;"></td><!--��� ��ȸ-->
			</td>
		</tr>
	</table>
	<!--�̻絶�� �۱� �˻� ��-->

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
			<td  height="27" bgcolor="#EBE9DC" class="title">�̻絶�� �۱ݸ��</td>
			<td  height="27" bgcolor="#EBE9DC" class="title" align="right" width="50">
				<input type="image" src="/html/comm_img/bu_print.gif" width="39" height="19" onclick="jsInit();javascript:;print_list();window.event.returnValue=false;">
			</td>
		</tr>
		<tr>
			<td height="3" colspan="2">
			<!--����-->
			</td>
		</tr>
	</table>

	<!-- �̻絶�� ��û��� ���� -------------------------------------------------------------------------->
	<table width="830"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#ffffff" id="rmtt_list_id">
		<tr bgcolor="#DDDDDD" align="center" height="23">
			<td width="90" 	class="gray">��&nbsp;</td>
			<td width="90" 	class="gray">����</td>
			<td width="100" class="gray">����</td>
			<td width="100" class="gray">������</td>
			<td width="100" class="gray">����</td>
			<td width="200" class="gray">���¹�ȣ</td>
			<td class="gray">�ݾ�</td>
		</tr>

        <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
        <%for(int i=0; i<rmttListCount; i++){%>

		<tr>
			<td width="90" 	class="gray" align="center">&nbsp;</td>
			<td width="90" 	class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="200"	class="gray" align="center">&nbsp;</td>
			<td class="gray">&nbsp;</td>
		</tr>

        <%}%>
        <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>

		<tr bgcolor="#DDDDDD">
		    <td  height="25" class="gray" colspan="7" align="right">
		    	<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѱݾ� �� </b>&nbsp;&nbsp;&nbsp;
		    	<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
		    </td>
		</tr>

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
    <!-- �̻絶�� ��û��� �� -------------------------------------------------------------------------->

	</td>
	</tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
