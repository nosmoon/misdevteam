<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1100_a.jsp
* ��� : ������Ȳ-���ں��� �ʱ�ȭ��
* �ۼ����� : 2004-01-10
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ������
* �������� : 2009-04-06
* ������ϸ� : ss_reader_1100_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%--
���ڸ�,���ڹ�ȣ,����,������ OR �˻�
--%>
<%
	SS_L_RDR_DSCT_INITDataSet ds = (SS_L_RDR_DSCT_INITDataSet)request.getAttribute("ds");
    int moveListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    String path = request.getParameter("path"); // �̸������ϰ�� '70'
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "defaultDate", Util.getDate()); //��¥
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
	
	if( path.equals("70")) {
		//rxw.makeDataToList(ds, "acpnpathcd", "cicdnm", "cicodeval", codeData, "acpnCombo"); // ���
	} else {
		rxw.makeDataToList(ds, "acpnpathcd", "cicdnm", "cicodeval", "��ü", "", codeData, "acpnCombo"); // ���
	}
	
	rxw.makeDataToList(ds, "dscttypecd", "cicdnm", "cicodeval", "��ü", "", codeData, "typeCombo"); // ����
	
	rxw.flush(out);
%>
