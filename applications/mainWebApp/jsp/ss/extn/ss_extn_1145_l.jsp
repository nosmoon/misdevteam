<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1145_l.jsp
* ��� : Ȯ����Ȳ-ǰ����Ȯ��-������(���)-���
* �ۼ����� : 2003-12-03
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_EXGCOSTDataSet ds = (SS_L_RDR_EXTN_EXGCOSTDataSet)request.getAttribute("ds");
    int listCount = 10;		// ȭ��� �׸��
%>
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
    <form name="cost_list_form" method="post" action="" >
        <input name="basidt" type="hidden" value ="">
        <input name="bocd" type="hidden" value ="">
        <input name="basidtary" type="hidden" value ="">
        <input name="bocdary" type="hidden" value ="">
        <input name="checkedary" type="hidden" value ="">
        <input name="accflag" type="hidden" value ="">
        
		<tr bgcolor="#dddddd" align="center" height="23">
			<td width="80" class="gray" align="center">���</td>
			<td width="90" class="gray" align="center">����</td>
			<td width="90" class="gray" align="center">����</td>
			<td width="95" class="gray" align="center">�ΰ�ݾ�</td>
			<td width="95" class="gray" align="center">�μ��ݾ�</td>
			<td width="95" class="gray" align="center">���ݾ�</td>
			<td class="gray" align="center">�Ա�</td>
			<td width="100" class="gray" align="center">�Ա�����</td>
			<td width="100" class="gray" align="center">��������</td>
		</tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_RDR_EXTN_EXGCOSTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EXGCOSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- ǰ����Ȯ���� �� ��ũ -->
    <tr bgcolor="" onclick="cost_detail_view('<%= curcommlistRec.basidt%>','<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
        <td width="80" class="gray" align="center"> <%= Util.convertMonthS(curcommlistRec.basidt)%> &nbsp;</td>
        <td width="90" class="gray" align="left"> <%= curcommlistRec.areacdnm%>&nbsp; </td>
        <td width="90" class="gray" align="left"><%= curcommlistRec.bocdnm%>&nbsp;</td>
        <td width="95" class="gray" align="right"> <%= Util.comma(curcommlistRec.trsfamt)%>&nbsp;</td>
        <td width="95" class="gray" align="right"> <%= Util.comma(curcommlistRec.acptamt)%>&nbsp;</td>
        <td width="95" class="gray" align="right"> <%= Util.comma(curcommlistRec.costamt)%>&nbsp;</td>
        <td class="gray" align="center">
			<!-- üũ�ڽ��� value = �������� 6�ڸ�, ���������ڵ� 5�ڸ� -->
			<input type="checkbox" name="busnchrgclamtyn" onclick="window.event.cancelBubble=true;" value="<%= curcommlistRec.basidt%><%= curcommlistRec.bocd%>"
				<%= Util.convertYn(curcommlistRec.busnchrgclamtyn, "checked", "")%> >&nbsp;
		</td>
        <td width="100" class="gray" align="center">
				<%= Util.convertS(Util.convertNull(curcommlistRec.busnchrgclamtdt,"-"))%>&nbsp;
		</td>
        <td width="100" class="gray" align="center">
				<%= Util.convertYn(curcommlistRec.costburdyn,"&nbsp;","300�ι̸�����")%>&nbsp;
		</td>
	</tr>
<%}%>

<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
	<tr align="center">
        <td width="80" class="gray" align="center">&nbsp;</td>
        <td width="90" class="gray" align="center">&nbsp;</td>
        <td width="90" class="gray" align="center">&nbsp;</td>
        <td width="95" class="gray" align="right">&nbsp;</td>
        <td width="95" class="gray" align="right">&nbsp;</td>
        <td width="95" class="gray" align="right">&nbsp;</td>
        <td class="gray" align="center"><input type="checkbox" name="checkbox" value="">&nbsp;</td>
        <td width="100" class="gray" align="center">&nbsp;</td>
        <td width="100" class="gray" align="center">&nbsp;</td>
	</tr>
	<%}%>
<%}%>
      <tr bgcolor="#dddddd"  height="23">
        <td colspan="3"class="gray" align="right"> ��&nbsp;</td>
        <td width="95" class="gray" align="right"> <%= Util.comma(ds.getTotaltrsfamt())%>&nbsp;</td>
        <td width="95" class="gray" align="right"> <%= Util.comma(ds.getTotalacptamt())%>&nbsp;</td>
        <td width="95" class="gray" align="right"> <%= Util.comma(ds.getTotalcostamt())%>&nbsp;</td>
        <td colspan="3" class="gray" align="right">
          <img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
        </td>
      </tr>
    </form>
    </table>

	<!--���� �ʱ�ȭ-->
    <table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
	</table>

<script>
    parent.document.all.cost_list_id.outerHTML = cost_list_id.outerHTML;
    
    // �� �ʱ�ȭ
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
        
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>     
</script>

