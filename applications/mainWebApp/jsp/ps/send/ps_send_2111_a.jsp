<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_send_2111_a.jsp
* ���     : �ݼ۸���Ʈ ������ ����
* �ۼ����� : 2004-03-20
* �ۼ���   : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������ : ������
* �������� : 2009-02-27
* ������ϸ� : ps_send_2111_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
   String gbnflag =  request.getParameter("gbnflag");
   String strMsg = "Ȯ�� �Ǿ����ϴ�.";

   if( gbnflag == "U" ){
	   strMsg = "�����Ͽ����ϴ�.";
   }else{
	   strMsg = "�Է��Ͽ����ϴ�.";
   }
    
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
   int root = RwXmlWrapper.rootNodeID;
   rxw.setMessageAlert(strMsg);
   //rxw.add(root, "MsgData", strMsg);
   //System.out.println(rx.getXml());
   rxw.flush(out);
%>
