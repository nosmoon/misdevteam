<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_rdr_1306_l.jsp
* ��� : ����ó�� ����Ʈ
* �ۼ����� : 2004-02-25
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-13
* ������ϸ� : ps_rdr_1306_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // ȭ�鿡 ������ ���μ�
    String records_per_page =   request.getParameter("records_per_page");
    // dataset �ν��Ͻ� ����κ�
    PS_L_RDR_ARBTDataSet ds = (PS_L_RDR_ARBTDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
		
	//ó������
	rxw.makeDataToList(ds, "aprvproccd", "cicdnm", "cicodeval", "����", "", acctTemp, "aprvCombo");
	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "infoGrid");

	for(int i=0; i < ds.curcommlist.size(); i++)
	{

		PS_L_RDR_ARBTCURCOMMLISTRecord curcommlistRec = (PS_L_RDR_ARBTCURCOMMLISTRecord)ds.curcommlist.get(i);
	
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			rxw.add_ColVal("addr_detail");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal("N");
		rxw.add_ColVal(new StringBuffer().append("(").append(curcommlistRec.dlvzip).append(") ").append(curcommlistRec.dlvaddr).append(" ").append(curcommlistRec.dlvdtlsaddr));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);

%>

