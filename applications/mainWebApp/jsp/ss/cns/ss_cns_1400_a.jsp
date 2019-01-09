<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_cns_1400_a.jsp
* 기능 	 	 : 상담원-자동이체가입신청(지로)
* 작성일자 	 : 2004-07-16
* 작성자 	 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-26
* 백업파일명 : ss_cns_1400_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    //	datacct 인스턴스 선언부분
    SS_L_SHFTAPLC_INIT_TMDataSet ds = (SS_L_SHFTAPLC_INIT_TMDataSet)request.getAttribute("ds");  // request datacct
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.makeDataToList(ds, "curbankcd", "cicdnm", "cicodeval", "전체", "", codeData, "bankCombo");//이체은행

	rxw.flush(out);
%>

