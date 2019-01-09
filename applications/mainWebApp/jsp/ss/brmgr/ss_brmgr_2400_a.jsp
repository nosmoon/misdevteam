<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%
	SS_SLS_BRMGR_2400_ADataSet ds = (SS_SLS_BRMGR_2400_ADataSet)request.getAttribute("ds");
    //int spqtyListCount = 20;	// 한 화면당 리스트 항목 수
    //int spqtyListCount = 5000;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    int formData			= 0;
    int recordSet			= 0;
    
  //TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
			
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");

	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");	

	rxw.add(codeData, "fr_yymm", Util.getDate().substring(0,6));
	rxw.add(codeData, "to_yymm", Util.getDate().substring(0,6));
	rxw.add(codeData, "now_toyymm", ds.getNow_toyymm());
	
	//rxw.makeDataToList(ds, "clsf1cur", "cicdnm", "cicodeval", "전체", "", codeData, "clsf1cur");
	rxw.makeHugeStart(codeData, "listGrid_boclsf", ds.boclsf.size());
	
	for(int i=0; i < ds.boclsf.size() ; i++)
	{
		SS_SLS_BRMGR_2400_ABOCLSFRecord curcommlistRec = (SS_SLS_BRMGR_2400_ABOCLSFRecord)ds.boclsf.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
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