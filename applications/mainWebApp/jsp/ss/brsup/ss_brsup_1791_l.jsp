<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1791_l.jsp
* ��� : ������������-Billing�ڵ���ü-��û/�������-�����ȸ
* �ۼ����� : 2005-01-11
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-24
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_SHFTAPLCEXPY_STCSDataSet ds = (SS_L_SHFTAPLCEXPY_STCSDataSet)request.getAttribute("ds");
    //int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;

  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//rxw.makeDataToBulk(ds, "rsltcur", resTemp, "listGrid");
	rxw.makeHugeStart(resTemp, "listGrid", ds.rsltcur.size());
	long tot_agg = 0;
	for(int i=0; i < ds.rsltcur.size(); i++)
	{
		SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord rsltcurRec = (SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord)ds.rsltcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("title");
			rxw.add_ColVal("accu");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//������ �߰�.
		tot_agg += rsltcurRec.total;
		rxw.add_ColVal(rsltcurRec.title2 + " " + rsltcurRec.title1);
		rxw.add_ColVal(tot_agg);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
