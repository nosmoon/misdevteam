<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1800_a.jsp
* ��� : ��������-����-����������-����-�ʱ�ȭ��
* �ۼ����� : 2004-02-23
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-04
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%--
1. �������ؿ� ���� ������, �������� �ʼ� �׸� �޶���
   1.1 �Ǵ� �� ��� - �����Ḹ �Է°���
   1.2 �ݾ״��� ��� - ���������� �Է°���
2. ��Ÿ �ʵ带 �ξ� Ȯ�强�� ��� �Ѵ�.
--%>
<%
	SS_L_RCPCMSBS_INITDataSet ds = (SS_L_RCPCMSBS_INITDataSet)request.getAttribute("ds");
    //int rcpcmsbsListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int rcpcmsbsListCount = 5000;
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int comboSet = rxw.add(root, "comboSet", "");
	
	rxw.add(comboSet, "pagesize", rcpcmsbsListCount);
	
	rxw.makeDataToList(ds, "clamtmthdcdcur", "cicdnm", "cicodeval", comboSet, "clamtmthdcdCombo");
	rxw.makeDataToList(ds, "calcbasiclsfcur", "cicdnm", "cicodeval", comboSet, "calcbasiclsfCombo");
	
	rxw.flush(out);
%>
