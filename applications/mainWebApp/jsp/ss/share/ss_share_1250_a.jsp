<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1250_a.jsp
* ��� : �������� �ǽð��Ǹű�����-�ʱ�ȭ��
* �ۼ����� : 2003-12-18
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_NWBUSEOCDDataSet ds = (SS_L_NWBUSEOCDDataSet)request.getAttribute("ds");  // request dataset
    applySession = true;	// ���� ���� ����

    // �������κ��� ����������� ��´�.
	String deptnm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", false)); //�μ�(��)��
	String posinm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "posinm", false)); //��å��
	String emp_nm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", false)); //����

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
	document.anncsls_insert_form.anncbgntm_date.focus();
}

// form ������ ��ȿ���� ������ ����
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// �ǽð� �Ǹű� �������� ���
function annc_insert(){
    var lo_form1 = document.anncsls_insert_form;

	if(lo_form1.anncbgntm_date.value==''){
        alert("�Խý������ڸ� �Է��ϼ���.");
        lo_form1.anncbgntm_date.focus();
        return;
	}
	if(lo_form1.anncbgntm_time.value==''){
        alert("�Խý��۽ð��� �Է��ϼ���.");
        lo_form1.anncbgntm_time.focus();
        return;
	}

	if(lo_form1.anncendtm_date.value==''){
        alert("�Խ��������ڸ� �Է��ϼ���.");
        lo_form1.anncendtm_date.focus();
        return;
	}

	if(lo_form1.anncendtm_time.value==''){
        alert("�Խ�����ð��� �Է��ϼ���.");
        lo_form1.anncendtm_time.focus();
        return;
	}

	if(lo_form1.annctitl.value==''){
        alert("������ �Է��ϼ���.");
        lo_form1.annctitl.focus();
        return;
	}

/*
	if(lo_form1.annccont.value==''){
        alert("������ �Է��ϼ���.");
        lo_form1.annccont.focus();
        return;
	}
*/

    lo_form1.annccont.value = lo_form1.jw.AllHtml;
    lo_form1.annccont.value = lo_form1.annccont.value.replace(/"/g, "_#_");

    if(lo_form1.annccont.value=='')
	{
        alert("������ �Է����ּ���.");
        lo_form1.jw.focus();
        return;
	}


    if(!check_all(lo_form1)) return;					// �� ��ȣ�� üũ

    // ���� �� �ð��� �����Ѵ�.
    lo_form1.anncbgntm.value = lo_form1.anncbgntm_date.value + lo_form1.anncbgntm_time.value;
    lo_form1.anncendtm.value = lo_form1.anncendtm_date.value + lo_form1.anncendtm_time.value;
    // �μ�(��) ���ÿ� ���� ���źμ�(��)�ڵ�, ���źμ�(��)���� ���Ѵ�.
    // ���źμ�(��)�ڵ�
	lo_form1.rmsgdept.value = lo_form1.deptcd.value;
	// ���źμ�(��)��
	var li_sel_index = lo_form1.deptcd.selectedIndex;	// ���õ� �ε���
	if(li_sel_index == 0){									// ��ü ���ý�
		lo_form1.rmsgdeptnm.value = "";
	}else{													// �μ�(��) ���ý�
		lo_form1.rmsgdeptnm.value = lo_form1.deptcd.childNodes[li_sel_index+1].innerText;
	}

	// �μ�(��)�ڵ�,�����ڵ忡 ���� ���ű����ڵ带 �����Ѵ�.
	if(lo_form1.rmsgdept.value == ''){			// �μ�(��)�ڵ尡 �������� ���� ��� �Ǹű���ü(10)
		lo_form1.rmsgclsf.value = '10';
	}else if(lo_form1.rmsgdept.value != ''){	// �μ�(��)�ڵ尡 ������ ��� �Ǹű��μ�(��)(20)
		lo_form1.rmsgclsf.value = '20';
	}

    // �׼��� "/ss/share/1251" �������� ������
    lo_form1.action = "/ss/share/1251";
    lo_form1.submit();
}

// �ǽð� �Ǹű� �������� �Է� ���
function annc_cancel(){
    // �������� ��� ���� ���� reset ���ش�.
    var lo_form1 = document.anncsls_insert_form;

	lo_form1.anncbgntm.value = '';
	lo_form1.anncendtm.value = '';
	lo_form1.annctitl.value = '';
	lo_form1.annccont.value = '';

    lo_form1.jw.AllHtml = '';
}

//-->
</script>
<script language="JavaScript" For="jw" Event="OnjwDoccomplete()">
    document.all.jw.BodyHTML = document.getElementById("dis_content").innerHTML;
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">

<form name="anncsls_insert_form" method="post" action="">
	<input type="hidden" name="common_deptcd" value ="">
	<input type="hidden" name="rmsgclsf" value =""> 		<!--���ű����ڵ�(10:�Ǹű���ü,20:�Ǹű��μ�(��))-->
	<input type="hidden" name="rmsgdept" value ="">			<!-- ���źμ�(��)�ڵ� -->
	<input type="hidden" name="rmsgdeptnm" value ="">		<!-- ���źμ�(��)�� -->

	<input type="hidden" name="anncbgntm" value ="">		<!--���������Ͻ�-->
	<input type="hidden" name="anncendtm" value ="">		<!--���������Ͻ�-->
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >��������
      &gt; </b> �ǽð����� &gt; �Ǹű�����</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<!--Ÿ��Ʋ -->
<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr>
    <td  height="25" bgcolor="#EBE9DC" class="title">�ǽð� �Ǹű����� ���</td>
  </tr>
  <tr>
    <td height="3">
      <!--����-->
    </td>
  </tr>
</table>

<table width="830" border="0" cellspacing="0" align="center" bgcolor="#FFFFFF" class="gray" cellpadding="2" style="table-layout:fixed">
	<tr>
		<td bgcolor="#dddddd" width="100" class="gray">��&nbsp;</td>
		<td width="315" class="gray" >&nbsp;<%= deptnm%></td>
		<td bgcolor="#dddddd" width="100" class="gray">��å</td>
		<td width="*" class="gray">&nbsp;<%= posinm%></td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="100" class="gray">�����</td>
		<td width="*" class="gray"colspan="3">&nbsp;<%= emp_nm%></td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="100" class="gray">���������Ͻ� <font color="red">*</font></td>
		<td width="315" class="gray">
			<input name="anncbgntm_date" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="������������" dataType="date">
			&nbsp;
			<input name="anncbgntm_time" type="text" value="<%= Util.getTime()%>" maxlength="5" size="5" class="text_box" caption="�������۽ð�" dataType="24hr">

		</td>
		<td bgcolor="#dddddd" width="100" class="gray">���������Ͻ� <font color="red">*</font></td>
		<td width="*" class="gray">
			<input name="anncendtm_date" type="text" value="<%= Util.getDate2()%>" maxlength="10" size="10" class="text_box" caption="������������" dataType="date">
			&nbsp;
			<input name="anncendtm_time" type="text" value="<%= Util.getTime()%>" maxlength="5" size="5" class="text_box" caption="�������۽ð�" dataType="24hr">
		</td>
	</tr>
  <tr>
    <td bgcolor="#dddddd" width="100" class="gray">���� ��</td>
    <td width="*" class="gray" colspan="3">
	 <select name="deptcd" class="sel_all">	<!--�̺�Ʈ ����-->
<%
		writeDeptOpt(session, out, ds.curcommlistOptHtml(""), true);
%>
	 </select>
    </td>

  </tr>
  <tr>
    <td bgcolor="#dddddd" width="100" class="gray">���� <font color="red">*</font></td>
    <td width="*" class="gray" colspan="3">
      <input name="annctitl" type="text" size="90" class="text_box">
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" width="100" class="gray">���� <font color="red">*</font></td>
    <td width="*" height="360" class="gray" colspan="3">
      <%--<textarea name="annccont" cols="52" rows="12" class="scroll1"></textarea>--%>
       <textarea name="annccont" class="scroll1" cols="100" rows="16" style="display:none"></textarea>
       <table style="display:none"><tr><td id=dis_content></td></tr></table>
       <div id="editorLocation">
         <script id="webeditorid" src="/html/comm_js/webEditorControl.js"></script>
       </div>
    </td>
  </tr>
</table>
<!--��ư -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr>
    <td align="center" height="2">
      <!--����-->
    </td>
  </tr>
  <tr>
    <td align="center" height="24" bgcolor="#E8E8E8">
	<input type="image" id="insert_id" border="0" src="/html/comm_img/bu_write.gif" width="36" height="19" align="absmiddle" border="0" onclick="javascript:annc_insert();window.event.returnValue=false;">
	<input type="image" id="cancel_id" border="0" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:annc_cancel();window.event.returnValue=false;">
    </td>
  </tr>
</table>
<br>
<br>
</form>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=0 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
