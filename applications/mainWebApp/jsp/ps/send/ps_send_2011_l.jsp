<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_2011_l.jsp
* ��� : �����߰��߼� ����Ʈ
* �ۼ����� : 2004/03/16
* �ۼ��� : ���ȯ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 20090210
* ������ϸ� : ps_send_2011_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
    PS_L_SEND_GIROADDMDataSet ds = (PS_L_SEND_GIROADDMDataSet)request.getAttribute("ds");

    int  records_per_page = Integer.parseInt(request.getParameter("records_per_page"));

    int  no_data_page     = records_per_page - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "sendInfoGrid");
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		PS_L_SEND_GIROADDMCURCOMMLISTRecord rec = (PS_L_SEND_GIROADDMCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("rdrno_detail");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(new StringBuffer().append(rec.rdr_no).append("-").append(rec.medicd).append("-").append(rec.termsubsno));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

