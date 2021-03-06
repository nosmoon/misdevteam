<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1360_l.jsp
* 기능 : 지국지원-상해보험-변경-목록
* 작성일자 : 2004-02-19
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-26
* 백업파일명 : ss_brsup_1335_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%--
	구분값은 request로 부터 얻는다.
--%>
<%
	SS_L_INSRAPLC_CHGDataSet ds = (SS_L_INSRAPLC_CHGDataSet)request.getAttribute("ds");
    int insrchgListCount = 20;	// 한 화면당 리스트 항목 수
    String accflag = request.getParameter("accflag");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // 총건수    
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_INSRAPLC_CHGCURCOMMLISTRecord curcommlistRec = (SS_L_INSRAPLC_CHGCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			//rxw.add_ColVal("check");
			
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		//rxw.add_ColVal("Y");
		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>

