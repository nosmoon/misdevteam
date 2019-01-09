<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_health_1120_s.jsp
* 기능 : 워크북 마감 상세
* 작성일자 : 2015-1-5
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_WORKBOOK_SENDCLSDataSet ds = (SS_S_WORKBOOK_SENDCLSDataSet)request.getAttribute("ds");
    //int extnListCount = 5;	// 한 화면당 리스트 항목 수
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
      	
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_S_WORKBOOK_SENDCLSCURCOMMLISTRecord curcommlistRec = (SS_S_WORKBOOK_SENDCLSCURCOMMLISTRecord)ds.curcommlist.get(i);
	
		if(i == 0)
		{	
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		rxw.makeRecordToBulk(curcommlistRec, false);

	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

%>

