<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1110_l.jsp
* ��� : ������Ȳ-���ں���-���
* �ۼ����� : 2004-01-12
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-06
* ������ϸ� : ss_reader_1110_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	chosun.ciis.ss.sls.rdr.ds.SS_L_RDR_DSCTDataSet ds = (chosun.ciis.ss.sls.rdr.ds.SS_L_RDR_DSCTDataSet)request.getAttribute("ds");
    int moveListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��

	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		chosun.ciis.ss.sls.rdr.rec.SS_L_RDR_DSCTCURCOMMLISTRecord curcommlistRec = (chosun.ciis.ss.sls.rdr.rec.SS_L_RDR_DSCTCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("acpndt_detail");
			rxw.add_ColVal("boprocdt_detail");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.
		
		//rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.acpndt));
		//rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.boprocdt));
		rxw.add_ColVal((curcommlistRec.acpndt).toString().substring(0,10));
		//if("".equals(curcommlistRec.boprocdt)){
		if(curcommlistRec.boprocdt == null){
			rxw.add_ColVal("");
		}else{
			rxw.add_ColVal((curcommlistRec.boprocdt).toString().substring(0,10));
		}
		
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
