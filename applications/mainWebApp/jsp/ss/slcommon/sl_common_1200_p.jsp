<%@ page contentType="text/xml;charset=euc-kr"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_common_1200_p.jsp
* 기능 		 : 공통 확장자 검색 (초기화면)
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
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

	// getting dataset
    CO_L_TAOCC_CDVDataSet ds = (CO_L_TAOCC_CDVDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "bocd", Util.getSessionParameterValue(request, "bocd", true));
	rxw.makeDataToBulkList(ds, "curcommlist", "cicdnm", "cicodeval", "전체", "", resTemp, "extnblngcdCombo");
	
	rxw.flush(out);
%>
