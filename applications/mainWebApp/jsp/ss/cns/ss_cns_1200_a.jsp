<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_cns_1200_a.jsp
* ��� : ����-���� �ʱ�ȭ��
* �ۼ����� : 2004-07-15
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : ��ȭ�鿡 ���ִ����� �߰�
* ������ : ��뼷
* �������� : 2005-03-07
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : ��ȭ�鿡 19��ǥ �߰�
* ������ : ��뼷
* �������� : 2005-03-15
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-07
* ������ϸ� : ss_cns_1200_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_DSCT_INITDataSet ds = (SS_L_RDR_DSCT_INITDataSet)request.getAttribute("ds");
    int moveListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
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
	
	rxw.makeDataToList(ds, "acpnpathcd", "cicdnm", "cicodeval", "��ü", "", codeData, "rmsCombo"); // ���
	rxw.makeDataToList(ds, "dscttypecd", "cicdnm", "cicodeval", "��ü", "", codeData, "typeCombo"); // ����
	//rxw.makeDataToList(ds, "dscttypecd", "cicdnm", "cicodeval", "��ü", "", codeData, "typeCombo"); // ������
	
	rxw.flush(out);
%>