<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1743_s.jsp
* ��� : ������������-Billing�ڵ���ü-��û����-������(����)����
* �ۼ����� : 2004-03-29
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-16
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_APLCDataSet ds = (SS_S_APLCDataSet)request.getAttribute("ds");
    SS_S_APLCRSLTCURRecord rsltcurRec = (SS_S_APLCRSLTCURRecord)ds.rsltcur.get(0);

    boolean closYn = false;	// �������� : true�̸� �������ڹ�ȣ�� ������ �� �ִ�.
    String trsmyn = Util.checkString(request.getParameter("trsmyn"));				// ���ۿ���
    String pymtinforflyn = Util.checkString(request.getParameter("pymtinforflyn"));	// ���������ݿ�����
    String closYnStr = null;

	// �������� => ���ۿ��ΰ� 'Y'�̰ų�, �Ա������ݿ����ΰ� 'Y'�̸� �������δ� true. ���º��� �� ���������� �� �� ����.
	if("Y".equals(trsmyn) || "Y".equals(pymtinforflyn)) {
		closYn = true;
		closYnStr = "Y";
	} else {
		closYn = false;
		closYnStr = "N";
	}
    boolean migryn = false;
    if("Y".equals(rsltcurRec.migryn)) {
    	migryn = true;
    }
    boolean mediyn = false;
    if(rsltcurRec.medicd!=null && !rsltcurRec.medicd.equals("")) {
        mediyn = true;
    }

   	StringBuffer rdrtel = new StringBuffer("");
   	if(rsltcurRec.rdrtel1!=null && !rsltcurRec.rdrtel1.equals("")) {
   		rdrtel.append(rsltcurRec.rdrtel1).append("-").append(rsltcurRec.rdrtel2).append("-").append(rsltcurRec.rdrtel3);
	} else {
		rdrtel.append(rsltcurRec.rdrtel2).append("-").append(rsltcurRec.rdrtel3);
	}
   	StringBuffer addr = new StringBuffer("");
   	if(rsltcurRec.zip.length()==6)
   		addr.append(rsltcurRec.zip.substring(0,3)).append("-").append(rsltcurRec.zip.substring(3, 6)).append(" ").append(rsltcurRec.dlvaddr).append(" ").append(rsltcurRec.dlvaddrdtls);

  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "bonm", Util.Uni2Ksc(Util.checkString(request.getParameter("bonm"))));
	rxw.add(resTemp, "botel", Util.checkString(request.getParameter("botel")));
	
	rxw.makeHugeStart(resTemp, "detailData", ds.rsltcur.size());
	//title �߰�.
	rxw.add_ColVal("aplcno");
	rxw.add_ColVal("shftclsf");
	rxw.add_ColVal("aplcdt");
	rxw.add_ColVal("bocd");
	rxw.add_ColVal("closyn");
	rxw.add_ColVal("pymtnmtel");
	rxw.add_ColVal("rdrtel");
	rxw.add_ColVal("addr");
	//������ �ʵ�� �ڵ� ����.
	rxw.makeRecordToBulkTitle(rsltcurRec);
	//������ �߰�.
	rxw.add_ColVal(request.getParameter("aplcno"));
	rxw.add_ColVal(request.getParameter("shftclsf"));
	rxw.add_ColVal(request.getParameter("aplcdt"));
	rxw.add_ColVal(Util.checkString(request.getParameter("bocd")));
	rxw.add_ColVal("Y".equals(trsmyn) || "Y".equals(pymtinforflyn) ? "Y" : "N");
	rxw.add_ColVal(new StringBuffer().append(rsltcurRec.pymtnm).append("(").append(Util.checkString(request.getParameter("pymttel"))).append(")"));
	rxw.add_ColVal(rdrtel);
	rxw.add_ColVal(addr);
	//������ �ʵ� �ڵ�����.
	rxw.makeRecordToBulk(rsltcurRec, false);
	rxw.makeHugeEnd();

	//��ü���ۿ�.
	rxw.makeHugeListStart(resTemp, "aplyyymmCombo");
	rxw.addHugeListItem(Util.convertMonthS((rsltcurRec.aplyyymm)), rsltcurRec.aplyyymm);
	String tempDate = Util.getDate();
	for(int i=0; i<12; i++) {
		tempDate = Util.addMonth(tempDate, 1);
		rxw.addHugeListItem(Util.convertMonthS(tempDate.substring(0, 6)), tempDate.substring(0, 6));
	}
	rxw.makeHugeEnd();
	
	//��ü.
	rxw.makeHugeListStart(resTemp, "medicdCombo");
	if(mediyn)
		rxw.addHugeListItem(rsltcurRec.medinm, rsltcurRec.medicd);
	else
		rxw.addHugeListItem("����", "");
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
