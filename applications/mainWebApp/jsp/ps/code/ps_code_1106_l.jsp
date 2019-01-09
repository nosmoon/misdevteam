<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_code_1106_l.jsp
* ���     : ��ü �ڵ���� ����Ʈ
* �ۼ����� : 2004-02-23
* �ۼ���   : ���ȯ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-12
* ������ϸ� : ps_code_1106_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // ȭ�鿡 ������ ���μ�
    String records_per_page =   request.getParameter("records_per_page");
    // dataset �ν��Ͻ� ����κ�
    PS_L_SEPBK_CODEDataSet ds = (PS_L_SEPBK_CODEDataSet)request.getAttribute("ds");  // request dataset

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
		PS_L_SEPBK_CODECURCOMMLISTRecord rec = (PS_L_SEPBK_CODECURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("issuclsfnmdetail");
			
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		String str27 = Util.checkString(rec.getIssuclsfnm());   //���౸�и�
        if(str27.equals("@")) { str27 = "" ; }            	
		//������ �߰�.
		rxw.add_ColVal(str27);
        
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);
	
    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>

