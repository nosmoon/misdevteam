<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_ca_1110_l.jsp
* 기능     : 사이버센터-사이버수당청구-조회
* 작성일자 : 2005-06-20
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-02
* 백업파일명 : ss_ca_1110_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_CYBALON_BOCLAMDataSet ds = (SS_L_CYBALON_BOCLAMDataSet)request.getAttribute("ds");

    int listCount = 15;	// 한 화면당 리스트 항목 수

	// 검색 리스트 카운트
	int recCount  =  ds.boalonclamlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수
    rxw.add(acctTemp, "totalCount", ds.totalcnt); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.boalonclamlist.size());
	
	for(int i=0; i < ds.boalonclamlist.size() ; i++)
	{
		SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord boalonclamlistRec = (SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord)ds.boalonclamlist.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			//rxw.add_ColVal("tel_no_detail");
			rxw.makeRecordToBulkTitle(boalonclamlistRec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.
		//rxw.add_ColVal(Util.getChainStr(curcommlistRec.tel_no1,curcommlistRec.tel_no2,curcommlistRec.tel_no3,"-"));
		rxw.makeRecordToBulk(boalonclamlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
