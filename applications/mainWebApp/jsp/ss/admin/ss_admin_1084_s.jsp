<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�		: ss_admin_1084_s.jsp
* ���		: �����ڵ� ��ȸ(��)
* �ۼ�����	: 2003-12-29
* �ۼ���		: �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-01
* ������ϸ� : ss_admin_1010_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	// 	dataset �ν��Ͻ� ����κ�
	SS_S_ACCTCDDataSet ds = (SS_S_ACCTCDDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>
