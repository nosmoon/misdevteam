<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2810_l.jsp
* ��� : ��ũ�� ���� ����Ʈ
* �ۼ����� : 2014-12-24
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_WORKBOOK_APLCDataSet ds = (SS_L_WORKBOOK_APLCDataSet)request.getAttribute("ds");
    //int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    
    int totcnt = 0;
    int totqty = 0;
    if(ds.totcnt != "") {
    	Integer.parseInt(ds.totcnt);
    }else{
    	totcnt = 0;
    }
    
    if(ds.totqty != "") {
    	Integer.parseInt(ds.totqty);
    }else{
    	totqty = 0;
    }
    
    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(totcnt)); // �ѰǼ�
    rxw.add(acctTemp, "totalQty", Util.comma(totqty)); // �ѰǼ�
  	
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_WORKBOOK_APLCCURCOMMLISTRecord curcommlistRec = (SS_L_WORKBOOK_APLCCURCOMMLISTRecord)ds.curcommlist.get(i);
	
		if(i == 0)
		{	
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		rxw.makeRecordToBulk(curcommlistRec, false);

	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

%>

