<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1410_s.jsp
* ��� : ������-�۾�-���-��
* �ۼ����� : 2004-04-09
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-01
* ������ϸ� : ss_admin_1400_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_WRKDataSet ds = (SS_S_WRKDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>
