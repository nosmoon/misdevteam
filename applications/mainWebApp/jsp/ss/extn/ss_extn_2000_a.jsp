<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2000_a.jsp
* ��� : Ȯ����Ȳ-������Ȳ-�ʱ�ȭ��
* �ۼ����� : 2009-05-14
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: 
* ������	: 
* ��������	: 
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXTN_SUSP_INITDataSet ds = (SS_L_EXTN_SUSP_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	rxw.add(codeData, "defaultFrom", Util.getDate()); // �Ⱓ from 
	rxw.add(codeData, "defaultTo", Util.getDate()); // �Ⱓ to
		
	//rxw.makeDataToList(ds, "cursuspcd", "cicdnm", "cicodeval", codeData, "suspCombo"); // ����
	
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
	
	// �������� �޺� ó��(�ߺ� ������ ���� �׸���� ǥ��)
	//rxw.makeDataToBulk(ds, "cursuspcd", codeData, "listGrid");
	rxw.makeHugeStart(codeData, "listGrid", ds.cursuspcd.size());
	
	for(int i=0; i < ds.cursuspcd.size() ; i++)
	{
		SS_L_EXTN_SUSP_INITCURSUSPCDRecord curcommlistRec = (SS_L_EXTN_SUSP_INITCURSUSPCDRecord)ds.cursuspcd.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.		
		rxw.add_ColVal("N");
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

