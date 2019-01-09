<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1380_l.jsp
* 기능 		 : 독자정보관리(판촉물내역팝업-목록조회)
* 작성일자 	 : 2003-12-12
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-07
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	// request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    // getting datasetgetAttribute
    SL_L_BNS_ITEMPAYDataSet ds = (SL_L_BNS_ITEMPAYDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int naviInfo = rxw.add(resTemp, "naviInfo", "");
	rxw.add(naviInfo, "curr_page_no", curr_page_no);
	rxw.add(naviInfo, "total_records", ds.totalcnt);
	
	rxw.makeDataToBulk(ds, "bnsitempaycur", resTemp, "listGrid");
	
	rxw.flush(out);
%>
