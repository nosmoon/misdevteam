<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1500_a.jsp
* ��� : ������-����������-�ʱ�ȭ��
* �ۼ����� : 2005-01-28
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-04-01
* ������ϸ�: ss_brsup_1500_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BOCLOS_INITDataSet ds = (SS_L_BOCLOS_INITDataSet)request.getAttribute("ds");
    int closListCount = 8;	// �� ȭ��� ��������Ʈ �׸� ��
    int mmListCount = 12;	// �� ȭ��� ���и���Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    System.out.println("ds : " + ds);
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");

	rxw.add(codeData, "defaultDate", Util.getYyyyMm()); // �Է�����
		
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
