<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_1206_l.jsp
* ��� : ��ü �ϰ��߼� �߼�ó�� ��ȸȭ��
* �ۼ����� : 2004-03-03
* �ۼ��� : ���ȯ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 20090210
* ������ϸ� : ps_send_2356_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
    PS_L_BO_SEND_LISTDataSet ds = (PS_L_BO_SEND_LISTDataSet)request.getAttribute("ds");  // request dataset
	// ���纰Ȯ�� ����Ʈ ���μ� ����
    String records_per_page = request.getParameter("records_per_page");

	int no_data_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
            
    //��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
   	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "sendInfoGrid");
    
	rxw.flush(out);

    //data�� ���� ��� ó��. �߰� �ʿ�.
        
    //page ó��. �߰� �ʿ�.
%>
