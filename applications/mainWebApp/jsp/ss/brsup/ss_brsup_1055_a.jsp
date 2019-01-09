<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1055_a.jsp
* 기능 : 지국지원-신문지원물품-신청-초기화면
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-03-25
* 백업파일명: ss_brsup_1055_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%--
1. 선택된 항목에 대해 신청수량을 수정한다.
2. 선택된 항목은 마감, 선택되지 되지 않은 항목은
--%>
<%
	SS_L_NWSPITEM_CDLSTDataSet ds = (SS_L_NWSPITEM_CDLSTDataSet)request.getAttribute("ds");
	String paramGbn = "##";
    applySession = true;	// 세션 적용 여부
    int listCount = 10;		// 화면당 항목수
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");

	rxw.add(codeData, "defaultDate", Util.getDate()); // 입력일자
	
	rxw.makeDataToList(ds, "curitemclsfcd", "cicdnm", "cicodeval", "전체", "", codeData, "itemGubunCombo"); // 물품구분
	
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
			
	rxw.flush(out);	
%>