<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1080_a.jsp
* ��� : ������-�����ڵ�-�ʱ�ȭ��
* �ۼ����� : 2004-05-01
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-04-01
* ������ϸ�: ss_admin_1080_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
//	dataset �ν��Ͻ� ����κ�
	SS_L_ACCTCD_INITDataSet ds = (SS_L_ACCTCD_INITDataSet)request.getAttribute("ds");
	int listCount = 10;		// ȭ�� �� �׸� ��
	
	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	//rxw.add(initData, "defaultDate", Util.getDate()); // ���ó�¥
	
	rxw.makeDataToList(ds, "imptexpnclsfcur", "cicdnm", "cicodeval", "��ü", "", initData, "gubunCombo"); // ����
	rxw.makeDataToList(ds, "imptexpnclsfcur", "cicdnm", "cicodeval", "��ü", "", initData, "gubunCombo1"); // ����
		
	rxw.flush(out);	
%>

