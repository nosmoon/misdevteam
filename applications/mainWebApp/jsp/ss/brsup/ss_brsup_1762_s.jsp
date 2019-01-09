<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1762_s.jsp
* 기능 : 지국업무지원-Billing자동이체-납부자관리-납부자상세,납부계약목록
* 작성일자 : 2004-04-08
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-06
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_SHFT_PYMTDataSet ds = (SS_S_SHFT_PYMTDataSet)request.getAttribute("ds");

    String vdtymm = "";
    String vdtyyy = "";
    String cnfm = Util.checkString(request.getParameter("cnfm"));


	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	SS_S_SHFT_PYMTRSLTCURRecord rsltcurRec = null;
	if(ds.rsltcur.size()>0) {
		rsltcurRec = (SS_S_SHFT_PYMTRSLTCURRecord)ds.rsltcur.get(0);

		if(rsltcurRec.vdtyprd.length() == 6) {
			vdtyyy = rsltcurRec.vdtyprd.substring(0, 4);
			vdtymm = rsltcurRec.vdtyprd.substring(4);
		}
			
		//이체시작월
		rxw.makeHugeListStart(resTemp, "aplyyymmCombo");
		rxw.addHugeListItem(Util.convertMonthS((rsltcurRec.aplyyymm)), rsltcurRec.aplyyymm);
		String tempDate = Util.getDate();
		for(int i=0; i<12; i++) {
			tempDate = Util.addMonth(tempDate, 1);
			rxw.addHugeListItem(Util.convertMonthS(tempDate.substring(0, 6)), tempDate.substring(0, 6));
		}
		rxw.makeHugeEnd();
		
		//detail 정보
		rxw.makeDataToBulk(rsltcurRec, resTemp, "detailForm");
		//detail 추가정보
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
	
	//납부계약 목록
	//rxw.makeDataToBulk(ds, "cntrcur", resTemp, "pymtcntrGrid");
	rxw.makeHugeStart(resTemp, "pymtcntrGrid", ds.cntrcur.size());
	String tempStr="";
	String flagStr="";
	int recIdx = 0;
	for(int i=0; i < ds.cntrcur.size(); i++)
	{
		SS_S_SHFT_PYMTCNTRCURRecord cntrcurRec = (SS_S_SHFT_PYMTCNTRCURRecord)ds.cntrcur.get(i);
		if(cntrcurRec.rdr_no==null || cntrcurRec.rdr_no.equals(""))
			continue;
		recIdx++;
		
		if(cntrcurRec.shftstatclsfnm!=null && cntrcurRec.shftstatclsfcd.equals("20"))
		{
			tempStr="해지신청";	///html/comm_img/bu_he01.gif
			flagStr="E";
		}
		else
		{
			tempStr="신규신청";	///html/comm_img/bu_new02.gif
			flagStr="N";
		}
		
		//title 추가.
		if(recIdx == 1)
		{
			rxw.add_ColVal("action");
			rxw.add_ColVal("accflag");
			rxw.add_ColVal("pymtseq");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(cntrcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(tempStr);
		rxw.add_ColVal(flagStr);
		rxw.add_ColVal(rsltcurRec==null?"":rsltcurRec.pymtseq);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(cntrcurRec, false);
	}
	rxw.makeHugeEnd();
		
	rxw.flush(out);
%>

