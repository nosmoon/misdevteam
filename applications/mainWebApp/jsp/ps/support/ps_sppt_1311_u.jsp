<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_sppt_1311_u.jsp
* ���     : ��������� ���ϵǴ°�
* �ۼ����� : 2005-02-15
* �ۼ���   : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������ : ������
* �������� : 2009-02-16
* ������ϸ� : ps_sppt_1311_u.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
   String strMsg = "�������ó�� �Ͽ����ϴ�.";
  
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
   int root = RwXmlWrapper.rootNodeID;
   rxw.setMessageAlert(strMsg);
   //rxw.add(root, "MsgData", strMsg);
   //System.out.println(rx.getXml());
   rxw.flush(out);
%>