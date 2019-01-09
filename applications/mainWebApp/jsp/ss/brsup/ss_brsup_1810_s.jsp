<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1810_s.jsp
* 기능 : 지국지원-빌링-수납수수료-기준-상세
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
1. 수수료 코드 값은 request로부터 얻는다.
--%>
<%
	SS_S_RCPCMSBSDataSet ds = (SS_S_RCPCMSBSDataSet)request.getAttribute("ds");
	String comscd = Util.checkString(request.getParameter("comscd"));
	
	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "comscd", comscd);
	
	rxw.makeDataToBulk(ds, resTemp, "detailForm");
	rxw.makeDataToList(ds, "clamtmthdcdcur", "cicdnm", "cicodeval", resTemp, "clamtmthdcdCombo");
	rxw.makeDataToList(ds, "calcbasiclsfcur", "cicdnm", "cicodeval", resTemp, "calcbasiclsfCombo");
	
	rxw.flush(out);
%>
