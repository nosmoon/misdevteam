<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: ss_brsup_1755_l.jsp
* ���		: ��������-����_�ڵ���ü-��û����-��ü�����ȯ �ʱ�ȭ��
* �ۼ�����	: 2003-12-29
* �ۼ���	: ���
* ���		: ��ü�����ȯ ������� ������û ����ϰ� ����.
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-17
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_APLC_EXPYDataSet ds = (SS_L_APLC_EXPYDataSet)request.getAttribute("ds");

    String n = "1"; // �űԽ�û ���� ��׶��� �̹����̸��� ������ ����
    String e = ""; // ������û ���� ��׶��� �̹����̸��� ������ ����
    String c = ""; // ��ü�����ȯ ���� ��׶��� �̹����̸��� ������ ����

    if("E".equals(request.getParameter("accflag"))) {
        n = "";
        e = "1";
        c = "";
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
	
	//��ü�����ȯ���� ���
    rxw.makeHugeStart(resTemp, "listGrid", ds.rsltcur.size());
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_APLC_EXPYRSLTCURRecord rsltcurRec = (SS_L_APLC_EXPYRSLTCURRecord)ds.rsltcur.get(i);
        
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
	
	rxw.add(resTemp, "bocd", request.getParameter("bocd"));
	rxw.add(resTemp, "rdr_no", request.getParameter("rdr_no"));
	rxw.add(resTemp, "accflag", "C");
	
	rxw.flush(out);
%>
