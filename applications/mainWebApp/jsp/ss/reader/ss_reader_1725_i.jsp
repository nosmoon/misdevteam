<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1725_i.jsp
* ��� : ���ڰ��� �ϰ����
* �ۼ����� : 2008-08-11
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	// ������ �Է¿��� Ȯ��
	//String chkresult = (String)request.getAttribute("result") ;
	String strMsg = "��ϵǾ����ϴ�";
	
	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);
	//rxw.add(root, "MsgData", strMsg);
	//System.out.println(rx.getXml());
	rxw.flush(out);	
%>
