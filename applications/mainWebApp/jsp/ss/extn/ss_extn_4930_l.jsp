<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4930_l.jsp
* ��� : ���Ȯ������Է�-�󼼸��
* �ۼ����� : 2016-06-17
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_EXTN_4930_LDataSet ds = (SS_SLS_EXTN_4930_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// ��ȸ ���.
  	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
	    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
