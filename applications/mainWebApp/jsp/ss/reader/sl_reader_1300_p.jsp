<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_reader_1300_p.jsp
* ��� 		 : ������������(���������˾�-�ʱ�ȭ��)
* �ۼ����� 	 : 2004-01-20
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-06
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    CO_L_TAOCC_CDVDataSet ds = (CO_L_TAOCC_CDVDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int defaultData = rxw.add(resTemp, "defaultData", "");
	rxw.add(defaultData, "uid", Util.getSessionParameterValue(request, "uid", true));
	rxw.add(defaultData, "bocd", Util.getSessionParameterValue(request, "bocd", true));
	rxw.add(defaultData, "today", Util.getDate3());
	
	rxw.makeDataToBulkList(ds, "curcommlist", "cicdnm", "cicodeval", resTemp, "dscttypecdCombo");
	
	rxw.flush(out);
%>
