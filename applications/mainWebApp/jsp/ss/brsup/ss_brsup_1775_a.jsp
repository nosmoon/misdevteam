<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1775_a.jsp
* 기능 : 지국업무지원-Billing자동이체-청구관리-초기화면
* 작성일자 : 2004-04-16
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-09
* 백업파일명 : ss_brsup_1775_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	String toDate = Util.getDate2();

    SS_S_SHFT_CLAM_INITDataSet ds = (SS_S_SHFT_CLAM_INITDataSet)request.getAttribute("ds");

	//int moveListCount = 20;	// 한 화면당 리스트 항목 수
	int moveListCount = 5000;	// 한 화면당 리스트 항목 수
    applySession = false;	// 세션 적용 여부
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int defData = rxw.add(root, "codeData", "");

    rxw.add(defData, "applySession", String.valueOf(applySession));
    
    rxw.add(defData, "defaultToady", Util.getDate()); //기준일자
    rxw.add(defData, "defaultMondy", Util.getDate()); //이제구분별 청구월
    rxw.add(defData, "defaultAreaMondy", Util.getDate()); //지국별 청구월
    
  	//부서(팀)목록 표시.
	//int comboTeam = rxw.add(defData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curcommlist", "boksnm", "deptcd");
	//rxw.addSelectItem(comboTeam, "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "teamlist", defData, "teamlist");
	
	//파트 목록 표시 - 임시
	//int comboPart = rxw.add(codeData, "partlist_temp" , "");
	//int comboPart = rxw.add(defData, "partlist" , "");
	//rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "partlist", defData, "partlist_temp");
	
	//지역 목록 표시.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	//rxw.makeDataToList(ds, "jycur", "areanm", "areacd", "전체", "", defData, "arealist", "record", "area_nm", "area_cd");
	rxw.makeDataToBulk(ds, "arealist", defData, "arealist_temp");
	
	rxw.makeDataToList(ds, "shftclsf", "cicdnm", "cicodeval", "전체", "", defData, "findCombo");//이체구분
    rxw.flush(out);
    
%>