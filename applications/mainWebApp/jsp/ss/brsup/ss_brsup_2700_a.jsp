<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2700_a.jsp
* 기능 : 가상계좌 통계
* 작성일자 : 2015-09-30
* 작성자 : 심정보

---------------------------------------------------------------------------------------------------%>
<%
	SS_L_VACT_STAT_INITDataSet ds = (SS_L_VACT_STAT_INITDataSet)request.getAttribute("ds");

    //int moveListCount = 20;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;
    applySession = false;	// 세션 적용 여부
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "fr_dt", Util.getDate());
	rxw.add(codeData, "to_dt", Util.getDate());
	
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "전체", "", codeData, "mediCombo");
	rxw.makeDataToList(ds, "curbankcd", "cicdnm", "cicodeval", "전체", "", codeData, "bankCombo");
	
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");	
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.flush(out);
%>