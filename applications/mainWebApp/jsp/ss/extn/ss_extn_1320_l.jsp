<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1320_l.jsp
* ��� : Ȯ����Ȳ-���Ȯ��-�������-�󼼸��
* �ۼ����� : 2003-12-15
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_EXTN_EMPALONDDataSet ds = (SS_L_RDR_EXTN_EMPALONDDataSet)request.getAttribute("ds");
%>
<table border="0" cellspacing="0" cellpadding="0" id="alon_detail_id">
	<tr><td>
		<table width="830" border="0"  cellpadding="1" cellspacing="0">
			<tr>
				<td  height="27" bgcolor="#EBE9DC" class="title"> ���Ȯ���ȸ ����� </td>
			</tr>
			<tr>
				<td height="3" colspan="2">
				<!--����-->
				</td>
			</tr>
		</table>

		<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray">
			<tr bgcolor="#dddddd" align="center" height="25">
				<td width="230" class="gray" align="center"> ��ü </td>
				<td width="150" class="gray" align="center"> Ȯ��μ� </td>
				<td width="150" class="gray" align="center"> �����μ� </td>
				<td width="150" class="gray" align="center"> ���رݾ� </td>
				<td width="150" class="gray" align="center"> ����ݾ� </td>
			</tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_EMPALONDCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EMPALONDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
			<tr align="center">
				<td width="230" class="gray" align="left"> <%= curcommlistRec.medicdnm%>&nbsp;</td>
				<td width="150" class="gray" align="right"> <%= Util.comma(curcommlistRec.rdr_extnqty)%>&nbsp;</td>
				<td width="150" class="gray" align="right"> <%= Util.comma(curcommlistRec.calcqty)%>&nbsp;</td>
				<td width="150" class="gray" align="right"> <%= Util.comma(curcommlistRec.basialonamt)%>&nbsp;</td>
				<td width="150" class="gray" align="right"> <%= Util.comma(curcommlistRec.alonamt)%>&nbsp;</td>
			</tr>
<%}%>

		</table>
	</td></tr>
</table>

<script>
    parent.document.all.alon_detail_id.outerHTML = alon_detail_id.outerHTML;

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>