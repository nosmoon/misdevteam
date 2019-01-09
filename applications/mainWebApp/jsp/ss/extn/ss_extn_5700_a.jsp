<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_5700_a.jsp
* 기능 : 확장관리-정기구독권-초기
* 작성일자 : 2018-01-10
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5700_ADataSet ds = (SS_SLS_EXTN_5700_ADataSet)request.getAttribute("ds");
    
    applySession = true;	// 세션 적용 여부
    
    String resPath = request.getParameter("res_path");
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, resPath, "");	
	
	rxw.add(codeData, "fromDate", Util.getDate()); // 기간 시작
	rxw.add(codeData, "toDate", Util.getDate()); // 기간 끝	

	rxw.makeDataToList(ds, "cursubscnfmstatcd", "cicdnm", "cicodeval", "전체", "", codeData, "errorCombo"); // 오류
		
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");

	rxw.flush(out);	
%>
