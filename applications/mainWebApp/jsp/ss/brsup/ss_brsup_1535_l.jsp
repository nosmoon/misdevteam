<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1535_l.jsp
* ��� : ��������-���غ���-�����-���
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-27
* ������ϸ� : ss_brsup_1535_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_INSRAMTDataSet ds = (SS_L_INSRAMTDataSet)request.getAttribute("ds");
    int listCount = 10;		// ȭ��� �׸��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    rxw.makeDataToList(ds, "curaccdcauscd", "cicdnm", "cicodeval", "����", "", acctTemp, "causCombo");
    rxw.makeDataToList(ds, "curaccdtypecd", "cicdnm", "cicodeval", "����", "", acctTemp, "typeCombo");
    
    // ��ȸ ���.
    /*rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // �ѰǼ�    
    rxw.add(acctTemp, "amtTotal", Util.comma(ds.getTotalinsramt())); // �Ѻ����*/
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_INSRAMTCURCOMMLISTRecord curcommlistRec = (SS_L_INSRAMTCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal("Y");
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>


