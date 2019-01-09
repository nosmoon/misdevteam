<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1000_a.jsp
* ��� : �������� ���� �ʱ�ȭ��
* �ۼ����� : 2003-11-20
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    CO_L_SCHE_INITDataSet ds = (CO_L_SCHE_INITDataSet)request.getAttribute("ds");  // request dataset
    int moveListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����

    // �������κ��� ����������� ��´�.
	String deptnm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", true)); //�Ǹźμ���
	String emp_nm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", true)); //����
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
	document.sche_search_form.frdt.focus();
}

// form ������ ��ȿ���� ������ ���� 
// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

//����Ʈ ��ȸ
function list_search(){
    var lo_form1 = document.sche_search_form;
/*
    if(lo_form1.deptcd.value == '') {
        alert("�μ��� �������ּ���.");
        lo_form1.deptcd.focus();
        return;
    } else if(lo_form1.schemangunitcd.value == '') {
        alert("������ �������ּ���.");
        lo_form1.schemangunitcd.focus();
        return;
    }
*/

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	lo_form1.pageno.value = '1';									// ��������ȣ �ʱ�ȭ

    // �μ��� �������� "/ss/share/1010" �������� ������
    lo_form1.action = "/ss/share/1010";
    lo_form1.target = "ifrm";
    lo_form1.submit();
        
}

// ���� �߰�
function add(){
	var lo_form1 = document.sche_detail_form;

	lo_form1.seq.value = "";
	lo_form1.frdt.value = "";
	lo_form1.todt.value = "";
	lo_form1.remk.value = "";
	lo_form1.schemangitemcd.value = "";
	lo_form1.schemangunitcd.value = "";	
		
	lo_form1.accflag.value = 'I';	// �۾������� �ű��Է�('I')���� ����
}

//���� ����
function save(){
	var lo_form1 = document.sche_detail_form;

	if(lo_form1.schemangitemcd.value==''){
        alert("�����׸��� �������ּ���.");
        lo_form1.schemangitemcd.focus();
        return;		
	}
	if(lo_form1.schemangunitcd.value==''){
        alert("���������� �������ּ���.");
        lo_form1.schemangitemcd.focus();
        return;		
	}
	else if(lo_form1.frdt.value==''){
        alert("�������ڸ� �Է����ּ���.");
        lo_form1.frdt.focus();
        return;		
	}
	else if(lo_form1.todt.value==''){
        alert("�������ڸ� �Է����ּ���.");
        lo_form1.todt.focus();
        return;		
	}

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
		
	
	if(lo_form1.accflag.value == 'I'){				// ���� ���
	    lo_form1.action = "/ss/share/1030";
	}else if(lo_form1.accflag.value == 'U'){		// ���� ����
	    lo_form1.action = "/ss/share/1040";
	}
	
    lo_form1.target = "ifrm";
    lo_form1.submit();    
}

// ������ �̵�
function page_move(pageno) {
    var lo_form1 = document.sche_search_form;

    // ȭ�� ��������ȣ�� �����Ѵ�.
    if(!pageno) {
        lo_form1.pageno.value = '1';
    } else {
        lo_form1.pageno.value = pageno;
    }

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ

    // ���� ��� ��ȸ������ "/ss/share/1010" �������� ������
    lo_form1.action = "/ss/share/1010";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���� �󼼺���
function detail_view(seq) {
	var lo_form1 = document.sche_list_form;

    // ���������� "/ss/share/1020" �������� ������
    lo_form1.seq.value = seq;
    lo_form1.action = "/ss/share/1020";
    lo_form1.target = "ifrm";
    lo_form1.submit();
}

// ���� ����
function del(){
    var lo_form1 = document.sche_detail_form;

    if(lo_form1.seq.value == '') {	
        alert("�ش����� Ŭ�� �� �����ϼ���.");
        return;
    }

	var yesno = confirm("�����Ͻðڽ��ϱ�?");
	if(yesno){
	    lo_form1.accflag.value = 'D';	// �۾������� ����('D')�� ����
	    lo_form1.target = "ifrm";
	    lo_form1.action = "/ss/share/1050";
	    lo_form1.submit();
	}	    
}

// ���� �Է� ���
function cancel(){
    // ������ ���� ���� reset ���ش�.
    var lo_form1 = document.sche_detail_form;	// ������ ��
	lo_form1.reset();                                               // �� �缳��

	setEventHandler();												// �� �缳�� �� �̺�Ʈ�ڵ鷯 ȣ��
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
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >��������
      &gt; </b> ����</td>
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

<!--���� �˻� ����-->
<table width="830" border="0" cellspacing="0" cellpadding="2">
<form name="sche_search_form" method="post" action="" >
	<input name="pageno" type="hidden" value ="1">
	<input name="pagesize" type="hidden" value ="<%= moveListCount%>">
    <input name="js_fn_nm" type="hidden" value ="page_move">
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� --> 
	     
	<tr>
		<td bgcolor="#EBE9DC" class="title" width="50""><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">����</td>
		<td bgcolor="#EBE9DC" class="title" width="100"">
			<select name="schemangunitcd" class="sel_all">
				<option value="">��ü</option>
				<%=ds.curcommlist2OptHtml("")%>
			</select>
		</td>
		<td bgcolor="#EBE9DC" class="title" width="70""><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��������</td>
		<td bgcolor="#EBE9DC" class="title" width="160">
			<input name="frdt" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="��������" dataType="date">
			-
			<input name="todt" type="text" value="<%= Util.convertS(Util.addDate(Util.getDate(), 15))%>" maxlength="10" size="10" class="text_box" caption="��������" dataType="date">
		</td>
		<td bgcolor="#EBE9DC" class="title" align="right">
			<input type="image" id="search_id" border="0" src="/html/comm_img/bu_search03.gif" width="36" height="19" align="absmiddle" class="sel_all" onclick="javascript:list_search();window.event.returnValue=false;">
		</td>
	</tr>
	<tr>
		<td height="3" colspan="7">
			<!--����-->
		</td>
	</tr>
</form>        
</table>
<!--���� �˻� ��-->

<!--���� ��� ����-->
<table border="0" cellspacing="0" cellpadding="0" >
<tr><td>

<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="sche_list_id">
<form name="sche_list_form" method="post" action="">
	<input type="hidden" name="seq">
	    
	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="80">����</td>
		<td class="gray" width="80">�μ�</td>
		<td class="gray" width="80">�����</td>
		<td class="gray" width="100">������</td>
		<td class="gray" width="90">��������</td>
		<td class="gray" width="90">��������</td>
		<td class="gray">����</td>
	</tr>
	
	<%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
	<%for(int i=0; i<moveListCount; i++){%>		  
	<tr>
		<td class="gray" width="80">&nbsp;</td>
		<td class="gray" width="80">&nbsp;</td>
		<td class="gray" width="80">&nbsp;</td>
		<td class="gray" width="100">&nbsp;</td>
		<td class="gray" width="90" align="center">&nbsp;</td>
		<td class="gray" width="90" align="center">&nbsp;</td>
		<td class="gray">&nbsp;</td>
	</tr>
	<%}%>
	<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>        
	<tr bgcolor="#dddddd" align="right">
		<td colspan="7" height="23" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� �� </b>
		</td>
	</tr>
</form>
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
                <jsp:param name = "pagesize" 	value="<%= moveListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->

</td></tr>
</table>
<!--���� ��� ��-->

    </td>
  </tr>
  <tr>
    <td height="10">
      <!--���� -->
    </td>
  </tr>
  <td>
  
  
<!--�󼼳��� -->
<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr>
    <td  height="25" bgcolor="#EBE9DC" class="title">���� �󼼳���</td>
  </tr>
  <tr>
    <td height="3">
      <!--����-->
    </td>
  </tr>
</table>

<!--���� �� ���� -->	    
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="sche_detail_id">
<form name="sche_detail_form" method="post" action="">
	<input type="hidden" name="seq" value="">
	<input type="hidden" name="accflag" value="I"> 		<!--�۾�����(I:���, U:����, D:����)-->     

	<tr>
		<td width="100" height="24" bgcolor="#dddddd" class="gray">�μ� <font color="red">*</font></td>
		<td  class="gray" width="315">&nbsp;<%= deptnm%></td>
		<td width="100" height="24" bgcolor="#dddddd" class="gray">����� <font color="red">*</font></td>
		<td  class="gray" width="315">&nbsp;<%= emp_nm%></td>
	</tr>      
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="100">�����׸� <font color="red">*</font><br></td>
		<td class="gray">
			<select name="schemangitemcd" class="sel_all">
				<option value="">����</option>
				<%=ds.curcommlist3OptHtml("")%>
			</select>
		</td>        
		<td bgcolor="#dddddd" class="gray" width="100"> �������� <font color="red">*</font></td>
		<td class="gray" width="315">
			<select name="schemangunitcd" class="sel_all">
				<option value="">����</option>
				<%=ds.curcommlist2OptHtml("")%>
			</select>
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="100">�������� <font color="red">*</font><br></td>
		<td class="gray" width="315">
			<input name="frdt" type="text" value="" maxlength="10" size="10" class="text_box" dataType=date> ��) 20040101
		</td>
		<td width="100" bgcolor="#dddddd" class="gray">�������� <font color="red">*</font></td>
		<td  class="gray" width="315">
			<input name="todt" type="text" value="" maxlength="10" size="10" class="text_box" dataType=date> ��) 20040201
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="100">���� </td>
		<td colspan="3" class="gray">
			<input name="remk" type="text" value="" style="ime-mode:active;" maxlength="100" size="100" class="text_box"> 
		</td>
	</tr>
</form>
</table>
<!--���� �� �� -->	    

<!--button -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
	<tr>
		<td align="center" height="2">
		<!--����-->
		</td>
	</tr>
	<tr>
		<td align="center" height="24" bgcolor="#E8E8E8"> 
			<input type="image" id="add_id" border="0" src="/html/comm_img/bu_new.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:add();window.event.returnValue=false;">
			<input type="image" id="save_id" border="0" src="/html/comm_img/bu_save.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:save();window.event.returnValue=false;">
			<input type="image" id="del_id" border="0" src="/html/comm_img/bu_del.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:del();window.event.returnValue=false;">
			<input type="image" id="cancel_id" border="0" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:cancel();window.event.returnValue=false;">
		</td>
	</tr>
</table>

</td>
</tr>
</table>
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width="0" height="0"></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
