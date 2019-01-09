<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1200_a.jsp
* 기능 : VacationStop 신청 초기화면
* 작성일자 : 2004-01-14
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-04
* 백업파일명 : ss_reder_1200_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	String toDate      = Util.getDate2();

	SS_L_VS_INITDataSet ds = (SS_L_VS_INITDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;
    applySession = true;	// 세션 적용 여부
    
	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    
	int codeData = rxw.add(root, "initTemp", "");
	
	rxw.add(codeData, "defaultFrom", Util.getDate()); //날짜
	rxw.add(codeData, "defaultTo", Util.getDate()); //날짜
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", moveListCount);

	
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
	
	rxw.makeDataToList(ds, "aplcpathcd", "cicdnm", "cicodeval", "전체", "", codeData, "rmsCombo"); // 경로
	rxw.makeDataToList(ds, "clsfcd", "cicdnm", "cicodeval", "전체", "", codeData, "serviceCombo"); // 서비스
	rxw.makeDataToList(ds, "clsfcd", "cicdnm", "cicodeval", codeData, "serviceChoiceCombo"); // 서비스 구분	
	
	rxw.flush(out);
%>