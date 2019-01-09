<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_health_1100_a.jsp
* 기능 :  헬스조선-워크북마감-초기화면
* 작성일자 : 2015-1-5
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%  	
    applySession = false;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	rxw.add(codeData, "frdt", Util.addMonth(Util.getDate(),-1)); // 기간 시작
	rxw.add(codeData, "todt", Util.getDate()); // 기간 끝
	
	rxw.flush(out);
%>