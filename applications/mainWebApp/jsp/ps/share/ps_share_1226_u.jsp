<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_share_1226_u.jsp
* ��� : �������� �Խ��� �������� ����
* �ۼ����� : 2004-02-24
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������ : ������
* �������� : 2009-03-05
* ������ϸ� : ps_share_1226_u.bak
---------------------------------------------------------------------------------------------------%>
<%
	// ������ �Է¿��� Ȯ��
	String chkresult = (String)request.getAttribute("result") ;
	String strMsg = "";
	
	if(chkresult == "false" ){
		strMsg = "���� ÷���� �뷮�� �ʰ��߰ų� ������ �߻��Ͽ����ϴ�.\n�뷮�� 5M�� �ѽ��ϴ�.";	
	} else {
		strMsg = "�����Ǿ����ϴ�.";  
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);
	//rxw.add(root, "MsgData", strMsg);
	//System.out.println(rx.getXml());
	rxw.flush(out);	
%>
