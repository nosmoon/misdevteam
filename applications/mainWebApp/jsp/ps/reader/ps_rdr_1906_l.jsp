<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�  : ps_rdr_1906_l.jsp
* ���    : �����Է¸�� �˻�
* �ۼ����� : 2008-07-14
* �ۼ���   : ������
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
    // dataset �ν��Ͻ� ����κ�
    PS_L_PBLMCLAMTDataSet ds = (PS_L_PBLMCLAMTDataSet)request.getAttribute("ds");  // request dataset
    
    int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
    
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
	
	for(int i=0; i<ds.curcommlist.size(); i++)
	{
		PS_L_PBLMCLAMTCURCOMMLISTRecord curcommlistRec = (PS_L_PBLMCLAMTCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("rdr_total_number");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(curcommlistRec.rdr_no + "-" + curcommlistRec.medicd + "-" + curcommlistRec.termsubsno);
				
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
	
%>

