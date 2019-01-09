<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_rdr_1856_l.jsp
* ��� :  ���� ����Ʈ ��������
* �ۼ����� : 2007-03-29
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-13
* ������ϸ� : ps_rdr_1856_l.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    String pagesize = request.getParameter("pagesize");
    // dataset �ν��Ͻ� ����κ�
    PS_L_BO_READER_SEARCHDataSet ds = (PS_L_BO_READER_SEARCHDataSet)request.getAttribute("ds");  // request dataset
    // �������� ȭ���� ������ Row��
	
    int records_non_page = Integer.parseInt(pagesize) - ds.readerlistcur.size();
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
		
	//������ ����.
	//rxw.add(resTemp, "pageno", pageno);
	//rxw.add(resTemp, "total_records", total_records);
	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
	rxw.makeHugeStart(acctTemp, "infoGrid");
	
	for(int i=0; i < ds.readerlistcur.size() ; i++)
	{

		PS_L_BO_READER_SEARCHREADERLISTCURRecord rec = (PS_L_BO_READER_SEARCHREADERLISTCURRecord)ds.readerlistcur.get(i);
	
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("tel_detail");
			rxw.add_ColVal("addr_detail");

			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}
		//������ �߰�.
		rxw.add_ColVal(new StringBuffer().append(rec.rdrtel_no1).append("-").append(rec.rdrtel_no2).append("-").append(rec.rdrtel_no3));	
		rxw.add_ColVal(new StringBuffer().append(rec.dlvaddr).append("/").append(rec.dlvdtlsaddr));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
	
%>
