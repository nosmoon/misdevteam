<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2105_l.jsp
* ��� : Ȯ����Ȳ-������Ȳ-��ȸ
* �ۼ����� : 2009-05-22
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXTN_HDQTDataSet ds = (SS_L_EXTN_HDQTDataSet)request.getAttribute("ds");
        
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
    rxw.add(acctTemp, "totalQtyCount", Util.comma(ds.totalqty)); // �Ѻμ�
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�
          	
    //record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.onlinelist.size());
	
	for(int i=0; i < ds.onlinelist.size() ; i++)
	{
		SS_L_EXTN_HDQTONLINELISTRecord curcommlistRec = (SS_L_EXTN_HDQTONLINELISTRecord)ds.onlinelist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			rxw.add_ColVal("alladdr");
			rxw.add_ColVal("allbotel");
			rxw.add_ColVal("allrdrtel");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.		
		rxw.add_ColVal("N");
		rxw.add_ColVal(new StringBuffer().append(curcommlistRec.dlvaddr).append("-").append(curcommlistRec.dlvdtlsaddr));
		rxw.add_ColVal(new StringBuffer().append(curcommlistRec.tel_no11).append("-").append(curcommlistRec.tel_no12).append("-").append(curcommlistRec.tel_no13));
		rxw.add_ColVal(new StringBuffer().append(curcommlistRec.rdrtel_no1).append("-").append(curcommlistRec.rdrtel_no2).append("-").append(curcommlistRec.rdrtel_no3));
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>


