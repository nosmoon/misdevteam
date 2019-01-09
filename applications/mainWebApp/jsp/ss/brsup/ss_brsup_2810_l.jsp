<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2810_l.jsp
* 기능 : 센터지원-판촉현황-요원관리-13개월실적
* 작성일자 : 2016-05-03
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_BRSUP_2810_LDataSet ds = (SS_SLS_BRSUP_2810_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// 조회 결과.
  	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
  	rxw.add(acctTemp, "t_caption", ds.getCaption());
	    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
