<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_1706_l.jsp
* ��� : ���ʽ��Ϲ߼� �ϰ�Ȯ�� ����Ʈ
* �ۼ����� : 2004-02-25
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 20090209
* ������ϸ� : ps_send_1806_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // ȭ�鿡 ������ ���μ�
    String records_per_page =   "10";

    // dataset �ν��Ͻ� ����κ�
    PS_L_SEND_BNSBK_CONDataSet ds = (PS_L_SEND_BNSBK_CONDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();

	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
   	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "sendInfoGrid");
    
	rxw.flush(out);

    //data�� ���� ��� ó��. �߰� �ʿ�.
        
    //page ó��. �߰� �ʿ�.
%>
