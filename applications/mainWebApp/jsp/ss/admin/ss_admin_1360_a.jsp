<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1360_a.jsp
* ��� : ������-���ϸ���-����-����
* �ۼ����� : 2003-12-17
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_A_MIGLLMMT_CLOS_CLOSEDataSet ds = (SS_A_MIGLLMMT_CLOS_CLOSEDataSet)request.getAttribute("ds");
%>

<script language="javascript">
    alert("�����Ǿ����ϴ�.");

    // ��ȭ���� �������ش�.
	parent.migclos_detail_view('<%= ds.getBasidt()%>');
</script>