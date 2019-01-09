<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brsup_2150_a.jsp
* 기능 	 	 : 지국지원-전단현황초기화면
* 작성일자 	 : 2004-04-20
* 작성자 	 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-03-30
* 백업파일명: ss_brsup_2150_a.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_COMMDEPTCDDataSet ds = (SS_L_COMMDEPTCDDataSet)request.getAttribute("ds");
    int isleafListCount = 20;	// 한 화면당 리스트 항목 수
    applySession = true;		// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "defaultDate", Util.getDate()); // 입력일자
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	//부서(팀)목록 표시.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curcommlist", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//파트 목록 표시 - 임시
	//rxw.makeEmpytList(codeData, "partlist_temp", "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//지역 목록 표시.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	//지국 목록 표시
	rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "전체", "");
	
	rxw.flush(out);	
%>

