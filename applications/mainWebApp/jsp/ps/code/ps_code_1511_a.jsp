<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_code_1411_i.jsp
* ��� : �ڵ�-���������ڵ���� ����
* �ۼ����� : 2004-03-20
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������ : ������
* �������� : 2009-02-12
* ������ϸ� : ps_code_1411_i.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	String strMsg = "";
	String accflag = request.getParameter("accflag");
	
	if( accflag.equals("I") ) {
	  strMsg = "��� �Ǿ����ϴ�";
	} else if( accflag.equals("U") ) {
	  strMsg = "���� �Ǿ����ϴ�";
	} else if( accflag.equals("D") ) {
	  strMsg = "���� �Ǿ����ϴ�";
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);
	//rxw.add(root, "MsgData", strMsg);
	//System.out.println(rx.getXml());
	rxw.flush(out);
%>


