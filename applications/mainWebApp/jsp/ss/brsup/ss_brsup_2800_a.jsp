<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2800_a.jsp
* ��� : ��������-������Ȳ-�������-13��������
* �ۼ����� : 2016-05-03
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_BRSUP_2800_ADataSet ds = (SS_SLS_BRSUP_2800_ADataSet)request.getAttribute("ds");
    int promstafListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initData", "");

	rxw.add(initData, "yymm", Util.getDate().substring(0,6));
	//rxw.add(codeData, "applySession", applySession); // applySession
	
	rxw.makeDataToList(ds, "curcntrstatcd", "cicdnm", "cicodeval", "��ü", "", initData, "statusCombo"); // ������
			
	rxw.flush(out);	
%>

