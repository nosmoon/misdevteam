<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1602_s.jsp
* ��� : ������-��纰 �����ȣ ����ó��-������ȸ
* �ۼ����� : 2009-05-01
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_UNIONCHGZIPCODEDataSet ds = (SS_S_UNIONCHGZIPCODEDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();

    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

	// ��ȸ ���.
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.detaillist.size());
	
	for(int i=0; i < ds.detaillist.size() ; i++)
	{
		SS_S_UNIONCHGZIPCODEDETAILLISTRecord rec = (SS_S_UNIONCHGZIPCODEDETAILLISTRecord)ds.detaillist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}

		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
