<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: ss_brsup_1750_l.jsp
* ���		: ������������-Billing�ڵ���ü-��û����-�ڵ���ü������û �ʱ�ȭ
* �ۼ�����	: 2004-04-01
* �ۼ���	: ���
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

    if("E".equals(request.getParameter("accflag"))) {
        n = "";
        e = "1";
    }
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//�ű���ü��û���� ���
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
	rxw.add(resTemp, "accflag", "E");
	
	rxw.flush(out);
%>
