<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_move_1210_l.jsp
* ��� : ������� ���
* �ۼ����� : 2014-06-11
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_MOVM_RDR_COSTDataSet ds = (SS_L_MOVM_RDR_COSTDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    // ��ȸ ���.
    rxw.add(acctTemp, "closgb", ds.getClos());
    rxw.add(acctTemp, "closdt", ds.getClosdt());
    
    rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "listGrid");
   
	rxw.flush(out);
%>