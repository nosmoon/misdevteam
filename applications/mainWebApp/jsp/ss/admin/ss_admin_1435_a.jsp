<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1435_a.jsp
* ��� : ������-�۾�-�̷�-�ʱ�ȭ��
* �ۼ����� : 2004-04-10
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-04-01
* ������ϸ�: ss_admin_1435_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    int wrkListCount = 10;		// �� ȭ��� ����Ʈ �׸� ��
    int wrkdtlListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��(����)
    applySession = true;		// ���� ���� ����

	SS_L_WRKHIST_INITDataSet ds = (SS_L_WRKHIST_INITDataSet)request.getAttribute("ds");
    
	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	rxw.add(initData, "defaultDate", Util.getDate()); // ���ó�¥	
	rxw.makeDataToList(ds, "wrklist", "descri", "id", "��ü", "", initData, "idCombo"); // ���̵�
		
	rxw.flush(out);	
%>
