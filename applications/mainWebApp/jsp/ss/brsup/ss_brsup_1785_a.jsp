<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1785_a.jsp
* ��� : ������������-Billing�ڵ���ü-��û���-�ʱ�ȭ��
* �ۼ����� : 2004-04-26
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-24
* ������ϸ�:

---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: ��ü�ڵ帮��Ʈ �߰�
* ������	: �弱��
* ��������	: 2017-10-30
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_APLC_MANG_INITDataSet ds = (SS_L_APLC_MANG_INITDataSet)request.getAttribute("ds");

	//int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;
    applySession = false;	// ���� ���� ����

  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");

	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", moveListCount);
	rxw.add(codeData, "fr_dt", Util.getDate());
	rxw.add(codeData, "to_dt", Util.getDate());

	//��ü���� (��ü���� ����Ʈ�� ������ �ʾƼ� Ȯ���غ��� wb�� ds���� �Ѱ��ִ� �κ��� �������� null�� �Ѱ����� �־���. �����Ϸ�.)
	rxw.makeDataToList(ds, "shftclsf", "cicdnm", "cicodeval", "��ü", "", codeData, "shiftClsfCombo");

	//��ü����
	rxw.makeDataToList(ds, "medicur", "cicdnm", "cicodeval", "��ü", "", codeData, "mediCurCombo");

	rxw.flush(out);
%>
