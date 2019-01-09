<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1410_s.jsp
* 기능 : 관리자-작업-등록-상세
* 작성일자 : 2004-04-09
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-01
* 백업파일명 : ss_admin_1400_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_WRKDataSet ds = (SS_S_WRKDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>
