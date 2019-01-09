<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_move_1010_l.jsp
* 기능 : 이사독자-신청현황-목록
* 작성일자 : 2004-01-05
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 김용욱
* 수정일자 : 2009-03-11
* 백업파일명 : ss_move_1010_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXTN_RDR_STATSDataSet ds = (SS_L_EXTN_RDR_STATSDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// 한 화면당 리스트 항목 수
    //int moveListCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    // 조회 결과.
    rxw.add(acctTemp, "fixbef", Util.comma(ds.getFixbef()));
    rxw.add(acctTemp, "fixaft", Util.comma(ds.getFixaft()));
    rxw.add(acctTemp, "totqty", Util.comma(ds.getTotqty()));
    rxw.add(acctTemp, "parempcnt", Util.comma(ds.getParempcnt()));
    rxw.add(acctTemp, "totempcnt", Util.comma(ds.getTotempcnt()));
    rxw.add(acctTemp, "parempper", Util.comma(ds.getParempper()));
    
    rxw.makeHugeStart(acctTemp, "listGrid", ds.curextnstatlist.size());
    
    System.out.println("dssize"+ds.curextnstatlist.size());
    for(int i=0; i<ds.curextnstatlist.size(); i++)
    {
    	SS_L_EXTN_RDR_STATSCUREXTNSTATLISTRecord curextnstatlistRec = (SS_L_EXTN_RDR_STATSCUREXTNSTATLISTRecord)ds.curextnstatlist.get(i);
		
		//title 추가.
		if(i == 0)
		{			
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curextnstatlistRec);
		}
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curextnstatlistRec, false);
		
	}
	rxw.makeHugeEnd();
    
	rxw.flush(out);
%>