<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_move_1010_l.jsp
* ��� : �̻絶��-��û��Ȳ-���
* �ۼ����� : 2004-01-05
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ����
* �������� : 2009-03-11
* ������ϸ� : ss_move_1010_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXTN_RDR_STATSDataSet ds = (SS_L_EXTN_RDR_STATSDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    //int moveListCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    // ��ȸ ���.
    rxw.add(acctTemp, "fixbef", Util.comma(ds.getFixbef()));
    rxw.add(acctTemp, "fixaft", Util.comma(ds.getFixaft()));
    rxw.add(acctTemp, "totqty", Util.comma(ds.getTotqty()));
    rxw.add(acctTemp, "parempcnt", Util.comma(ds.getParempcnt()));
    rxw.add(acctTemp, "totempcnt", Util.comma(ds.getTotempcnt()));
    rxw.add(acctTemp, "parempper", Util.comma(ds.getParempper()));
    
    rxw.makeHugeStart(acctTemp, "listGrid", ds.curextnstatlist.size());
    
    System.out.println("dssize"+ds.curextnstatlist.size());
    for(int i=0; i<ds.curextnstatlist.size(); i++)
    {
    	SS_L_EXTN_RDR_STATSCUREXTNSTATLISTRecord curextnstatlistRec = (SS_L_EXTN_RDR_STATSCUREXTNSTATLISTRecord)ds.curextnstatlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{			
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curextnstatlistRec);
		}
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curextnstatlistRec, false);
		
	}
	rxw.makeHugeEnd();
    
	rxw.flush(out);
%>