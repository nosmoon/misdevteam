<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1082_l.jsp
* ��� : ������-�����ڵ�-�ʱ�ȭ��
* �ۼ����� : 2004-05-01
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-01
* ������ϸ� : ss_admin_1082_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_ACCTCDDataSet ds = (SS_L_ACCTCDDataSet)request.getAttribute("ds");
	int listCount = 10;		// ȭ�� �� �׸� ��
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.acctcdcur.size());
	
	for(int i=0; i < ds.acctcdcur.size() ; i++)
	{
		SS_L_ACCTCDACCTCDCURRecord acctcdcurRec = (SS_L_ACCTCDACCTCDCURRecord)ds.acctcdcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{	
			
			rxw.add_ColVal("leaf_inyn_f");
			rxw.add_ColVal("empadvyn_f");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(acctcdcurRec);
		}

		//������ �߰�.
		if("Y".equals(acctcdcurRec.leaf_inyn)){
			rxw.add_ColVal("Y");
		}else{
			rxw.add_ColVal("N");
		}
		if("Y".equals(acctcdcurRec.empadvyn)){
			rxw.add_ColVal("Y");
		}else{
			rxw.add_ColVal("N");
		}	
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(acctcdcurRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>

