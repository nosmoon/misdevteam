<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1615_l.jsp
* 기능 : 지국지원-Billing-지로EDI수납관리-지로EDI 입금처리결과 목록조회
* 작성일자 : 2004-03-10
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-17
* 백업파일명 : ss_brsup_1615_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_GIRORECPDataSet ds = (SS_L_GIRORECPDataSet)request.getAttribute("ds");
    int moveListCount = 10;	// 한 화면당 리스트 항목 수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // 총
    rxw.add(acctTemp, "rcpCount", Util.comma(ds.getRcpmcnt())); // 입금
    rxw.add(acctTemp, "errCount", Util.comma(ds.getErrcnt())); // 오류
    rxw.add(acctTemp, "amtCount", Util.comma(ds.getTotalamt())); // 총입금액
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.rsltcur.size());
	
	for(int i=0; i < ds.rsltcur.size() ; i++)
	{
		SS_L_GIRORECPRSLTCURRecord rsltcurRec = (SS_L_GIRORECPRSLTCURRecord)ds.rsltcur.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.add_ColVal("amt_detail");
			
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}

		//데이터 추가.
		
		if(rsltcurRec.clamt==0) {
   			rxw.add_ColVal(rsltcurRec.amt);
   		} else {
   			rxw.add_ColVal(rsltcurRec.clamt);
   		}			
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.  
%>

