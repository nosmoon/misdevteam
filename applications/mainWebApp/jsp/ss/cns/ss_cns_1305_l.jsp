<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_cns_1305_l.jsp
* ��� : ����-VacationStop-�ް���������� ���
* �ۼ����� : 2004-07-15
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-09
* ������ϸ� : ss_cns_1305_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_VS_AREANMDataSet ds = (SL_L_VS_AREANMDataSet)request.getAttribute("ds");

	//TrustForm ó�� ����
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int dataTemp = rxw.add(root, "dataTemp", "");
	
	rxw.makeDataToList(ds, "curcommlist", "vaca_areanm", "vaca_areacd", "����", "", dataTemp, "vacaCombo"); // �ް����ǿ�
	
	rxw.flush(out);	
%>
