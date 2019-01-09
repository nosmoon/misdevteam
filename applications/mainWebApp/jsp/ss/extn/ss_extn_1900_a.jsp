<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1900_a.jsp
* 기능 : 확장현황-신청현황-초기화면
* 작성일자 : 2003-11-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-03-16
* 백업파일명: ss_extn_1900_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXTN_RES_INITDataSet ds = (SS_L_EXTN_RES_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	rxw.add(codeData, "defaultFrom", Util.getDate()); // 기간 from 
	rxw.add(codeData, "defaultTo", Util.getDate()); // 기간 to
		
	//rxw.makeDataToList(ds, "cursubscnfmstatcd", "cicdnm", "cicodeval", "전체", "", codeData, "errorCombo"); // 오류
	
	//부서(팀)목록 표시.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//파트 목록 표시 - 임시
	//rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//지역 목록 표시.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.flush(out);
%>

