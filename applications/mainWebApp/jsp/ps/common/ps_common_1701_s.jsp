<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_common_1701_s.jsp
* ��� : ���ڹ�ȣ�� ���������˻�(BOCD)
* �ۼ����� : 2004-05-13
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-27
* ������ϸ� : ps_common_1701_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
   //  ���� Set���ִ� function��
   String setFunction = request.getParameter("setFunction") ;
    // dataset �ν��Ͻ� ����κ�
    PS_S_RDRINFODataSet ds = (PS_S_RDRINFODataSet)request.getAttribute("ds");  // request dataset
	
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    rxw.makeDataToBulk(ds, acctTemp, "detailGrid");
   	
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
%>

