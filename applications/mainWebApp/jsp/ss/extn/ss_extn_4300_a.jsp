<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%
System.out.println("==========ss_extn4300_a.jsp==========");
   SS_L_MO_SVY_INITDataSet ds = (SS_L_MO_SVY_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부

    String resPath = request.getParameter("res_path");
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	//int initData = rxw.add(root, "initTemp", "");
	//int codeData = rxw.add(root, resPath, "");
	//int codeData1 = rxw.add(root, "codeData1", "");
	int codeData = rxw.add(root, "codeData", "");

	//rxw.add(codeData, "fromDate", "20111021"); // 기간 시작
	//rxw.add(codeData, "toDate", "20111120"); // 기간 끝

/*	if(Integer.parseInt((Util.getDate()).substring(6))>20) {
		rxw.add(codeData, "basicdt", (Util.getDate()).substring(0,6)); // 마감월
	} else {
		rxw.add(codeData, "basicdt", Util.addMonth(Util.getDate(),-1).substring(0,6)); // 마감월
	}
*/
	//rxw.add(codeData, "closmm", "201110");

	//rxw.add(codeData, "fromDate", (Util.addMonth(Util.getDate(),-1)).substring(0,6)+"21"); // 기간 시작
	//rxw.add(codeData, "toDate", (Util.getDate()).substring(0,6)+"20"); // 기간 끝
	//rxw.add(codeData, "enterDate", Util.getDate()); // 입력일자
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "uid", String.valueOf( session.getAttribute("uid")));

	rxw.makeDataToList(ds, "curextntypecd", "cicdnm", "cicodeval", "전체", "", codeData, "typeCombo"); // 유형

	//rxw.makeDataToList(ds, "curaplcpathcd", "cicdnm", "cicodeval", "전체", "", codeData, "rmsCombo"); // 경로
	//rxw.makeDataToList(ds, "curextntypecd", "cicdnm", "cicodeval", "전체", "", codeData, "typeCombo"); // 유형
	//rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "전체", "", codeData, "mcCombo"); // 매체
	//rxw.makeDataToList(ds, "cursubscnfmstatcd", "cicdnm", "cicodeval", "전체", "", codeData, "errorCombo"); // 오류

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

	//rxw.makeDataToBulk(ds, "extntypelist", codeData, "extntypelist_temp");

	//rxw.makeDataToBulk(ds, "teamlist", codeData1, "teamlist");
	//rxw.makeDataToBulk(ds, "partlist", codeData1, "partlist_temp");
	//rxw.makeDataToBulk(ds, "arealist", codeData1, "arealist_temp");

	/*// 하단
	//부서(팀)목록 표시.
	int comboTeam1 = rxw.add(codeData1, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam1, true, ds, "curdeptcd", "boksnm", "deptcd");

	//파트 목록 표시 - 임시
	int comboPart1 = rxw.add(codeData1, "partlist_temp" , "");
	rxw.addSelectItem(comboPart1, "record", "dept_nm", "dept_cd", "전체", "");





	//지역 목록 표시.
    int comboArea1 = rxw.add(codeData1, "arealist_temp" , "");
	writeAreaOpt(session, rxw, comboArea1, true);*/

	rxw.flush(out);

%>


