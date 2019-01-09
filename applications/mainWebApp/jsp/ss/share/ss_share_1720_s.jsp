<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1720_s.jsp
* ��� : �������� �Խ��� ����� �󼼺���
* �ۼ����� : 2003-12-11
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
    SS_S_INFOEXGDataSet ds = (SS_S_INFOEXGDataSet)request.getAttribute("ds");  // request dataset

    applySession = true;	// ���� ���� ����

    String pageno = (String)request.getAttribute("pageno");
    if(pageno == null) {pageno = "1";}
    String pagesize = (String)request.getAttribute("pagesize");
    if(pagesize == null) {pagesize = "10";}

    String rmsgdept = Util.checkString((String)request.getAttribute("rmsgdept"));         //���źμ�
    String rmsgarea = Util.checkString((String)request.getAttribute("rmsgarea"));         //��������
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
	document.infoexg_update_form.titl.focus();
}

// form ������ ��ȿ���� ������ ����
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ����� �˻� ����Ʈ
function infoexg_list(){
    var lo_form1 = document.infoexg_view_form;

    lo_form1.action = "/ss/share/1701";
    lo_form1.target = "_self";
    lo_form1.submit();

}

// ����� ����
function annc_update(){
	ans= confirm("���� �Ͻðڽ��ϱ�?");
	if(ans == true)
	{
	    var lo_form1 = document.infoexg_update_form;

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

	    // �׼��� "/ss/share/1730" �������� ������
	    lo_form1.action = "/ss/share/1730";
	    lo_form1.target = "_self";
	    check_all(lo_form1);
	    lo_form1.submit();
	}
}

// ����� ����
function infoexg_delete(){
	ans= confirm("������ �����Ͻðڽ��ϱ�?");
	if(ans == true)
	{
	    var lo_form1 = document.infoexg_view_form;

	    lo_form1.action = "/ss/share/1740";
	    lo_form1.target = "_self";
	    lo_form1.submit();
	}
	else {}
}

// ����� �亯
function annc_answer(){
    var lo_form1 = document.infoexg_view_form;
    var o_form2 = document.infoexg_update_form;

	lo_form1.titl.value = o_form2.titl.value;
    // �׼��� "/ss/share/1760" �������� ������
    lo_form1.action = "/ss/share/1760";
    lo_form1.target = "_self";
    lo_form1.submit();

}

// �Խ��� ����� ��õ
function annc_recom(){
	ans= confirm("��õ �Ͻðڽ��ϱ�?");
	if(ans == true)
	{
	    var lo_form1 = document.infoexg_view_form;

	    // �׼��� "/ss/share/1750" �������� ������
	    lo_form1.target = "_self";
	    lo_form1.action = "/ss/share/1750";
	    lo_form1.submit();
	}
	else {}
}

//�Խ��� ����� �ٿ�ε�
function infoexg_dwload(seq,dwloadcnt) {
    var lo_form1 = document.infoexg_view_form;

    // ���������� "/ss/share/1770" �������� ������
    lo_form1.seq.value = seq;
    lo_form1.dwloadcnt.value = dwloadcnt;
    lo_form1.target = "ifrm";
    lo_form1.action = "/ss/share/1770";
    lo_form1.submit();
}

-->
</script>
</head>
<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" margin marginheight="0" class="scroll1"  onload="jsInit()">

<!--INFOEXG_VIEW_FORM START--------------------------------------------------------------------------------->
<form name="infoexg_view_form" method="post" action="">
	<input type="hidden" name="pageno" value="<%=pageno%>">
	<input type="hidden" name="pagesize" value="<%=pagesize%>">
	<input type="hidden" name="rmsgdept_param" value="<%=rmsgdept%>"> 	<!-- ���źμ� ���� param -->
	<input type="hidden" name="rmsgarea_param" value="<%=rmsgarea%>"> 	<!-- �������� ���� param -->
	<input type="hidden" name="rmsgdept" value="<%=rmsgdept%>">         <!-- ���źμ� ���� DS -->
	<input type="hidden" name="rmsgarea" value="<%=rmsgarea%>">         <!-- �������� ���� DS -->
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
	<input type="hidden" name="seq" value ="<%= ds.getSeq()%>">
	<input type="hidden" name="titl" value ="">
	<input type="hidden" name="answergrp" value="<%=ds.getAnswergrp()%>">
	<input type="hidden" name="answerseq" value="<%=ds.getAnswerseq()%>">
	<input type="hidden" name="answerlevl" value="<%=ds.getAnswerlevl()%>">
	<input type="hidden" name="clsf" value ="5">
	<input type="hidden" name="brwscnt" value="<%= ds.getBrwscnt()%>">
	<input type="hidden" name="recomcnt" value="<%= ds.getRecomcnt()%>"> <!--��õ��-->
	<input type="hidden" name="dwloadcnt" value="">  <!--�ٿ�ε��-->
</form>

<form name="infoexg_update_form" method="post" action="" enctype="multipart/form-data">
	<input type="hidden" name="pageno" value="<%=pageno%>">
	<input type="hidden" name="pagesize" value="<%=pagesize%>">
	<input type="hidden" name="rmsgdept_param" value="<%=rmsgdept%>">
	<input type="hidden" name="rmsgarea_param" value="<%=rmsgarea%>">
	<input type="hidden" name="search_word" value="<%=search_word%>">
	<input type="hidden" name="search_word_kind" value="<%=search_word_kind%>">
	<input type="hidden" name="clsf" value ="5">
	<input type="hidden" name="seq" value ="<%= ds.getSeq()%>">
	<input type="hidden" name="makepersid" value ="<%=ds.getMakepersid()%>">
	<input type="hidden" name="makepersnm" value ="<%=ds.getMakepersnm()%>">
	<input type="hidden" name="brwscnt" value="<%= ds.getBrwscnt()%>">
	<input name="applySession" type="hidden" value ="<%= applySession%>">   <!-- ���� ���� ���� -->

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td bgcolor="#797777" height="25" class="home"><b><img src="/html/comm_img/ic_map.gif" width="25" height="20" align="absmiddle" >��������
      &gt; </b>�Խ��� &gt; �����</td>
  </tr>
  <tr>
    <td height="10">
      <!--������ ���� ����-->
    </td>
  </tr>
</table>
<!--Ÿ��Ʋ -->
<table width="830" border="0"  cellpadding="1" cellspacing="0" align="center">
  <tr>
    <td  height="25" bgcolor="#EBE9DC" class="title">����� �Խ��� �󼼳���</td>
  </tr>
  <tr>
    <td height="3">
      <!--����-->
    </td>
  </tr>
</table>
<table width="830" border="0" cellspacing="0" align="center" bgcolor="#FFFFFF" class="gray" cellpadding="2">
  <tr>
	  <td width="120" bgcolor="#dddddd" class="gray">����� </td>
	  <td  class="gray" width="210">&nbsp;<%= Util.checkString(ds.getMakepersnm())%></td>
	  <td bgcolor="#dddddd" class="gray" width="100"> ���� </td>
	  <td  class="gray" width="210">&nbsp;<%= Util.checkString(ds.getDeptnm())%></td>
	  <td bgcolor="#dddddd" class="gray" width="100"> ������� </td>
	  <td  class="gray" width="180" colspan="3">&nbsp;<%= Util.convertS(ds.getRegdt())%></td>
  </tr>
  <tr>
	  <td width="120" bgcolor="#dddddd" class="gray">�̸��� </td>
	  <td  class="gray" width="210">
	  <input name="email" type="text" size="30" class="text_box" value="<%= Util.checkString(ds.getEmail())%>">
	  </td>
	  <td bgcolor="#dddddd" class="gray" width="100"> Ȩ������ </td>
	  <td  class="gray" width="210">
	  <input name="hmpg" type="text" size="30" class="text_box" value="<%= Util.checkString(ds.getHmpg())%>">
	  </td>
	  <td bgcolor="#dddddd" class="gray" width="100"> ��ȸ�� </td>
	  <td  class="gray" width="40" align="right">&nbsp;<%= Util.comma(ds.getBrwscnt())%>
	  </td>
	  <td bgcolor="#dddddd" class="gray" width="100"> ��õ�� </td>
	  <td  class="gray" width="40" align="right">&nbsp;<%= Util.comma(ds.getRecomcnt())%>
	  </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" width="130" class="gray">���� <font color="red">*</font></td>
    <td class="gray" width="730" colspan="7">
    <input name="titl" style="ime-mode:active;" type="text" size="90" class="text_box" value="<%= Util.checkString(ds.getTitl())%>">
    </td>
  </tr>
	<%
	String cont = ds.getCont1() + ds.getCont2() + ds.getCont3() + ds.getCont4() + ds.getCont5();
	//cont = Util.replace(cont, "\n", "<br>");
	%>

  <tr>
    <td bgcolor="#dddddd" width="130" class="gray">���� <font color="red">*</font></td>
    <td  class="gray" width="730" colspan="7">
    <textarea name="cont" style="ime-mode:active;" cols="98" rows="16" class="scroll1"><%=cont%></textarea>
    </td>
   </tr>
  <tr>
    <td bgcolor="#dddddd" width="130" class="gray">÷��ȭ�ϸ�</td>
    <td class="gray" colspan="7">&nbsp;
    	<a onClick="infoexg_dwload('<%=ds.getSeq()%>','<%=ds.dwloadcnt%>');" style="cursor:hand;">
    	<font color="blue">&nbsp;<%= Util.checkString(ds.filenm)%> </font>
    	</a>
    </td>
  </tr>
  <tr>
    <td bgcolor="#dddddd" width="130" class="gray">÷��ȭ��</td>
    <td  class="gray" colspan="7">
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
    <td align="center" height="24" bgcolor="#E8E8E8">&nbsp;
      <input type="image" id="answer_id" border="0" src="/html/comm_img/bu_re.gif" width="36" height="19" align="absmiddle" onclick="javascript:annc_answer();window.event.returnValue=false;">
      <!--
      <input type="image" id="update_id" border="0" src="/html/comm_img/bu_edit.gif" width="36" height="19" align="absmiddle" onclick="javascript:annc_update();window.event.returnValue=false;">
      <input type="image" id="del_id" border="0" src="/html/comm_img/bu_del.gif" width="39" height="19" align="absmiddle" onclick="javascript:infoexg_delete();window.event.returnValue=false;">
      <input type="image" id="recomm_id" border="0" src="/html/comm_img/bu_reco.gif" width="36" height="19" align="absmiddle" border="0" onclick="javascript:annc_recom();window.event.returnValue=false;">
      -->
    </td>
    <td align="right" height="24" bgcolor="#E8E8E8" width="100">
	<input type="image" id="list_id" border="0" src="/html/comm_img/bu_list.gif" width="65" height="19" align="absmiddle" border="0" onclick="javascript:infoexg_list();window.event.returnValue=false;">
	</td>
  </tr>
</table>
   </td>
  </tr>
</table>
<br>
<br>
<!--HTML IFRAME START------------------------------------------------------------------------------->
<iframe name="ifrm" width=0 height=0></iframe>
<!--HTML IFRAME END--------------------------------------------------------------------------------->
</body>
</html>
