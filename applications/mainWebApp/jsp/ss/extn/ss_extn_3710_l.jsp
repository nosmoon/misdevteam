<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_3710_l.jsp
* ��� : 1����ݹ̸� ���� ��ȸ-���
* �ۼ����� : 2015-11-10
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_EXTN_3710_LDataSet ds = (SS_SLS_EXTN_3710_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// ��ȸ ���.
  	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
	    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
