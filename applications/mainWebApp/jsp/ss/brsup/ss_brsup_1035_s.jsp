<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1035_s.jsp
* ��� : ��������-�Ź�������ǰ-�԰�-��
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-25
* ������ϸ� : ss_brsup_1035_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%--
1. �԰�����, �԰��ȣ, ��ǰ�ڵ� ���� request�κ��� ��´�.
--%>
<%
	SS_S_NWSPITEMEWHDataSet ds = (SS_S_NWSPITEMEWHDataSet)request.getAttribute("ds");
	String ewhdt = request.getParameter("ewhdt");
	String ewhno = request.getParameter("ewhno");
	String itemcd = request.getParameter("itemcd");
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>