<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명        : ss_reader_1717_l.jsp
* 기능             : 독자현황-비독자관리 조회
* 작성일자   : 2009-08-11
* 작성자        : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	// request
    //long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	//long records_per_page = ((String)request.getParameter("pagesize") == null)? 9 : Long.parseLong(request.getParameter("pagesize"));

	//long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    // getting dataset
    SS_L_RDR_MNGMEMB_MODataSet ds = (SS_L_RDR_MNGMEMB_MODataSet)request.getAttribute("ds");  // request dataset

  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//rxw.add(resTemp, "curr_page_no", curr_page_no);
	//rxw.add(resTemp, "total_records", ds.totalcnt);
	//rxw.add(resTemp, "datanotexist", String.valueOf(ds.movm_rdrcur.size()==0));
	rxw.makeDataToBulk(ds, "rdrmngmemb", resTemp, "listGrid");
	
	rxw.flush(out);
%>
