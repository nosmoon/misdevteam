<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1000_a.jsp
* 기능 : 확장현황-신청현황-초기화면
* 작성일자 : 2003-11-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 사이버센터장 추가(사이버요원과 동일하게 처리)
* 수정자 : 김대섭
* 수정일자 : 2005-04-18
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 확인보류 추가
* 수정자 : 김대섭
* 수정일자 : 2005-04-30
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 캠페인확장 추가
* 수정자 : 김대섭
* 수정일자 : 2005-07-18
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-03-09
* 백업파일명: ss_extn_1000_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_XTN_INITDataSet ds = (SS_L_RDR_XTN_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부

    String resPath = request.getParameter("res_path");
    System.out.println("resPath="+resPath);
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	//int initData = rxw.add(root, "initTemp", "");
	int codeData = rxw.add(root, resPath, "");
	//int codeData1 = rxw.add(root, "codeData1", "");

	rxw.add(codeData, "fromDate", Util.getDate()); // 기간 시작
	rxw.add(codeData, "toDate", Util.getDate()); // 기간 끝
	rxw.add(codeData, "enterDate", Util.getDate()); // 입력일자

	rxw.makeDataToList(ds, "curaplcpathcd", "cicdnm", "cicodeval", "전체", "", codeData, "rmsCombo"); // 경로
	rxw.makeDataToList(ds, "curextntypecd", "cicdnm", "cicodeval", "전체", "", codeData, "typeCombo"); // 유형
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "전체", "", codeData, "mcCombo"); // 매체
	rxw.makeDataToList(ds, "cursubscnfmstatcd", "cicdnm", "cicodeval", "전체", "", codeData, "errorCombo"); // 오류

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