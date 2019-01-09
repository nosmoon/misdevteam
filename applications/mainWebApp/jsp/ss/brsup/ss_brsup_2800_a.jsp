<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2800_a.jsp
* 기능 : 센터지원-판촉현황-요원관리-13개월실적
* 작성일자 : 2016-05-03
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_BRSUP_2800_ADataSet ds = (SS_SLS_BRSUP_2800_ADataSet)request.getAttribute("ds");
    int promstafListCount = 5;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initData", "");

	rxw.add(initData, "yymm", Util.getDate().substring(0,6));
	//rxw.add(codeData, "applySession", applySession); // applySession
	
	rxw.makeDataToList(ds, "curcntrstatcd", "cicdnm", "cicodeval", "전체", "", initData, "statusCombo"); // 계약상태
			
	rxw.flush(out);	
%>

