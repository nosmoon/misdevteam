<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1778_i.jsp
* 기능 : 지국업무지원-Billing자동이체-청구관리-청구생성
* 작성일자 : 2004-04-21
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응
* 수정자	: 김용욱
* 수정일자	: 2009-03-10
* 백업파일명: ss_brsup_1778_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.setMessageAlert("추가되었습니다.");
	
	rxw.flush(out);
%>