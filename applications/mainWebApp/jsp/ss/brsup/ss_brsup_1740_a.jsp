<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1740_a.jsp
* ��� : ������������-Billing�ڵ���ü-��û����-�ʱ�ȭ��
* �ۼ����� : 2004-03-25
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-15
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    String concatDelimiter = "##";	// �Ա�ó�� �� �� �׸��� concatenate�� �� ���Ǵ� delimiter
    
    SS_L_APLC_MANG_INITDataSet ds = (SS_L_APLC_MANG_INITDataSet)request.getAttribute("ds");
    
    int moveListCount = 5000;	// �� ȭ��� ����Ʈ �׸� �� 19 -> 5000
    applySession = false;	// ���� ���� ����
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	int boSearchForm = rxw.add(codeData, "boSearchForm", "");
	rxw.add(boSearchForm, "applySession", String.valueOf(applySession));
	rxw.add(boSearchForm, "pagesize", moveListCount);
	rxw.add(boSearchForm, "aplcdt", Util.getDate().substring(0,6));
	
	//����.
	rxw.makeDataToBulkList(ds, "jycur", "areanm", "areacd", "��ü", "", codeData, "arealist", "record", "area_nm", "area_cd", false);
	
	//��ü����.
	rxw.makeDataToBulkList(ds, "shftclsf", "cicdnm", "cicodeval", "��ü", "", codeData, "shftclsfCombo");
	
	//ó������. default : 10
	rxw.makeDataToBulkList(ds, "aplcprocstat", "cicdnm", "cicodeval", "��ü", "", codeData, "aplcprocstatCombo");
	
	//��û����.
	rxw.makeDataToBulkList(ds, "aplcclsf", "cicdnm", "cicodeval", "��ü", "", codeData, "aplcclsfCombo");
	
	rxw.flush(out);
%>
