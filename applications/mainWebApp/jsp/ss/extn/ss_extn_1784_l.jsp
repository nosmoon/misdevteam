<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1784_l.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-������(����)-�󼼸��
* �ۼ����� : 2004-04-09
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_EXTN_CYBCOSTDDataSet ds = (SS_L_RDR_EXTN_CYBCOSTDDataSet)request.getAttribute("ds");
%>
<table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
	<tr><td>
		<table width="830" border="0"  cellpadding="1" cellspacing="0">
			<tr>
				<td  height="27" bgcolor="#EBE9DC" class="title"> ���̹�Ȯ���ȸ ���� </td>
			</tr>
			<tr>
				<td height="3" colspan="2">
				<!--����-->
				</td>
			</tr>
		</table>

		<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray">
			<tr bgcolor="#dddddd" align="center">
				<td width="230" class="gray" align="center"> ��ü </td>
				<td width="150" class="gray" align="center"> �μ��μ� </td>
				<td width="150" class="gray" align="center"> �����μ� </td>
				<td width="150" class="gray" align="center"> ���رݾ� </td>
				<td width="150" class="gray" align="center"> ���ݾ� </td>
			</tr>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
			<tr align="center">
				<td width="230" class="gray" align="center"> <%= curcommlistRec.medicdnm%>&nbsp;</td>
				<td width="150" class="gray" align="right"> <%= curcommlistRec.acptqty%>&nbsp;</td>
				<td width="150" class="gray" align="right"> <%= curcommlistRec.calcqty%>&nbsp;</td>
				<td width="150" class="gray" align="right"> <%= Util.comma(curcommlistRec.basiamt)%>&nbsp;</td>
				<td width="150" class="gray" align="right"> <%= Util.comma(curcommlistRec.costamt)%>&nbsp;</td>
			</tr>
	<%}%>

		</table>
	</td></tr>
</table>

<script>
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;
    
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>
