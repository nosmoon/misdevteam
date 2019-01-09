<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1060_l.jsp
* ��� : ��������-�Ź�������ǰ-��û-���
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-25
* ������ϸ� : ss_brsup_1060_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_NWSPITEMAPLCDataSet ds = (SS_L_NWSPITEMAPLCDataSet)request.getAttribute("ds");
    int listCount = 10;		// ȭ��� �׸��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "totalQunt", Util.comma(ds.getTotalaplcqunt())); // �Ѽ���
    rxw.add(acctTemp, "amtTotal", Util.comma(ds.getTotalamt())); // �ѱݾ�
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // �ѰǼ�  
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_NWSPITEMAPLCCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMAPLCCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("outCheck");
			rxw.add_ColVal("check");
			rxw.add_ColVal("line");
			rxw.add_ColVal("inoutdt");
			rxw.add_ColVal("valqunt");
			
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal(curcommlistRec.owhproc);
		rxw.add_ColVal("Y");
		rxw.add_ColVal("-");
		if(curcommlistRec.owhproc.equals("Y")){
			rxw.add_ColVal(curcommlistRec.owhdd);
			rxw.add_ColVal(curcommlistRec.owhqunt);
		}else{
			rxw.add_ColVal(Util.getDate()); // �����
			rxw.add_ColVal(curcommlistRec.aplcqunt); // ������
		}
		
		//������ �ʵ� �ڵ�����.
		
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>

