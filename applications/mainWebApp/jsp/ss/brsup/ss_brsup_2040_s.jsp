<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2040_s.jsp
* ��� : ��������-���˿��-�������-��
* �ۼ����� : 2004-03-05
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-30
* ������ϸ� : ss_brsup_2040_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_PROMSTAFDataSet ds = (SS_S_PROMSTAFDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
			
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>