<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_4830_l.jsp
* 기능 : 기업확장 수입조회-상세목록
* 작성일자 : 2016-04-15
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_EXTN_4830_LDataSet ds = (SS_SLS_EXTN_4830_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// 조회 결과.
  	rxw.makeDataToBulk(ds, "curmodlist", acctTemp, "listGrid");
	    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
