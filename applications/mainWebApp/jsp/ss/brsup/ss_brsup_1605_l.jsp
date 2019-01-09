<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1605_l.jsp
* ��� : ��������-Billing-����EDI��������-������� ��Ȳ �����ȸ
* �ۼ����� : 2004-03-06
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-17
* ������ϸ� : ss_brsup_1605_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EDI_RECPDataSet ds = (SS_L_EDI_RECPDataSet)request.getAttribute("ds");
    int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // �ѰǼ�    
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.rsltcur.size());
	
	for(int i=0; i < ds.rsltcur.size() ; i++)
	{
		SS_L_EDI_RECPRSLTCURRecord rsltcurRec = (SS_L_EDI_RECPRSLTCURRecord)ds.rsltcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			//rxw.add_ColVal("check");
			
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}

		//������ �߰�.
		//rxw.add_ColVal("Y");
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.      
%>

