<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_reader_1370_p.jsp
* ��� 		 : ������������(���˹������˾�-�ʱ�ȭ��)
* �ۼ����� 	 : 2003-12-12
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-07
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "frpaydt", Util.addDays(Util.getDate(), -730, "yyyyMMdd", "yyyyMMdd" ));
	rxw.add(resTemp, "topaydt", Util.addDays(Util.getDate(), 365, "yyyyMMdd", "yyyyMMdd" ));
	rxw.add(resTemp, "paydt", Util.getDate());
	
	rxw.flush(out);
%>
