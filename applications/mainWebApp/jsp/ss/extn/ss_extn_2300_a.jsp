<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2300_a.jsp
* 기능 : 확장현황-사원확장통계현황-초기화면
* 작성일자 : 2012-2-10
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_EXTN_RDR_STATS_INITDataSet ds = (SS_L_EXTN_RDR_STATS_INITDataSet)request.getAttribute("ds");
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "fromDate", Util.getDate()); // 기간 시작
	rxw.add(codeData, "toDate", Util.getDate()); // 기간 끝
	rxw.add(codeData, "fixDate", "20140101"); // 기간 끝
	
	rxw.makeDataToBulk(ds, "curcmpylist", codeData, "teamlist");
	
	rxw.makeDataToBulk(ds, "curoffilist", codeData, "partlist_temp");
	
	rxw.makeDataToBulk(ds, "curdeptlist", codeData, "arealist_temp");
	
	//rxw.makeDataToList(ds, "curcmpylist", "cmpynm", "cmpycd", "전체", "", codeData, "cmpylist");//처리
	
	//rxw.makeDataToList(ds, "curoffilist", "offinm", "officd", "전체", "", codeData, "offilist");//처리	

	//rxw.makeDataToList(ds, "curdeptlist", "deptnm", "deptcd", "전체", "", codeData, "deptlist");//처리
	
	rxw.flush(out);	
%>
