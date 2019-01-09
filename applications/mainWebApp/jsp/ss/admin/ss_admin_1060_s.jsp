<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명	: ss_admin_1060_s.jsp
* 기능		: 관리자-판촉코드-상세
* 작성일자	: 2004-04-28
* 작성자	: 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-01
* 백업파일명 : ss_admin_1010_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SL_S_BNSITEMDataSet ds = (SL_S_BNSITEMDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToList(ds, "useclsfcur", "cicdnm", "cicodeval", "전체", "", resTemp, "gubunCombo"); // 구분
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>

