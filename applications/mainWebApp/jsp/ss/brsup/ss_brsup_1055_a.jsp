<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1055_a.jsp
* ��� : ��������-�Ź�������ǰ-��û-�ʱ�ȭ��
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-03-25
* ������ϸ�: ss_brsup_1055_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%--
1. ���õ� �׸� ���� ��û������ �����Ѵ�.
2. ���õ� �׸��� ����, ���õ��� ���� ���� �׸���
--%>
<%
	SS_L_NWSPITEM_CDLSTDataSet ds = (SS_L_NWSPITEM_CDLSTDataSet)request.getAttribute("ds");
	String paramGbn = "##";
    applySession = true;	// ���� ���� ����
    int listCount = 10;		// ȭ��� �׸��
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");

	rxw.add(codeData, "defaultDate", Util.getDate()); // �Է�����
	
	rxw.makeDataToList(ds, "curitemclsfcd", "cicdnm", "cicodeval", "��ü", "", codeData, "itemGubunCombo"); // ��ǰ����
	
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