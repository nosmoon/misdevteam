<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1200_a.jsp
* ��� : VacationStop ��û �ʱ�ȭ��
* �ۼ����� : 2004-01-14
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-04
* ������ϸ� : ss_reder_1200_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	String toDate      = Util.getDate2();

	SS_L_VS_INITDataSet ds = (SS_L_VS_INITDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;
    applySession = true;	// ���� ���� ����
    
	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    
	int codeData = rxw.add(root, "initTemp", "");
	
	rxw.add(codeData, "defaultFrom", Util.getDate()); //��¥
	rxw.add(codeData, "defaultTo", Util.getDate()); //��¥
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", moveListCount);

	
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
	rxw.makeDataToList(ds, "clsfcd", "cicdnm", "cicodeval", codeData, "serviceChoiceCombo"); // ���� ����	
	
	rxw.flush(out);
%>