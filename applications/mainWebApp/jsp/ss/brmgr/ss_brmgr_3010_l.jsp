<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : 
* 기능 : 
* 작성일자 : 2017-02-23
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_BRMGR_3010_LDataSet ds = (SS_SLS_BRMGR_3010_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// 조회 결과.
  	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
  	rxw.add(acctTemp, "closyn", ds.getClosyn());
	    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
