<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_share_1111_s.jsp
* ��� : �������� ���� ������ ����
* �ۼ����� : 2004-02-23
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-12
* ������ϸ� : ps_share_1111_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
    PS_S_TACOM_SCHEDataSet ds = (PS_S_TACOM_SCHEDataSet)request.getAttribute("ds");  // request dataset
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "frdt", ds.getFrdt());
    rxw.add(acctTemp, "todt", ds.getTodt());
    rxw.add(acctTemp, "remk", ds.getRemk());
    rxw.add(acctTemp, "seq", ds.getSeq());
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>

