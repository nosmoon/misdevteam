<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1100_a.jsp
* ��� : ������Ȳ-������� �ʱ�
* �ۼ����� : 2015-10-12
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%--
���ڸ�,���ڹ�ȣ,����,������ OR �˻�
--%>
<%
	SS_L_RDR_DSCTSTAT_INITDataSet ds = (SS_L_RDR_DSCTSTAT_INITDataSet)request.getAttribute("ds");   
    applySession = true;	// ���� ���� ����
    String path = request.getParameter("path"); // �̸������ϰ�� '70'
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "defaultDate", Util.getDate()); //��¥
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
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
	/*
	if( path.equals("70")) {
		//rxw.makeDataToList(ds, "acpnpathcd", "cicdnm", "cicodeval", codeData, "acpnCombo"); // ���
	} else {
		rxw.makeDataToList(ds, "acpnpathcd", "cicdnm", "cicodeval", "��ü", "", codeData, "acpnCombo"); // ���
	}
	*/
	rxw.makeDataToList(ds, "dscttypecd", "cicdnm", "cicodeval", "��ü", "", codeData, "typeCombo"); // ����
	rxw.makeDataToList(ds, "medicd", "cicdnm", "cicodeval", "��ü", "", codeData, "mediCombo"); // ��ü
	
	rxw.flush(out);
%>
