<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1025_a.jsp
* 기능 : 지국지원-신문지원물품-입고-초기화면
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-03-25
* 백업파일명: ss_brsup_1025_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%--
1. 검색 화면과 상세 화면에 물품구분, 물품코드가 동시에 관리되고 각각은 전체, 선택 등 화면에 따라 서로 다르게 처리되어야 한다.
2. 검색, 상세 화면에 초기값을 별도로 처리하기 위해 default_search_form, default_detail_form을 가진다.
3. 상세화면에서는 물품코드가 설정되어야 하고, 등록시에는 초기에 물품코드가 존재하지 않으므로 화면에서 상세를 보여줄 때 텍스트로 보여준다.
4. 등록,수정,삭제는 별도의 form을 이용한다.(access_form)
5. 수정,삭제시는 access_form의 key(입고번호,입고일자,물품코드) 항목을 access_form으로 부터 확인한다.
--%>
<%
	SS_L_NWSPITEM_CDLSTDataSet ds = (SS_L_NWSPITEM_CDLSTDataSet)request.getAttribute("ds");
    int nwspitemewhListCount = 10;	// 한 화면당 리스트 항목 수
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	rxw.add(initData, "defaultDate", Util.getDate()); // 오늘날짜
	
	rxw.makeDataToList(ds, "curitemclsfcd", "cicdnm", "cicodeval", "전체", "", initData, "itemGubunCombo"); // 물품구분
	rxw.makeDataToList(ds, "curcostclsfcd", "cicdnm", "cicodeval", "전체", "", initData, "costCombo"); // 비용청구
	rxw.makeDataToList(ds, "cursendclsfcd", "cicdnm", "cicodeval", "전체", "", initData, "sendCombo"); // 발송
		
	rxw.flush(out);	
%>

