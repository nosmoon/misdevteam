<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1250_s.jsp
* ��� : ����Info-����������-������Ұ�-��
* �ۼ����� : 2004-05-19
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_BO_HEADIDEADataSet ds = (SS_S_BO_HEADIDEADataSet)request.getAttribute("ds");
%>
<form name="detail_form" method="post">
    <textarea name="idea1"><%= ds.idea1 %></textarea>
</form>

<script>
    // ������ �Ұ� �˻� ���� �Ұ��� �����Ѵ�.
	parent.bo_head_idea_detail_form.idea1.value = detail_form.idea1.value;
    
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

	// ��ҹ�ư Ȱ��ȭ
	parent.document.all.cancel_id.disabled = false;
	
	// ���� accflag �� 'U'�� �����Ѵ�.
    parent.document.bo_head_idea_detail_form.accflag.value = 'U'
    
</script>