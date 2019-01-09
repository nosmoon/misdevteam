<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1510_i.jsp
* ��� : �������� �Խ��� �̽� ���
* �ۼ����� : 2003-12-03
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_INFOEXG_SAVE_INITDataSet ds = (SS_L_INFOEXG_SAVE_INITDataSet)request.getAttribute("ds");    // request dataset    

    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //���źμ�����
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    
    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "10";}    
   
    applySession = true;	// ���� ���� ����
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // ȸ���ڵ�
	String makepersid = Util.getSessionParameterValue(request, "uid", false); // ���̵�
	String makepersnm = Util.getSessionParameterValue(request, "emp_nm", false); // ����ڸ�
	String deptcd = Util.getSessionParameterValue(request, "selldeptcd", false); // �ҼӺμ��ڵ�    
	String deptnm = Util.getSessionParameterValue(request, "selldeptnm", false); // �ҼӺμ���    
    
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
	document.infoexg_insert_form.titl.focus();
}

// form ������ ��ȿ���� ������ ����
function check_all(form){
	if(!validate(form)) return false;
	else{
		makeValue(form);
		form.submit();
	}
}

// �Խ��� �̽� ����Ʈ
function infoexg_list(){
    var lo_form1 = document.infoexg_view_form;

    lo_form1.action = "/ss/share/1501";
    lo_form1.submit();
        
}

// �Խ��� �̽� ���
function annc_insert(){
    var lo_form1 = document.infoexg_insert_form;
    
	if(lo_form1.titl.value=='')
	{
        alert("������ �Է����ּ���.");
        lo_form1.titl.focus();
        return;		
	}
	else if(lo_form1.cont.value=='')
	{
        alert("������ �Է����ּ���.");
        lo_form1.cont.focus();
        return;		
	}		    
    

    // �׼��� "/ss/share/1515" �������� ������
    lo_form1.action = "/ss/share/1515";
    check_all(lo_form1);
    lo_form1.submit();
        
}

// �Խ��� �̽� �Է� ���
function annc_cancel(){
    // �̽� ��� ���� ���� reset ���ش�.
    var lo_form1 = document.infoexg_insert_form;

	lo_form1.email.value = '';
	lo_form1.hmpg.value = '';
	lo_form1.titl.value = '';
	lo_form1.cont.value = '';

}

//-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">

<!--INFOEXG_VIEW_FORM START--------------------------------------------------------------------------------->
<form name="infoexg_view_form" method="post" action="">
	<input type="hidden" name="pageno" value="<%=pageno%>">
	<input type="hidden" name="pagesize" value="<%=pagesize%>">
	<input type="hidden" name="rmsgdept" value="<%=rmsgdept%>">
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">		
</form>

<form name="infoexg_insert_form" method="post" action="" enctype="multipart/form-data">
	<input type="hidden" name="deptcd" value ="<%=deptcd%>">
	<input type="hidden" name="deptnm" value ="<%=deptnm%>">
	<input type="hidden" name="makepersid" value ="<%=makepersid%>">
	<input type="hidden" name="makepersnm" value ="<%=makepersnm%>">
	
	<input type="hidden" name="clsf" value ="3">
    <input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->	


<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >�������� 
      &gt; </b>�Խ��� &gt; �̽�</td>
  </tr>
  <tr> 
    <td height="10"> 
      <!--������ ���� ����-->
    </td>
  </tr>
</table>

<!--���Ź��� ����-->
<table width="830" border="0" cellspacing="0" cellpadding="2" align="center">
  <tr> 
    <td bgcolor="#EBE9DC" width="50" class="title"><img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�μ�</td>
    <td bgcolor="#EBE9DC" class="title"> 
      <select name="rmsgdept" class="sel_all">
<%						 
	  writeDeptOpt(session, out, ds.buseolistOptHtml(""), true);
%>		
      </select>
    </td>  
  </tr>
  <tr> 
    <td height="3" colspan="2"> 
      <!--����-->
    </td>
  </tr>
</table>

<!--Ÿ��Ʋ -->
<table width="829" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr> 
    <td  height="25" bgcolor="#EBE9DC" class="title">�̽� ���</td>
  </tr>
  <tr> 
    <td height="3"> 
      <!--����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" align="center" bgcolor="#FFFFFF" class="gray" cellpadding="2">
  <tr> 
    <td bgcolor="#dddddd" width="100" class="gray">�����</td>
    <td width="315" class="gray"><%=makepersnm%></td>
    <td bgcolor="#dddddd" width="100" class="gray">�̸���</td>
    <td width="315" class="gray"><input name="email" type="text" size="30" class="text_box"></td>    
  </tr>
  <tr> 
    <td bgcolor="#dddddd" width="100" class="gray">�μ�</td>
    <td width="315" class="gray"><%=deptnm%></td>
    <td bgcolor="#dddddd" width="100" class="gray">Ȩ������</td>
    <td width="315" class="gray"><input name="hmpg" type="text" size="30" class="text_box"></td>
  </tr>
  <tr> 
    <td bgcolor="#dddddd" width="100" class="gray">���� <font color="red">*</font></td>
    <td class="gray" colspan="3"> 
      <input name="titl" type="text" style="ime-mode:active;" size="90" class="text_box">
    </td>
  </tr>
  <tr> 
    <td bgcolor="#dddddd" width="100" class="gray">���� <font color="red">*</font></td>
    <td class="gray" colspan="3">
    	<textarea name="cont" cols="100" style="ime-mode:active;" rows="16" class="scroll1"></textarea>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" width="100" class="gray">÷��ȭ��</td>
    <td  class="gray" colspan="3">
      <input name="filenm" type="file" size="90" class="text_box">    
  </tr>
</form>
</table>
<!--��ư -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr> 
    <td align="center" height="2"> 
      <!--����-->
    </td>
  </tr>
  <tr> 
    <td align="center" height="24 "bgcolor="#E8E8E8"> 
      <input type="image" id="insert_id" border="0" src="/html/comm_img/bu_write.gif" width="36" height="19" align="absmiddle" border="0" onclick="javascript:annc_insert()"> 
      <input type="image" id="cancel_id" border="0" src="/html/comm_img/bu_cancel.gif" width="39" height="19" align="absmiddle" border="0" onclick="javascript:annc_cancel()"> 
    </td>
    <td align="right" height="24" bgcolor="#E8E8E8" width="100">
	<input type="image" id="list_id" border="0" src="/html/comm_img/bu_list.gif" width="65" height="19" align="absmiddle" border="0" onclick="javascript:infoexg_list()">
	</td>
  </tr>  
  
</table>
<br>
<br>
</body>
</html>
