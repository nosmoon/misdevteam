<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brinfo_1155_a.jsp
* 기능 		 : 은행계좌관리 초기화면
* 작성일자 	 :
* 작성자 	 :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 황성진
* 수정일자 : 20090122
* 백업파일명 : ss_brinfo_1155_a.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    //	dataset 인스턴스 선언부분
    //SS_L_BOACCT_LISTDataSet ds = (SS_L_BOACCT_LISTDataSet)request.getAttribute("ds");  // request dataset
    SS_L_BOACCT_LISTDataSet ds = (SS_L_BOACCT_LISTDataSet)request.getAttribute("ds");  // request dataset
    //int listCount = 20;	// 한 화면당 리스트 항목 수
    int listCount = 5000;
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "getAcctTemp");
    
  	//acctitem 처리 - 조회용
    rxw.makeDataToList(ds, "accitmcur", "cicdnm", "cicodeval", "전체", "", acctTemp, "acctItemSearchCombo");

    //acctitem 처리 - 입력용
    rxw.makeDataToList(ds, "accitmcur", "cicdnm", "cicodeval", "선택", "", acctTemp, "acctItemCombo");

    //은행계좌 처리.
    rxw.makeDataToList(ds, "bankcur", "cicdnm", "cicodeval", "선택", "", acctTemp, "bankCombo");

   	//계좌조회 결과.
   	//makeDataToXml(ds, "curcommlist", acctTemp, "acctGrid", rx);
   	//rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "acctGrid");
   	
   	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "acctGrid", ds.curcommlist.size());

	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_BOACCT_LISTCURCOMMLISTRecord rec = (SS_L_BOACCT_LISTCURCOMMLISTRecord)ds.curcommlist.get(i);
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
    
    //System.out.println(rx.getXml());
    //out.println(rx.xmlFlush());
	//out.println(rx.xmlEndFlush());
	rxw.flush(out);

    //data가 없을 경우 처리. 추가 필요.
        
    //page 처리. 추가 필요.
%>





