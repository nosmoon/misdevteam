<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_health_1000_a.jsp
* 기능 :  헬스조선-워크북관리-초기화면
* 작성일자 : 2014-12-23
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_WORKBOOK_APLC_INITDataSet ds = (SS_L_WORKBOOK_APLC_INITDataSet)request.getAttribute("ds");
    	//int listCount = 10;		// 한 화면당 리스트 항목 수
    	int listCount = 5000;
    	applySession = false;	// 세션 적용 여부
    
    System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	//부서(팀)목록 표시.
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//파트 목록 표시 - 임시
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//지역 목록 표시.
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.add(codeData, "frdt", Util.addMonth(Util.getDate(),-1)); // 기간 시작
	rxw.add(codeData, "todt", Util.getDate()); // 기간 끝
	
	rxw.flush(out);
%>

