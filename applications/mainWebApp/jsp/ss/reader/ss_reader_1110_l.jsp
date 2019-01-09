<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1110_l.jsp
* 기능 : 독자현황-독자불편-목록
* 작성일자 : 2004-01-12
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-06
* 백업파일명 : ss_reader_1110_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	chosun.ciis.ss.sls.rdr.ds.SS_L_RDR_DSCTDataSet ds = (chosun.ciis.ss.sls.rdr.ds.SS_L_RDR_DSCTDataSet)request.getAttribute("ds");
    int moveListCount = 10;	// 한 화면당 리스트 항목 수

	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // 총건수

  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		chosun.ciis.ss.sls.rdr.rec.SS_L_RDR_DSCTCURCOMMLISTRecord curcommlistRec = (chosun.ciis.ss.sls.rdr.rec.SS_L_RDR_DSCTCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.add_ColVal("acpndt_detail");
			rxw.add_ColVal("boprocdt_detail");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		//데이터 추가.
		
		//나머지 필드 자동생성.
		
		//rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.acpndt));
		//rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.boprocdt));
		rxw.add_ColVal((curcommlistRec.acpndt).toString().substring(0,10));
		//if("".equals(curcommlistRec.boprocdt)){
		if(curcommlistRec.boprocdt == null){
			rxw.add_ColVal("");
		}else{
			rxw.add_ColVal((curcommlistRec.boprocdt).toString().substring(0,10));
		}
		
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
