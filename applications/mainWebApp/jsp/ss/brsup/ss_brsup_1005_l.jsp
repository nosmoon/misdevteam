<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1005_l.jsp
* 기능 : 지국지원-신문지원물품-물품-목록
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-25
* 백업파일명 : ss_brsup_1005_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%--
request로부터 form_name, type, itemclsf 값을 얻어서 물품목록 select를 각각 구성한다.
	<input name="form_name" type="hidden" value ="">				<!-- form 이름 -->
	<input name="type" type="hidden" value ="">			           	<!-- 전체포함여부 (Y:포함, N:미포함)-->

--%>
<%
	SS_L_NWSPITEM_CLSFDataSet ds = (SS_L_NWSPITEM_CLSFDataSet)request.getAttribute("ds");
	String form_name = Util.checkString(request.getParameter("form_name"));		//form 이름
	String type = Util.checkString(request.getParameter("type"));				//전체포함여부 (Y:포함, N:미포함)
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initTemp = rxw.add(root, "initTemp", "");
	       
	rxw.makeDataToList(ds, "curcommlist", "itemnm", "itemcd", "전체", "", initTemp, "itemCombo");
	rxw.flush(out);
%>