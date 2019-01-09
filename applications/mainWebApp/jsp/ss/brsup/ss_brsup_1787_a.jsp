<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1760_a.jsp
* 기능 : 지국업무지원-Billing자동이체-납부자관리-초기화면
* 작성일자 : 2004-04-08
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-03
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EDI_INITDataSet ds = (SS_L_EDI_INITDataSet)request.getAttribute("ds");

    //int moveListCount = 20;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;
    applySession = false;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "pagesize", moveListCount);
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "base_mon", Util.getDate().substring(0, 6));
	
	//부서(팀)목록 표시.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curcommlist", "boksnm", "deptcd");
	//rxw.addSelectItem(comboTeam, "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//파트 목록 표시 - 임시
	//int comboPart = rxw.add(codeData, "partlist_temp" , "");
	//int comboPart = rxw.add(codeData, "partlist" , "");
	//rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//지역 목록 표시.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	//rxw.makeDataToList(ds, "jycur", "areanm", "areacd", "전체", "", codeData, "arealist", "record", "area_nm", "area_cd");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.flush(out);
%>
