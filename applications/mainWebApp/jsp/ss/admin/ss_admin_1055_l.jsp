<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: ss_admin_1055_l.jsp
* ���		: ������-�����ڵ�-���
* �ۼ�����	: 2004-04-28
* �ۼ���	: ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-08
* ������ϸ� : ss_admin_1055_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_BNSITEMDataSet ds = (SL_L_BNSITEMDataSet)request.getAttribute("ds");
    int cdvListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.bnsitemcur.size());
	
	for(int i=0; i < ds.bnsitemcur.size() ; i++)
	{
		SL_L_BNSITEMBNSITEMCURRecord bnsitemcurRec = (SL_L_BNSITEMBNSITEMCURRecord)ds.bnsitemcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(bnsitemcurRec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(bnsitemcurRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
