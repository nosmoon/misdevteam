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
	SS_L_TASLM_BNSITEMINOUTDataSet ds = (SS_L_TASLM_BNSITEMINOUTDataSet)request.getAttribute("ds");

	String jobcd = request.getParameter("jobcd");
	
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	rxw.makeHugeStart(resTemp, "listGrid", ds.bnsiteminout.size());
	for(int i=0; i<ds.bnsiteminout.size(); i++){
		SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord bnsiteminoutRec = (SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord)ds.bnsiteminout.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("total");
			rxw.makeRecordToBulkTitle(bnsiteminoutRec);
		}
		rxw.add_ColVal(Double.parseDouble(bnsiteminoutRec.mainware)+Double.parseDouble(bnsiteminoutRec.pyungware)+Double.parseDouble(bnsiteminoutRec.sungware));
		rxw.makeRecordToBulk(bnsiteminoutRec, false);
	}

	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
