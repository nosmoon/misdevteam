<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1120_s.jsp
* ��� : ��������-�Ź�������ǰ-���-��
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-25
* ������ϸ� : ss_brsup_1025_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%--
1. ��û����, ��û��ȣ, ��ǰ�ڵ�, ����ȣ ���� request�κ��� ��´�.
2. ������ڴ� ��û���� �������� ó���Ѵ�.
--%>
<%
	SS_S_NWSPITEMACCDDataSet ds = (SS_S_NWSPITEMACCDDataSet)request.getAttribute("ds");
	String aplcdt = request.getParameter("aplcdt");
	String aplcno = request.getParameter("aplcno");
	String itemcd = request.getParameter("itemcd");
	String accdno = request.getParameter("accdno");
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>

