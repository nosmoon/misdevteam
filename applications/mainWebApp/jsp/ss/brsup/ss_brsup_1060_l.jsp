<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1060_l.jsp
* 기능 : 지국지원-신문지원물품-신청-목록
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-25
* 백업파일명 : ss_brsup_1060_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_NWSPITEMAPLCDataSet ds = (SS_L_NWSPITEMAPLCDataSet)request.getAttribute("ds");
    int listCount = 10;		// 화면당 항목수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
    rxw.add(acctTemp, "totalQunt", Util.comma(ds.getTotalaplcqunt())); // 총수량
    rxw.add(acctTemp, "amtTotal", Util.comma(ds.getTotalamt())); // 총금액
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // 총건수  
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_NWSPITEMAPLCCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMAPLCCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.add_ColVal("outCheck");
			rxw.add_ColVal("check");
			rxw.add_ColVal("line");
			rxw.add_ColVal("inoutdt");
			rxw.add_ColVal("valqunt");
			
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		rxw.add_ColVal(curcommlistRec.owhproc);
		rxw.add_ColVal("Y");
		rxw.add_ColVal("-");
		if(curcommlistRec.owhproc.equals("Y")){
			rxw.add_ColVal(curcommlistRec.owhdd);
			rxw.add_ColVal(curcommlistRec.owhqunt);
		}else{
			rxw.add_ColVal(Util.getDate()); // 출고일
			rxw.add_ColVal(curcommlistRec.aplcqunt); // 출고수량
		}
		
		//나머지 필드 자동생성.
		
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>

