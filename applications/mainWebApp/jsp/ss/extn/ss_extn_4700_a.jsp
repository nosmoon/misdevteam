<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_4700_a.jsp
* 기능 : 기업확장 수입조회-초기화면
* 작성일자 : 2016-04-16
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "fromDate", Util.getDate()); // 기간 시작
	rxw.add(codeData, "toDate", Util.getDate()); // 기간 끝	
	
	rxw.add(codeData, "uid", String.valueOf( session.getAttribute("uid")));

	rxw.flush(out);
%>

