<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1782_l.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-������(����)-���
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

    SS_L_RDR_EXTN_CYBCOSTDataSet ds = (SS_L_RDR_EXTN_CYBCOSTDataSet)request.getAttribute("ds");
%>
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="cost_list_id">
    <form name="cost_list_form" method="post" action="" >
        <input name="basidt" type="hidden" value ="">
        <input name="bocd" type="hidden" value ="">
        <input name="basidtary" type="hidden" value ="">
        <input name="bocdary" type="hidden" value ="">
        <input name="checkedary" type="hidden" value ="">
        <input name="accflag" type="hidden" value ="">
      <tr bgcolor="#dddddd" align="center">
        <td width="100" class="gray" align="center"> ��� </td>
        <td width="125" class="gray" align="center"> ���� </td>
        <td width="125" class="gray" align="center"> ���� </td>
        <td width="125" class="gray" align="center"> ���ݾ� </td>
        <td width="95" class="gray" align="center"> �Ա� </td>
        <td width="130" class="gray" align="center"> �Ա����� </td>
        <td width="130" class="gray" align="center"> �������� </td>
      </tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_RDR_EXTN_CYBCOSTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_CYBCOSTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- ���̹�Ȯ���� �� ��ũ -->
    <tr bgcolor="" onclick="cost_detail_view('<%= curcommlistRec.basidt%>','<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
        <td width="100" class="gray" align="center"> <%= Util.convertMonthS(curcommlistRec.basidt)%>&nbsp;</td>
        <td width="125" class="gray" align="center"> <%= curcommlistRec.areacdnm%>&nbsp;</td>
        <td width="125" class="gray" align="center"><%= curcommlistRec.bocdnm%>&nbsp;</td>
        <td width="125" class="gray" align="right"> <%= Util.comma(curcommlistRec.costamt)%>&nbsp;</td>
        <td width="95" class="gray" align="center">
			<!-- üũ�ڽ��� value = �������� 6�ڸ�, ���������ڵ� 5�ڸ� -->
			<input type="checkbox" name="busnchrgclamtyn" onclick="window.event.cancelBubble=true;" value="<%= curcommlistRec.basidt%><%= curcommlistRec.bocd%>"
				<%= Util.convertYn(curcommlistRec.busnchrgclamtyn, "checked", "")%> >&nbsp;
		</td>
        <td width="130" class="gray" align="center">
				<%= Util.convertS(Util.convertNull(curcommlistRec.busnchrgclamtdt,"-"))%>&nbsp;
		</td>
        <td width="130" class="gray" align="center">
				<%= Util.convertYn(curcommlistRec.costburdyn,"&nbsp;","300�ι̸�����")%>&nbsp;
		</td>
      </tr>
<%}%>
      <tr bgcolor="#dddddd">
        <td colspan="3" class="gray" align="right"> ��&nbsp;</td>
        <td class="gray" align="right"> <%= Util.comma(ds.getTotalcostamt())%>&nbsp;</td>
        <td colspan="4" class="gray">
          <div align="right"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�ѰǼ�
            : <b><%= ds.getTotalcnt()%>��</b></div>
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
<%}%></script>

