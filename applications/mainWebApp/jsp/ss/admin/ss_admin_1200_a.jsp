<%@ page contentType="text/html; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1200_a.jsp
* ��� : ������-���̱׷��̼�-����-�ʱ�ȭ��
* �ۼ����� : 2004-03-11
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");
    int migListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    String paramGbn = "##";
    applySession = true;	// ���� ���� ����
%>
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">

<script language="JavaScript" src="/html/comm_js/common.js"></script>
<style>
	.on_1{background-image:url("/html/comm_img/tb3_01.gif");}
	.on_2{background-image:url("/html/comm_img/tb3_02.gif");}
	.on_3{background-image:url("/html/comm_img/tb3_03.gif");}
	.on_4{background-image:url("/html/comm_img/tb3_04.gif");}
   	.on_5{background-image:url("/html/comm_img/tb3_05.gif");}
	.on_6{background-image:url("/html/comm_img/tb3_06.gif");}
	.off_1{background-image:url("/html/comm_img/tb4_01.gif");}
	.off_2{background-image:url("/html/comm_img/tb4_02.gif");}
	.off_3{background-image:url("/html/comm_img/tb4_03.gif");}
	.off_4{background-image:url("/html/comm_img/tb4_04.gif");}
   	.off_5{background-image:url("/html/comm_img/tb4_05.gif");}
	.off_6{background-image:url("/html/comm_img/tb4_06.gif");}
</style>
<script language="JavaScript">
<!--
// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.mig_search_form.bonm.focus();
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
function area_search(flag){
    if(flag == '1'){        // �˻� �� ���� �˻�
	    var lo_form1 = document.mig_search_form;
        if(lo_form1.deptcd.value == '') {
            var str = "<select id=areacd_id name=\"areacd\" class=\"sel_all\">" +
                          "<option value='' selected>��ü</option>" +
                      "</select>"
            document.all.areacd_id.outerHTML = str;
            return;
        }

        // �μ�(��)�ڵ尪�� "/ss/common/1100" �������� ������
        lo_form1.action = "/ss/common/1100";
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
        lo_form1.target = "ifrm";
        lo_form1.submit();
    }else if(flag == '2'){  // �� �� ������� ���� �˻�
	    var lo_form1 = document.mig_detail_form;
        if(lo_form1.deptcd.value == '') {
            var str = "<select id=accd_areacd_id name=\"areacd\" class=\"sel_all\">" +
                          "<option value='' selected>����</option>" +
                      "</select>"
            document.all.accd_areacd_id.outerHTML = str;
            return;
        }

        // �μ�(��)�ڵ尪�� "/ss/common/1106" �������� ������
        lo_form1.action = "/ss/common/1106";
	    lo_form1.common_deptcd.value = lo_form1.deptcd.value;
        lo_form1.target = "ifrm";
        lo_form1.submit();
   }
}

// ����ã�� �˾�
// Ȯ����Ȳ�� ����ã�Ⱑ 2���̹Ƿ� �Ű������� ���� ������ ó���Ѵ�.
// ���������ڵ�, ����������� �˾����κ��� �Ѿ�´�. �� ���� �����ڴ� "\n"
function bo_search(bocd){
	var lo_form1 = document.mig_search_form;
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

    var lo_form1 = document.mig_search_form;

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
		var lo_form2 = document.mig_search_form;
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
    var lo_form1 = document.mig_search_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

	// ��� �˻������� "/ss/admin/1205" �������� ������.
    lo_form1.action = "/ss/admin/1205";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ��ü����, ���
function check_all_chk(bool){
    var lo_form1 = document.mig_detail_form;

    if(lo_form1.sp_desc==null) {							// ���õ� ���� ���� ���
        return;
    } else if(lo_form1.sp_desc.type=="checkbox") {			// �Ѱ��� ���
        lo_form1.sp_desc.checked = bool;
    } else {												// �������� ���
        for(var i=0; i<lo_form1.sp_desc.length; i++) {
            lo_form1.sp_desc[i].checked = bool;
        }
    }
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.mig_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	// ��� �˻������� "/ss/admin/1205" �������� ������.
    lo_form1.action = "/ss/admin/1205";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

function mecd_list(str) {
	var form2 = document.mig_search_form;

	// �������а��� �ڵ屸�а��� "/pilot/1014" �������� ������

	//form2.ciTeamcd.value = form1.txtTeamcd.value;
	//form2.ciDstccd.value = form1.txtDstccd.value;
	form2.bocd.value = str;
	form2.action = "/ss/admin/1210";
	form2.target = "ifrm";
	form2.submit();
	//ifrm.location = "/jsp/ss/sl_basic_1014_l.jsp";
}

// TABŬ���� �ش� ���̾� ǥ�� �Ǵ� ����
function displayTab(tapValue) {
	var form = document.mig_search_form;
	form.tabKey.value = tapValue;
	if(tapValue == "tab11"){			// ���� ��Ȳ
		form.action = "/ss/admin/1210";
		form.target = "ifrm";
		form.submit();
	} else if(tapValue == "tab12") {	// ������ ��Ȳ
		form.action = "/ss/admin/1215";
		form.target = "ifrm";
		form.submit();
	} else if(tapValue == "tab13") {	// ���ݹ���� ��Ȳ
		form.action = "/ss/admin/1220";
		form.target = "ifrm";
		form.submit();
	} else if(tapValue == "tab14") {

	} else if(tapValue == "tab15") {
		form.action = "/ss/admin/1230";
		form.target = "ifrm";
		form.submit();
	}
}

// TAB�� ���� �ٲٱ�
function set_background_color(){
    var forms = document.forms;
    var elements;
    for(var i=0; i<forms.length; i++){
    	elements = forms(i).elements;
    	for(var j=0; j<elements.length; j++){
            if(elements(j).tagName != "INPUT") continue;
        	if(elements(j).readOnly){
            	elements(j).style.backgroundColor = "#E6E6E6";
            	elements(j).style.color = "#6B6B6B";
        	}else{
            	elements(j).style.backgroundColor = "#FFFFFF";
                elements(j).style.color = "#000000";
        	}
        }
    }
}

//��ü tab ��ü�� ���� display ����
function set_on_off_medi_tab(curr_tab_id, i_total_count){
    var ls_tab_id = "";
	for(var i=0; i<i_total_count; i++){
        ls_tab_id = "tab_" + i;

    	if(curr_tab_id == ls_tab_id){
        	set_medi_tab(document.all(ls_tab_id), "on");
    	}else{
        	set_medi_tab(document.all(ls_tab_id), "off");
        }
    }
}

//��ü tab "ON/OFF"
function set_medi_tab(o_this, s_on_off){
	var lo_cells = o_this.cells;
    //alert(o_this.id);
    var count = 1;
    for (i=0; i < o_this.rows.length; i++) {
        for (j=0; j < o_this.rows(i).cells.length; j++) {
            //alert(o_this.rows(i).cells(j).outerHTML );
            o_this.rows(i).cells(j).className = s_on_off + "_" + count++;
        }
    }
}

// ��Ͽ��� ���õ� �ο� ��������
var go_sel_row;

// ���õ� �ο� ���� �ٲٱ�
function change_sel_row(obj){
	go_sel_row = obj;
	obj.style.backgroundColor='#BFD2DD';
	lo_table = obj.parentNode;
	for(i=1; i<lo_table.rows.length; i++){
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

    var lo_form1 = document.mig_search_form;

	if(flag == '1'){			// �μ�(��),����,���� �ʱ�ȭ
		// �μ�(��) �ʱ�ȭ
		lo_form1.deptcd.outerHTML =  '<select name="deptcd" onChange="area_search();" class="sel_all">'
									+'<% writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true); %>'
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

// ��� ��ȸ�� �������� ������ ��� �����˻� �� ��� ��ȸ�� �����Ѵ�.
// �̰�� �ܼ� �����˻��� �����˻� �� ��� ��ȸ�� �����ؾ� �ϴ°� �����ؾ� �ϰ� �����ȸ�� �����ؾ� �ϴ� ���� gs_request �������� L �� �����Ѵ�.
var gs_request = 'N';	// N : ��û����, L : ��ȸ��û

// ��û �÷��� ����
function set_request(flag){
	gs_request = flag;
}

// �����˻��� ���� ��� ��ȸ
function bo_list_search(){
    var lo_form1 = document.mig_search_form;

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

//////////////////// print ////////////////
var tempHtmlContent;

function printDiv () {
   if (document.all && window.print) {
       window.onbeforeprint = beforeDivs;
       window.onafterprint = afterDivs;
       window.print();
   }
}
function beforeDivs () {
   if (document.all) {
       var rng = document.all("pDiv").createTextRange( );
       if (rng!=null) {
           alert(rng.htmlText);
           tempHtmlContent = rng.htmlText;
           rng.pasteHTML("<table border=0 align=center><tr><td align=center>"
                                       + document.all("pDiv").innerHTML + "</td></tr></table>");
       }
   }
}
function afterDivs () {
   if (document.all) {
       var rng = document.all("pDiv").createTextRange( );
           if (rng!=null) {
                       rng.pasteHTML(tempHtmlContent);
           }
   }
}

//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >������
		> </b>�۾� &gt; ���̱׷��̼�</td>
	</tr>
	<tr>
		<td height="10">
			<!--������ ���� ����-->
		</td>
	</tr>
</table>
<table width="830" border="0" cellspacing="0" cellpadding="0" align="center">
  <td width="400"><tr>
    <td>

	<!--���̱׷��̼� �˻� ���� ---------------------------------------------------------------------------->
	<table width="830" border="0" cellspacing="0" cellpadding="2" class="title1" bgcolor="#EBE9DC">
	<form name="mig_search_form" method="post" action="" >
		<input type="hidden" name="tabKey" value="tab11">
        <input name="pageno" type="hidden" value ="1">			                	<!-- ���� ������ ��ȣ -->
        <input name="pagesize" type="hidden" value ="<%=migListCount%>">			<!-- �� ȭ��� ����Ʈ �׸� �� -->
        <input name="js_fn_nm" type="hidden" value ="page_move">
		<input name="common_deptcd" type="hidden" value ="">                    	<!-- ���� �μ�(��)�ڵ� -->
		<input name="bocd" type="hidden" value ="">                    				<!-- �����ڵ� -->
        <input name="applySession" type="hidden" value ="<%=applySession%>">   	<!-- ���� ���� ���� -->
		<tr>
			<td bgcolor="#EBE9DC" width="135" >
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��&nbsp;
	            <select name="deptcd" onChange="area_search('1');" class="sel_all">	<!-- �μ�(��)�ڵ�, �ڵ�� ��� -->
<%

					writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true);
%>
	            </select>
			</td>
			<td width="165" >
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
	            <select name="areacd" size="1" id="areacd_id" class="sel_all"><!--�����ڵ�, ������ ���-->
<%
					writeAreaOpt(session, out, true);
%>
	            </select>
			</td>
			<td width="180">
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����
				<input name="bonm" type="text" size="10" class="text_box" style="ime-mode:active;" onkeydown="bo_enter_search();">
            	<input type="image" id="bo_search_id" src="/html/comm_img/bu_search02.gif" width="39" height="19" align="absmiddle" onclick="javascript:bo_search();window.event.returnValue=false;" border="0"><!--�����˻��˾�-->
            	<input type="image" src="/html/comm_img/bu_minus.gif" width="15" height="19" align="absmiddle" onclick="javascript:set_default('1');window.event.returnValue=false;"> <!--�μ�(��),����,���� �ʱ�ȭ-->
            </td>
			</td>
			<td colspan="2">
				<img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ
			<input name="frdt" type="text" class="text_box"  value="<%= Util.getDate2()%>" size="10" caption="��������" dataType="date">
			-
			<input name="todt" type="text" class="text_box"  value="<%= Util.getDate2()%>" size="10" caption="��������" dataType="date">
			</td>
			<td bgcolor="#EBE9DC" rowspan="2" width="40" align="right">
				<input type="image" id="search_id" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" onclick="set_request('L');bo_list_search();window.event.returnValue=false;" border="0" >
			</td>
		</tr>
	</form>
	</table>
	<!--���̱׷��̼� �˻� �� ---------------------------------------------------------------------------->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!------����--- -->
    </td>
  </tr>
  <tr>
    <td height="10">

    <!--���̱׷��̼� ��� ���� ---------------------------------------------------------------------------->
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="mig_list_id">
		<tr bgcolor="#dddddd" align="center">
			<td width="50" height="23" class="gray" rowspan=2> ������ </td>
			<td width="80" height="23" class="gray" rowspan=2> ���� </td>
			<td width="80" height="23" class="gray" rowspan=2> ������ </td>
			<td width="200" height="23" class="gray" colspan=2> ����DB </td>
			<td width="200" height="23" class="gray" colspan=2> ����DB </td>
			<td width="50" height="23" class="gray" rowspan=2> �Ϸ�Ȯ�� </td>
			<td width="100" height="23" class="gray" rowspan=2> Ȯ������ </td>
		</tr>
		<tr bgcolor="#dddddd" align="center">
			<td width="100" height="23" class="gray"> UPLOAD </td>
			<td width="100" height="23" class="gray"> ��ȯ�Ϸ� </td>
			<td width="100" height="23" class="gray"> UPLOAD </td>
			<td width="100" height="23" class="gray"> ��ȯ�Ϸ� </td>
		</tr>

    <%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
    <%for(int i=0; i<migListCount; i++){%>
		<tr>
			<td width="50" height="23" class="gray"> &nbsp; </td>
			<td width="80" height="23" class="gray"> &nbsp; </td>
			<td width="80" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
			<td width="50" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
		</tr>
    <%}%>
    <%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
	<tr bgcolor="#dddddd">
		<td colspan="7" align="center" class="gray">
            <!-- ������ �̵� -->
            <table border="0" cellspacing="0" cellpadding="0" id="page_move">
                <tr>
                    <td align="center" height="2">
                    <!--����-->
                    </td>
                </tr>
                <tr>
                    <td align="center" height="20">
                    <!--JSP PAGE START---------------------------------------------------------------------------------->
                    <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                            <jsp:param name = "pageno" 		value="1"/>
                            <jsp:param name = "totalcnt" 	value="0"/>
                            <jsp:param name = "js_fn_nm" 	value="page_move"/>
                            <jsp:param name = "pagesize" 	value="<%=migListCount%>"/>
                            <jsp:param name = "page_set_gubun" 	value="0"/>
                    </jsp:include>
                    <!--JSP PAGE END------------------------------------------------------------------------------------>
                    </td>
                </tr>
            </table>
            <!-- ������ �̵� -->
		</td>
		<td colspan="2" class="gray" align="center">
			<div align="right"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�ѰǼ�: <b>0 ��</b></div>
		</td>
	</tr>
    </table>

    <!--���̱׷��̼� ��� �� ---------------------------------------------------------------------------->
    </td>
  </tr>
  <tr>
	<td>
      <table width="830" border="0" cellspacing="0" cellpadding="0" align="center"  style="visibility:visible" class="title2">
		<tr>
          <td colspan="5" width="330" height="3">
            <!--tab ����-->
          </td>
        </tr>
        <tr>
          <td width="100">
            <!--tab 1-->
            <table id="tab_0" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:displayTab('tab11');set_on_off_medi_tab(this.id, 5);" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb3_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb3_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb3_03.gif" width=5 height=3 ></td>
              </tr>
              <tr>
                <td background="/html/comm_img/tb3_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb3_05.gif">����</td>
                <td background="/html/comm_img/tb3_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 1 end-->
          </td>
          <td width="100">
            <!--tab2-->
            <table id="tab_1" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_medi_tab(this.id, 5);displayTab('tab12');" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
              </tr>

              <tr>
                <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb4_05.gif">������</td>
                <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 2 end-->
          </td>
          <td width="100">
            <!--tab3-->
            <table id="tab_2" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_medi_tab(this.id, 5);displayTab('tab13');" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
              </tr>
              <tr>
                <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb4_05.gif">���ݹ����</td>
                <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 3 end-->
          </td>
          <td width="100">
            <!--tab3-->
            <table id="tab_3" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_medi_tab(this.id, 5);displayTab('tab14');" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
              </tr>
              <tr>
                <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb4_05.gif">�ڵ���ü����</td>
                <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 3 end-->
          </td>
          <td width="100">
            <!--tab3-->
            <table id="tab_4" border=0 cellpadding=0 cellspacing=0 width="100%" onclick="javascript:set_on_off_medi_tab(this.id, 5);displayTab('tab15');" style="cursor:hand">
              <tr>
                <td height=3 background="/html/comm_img/tb4_01.gif" width=5 height=3 ></td>
                <td  background="/html/comm_img/tb4_02.gif" height=3 ></td>
                <td height=3 background="/html/comm_img/tb4_03.gif" width=5 height=3 ></td>
              </tr>
              <tr>
                <td background="/html/comm_img/tb4_04.gif"  style width="5"></td>
                <td  align="center" background="/html/comm_img/tb4_05.gif">����������ȸ</td>
                <td background="/html/comm_img/tb4_06.gif"  style width="5"></td>
              </tr>
            </table>
            <!--tab 3 end-->
          </td>
          <td width="230">
		  </td>
		  <td width="100">
            <span style="cursor:hand" onclick="printDiv();">[�μ�]</span>
            <!--tab ����-->
          </td>
        </tr>
      </table>

	</td>
  </tr>
  <tr>
  	<td>
	  <table width="830" border="0" cellspacing="0" cellpadding="0" class="gray" id="mig_mecd">
	  <div id="pDiv" align="center">
      <form name="form_list" method="post" action="">
      <tr>
        <td height="25" align="left" class="gray">&nbsp;���������</td>
        <td height="25" align="left" class="gray">&nbsp;CRM�ý���</td>
      </tr>
      <tr>
        <td width="50%">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr bgcolor="#dddddd" align="center">
              <td height="23" class="gray">����</td>
              <td class="gray">����</td>
              <td class="gray">������</td>
              <td class="gray">����</td>
              <td class="gray">��Ÿ</td>
              <td class="gray">��μ�</td>
              <td class="gray">��������</td>
            </tr>
            <%-- ��� �ݺ� ���� --%>
            <%for(int i=0; i<migListCount; i++){%>
            <tr>
              <td height="23" class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
			<%}%>
			<tr bgcolor="#dddddd">
              <td height="23" colspan="7" class="gray">
				<%-- �հ� --%>&nbsp;
			  </td>
			</tr>
          </table>
		</td>
        <td width="50%">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr bgcolor="#dddddd" align="center">
              <td height="23" class="gray">����</td>
              <td class="gray">����</td>
              <td class="gray">������</td>
              <td class="gray">����</td>
              <td class="gray">��Ÿ</td>
              <td class="gray">��μ�</td>
              <td class="gray">��������</td>
            </tr>
            <%-- ��� �ݺ� ���� --%>
            <%for(int i=0; i<migListCount; i++){%>
            <tr>
              <td height="23" class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
              <td class="gray">&nbsp;</td>
            </tr>
			<%}%>
			<tr bgcolor="#dddddd">
              <td height="23" colspan="7" class="gray">
				<%-- �հ� --%> &nbsp;
			  </td>
			</tr>
        </table>
		</td>
      </tr>
	</form>
	</div>
    </table>
	</td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="830" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
<%--

--%>
</body>
</html>
