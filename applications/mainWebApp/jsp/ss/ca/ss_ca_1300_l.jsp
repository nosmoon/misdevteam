<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_ca_1300_l.jsp
* 기능     : 사이버센터-정산마감-초기화면및 마감내역
* 작성일자 : 2005-07-27
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-02
* 백업파일명 : ss_ca_1300_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    //request process
    String closyymm   = Util.checkString(request.getParameter("closyymm"));               //정산마감월
    String pageno     = Util.checkString(request.getParameter("pageno"));                 //현재페이지

    //페이지 체크
    if(pageno.equals("") || pageno == null){
        pageno  =  "1";
    }

    int listCount = 15;      //한 화면당 리스트 항목 수
    applySession  = true;    //세션 적용 여부

    //dataset 인스턴스 선언부분
	SS_L_CYBALON_CLOSPTCRDataSet ds = (SS_L_CYBALON_CLOSPTCRDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.closptcrcur.size());
	
	for(int i=0; i < ds.closptcrcur.size() ; i++)
	{
		SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord closptcrcurRec = (SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord)ds.closptcrcur.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(closptcrcurRec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(closptcrcurRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
    
%>