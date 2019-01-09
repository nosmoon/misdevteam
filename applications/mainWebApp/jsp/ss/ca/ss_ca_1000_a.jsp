<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_ca_1000_a.jsp
* 기능 : 사이버센터-사이버센터장-초기화면
* 작성일자 : 2005-04-18
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-04-02
* 백업파일명: ss_ca_1000_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_CA_HEAD_INITDataSet ds = (SS_L_CA_HEAD_INITDataSet)request.getAttribute("ds");
    int listCount = 5;	// 한 화면당 리스트 항목 수
    applySession = false;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	//rxw.add(initData, "defaultDate", Util.getDate()); // 오늘날짜
	
	rxw.makeDataToList(ds, "curcntrstatcd", "cicdnm", "cicodeval", "전체", "", initData, "statusCombo"); // 계약상태
	rxw.makeDataToList(ds, "curcntrstatcd", "cicdnm", "cicodeval", initData, "statusCombo1"); // 계약상태
	rxw.makeDataToList(ds, "curacctbank", "cicdnm", "cicodeval", initData, "bankCombo"); // 은행명
		
	rxw.flush(out);	
%>