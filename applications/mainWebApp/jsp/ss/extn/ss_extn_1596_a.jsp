<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1596_a.jsp
* 기능 : 확장현황-지국확장이사통계-초기화면
* 작성일자 : 2003-12-26
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-03-17
* 백업파일명: ss_extn_1596_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EXTN_MOVM_INITDataSet ds = (SS_L_EXTN_MOVM_INITDataSet)request.getAttribute("ds");
	int extnmovmListCount = 10;
	String paramGbn = "##";
    applySession = true;	// 세션 적용 여부
    // 공통코드 중 판매국 사용 매체코드가 ds에 존재하고 이중 지국확장이사통계에서 관리하고자 하는 매체코드 목록을 아래에 정의한다.
    String[] medicdList = {"110","130","210","220","230","240","270","420","610"};

	String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// 업무구분코드(판매국장,지원부장,영업부장은 목록 조회 옵션을 보여준다.)
	
	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "defalutDate", Util.getDate());
	rxw.add(codeData, "jobCode", jobcd);
	
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
	
	rxw.flush(out);
%>

