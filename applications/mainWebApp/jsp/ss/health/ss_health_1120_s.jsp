<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_health_1120_s.jsp
* ��� : ��ũ�� ���� ��
* �ۼ����� : 2015-1-5
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_WORKBOOK_SENDCLSDataSet ds = (SS_S_WORKBOOK_SENDCLSDataSet)request.getAttribute("ds");
    //int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
      	
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_S_WORKBOOK_SENDCLSCURCOMMLISTRecord curcommlistRec = (SS_S_WORKBOOK_SENDCLSCURCOMMLISTRecord)ds.curcommlist.get(i);
	
		if(i == 0)
		{	
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		rxw.makeRecordToBulk(curcommlistRec, false);

	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

%>

