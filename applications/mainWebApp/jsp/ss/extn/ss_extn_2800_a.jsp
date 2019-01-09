<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2800_a.jsp
* 기능 :  확장현황-센터비독자관리-초기화면
* 작성일자 : 2013.07.01
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_TEAM_SRCH_INITDataSet ds = (SS_L_TEAM_SRCH_INITDataSet)request.getAttribute("ds");
    	//int listCount = 10;		// 한 화면당 리스트 항목 수
    	int listCount = 5000;
    	applySession = false;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	//부서(팀)목록 표시.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//파트 목록 표시 - 임시
	//rxw.makeEmpytList(codeData, "partlist_temp", "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//지역 목록 표시.
    	//int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	//지국 목록 표시
	//rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "전체", "");
	
	
	rxw.add(codeData, "fromDate", Util.addMonth(Util.getDate(),-1)); // 기간 시작
	rxw.add(codeData, "toDate", Util.getDate()); // 기간 끝
	
	rxw.flush(out);
%>

