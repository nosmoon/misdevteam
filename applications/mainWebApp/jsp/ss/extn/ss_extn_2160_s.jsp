<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2160_l.jsp
* ��� : Ȯ����Ȳ-����/������Ȳ ����ȸ
* �ۼ����� : 2009-05-28
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ : 
* �������� :
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_EXTN_EDURDRDataSet ds = (SS_S_EXTN_EDURDRDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
  	//rxw.makeDataToBulk(ds, "rdrlist", resTemp, "detailGrid");
    
  //record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(resTemp, "detailGrid", ds.rdrlist.size());
	
	for(int i=0; i < ds.rdrlist.size() ; i++)
	{
		SS_S_EXTN_EDURDRRDRLISTRecord curcommlistRec = (SS_S_EXTN_EDURDRRDRLISTRecord)ds.rdrlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.		
		rxw.add_ColVal("");
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>


