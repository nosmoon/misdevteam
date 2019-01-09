<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_2110_l.jsp
* 기능 : 지국관리-대행지국관리-초기화면
* 작성일자 : 2013-1-25
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	:  
* 수정자	: 
* 수정일자	: 
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_BO_PROXYDataSet ds = (SS_L_BO_PROXYDataSet)request.getAttribute("ds");
    //int spqtyListCount = 20;	// 한 화면당 리스트 항목 수
    int spqtyListCount = 5000;
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", ""); 
	
	//rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	//rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	//rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	//rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	//rxw.add(resTemp, "pagesize", spqtyListCount);
	
	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
