<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: ss_reader_1550_d.jsp
* ���		: ������Ȳ-VacationStop-�ڵ�-����
* �ۼ�����	: 2004-03-29
* �ۼ���	: ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: ����
* ��������	: 2009-03-06
* ������ϸ�: ss_reader_1550_d.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
   String strMsg = "�����Ǿ����ϴ�.";
  
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
   int root = RwXmlWrapper.rootNodeID;
   rxw.setMessageAlert(strMsg);
   //rxw.add(root, "MsgData", strMsg);
   //System.out.println(rx.getXml());
   rxw.flush(out);
%>