<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4830_l.jsp
* ��� : ����Ŀ�Ȯ��-������������(����)-��
* �ۼ����� : 2017-10-11
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_EXTN_5330_LDataSet ds = (SS_SLS_EXTN_5330_LDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// ��ȸ ���.
  	rxw.makeDataToBulk(ds, "curmodlist", acctTemp, "listGrid");
	    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
