<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_5400_a.jsp
* 기능 : 기업후원확장-구독배정내역(담당조회)
* 작성일자 : 2017-10-11
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5400_ADataSet ds = (SS_SLS_EXTN_5400_ADataSet)request.getAttribute("ds");
    
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, "codeData", "");	
	
	rxw.add(codeData, "fryymm", Util.getDate().substring(0,6)); // 기간 시작
	rxw.add(codeData, "toyymm", Util.getDate().substring(0,6)); // 기간 끝	
	
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.makeHugeStart(codeData, "listGrid_extn_gb", ds.curextn_gb.size());
	
	for(int i=0; i < ds.curextn_gb.size() ; i++)
	{
		SS_SLS_EXTN_5400_ACUREXTN_GBRecord curcommlistRec = (SS_SLS_EXTN_5400_ACUREXTN_GBRecord)ds.curextn_gb.get(i);
		
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

	rxw.flush(out);	
%>
