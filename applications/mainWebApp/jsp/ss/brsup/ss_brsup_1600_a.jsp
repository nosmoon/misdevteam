<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1600_a.jsp
* 기능 : 지국지원-Billing-지로EDI수납관리
* 작성일자 : 2004-03-06
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-04-17
* 백업파일명: ss_brsup_1600_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EDI_INITDataSet ds = (SS_L_EDI_INITDataSet)request.getAttribute("ds");

    int moveListCount = 5;	// 한 화면당 리스트 항목 수
    int moveListCount2 = 6;	// 한 화면당 리스트 항목 수
    applySession = false;	// 세션 적용 여부
    
    //String uid			= request.getHeader("UID")   		== null ? "" : Util.Uni2Ksc(request.getHeader("UID")); 		 	  // 아이디
    String uid = session.getAttribute("uid").toString();
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "initData", "");
	rxw.makeDataToList(ds, "jycur", "areanm", "areacd", "전체", "", codeData, "areaCombo"); // 처리
	
	rxw.add(codeData, "defaultDate", Util.getDate()); // 입력일자
	rxw.add(codeData, "loginUserID", uid); // 로그인 유저 아이디
	
	/*//부서(팀)목록 표시.
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
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");*/
			
	rxw.flush(out);	
%>
