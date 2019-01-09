<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_code_1306_l.jsp
* ��� : ���ʽ��ϰ��� ����Ʈ
* �ۼ����� : 2004-01-12
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-12
* ������ϸ� : ps_code_1306_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // ȭ�鿡 ������ ���μ�
    String records_per_page =   request.getParameter("records_per_page");
    // dataset �ν��Ͻ� ����κ�
    PS_L_BNSBKDataSet ds = (PS_L_BNSBKDataSet)request.getAttribute("ds");  // request dataset
	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
   	//rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "infoGrid");
    
    //record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "infoGrid");
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		PS_L_BNSBKCURCOMMLISTRecord rec = (PS_L_BNSBKCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("remk_detail");
			rxw.add_ColVal("vipcont_detail");
			
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		String str4 = Util.convertS(rec.getBgnvdtydt());    //�����������
        String str5 = Util.convertS(rec.getEndvdtydt());	//���븶��������
        String str6 = Util.replace(Util.checkString(Util.convertNull(rec.getVipcont(),"")),"&nbsp;","");    //�ֿ䳻��
        String str7 = Util.replace(Util.checkString(Util.convertNull(rec.getRemk(),"")), "&nbsp;", "");
               	
		//������ �߰�.
		rxw.add_ColVal(str4 + " ~ "+ str5 + " " + str7);
		rxw.add_ColVal(str6);
        
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>