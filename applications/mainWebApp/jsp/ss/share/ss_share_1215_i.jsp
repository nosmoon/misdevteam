<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_share_1201_i.jsp
* ��� : �������� �ǽð� �������� ���
* �ۼ����� : 2003-12-19
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-03-16
* ������ϸ� : ss_share_1201_i.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ������
* �������� : 2009-04-14
* ������ϸ� : ss_share_1215_i.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	String strMsg = "��ϵǾ����ϴ�.";
	
	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);
	//rxw.add(root, "MsgData", strMsg);
	//System.out.println(rx.getXml());
	rxw.flush(out);
%>