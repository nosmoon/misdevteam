<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1265_l.jsp
* ��� : ��������-�Ź�������ǰ-���(�������)-���
* �ۼ����� : 2004-02-08
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_NWSPITEMCOST_SPLYDataSet ds = (SS_L_NWSPITEMCOST_SPLYDataSet)request.getAttribute("ds");
    int listCount = 10;		// ȭ��� �׸��
%>
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
<form name="cost_list_form" method="post" action="" >
    <input name="basidt" type="hidden" value ="">
    <input name="bocd" type="hidden" value ="">
    <input name="basidtary" type="hidden" value ="">
    <input name="bocdary" type="hidden" value ="">
    <input name="checkedary" type="hidden" value ="">

	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="140" class="gray" align="center">��&nbsp;</td>
		<td width="140" class="gray" align="center">����</td>
		<td class="gray" align="center">����</td>
		<td width="150" class="gray" align="center">���ݾ�</td>
		<td width="80"  class="gray" align="center">�Ա�</td>
		<td width="150" class="gray" align="center">�Ա�����</td>
	</tr>
<%-- �Ź�������ǰ ��� ��� --%>
<%for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_NWSPITEMCOST_SPLYCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMCOST_SPLYCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <tr>
        <td width="140" class="gray" align="center"> <%= curcommlistRec.deptnm%>&nbsp;</td>
        <td width="140" class="gray" align="center"> <%= curcommlistRec.areanm%>&nbsp;</td>
        <td class="gray" align="center"><%= curcommlistRec.bonm%>&nbsp;</td>
        <td width="150" class="gray" align="right"> <%= Util.comma(curcommlistRec.splychrgamt)%>&nbsp;</td>
        <td width="80"  class="gray" align="center">
			<!-- üũ�ڽ��� value = �������� 6�ڸ�, ���������ڵ� 5�ڸ� -->
			<input type="checkbox" name="splychrgclamtyn" onclick="window.event.cancelBubble=true;" value="<%= curcommlistRec.basidt%><%= curcommlistRec.bocd%>"
				<%= Util.convertYn(curcommlistRec.splychrgclamtyn, "checked", "")%> >&nbsp;
		</td>
        <td width="150" class="gray" align="center">
				<%= Util.convertS(curcommlistRec.splychrgclamtdt)%>&nbsp;
		</td>
	</tr>
<%}%>

<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
	<tr align="center">
		<td width="140" class="gray" align="center">&nbsp;</td>
		<td width="140" class="gray" align="center">&nbsp;</td>
		<td class="gray" align="center">&nbsp;</td>
		<td width="150" class="gray" align="center">&nbsp;</td>
		<td width="80"  class="gray" align="center"><input type="checkbox" name="checkbox">&nbsp;</td>
		<td width="150" class="gray" align="center">&nbsp;</td>
	</tr>
	<%}%>
<%}%>

	<tr bgcolor="#dddddd" align="right" height="23">
		<td colspan="6" class="gray">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>&nbsp;&nbsp;&nbsp;
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѱݾ� <%= Util.comma(ds.getTotalsplychrgamt())%> ��</b>
		</td>
	</tr>
</form>
</table>


<script>
    parent.document.all.cost_list_id.outerHTML = cost_list_id.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
	parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>

