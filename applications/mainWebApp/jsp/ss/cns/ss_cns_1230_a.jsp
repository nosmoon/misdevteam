<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_cns_1230_a.jsp
* ��� : ����-������� �ʱ�ȭ��
* �ۼ����� : 2004-07-21
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-03
* ������ϸ� : ss_cns_1230_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "srchyyyy", Util.getYear()); // ��
	rxw.add(codeData, "srchmm", Util.getMonth()); // ��
	rxw.add(codeData, "srchdd", Util.getDay()); // ��
	
	rxw.flush(out);
%>
