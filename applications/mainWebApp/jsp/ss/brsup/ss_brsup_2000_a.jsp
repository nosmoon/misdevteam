<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2000_a.jsp
* 기능 : 지국지원-판촉요원-IS요원-초기화면
* 작성일자 : 2004-03-05
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : MC 추가
* 수정자 : 김대섭
* 수정일자 : 20041220
* 백업파일명 : 없음(추가)
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역: 사이버요원 검색 추가
* 수정자 : 김대섭
* 수정일자 : 2006-02-03
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-03-30
* 백업파일명: ss_brsup_2000_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_INIT_ISDataSet ds = (SS_L_PROMSTAF_INIT_ISDataSet)request.getAttribute("ds");
    int promstafListCount = 5;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initData", "");

	rxw.add(initData, "defaultDate", Util.getDate()); // 입력일자
	//rxw.add(codeData, "applySession", applySession); // applySession
	
	rxw.makeDataToList(ds, "curcntrstatcd", "cicdnm", "cicodeval", "전체", "", initData, "statusCombo"); // 계약상태
	rxw.makeDataToList(ds, "curacctbank", "cicdnm", "cicodeval", "선택", "", initData, "bankCombo"); // 은행명
			
	rxw.flush(out);	
%>

