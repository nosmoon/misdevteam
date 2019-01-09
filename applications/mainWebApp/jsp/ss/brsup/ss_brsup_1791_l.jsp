<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1791_l.jsp
* 기능 : 지국업무지원-Billing자동이체-신청/해지통계-목록조회
* 작성일자 : 2005-01-11
* 작성자 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-24
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_SHFTAPLCEXPY_STCSDataSet ds = (SS_L_SHFTAPLCEXPY_STCSDataSet)request.getAttribute("ds");
    //int moveListCount = 20;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;

  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//rxw.makeDataToBulk(ds, "rsltcur", resTemp, "listGrid");
	rxw.makeHugeStart(resTemp, "listGrid", ds.rsltcur.size());
	long tot_agg = 0;
	for(int i=0; i < ds.rsltcur.size(); i++)
	{
		SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord rsltcurRec = (SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord)ds.rsltcur.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("title");
			rxw.add_ColVal("accu");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//데이터 추가.
		tot_agg += rsltcurRec.total;
		rxw.add_ColVal(rsltcurRec.title2 + " " + rsltcurRec.title1);
		rxw.add_ColVal(tot_agg);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
