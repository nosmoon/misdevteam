<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1440_l.jsp
* ��� : ������-�۾�-�̷�-���(�̷�)
* �ۼ����� : 2004-04-10
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-01
* ������ϸ� : ss_admin_1440_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_WRKHISTDataSet ds = (SS_L_WRKHISTDataSet)request.getAttribute("ds");
	String wlcnt = Util.checkString(request.getParameter("wrkListCount"));
	String wldtlcnt = Util.checkString(request.getParameter("wrkdtlListCount"));
	if(wlcnt.equals("")){
		wlcnt = "10";
	}
	
	if(wldtlcnt.equals("")){
		wldtlcnt = "5";
	}	
	long wrkListCount = Long.parseLong(wlcnt);
	long wrkdtlListCount = Long.parseLong(wldtlcnt);
	
	if(wrkListCount == 0){
	   wrkListCount = 5;
	}
	if(wrkdtlListCount == 0){
	   wrkdtlListCount = 10;
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_WRKHISTCURCOMMLISTRecord curcommlistRec = (SS_L_WRKHISTCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{	
			rxw.add_ColVal("workfrdt_f");
			rxw.add_ColVal("worktodt_f");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		
		rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.workfrdt,"yyyy-MM-dd' 'HH:mm:ss"));
		rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.worktodt,"yyyy-MM-dd' 'HH:mm:ss"));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
    
//    int wrkListCount = 5;		// �� ȭ��� ����Ʈ �׸� ��
//    int wrkdtlListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��(����)
%>
		  