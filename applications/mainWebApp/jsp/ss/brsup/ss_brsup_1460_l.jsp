<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1460_l.jsp
* ��� : ��������-���غ���-���(�������)-���
* �ۼ����� : 2004-02-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%--
1. ��������� ���ݿ��οʹ� ������ ��������� ������ ó���Ѵ�.(��������� ����ó������ ���� �׸� ���ؼ��� ��������� ����ó���� �����ϴ�.)
   ��������� ���ݿ��δ� ���� �����ֱ⸸ �Ѵ�.
--%>
<%
    SS_L_INSRCOST_SPLYDataSet ds = (SS_L_INSRCOST_SPLYDataSet)request.getAttribute("ds");
    int listCount = 10;		// ȭ��� �׸��
%>
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
<form name="cost_list_form" method="post" action="" >
    <input name="basidt" type="hidden" value ="">
    <input name="bocd" type="hidden" value ="">
    <input name="basidtary" type="hidden" value ="">
    <input name="bocdary" type="hidden" value ="">
    <input name="checkedary" type="hidden" value ="">

	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" width="70" class="gray">��&nbsp;</td>
		<td rowspan="2" width="70" class="gray">����</td>
		<td rowspan="2" class="gray">����</td>
		<td colspan="2" width="120" class="gray">����ܰ�</td>
		<td colspan="2" width="120" class="gray">�����ܰ�</td>
		<td rowspan="2" width="70" class="gray">û���ݾ�</td>
		<td rowspan="2" width="70" class="gray">������</td>
		<td rowspan="2" width="70" class="gray">�Ա�</td>
		<td rowspan="2" width="70" class="gray">�ϳ�����</td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td width="60" class="gray">��û</td>
		<td width="60" class="gray">�ݾ�</td>
		<td width="60" class="gray">����</td>
		<td width="60" class="gray">�ݾ�</td>
	</tr>
<%-- ���غ��� ��� ��� --%>
<%for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_INSRCOST_SPLYCURCOMMLISTRecord curcommlistRec = (SS_L_INSRCOST_SPLYCURCOMMLISTRecord)ds.curcommlist.get(i);%>
	<tr>
		<td width="70" class="gray" align="left"><%= curcommlistRec.deptnm%>&nbsp;</td>
		<td width="70" class="gray" align="left"><%= curcommlistRec.areanm%>&nbsp;</td>
		<td class="gray" align="left"><%= curcommlistRec.bonm%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.aplcqunt)%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.totamt)%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.hdqtsplyqunt)%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.hdqtsplyamt)%>&nbsp;</td>
		<td width="70" class="gray" align="right"><%= Util.comma(curcommlistRec.clamamt)%>&nbsp;</td>
		<td width="70" class="gray" align="center">
			<!-- ������� ���ݿ��� -->
			<!-- üũ�ڽ��� disabled ��Ų��. -->
			<input type="checkbox" name="busnchrgclamtend" <%= Util.convertYn(curcommlistRec.busnchrgclamtend, "checked", "")%> disabled >&nbsp;
		</td>
		<td width="70" class="gray" align="center">
			<!-- üũ�ڽ��� value = �������� 4�ڸ�, ���������ڵ� 5�ڸ� -->
			<input type="checkbox" name="splychrgclamtyn" onclick="window.event.cancelBubble=true;" value="<%= curcommlistRec.basidt%><%= curcommlistRec.bocd%>"
				<%= Util.convertYn(curcommlistRec.splychrgclamtyn, "checked", "")%> >&nbsp;
		</td>
		<td width="70" class="gray" align="center">
			<%= Util.convertS(curcommlistRec.splychrgclamtdt)%>&nbsp;
		</td>
  </tr>
<%}%>

<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
	<tr align="center">
		<td width="70" class="gray">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
		<td width="70" class="gray"><input type="checkbox" name="checkbox">&nbsp;</td>
		<td width="70" class="gray"><input type="checkbox" name="checkbox">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
	</tr>
	<%}%>
<%}%>
	<tr bgcolor="#dddddd" height="23">
		<td colspan="11" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѱݾ� <%= Util.comma(ds.getTotalsplychrgamt())%> �� </b>&nbsp;&nbsp;&nbsp;
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
		</td>
	</tr>

<script>
    parent.document.all.cost_list_id.outerHTML = cost_list_id.outerHTML;

    // ȭ�� �ʱ�ȭ
	parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>

