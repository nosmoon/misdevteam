<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2710_l.jsp
* 기능 : 가상계좌 통계
* 작성일자 : 2015-09-30
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_VACT_STATDataSet ds = (SS_L_VACT_STATDataSet)request.getAttribute("ds");
        
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.makeDataToBulk(ds, "curbolist", resTemp, "listGrid1");
    rxw.makeDataToBulk(ds, "curshftlist", resTemp, "listGrid2");
    rxw.makeDataToBulk(ds, "curbanklist", resTemp, "listGrid3");
    rxw.makeDataToBulk(ds, "curprintlist", resTemp, "listGrid4");
    
	rxw.flush(out);
%>