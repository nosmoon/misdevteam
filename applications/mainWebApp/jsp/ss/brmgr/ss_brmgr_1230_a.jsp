<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1230_a.jsp
* ��� : �����濵-�μ����� ��û(���)-�ʱ�ȭ��
* �ۼ����� : 2004-03-18
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-17
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%--
	������ ������ �μ�������û�� �ҳ�(130),�ְ�(110),������(610),����(111) �׸� ���ؼ��� ó���Ѵ�.
	�߰����� ��ü�� ���� ó���� ����  �ּ�ó���� input �Ķ���͸� �����Ѵ�.(ss_brmgr_1240_l.jsp)
	������ ������ �μ�������û ������ ��������� �������ο� ������� ó���Ѵ�.
--%>
<%
	SS_L_QTYAPLC_INITDataSet ds = (SS_L_QTYAPLC_INITDataSet)request.getAttribute("ds");
	//int listCount = 10;
	int listCount = 5000;
	applySession = true;	// ���� ���� ����
	
	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "dt_clsf", Util.getDate());
	
	//�μ�(��)��� ǥ��.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//��Ʈ ��� ǥ�� - �ӽ�
	//int comboPart = rxw.add(codeData, "partlist_temp" , "");
	//rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "��ü", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//���� ��� ǥ��.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.flush(out);
%>
