<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_sppt_1416_a.jsp
* ���  : ���ݿ����� �Է�/����
* �ۼ����� : 2004-06-10
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������ : ������
* �������� : 2009-02-25
* ������ϸ� : ps_sppt_1416_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
   String flag = Util.checkString(request.getParameter("flag"));
   String strMsg = "";

   if(flag == "I") {
      strMsg = "��û �Ǿ����ϴ�.";
   } else if(flag == "U") {
	  strMsg = "���� �Ǿ����ϴ�.";
   } else if(flag == "D") {
	  strMsg = "��� �Ǿ����ϴ�.";
   }
  
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
   int root = RwXmlWrapper.rootNodeID;
   rxw.add(root, "MsgData", strMsg);
   //System.out.println(rx.getXml());
   rxw.flush(out);
%>
