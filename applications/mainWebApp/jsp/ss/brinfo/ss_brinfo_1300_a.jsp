<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1300_a.jsp
* ��� : ����Info-����������Ȳ-�ʱ�ȭ��
* �ۼ����� : 2004-02-02
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : �Ǹű���û���� ��������� �� ���̹�Ȯ���� ��� ��Ȳ�� �����ֱ�
* ������ : ��뼷
* �������� : 2004/11/12
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	SS_L_BOEMP_INITDataSet ds = (SS_L_BOEMP_INITDataSet)request.getAttribute("ds");
    int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����

	//		String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// ���������ڵ�(�Ǹű���,��������,���������� ��� ��ȸ �ɼ��� �����ش�.)

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
	document.boemp_search_form.bonm.focus();
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
    var lo_form1 = document.boemp_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

	// ����������Ȳ ��� ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/brinfo/1310";
    lo_form1.target = "ifrm";
    check_all(lo_form1);
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {

    var lo_form1 = document.boemp_search_form;

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    // "/ss/brinfo/1310" �������� ������
    lo_form1.action = "/ss/brinfo/1310";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���� �˻�
function area_search(){
    var lo_form1 = document.boemp_search_form;
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


// �󼼸�� ����(�˾�)
function detail_view(bocd){

    var lo_form1 = document.boemp_list_form;

    // ���������ڵ带 "/ss/brinfo/1315" �������� ������
    lo_form1.bocd.value = bocd;

    var ls_win      = "scrollbars=yes,toolbar=no,location=no,directories=no,width=855, height=455 resizable=no,mebar=no,left=140,top=50";
    window.open("about:blank" , "emp_pop", ls_win);

    // �Ǹ����� ����ȭ������ ��â�� ����.
    lo_form1.action = "/ss/brinfo/1315";
    lo_form1.target = "emp_pop";
    lo_form1.submit();

}


// ����ã�� �˾�
function bo_search(){
    var lo_form1 = document.boemp_search_form;
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

    var lo_form1 = document.boemp_search_form;

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
		var lo_form2 = document.boemp_search_form;
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

// �˻� ���� �ʱ�ȭ
function set_default(flag){

    var lo_form1 = document.boemp_search_form;

	if(flag == '1'){			// �μ�(��),����,���� �ʱ�ȭ
		// �μ�(��) �ʱ�ȭ
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search();" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true); %>'
									+'</select>';
		// ���� �ʱ�ȭ
		lo_form1.areacd.outerHTML =  '<select name="areacd" size="1" id="areacd_id" class="sel_all">'
									+'<% writeAreaOpt(session, out, true); %>'
									+'</select>';
		// �����ڵ�,������ �ʱ�ȭ, ��Ŀ���̵�
		lo_form1.bocd.value = "";
		lo_form1.bonm.value = "";
		lo_form1.bonm.focus();
	}else if(flag == '2'){		// �Ⱓ �ʱ�ȭ
	}else if(flag == '3'){		// ��Ÿ �ʱ�ȭ
	}
}

// ��Ͽ��� ���õ� �ο� ��������
var go_sel_row;

// ���õ� �ο� ���� �ٲٱ�
function change_sel_row(obj){
	go_sel_row = obj;
	obj.style.backgroundColor='#BFD2DD';
	lo_table = obj.parentNode;
	for(i=1; i<lo_table.rows.length-2; i++){
		if(lo_table.rows[i] != go_sel_row && i != 1){
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


// ��� ��ȸ�� �������� ������ ��� �����˻� �� ��� ��ȸ�� �����Ѵ�.
// �̰�� �ܼ� �����˻��� �����˻� �� ��� ��ȸ�� �����ؾ� �ϴ°� �����ؾ� �ϰ� �����ȸ�� �����ؾ� �ϴ� ���� gs_request �������� L �� �����Ѵ�.
var gs_request = 'N';	// N : ��û����, L : ��ȸ��û

// ��û �÷��� ����
function set_request(flag){
	gs_request = flag;
}

// �����˻��� ���� ��� ��ȸ
function bo_list_search(){
    var lo_form1 = document.boemp_search_form;

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

//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25"  align="absmiddle" >����Info
      &gt; </b> ����������Ȳ</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>

<!--�˻�����-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
<form name="boemp_search_form" method="post" action="" >
	<input type="hidden" name="pageno" value ="1">				<!-- ���� ������ ��ȣ -->
	<input type="hidden" name="pagesize" value ="<%= moveListCount%>">	<!-- �� ȭ��� ����Ʈ �׸� �� -->
	<input type="hidden" name="js_fn_nm" value ="page_move">
	<input type="hidden" name="common_deptcd" value ="">                    <!-- ���� �μ�(��)�ڵ� -->
	<input type="hidden" name="bocd" value ="">                         	<!-- ���������ڵ� -->
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->
	<tr>
		<td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;</td>
	<td bgcolor="#EBE9DC" class="title" width="80">
		<select name="deptcd" onChange="area_search();" class="sel_all">
<%
			writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
	    </select>
    </td>
    <td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
    <td bgcolor="#EBE9DC" class="title" width="80">
        <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
<%
			writeAreaOpt(session, out, true);
%>
        </select>
    </td>
    <td bgcolor="#EBE9DC" class="title" width="50""><img src="/html/comm_img/ic_title.gif" width="12" height="7">����</td>
    <td bgcolor="#EBE9DC" class="title" width="150">
		<input type="text" name="bonm" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
		<input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--�����˻��˾�-->
		<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
    </td>

<%--20041112 ��뼷 �߰�--%>
    <td bgcolor="#EBE9DC" class="title" width="200">
		<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ȸ����
		&nbsp;
		<select name="viewflag" size="1" class="sel_all">
			<option value="1" selected>����</option>
			<option value="2">������</option>
			<option value="3">������</option>
		</select>
	</td>


<%--�Ǹű���,���������� �μ�(��),����,������ ���ð���--%>
<%--if("110".equals(jobcd) || "120".equals(jobcd)){--%>
<%--
    <td bgcolor="#EBE9DC" class="title" width="200">
		<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ȸ����
		&nbsp;
		<select name="viewflag" size="1" class="sel_all">
			<option value="1" selected>����</option>
			<option value="2">������</option>
			<option value="3">������</option>
		</select>
	</td>
--%>
<%--���������� ����,������ ���ð���--%>
<%--}else if("310".equals(jobcd)){--%>
<%--
    <td bgcolor="#EBE9DC" class="title" width="200">
		<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ȸ����
		&nbsp;
		<select name="viewflag" size="1" class="sel_all">
			<option value="2" selected>������</option>
			<option value="3">������</option>
		</select>
	</td>
--%>
<%--}--%>

    <td bgcolor="#EBE9DC" class="title" align="right">
      <input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="right" onclick="set_request('L');bo_list_search();window.event.returnValue=false;">
    </td>
  </tr>
  <tr>
    <td height="3" colspan="6">
      <!--����-->
    </td>
  </tr>
 </form>
</table>
<!--�˻���-->

<!--list start-->
<table width="830" border="0" cellspacing="0" align="center" class="gray" cellpadding="1" bgcolor="#FFFFFF" id="boemp_list_id">

<form name="boemp_list_form" method="post" action="" >
    <input name="bocd" type="hidden" value ="">

	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray">��&nbsp;</td>
		<td rowspan="2" class="gray" width="60">����</td>
		<td rowspan="2" class="gray" width="60">����</td>
		<td rowspan="2" class="gray" width="60">�߼ۺμ�</td>
		<td rowspan="2" class="gray" width="45">�ѹ�</td>
		<td colspan="5" class="gray">��޿�</td>
		<td rowspan="2" class="gray" width="45">����</td>
		<td rowspan="2" class="gray" width="45">�渮</td>
		<td rowspan="2" class="gray" width="45">�ֹ�</td>
		<td rowspan="2" class="gray" width="45">��Ÿ</td>
		<td rowspan="2" class="gray" width="40">��</td>
		<td rowspan="2" class="gray" width="55">���̹�</td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="45">����</td>
		<td class="gray" width="45">�ֺ�</td>
		<td class="gray" width="45">�˹�</td>
		<td class="gray" width="45">��Ÿ</td>
		<td class="gray" width="40">��</td>
	</tr>
     <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
    <%for(int j=0; j<moveListCount; j++){%>
	<tr>
		<td class="gray" > &nbsp; </td>
		<td class="gray" width="60" > &nbsp; </td>
		<td class="gray" width="60" > &nbsp; </td>
		<td class="gray" align="right" width="60" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="40" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="45" > &nbsp; </td>
		<td class="gray" align="right" width="40" > &nbsp; </td>
		<td class="gray" align="right" width="55" > &nbsp; </td>
	</tr>
	<%}%>
    <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
	<tr bgcolor="#dddddd">
		<td  colspan="4" class="gray" align="right">�Ұ�&nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="40"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="45"> &nbsp; </td>
		<td class="gray" align="right" width="40"> &nbsp; </td>
		<td class="gray" align="right" width="55"> &nbsp; </td>
	</tr>
	<tr align="right" height="23">
		<td colspan="16" bgcolor="#dddddd" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>�ѰǼ� ��</b>
		</td>
	</tr>
</form>
</table>
<!---button-->
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
	    <jsp:param name = "pageno" 			value="0"/>
	    <jsp:param name = "totalcnt" 		value="0"/>
	    <jsp:param name = "js_fn_nm" 		value="page_move"/>
	    <jsp:param name = "pagesize" 		value="<%= moveListCount%>"/>
	    <jsp:param name = "page_set_gubun" 	value="0"/>
	    </jsp:include>
	    <!--JSP PAGE END------------------------------------------------------------------------------------>
    </td>
  </tr>
</table>
<!--list end-->
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
