<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : 
* ��� : 
* �ۼ����� : 2017-02-23
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_BRMGR_3010_LDataSet ds = (SS_SLS_BRMGR_3010_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// ��ȸ ���.
  	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
  	rxw.add(acctTemp, "closyn", ds.getClosyn());
	    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
