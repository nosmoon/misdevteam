<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1607_s.jsp
* 기능 : 관리자-담당별 우편번호 변경처리-상세
* 작성일자 : 2009-04-28
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_CHGZIPCODEDataSet ds = (SS_S_CHGZIPCODEDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// 조회 결과.
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.detaillist.size());
	
	for(int i=0; i < ds.detaillist.size() ; i++)
	{
		SS_S_CHGZIPCODEDETAILLISTRecord rec = (SS_S_CHGZIPCODEDETAILLISTRecord)ds.detaillist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			//나머지 필드는 자동 생성.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(rec);
		}

		//나머지 필드 자동생성.
		rxw.add_ColVal("Y");
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
