<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1050_a.jsp
* ��� : ����Info-���������ȣ-�ʱ�ȭ��
* �ۼ����� : 2004-08-13
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-03-19
* ������ϸ�: ss_brinfo_1050_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
SS_L_JUSO_BO_INITDataSet ds = (SS_L_JUSO_BO_INITDataSet)request.getAttribute("ds");
    //int listCount = 20;		// �� ȭ��� ����Ʈ �׸� ��
    int listCount = 5000;
    applySession = false;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	//�μ�(��)��� ǥ��.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curcommlist", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//��Ʈ ��� ǥ�� - �ӽ�
	//rxw.makeEmpytList(codeData, "partlist_temp", "record", "dept_nm", "dept_cd", "��ü", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//���� ��� ǥ��.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	//���� ��� ǥ��
	rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "��ü", "");

	
	rxw.flush(out);	
%>
