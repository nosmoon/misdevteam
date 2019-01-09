<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1003_l.jsp
* 기능 : 관리자-공통코드-코드구분 목록
* 작성일자 : 2004-03-09
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-01
* 백업파일명 : ss_admin_1003_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	CO_L_CDV_CICDGBDataSet ds = (CO_L_CDV_CICDGBDataSet)request.getAttribute("ds");
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initTemp = rxw.add(root, "initTemp", "");
	       
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "cicdgb", "전체", "", initTemp, "codeGubunCombo");
	rxw.flush(out);
%>