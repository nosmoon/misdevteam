<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4410_l.jsp
* ��� : ����ó �ߺ� ����-���
* �ۼ����� : 2015-12-11
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_EXTN_4410_LDataSet ds = (SS_SLS_EXTN_4410_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// ��ȸ ���.
  	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
	    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>