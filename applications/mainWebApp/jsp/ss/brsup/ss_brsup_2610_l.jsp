<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2610_l.jsp
* 기능 : 지국지원-빌링_자동이체-이체신청개선-목록조회
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
		
	SS_L_SHFTAPLCDataSet ds = (SS_L_SHFTAPLCDataSet)request.getAttribute("ds");

	String jobcd = request.getParameter("jobcd");
	
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	rxw.makeHugeStart(resTemp, "listGrid", ds.shftaplclist.size());
	for(int i=0; i<ds.shftaplclist.size(); i++){
		SS_L_SHFTAPLCSHFTAPLCLISTRecord shftaplclistRec = (SS_L_SHFTAPLCSHFTAPLCLISTRecord)ds.shftaplclist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("aplcclsf_f");
			rxw.makeRecordToBulkTitle(shftaplclistRec);
		}
		if("10".equals(shftaplclistRec.aplcclsf)){
			rxw.add_ColVal("수신");
		}else if("20".equals(shftaplclistRec.aplcclsf)){
			rxw.add_ColVal("송신");
		}
		
		rxw.makeRecordToBulk(shftaplclistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
