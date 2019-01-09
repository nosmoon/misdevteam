<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_1706_l.jsp
* ��� : ���ʽ��Ϲ߼� �ϰ�Ȯ�� ����Ʈ
* �ۼ����� : 2004-02-25
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 20090211
* ������ϸ� : ps_send_1711_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // ȭ�鿡 ������ ���μ�
    String records_per_page =   "5";
    // dataset �ν��Ͻ� ����κ�
    PS_L_SEND_BNSBK_DTLDataSet ds = (PS_L_SEND_BNSBK_DTLDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    //rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "detailGrid");
    
    //record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "detailGrid");
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord rec = (PS_L_SEND_BNSBK_DTLCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("subsum");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}
						
		//������ �߰�.
		rxw.add_ColVal((rec.dirsend + rec.postsend + rec.zipsend + rec.offsend + rec.unsend + rec.homesend));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false); 
	}
	
	rxw.makeHugeEnd();
   	
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.

%>

