<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_ca_1010_s.jsp
* ��� : ���̹�����-���̹�������-��
* �ۼ����� : 2005-04-18
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-02
* ������ϸ� : ss_ca_1010_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_CA_HEADDataSet ds = (SS_S_CA_HEADDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");
    rxw.makeDataToBulk(ds, "extnlist", resTemp, "listGrid2");
	
	rxw.flush(out);
%>