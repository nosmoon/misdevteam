<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1830_l.jsp
* ��� : ���־���Ʈ ��� ��ȸ
* �ۼ����� : 2006-06-09
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-19
* ������ϸ� : ps_extn_1830_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_MOVEIN_APTDataSet ds = (SL_L_MOVEIN_APTDataSet)request.getAttribute("ds");
    //int listCount = 20;		// �� ȭ��� ����Ʈ �׸� ��
    int listCount = 5000;
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curaptlist.size());
	
	for(int i=0; i < ds.curaptlist.size() ; i++)
	{
		SL_L_MOVEIN_APTCURAPTLISTRecord curcommlistRec = (SL_L_MOVEIN_APTCURAPTLISTRecord)ds.curaptlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("addr_detail");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(curcommlistRec.dongno + "/" + curcommlistRec.flor_houscnt + "/" + curcommlistRec.florcnt);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
    
%>

