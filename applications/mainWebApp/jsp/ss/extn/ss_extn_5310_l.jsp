<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_5310_l.jsp
* 기능 : 기업후원확장-구독배정내역(제휴)-조회
* 작성일자 : 2017-10-11
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_EXTN_5310_LDataSet ds = (SS_SLS_EXTN_5310_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// 조회 결과.
  	rxw.makeDataToBulk(ds, "curmodlist", acctTemp, "listGrid");
	
  	rxw.add(acctTemp, "closyn", ds.getClosyn());
  	rxw.add(acctTemp, "closdt", ds.getClosdt());
  	rxw.add(acctTemp, "paydt", ds.getPaydt());
  	
  	rxw.add(acctTemp, "cnfm_qty", ds.getCnfm_qty());
  	rxw.add(acctTemp, "cnfm_amt", ds.getCnfm_amt());
  	rxw.add(acctTemp, "nocnfm_qty", ds.getNocnfm_qty());
  	rxw.add(acctTemp, "nocnfm_amt", ds.getNocnfm_amt());
  	rxw.add(acctTemp, "meda_amt", ds.getMeda_amt());
  	rxw.add(acctTemp, "set_amt", ds.getSet_amt());
  	rxw.add(acctTemp, "pay_amt", ds.getPay_amt());
  	rxw.add(acctTemp, "nopay_amt", ds.getNopay_amt());  	
	    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
