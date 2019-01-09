<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_cns_1110_l.jsp
* 기능 : 상담원-이사-목록
* 작성일자 : 2004-07-15
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-01
* 백업파일명 : ss_cns_1110_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_MOVM_RDRDataSet ds = (SS_L_MOVM_RDRDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;	// 한 화면당 리스트 항목 수
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", String.valueOf(ds.getTotalcnt()));
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", moveListCount);
	
	rxw.makeDataToBulk(ds, resTemp, "summary");
	
    rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i<ds.curcommlist.size(); i++)
	{
		SS_L_MOVM_RDRCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDRCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("startChoice");
			rxw.add_ColVal("addrDetail");
			rxw.add_ColVal("phoneNumber");
			rxw.add_ColVal("endChoice");
			rxw.add_ColVal("addrNow");
			rxw.add_ColVal("phoneNow");
			
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		rxw.add_ColVal("전");
		rxw.add_ColVal(curcommlistRec.addr + curcommlistRec.dtlsaddr);
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.rdrtel_no1 ,curcommlistRec.rdrtel_no2 ,curcommlistRec.rdrtel_no3, "-"));
		rxw.add_ColVal("후");
		rxw.add_ColVal(curcommlistRec.movmaddr + curcommlistRec.movmdtlsaddr);
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.movmtel_no1, curcommlistRec.movmtel_no2, curcommlistRec.movmtel_no3, "-"));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);    
%>