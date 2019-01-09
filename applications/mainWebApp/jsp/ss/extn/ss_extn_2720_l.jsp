<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2720_l.jsp
* 기능 : 확장-사원구독 관리
* 작성일자 : 2013-3-6
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_EMP_NWSPRDR_RDRDataSet ds = (SS_L_EMP_NWSPRDR_RDRDataSet)request.getAttribute("ds");
        
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.makeDataToBulk(ds, "curempnwsp_rdrlist", resTemp, "listGrid_rdr");
    
	rxw.flush(out);
%>