<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1775_a.jsp
* ��� : ������������-Billing�ڵ���ü-û������-�ʱ�ȭ��
* �ۼ����� : 2004-04-16
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ����
* �������� : 2009-03-09
* ������ϸ� : ss_brsup_1775_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	String toDate = Util.getDate2();

    SS_S_SHFT_CLAM_INITDataSet ds = (SS_S_SHFT_CLAM_INITDataSet)request.getAttribute("ds");

	//int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
	int moveListCount = 5000;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = false;	// ���� ���� ����
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int defData = rxw.add(root, "codeData", "");

    rxw.add(defData, "applySession", String.valueOf(applySession));
    
    rxw.add(defData, "defaultToady", Util.getDate()); //��������
    rxw.add(defData, "defaultMondy", Util.getDate()); //�������к� û����
    rxw.add(defData, "defaultAreaMondy", Util.getDate()); //������ û����
    
  	//�μ�(��)��� ǥ��.
	//int comboTeam = rxw.add(defData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curcommlist", "boksnm", "deptcd");
	//rxw.addSelectItem(comboTeam, "record", "dept_nm", "dept_cd", "��ü", "");
	rxw.makeDataToBulk(ds, "teamlist", defData, "teamlist");
	
	//��Ʈ ��� ǥ�� - �ӽ�
	//int comboPart = rxw.add(codeData, "partlist_temp" , "");
	//int comboPart = rxw.add(defData, "partlist" , "");
	//rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "��ü", "");
	rxw.makeDataToBulk(ds, "partlist", defData, "partlist_temp");
	
	//���� ��� ǥ��.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	//rxw.makeDataToList(ds, "jycur", "areanm", "areacd", "��ü", "", defData, "arealist", "record", "area_nm", "area_cd");
	rxw.makeDataToBulk(ds, "arealist", defData, "arealist_temp");
	
	rxw.makeDataToList(ds, "shftclsf", "cicdnm", "cicodeval", "��ü", "", defData, "findCombo");//��ü����
    rxw.flush(out);
    
%>