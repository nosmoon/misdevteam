<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1410_s.jsp
* ��� : ��������-���غ���-����-��
* �ۼ����� : 2004-02-05
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-26
* ������ϸ� : ss_brsup_1310_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_INSRAPLCCLOSDataSet ds = (SS_S_INSRAPLCCLOSDataSet)request.getAttribute("ds");
    int mediListCount = 4;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>
