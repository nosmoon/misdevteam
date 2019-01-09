<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1615_l.jsp
* ��� : ��������-Billing-����EDI��������-����EDI �Ա�ó����� �����ȸ
* �ۼ����� : 2004-03-10
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-17
* ������ϸ� : ss_brsup_1615_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_GIRORECPDataSet ds = (SS_L_GIRORECPDataSet)request.getAttribute("ds");
    int moveListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // ��
    rxw.add(acctTemp, "rcpCount", Util.comma(ds.getRcpmcnt())); // �Ա�
    rxw.add(acctTemp, "errCount", Util.comma(ds.getErrcnt())); // ����
    rxw.add(acctTemp, "amtCount", Util.comma(ds.getTotalamt())); // ���Աݾ�
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.rsltcur.size());
	
	for(int i=0; i < ds.rsltcur.size() ; i++)
	{
		SS_L_GIRORECPRSLTCURRecord rsltcurRec = (SS_L_GIRORECPRSLTCURRecord)ds.rsltcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("amt_detail");
			
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}

		//������ �߰�.
		
		if(rsltcurRec.clamt==0) {
   			rxw.add_ColVal(rsltcurRec.amt);
   		} else {
   			rxw.add_ColVal(rsltcurRec.clamt);
   		}			
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.  
%>

