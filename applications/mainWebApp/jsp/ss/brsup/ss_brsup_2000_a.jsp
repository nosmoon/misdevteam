<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2000_a.jsp
* ��� : ��������-���˿��-IS���-�ʱ�ȭ��
* �ۼ����� : 2004-03-05
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : MC �߰�
* ������ : ��뼷
* �������� : 20041220
* ������ϸ� : ����(�߰�)
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������: ���̹���� �˻� �߰�
* ������ : ��뼷
* �������� : 2006-02-03
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-03-30
* ������ϸ�: ss_brsup_2000_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_INIT_ISDataSet ds = (SS_L_PROMSTAF_INIT_ISDataSet)request.getAttribute("ds");
    int promstafListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initData", "");

	rxw.add(initData, "defaultDate", Util.getDate()); // �Է�����
	//rxw.add(codeData, "applySession", applySession); // applySession
	
	rxw.makeDataToList(ds, "curcntrstatcd", "cicdnm", "cicodeval", "��ü", "", initData, "statusCombo"); // ������
	rxw.makeDataToList(ds, "curacctbank", "cicdnm", "cicodeval", "����", "", initData, "bankCombo"); // �����
			
	rxw.flush(out);	
%>
