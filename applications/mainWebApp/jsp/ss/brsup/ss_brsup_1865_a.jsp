<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1860_a.jsp
* ��� : ��������-����-����������-����-�������
* �ۼ����� : 2004-03-09
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-12
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_A_RECPCOMSCLOS_CLOSEDataSet ds = (SS_A_RECPCOMSCLOS_CLOSEDataSet)request.getAttribute("ds");

	//TrustForm ó�� ����
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.setMessageAlert("������� �Ǿ����ϴ�.");
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>

<%--
message�� ó���ϰ�. ȭ�鰻���� xrw ȭ�鿡 ������ ���� �̿��Ѵ�.
<script language="javascript">
    alert("������� �Ǿ����ϴ�.");

    // ��ȭ���� �������ش�.
	parent.sls_detail_view('<%//= ds.basidt%>');
</script>
--%>