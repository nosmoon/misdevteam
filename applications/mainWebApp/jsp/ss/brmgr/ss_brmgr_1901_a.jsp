<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1901_a.jsp
* 기능 : 지국별발송처리 초기화면
* 작성일자 : 2004-03-02
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-04-09
* 백업파일명 : ss_brmgr_1901_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = "5";
    //  dataset 인스턴스 선언부분
    SS_S_BO_SEND_INITDataSet ds = (SS_S_BO_SEND_INITDataSet)request.getAttribute("ds");  // request dataset

    // 화면당 보여줄 Row수
    int li_per = 10;
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "defaultWeekDate", ds.getWeekyymmdd()); // 주말날짜
	rxw.add(codeData, "defaultWeekDay", ds.getWeekday()); // 주말요일
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", li_per);

	
	//부서(팀)목록 표시.
	int comboTeam = rxw.add(codeData, "teamlist" , "");
	writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	//rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//파트 목록 표시 - 임시
	int comboPart = rxw.add(codeData, "partlist_temp" , "");
	rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "전체", "");
	//rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//지역 목록 표시.
    int comboArea = rxw.add(codeData, "arealist_temp" , "");
	writeAreaOpt(session, rxw, comboArea, true);
	//rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.makeDataToList(ds, "medisercur", "mediser_view", "mediser_no", codeData, "mediCombo"); // 유형
	
	rxw.flush(out);
%>

