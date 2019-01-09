<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_2020_s.jsp
* ��� : �������� �����ٹ����� �󼼺���
* �ۼ����� : 2003-12-29
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
    SS_S_DAWNRPTDataSet ds = (SS_S_DAWNRPTDataSet)request.getAttribute("ds");  // request dataset
    
    String curr_page_no = (String)request.getAttribute("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}
    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = "10";}

    String deptcd = Util.getSessionParameterValue(request, "selldeptcd", false);		//�Ҽ� �Ǹźμ��ڵ�
	String deptnm = Util.getSessionParameterValue(request, "selldeptnm", false);    	//�Ҽ� �Ǹźμ���
	String makepersid = Util.getSessionParameterValue(request,"uid", false);			//����� ID
	String makepersnm = Util.getSessionParameterValue(request,"emp_nm", false);			//����ڸ�

    String srchdeptcd = Util.checkString((String)request.getAttribute("srchdeptcd"));
    String makedt1 = Util.checkString((String)request.getAttribute("makedt1"));
    String makedt2 = Util.checkString((String)request.getAttribute("makedt2"));
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    
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
	document.dawnrpt_update_form.dutybgntm.focus();
}


// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// �����ٹ����� ���
function dawnrpt_list(){
    var lo_form1 = document.dawnrpt_view_form;

    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    lo_form1.action = "/ss/share/2001";
    lo_form1.target = "_self";
    lo_form1.submit();
        
}

// �����ٹ����� ����
function dawnrpt_update(){
	ans= confirm("���� �Ͻðڽ��ϱ�?");
	if(ans == true)
	{
	    var lo_form1 = document.dawnrpt_update_form;

		if(lo_form1.dutybgntm.value=='')
		{
	        alert("�ٹ����۽ð��� �Է����ּ���.");
	        lo_form1.dutybgntm.focus();
	        return;		
		}
		else if(lo_form1.dutyendtm.value=='')
		{
	        alert("�ٹ�����ð��� �Է����ּ���.");
	        lo_form1.dutyendtm.focus();
	        return;		
		}			    
		else if(lo_form1.dutybonm.value=='')
		{
	        alert("�ٹ� ������ �Է����ּ���.");
	        lo_form1.dutybonm.focus();
	        return;		
		}		
		else if(lo_form1.mainchk.value=='')
		{
	        alert("�߰����˻����� �Է����ּ���.");
	        lo_form1.mainchk.focus();
	        return;		
		}
		else if(lo_form1.dutycont.value=='')
		{
	        alert("�ٹ����� �� ����� �Է����ּ���.");
	        lo_form1.dutycont.focus();
	        return;		
		}				    
	    
	    // �׼��� "/ss/share/2030" �������� ������
	    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	    lo_form1.target = "_self";
	    lo_form1.action = "/ss/share/2030";
	    lo_form1.submit();
	}
}

// �����ٹ����� ����
function dawnrpt_delete(){
	ans= confirm("������ �����Ͻðڽ��ϱ�?");
	if(ans == true)
	{
	    var lo_form1 = document.dawnrpt_view_form;
	
	    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
	    lo_form1.action = "/ss/share/2040";
	    lo_form1.target = "_self";
	    lo_form1.submit();
	}
}

//�����ٹ����� �ٿ�ε�
function dawnrpt_dwload() {
    var lo_form1 = document.dawnrpt_view_form;	

    // ���������� "/ss/share/2050" �������� ������
    if(!check_all(lo_form1)) return;								// �� ��ȿ�� üũ
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/share/2050";
    lo_form1.submit();
}

-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1" onload="jsInit()">

<!--DAWNRPT_VIEW_FORM START--------------------------------------------------------------------------------->
<form name="dawnrpt_view_form" method="post" action="">
	<input type="hidden" name="curr_page_no" value="<%=curr_page_no%>">
	<input type="hidden" name="records_per_page" value="<%=records_per_page%>">
	<input type="hidden" name="srchdeptcd" value="<%=srchdeptcd%>">
	<input type="hidden" name="makedt1" value="<%=makedt1%>">
	<input type="hidden" name="makedt2" value="<%=makedt2%>">
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
	<input type="hidden" name="dwloadcnt" value="<%=ds.dwloadcnt%>">  <!--�ٿ�ε��-->	
</form>

<form name="dawnrpt_update_form" method="post" action="" enctype="multipart/form-data">
	<input type="hidden" name="makedt" value ="<%= ds.getMakedt()%>">
	<input type="hidden" name="makepersid" value ="<%= ds.getMakepersid()%>">

	<input type="hidden" name="curr_page_no" value="<%=curr_page_no%>">
	<input type="hidden" name="srchdeptcd" value="<%=srchdeptcd%>">
	<input type="hidden" name="records_per_page" value="<%=records_per_page%>">
	<input type="hidden" name="makedt1" value="<%=makedt1%>">
	<input type="hidden" name="makedt2" value="<%=makedt2%>">
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
	<input type="hidden" name="brwscnt" value="<%= ds.getBrwscnt()%>">
	
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >�������� 
      &gt; </b> �����׺��� &gt; �����ٹ�����</td>
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
    <td  height="25" bgcolor="#EBE9DC" class="title">�����ٹ����� �󼼳���</td>
  </tr>
  <tr> 
    <td height="3"> 
      <!--����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellpadding="2" cellspacing="0" align="center" class="gray" bgcolor="#FFFFFF">
  <tr> 
    <td   bgcolor="#dddddd" class="gray" width="130">�ۼ��� </td>
    <td class="gray" width="280" >&nbsp;<%= Util.checkString(ds.getMakepersnm())%></td>
    <td width="130"  bgcolor="#dddddd" class="gray">��ȸ�� </td>
    <td class="gray" width="290" >&nbsp;<%= ds.getBrwscnt()%></td>
  </tr>
  <tr> 
    <td   bgcolor="#dddddd" class="gray" width="130">�Ҽ� </td>
    <td class="gray" width="280" >&nbsp;<%= Util.checkString(ds.getDeptnm())%></td>
    <td width="130"  bgcolor="#dddddd" class="gray">�ٿ�ε�� </td>
    <td class="gray" width="290" >&nbsp;<%= ds.getDwloadcnt()%></td>
  </tr>   
  <tr> 
    <td bgcolor="#dddddd" class="gray" width="130">�ٹ����� <font color="red">*</font></td>
    <td height="20" class="gray">&nbsp;<%= Util.convertS(ds.getMakedt())%></td>
    <td bgcolor="#dddddd" class="gray" width="130"> �ٹ��ð� <font color="red">*</font></td>
    <td class="gray" width="310"> 
      <input name="dutybgntm" type="text" size="6" value="<%=ds.getDutybgntm()%>" class="text_box"  dataType="24hr">
      - 
      <input name="dutyendtm" type="text" size="6" value="<%=ds.getDutyendtm()%>" class="text_box"  dataType="24hr">
      ��) 0200-0600</td>    
  </tr>
  <tr> 
    <td  bgcolor="#dddddd" class="gray" width="130"> 
      <p>�ٹ� ���� <font color="red">*</font></p>
    </td>
    <td  colspan="3" class="gray">
	  <textarea name="dutybonm" style="ime-mode:active;" cols="90" rows="8" class="scroll1"><%= Util.checkString(ds.getDutybonm())%></textarea>
    </td>
  </tr>
  <tr> 
    <td   bgcolor="#dddddd" class="gray" width="130"> 
      <p>�߰����˻��� <font color="red">*</font></p>
    </td>
    <td  colspan="3" class="gray">    
      <textarea name="mainchk" style="ime-mode:active;" cols="90" rows="8" class="scroll1"><%= Util.checkString(ds.getMainchk())%></textarea>
    </td>
  </tr>
  <tr>
  <tr> 
    <td   bgcolor="#dddddd" class="gray" width="130"> 
      <p>�ٹ����� �� ��� <font color="red">*</font></p>
    </td>
    <td  colspan="3" class="gray">    
      <textarea name="dutycont" style="ime-mode:active;"cols="90" rows="8" class="scroll1"><%= Util.checkString(ds.getDutycont())%></textarea>
    </td>
  </tr>
  <tr>   
    <td   bgcolor="#dddddd" class="gray" width="130">��Ÿ����</td>
    <td  colspan="3" class="gray"> 
      <textarea name="etc" style="ime-mode:active;" cols="90" rows="8" class="scroll1"><%= Util.checkString(ds.getEtc())%></textarea>
    </td>
  </tr>
  <tr> 
    <td class="gray" bgcolor="#dddddd" width="130">÷�����ϸ�</td>
    <td height="0" colspan="3" class="gray">&nbsp;
    	<a onClick="dawnrpt_dwload();" style="cursor:hand;">
    	<font color="blue">&nbsp;<%= Util.checkString(ds.filenm)%> </font>
    	</a>    
    </td>    
  </tr>
  <tr>
    <td bgcolor="#dddddd" width="130" class="gray">÷��ȭ��</td>
    <td  class="gray" colspan="3">
      <input name="filenm" type="file" size="90" class="text_box">    
  </tr>  
</form>
</table>
<!--��ư -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center">
  <tr> 
    <td align="center" height="2" colspan="2"> 
      <!--����-->
    </td>
  </tr>
  <tr> 
    <td align="center" height="24" bgcolor="#E8E8E8"> 
      <input type="image" id="update_id" border="0" src="/html/comm_img/bu_edit.gif" width="36" height="19" align="absmiddle" onclick="javascript:dawnrpt_update();window.event.returnValue=false;"> 
      <input type="image" id="del_id" border="0" src="/html/comm_img/bu_del.gif" width="39" height="19" align="absmiddle" onclick="javascript:dawnrpt_delete();window.event.returnValue=false;"> 
    </td>
    <td align="right" height="24" bgcolor="#E8E8E8" width="100">
      <input type="image" id="list_id" border="0" src="/html/comm_img/bu_list.gif" width="65" height="19" align="absmiddle" border="0" onclick="javascript:dawnrpt_list();window.event.returnValue=false;">
    </td>
  </tr>
</table>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=0 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
