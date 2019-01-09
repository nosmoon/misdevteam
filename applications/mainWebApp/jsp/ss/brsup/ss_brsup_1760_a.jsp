<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1760_a.jsp
* 기능 : 지국업무지원-Billing자동이체-납부자관리-초기화면
* 작성일자 : 2004-04-08
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-05
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_SHFT_PYMT_INITDataSet ds = (SS_L_SHFT_PYMT_INITDataSet)request.getAttribute("ds");
    applySession = false;	// 세션 적용 여부
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToList(ds, "bankcur", "cicdnm", "cicodeval", "선택", "", resTemp, "bankCombo");
	rxw.makeDataToList(ds, "cardcur", "cicdnm", "cicodeval", "선택", "", resTemp, "cardCombo");
	
	rxw.flush(out);
%>
