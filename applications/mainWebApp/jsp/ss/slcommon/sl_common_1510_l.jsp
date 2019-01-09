<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_common_1510_p.jsp
* 기능 		 : 판촉물검색 팝업 (목록조회)
* 작성일자 	 : 2003-12-09
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
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    // getting dataset
    SL_L_BNSITEMDataSet ds = (SL_L_BNSITEMDataSet)request.getAttribute("ds");  // request dataset

    //application exception 처리-> 화면에서 처리.
    /*if(ds.bnsitemcur.size() < 1){
        request.setAttribute("appException", new AppException("sl_common_1510_p.jsp(1)","검색결과가 존재하지 않습니다."));
        pageContext.forward("/jsp/ss/slcomm_jsp/app_error.jsp");
    }*/
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "curr_page_no", curr_page_no);
	rxw.add(resTemp, "total_records", ds.totalcnt);
	rxw.add(resTemp, "records_per_page", records_per_page);
	
	rxw.makeDataToBulk(ds, "bnsitemcur", resTemp, "listGrid");
	
	rxw.flush(out);
%>
