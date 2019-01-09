<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1510_s.jsp
* ��� : Ȯ����Ȳ-Ȯ��뿪���-(����IS)-��
* �ۼ����� : 2003-12-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-18
* ������ϸ� : ss_extn_1510_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_RDR_EXTN_SERVCLOSDataSet ds = (SS_S_RDR_EXTN_SERVCLOSDataSet)request.getAttribute("ds");
    //int mediListCount = 13;
    int mediListCount = 5000;
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "listCount", ds.curcommlist.size());
    rxw.makeDataToBulk(ds, acctTemp, "detailData");
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	  	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_S_RDR_EXTN_SERVCLOSCURCOMMLISTRecord curcommlistRec = (SS_S_RDR_EXTN_SERVCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		rxw.add_ColVal("Y");
		//������ �߰�.
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	// �ϴ� �� �׸��� ����ó��
	for(int i=ds.curcommlist.size(); i<14; i++)
	{
		rxw.add_ColVal("N");
		//������ �߰�.
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(new SS_S_RDR_EXTN_SERVCLOSCURCOMMLISTRecord(), false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
