<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1310_l.jsp
* ��� : Ȯ����Ȳ-���Ȯ��-�������-���
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
	SS_L_RDR_EXTN_EMPALONDataSet ds = (SS_L_RDR_EXTN_EMPALONDataSet)request.getAttribute("ds");
    int listCount = 10;		// ȭ��� �׸��
%>
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="alon_list_id">
    <form name="alon_list_form" method="post" action="" >
        <input name="rdr_extncampno" type="hidden" value ="">
        <input name="empseq" type="hidden" value ="">
        <input name="rdr_extncampnoary" type="hidden" value ="">
        <input name="empseqary" type="hidden" value ="">
        <input name="checkedary" type="hidden" value ="">
		<tr height="25" bgcolor="#DDDDDD">
			<td width="100" class="gray" align="center">��ȸ��</td>
			<td width="90" class="gray" align="center">��������</td>
			<td width="90" class="gray" align="center">��������</td>
			<td width="80" class="gray" align="center">�����</td>
			<td width="100" class="gray" align="center">ȸ��</td>
			<td width="100" class="gray" align="center">�μ�</td>
			<td width="90" class="gray" align="center">��</td>
			<td class="gray" align="center">�۱�</td>
			<td width="90" class="gray"align="center">�۱�����</td>
		</tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord)ds.curcommlist.get(i);%>
        <!-- ���Ȯ����� �� ��ũ -->
        <tr bgcolor="" onclick="alon_detail_view('<%= curcommlistRec.rdr_extncampno%>','<%= curcommlistRec.empseq%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
			<td width="100" class="gray" align="left"><%= curcommlistRec.campnm%>&nbsp;</td>
			<td width="90" class="gray" align="center"><%= Util.convertS(curcommlistRec.frdt)%>&nbsp;</td>
			<td width="90" class="gray" align="center"><%= Util.convertS(curcommlistRec.todt)%>&nbsp;</td>
			<td width="80" class="gray" align="left"><%= curcommlistRec.empnm%>&nbsp;</td>
			<td width="100" class="gray" align="left"><%= curcommlistRec.empcmpynm%>&nbsp;</td>
			<td width="100" class="gray" align="left"><%= curcommlistRec.empdeptnm%>&nbsp;</td>
			<td width="90" class="gray" align="right"><%= Util.comma(curcommlistRec.alonamt)%>&nbsp;</td>
			<td class="gray" align="center">
				<!-- üũ�ڽ��� value = ���Ȯ���ȸ��ȣ 6�ڸ�, ����Ϸù�ȣ 6�ڸ� -->
				<input type="checkbox" onclick="window.event.cancelBubble=true;" name="payyn" value="<%= curcommlistRec.rdr_extncampno%><%= curcommlistRec.empseq%>"
				<%= Util.convertYn(curcommlistRec.payyn, "checked", "")%> >&nbsp;
			</td>
			<td width="90" class="gray"align="center">
				<%= Util.convertS(Util.convertNull(curcommlistRec.paydt,"-"))%>&nbsp;
			</td>
		</tr>
<%}%>

<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center">&nbsp;</td>
			<td width="80" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="100" class="gray" align="center">&nbsp;</td>
			<td width="90" class="gray" align="center">&nbsp;</td>
	        <td class="gray" align="center"><input type="checkbox" name="checkbox" value="">&nbsp;</td>
			<td width="90" class="gray"align="center">&nbsp;</td>
		</tr>
	<%}%>
<%}%>
		<tr bgcolor="#dddddd" align="right">
			<td colspan="6" class="gray" align="right"> ��&nbsp;</td>
			<td width="95" class="gray" align="right"><%= Util.comma(ds.getTotalalonamt())%>&nbsp;&nbsp;</td>
			<td colspan="2" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
			</td>
		</tr>
    </form>
    </table>

	<!--�� �ʱ�ȭ�� ���� table -->
    <table border="0" cellspacing="0" cellpadding="0" id="alon_detail_id">
	</table>

<script>
    parent.document.all.alon_list_id.outerHTML = alon_list_id.outerHTML;
    
    // �� �ʱ�ȭ
    parent.document.all.alon_detail_id.outerHTML = alon_detail_id.outerHTML;
    
    //ȭ�� �ʱ�ȭ
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>

