<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2701_l.jsp
* 기능 : 가상계좌 조회
* 작성일자 : 2016-07-26
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_BRSUP_2701_LDataSet ds = (SS_SLS_BRSUP_2701_LDataSet)request.getAttribute("ds");
        
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");
    
    rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
    
    rxw.add(resTemp,"rdr_no",ds.getRdr_no());
    rxw.add(resTemp,"rdrnm",ds.getRdrnm());
    rxw.add(resTemp,"medinm",ds.getMedinm());
    rxw.add(resTemp,"bonm",ds.getBonm());
    
	rxw.flush(out);
%>