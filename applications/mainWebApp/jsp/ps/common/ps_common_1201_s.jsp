<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_common_1201_s.jsp
* ��� : �����ȣ�� ��������˻�
* �ۼ����� : 2004-02-20
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-03
* ������ϸ� : ps_common_1201_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
   // ��������� ������� �����Ͽ� ���� Set���ִ� function��
   String setFunction = request.getParameter("setFunction") ;
    // dataset �ν��Ͻ� ����κ�
   PB_S_CORBOEMPDataSet ds = (PB_S_CORBOEMPDataSet)request.getAttribute("ds");  // request dataset
	    
   RwXmlWrapper rxw = new RwXmlWrapper();
   
   int root = RwXmlWrapper.rootNodeID;
   int acctTemp = rxw.makeParentNode(root, "dataTemp");

   // ��ȸ ���.
   rxw.makeDataToBulk(ds, acctTemp, "detailGrid");
  	
   rxw.flush(out);

   // data�� ���� ��� ó��. �߰� �ʿ�. 
   
%>
