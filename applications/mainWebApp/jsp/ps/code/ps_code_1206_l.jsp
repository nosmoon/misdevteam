<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_code_1206_l.jsp
* ��� : ��ü �ܰ����� ����Ʈ
* �ۼ����� : 2004-01-12
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-12
* ������ϸ� : ps_code_1206_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // ȭ�鿡 ������ ���μ�
    String records_per_page =   request.getParameter("records_per_page");
    // dataset �ν��Ͻ� ����κ�
    PS_L_MIDI_UPRCDataSet ds = (PS_L_MIDI_UPRCDataSet)request.getAttribute("ds");  // request dataset
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