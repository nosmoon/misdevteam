<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1810_l.jsp
* ��� : ������ Ȯ�峻�� ��ȸ
* �ۼ����� : 2006-06-07
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-19
* ������ϸ� : ps_extn_1810_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_MOVEIN_EXTNDataSet ds = (SL_L_MOVEIN_EXTNDataSet)request.getAttribute("ds");
    //int listCount = 20;		// �� ȭ��� ����Ʈ �׸� ��
    int listCount = 5000;
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "realCount", Util.comma(ds.getRealcnt())); // �����
    rxw.add(acctTemp, "subCount", Util.comma(ds.getSubscnt())); // ������
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // �Ѱ�
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curextnlist.size());
	
	for(int i=0; i < ds.curextnlist.size() ; i++)
	{
		SL_L_MOVEIN_EXTNCUREXTNLISTRecord curcommlistRec = (SL_L_MOVEIN_EXTNCUREXTNLISTRecord)ds.curextnlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("subspynDesc");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal(curcommlistRec.subspyn.equals("N") ? "Y" : "");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>

