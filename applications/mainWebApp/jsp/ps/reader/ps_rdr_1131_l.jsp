<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1131_l.jsp
* ���     : Ȯ�嵶�ڰ��� Ȯ�嵶�ڰ˻� �˻�
* �ۼ����� : 2004-02-25
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-18
* ������ϸ� : ps_rdr_1311_l.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    //dataset �ν��Ͻ� ����κ�
	PS_L_RDR_EXTN_SEARCHDataSet ds = (PS_L_RDR_EXTN_SEARCHDataSet)request.getAttribute("ds");

	// �˻� ����Ʈ ī��Ʈ
	int recCount  =  ds.rdr_extncur.size();

	// ���������� ������ ���ڵ� ��
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
		
	//������ ����.
	//rxw.add(resTemp, "pageno", pageno);
	//rxw.add(resTemp, "total_records", total_records);
	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "userGrid");

	for(int i=0; i < recCount ; i++)
	{

		PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord rdr_extncurRec = (PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord)ds.rdr_extncur.get(i);
	
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("addr_detail");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rdr_extncurRec);
		}

		//������ �߰�.
		rxw.add_ColVal(new StringBuffer().append(rdr_extncurRec.dlvaddr).append(" ").append(rdr_extncurRec.dlvdtlsaddr));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rdr_extncurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	//rxw.setErrorAlert("�����Դϴ�.");
	//rxw.setMessageAlert("�߳��Խ�.");
	rxw.flush(out);
	
%>


