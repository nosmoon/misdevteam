<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1430_u.jsp
* ��� : �������� �Խ��� �Ǹű� ����
* �ۼ����� : 2003-12-08
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-23
* ������ϸ� : ss_share_1430_u.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	// ������ �Է¿��� Ȯ��
	String chkresult = (String)request.getAttribute("result") ;
	String strMsg = "�����Ǿ����ϴ�";
	
	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);
	//rxw.add(root, "MsgData", strMsg);
	//System.out.println(rx.getXml());
	rxw.flush(out);	
%>
