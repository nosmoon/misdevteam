<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_rdr_1706_l.jsp
* ��� : ���纰�Է¸�� �˻�
* �ۼ����� : 2004-02-25
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-06
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // ȭ�鿡 ������ ���μ�
    String records_per_page =   request.getParameter("records_per_page");
System.out.println("records_per_page : "+records_per_page);
// dataset �ν��Ͻ� ����κ�
    PS_L_TODAYINPUT_RDRDataSet ds = (PS_L_TODAYINPUT_RDRDataSet)request.getAttribute("ds");  // request dataset
    
	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.todayinputcur.size();
System.out.println("no_data_page : "+no_data_page);

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//int totalCount = Util.comma(ds.getTotalcnt());
	//String curr_page_no = request.getParameter("curr_page_no");
    //String total_records = String.valueOf(ds.getTotalcnt());
    //String js_fn_nm = request.getParameter("js_fn_nm");
	
	//������ ����.
	//rxw.add(resTemp, "pageno", pageno);
	//rxw.add(resTemp, "total_records", total_records);
	
	//���� ����Ʈ
	//rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "����", "", resTemp, "branchCombo");
	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(resTemp, "userGrid");
	
	for(int i=0; i<ds.todayinputcur.size(); i++)
	{
		PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord rdr_publcurRec = (PS_L_TODAYINPUT_RDRTODAYINPUTCURRecord)ds.todayinputcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("total_addr");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rdr_publcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(rdr_publcurRec.dlvzip + "-" + rdr_publcurRec.dlvaddr + "-" + rdr_publcurRec.dlvdtlsaddr);
				
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rdr_publcurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

