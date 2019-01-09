<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_2010_l.jsp
* 기능 : 불편통계 조회
* 작성일자 : 2015-10-12
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_DSCTSTATDataSet ds = (SS_L_RDR_DSCTSTATDataSet)request.getAttribute("ds");
        
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.makeDataToBulk(ds, "curbolist", resTemp, "listGrid1");
    rxw.makeDataToBulk(ds, "curdtlist", resTemp, "listGrid2");
    rxw.makeDataToBulk(ds, "curcnfmlist", resTemp, "listGrid3");
    
	rxw.flush(out);
%>