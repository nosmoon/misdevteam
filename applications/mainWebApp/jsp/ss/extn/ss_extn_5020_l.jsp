<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_5020_l.jsp
* 기능 : 확장자배정-상세목록
* 작성일자 : 2016-06-20
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_EXTN_5020_LDataSet ds = (SS_SLS_EXTN_5020_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// 조회 결과.
  	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
	
	rxw.add(acctTemp,"yymm",ds.getYymm());
	rxw.add(acctTemp,"dncompnm",ds.getDncompnm());
	rxw.add(acctTemp,"adv_nm",ds.getAdv_nm());
	rxw.add(acctTemp,"medi_qty",ds.getMedi_qty());
	rxw.add(acctTemp,"mob_qty",ds.getMob_qty());
	rxw.add(acctTemp,"regdt",ds.getRegdt());
	rxw.add(acctTemp,"regno",ds.getRegno());
	
	rxw.add(acctTemp,"sum_medi_qty",ds.getSum_medi_qty());
	rxw.add(acctTemp,"sum_mob_qty",ds.getSum_mob_qty());
	    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
