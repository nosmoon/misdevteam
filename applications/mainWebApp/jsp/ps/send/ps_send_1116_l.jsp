<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_1116_l.jsp
* ��� : ��ü �ϰ��߼�Ȯ�� �߼۹���� ����ȸ
* �ۼ����� : 2004-02-27
* �ۼ��� : ���ȯ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 20090209
* ������ϸ� : ps_send_1116_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
    PS_L_SEND_MTHD_DTLSDataSet ds = (PS_L_SEND_MTHD_DTLSDataSet)request.getAttribute("ds");  // request dataset
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "detailGrid");
   	
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
%>
