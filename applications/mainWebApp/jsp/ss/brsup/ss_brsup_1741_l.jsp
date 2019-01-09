<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1741_l.jsp
* 기능 : 지국업무지원-Billing자동이체-신청관리-신청요약
* 작성일자 : 2004-03-26
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-16
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_APLC_SSUMDataSet ds = (SS_L_APLC_SSUMDataSet)request.getAttribute("ds");
    int moveListCount = 5000;	// 한 화면당 리스트 항목 수 19 -> 5000
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToBulk(ds, "rsltcur", resTemp, "aplcSumGrid");
	
	int naviInfo = rxw.add(resTemp, "naviInfo", "");
	rxw.add(naviInfo, "pageno", request.getParameter("pageno"));
	rxw.add(naviInfo, "totalcnt", ds.getTotalcnt());
	rxw.add(naviInfo, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(naviInfo, "pagesize", moveListCount);
	
	rxw.flush(out);
%>
