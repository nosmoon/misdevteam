<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1110_l.jsp
* 기능 : 상담원-불편 목록
* 작성일자 : 2004-07-15
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-07
* 백업파일명 : ss_cns_1210_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	chosun.ciis.ss.sls.rdr.ds.SS_L_RDR_DSCTDataSet ds = (chosun.ciis.ss.sls.rdr.ds.SS_L_RDR_DSCTDataSet)request.getAttribute("ds");
    int moveListCount = 10;	// 한 화면당 리스트 항목 수

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", String.valueOf(ds.getTotalcnt()));
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", moveListCount);
	
	rxw.makeDataToBulk(ds, resTemp, "summary");
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	//rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
	for(int i=0; i<ds.curcommlist.size(); i++){
		chosun.ciis.ss.sls.rdr.rec.SS_L_RDR_DSCTCURCOMMLISTRecord curcommlistRec = (chosun.ciis.ss.sls.rdr.rec.SS_L_RDR_DSCTCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		if(i == 0)
		{
			rxw.add_ColVal("checkDay");
			rxw.add_ColVal("inout");
			rxw.add_ColVal("okDay");

			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		rxw.add_ColVal(curcommlistRec.acpndt.toString().substring(0,10));
		rxw.add_ColVal(curcommlistRec.cns_empnm + "/" + curcommlistRec.procpers);
		if(curcommlistRec.boprocdt != null){
			rxw.add_ColVal(curcommlistRec.boprocdt.toString().substring(0,10));
		}else{
			rxw.add_ColVal("");
		}
		
		
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	rxw.flush(out);    
%>
