<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1000_a.jsp
* ��� : Ȯ����Ȳ-��û��Ȳ-�ʱ�ȭ��
* �ۼ����� : 2003-11-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : ���̹������� �߰�(���̹������ �����ϰ� ó��)
* ������ : ��뼷
* �������� : 2005-04-18
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : Ȯ�κ��� �߰�
* ������ : ��뼷
* �������� : 2005-04-30
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : ķ����Ȯ�� �߰�
* ������ : ��뼷
* �������� : 2005-07-18
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-03-09
* ������ϸ�: ss_extn_1000_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_XTN_INITDataSet ds = (SS_L_RDR_XTN_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����

    String resPath = request.getParameter("res_path");
    System.out.println("resPath="+resPath);
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	//int initData = rxw.add(root, "initTemp", "");
	int codeData = rxw.add(root, resPath, "");
	//int codeData1 = rxw.add(root, "codeData1", "");

	rxw.add(codeData, "fromDate", Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "toDate", Util.getDate()); // �Ⱓ ��
	rxw.add(codeData, "enterDate", Util.getDate()); // �Է�����

	rxw.makeDataToList(ds, "curaplcpathcd", "cicdnm", "cicodeval", "��ü", "", codeData, "rmsCombo"); // ���
	rxw.makeDataToList(ds, "curextntypecd", "cicdnm", "cicodeval", "��ü", "", codeData, "typeCombo"); // ����
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "��ü", "", codeData, "mcCombo"); // ��ü
	rxw.makeDataToList(ds, "cursubscnfmstatcd", "cicdnm", "cicodeval", "��ü", "", codeData, "errorCombo"); // ����

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


	//rxw.makeDataToBulk(ds, "teamlist", codeData1, "teamlist");
	//rxw.makeDataToBulk(ds, "partlist", codeData1, "partlist_temp");
	//rxw.makeDataToBulk(ds, "arealist", codeData1, "arealist_temp");

	/*// �ϴ�
	//�μ�(��)��� ǥ��.
	int comboTeam1 = rxw.add(codeData1, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam1, true, ds, "curdeptcd", "boksnm", "deptcd");

	//��Ʈ ��� ǥ�� - �ӽ�
	int comboPart1 = rxw.add(codeData1, "partlist_temp" , "");
	rxw.addSelectItem(comboPart1, "record", "dept_nm", "dept_cd", "��ü", "");

	//���� ��� ǥ��.
    int comboArea1 = rxw.add(codeData1, "arealist_temp" , "");
	writeAreaOpt(session, rxw, comboArea1, true);*/

	rxw.flush(out);
%>