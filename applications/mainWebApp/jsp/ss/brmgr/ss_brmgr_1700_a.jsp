<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1700_a.jsp
* ��� : ��������-������������-�ʱ�ȭ��
* �ۼ����� : 2004-03-09
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-14
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_MOVMWORK_INITDataSet ds = (SS_L_RDR_MOVMWORK_INITDataSet)request.getAttribute("ds");
    //int movmListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    int movmListCount = 5000;
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", movmListCount);
	rxw.add(codeData, "frdt", Util.addDate(Util.getDate(),-120));
	rxw.add(codeData, "todt", Util.getDate());
	
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
	
	//ó������ - �ڵ� "20"���� default ó�� �ʿ�.
	rxw.makeDataToList(ds, "curstat", "cicdnm", "cicodeval", "��ü", "", codeData, "statelist");
	
	rxw.flush(out);
%>
