<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_1411_l.jsp
* ��� : ��ü �ϰ��߼� �߼�ó�� �߼۹���� ����ȸ
* �ۼ����� : 2004-03-03
* �ۼ��� : ���ȯ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 20090209
* ������ϸ� : ps_send_1411_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = request.getParameter("records_per_page");
    // dataset �ν��Ͻ� ����κ�
    PS_L_SEND_DD_PROC_DTLSDataSet ds = (PS_L_SEND_DD_PROC_DTLSDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "detailGrid");
   	
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>

