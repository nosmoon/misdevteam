<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_send_2506_u.jsp
* ���     : ��޺񸶰�-����/�������
* �ۼ����� : 2008-07-29
* �ۼ���   : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������ : ������
* �������� : 2009-03-03
* ������ϸ� : ps_send_2506_u.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String accflag	=	request.getParameter("accflag");

	String strMsg = "";
	
	if(accflag.equals("M")){
		strMsg = "��޺񸶰��� �Ϸ�Ǿ����ϴ�.";
	} else if(accflag.equals("C")){
		strMsg = "��޺񸶰��� ��ҵǾ����ϴ�.";
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
	int root = RwXmlWrapper.rootNodeID;
	rxw.setMessageAlert(strMsg);
	//rxw.add(root, "MsgData", strMsg);
	//System.out.println(rx.getXml());
	rxw.flush(out);
%>

