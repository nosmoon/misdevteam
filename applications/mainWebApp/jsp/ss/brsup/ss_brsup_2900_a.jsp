<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2900_a.jsp
* ��� : ��������-������Ȳ-�������-�������������-�ʱ�ȭ��
* �ۼ����� : 2016-05-02
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
System.out.println("==========SS_BRSUP_2900_a.jsp==========");
	SS_SLS_BRSUP_2900_ADataSet ds = (SS_SLS_BRSUP_2900_ADataSet)request.getAttribute("ds");

    applySession = true;		// ���� ���� ����

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");

    rxw.add(codeData, "edmm", Util.getDate());
	rxw.add(codeData, "stmm", Util.getDate());

	//rxw.makeDataToList(ds, "curextntypecd", "cicdnm", "cicodeval", "��ü", "", codeData, "typeCombo"); // ����
    //rxw.add(codeData, "applySession", String.valueOf(applySession));
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

	// �������
	rxw.makeDataToList(ds, "curstafclsfcd", "cicdnm", "cicodeval", "��ü", "", codeData, "stafCombo");

	// ������
	rxw.makeDataToList(ds, "curcntrstatcd", "cicdnm", "cicodeval", "��ü", "", codeData, "statusCombo");



    rxw.flush(out);
%>