<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_ca_1000_a.jsp
* ��� : ���̹�����-���̹�������-�ʱ�ȭ��
* �ۼ����� : 2005-04-18
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-04-02
* ������ϸ�: ss_ca_1000_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_CA_HEAD_INITDataSet ds = (SS_L_CA_HEAD_INITDataSet)request.getAttribute("ds");
    int listCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = false;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	//rxw.add(initData, "defaultDate", Util.getDate()); // ���ó�¥
	
	rxw.makeDataToList(ds, "curcntrstatcd", "cicdnm", "cicodeval", "��ü", "", initData, "statusCombo"); // ������
	rxw.makeDataToList(ds, "curcntrstatcd", "cicdnm", "cicodeval", initData, "statusCombo1"); // ������
	rxw.makeDataToList(ds, "curacctbank", "cicdnm", "cicodeval", initData, "bankCombo"); // �����
		
	rxw.flush(out);	
%>