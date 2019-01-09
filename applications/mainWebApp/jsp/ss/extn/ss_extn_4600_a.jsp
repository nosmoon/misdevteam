<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_4600_a.jsp
* 기능 : 기업후원확장-등록및조회
* 작성일자 : 2016-02-15
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_4600_ADataSet ds = (SS_SLS_EXTN_4600_ADataSet)request.getAttribute("ds");
    
    applySession = true;	// 세션 적용 여부
    
    String resPath = request.getParameter("res_path");
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, resPath, "");	
	
	rxw.add(codeData, "fromDate", Util.getDate()); // 기간 시작
	rxw.add(codeData, "toDate", Util.getDate()); // 기간 끝	
	
	rxw.makeDataToList(ds, "curaplcpathcd", "cicdnm", "cicodeval", "전체", "", codeData, "rmsCombo"); // 경로
	rxw.makeDataToList(ds, "curextntypecd", "cicdnm", "cicodeval", "전체", "", codeData, "typeCombo"); // 유형
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "전체", "", codeData, "mcCombo"); // 매체
	rxw.makeDataToList(ds, "cursubscnfmstatcd", "cicdnm", "cicodeval", "전체", "", codeData, "errorCombo"); // 오류
	rxw.makeDataToList(ds, "curdncomp", "cicdnm", "cicodeval", "전체", "", codeData, "dncompCombo"); // 대납기업
	rxw.makeDataToList(ds, "curextn_gb", "cicdnm", "cicodeval", codeData, "extngbCombo"); // 확장구분
		
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.makeHugeStart(codeData, "listGrid_extn_gb", ds.curextn_gb.size());
	
	for(int i=0; i < ds.curextn_gb.size() ; i++)
	{
		SS_SLS_EXTN_4600_ACUREXTN_GBRecord curcommlistRec = (SS_SLS_EXTN_4600_ACUREXTN_GBRecord)ds.curextn_gb.get(i);
		
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
