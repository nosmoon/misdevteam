<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1010_l.jsp
* ��� : ����Info-����ã��-��
* �ۼ����� : 2004-02-28
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-19
* ������ϸ� : ps_brinfo_1010_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BO_SRCH2DataSet ds = (SS_L_BO_SRCH2DataSet)request.getAttribute("ds");
    //int moveListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // �Ѱ�
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curbolist.size());
	
	for(int i=0; i < ds.curbolist.size() ; i++)
	{
		SS_L_BO_SRCH2CURBOLISTRecord curbolistRec = (SS_L_BO_SRCH2CURBOLISTRecord)ds.curbolist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("bo_detail");
			rxw.add_ColVal("tel_detail");
			rxw.add_ColVal("pht_detail");
			rxw.add_ColVal("addr_detail");
			
			rxw.add_ColVal("fax_detail");
			rxw.add_ColVal("htel_detail");
			rxw.add_ColVal("haddr_detail");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curbolistRec);
		}

		//������ �߰�.
		rxw.add_ColVal(curbolistRec.bonm + " (" + curbolistRec.bocd + "/" + curbolistRec.oprenvclsfnm + ")");
		rxw.add_ColVal(Util.getChainStr(curbolistRec.tel_no11, curbolistRec.tel_no12, curbolistRec.tel_no13, "-"));
		rxw.add_ColVal(Util.getChainStr(curbolistRec.hptph_no1, curbolistRec.hptph_no2, curbolistRec.hptph_no3, "-"));
		rxw.add_ColVal(curbolistRec.boaddr + " " + curbolistRec.bodtlsaddr);
		
		rxw.add_ColVal(Util.getChainStr(curbolistRec.fax1, curbolistRec.fax2, curbolistRec.fax3, "-"));					
		rxw.add_ColVal(Util.getChainStr(curbolistRec.htel_no1, curbolistRec.htel_no2, curbolistRec.htel_no3, "-"));
		rxw.add_ColVal(curbolistRec.hboaddr + " " + curbolistRec.hbodtlsaddr);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curbolistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
