<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_2620_l.jsp
* 기능       : 독자-불편관리(목록검색)
* 작성일자   : 2004-01-29
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-06
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    // request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
    //long records_per_page = ((String)request.getParameter("pagesize") == null)? 5 : Long.parseLong(request.getParameter("pagesize"));
    long records_per_page = ((String)request.getParameter("pagesize") == null)? 5000 : Long.parseLong(request.getParameter("pagesize"));
    long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

	System.out.println("curr_page_no:"+curr_page_no);
   	System.out.println("records_per_page:"+records_per_page);

    // getting dataset
    SL_L_DSCTDataSet ds = (SL_L_DSCTDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.totalcnt));
	
	rxw.makeHugeStart(resTemp, "listGrid", ds.dsctcur.size());
	SL_L_DSCTDSCTCURRecord dsctcurRec = null;
	for(int i=0; i<ds.dsctcur.size(); i++)
	{
		dsctcurRec = (SL_L_DSCTDSCTCURRecord)ds.dsctcur.get(i);
        
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("boprocyn_f");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(dsctcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal("N".equals(dsctcurRec.boprocyn) ? "미확인" : "확인");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(dsctcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
