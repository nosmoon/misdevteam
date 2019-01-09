<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_4830_l.jsp
* 기능 : 기업후원확장-구독배정내역(제휴)-상세
* 작성일자 : 2017-10-11
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_EXTN_5330_LDataSet ds = (SS_SLS_EXTN_5330_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// 조회 결과.
  	rxw.makeDataToBulk(ds, "curmodlist", acctTemp, "listGrid");
	    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
