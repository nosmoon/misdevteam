<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_2126_s.jsp
* ��� : ���ʽ��� �ݼ۳��� ��ȸ ��ȭ��
* �ۼ����� : 2003-12-08
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-18
* ������ϸ� : ps_send_2126_s.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
	String retnseq = request.getParameter("retnseq");
    // dataset �ν��Ͻ� ����κ�
    PS_S_SEND_RETN_DTLDataSet ds = (PS_S_SEND_RETN_DTLDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	rxw.makeDataToList(ds, "bns_bookcdcur", "bns_booknm", "bns_bookcd", "����", "", acctTemp, "bookCombo"); // �ݼۺ��ʽ���
	
	// ��ȸ ���.
	rxw.makeDataToBulk(ds, acctTemp, "detailGrid");
		
	rxw.flush(out);
	
	// data�� ���� ��� ó��. �߰� �ʿ�.
%>
