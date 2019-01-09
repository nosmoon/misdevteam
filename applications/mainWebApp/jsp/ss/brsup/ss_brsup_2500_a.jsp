<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2500_a.jsp
* 기능 : 통합정보지원시스템-판촉물재고현황-초기화면
* 작성일자 : 2009-04-29
* 작성자 : 김용욱
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BNSITEMINOUT_INITDataSet ds = (SS_L_BNSITEMINOUT_INITDataSet)request.getAttribute("ds");    
	
    applySession = true;		// 세션 적용 여부
    
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "fromDate", Util.getDate()); // 기간 시작
	rxw.add(codeData, "toDate", Util.getDate()); // 기간 끝
	
    rxw.add(codeData, "applySession", String.valueOf(applySession));

    rxw.makeDataToList(ds, "taslmlist", "cdnm", "cd", "전체", "", codeData, "promotionCombo");//물품구분
    rxw.flush(out);
%> 