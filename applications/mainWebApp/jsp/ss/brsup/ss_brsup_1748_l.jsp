<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: ss_brsup_1748_l.jsp
* ���		: ������������-Billing�ڵ���ü-��û����-�űԽ�û�ʱ�ȭ�� �ʱ�ȭ
* �ۼ�����	: 2004-03-31
* �ۼ���	: ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-17
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_APLC_NEWDataSet ds = (SS_L_APLC_NEWDataSet)request.getAttribute("ds");

    String n = "1"; // �űԽ�û ���� ��׶��� �̹����̸��� ������ ����
    String e = ""; // ������û ���� ��׶��� �̹����̸��� ������ ����

    if("E".equals(request.getParameter("accflag"))) {
        n = "";
        e = "1";
    }
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//������û���� ����Ʈ -> ������.
	/*int pre_pymt_infoCombo = rxw.add(resTemp, "pre_pymt_infoCombo", "");
	int item = rxw.add(pre_pymt_infoCombo, "item", "");
    rxw.add(item, "label", "����");
	rxw.add(item, "value", "");
	rxw.add(item, "acctno", "");
	for(int i=0; i<ds.pymtcur.size(); i++){
		SS_L_APLC_NEWPYMTCURRecord pymtcurRec = (SS_L_APLC_NEWPYMTCURRecord)ds.pymtcur.get(i);
		
        item = rxw.add(pre_pymt_infoCombo, "item", "");
        rxw.add(item, "label", pymtcurRec.banknm);
    	rxw.add(item, "value", pymtcurRec.bankcd);
    	rxw.add(item, "acctno", pymtcurRec.acctno);
    }*/
	
	//�����ڵ� ����Ʈ
	rxw.makeDataToBulkList(ds, "bankcur", "cicdnm", "cicodeval", "����", "", resTemp, "recpinsttCombo");
    
 	//ī��� ����Ʈ
	rxw.makeDataToBulkList(ds, "cardcur", "cicdnm", "cicodeval", "����", "", resTemp, "cardcmpycdCombo");
 	
	//��û������
	rxw.makeHugeListStart(resTemp, "aplyyymmCombo");
	rxw.addHugeListItem("����", "");
	
	Calendar calendar = new GregorianCalendar(Locale.KOREA);
    calendar.add(Calendar.MONTH, 2);
    String tempStr = "";
    calendar.add(Calendar.MONTH, -1);

    for(int i=0; i<12; i++) {
        if(calendar.get(Calendar.MONTH)+1 < 10) {
            tempStr = "0" + String.valueOf(calendar.get(Calendar.MONTH)+1);
        } else {
            tempStr = String.valueOf(calendar.get(Calendar.MONTH)+1);
        }
        rxw.addHugeListItem(new StringBuffer().append(calendar.get(Calendar.YEAR)).append("��").append(calendar.get(Calendar.MONTH)+1).append("��").toString(), String.valueOf(calendar.get(Calendar.YEAR))+tempStr);
        calendar.add(Calendar.MONTH, 1);
    }
    rxw.makeHugeEnd();
    
    //�ű���ü��û���� ���
    rxw.makeHugeStart(resTemp, "listGrid", ds.rsltcur.size());
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_APLC_NEWRSLTCURRecord rsltcurRec = (SS_L_APLC_NEWRSLTCURRecord)ds.rsltcur.get(i);
        
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("idx");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal("");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	
	//��Ÿ������.
	int detailData = rxw.add(resTemp, "detailData", "");
	rxw.add(detailData, "bocd", request.getParameter("bocd"));
	rxw.add(detailData, "aplcdt", Util.getDate());
	rxw.add(detailData, "rdr_no", request.getParameter("rdr_no"));
	rxw.add(detailData, "accflag", "N");
	rxw.add(detailData, "shftclsf", "110");
	
	rxw.flush(out);
%>
