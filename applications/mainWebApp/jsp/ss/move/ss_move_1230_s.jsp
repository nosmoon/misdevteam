<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_move_1230_s.jsp
* 기능 : 이사독자
* 작성일자 : 
* 작성자 : 
---------------------------------------------------------------------------------------------------%>

<%
    SS_S_MOVM_RDR_COSTDataSet ds = (SS_S_MOVM_RDR_COSTDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	int accTemp = rxw.makeParentNode(root, "dataTemp");
	rxw.add(accTemp, "bonm", ds.getBonm()); //매체,부수
	rxw.add(accTemp, "bankcd", ds.getBankcd()); //매체,부수
	rxw.add(accTemp, "deps_persnm", ds.getDeps_persnm()); //매체,부수
	rxw.add(accTemp, "acctno", ds.getAcctno()); //매체,부수
	
	rxw.flush(out);
%>
