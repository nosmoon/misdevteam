<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%
System.out.println("==========ss_extn4300_a.jsp==========");
   SS_L_MO_SVY_INITDataSet ds = (SS_L_MO_SVY_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����

    String resPath = request.getParameter("res_path");
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	//int initData = rxw.add(root, "initTemp", "");
	//int codeData = rxw.add(root, resPath, "");
	//int codeData1 = rxw.add(root, "codeData1", "");
	int codeData = rxw.add(root, "codeData", "");

	//rxw.add(codeData, "fromDate", "20111021"); // �Ⱓ ����
	//rxw.add(codeData, "toDate", "20111120"); // �Ⱓ ��

/*	if(Integer.parseInt((Util.getDate()).substring(6))>20) {
		rxw.add(codeData, "basicdt", (Util.getDate()).substring(0,6)); // ������
	} else {
		rxw.add(codeData, "basicdt", Util.addMonth(Util.getDate(),-1).substring(0,6)); // ������
	}
*/
	//rxw.add(codeData, "closmm", "201110");

	//rxw.add(codeData, "fromDate", (Util.addMonth(Util.getDate(),-1)).substring(0,6)+"21"); // �Ⱓ ����
	//rxw.add(codeData, "toDate", (Util.getDate()).substring(0,6)+"20"); // �Ⱓ ��
	//rxw.add(codeData, "enterDate", Util.getDate()); // �Է�����
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "uid", String.valueOf( session.getAttribute("uid")));

	rxw.makeDataToList(ds, "curextntypecd", "cicdnm", "cicodeval", "��ü", "", codeData, "typeCombo"); // ����

	//rxw.makeDataToList(ds, "curaplcpathcd", "cicdnm", "cicodeval", "��ü", "", codeData, "rmsCombo"); // ���
	//rxw.makeDataToList(ds, "curextntypecd", "cicdnm", "cicodeval", "��ü", "", codeData, "typeCombo"); // ����
	//rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "��ü", "", codeData, "mcCombo"); // ��ü
	//rxw.makeDataToList(ds, "cursubscnfmstatcd", "cicdnm", "cicodeval", "��ü", "", codeData, "errorCombo"); // ����

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

	//rxw.makeDataToBulk(ds, "extntypelist", codeData, "extntypelist_temp");

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


