<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2236_i.jsp
* ��� : Ȯ����Ȳ-���˸���
* �ۼ����� : 2011-11-23
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
   SL_U_EXTNCLOS_JM_CLOSEDataSet ds = (SL_U_EXTNCLOS_JM_CLOSEDataSet)request.getAttribute("ds");
  
   String strMsg = "ó���Ǿ����ϴ�"; //ds.getResult();	//"����Ǿ����ϴ�.";
  
   RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
   int root = RwXmlWrapper.rootNodeID;
   rxw.setMessageAlert(strMsg);

   rxw.flush(out);
%>