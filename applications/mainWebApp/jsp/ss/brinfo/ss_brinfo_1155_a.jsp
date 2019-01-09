<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : ss_brinfo_1155_a.jsp
* ��� 		 : ������°��� �ʱ�ȭ��
* �ۼ����� 	 :
* �ۼ��� 	 :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : Ȳ����
* �������� : 20090122
* ������ϸ� : ss_brinfo_1155_a.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    //	dataset �ν��Ͻ� ����κ�
    //SS_L_BOACCT_LISTDataSet ds = (SS_L_BOACCT_LISTDataSet)request.getAttribute("ds");  // request dataset
    SS_L_BOACCT_LISTDataSet ds = (SS_L_BOACCT_LISTDataSet)request.getAttribute("ds");  // request dataset
    //int listCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int listCount = 5000;
    String incmgpers = Util.getSessionParameterValue(request, "uid", true);
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "getAcctTemp");
    
  	//acctitem ó�� - ��ȸ��
    rxw.makeDataToList(ds, "accitmcur", "cicdnm", "cicodeval", "��ü", "", acctTemp, "acctItemSearchCombo");

    //acctitem ó�� - �Է¿�
    rxw.makeDataToList(ds, "accitmcur", "cicdnm", "cicodeval", "����", "", acctTemp, "acctItemCombo");

    //������� ó��.
    rxw.makeDataToList(ds, "bankcur", "cicdnm", "cicodeval", "����", "", acctTemp, "bankCombo");

   	//������ȸ ���.
   	//makeDataToXml(ds, "curcommlist", acctTemp, "acctGrid", rx);
   	//rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "acctGrid");
   	
   	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "acctGrid", ds.curcommlist.size());

	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_BOACCT_LISTCURCOMMLISTRecord rec = (SS_L_BOACCT_LISTCURCOMMLISTRecord)ds.curcommlist.get(i);
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}

		rxw.add_ColVal("");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
    //System.out.println(rx.getXml());
    //out.println(rx.xmlFlush());
	//out.println(rx.xmlEndFlush());
	rxw.flush(out);

    //data�� ���� ��� ó��. �߰� �ʿ�.
        
    //page ó��. �߰� �ʿ�.
%>





