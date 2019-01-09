<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1771_l.jsp
* ��� : ������������-Billing�ڵ���ü-û���������-������û��������
* �ۼ����� : 2004-04-15
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-16
* ������ϸ� : ss_brsup_1771_l.jsp.bak
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_CLAM_SSUMDataSet ds = (SS_L_CLAM_SSUMDataSet)request.getAttribute("ds");
    //int moveListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;	// �� ȭ��� ����Ʈ �׸� ��
	
    //TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", String.valueOf(ds.getTotalcnt()));
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", moveListCount);
	
	//rxw.makeDataToBulk(ds, "rsltcur", resTemp, "listGrid");
	rxw.makeHugeStart(resTemp, "listGrid", ds.rsltcur.size());

	int no = (Integer.parseInt(request.getParameter("pageno")) - 1)* Integer.parseInt(request.getParameter("pagesize")) + 1;
	
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_CLAM_SSUMRSLTCURRecord rsltcurRec = (SS_L_CLAM_SSUMRSLTCURRecord)ds.rsltcur.get(i);
        
        if(i == 0)
		{
			rxw.add_ColVal("no_f");
			rxw.add_ColVal("boTel");
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
        
        rxw.add_ColVal(no+i);
		if(rsltcurRec.tel_no11==null && rsltcurRec.tel_no11.trim().equals("")) {
			rxw.add_ColVal(rsltcurRec.tel_no12 + "-" + rsltcurRec.tel_no13);
		}else{
			rxw.add_ColVal(rsltcurRec.tel_no11 + "-" + rsltcurRec.tel_no12 + "-" + rsltcurRec.tel_no13);
		}
     
        rxw.makeRecordToBulk(rsltcurRec, false);
    }
	rxw.makeHugeEnd();        

	rxw.flush(out);

%>