<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1901_l.jsp
* 기능 : 주소코드 관리
* 작성일자 : 2014-07-28
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_ADDRCD_TRSFBODataSet ds = (SS_L_ADDRCD_TRSFBODataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	//rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
	
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_ADDRCD_TRSFBOCURCOMMLISTRecord rec = (SS_L_ADDRCD_TRSFBOCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}

		rxw.add_ColVal("");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
