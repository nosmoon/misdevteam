<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1003_l.jsp
* ��� : ������-�����ڵ�-�ڵ屸�� ���
* �ۼ����� : 2004-03-09
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-01
* ������ϸ� : ss_admin_1003_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	CO_L_CDV_CICDGBDataSet ds = (CO_L_CDV_CICDGBDataSet)request.getAttribute("ds");
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initTemp = rxw.add(root, "initTemp", "");
	       
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "cicdgb", "��ü", "", initTemp, "codeGubunCombo");
	rxw.flush(out);
%>