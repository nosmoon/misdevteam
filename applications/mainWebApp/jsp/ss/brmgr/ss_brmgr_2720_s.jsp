<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_5020_l.jsp
* 기능 : 확장자배정-상세목록
* 작성일자 : 2016-06-20
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_BRMGR_2720_SDataSet ds = (SS_SLS_BRMGR_2720_SDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	rxw.add(acctTemp,"yymm",ds.getYymm());
	rxw.add(acctTemp,"deptcd",ds.getDeptcd());
	rxw.add(acctTemp,"clsf",ds.getClsf());
	rxw.add(acctTemp,"point_min",ds.getPoint_min());
	rxw.add(acctTemp,"point_max",ds.getPoint_max());
	    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
