<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1350_l.jsp
* ��� : ��������-���غ���-��û-�󼼸��
* �ۼ����� : 2004-02-19
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-26
* ������ϸ� : ss_brsup_1350_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%

    SS_S_INSRAPLCDataSet ds = (SS_S_INSRAPLCDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();

	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// ��ȸ ���.
   	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_S_INSRAPLCCURCOMMLISTRecord curcommlistRec = (SS_S_INSRAPLCCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			//rxw.add_ColVal("check");
			
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
	
		//������ �߰�.
		//rxw.add_ColVal("Y");
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
	
	// data�� ���� ��� ó��. �߰� �ʿ�.
	    
	// page ó��. �߰� �ʿ�.
%>

