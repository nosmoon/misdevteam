<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1810_s.jsp
* ��� : ��������-����-����������-����-��
* �ۼ����� : 2004-02-23
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-04
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%--
1. ������ �ڵ� ���� request�κ��� ��´�.
--%>
<%
	SS_S_RCPCMSBSDataSet ds = (SS_S_RCPCMSBSDataSet)request.getAttribute("ds");
	String comscd = Util.checkString(request.getParameter("comscd"));
	
	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "comscd", comscd);
	
	rxw.makeDataToBulk(ds, resTemp, "detailForm");
	rxw.makeDataToList(ds, "clamtmthdcdcur", "cicdnm", "cicodeval", resTemp, "clamtmthdcdCombo");
	rxw.makeDataToList(ds, "calcbasiclsfcur", "cicdnm", "cicodeval", resTemp, "calcbasiclsfCombo");
	
	rxw.flush(out);
%>
