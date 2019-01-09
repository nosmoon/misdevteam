<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1115_l.jsp
* ��� : ��������-�Ź�������ǰ-���-���
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-25
* ������ϸ� : ss_brsup_1115_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_NWSPITEMACCDDataSet ds = (SS_L_NWSPITEMACCDDataSet)request.getAttribute("ds");
    int nwspitemaccdListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "accCount", Util.comma(ds.getTotalaccdquntcnt())); // �ѻ��Ǽ�
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // �ѰǼ�    
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_NWSPITEMACCDCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMACCDCURCOMMLISTRecord)ds.curcommlist.get(i);
		
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
