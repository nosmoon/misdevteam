<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1675_l.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����(�����)-�󼼸��
* �ۼ����� : 2004-04-08
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%

    SS_L_RDR_EXTN_STAFCYB_RSLTDDataSet ds = (SS_L_RDR_EXTN_STAFCYB_RSLTDDataSet)request.getAttribute("ds");
%>

<!-- ��Ȯ�� ��� ���� -->
<table width="340" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="rslt_nocnfm_row_id">
	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="85"> �̸� </td>
		<td class="gray" width="85"> Ȯ������ </td>
		<td class="gray" width="85"> ���� </td>
		<td class="gray" width="85"> ������ȭ��ȣ </td>
	</tr>
</table>

<!-- ���� ��� ���� -->	
<table width="340" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="rslt_err_row_id">
	<tr bgcolor="#dddddd" align="center">
		<td class="gray" width="120"> �̸� </td>
		<td class="gray" width="100"> Ȯ������ </td>
		<td class="gray" width="120"> ����� </td>
	</tr>
</table>


<table id="rslt_nocnfm_id" width="340" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray" style="border-left-style:none; border-top-style:none;">
	<%
	for(int i=0; i<ds.nocnfmlist.size(); i++){
		SS_L_RDR_EXTN_STAFCYB_RSLTDNOCNFMLISTRecord nocnfmlistRec = (SS_L_RDR_EXTN_STAFCYB_RSLTDNOCNFMLISTRecord)ds.nocnfmlist.get(i);%>
	<tr align="center">
		<td  class="gray" width="85"><%= Util.convertS(nocnfmlistRec.aplcpersnm)%></td>
		<td  class="gray" width="85"><%= nocnfmlistRec.rdr_extndt%></td>
		<td  class="gray" width="85"><%= nocnfmlistRec.bonm%></td>
		<td  class="gray" width="85"><%= Util.getChainStr(nocnfmlistRec.tel_no11, nocnfmlistRec.tel_no12, nocnfmlistRec.tel_no13, "-")%></td>
	</tr>
	<%}%>

	<tr bgcolor="#dddddd" align="right">
		<td colspan="4" class="gray"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�ѰǼ�
		  : <b><%= ds.getNocnfmtotalcnt()%> ��</b></td>
	</tr>
</table>

<table id="rslt_err_id" width="340" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray" style="border-left-style:none; border-top-style:none;">
	<%
	for(int i=0; i<ds.errlist.size(); i++){
		SS_L_RDR_EXTN_STAFCYB_RSLTDERRLISTRecord errlistRec = (SS_L_RDR_EXTN_STAFCYB_RSLTDERRLISTRecord)ds.errlist.get(i);%>
	<tr align="center">
		<td  class="gray" width="65"><%= errlistRec.aplcpersnm%>&nbsp;</td>
		<td  class="gray" width="65"><%= Util.convertS(errlistRec.rdr_extndt)%>&nbsp;</td>
		<td  class="gray" width="60"><%= errlistRec.bonm%>&nbsp;</td>
		<td  class="gray" width="85"><%= Util.getChainStr(errlistRec.tel_no11, errlistRec.tel_no12, errlistRec.tel_no13, "-")%>&nbsp;</td>
		<td  class="gray" width="65"><%= errlistRec.subscnfmstatnm%>&nbsp;</td>
	</tr>
	<%}%>

	<tr bgcolor="#dddddd" align="right">
		<td colspan="5" class="gray"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�ѰǼ�
		  : <b><%= ds.getErrtotalcnt()%> ��</b></td>
	</tr>
</table>

<script>
<%if(ds.nocnfmlist.size() == 0 || ds.errlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}else{%>     
	// ��Ȯ��, ���� �� ���� ����	
    parent.document.all.rslt_nocnfm_row_id.outerHTML = rslt_nocnfm_row_id.outerHTML;
    parent.document.all.rslt_err_row_id.outerHTML = rslt_err_row_id.outerHTML;

	// ��Ȯ��, ���� �� ��� ����(iframe)
    parent.ifrm_1.document.all.rslt_nocnfm_id.outerHTML = document.all.rslt_nocnfm_id.outerHTML;
    parent.ifrm_2.document.all.rslt_err_id.outerHTML = document.all.rslt_err_id.outerHTML;
<%}%>
</script>