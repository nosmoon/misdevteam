<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1162_l.jsp
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
<select name="paybasicd" class="sel_all" id="paybasicd_id">
	<option value="" selected>��ü</option>
	<%= ds.curcommlistOptHtml("") %>
</select>

<script language="javascript">
	parent.document.all.paybasicd_id.outerHTML = paybasicd_id.outerHTML;
</script>
