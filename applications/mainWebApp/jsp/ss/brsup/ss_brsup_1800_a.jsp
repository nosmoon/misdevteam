<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1800_a.jsp
* 기능 : 지국지원-빌링-수납수수료-기준-초기화면
* 작성일자 : 2004-02-23
* 작성자 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-04
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%--
1. 산정기준에 따른 수수료, 수수료율 필수 항목 달라짐
   1.1 건당 일 경우 - 수수료만 입력가능
   1.2 금액당일 경우 - 수수료율만 입력가능
2. 기타 필드를 두어 확장성을 고려 한다.
--%>
<%
	SS_L_RCPCMSBS_INITDataSet ds = (SS_L_RCPCMSBS_INITDataSet)request.getAttribute("ds");
    //int rcpcmsbsListCount = 20;	// 한 화면당 리스트 항목 수
    int rcpcmsbsListCount = 5000;
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int comboSet = rxw.add(root, "comboSet", "");
	
	rxw.add(comboSet, "pagesize", rcpcmsbsListCount);
	
	rxw.makeDataToList(ds, "clamtmthdcdcur", "cicdnm", "cicodeval", comboSet, "clamtmthdcdCombo");
	rxw.makeDataToList(ds, "calcbasiclsfcur", "cicdnm", "cicodeval", comboSet, "calcbasiclsfCombo");
	
	rxw.flush(out);
%>
