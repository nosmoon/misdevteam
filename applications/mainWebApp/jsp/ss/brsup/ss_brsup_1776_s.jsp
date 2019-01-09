<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1776_s.jsp
* 기능 : 지국업무지원-Billing자동이체-청구관리-이체구분별 청구목록
* 작성일자 : 2004-04-17
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응
* 수정자	: 김용욱
* 수정일자	: 2009-03-09
* 백업파일명: ss_brsup_1776_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_SHFT_CLAM_SSUMDataSet ds = (SS_S_SHFT_CLAM_SSUMDataSet)request.getAttribute("ds");
	//int moveListCount = 5;	// 한 화면당 리스트 항목 수
	int moveListCount = 5000;
	RwXmlWrapper rxw = new RwXmlWrapper();

	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
		
		//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.rsltcur.size());
	
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_S_SHFT_CLAM_SSUMRSLTCURRecord rsltcurRec = (SS_S_SHFT_CLAM_SSUMRSLTCURRecord)ds.rsltcur.get(i);
	
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("send_shftclam");
			rxw.add_ColVal("receive_shftclam");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rsltcurRec);
 			
		}
		
		//if( session.getAttribute("uid").equals("c192044")){
		if( session.getAttribute("uid").equals("i0212")){
			rxw.add_ColVal(rsltcurRec.basidt+","+rsltcurRec.shftclsfcd);
			rxw.add_ColVal(rsltcurRec.basidt+","+rsltcurRec.shftclsfcd);
		}else{
			rxw.add_ColVal("-");
			rxw.add_ColVal("-");
		}
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>