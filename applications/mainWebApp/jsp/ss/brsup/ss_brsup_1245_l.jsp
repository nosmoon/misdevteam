<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1245_l.jsp
* ��� : ��������-�Ź�������ǰ-���(�������)-���
* �ۼ����� : 2004-02-07
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_NWSPITEMCOST_BUSNDataSet ds = (SS_L_NWSPITEMCOST_BUSNDataSet)request.getAttribute("ds");
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

	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="100" class="gray">��&nbsp;</td>
		<td width="100" class="gray">����</td>
		<td class="gray">����</td>
		<td width="90" class="gray">��ǰ���</td>
		<td width="90" class="gray">�Աݾ�</td>
		<td width="90" class="gray">�ܾ�</td>
		<td width="100" class="gray">�Ա���</td>
		<td width="100" class="gray">�ϳ�����</td>
	</tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_NWSPITEMCOST_BUSNCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMCOST_BUSNCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- �Ź�������ǰ ��� �� ��ũ -->
    <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.basidt%>','<%= curcommlistRec.deptcd%>','<%= curcommlistRec.areacd%>','<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td width="100" class="gray" align="left"> <%= curcommlistRec.deptnm%>&nbsp;</td>
		<td width="100" class="gray" align="left"> <%= curcommlistRec.areanm%> &nbsp;</td>
		<td class="gray" align="left"> <%= curcommlistRec.bonm%>&nbsp; </td>
		<td width="90" class="gray" align="right"> <%= Util.comma(curcommlistRec.busnchrgamt)%>&nbsp;</td>
		<td width="90" class="gray" onclick="window.event.cancelBubble = true;">
			<input name="clamt" type="text" size="10" class="text_box" value="" style="text-align:right" comma>
		</td>
		<td width="90" class="gray" align="right"> <%= Util.comma(curcommlistRec.busnchrgclamtbal)%>&nbsp;</td>
		<td width="100" class="gray" onclick="window.event.cancelBubble = true;">
			<input name="rcpmpersnm" type="text" size="10" class="text_box" value="" style="text-align:right">
		</td>
		<td width="100" class="gray" align="center"> <%= Util.convertS(curcommlistRec.busnchrgclamtdt)%>&nbsp;</td>
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
		<td width="100" class="gray">&nbsp;</td>
		<td width="100" class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td width="90" class="gray">&nbsp;</td>
		<td width="90" class="gray"><input name="text" type="text" size="10" class="text_box" value=""></td>
		<td width="90" class="gray">&nbsp;</td>
		<td width="100" class="gray"><input name="text" type="text" size="10" class="text_box" value=""></td>
		<td width="100" class="gray">&nbsp;</td>
	</tr>
	<%}%>
<%}%>

	<tr bgcolor="#dddddd" height="23">
		<td colspan="8" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
		</td>
	</tr>
</form>
</table>

<!--���� �ʱ�ȭ�� ���� table-->
<table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
</table>


<script>
    parent.document.all.cost_list_id.outerHTML = cost_list_id.outerHTML;
	// ���� �ʱ�ȭ
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
	parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>
</script>

