<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1500_a.jsp
* ��� : ��������-���غ���-���-�ʱ�ȭ��
* �ۼ����� : 2004-02-23
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-03-27
* ������ϸ�: ss_brsup_1500_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_INSRACCD_INITDataSet ds = (SS_L_INSRACCD_INITDataSet)request.getAttribute("ds");
	int insraccdListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;		// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");

	rxw.add(codeData, "defaultDate", Util.getDate()); // �Է�����
	//rxw.add(codeData, "applySession", applySession); // applySession
	
	rxw.makeDataToList(ds, "curprocstat", "cicdnm", "cicodeval", "��ü", "", codeData, "processCombo"); // ó��
	rxw.makeDataToList(ds, "curprocstat", "cicdnm", "cicodeval", codeData, "statCombo"); // ó��
		
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
			
	rxw.flush(out);	
%>