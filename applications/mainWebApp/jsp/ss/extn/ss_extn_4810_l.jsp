<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4810_l.jsp
* ��� : ���Ȯ�� ������ȸ-���
* �ۼ����� : 2016-04-15
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_EXTN_4810_LDataSet ds = (SS_SLS_EXTN_4810_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// ��ȸ ���.
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

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
