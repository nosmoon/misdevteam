<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1465_l.jsp
* 기능       : 독자정보관리(기존독자목록팝업-목록조회)
              (전화번호, 휴대폰번호, 우편번호+상세주소+동+호+번지, 주민등록번호, 이메일)
* 작성일자   : 2004-04-06
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-31
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	//request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    //getting dataset
	SL_L_RDR_DUP_CHKDataSet ds = (SL_L_RDR_DUP_CHKDataSet)request.getAttribute("ds");
    
	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "rdrchkcur", root, "listGrid");
	
	rxw.flush(out);
%>
