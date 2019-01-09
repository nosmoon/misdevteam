<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_5210_l.jsp
* 기능 : 기업후원확장-직원수당 지급처리
* 작성일자 : 2016-10-05
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_EXTN_5210_LDataSet ds = (SS_SLS_EXTN_5210_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// 조회 결과.
  	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
  	rxw.add(acctTemp,"magam",ds.getMagam());
  	rxw.add(acctTemp,"medi_amt",ds.getMedi_amt());
  	rxw.add(acctTemp,"mob_amt",ds.getMob_amt());
  	rxw.add(acctTemp,"tot_amt",ds.getTot_amt());
  	rxw.add(acctTemp,"tax1",ds.getTax1());
  	rxw.add(acctTemp,"tax2",ds.getTax2());
  	rxw.add(acctTemp,"tax3",ds.getTax3());
	    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
