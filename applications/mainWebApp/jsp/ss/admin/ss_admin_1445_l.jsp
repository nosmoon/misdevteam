<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1445_l.jsp
* ��� : ������-�۾�-�̷�-���(����)
* �ۼ����� : 2004-04-10
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-01
* ������ϸ� : ss_admin_1445_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_WRKDTLDataSet ds = (SS_L_WRKDTLDataSet)request.getAttribute("ds");
	String pagesize = Util.checkString(request.getParameter("pagesize"));
	//System.out.println("wldtlcnt:"+wldtlcnt);
	if(pagesize.equals("")){
		pagesize = "5";
	}	
	long wrkdtlListCount = Long.parseLong(pagesize);
	//System.out.println("wrkdtllistCount:"+wrkdtlListCount);
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	// ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.totalcnt)); // �ѰǼ�

  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "detailGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_WRKDTLCURCOMMLISTRecord curcommlistRec = (SS_L_WRKDTLCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{	
			rxw.add_ColVal("workfrdt_f");
			rxw.add_ColVal("worktodt_f");
			rxw.add_ColVal("errcd_f");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.workfrdt,"yyyy-MM-dd' 'HH:mm:ss"));
		rxw.add_ColVal(Util.Timestamp2Str(curcommlistRec.worktodt,"yyyy/MM/dd' 'HH:mm:ss"));
		if(!"".equals(curcommlistRec.errcd)){
			rxw.add_ColVal("["+curcommlistRec.errcd+"]");
		}
		rxw.add_ColVal(curcommlistRec.errmsg);
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
