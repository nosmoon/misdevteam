<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pb_rdr_1856_l.jsp
* 기능 :  독자 리스트 가져오기
* 작성일자 : 2007-03-29
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-09
* 백업파일명 : ss_brmgr_1911_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    String pagesize = request.getParameter("pagesize");
    // dataset 인스턴스 선언부분
    SS_L_BO_READER_SEARCHDataSet ds = (SS_L_BO_READER_SEARCHDataSet)request.getAttribute("ds");  // request dataset
    // 공란으로 화면을 구성할 Row수

    int records_non_page = Integer.parseInt(pagesize) - ds.readerlistcur.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.readerlistcur.size());
	
	for(int i=0; i < ds.readerlistcur.size() ; i++)
	{
		SS_L_BO_READER_SEARCHREADERLISTCURRecord rec = (SS_L_BO_READER_SEARCHREADERLISTCURRecord)ds.readerlistcur.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.add_ColVal("rdr_no_detail");
			rxw.add_ColVal("addr_detail");
			rxw.makeRecordToBulkTitle(rec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.
		rxw.add_ColVal(rec.getRdrtel_no1() + "-" + rec.getRdrtel_no2() + "-" + rec.getRdrtel_no3());
		rxw.add_ColVal(rec.getDlvaddr() + "-" + rec.getDlvdtlsaddr());
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
