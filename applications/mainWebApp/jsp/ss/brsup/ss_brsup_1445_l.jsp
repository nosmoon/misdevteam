<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1445_l.jsp
* ��� : ��������-���غ���-���(�������)-�󼼸��
* �ۼ����� : 2004-02-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_INSRCOSTCLMTDataSet ds = (SS_L_INSRCOSTCLMTDataSet)request.getAttribute("ds");
%>
<table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
	<tr><td>
		<table width="830" border="0"  cellpadding="1" cellspacing="0">
			<tr>
				<td  height="27" bgcolor="#EBE9DC" class="title"> ���غ��� ���� </td>
			</tr>
			<tr>
				<td height="3" colspan="2">
				<!--����-->
				</td>
			</tr>
		</table>

		<table width="830" border="0" cellspacing="0" cellpadding="0" class="gray">
			<tr bgcolor="#dddddd" align="center" height="23">
				<td width="230" class="gray"> �Ա��� </td>
				<td width="200" class="gray"> �Աݾ� </td>
				<td width="200" class="gray"> �ܾ� </td>
				<td width="200" class="gray"> �Ա����� </td>
			</tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_INSRCOSTCLMTCURCOMMLISTRecord curcommlistRec = (SS_L_INSRCOSTCLMTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
			<tr align="center">
				<td width="230" class="gray" align="left"> &nbsp;<%= curcommlistRec.rcpmpersnm%></td>
				<td width="200" class="gray" align="right"> <%= Util.comma(curcommlistRec.clamt)%>&nbsp;</td>
				<td width="200" class="gray" align="right"> <%= Util.comma(curcommlistRec.clamtbal)%>&nbsp;</td>
				<td width="200" class="gray" align="center"> <%= Util.convertS(curcommlistRec.clamtdt)%>&nbsp;</td>
			</tr>
<%}%>

	        <tr bgcolor="#dddddd">
	            <td colspan="8" height="23" class="gray" align="right">
					<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> û���ݾ� <%= Util.comma(ds.getClamamt())%> �� </b>&nbsp;&nbsp;
					<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> ���ݴ����ݾ� <%= Util.comma(ds.getClamtacmlamt())%> �� </b>&nbsp;&nbsp;
					<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �����ܾ� <%= Util.comma(ds.getClamtbal())%> �� </b>&nbsp;&nbsp;
					<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
	            </td>
	        </tr>

		</table>
	</td></tr>
</table>

<script>
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%> 
</script>
