<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%
	SS_SLS_BRMGR_2200_ADataSet ds = (SS_SLS_BRMGR_2200_ADataSet)request.getAttribute("ds");
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

	rxw.add(codeData, "fr_yymm", Util.getDate().substring(0,6));
	rxw.add(codeData, "to_yymm", Util.getDate().substring(0,6));
	
	rxw.makeDataToList(ds, "clsf1cur", "cicdnm", "cicodeval", "����", "", codeData, "clsf1cur");
	rxw.makeDataToList(ds, "clsf2cur", "cicdnm", "cicodeval", "����", "", codeData, "clsf2cur");
	rxw.makeDataToList(ds, "clsf3cur", "cicdnm", "cicodeval", "����", "", codeData, "clsf3cur");
	
	rxw.add(codeData, "uid", String.valueOf( session.getAttribute("uid")));
	
	rxw.flush(out);
%>