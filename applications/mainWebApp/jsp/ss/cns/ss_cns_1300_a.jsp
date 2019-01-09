<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_cns_1300_a.jsp
* ��� : ����-VacationStop-�ʱ�ȭ��
* �ۼ����� : 2004-07-16
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-09
* ������ϸ� : ss_cns_1300_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_VS_INITDataSet ds = (SS_L_VS_INITDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "fromDate", Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "toDate", Util.getDate()); // �Ⱓ ��
	rxw.add(codeData, "pagesize", moveListCount);
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "cns_empnm_id", Util.getSessionParameterValue(request, "emp_nm", false)); //���� �̸�
	
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
	
	rxw.makeDataToList(ds, "aplcpathcd", "cicdnm", "cicodeval", "��ü", "", codeData, "rmsCombo"); // ���
	rxw.makeDataToList(ds, "clsfcd", "cicdnm", "cicodeval", "��ü", "", codeData, "serviceCombo"); // ����	
	rxw.makeDataToList(ds, "curvaca_arearegncd", "cicdnm", "cicodeval", "����", "", codeData, "curvacaCombo"); // �ް����ǿ�
	
	rxw.flush(out);	
%> 