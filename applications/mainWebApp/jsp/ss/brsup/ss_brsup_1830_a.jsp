<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1830_a.jsp
* ��� : ��������-����-����������-����-�ʱ�ȭ��
* �ۼ����� : 2004-03-09
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-12
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    //int listCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int listCount = 5000;	// �� ȭ��� ����Ʈ �׸� ��
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int defaultData = rxw.add(root, "defaultData", "");
	
	rxw.add(defaultData, "frdt", Util.addDate(Util.getDate(),-120));
	rxw.add(defaultData, "todt", Util.getDate());
	rxw.add(defaultData, "pagesize", listCount);
	
	rxw.flush(out);
%>
