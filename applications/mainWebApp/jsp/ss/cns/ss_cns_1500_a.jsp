<%@ page contentType="text/xml;charset=euc-kr"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_cns_1500_a.jsp
* ��� 		 : ���ǵ��� �˻�
* �ۼ����� 	 : 2004-07-15
* �ۼ��� 	 : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :TrustForm ����.
* ������   : ����
* �������� : 2009-04-08
* ������ϸ� : ss_cns_1500_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	int listCount = 10;	

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
   	rxw.flush(out);   
%>