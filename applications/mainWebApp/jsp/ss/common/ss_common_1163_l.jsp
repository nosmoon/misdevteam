<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1163_l.jsp
* ��� : ����-���ޱ����ڵ�˻�(���ޱ��к�-���ϸ���)-�˻���
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_MIG_CLSF_BASIDataSet ds = (SS_L_MIG_CLSF_BASIDataSet)request.getAttribute("ds");
%>
<select name="paybasicd_sel" class="sel_all" id="detail_paybasicd_id" onChange="paybasicd_changed();">
	<option value="" selected>����</option>
	<%= ds.curcommlistOptHtml("") %>
</select>

<script language="javascript">
	parent.document.all.detail_paybasicd_id.outerHTML = detail_paybasicd_id.outerHTML;
</script>
