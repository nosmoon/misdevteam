<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_move_1230_s.jsp
* ��� : �̻絶��
* �ۼ����� : 
* �ۼ��� : 
---------------------------------------------------------------------------------------------------%>

<%
    SS_S_MOVM_RDR_COSTDataSet ds = (SS_S_MOVM_RDR_COSTDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	int accTemp = rxw.makeParentNode(root, "dataTemp");
	rxw.add(accTemp, "bonm", ds.getBonm()); //��ü,�μ�
	rxw.add(accTemp, "bankcd", ds.getBankcd()); //��ü,�μ�
	rxw.add(accTemp, "deps_persnm", ds.getDeps_persnm()); //��ü,�μ�
	rxw.add(accTemp, "acctno", ds.getAcctno()); //��ü,�μ�
	
	rxw.flush(out);
%>
