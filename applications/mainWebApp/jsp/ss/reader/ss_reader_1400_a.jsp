<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1400_a.jsp
* ��� : VacationStop ��� �ʱ�ȭ��
* �ۼ����� : 2004-05-25
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_VSCOST_INITDataSet ds = (SS_L_VSCOST_INITDataSet)request.getAttribute("ds");
    int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
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
	document.vscost_search_form.bonm.focus();
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
    var lo_form1 = document.vscost_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';								// ��������ȣ �ʱ�ȭ

	// ��� ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/reader/1410";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.vscost_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // �̻絶�� ��û��� ��ȸ������ "/ss/reader/1410" �������� ������
    lo_form1.action = "/ss/reader/1410";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���� �˻�
function area_search(){
    var lo_form1 = document.vscost_search_form;
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
    var lo_form1 = document.vscost_search_form;

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

    var lo_form1 = document.vscost_search_form;

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
		var lo_form2 = document.vscost_search_form;
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

    var lo_form1 = document.vscost_search_form;

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
		lo_form1.frdt.value = "";
		lo_form1.todt.value = "";
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
    var lo_form1 = document.vscost_search_form;

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
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >������Ȳ
      &gt; </b> Vacation Stop &gt; ���</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr>
    <td>

	<!--VacationStop ��� �˻� ����-->
	<table width="830" border="0" cellspacing="0" cellpadding="2" bgcolor="#EBE9DC">
	<form name="vscost_search_form" method="post" action="" >
		<input name="pageno" type="hidden" value ="1">			                <!-- ���� ������ ��ȣ -->
		<input name="pagesize" type="hidden" value ="<%= moveListCount%>">	    <!-- �� ȭ��� ����Ʈ �׸� �� -->
		<input name="js_fn_nm" type="hidden" value ="page_move">
		<input name="common_deptcd" type="hidden" value ="">                    <!-- ���� �μ�(��)�ڵ� -->
		<input name="bocd" type="hidden" value ="">                         	<!-- ���������ڵ� -->
		<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->

		<tr>
			<td class="title"  bgcolor="#EBE9DC" width="40"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;</td>
			<td class="title"  width="80">
                <select name="deptcd" onChange="area_search();" class="sel_all"><!-- �μ�(��)�ڵ�, �ڵ�� ��� -->
<%
					writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
                </select>
			</td>
			<td class="title"  bgcolor="#EBE9DC" width="40"> <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
			<td class="title"  width="100">
                <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
<%
					writeAreaOpt(session, out, true);
%>
                </select>
			</td>
			<td class="title"  bgcolor="#EBE9DC" width="40">
			<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
			<td class="title"  width="160">
				<input name="bonm" type="text" size="10" class="text_box" value="" style="ime-mode:active;" onkeydown="bo_enter_search();">
				<input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search.gif" width="36" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;">
				<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
			</td>
			<td class="title"  width="50"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ</td>
			<td class="title"  width="180">
				<input name="frdt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="�Ⱓ" dataType="date">
				-
				<input name="todt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="�Ⱓ" dataType="date">
				<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('2');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
			</td>
			<td class="title"  align="right">
				<input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;">
			</td>
		</tr>
	</form>
	</table>
	<!--VacationStop ��� �˻� ��-->
     </td>
  </tr>
  <tr>
    <td height="10">

	<!--VacationStop ��� ��� ����-->
	<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="vscost_list_id">
		<tr bgcolor="#DDDDDD" height="23">
			<td class="gray" align="center" width="70">�ǿ�</td>
			<td class="gray" align="center" width="110">�ް���</td>
			<td class="gray" align="center" width="60">��&nbsp;</td>
			<td class="gray" align="center" width="60">����</td>
			<td class="gray" align="center" width="80">����</td>
			<td class="gray" align="center" width="60">��޺μ�</td>
			<td class="gray" align="center" width="60">�ܰ�</td>
			<td class="gray" align="center" width="60">�ݾ�</td>
			<td class="gray" width="90" align="center">������������</td>
			<td class="gray" align="center">�����Ⱓ</td>
		</tr>
		<%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
		<%for(int i=0; i<moveListCount; i++){%>
		<tr>
			<td class="gray" align="center" width="70">&nbsp;</td>
			<td class="gray" align="center" width="110">&nbsp;</td>
			<td class="gray" align="center" width="60">&nbsp;</td>
			<td class="gray" align="center" width="60">&nbsp;</td>
			<td class="gray" align="center" width="80">&nbsp;</td>
			<td class="gray" align="center" width="60">&nbsp;</td>
			<td class="gray" align="right" width="60">&nbsp;</td>
			<td class="gray" align="right" width="60">&nbsp;</td>
			<td class="gray" align="center" width="90">&nbsp;</td>
			<td class="gray" align="center">&nbsp;</td>
		</tr>
	<%}%>
	<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
		<tr bgcolor="#DDDDDD" align="right">
			<td  height="23" class="gray" colspan="10">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7">  <b>�ѱݾ� �� </b>&nbsp;&nbsp;
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7">  <b>�ѰǼ� �� </b>
			</td>
		</tr>
	</table>
	<!--VacationStop ��� ��� �� -->
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
                    <jsp:param name = "pagesize" 	value="<%= moveListCount%>"/>
                    <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </td>
        </tr>
    </table>
    <!-- ������ �̵� -->

    </td>
  </tr>
</table>
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" height="0" width="0" ></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
