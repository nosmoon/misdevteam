<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1540_s.jsp
* 기능 : 확장현황-조선IS확장-마감(MC)-상세
* 작성일자 : 2005-02-19
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-18
* 백업파일명 : ss_extn_1540_ㄴ.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_RDR_EXTN_MCCLOSDataSet ds = (SS_S_RDR_EXTN_MCCLOSDataSet)request.getAttribute("ds");
    int mediListCount = 13;
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
    rxw.add(acctTemp, "listCount", ds.curcommlist.size());
    rxw.makeDataToBulk(ds, acctTemp, "detailData");
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	  	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord curcommlistRec = (SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		rxw.add_ColVal("Y");
		//데이터 추가.
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	// 하단 빈 그리드 생성처리
	for(int i=ds.curcommlist.size(); i<14; i++)
	{
		rxw.add_ColVal("N");
		//데이터 추가.
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(new SS_S_RDR_EXTN_MCCLOSCURCOMMLISTRecord(), false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
    
%>
