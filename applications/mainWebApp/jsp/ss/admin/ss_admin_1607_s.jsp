<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1607_s.jsp
* ��� : ������-��纰 �����ȣ ����ó��-��
* �ۼ����� : 2009-04-28
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_CHGZIPCODEDataSet ds = (SS_S_CHGZIPCODEDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// ��ȸ ���.
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.detaillist.size());
	
	for(int i=0; i < ds.detaillist.size() ; i++)
	{
		SS_S_CHGZIPCODEDETAILLISTRecord rec = (SS_S_CHGZIPCODEDETAILLISTRecord)ds.detaillist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(rec);
		}

		//������ �ʵ� �ڵ�����.
		rxw.add_ColVal("Y");
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
