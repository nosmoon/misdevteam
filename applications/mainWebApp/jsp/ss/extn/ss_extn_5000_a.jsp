<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_5000_a.jsp
* 기능 : 기업후원확장-확장자 배정
* 작성일자 : 2016-02-15
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5000_ADataSet ds = (SS_SLS_EXTN_5000_ADataSet)request.getAttribute("ds");
    
    applySession = true;	// 세션 적용 여부
    
    String resPath = request.getParameter("res_path");
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, resPath, "");	
	
	rxw.makeDataToList(ds, "curdncomp", "cicdnm", "cicodeval", "전체", "", codeData, "dncompCombo"); // 대납기업

	rxw.flush(out);	
%>
