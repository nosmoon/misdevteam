<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2810_l.jsp
* 기능 : 워크북 관리 리스트
* 작성일자 : 2014-12-24
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_WORKBOOK_APLCDataSet ds = (SS_L_WORKBOOK_APLCDataSet)request.getAttribute("ds");
    //int extnListCount = 5;	// 한 화면당 리스트 항목 수
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    
    int totcnt = 0;
    int totqty = 0;
    if(ds.totcnt != "") {
    	Integer.parseInt(ds.totcnt);
    }else{
    	totcnt = 0;
    }
    
    if(ds.totqty != "") {
    	Integer.parseInt(ds.totqty);
    }else{
    	totqty = 0;
    }
    
    // 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(totcnt)); // 총건수
    rxw.add(acctTemp, "totalQty", Util.comma(totqty)); // 총건수
  	
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_WORKBOOK_APLCCURCOMMLISTRecord curcommlistRec = (SS_L_WORKBOOK_APLCCURCOMMLISTRecord)ds.curcommlist.get(i);
	
		if(i == 0)
		{	
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		rxw.makeRecordToBulk(curcommlistRec, false);

	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

%>

