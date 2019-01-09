<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1777_l.jsp
* 기능 : 지국업무지원-Billing자동이체-청구관리-지국별 청구목록
* 작성일자 : 2004-04-17
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응
* 수정자	: 김용욱
* 수정일자	: 2009-03-09
* 백업파일명: ss_brsup_1777_s.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_SHFT_CLAMDataSet ds = (SS_L_SHFT_CLAMDataSet)request.getAttribute("ds");
    //int moveListCount = 20;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int tempData = rxw.add(root, "tempData", "");
	
	rxw.add(tempData, "totalcnt", ds.getTotalcnt());
	rxw.add(tempData, "pageno", request.getParameter("pageno"));
	rxw.add(tempData, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(tempData, "pagesize", moveListCount);
	rxw.add(tempData, "page_set_gubun", 0);
		
	rxw.makeDataToBulk(ds, "rsltcur", tempData, "ChargeListgrid");
	rxw.flush(out);
	
%>
