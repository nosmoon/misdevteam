<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1113_l.jsp
* ��� : ���� �˻� ���(����Ű)
* �ۼ����� : 2004-03-22
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������ : Ȳ����
* �������� : 2009-02-09
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BO_SRCH_TEMPDataSet ds = (SS_L_BO_SRCH_TEMPDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "curbolist", root, "branchGrid");
	
	rxw.flush(out);
%>