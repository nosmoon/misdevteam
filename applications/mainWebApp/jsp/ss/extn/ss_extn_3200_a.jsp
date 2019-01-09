<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_3000_a.jsp
* 기능 : 중지방어관리-초기화면
* 작성일자 : 2015-02-27
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXCD_INITDataSet ds = (SS_L_EXCD_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
			
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");

	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.makeDataToList(ds, "extncdusagecur", "cicdnm", "cicodeval", "전체", "", codeData, "extncdusage"); // 경로
	rxw.makeDataToList(ds, "resitypecdcur", "cicdnm", "cicodeval", "전체", "", codeData, "resitypecd");
	
	rxw.flush(out);
%>

