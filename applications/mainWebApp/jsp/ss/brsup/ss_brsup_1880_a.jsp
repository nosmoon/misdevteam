<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1880_a.jsp
* 기능 : 지국지원-빌링-지로수납현황-초기화면
* 작성일자 : 2007-03-20
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-27
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_GIRORECP_INITDataSet ds = (SS_L_GIRORECP_INITDataSet)request.getAttribute("ds");
    //int rcpListCount = 20;	// 한 화면당 리스트 항목 수
    int rcpListCount = 5000;
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", rcpListCount);
	rxw.add(codeData, "fromdt", Util.getDate());
	rxw.add(codeData, "todt", Util.getDate());
	
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
	
	//편의점 목록
	rxw.makeDataToList(ds, "cvsinfocur", "cicdnm", "cicodeval", "전체", "", codeData, "recpbankcdCombo");
	
	rxw.flush(out);
%>