<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_share_1106_l.jsp
* ��� : �������� ���� ����Ʈ ��������
* �ۼ����� : 2004-02-23
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-12
* ������ϸ� : ps_share_1106_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    PS_L_TACOM_SCHEDataSet ds = (PS_L_TACOM_SCHEDataSet)request.getAttribute("ds");    // request dataset
    int moveListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
   	//rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "infoGrid");
    
   	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "infoGrid");
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		PS_L_TACOM_SCHECURCOMMLISTRecord rec = (PS_L_TACOM_SCHECURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("frdt_detail");
			rxw.add_ColVal("todt_detail");			
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}

		//������ �߰�.
		rxw.add_ColVal(Util.Timestamp2Str(rec.getFrdt(), "yyyyMMdd' '"));
		rxw.add_ColVal(Util.Timestamp2Str(rec.getTodt(), "yyyyMMdd' '"));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>


