<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1885_l.jsp
* 기능 : 지국지원-빌링-지로수납현황-목록조회
* 작성일자 : 2007-03-22
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-27
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_GIRORECP_LISTDataSet ds = (SS_L_GIRORECP_LISTDataSet)request.getAttribute("ds");
    //int rcpListCount = 20;	// 한 화면당 리스트 항목 수
    int rcpListCount = 5000;
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", rcpListCount);
	
	rxw.makeDataToBulk(ds, resTemp, "summary");
	
	rxw.makeDataToBulk(ds, "rsltcur", resTemp, "listGrid");
	
	rxw.flush(out);
%>
