<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_2240_s.jsp
* ��� : �Ǹű�����-�ʱ�ȭ��-�Ǹű����� ���
* �ۼ����� : 2004-04-20
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	SS_L_ANNCSLSDataSet ds = (SS_L_ANNCSLSDataSet)request.getAttribute("ds");
	PrintWriter tickerOut = response.getWriter();

	StringBuffer message = new StringBuffer("");

	for(int i=0; i<ds.mainannclist.size(); i++){
		SS_L_ANNCSLSMAINANNCLISTRecord mainannclistRec = (SS_L_ANNCSLSMAINANNCLISTRecord)ds.mainannclist.get(i);
		message.append(mainannclistRec.seq);
		message.append('\u0002');
		message.append(mainannclistRec.annctitl);
		message.append('\u0002');
		message.append(mainannclistRec.annccont);
		message.append('\u0003');
	}
 	tickerOut.print(message.toString());
	tickerOut.close();
%>
