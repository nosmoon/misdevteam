<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_health_1000_a.jsp
* ��� :  �ｺ����-��ũ�ϰ���-�ʱ�ȭ��
* �ۼ����� : 2014-12-23
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_WORKBOOK_APLC_INITDataSet ds = (SS_L_WORKBOOK_APLC_INITDataSet)request.getAttribute("ds");
    	//int listCount = 10;		// �� ȭ��� ����Ʈ �׸� ��
    	int listCount = 5000;
    	applySession = false;	// ���� ���� ����
    
    System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	//�μ�(��)��� ǥ��.
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//��Ʈ ��� ǥ�� - �ӽ�
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//���� ��� ǥ��.
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.add(codeData, "frdt", Util.addMonth(Util.getDate(),-1)); // �Ⱓ ����
	rxw.add(codeData, "todt", Util.getDate()); // �Ⱓ ��
	
	rxw.flush(out);
%>

