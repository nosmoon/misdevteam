<%@ page contentType="text/xml;charset=euc-kr"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_common_1200_p.jsp
* ��� 		 : ���� Ȯ���� �˻� (�ʱ�ȭ��)
* �ۼ����� 	 : 2003-12-13
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-01
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	// request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

	// getting dataset
    CO_L_TAOCC_CDVDataSet ds = (CO_L_TAOCC_CDVDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "bocd", Util.getSessionParameterValue(request, "bocd", true));
	rxw.makeDataToBulkList(ds, "curcommlist", "cicdnm", "cicodeval", "��ü", "", resTemp, "extnblngcdCombo");
	
	rxw.flush(out);
%>
