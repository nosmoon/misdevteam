<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2520_s.jsp
* 기능 : 통합정보지원시스템-판촉물재고관리-상세화면
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

	SS_S_TASLM_BNSITEMINOUTDataSet ds = (SS_S_TASLM_BNSITEMINOUTDataSet)request.getAttribute("ds");

	String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드

	String jobcd = request.getParameter("jobcd");
	
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "fromDate", Util.getDate()); // 기간 시작
	rxw.add(resTemp, "toDate", Util.getDate()); // 기간 끝
	
	rxw.makeHugeStart(resTemp, "detailGrid", ds.detailinout.size());
	for(int i=0; i<ds.detailinout.size(); i++){
		SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord detailinoutRec = (SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord)ds.detailinout.get(i);
		//title 추가.

		if(i == 0)
		{
			rxw.add_ColVal("inMoney");
			rxw.add_ColVal("outMoney");
			rxw.add_ColVal("oldSum");
						
			rxw.makeRecordToBulkTitle(detailinoutRec);
		}
		//rxw.add_ColVal(Util.comma(detailinoutRec.uprc * detailinoutRec.qunt));
		rxw.add_ColVal(Util.comma(detailinoutRec.uprc * detailinoutRec.qunt));
		rxw.add_ColVal(Util.comma(detailinoutRec.uprc * detailinoutRec.valqunt));
		rxw.add_ColVal(Double.parseDouble(detailinoutRec.mainware)+Double.parseDouble(detailinoutRec.pyungware)+Double.parseDouble(detailinoutRec.sungware));
//		rxw.add_ColVal(Integer.parseInt(detailinoutRec.mainware)+Integer.parseInt(detailinoutRec.pyungware)+Integer.parseInt(detailinoutRec.sungware));

		rxw.makeRecordToBulk(detailinoutRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
