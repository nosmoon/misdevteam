<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%
	SS_SLS_BRMGR_2600_ADataSet ds = (SS_SLS_BRMGR_2600_ADataSet)request.getAttribute("ds");
    //int spqtyListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    //int spqtyListCount = 5000;	// �� ȭ��� ����Ʈ �׸� ��
    applySession = true;	// ���� ���� ����
    int formData			= 0;
    int recordSet			= 0;
    
  //TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
			
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");

	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");	
	
	rxw.flush(out);
%>