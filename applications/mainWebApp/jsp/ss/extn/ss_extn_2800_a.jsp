<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2800_a.jsp
* ��� :  Ȯ����Ȳ-���ͺ��ڰ���-�ʱ�ȭ��
* �ۼ����� : 2013.07.01
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_TEAM_SRCH_INITDataSet ds = (SS_L_TEAM_SRCH_INITDataSet)request.getAttribute("ds");
    	//int listCount = 10;		// �� ȭ��� ����Ʈ �׸� ��
    	int listCount = 5000;
    	applySession = false;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	//�μ�(��)��� ǥ��.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//��Ʈ ��� ǥ�� - �ӽ�
	//rxw.makeEmpytList(codeData, "partlist_temp", "record", "dept_nm", "dept_cd", "��ü", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//���� ��� ǥ��.
    	//int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	//���� ��� ǥ��
	//rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "��ü", "");
	
	
	rxw.add(codeData, "fromDate", Util.addMonth(Util.getDate(),-1)); // �Ⱓ ����
	rxw.add(codeData, "toDate", Util.getDate()); // �Ⱓ ��
	
	rxw.flush(out);
%>

