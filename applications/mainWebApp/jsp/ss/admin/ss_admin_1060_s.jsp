<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: ss_admin_1060_s.jsp
* ���		: ������-�����ڵ�-��
* �ۼ�����	: 2004-04-28
* �ۼ���	: ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-01
* ������ϸ� : ss_admin_1010_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SL_S_BNSITEMDataSet ds = (SL_S_BNSITEMDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToList(ds, "useclsfcur", "cicdnm", "cicodeval", "��ü", "", resTemp, "gubunCombo"); // ����
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>

