<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1400_a.jsp
* ��� : ����Info-������ǰ��Ȳ-��Ȳ-�ʱ�ȭ��
* �ۼ����� : 2004-01-26
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
	SS_L_ASET_INITDataSet ds = (SS_L_ASET_INITDataSet)request.getAttribute("ds");
    int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
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
	document.aset_search_form.bonm.focus();
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
    var lo_form1 = document.aset_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';								// ��������ȣ �ʱ�ȭ

	// ������ǰ��Ȳ ��Ȳ ��� ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/brinfo/1410";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// page �̵�
function page_move(pageno) {
    var lo_form1 = document.aset_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

	// ������ǰ��Ȳ ��Ȳ ��� ��ȸ������ �ش� �������� ������.
    lo_form1.action = "/ss/brinfo/1410";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���� �˻�
function area_search(){
    var lo_form1 = document.aset_search_form;
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
    var lo_form1 = document.aset_search_form;
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

    var lo_form1 = document.aset_search_form;

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
		var lo_form2 = document.aset_search_form;
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

    var lo_form1 = document.aset_search_form;

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


// ��ǰ �� ȭ�� �б�
function go_aset_detail(deptcd, areacd, areanm, bocd, bonm, asetclascd){
    var lo_form1 = document.go_detail_form;

    lo_form1.deptcd.value = deptcd;
    lo_form1.areacd.value = areacd;
    lo_form1.areanm.value = areanm;
    lo_form1.bocd.value = bocd;
    lo_form1.bonm.value = bonm;
    lo_form1.asetclascd.value = asetclascd;
    lo_form1.action = "/ss/brinfo/1420";
    lo_form1.target = "_self";
    lo_form1.submit();

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
    var lo_form1 = document.aset_search_form;

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
      &gt; </b> ������ǰ��Ȳ &gt; ��Ȳ</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<!--�˻�����-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <form name="aset_search_form" method="post" action="" >
    <input type="hidden" name="pageno" value ="1">						<!-- ���� ������ ��ȣ -->
    <input type="hidden" name="pagesize" value ="<%= moveListCount%>">	<!-- �� ȭ��� ����Ʈ �׸� �� -->
    <input type="hidden" name="js_fn_nm" value ="page_move">
    <input type="hidden" name="common_deptcd" value ="">                    	<!-- ���� �μ�(��)�ڵ� -->
    <input type="hidden" name="bocd" value ="">                         		<!-- ���������ڵ� -->
    <input name="applySession" type="hidden" value ="<%= applySession%>">   	<!-- ���� ���� ���� -->

  <tr>
    <td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;
    </td>
    <td bgcolor="#EBE9DC" class="title" width="80">
	    <select name="deptcd" onChange="area_search();" class="sel_all">
<%
			writeDeptOpt(session, out, ds.curdeptcdOptHtml(""), true);
%>
	    </select>
    </td>
    <td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">
      ���� </td>
    <td bgcolor="#EBE9DC" class="title" width="80">
        <select name="areacd" size="1" id="areacd_id" class="sel_all">  <!--�����ڵ�, ������ ���-->
<%
			writeAreaOpt(session, out, true);
%>
        </select>
    </td>
    <td bgcolor="#EBE9DC" class="title" width="50"><img src="/html/comm_img/ic_title.gif" width="12" height="7">����
    </td>
    <td bgcolor="#EBE9DC" class="title" width="140">
      <input type="text" name="bonm" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
      <input type="image" id="bo_search_id" border="0" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;"> <!--�����˻��˾�-->
      <input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
    </td>
    <td bgcolor="#EBE9DC" class="title" align="right">
      <input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" onclick="set_request('L');bo_list_search();window.event.returnValue=false;">
    </td>
  </tr>
  <tr>
    <td height="3" colspan="7">
      <!--����-->
    </td>
  </tr>
  </form>
</table>
<!--�˻���-->
<!--list start-->
<table border="0" cellspacing="0" align="center" id="aset_list_id">
<tr><td>
<table width="830" border="0" cellspacing="0" align="center" class="gray" bgcolor="#FFFFFF">
  <tr bgcolor="#dddddd" align="center" height="23">
    <td width="59" class="gray"> ��&nbsp; </td>
    <td width="59" class="gray"> ���� </td>
    <td width="59" class="gray"> ���� </td>
	<%
	for(int i=0; i<ds.asetclascd.size(); i++){
		SS_L_ASET_INITASETCLASCDRecord asetclascdRec = (SS_L_ASET_INITASETCLASCDRecord)ds.asetclascd.get(i);
	%>
		<td width="70" class="gray"><%= asetclascdRec.cicdnm%></td>
	<%}%>
    <td width="59" class="gray"> �� </td>
  </tr>
    <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
    <%for(int j=0; j<moveListCount; j++){%>
  <tr>
    <td width="59" class="gray"> &nbsp; </td>
    <td width="59" class="gray"> &nbsp; </td>
    <td width="59" class="gray"> &nbsp; </td>
	<%
		for(int k=0; k<ds.asetclascd.size(); k++){
	%>
    	<td width="70" class="gray" align="right"> &nbsp; </td>
	<%	}%>
    <td width="59" class="gray" align="right"> &nbsp; </td>
  </tr>
	<%}%>
    <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>

  <tr bgcolor="#dddddd">
    <td  colspan="3" class="gray" align="center"> &nbsp;�Ұ� </td>
	<%
		for(int p=0; p<ds.asetclascd.size(); p++){
	%>
    	<td width="70" class="gray" align="right"> &nbsp; </td>
	<%	}%>
    <td width="59" class="gray" align="right"> &nbsp; </td>
  </tr>
  <tr bgcolor="#dddddd" align="right"  height="23">
    <td colspan="<%=4+ds.asetclascd.size()%>" height="23" class="gray">
    	<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>�ѰǼ� ��</b>
    </td>
  </tr>
</table>
<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr>
    <td align="center" height="2" colspan="<%=4+ds.asetclascd.size()%>">
      <!--����-->
    </td>
  </tr>
    <tr>
        <td align="center" height="24" bgcolor="#E8E8E8" colspan="<%=4+ds.asetclascd.size()%>">
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
</td></tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<!--��ǰ��Ȳ ��Ͽ��� ��ǰ��ȭ������ �б��ϱ� ���� ��-->
<form name="go_detail_form" method="post" action="" >
	<input type="hidden" name="deptcd" value="">		<!--�μ�(��)�ڵ�-->
	<input type="hidden" name="areacd" value="">		<!--�����ڵ�-->
	<input type="hidden" name="areanm" value="">		<!--������-->
	<input type="hidden" name="bocd" value="">			<!--���������ڵ�-->
	<input type="hidden" name="bonm" value="">			<!--���������-->
	<input type="hidden" name="asetclascd" value="">	<!--��ǰ�з��ڵ�-->
</form>
</body>
</html>
