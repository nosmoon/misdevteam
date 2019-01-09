<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1905_l.jsp
* 기능 : 독자현황-우송독자관리 리스트
* 작성일자 : 2015-06-18
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_POSTDLVRDRDataSet ds = (SS_L_POSTDLVRDRDataSet)request.getAttribute("ds");

    
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
		
	
	// 조회 결과
	rxw.makeHugeStart(acctTemp, "listGrid", ds.postrdrlist.size());
	
	for(int i=0; i < ds.postrdrlist.size(); i++)
	{
		SS_L_POSTDLVRDRPOSTRDRLISTRecord postrdrlistRec = (SS_L_POSTDLVRDRPOSTRDRLISTRecord)ds.postrdrlist.get(i);
	
		if(i==0)
		{
			rxw.makeRecordToBulkTitle(postrdrlistRec);
		}
		
		rxw.makeRecordToBulk(postrdrlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
		
	rxw.flush(out);
%>
