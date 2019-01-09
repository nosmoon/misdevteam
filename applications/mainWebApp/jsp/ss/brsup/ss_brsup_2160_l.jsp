<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brsup_2160_l.jsp
* ��� 	 	 : ��������-������Ȳ-���
* �ۼ����� 	 : 2004-04-23
* �ۼ��� 	 : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-30
* ������ϸ� : ss_brsup_2160_l.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_ISLEAF_SCATDataSet ds = (SS_L_ISLEAF_SCATDataSet)request.getAttribute("ds");  // request dataset
    int isleafListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    String strCompnm = "����";

    if( request.getParameter("compnm").equals("IS") ) {
      strCompnm += "(<b>IS</b>)";
    } else if( request.getParameter("compnm").equals("AD") ) {
      strCompnm += "(<b>AD</b>)";
    }
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
    //int dataTemp = rxw.makeParentNode(acctTemp, "dataTemp");
    
    rxw.makeDataToList(ds, "curadvtlist", "advtlist", "advtlist", "=====�����ü=====", "", acctTemp, "ADCombo"); // ������
    

    //System.out.println("======================================");
    //System.out.println("count: " + ds.curcommlist.size() + " ");
    //System.out.println("======================================");

 	// ��ȸ ���.
 	//rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // �ѰǼ�
    rxw.add(acctTemp, "IstotalCount", Util.comma(ds.getIstotalcnt())); // ����IS
    rxw.add(acctTemp, "IstotalAmt", Util.comma(ds.getIstotalamt())); // ����IS
    rxw.add(acctTemp, "AdtotalCount", Util.comma(ds.getAdtotalcnt())); // ����AD
    rxw.add(acctTemp, "AdtotalAmt", Util.comma(ds.getAdtotalamt())); // ����AD
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt())); // �ѰǼ�
    rxw.add(acctTemp, "totalAmt", Util.comma(ds.getTotalamt())); // �Ѿ�
    
    System.out.println("================================");
    System.out.println("================================");
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_ISLEAF_SCATCURCOMMLISTRecord curcommlistRec = (SS_L_ISLEAF_SCATCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			//rxw.add_ColVal("tel_no_detail");
			
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		//rxw.add_ColVal(""));
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
