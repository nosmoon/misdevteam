<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1768_l.jsp
* 기능 : 지국업무지원-Billing자동이체-납부자관리-납부계약 로그내역
* 작성일자 : 2004-04-12
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-06
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_SHFT_PYMT_CNTR_LOGDataSet ds = (SS_L_SHFT_PYMT_CNTR_LOGDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", moveListCount);
	
	rxw.makeDataToBulk(ds, "rsltcur", resTemp, "pymtcntrlogGrid");
	
	rxw.flush(out);
%>
