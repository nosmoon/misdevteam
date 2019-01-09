<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1510_s.jsp
* ��� : ������-����������-��
* �ۼ����� : 2005-01-28
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-04-01
* ������ϸ� : ss_admin_1510_l.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_BOCLOSDataSet ds = (SS_S_BOCLOSDataSet)request.getAttribute("ds");
    int mmListCount = 12;

    String bocd = Util.checkString(request.getParameter("bocd"));
    String yymm = Util.checkString(request.getParameter("yymm"));
    String detail_yymm = Util.checkString(request.getParameter("detail_yymm"));
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");
    
	// ��ȸ ���.
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "detailGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_S_BOCLOSCURCOMMLISTRecord curcommlistRec = (SS_S_BOCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.makeDataToBulk(ds, acctTemp, "detailData");
	rxw.add(acctTemp, "paramBocd", bocd); 
    rxw.add(acctTemp, "paramYymm", yymm);
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>

