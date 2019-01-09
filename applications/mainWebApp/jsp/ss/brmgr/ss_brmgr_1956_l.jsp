<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pb_rdr_1856_l.jsp
* ��� :  ���� ����Ʈ ��������
* �ۼ����� : 2007-03-29
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-09
* ������ϸ� : ss_brmgr_1911_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    String pagesize = request.getParameter("pagesize");
    // dataset �ν��Ͻ� ����κ�
    SS_L_BO_READER_SEARCHDataSet ds = (SS_L_BO_READER_SEARCHDataSet)request.getAttribute("ds");  // request dataset
    // �������� ȭ���� ������ Row��

    int records_non_page = Integer.parseInt(pagesize) - ds.readerlistcur.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.readerlistcur.size());
	
	for(int i=0; i < ds.readerlistcur.size() ; i++)
	{
		SS_L_BO_READER_SEARCHREADERLISTCURRecord rec = (SS_L_BO_READER_SEARCHREADERLISTCURRecord)ds.readerlistcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("rdr_no_detail");
			rxw.add_ColVal("addr_detail");
			rxw.makeRecordToBulkTitle(rec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.
		rxw.add_ColVal(rec.getRdrtel_no1() + "-" + rec.getRdrtel_no2() + "-" + rec.getRdrtel_no3());
		rxw.add_ColVal(rec.getDlvaddr() + "-" + rec.getDlvdtlsaddr());
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
