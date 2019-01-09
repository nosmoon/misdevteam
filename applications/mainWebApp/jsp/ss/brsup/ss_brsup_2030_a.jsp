<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2030_a.jsp
* 기능 : 지국지원-판촉요원-요원관리-초기화면
* 작성일자 : 2004-03-05
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-03-30
* 백업파일명: ss_brsup_2030_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_INITDataSet ds = (SS_L_PROMSTAF_INITDataSet)request.getAttribute("ds");
    int promstafListCount = 5;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initData", "");

	//rxw.add(initData, "defaultDate", Util.getDate()); // 입력일자
	//rxw.add(codeData, "applySession", applySession); // applySession

	rxw.makeDataToList(ds, "curstafclsfcd", "cicdnm", "cicodeval", "전체", "", initData, "stafCombo"); // 요원구분
	rxw.makeDataToList(ds, "curcntrstatcd", "cicdnm", "cicodeval", "전체", "", initData, "statusCombo"); // 계약상태
			
	rxw.flush(out);	
%>
