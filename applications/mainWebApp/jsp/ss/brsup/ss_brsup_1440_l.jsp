<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1440_l.jsp
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
<%
    SS_L_INSRCOST_BUSNDataSet ds = (SS_L_INSRCOST_BUSNDataSet)request.getAttribute("ds");
    int listCount = 10;		// ȭ��� �׸��
%>
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
<form name="cost_list_form" method="post" action="" >
    <input name="basidtary" type="hidden" value ="">		<!--�������� ���� ���ڿ�-->
    <input name="deptcdary" type="hidden" value ="">		<!--�μ�(��)�ڵ� ���� ���ڿ�-->
    <input name="areacdary" type="hidden" value ="">		<!--�����ڵ� ���� ���ڿ�-->
    <input name="bocdary" type="hidden" value ="">			<!--���������ڵ� ���� ���ڿ�-->
    <input name="clamtary" type="hidden" value ="">			<!--���ݾ� ���� ���ڿ�-->
    <input name="rcpmpersnmary" type="hidden" value ="">	<!--�Ա��ڸ� ���� ���ڿ�-->

	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray">��&nbsp;</td>
		<td rowspan="2" width="70" class="gray">����</td>
		<td rowspan="2" width="70" class="gray">����</td>
		<td colspan="2" width="110" class="gray">����ܰ�</td>
		<td colspan="2" width="110" class="gray">�����ܰ�</td>
		<td rowspan="2" width="65" class="gray">û���ݾ�</td>
		<td rowspan="2" width="65" class="gray">�Աݾ�</td>
		<td rowspan="2" width="70" class="gray">�ܾ�</td>
		<td rowspan="2" width="70" class="gray">�Ա���</td>
		<td rowspan="2" width="70" class="gray">�ϳ����� </td>
	</tr>
	<tr bgcolor="#dddddd" align="center">
		<td width="50" class="gray">��û</td>
		<td width="60" class="gray">�ݾ�</td>
		<td width="50" class="gray">����</td>
		<td width="60" class="gray">�ݾ�</td>
	</tr>

<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_INSRCOST_BUSNCURCOMMLISTRecord curcommlistRec = (SS_L_INSRCOST_BUSNCURCOMMLISTRecord)ds.curcommlist.get(i); %>
    <!-- ���غ��� ��� �� ��ũ -->
    <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.basidt%>','<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">

		<td class="gray" align="left"><%= curcommlistRec.deptnm%>&nbsp;</td>
		<td width="70" class="gray" align="left"><%= curcommlistRec.areanm%> &nbsp;</td>
		<td width="70" class="gray" align="left"><%= curcommlistRec.bonm%>&nbsp;</td>
		<td width="50" class="gray" align="right"><%= curcommlistRec.aplcqunt%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.totamt)%>&nbsp;</td>
		<td width="50" class="gray" align="right"><%= curcommlistRec.hdqtsplyqunt%>&nbsp;</td>
		<td width="60" class="gray" align="right"><%= Util.comma(curcommlistRec.hdqtsplyamt)%>&nbsp;</td>
		<td width="65" class="gray" align="right"><%= Util.comma(curcommlistRec.clamamt)%>&nbsp;</td>
		<td width="65" class="gray" align="right" onclick="window.event.cancelBubble = true;">
			<input name="clamt" type="text" size="8" class="text_box" value="" style="text-align:right" comma>
		</td>
		<td width="70" class="gray" align="right"> <%= Util.comma(curcommlistRec.clamtbal)%>&nbsp;</td>
		<td width="70" class="gray" align="right" onclick="window.event.cancelBubble = true;">
			<input name="rcpmpersnm" type="text" size="8" class="text_box" value="" style="text-align:right">
		</td>
		<td width="70" class="gray" height="23" align="right"> <%= Util.convertS(curcommlistRec.busnchrgclamtdt)%>&nbsp;</td>
<!--�� �ο츶�� ��������,�μ�(��)�ڵ�,�����ڵ�,���������ڵ带 hidden���� ���δ�.-->
	    <input name="basidt" type="hidden" value ="<%= curcommlistRec.basidt%>">		<!--�������� -->
	    <input name="deptcd" type="hidden" value ="<%= curcommlistRec.deptcd%>">		<!--�μ�(��)�ڵ� -->
	    <input name="areacd" type="hidden" value ="<%= curcommlistRec.areacd%>">		<!--�����ڵ� -->
	    <input name="bocd" type="hidden" value ="<%= curcommlistRec.bocd%>">			<!--���������ڵ� -->
	</tr>
<%}%>

<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
	<tr align="center">
		<td class="gray">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
		<td width="50" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="50" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="65" class="gray">&nbsp;</td>
		<td width="65" class="gray"><input name="text" text="text" size="8" class="text_box" value="">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
		<td width="70" class="gray"><input name="text" type="text" size="8" class="text_box" value="">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
	</tr>
	<%}%>
<%}%>

	<tr bgcolor="#dddddd" height="23">
		<td colspan="12" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
		</td>
	</tr>
</form>
</table>

<!--���� �ʱ�ȭ�� ���� select-->
<table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
</table>

<script>
    parent.document.all.cost_list_id.outerHTML = cost_list_id.outerHTML;

    // ���� �ʱ�ȭ
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;

    // ȭ�� �ʱ�ȭ
	parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>

