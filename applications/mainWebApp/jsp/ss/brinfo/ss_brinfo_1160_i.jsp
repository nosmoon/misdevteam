<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1160_i.jsp
* ��� : �����濵-���°���(�ǽð�������ü) ���,����,����
* �ۼ����� : 2006-11-28
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������ : Ȳ����
* �������� : 2009-01-23
* ������ϸ� : ss_brinfo_1160_i.jsp_org
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
   } else {
     strMsg = "ó�� �Ǿ����ϴ�";
   }
   
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
   int root = RwXmlWrapper.rootNodeID;
   rxw.add(root, "MsgData", strMsg);
   //System.out.println(rx.getXml());
   rxw.flush(out);
%>

