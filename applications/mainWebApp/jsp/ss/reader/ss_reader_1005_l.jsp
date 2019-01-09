<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1005_l.jsp
* 기능 : 독자현황-독자정보-독자검색 목록
* 작성일자 : 2003-12-26
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-10
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_SRCHDataSet ds = (SS_L_RDR_SRCHDataSet)request.getAttribute("ds");
    int rdrsrchListCount = 20;	// 한 화면당 리스트 항목 수
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", rdrsrchListCount);
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	String tempStr = "";
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		SS_L_RDR_SRCHCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_SRCHCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("rdrtel");
			rxw.add_ColVal("tel");
			rxw.add_ColVal("addr");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.rdrtel_no1, curcommlistRec.rdrtel_no2, curcommlistRec.rdrtel_no3, "-"));
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.tel_no11, curcommlistRec.tel_no12, curcommlistRec.tel_no13, "-"));
		rxw.add_ColVal(curcommlistRec.dlvaddr + " " + curcommlistRec.dlvdtlsaddr);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
