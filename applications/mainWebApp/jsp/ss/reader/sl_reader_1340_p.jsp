<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_reader_1340_p.jsp
* ��� 		 : ������������(�̻��ΰ��˾�-�ʱ�ȭ��)
* �ۼ����� 	 : 2003-12-12
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-03
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SL_L_MOVM_RDR_INIT_01DataSet ds = (SL_L_MOVM_RDR_INIT_01DataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int defaultData = rxw.add(resTemp, "defaultData", "");
	rxw.add(defaultData, "uid", Util.getSessionParameterValue(request, "uid", true));
	rxw.add(defaultData, "bocd", Util.getSessionParameterValue(request, "bocd", true));
	rxw.add(defaultData, "movmdt", Util.getDate());
	rxw.add(defaultData, "dlvhopedt", Util.addDays(Util.getDate(), 1, "yyyyMMdd", "yyyyMMdd" ));
	
	//�ְ�����
	rxw.makeDataToBulkList(ds, "curmovmresitype", "cicdnm", "cicodeval", resTemp, "movmresitypeCombo");
	//�ְű���
	rxw.makeDataToBulkList(ds, "curmovmresiclsf", "cicdnm", "cicodeval", resTemp, "movmresiclsfCombo");
	
	rxw.flush(out);
%>
