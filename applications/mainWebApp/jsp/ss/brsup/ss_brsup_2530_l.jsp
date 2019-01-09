<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2510_l.jsp
* 기능 : 통합정보지원시스템-판촉물재고관리-목록조회
* 작성일자 : 2009-04-29
* 작성자 : 김용욱
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	:
* 수정자	: 
* 수정일자	: 
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%

	SS_S_DETASLM_BNSITEMINOUTDataSet ds = (SS_S_DETASLM_BNSITEMINOUTDataSet)request.getAttribute("ds");
	
	String jobcd = request.getParameter("jobcd");
	
	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "fromDate", Util.getDate()); // 기간 시작
	rxw.add(resTemp, "toDate", Util.getDate()); // 기간 끝
  	
	rxw.makeHugeStart(resTemp, "detailGrid", ds.detailsearch.size());
	
	for(int i=0; i<ds.detailsearch.size(); i++){
		
		SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord detailsearchRec = (SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord)ds.detailsearch.get(i);
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("inMoney");
			rxw.add_ColVal("outMoney");
			rxw.add_ColVal("oldSum");
			
			rxw.makeRecordToBulkTitle(detailsearchRec);
		}
		rxw.add_ColVal(Util.comma(detailsearchRec.uprc * detailsearchRec.qunt));
		rxw.add_ColVal(Util.comma(detailsearchRec.uprc * detailsearchRec.valqunt));
		rxw.add_ColVal(Double.parseDouble(detailsearchRec.mainware)+Double.parseDouble(detailsearchRec.pyungware)+Double.parseDouble(detailsearchRec.sungware));
		rxw.makeRecordToBulk(detailsearchRec, false);
	}

	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
