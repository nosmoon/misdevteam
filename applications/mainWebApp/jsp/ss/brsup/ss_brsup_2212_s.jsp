<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2212_s.jsp
* ��� : ������������-Billing�ڵ���ü-�����ڰ���-�����ڻ�,���ΰ����
* �ۼ����� : 2004-04-08
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-09
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_SHFT_PYMT_IIDataSet ds = (SS_S_SHFT_PYMT_IIDataSet)request.getAttribute("ds");

    String vdtymm = "";
    String vdtyyy = "";
    String cnfm = Util.checkString(request.getParameter("cnfm"));

  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	SS_S_SHFT_PYMT_IIRSLTCURRecord rsltcurRec = null;
	if(ds.rsltcur.size()>0) {
		rsltcurRec = (SS_S_SHFT_PYMT_IIRSLTCURRecord)ds.rsltcur.get(0);

		if(rsltcurRec.vdtyprd.length() == 6) {
			vdtyyy = rsltcurRec.vdtyprd.substring(0, 4);
			vdtymm = rsltcurRec.vdtyprd.substring(4);
		}
		
		//��ü���ۿ�
		rxw.makeHugeListStart(resTemp, "aplyyymmCombo");
		rxw.addHugeListItem(Util.convertMonthS((rsltcurRec.aplyyymm)), rsltcurRec.aplyyymm);
		String tempDate = Util.getDate();
		for(int i=0; i<12; i++) {
			tempDate = Util.addMonth(tempDate, 1);
			rxw.addHugeListItem(Util.convertMonthS(tempDate.substring(0, 6)), tempDate.substring(0, 6));
		}
		rxw.makeHugeEnd();
		
		//detail ����
		rxw.makeDataToBulk(rsltcurRec, resTemp, "detailForm");
		//detail �߰�����
		int detailAdd = rxw.add(resTemp, "detailAdd", "");
		rxw.add(detailAdd, "vdtymm", vdtymm);
		rxw.add(detailAdd, "vdtyyy", vdtyyy);
		rxw.add(detailAdd, "cnfm", Util.checkString(request.getParameter("cnfm")));
		rxw.add(detailAdd, "aplcdt", Util.checkString(request.getParameter("pymtseq")).substring(0,8));
		rxw.add(detailAdd, "aplcno", Util.checkString(request.getParameter("pymtseq")).substring(8));
		rxw.add(detailAdd, "bankcd_org", rsltcurRec.bankcd);
		rxw.add(detailAdd, "acctno_org", rsltcurRec.acctno);
		rxw.add(detailAdd, "cardcmpycd_org", rsltcurRec.cardcmpycd);
		rxw.add(detailAdd, "cardno_org", rsltcurRec.cardno);
	}
	
	//���ΰ�� ���
	//rxw.makeDataToBulk(ds, "cntrcur", resTemp, "pymtcntrGrid");
	rxw.makeHugeStart(resTemp, "pymtcntrGrid", ds.cntrcur.size());
	String tempStr="";
	String flagStr="";
	int recIdx = 0;

	for(int i=0; i < ds.cntrcur.size(); i++)
	{
		SS_S_SHFT_PYMT_IICNTRCURRecord cntrcurRec = (SS_S_SHFT_PYMT_IICNTRCURRecord)ds.cntrcur.get(i);
		if(cntrcurRec.rdr_no==null || cntrcurRec.rdr_no.equals(""))
			continue;
		recIdx++;

		//title �߰�.
		if(recIdx == 1)
		{
			rxw.makeRecordToBulkTitle(cntrcurRec);
		}
		
		//������ �߰�.
		rxw.makeRecordToBulk(cntrcurRec, false);
	}
	rxw.makeHugeEnd();
		
	rxw.flush(out);
%>
