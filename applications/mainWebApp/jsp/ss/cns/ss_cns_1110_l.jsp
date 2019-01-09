<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_cns_1110_l.jsp
* ��� : ����-�̻�-���
* �ۼ����� : 2004-07-15
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-01
* ������ϸ� : ss_cns_1110_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_MOVM_RDRDataSet ds = (SS_L_MOVM_RDRDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;	// �� ȭ��� ����Ʈ �׸� ��
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", String.valueOf(ds.getTotalcnt()));
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", moveListCount);
	
	rxw.makeDataToBulk(ds, resTemp, "summary");
	
    rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i<ds.curcommlist.size(); i++)
	{
		SS_L_MOVM_RDRCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDRCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("startChoice");
			rxw.add_ColVal("addrDetail");
			rxw.add_ColVal("phoneNumber");
			rxw.add_ColVal("endChoice");
			rxw.add_ColVal("addrNow");
			rxw.add_ColVal("phoneNow");
			
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal("��");
		rxw.add_ColVal(curcommlistRec.addr + curcommlistRec.dtlsaddr);
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.rdrtel_no1 ,curcommlistRec.rdrtel_no2 ,curcommlistRec.rdrtel_no3, "-"));
		rxw.add_ColVal("��");
		rxw.add_ColVal(curcommlistRec.movmaddr + curcommlistRec.movmdtlsaddr);
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.movmtel_no1, curcommlistRec.movmtel_no2, curcommlistRec.movmtel_no3, "-"));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);    
%>