<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1790_a.jsp
* 기능 : 지국업무지원-Billing자동이체-신청/해지통계-초기화면
* 작성일자 : 2005-01-11
* 작성자 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-24
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    //int moveListCount = 20;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;
    applySession = false;	// 세션 적용 여부

    SS_L_SHFTAPLCEXPY_STCS_INITDataSet ds = (SS_L_SHFTAPLCEXPY_STCS_INITDataSet)request.getAttribute("ds");
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "pagesize", moveListCount);
	rxw.add(codeData, "fr_dt", Util.addDate(Util.getDate(),-365));
	rxw.add(codeData, "to_dt", Util.getDate());
	
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "ciymgbcd", "전체", "", codeData, "shiftClsfCombo");
	
	rxw.flush(out);
%>
