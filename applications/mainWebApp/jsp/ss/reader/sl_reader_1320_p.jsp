<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_reader_1320_p_jsp
* ��� 		 : ������������(�����˾�)(�ʱ�ȭ��) /ss/slreader/1320
* �ۼ����� 	 : 2003-12-12
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-02
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "bocd", Util.getSessionParameterValue(request, "bocd", true));
	rxw.add(resTemp, "today", Util.getDate());
	
	rxw.flush(out);
%>

