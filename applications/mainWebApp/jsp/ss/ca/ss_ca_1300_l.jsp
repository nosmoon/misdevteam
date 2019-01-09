<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ss_ca_1300_l.jsp
* ���     : ���̹�����-���긶��-�ʱ�ȭ��� ��������
* �ۼ����� : 2005-07-27
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-02
* ������ϸ� : ss_ca_1300_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    //request process
    String closyymm   = Util.checkString(request.getParameter("closyymm"));               //���긶����
    String pageno     = Util.checkString(request.getParameter("pageno"));                 //����������

    //������ üũ
    if(pageno.equals("") || pageno == null){
        pageno  =  "1";
    }

    int listCount = 15;      //�� ȭ��� ����Ʈ �׸� ��
    applySession  = true;    //���� ���� ����

    //dataset �ν��Ͻ� ����κ�
	SS_L_CYBALON_CLOSPTCRDataSet ds = (SS_L_CYBALON_CLOSPTCRDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.closptcrcur.size());
	
	for(int i=0; i < ds.closptcrcur.size() ; i++)
	{
		SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord closptcrcurRec = (SS_L_CYBALON_CLOSPTCRCLOSPTCRCURRecord)ds.closptcrcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(closptcrcurRec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(closptcrcurRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
    
%>