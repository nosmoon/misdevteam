<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2920_S.jsp
* ��� : ��������-������Ȳ-�������-�������������-��ȸ-��(�˾�)
* �ۼ����� : 2016-08-11
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
	SS_SLS_BRSUP_2920_SDataSet ds = (SS_SLS_BRSUP_2920_SDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();

    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

	// ��ȸ ���.
  	rxw.makeDataToBulk(ds, "staflist", acctTemp, "listGrid");

	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.

    // page ó��. �߰� �ʿ�.
%>


