<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1150_l.jsp
* 기능       : 독자정보관리(구독내역팝업-구독내역목록조회)
* 작성일자   : 2003-12-12
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-02
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    // request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
    long records_per_page = ((String)request.getParameter("pagesize") == null)? 9 : Long.parseLong(request.getParameter("pagesize"));

    long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    // getting dataset
    SL_L_NWSPSUBSCNTRPTCRDataSet ds = (SL_L_NWSPSUBSCNTRPTCRDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "curr_page_no", curr_page_no);
	rxw.add(resTemp, "total_records", ds.totalcnt);
	rxw.add(resTemp, "datanotexist", String.valueOf(ds.nwspsubscntrcur.size()==0));
	
	rxw.makeHugeStart(resTemp, "subsGrid", ds.nwspsubscntrcur.size());
	SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord nwspsubscntrcurRec = null;
	for(int i=0; i<ds.nwspsubscntrcur.size(); i++){
	    nwspsubscntrcurRec = (SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(i);
        
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("duration");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(nwspsubscntrcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(new StringBuffer().append(Util.convertS(nwspsubscntrcurRec.rdr_extndt)).append(" ~ ").append("".equals(nwspsubscntrcurRec.suspdt)? "현재" : Util.convertS(nwspsubscntrcurRec.suspdt)));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(nwspsubscntrcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
