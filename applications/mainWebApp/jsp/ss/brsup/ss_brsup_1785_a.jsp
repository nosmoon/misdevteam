<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1785_a.jsp
* 기능 : 지국업무지원-Billing자동이체-신청통계-초기화면
* 작성일자 : 2004-04-26
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-24
* 백업파일명:

---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: 매체코드리스트 추가
* 수정자	: 장선희
* 수정일자	: 2017-10-30
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_APLC_MANG_INITDataSet ds = (SS_L_APLC_MANG_INITDataSet)request.getAttribute("ds");

	//int moveListCount = 20;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;
    applySession = false;	// 세션 적용 여부

  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");

	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", moveListCount);
	rxw.add(codeData, "fr_dt", Util.getDate());
	rxw.add(codeData, "to_dt", Util.getDate());

	//이체구분 (이체구분 리스트가 나오지 않아서 확인해보니 wb에 ds값을 넘겨주는 부분이 없어져서 null이 넘겨지고 있었음. 수정완료.)
	rxw.makeDataToList(ds, "shftclsf", "cicdnm", "cicodeval", "전체", "", codeData, "shiftClsfCombo");

	//매체구분
	rxw.makeDataToList(ds, "medicur", "cicdnm", "cicodeval", "전체", "", codeData, "mediCurCombo");

	rxw.flush(out);
%>
