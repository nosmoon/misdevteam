<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1100_a.jsp
* 기능 : 독자현황-불편통계 초기
* 작성일자 : 2015-10-12
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%--
독자명,독자번호,제목,내용은 OR 검색
--%>
<%
	SS_L_RDR_DSCTSTAT_INITDataSet ds = (SS_L_RDR_DSCTSTAT_INITDataSet)request.getAttribute("ds");   
    applySession = true;	// 세션 적용 여부
    String path = request.getParameter("path"); // 이마상담원일경우 '70'
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "defaultDate", Util.getDate()); //날짜
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	//부서(팀)목록 표시.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//파트 목록 표시 - 임시
	//int comboPart = rxw.add(codeData, "partlist_temp" , "");
	//rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//지역 목록 표시.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	/*
	if( path.equals("70")) {
		//rxw.makeDataToList(ds, "acpnpathcd", "cicdnm", "cicodeval", codeData, "acpnCombo"); // 경로
	} else {
		rxw.makeDataToList(ds, "acpnpathcd", "cicdnm", "cicodeval", "전체", "", codeData, "acpnCombo"); // 경로
	}
	*/
	rxw.makeDataToList(ds, "dscttypecd", "cicdnm", "cicodeval", "전체", "", codeData, "typeCombo"); // 유형
	rxw.makeDataToList(ds, "medicd", "cicdnm", "cicodeval", "전체", "", codeData, "mediCombo"); // 매체
	
	rxw.flush(out);
%>
