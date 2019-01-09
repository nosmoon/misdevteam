<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: sl_reader_1395_l.jsp
* ���		: ����-������������-�ڵ���ü��û �ʱ�ȭ
* �ۼ�����	: 2003-12-27
* �ۼ���	: ���

* ��������	:
* ������	:
* �������� 	:
* ������ϸ�:
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-08
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SL_L_APLC_NEWDataSet ds = (SL_L_APLC_NEWDataSet)request.getAttribute("ds");

    String n = "1"; // �űԽ�û ���� ��׶��� �̹����̸��� ������ ����
    String e = ""; // ������û ���� ��׶��� �̹����̸��� ������ ����
    String c = ""; // ��ü�����ȯ ���� ��׶��� �̹����̸��� ������ ����

    if("E".equals(request.getParameter("accflag"))) {
        n = "";
        e = "1";
    }

    if("C".equals(request.getParameter("accflag"))) {
        n = "";
        e = "";
        c = "1";
    }
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//������û���� ����Ʈ -> ������.
	rxw.makeDataToBulkList(ds, "pymtcur", "banknm", "acctno", "����", "", resTemp, "pymtcurCombo");
	
	//�����ڵ� ����Ʈ
	rxw.makeDataToBulkList(ds, "bankcur", "cicdnm", "cicodeval", "����", "", resTemp, "recpinsttCombo");
	
	//ī��� ����Ʈ
	rxw.makeDataToBulkList(ds, "cardcur", "cicdnm", "cicodeval", "����", "", resTemp, "cardcmpycdCombo");
	
	//��û������
	rxw.makeHugeListStart(resTemp, "aplyyymmCombo");
	rxw.addHugeListItem("����", "");
	
	Calendar calendar = new GregorianCalendar(Locale.KOREA);
    calendar.add(Calendar.MONTH, 1);
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
		SL_L_APLC_NEWRSLTCURRecord rsltcurRec = (SL_L_APLC_NEWRSLTCURRecord)ds.rsltcur.get(i);
        
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
	rxw.add(detailData, "aplcdt", Util.getDate());
	rxw.add(detailData, "accflag", "N");
	rxw.add(detailData, "shftclsf", "110");
	
	rxw.flush(out);
%>
