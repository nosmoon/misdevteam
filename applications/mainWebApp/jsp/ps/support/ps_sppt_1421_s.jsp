<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_sppt_1421_s.jsp
* ��� : ���ݿ�������û���� ����ȸ
* �ۼ����� : 2005-12-20
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-17
* ������ϸ� : ps_sspt_1421_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
    PS_S_CASHRCPTDataSet ds = (PS_S_CASHRCPTDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// ��ȸ ���.
	rxw.makeDataToBulk(ds, acctTemp, "detailGrid");
		
	rxw.flush(out);
	
	// data�� ���� ��� ó��. �߰� �ʿ�.
%>