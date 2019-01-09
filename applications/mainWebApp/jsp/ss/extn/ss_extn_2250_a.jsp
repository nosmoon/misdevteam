<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2250_a.jsp
* 기능 : 확장현황-지국중지마감-초기화면
* 작성일자 : 2009-07-10
* 작성자 : 김용욱
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	:
* 수정자	: 
* 수정일자	:
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_TASLM_BOSUSPCLOS_INITDataSet ds = (SS_L_TASLM_BOSUSPCLOS_INITDataSet)request.getAttribute("ds");
	int extnmovmListCount = 10;

	String frdt = request.getParameter("frdt");
	
    applySession = true;	// 세션 적용 여부

	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));

	if(frdt.equals("")){
		rxw.add(codeData, "defalutDate", Util.getYear() + Util.getMonth());
	} else {
		rxw.add(codeData, "defalutDate", frdt);
	}
	
	//rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "전체", "", codeData, "mcCheck"); // 오류
	
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
	
	rxw.makeDataToList(ds, "curtype1", "name", "code", "전체", "", codeData, "type1"); // 확장유형1
	rxw.makeDataToList(ds, "curtype2", "name", "code", "전체", "", codeData, "type2"); // 확장유형2 
	rxw.makeDataToList(ds, "curresitype", "name", "code", "전체", "", codeData, "resitype"); // 주거형태 
	rxw.makeDataToList(ds, "aplcpath", "name", "code", "전체", "", codeData, "aplcpath"); // 신청경로
	rxw.makeDataToList(ds, "suspresncd", "name", "code", "전체", "", codeData, "suspresncd"); // 중지사유
	rxw.flush(out);
%>

