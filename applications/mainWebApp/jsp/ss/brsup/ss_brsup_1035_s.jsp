<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1035_s.jsp
* 기능 : 지국지원-신문지원물품-입고-상세
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-25
* 백업파일명 : ss_brsup_1035_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%--
1. 입고일자, 입고번호, 물품코드 값은 request로부터 얻는다.
--%>
<%
	SS_S_NWSPITEMEWHDataSet ds = (SS_S_NWSPITEMEWHDataSet)request.getAttribute("ds");
	String ewhdt = request.getParameter("ewhdt");
	String ewhno = request.getParameter("ewhno");
	String itemcd = request.getParameter("itemcd");
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>