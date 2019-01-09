<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ss_ca_1110_l.jsp
* ���     : ���̹�����-���̹�����û��-��ȸ
* �ۼ����� : 2005-06-20
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-02
* ������ϸ� : ss_ca_1110_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_CYBALON_BOCLAMDataSet ds = (SS_L_CYBALON_BOCLAMDataSet)request.getAttribute("ds");

    int listCount = 15;	// �� ȭ��� ����Ʈ �׸� ��

	// �˻� ����Ʈ ī��Ʈ
	int recCount  =  ds.boalonclamlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�
    rxw.add(acctTemp, "totalCount", ds.totalcnt); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.boalonclamlist.size());
	
	for(int i=0; i < ds.boalonclamlist.size() ; i++)
	{
		SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord boalonclamlistRec = (SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord)ds.boalonclamlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			//rxw.add_ColVal("tel_no_detail");
			rxw.makeRecordToBulkTitle(boalonclamlistRec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.
		//rxw.add_ColVal(Util.getChainStr(curcommlistRec.tel_no1,curcommlistRec.tel_no2,curcommlistRec.tel_no3,"-"));
		rxw.makeRecordToBulk(boalonclamlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
