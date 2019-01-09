<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1505_l.jsp
* ��� : ������-����������-���
* �ۼ����� : 2005-01-28
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-01
* ������ϸ� : ss_admin_1505_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BOCLOSDataSet ds = (SS_L_BOCLOSDataSet)request.getAttribute("ds");
    int closListCount = 8;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_BOCLOSCURCOMMLISTRecord curcommlistRec = (SS_L_BOCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
