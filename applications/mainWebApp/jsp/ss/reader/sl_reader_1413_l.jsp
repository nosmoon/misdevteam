<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: sl_reader_1413_l.jsp
* ���		: ����-������������-��ü�����ȯ �ʱ�ȭ
* �ۼ�����	: 2003-12-29
* �ۼ���	: ���

* ��������	:
* ������	:
* �������� 	:
* ������ϸ�:

* ���		: ��ü�����ȯ ������� ������û ����ϰ� ����.
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-08
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SL_L_APLC_EXPYDataSet ds = (SL_L_APLC_EXPYDataSet)request.getAttribute("ds");

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
	
	//������û���� ���
    rxw.makeHugeStart(resTemp, "listGrid", ds.rsltcur.size());
	for(int i=0; i<ds.rsltcur.size(); i++){
		SL_L_APLC_EXPYRSLTCURRecord rsltcurRec = (SL_L_APLC_EXPYRSLTCURRecord)ds.rsltcur.get(i);
        
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
	
	rxw.add(resTemp, "accflag", request.getParameter("accflag"));
	
	rxw.flush(out);
%>
