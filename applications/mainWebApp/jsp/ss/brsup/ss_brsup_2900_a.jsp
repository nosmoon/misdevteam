<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2900_a.jsp
* 기능 : 센터지원-판촉현황-요원관리-요원별실적관리-초기화면
* 작성일자 : 2016-05-02
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
System.out.println("==========SS_BRSUP_2900_a.jsp==========");
	SS_SLS_BRSUP_2900_ADataSet ds = (SS_SLS_BRSUP_2900_ADataSet)request.getAttribute("ds");

    applySession = true;		// 세션 적용 여부

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");

    rxw.add(codeData, "edmm", Util.getDate());
	rxw.add(codeData, "stmm", Util.getDate());

	//rxw.makeDataToList(ds, "curextntypecd", "cicdnm", "cicodeval", "전체", "", codeData, "typeCombo"); // 유형
    //rxw.add(codeData, "applySession", String.valueOf(applySession));
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

	// 요원구분
	rxw.makeDataToList(ds, "curstafclsfcd", "cicdnm", "cicodeval", "전체", "", codeData, "stafCombo");

	// 계약상태
	rxw.makeDataToList(ds, "curcntrstatcd", "cicdnm", "cicodeval", "전체", "", codeData, "statusCombo");



    rxw.flush(out);
%>