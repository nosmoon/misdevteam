<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1592_l.jsp
* ��� : Ȯ����Ȳ-Ȯ��뿪���-���곻��-���
* �ۼ����� : 2003-12-24
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-19
* ������ϸ� : ss_extn_1592_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_SERVCOSTDataSet ds = (SS_L_RDR_EXTN_SERVCOSTDataSet)request.getAttribute("ds");
    //int adjmListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    int adjmListCount = 5000;
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "infoGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("phone_detail");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.ptph_no1, curcommlistRec.ptph_no2, curcommlistRec.ptph_no3,"-"));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
    
%>

