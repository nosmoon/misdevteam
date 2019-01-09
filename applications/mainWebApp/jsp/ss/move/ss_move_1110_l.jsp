<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_move_1110_l.jsp
* 기능 : 이사독자마감-목록
* 작성일자 : 2014-06-05
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_MOVM_RDR_CLOSDataSet ds = (SS_L_MOVM_RDR_CLOSDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    // 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
    rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
    for(int i=0; i<ds.curcommlist.size(); i++)
    {
    	SS_L_MOVM_RDR_CLOSCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDR_CLOSCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("startChoice");
			rxw.add_ColVal("addrDetail");
			rxw.add_ColVal("phoneNumber");
			rxw.add_ColVal("endChoice");
			rxw.add_ColVal("addrNow");
			rxw.add_ColVal("phoneNow");
			rxw.add_ColVal("cns_empcnfmdt1");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		rxw.add_ColVal("전");
		rxw.add_ColVal(curcommlistRec.addr + curcommlistRec.dtlsaddr);
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.rdrtel_no1 ,curcommlistRec.rdrtel_no2 ,curcommlistRec.rdrtel_no3, "-"));
		rxw.add_ColVal("후");
		rxw.add_ColVal(curcommlistRec.movmaddr + curcommlistRec.movmdtlsaddr);
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.movmtel_no1 ,curcommlistRec.movmtel_no2 ,curcommlistRec.movmtel_no3, "-"));
		rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.cns_empcnfmdt));
		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
		
	}
	rxw.makeHugeEnd();
    
	rxw.flush(out);
%>