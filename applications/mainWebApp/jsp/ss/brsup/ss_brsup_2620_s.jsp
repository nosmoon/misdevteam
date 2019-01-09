<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2620_s.jsp
* 기능 : 지국지원-빌링_자동이체-이체신청개선 상세조회 
* 작성일자 : 2009-05-20
* 작성자 : 김용욱
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	:
* 수정자	: 
* 수정일자	: 
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_SHFTAPLCDataSet ds = (SS_S_SHFTAPLCDataSet)request.getAttribute("ds");

	String jobcd = request.getParameter("jobcd");
	
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	//rxw.makeDataToBulk(ds, resTemp, "detailGrid");
	rxw.makeHugeStart(resTemp, "detailGrid", ds.shftaplcdetail.size());
	for(int i=0; i<ds.shftaplcdetail.size(); i++){
		SS_S_SHFTAPLCSHFTAPLCDETAILRecord shftaplcdetailRec = (SS_S_SHFTAPLCSHFTAPLCDETAILRecord)ds.shftaplcdetail.get(i);
		//title 추가.
		
		if(i == 0)
		{
			rxw.add_ColVal("shftaplcclsf_f");
			rxw.makeRecordToBulkTitle(shftaplcdetailRec);
		}
		if("10".equals(shftaplcdetailRec.shftaplcclsf)){
			rxw.add_ColVal("수신");
		}else if("20".equals(shftaplcdetailRec.shftaplcclsf)){
			rxw.add_ColVal("송신");
		}
	
		rxw.makeRecordToBulk(shftaplcdetailRec, false);
	}

	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
