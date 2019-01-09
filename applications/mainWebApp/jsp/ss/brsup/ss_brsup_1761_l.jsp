<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1761_l.jsp
* ��� : ������������-Billing�ڵ���ü-�����ڰ���-�����ڸ��
* �ۼ����� : 2004-04-08
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-05
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_SHFT_PYMTDataSet ds = (SS_L_SHFT_PYMTDataSet)request.getAttribute("ds");

	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeHugeStart(root, "pymtGrid", ds.rsltcur.size());
	String tempStr = "";
	for(int i=0; i < ds.rsltcur.size(); i++)
	{
		SS_L_SHFT_PYMTRSLTCURRecord rsltcurRec = (SS_L_SHFT_PYMTRSLTCURRecord)ds.rsltcur.get(i);
		if(rsltcurRec.shftclsf.equals("110")) tempStr = rsltcurRec.acctno;
		if(rsltcurRec.shftclsf.equals("120") || rsltcurRec.shftclsf.equals("130")) tempStr = rsltcurRec.cardno;
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("acct_card");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(tempStr);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
