<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ss_ca_1210_l.jsp
* ���     : ���̹�����-���̹���������-��ȸ
* �ۼ����� : 2005-06-22
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-02
* ������ϸ� : ss_ca_1210_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_CYBALON_STAFPAYDataSet ds = (SS_L_CYBALON_STAFPAYDataSet)request.getAttribute("ds");

    int listCount = 15;	// �� ȭ��� ����Ʈ �׸� ��

	// �˻� ����Ʈ ī��Ʈ
	int recCount  =  ds.stafpaylist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.stafpaylist.size());
	
	for(int i=0; i < ds.stafpaylist.size() ; i++)
	{
		SS_L_CYBALON_STAFPAYSTAFPAYLISTRecord stafpaylistRec = (SS_L_CYBALON_STAFPAYSTAFPAYLISTRecord)ds.stafpaylist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.

			rxw.makeRecordToBulkTitle(stafpaylistRec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.

		rxw.makeRecordToBulk(stafpaylistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
