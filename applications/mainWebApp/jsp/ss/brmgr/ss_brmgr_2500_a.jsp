<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%
	SS_SLS_BRMGR_2500_ADataSet ds = (SS_SLS_BRMGR_2500_ADataSet)request.getAttribute("ds");
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
	rxw.add(codeData, "now_toyymm", ds.getNow_toyymm());
	
	rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "����", "", codeData, "medicdcur");
	//rxw.makeDataToList(ds, "clsf1cur", "cicdnm", "cicodeval", "����", "", codeData, "clsf1cur");
	rxw.makeDataToList(ds, "clsf2cur", "cicdnm", "cicodeval", "����", "", codeData, "clsf2cur");
	rxw.makeDataToList(ds, "sellnetcur", "cdnm", "cd", "����", "", codeData, "sellnetcur");
	
	rxw.makeHugeStart(codeData, "listGrid_boclsf", ds.boclsf.size());
	
	for(int i=0; i < ds.boclsf.size() ; i++)
	{
		SS_SLS_BRMGR_2500_ABOCLSFRecord curcommlistRec = (SS_SLS_BRMGR_2500_ABOCLSFRecord)ds.boclsf.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		rxw.add_ColVal("N");
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.makeHugeStart(codeData, "listGrid_d_stat", ds.d_stat.size());
	
	for(int i=0; i < ds.d_stat.size() ; i++)
	{
		SS_SLS_BRMGR_2500_AD_STATRecord curcommlistRec = (SS_SLS_BRMGR_2500_AD_STATRecord)ds.d_stat.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		rxw.add_ColVal("N");
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.add(codeData, "uid", String.valueOf( session.getAttribute("uid")));
	
	rxw.flush(out);
%>