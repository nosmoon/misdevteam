<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명		: ss_admin_1084_s.jsp
* 기능		: 계정코드 조회(상세)
* 작성일자	: 2003-12-29
* 작성자		: 노상현
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-01
* 백업파일명 : ss_admin_1010_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	// 	dataset 인스턴스 선언부분
	SS_S_ACCTCDDataSet ds = (SS_S_ACCTCDDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>
