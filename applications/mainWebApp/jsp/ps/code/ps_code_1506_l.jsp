<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_code_1506_l.jsp
* ��� : ����������°��� ����Ʈ
* �ۼ����� : 2006--11-10
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 20090211
* ������ϸ� : ps_code_1406_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // ȭ�鿡 ������ ���μ�
    String records_per_page =   request.getParameter("records_per_page");
    // dataset �ν��Ͻ� ����κ�
    PS_L_BOACCTDataSet ds = (PS_L_BOACCTDataSet)request.getAttribute("ds");  // request dataset
	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
   	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "infoGrid");
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>

