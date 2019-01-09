<%@ page contentType="text/xml;charset=euc-kr"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_common_1210_l.jsp
* 기능 		 : 공통 확장자 검색 (목록조회)
* 작성일자 	 : 2003-12-13
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-01
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	// request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	//long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 5000 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    // getting dataset
    SL_L_EXTNPERSDataSet ds = (SL_L_EXTNPERSDataSet)request.getAttribute("ds");  // request dataset

    //application exception 처리	-> 화면에서 처리.
    /*if(ds.curcommlist.size() < 1){
        request.setAttribute("appException", new AppException("sl_common_1210_l.jsp(1)","검색결과가 존재하지 않습니다."));
        pageContext.forward("/jsp/ss/slcomm_jsp/app_error.jsp");
    }*/
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "curr_page_no", curr_page_no);
	rxw.add(resTemp, "total_records", ds.totalcnt);
	rxw.add(resTemp, "records_per_page", records_per_page);
	
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	SL_L_EXTNPERSCURCOMMLISTRecord rec = null;
	for(int i=0; i<ds.curcommlist.size(); i++){
		rec = (SL_L_EXTNPERSCURCOMMLISTRecord)ds.curcommlist.get(i);
        
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("seq");
			rxw.add_ColVal("uniqeno");
			rxw.add_ColVal("tel_no");
			rxw.add_ColVal("ptph_no");
			//순번 그대로 사용.
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(start_no++);
		rxw.add_ColVal("".equals(rec.stafno)? rec.boemp_no : rec.stafno);
		rxw.add_ColVal(Util.getChainStr(rec.tel_no1, rec.tel_no2, rec.tel_no3, "-"));
		rxw.add_ColVal(Util.getChainStr(rec.ptph_no1, rec.ptph_no2, rec.ptph_no3, "-"));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

