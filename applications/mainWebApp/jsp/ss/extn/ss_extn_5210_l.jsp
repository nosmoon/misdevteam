<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_5210_l.jsp
* ��� : ����Ŀ�Ȯ��-�������� ����ó��
* �ۼ����� : 2016-10-05
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_EXTN_5210_LDataSet ds = (SS_SLS_EXTN_5210_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// ��ȸ ���.
  	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
  	rxw.add(acctTemp,"magam",ds.getMagam());
  	rxw.add(acctTemp,"medi_amt",ds.getMedi_amt());
  	rxw.add(acctTemp,"mob_amt",ds.getMob_amt());
  	rxw.add(acctTemp,"tot_amt",ds.getTot_amt());
  	rxw.add(acctTemp,"tax1",ds.getTax1());
  	rxw.add(acctTemp,"tax2",ds.getTax2());
  	rxw.add(acctTemp,"tax3",ds.getTax3());
	    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
