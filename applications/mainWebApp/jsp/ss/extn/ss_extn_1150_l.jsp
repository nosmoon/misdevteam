<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1150_l.jsp
* ��� : Ȯ����Ȳ-ǰ����Ȯ��-������(���)-�󼼸��
* �ۼ����� : 2003-12-02
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_EXTN_EXGCOSTDDataSet ds = (SS_L_RDR_EXTN_EXGCOSTDDataSet)request.getAttribute("ds");
%>
<table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
	<tr><td>
		<table width="830" border="0"  cellpadding="1" cellspacing="0">
			<tr>
				<td  height="27" bgcolor="#EBE9DC" class="title"> ǰ����Ȯ���ȸ ���� </td>
			</tr>
			<tr>
				<td height="3" colspan="2">
				<!--����-->
				</td>
			</tr>
		</table>

		<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray">
			<tr bgcolor="#dddddd">
				<td rowspan="2" class="gray" align="center"> ��ü </td>
				<td width="200" colspan="2" class="gray" align="center"> �ΰ�μ� </td>
				<td width="200" colspan="2" class="gray" align="center"> �μ��μ� </td>
				<td width="100" rowspan="2" class="gray" align="center"> �����μ� </td>
				<td width="100" rowspan="2" class="gray" align="center"> ���رݾ� </td>
				<td width="100" rowspan="2" class="gray" align="center"> ���ݾ� </td>
			</tr>
			<tr bgcolor="#dddddd" align="center">
				<td width="100" class="gray" align="center"> ���� </td>
				<td width="100" class="gray" align="center"> �̻��� </td>
				<td width="100" class="gray" align="center"> ���� </td>
				<td width="100" class="gray" align="center"> �̻��� </td>
			</tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_EXGCOSTDCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EXGCOSTDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
			<tr align="center">
				<td class="gray" align="left"><%= curcommlistRec.medicdnm%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.trsfqty)%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.uncalctrsfqty)%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.acptqty)%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.uncalcacptqty)%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.calcqty)%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.basiamt)%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.costamt)%>&nbsp;</td>
			</tr>
<%}%>

		</table>
	</td></tr>
</table>

<script>
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;
</script>
