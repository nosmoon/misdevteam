<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_move_1210_l.jsp
* 기능 : 이전비용 목록
* 작성일자 : 2014-06-11
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_MOVM_RDR_COSTDataSet ds = (SS_L_MOVM_RDR_COSTDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    // 조회 결과.
    rxw.add(acctTemp, "closgb", ds.getClos());
    rxw.add(acctTemp, "closdt", ds.getClosdt());
    
    rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
   
	rxw.flush(out);
%>