<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_sppt_1211_u.jsp
* ���     : ����� ���ϵǴ°�
* �ۼ����� : 2003-12-02
* �ۼ���   : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������ : ������
* �������� : 2009-02-16
* ������ϸ� : ps_sppt_1211_u.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
String accflag = Util.checkString(request.getParameter("accflag"));

if(accflag.equals("20")) { 	
	String strMsg = "ó���Ͽ����ϴ�.";
	
	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);
	//rxw.add(root, "MsgData", strMsg);
	//System.out.println(rx.getXml());
	rxw.flush(out);
}

%>