<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1800_a.jsp
* ��� :
* �ۼ����� : 2006-06-07
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ������
* ��������	: 2009-02-19
* ������ϸ�: ss_extn_1800_a.jsp
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_READER_BOINFO_INITDataSet ds = (SS_L_READER_BOINFO_INITDataSet)request.getAttribute("ds");
    //int listCount = 20;		// �� ȭ��� ����Ʈ �׸� ��
    int listCount = 5000;
    applySession = true;	// ���� ���� ����

    String strFromDt = "";
    String strToDt = "";

    strFromDt = (Util.addDate( (Util.getDate()).substring(0,6) + "01", -1 )).substring( 0, 6 ) + "21";
    strToDt = (Util.getDate()).substring(0,6) + "20";
	
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "defaultFrom", strFromDt);
	rxw.add(codeData, "defaultTo", strToDt);
	
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
	
	rxw.flush(out);
%>
