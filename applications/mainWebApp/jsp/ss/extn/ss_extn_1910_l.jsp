<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1910_l.jsp
* ��� : Ȯ����Ȳ-Ȯ������-��û ���
* �ۼ����� : 2007-07-12
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-16
* ������ϸ� : ss_extn_1910_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EXTN_RESDataSet ds = (SS_L_EXTN_RESDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "councilCount", Util.comma(ds.cns_empcnfm)); // ���� Ȯ�ΰǼ�
    rxw.add(acctTemp, "confirmCount", Util.comma(ds.chrg_cnfm_cnt)); // ��� Ȯ�ΰǼ�
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "infoGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_EXTN_RESCURCOMMLISTRecord curcommlistRec = (SS_L_EXTN_RESCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("rdrtel_detail");
			rxw.add_ColVal("rdrptph_detail");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.		
		rxw.add_ColVal(new StringBuffer().append(curcommlistRec.rdrtel_no1).append("-").append(curcommlistRec.rdrtel_no2).append("-").append(curcommlistRec.rdrtel_no3));
		rxw.add_ColVal(new StringBuffer().append(curcommlistRec.rdrptph_no1).append("-").append(curcommlistRec.rdrptph_no2).append("-").append(curcommlistRec.rdrptph_no3));
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>


