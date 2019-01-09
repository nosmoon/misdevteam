<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_cns_1305_l.jsp
* 기능 : 상담원-VacationStop-휴가지배달지역 목록
* 작성일자 : 2004-07-15
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-09
* 백업파일명 : ss_cns_1305_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_VS_AREANMDataSet ds = (SL_L_VS_AREANMDataSet)request.getAttribute("ds");

	//TrustForm 처리 시작
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int dataTemp = rxw.add(root, "dataTemp", "");
	
	rxw.makeDataToList(ds, "curcommlist", "vaca_areanm", "vaca_areacd", "선택", "", dataTemp, "vacaCombo"); // 휴가지권역
	
	rxw.flush(out);	
%>
