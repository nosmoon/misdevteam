<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_cns_1200_a.jsp
* 기능 : 상담원-불편 초기화면
* 작성일자 : 2004-07-15
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : 상세화면에 맛있는한자 추가
* 수정자 : 김대섭
* 수정일자 : 2005-03-07
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 상세화면에 19단표 추가
* 수정자 : 김대섭
* 수정일자 : 2005-03-15
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-07
* 백업파일명 : ss_cns_1200_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_DSCT_INITDataSet ds = (SS_L_RDR_DSCT_INITDataSet)request.getAttribute("ds");
    int moveListCount = 10;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "fromDate", Util.getDate()); // 기간 시작
	rxw.add(codeData, "toDate", Util.getDate()); // 기간 끝
	rxw.add(codeData, "pagesize", moveListCount);
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "cns_empnm_id", Util.getSessionParameterValue(request, "emp_nm", false)); //상담원 이름
	
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
	
	rxw.makeDataToList(ds, "acpnpathcd", "cicdnm", "cicodeval", "전체", "", codeData, "rmsCombo"); // 경로
	rxw.makeDataToList(ds, "dscttypecd", "cicdnm", "cicodeval", "전체", "", codeData, "typeCombo"); // 유형
	//rxw.makeDataToList(ds, "dscttypecd", "cicdnm", "cicodeval", "전체", "", codeData, "typeCombo"); // 상세유형
	
	rxw.flush(out);
%>