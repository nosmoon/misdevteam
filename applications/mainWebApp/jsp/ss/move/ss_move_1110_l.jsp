<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_move_1110_l.jsp
* ��� : �̻絶�ڸ���-���
* �ۼ����� : 2014-06-05
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_MOVM_RDR_CLOSDataSet ds = (SS_L_MOVM_RDR_CLOSDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
    rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
    for(int i=0; i<ds.curcommlist.size(); i++)
    {
    	SS_L_MOVM_RDR_CLOSCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDR_CLOSCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("startChoice");
			rxw.add_ColVal("addrDetail");
			rxw.add_ColVal("phoneNumber");
			rxw.add_ColVal("endChoice");
			rxw.add_ColVal("addrNow");
			rxw.add_ColVal("phoneNow");
			rxw.add_ColVal("cns_empcnfmdt1");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal("��");
		rxw.add_ColVal(curcommlistRec.addr + curcommlistRec.dtlsaddr);
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.rdrtel_no1 ,curcommlistRec.rdrtel_no2 ,curcommlistRec.rdrtel_no3, "-"));
		rxw.add_ColVal("��");
		rxw.add_ColVal(curcommlistRec.movmaddr + curcommlistRec.movmdtlsaddr);
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.movmtel_no1 ,curcommlistRec.movmtel_no2 ,curcommlistRec.movmtel_no3, "-"));
		rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.cns_empcnfmdt));
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
		
	}
	rxw.makeHugeEnd();
    
	rxw.flush(out);
%>