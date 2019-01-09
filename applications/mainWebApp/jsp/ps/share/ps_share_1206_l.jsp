<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_share_1206_l.jsp
* ��� : �������� �Խ��� �������� �˻�����Ʈ ��������
* �ۼ����� : 2004-02-24
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-03
* ������ϸ� : ps_send_1206_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
    PS_L_INFOEXG_SRCHDataSet ds = (PS_L_INFOEXG_SRCHDataSet)request.getAttribute("ds");    // request dataset

    String js_fn_nm = request.getParameter("js_fn_nm");
    if(js_fn_nm == null) {js_fn_nm = "page_move";}

    String curr_page_no = (String)request.getAttribute("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}
    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = "20";}

    int no_data_page = Integer.parseInt(records_per_page) -ds.infoexglist.size();

    String rmsgexttcd = Util.checkString((String)request.getAttribute("rmsgexttcd"));

    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid");
	
	for(int i=0; i < ds.infoexglist.size() ; i++)
	{
		PS_L_INFOEXG_SRCHINFOEXGLISTRecord rec = (PS_L_INFOEXG_SRCHINFOEXGLISTRecord)ds.infoexglist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("incmgdt_detail");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}

		//������ �߰�.
		rxw.add_ColVal(Util.Timestamp2Str(rec.incmgdt, "yyyyMMdd' '"));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.

%>


