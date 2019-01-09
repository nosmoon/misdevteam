<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_move_1010_l.jsp
* 기능 : 이마상담-이마TM확장
* 작성일자 : 2013-5-8
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_CAMP_TM_EXTNDataSet ds = (SS_L_CAMP_TM_EXTNDataSet)request.getAttribute("ds");
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.makeParentNode(root, "resTemp");
	
	// 조회 결과.
	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
    
	rxw.flush(out);
%>