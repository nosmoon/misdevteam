<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1906_l.jsp
* 기능 : 매체 일괄발송 발송처리 조회화면
* 작성일자 : 2004-03-03
* 작성자 : 장수환
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-09
* 백업파일명 : ss_brmgr_1906_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    // dataset 인스턴스 선언부분
    SS_L_SEND_PBLMEDISENDBODataSet ds = (SS_L_SEND_PBLMEDISENDBODataSet)request.getAttribute("ds");  // request dataset
	// 지사별확인 리스트 라인수 설정
    String records_per_page = request.getParameter("pagesize");

	int no_data_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_SEND_PBLMEDISENDBOCURCOMMLISTRecord rec = (SS_L_SEND_PBLMEDISENDBOCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>

