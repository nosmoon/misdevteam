<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1410_s.jsp
* 기능 : 지국지원-상해보험-마감-상세
* 작성일자 : 2004-02-05
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-26
* 백업파일명 : ss_brsup_1310_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_INSRAPLCCLOSDataSet ds = (SS_S_INSRAPLCCLOSDataSet)request.getAttribute("ds");
    int mediListCount = 4;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>
