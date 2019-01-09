<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1606_l.jsp
* ���     : ���+ ���ݿ����� �˻�
* �ۼ����� : 2004-04-23
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-23
* ������ϸ� : ps_rdr_1606_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //dataset �ν��Ͻ� ����κ�
    CO_L_RDRCRTS_GRAD_APLCDataSet ds = (CO_L_RDRCRTS_GRAD_APLCDataSet)request.getAttribute("ds");

	// �˻� ����Ʈ ī��Ʈ
	int recCount  =  ds.rdr_gradaplccur.size();

	// ���������� ������ ���ڵ� ��
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));

	//������ ����
	int k  =  0;
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
		
	//ó������
	rxw.makeDataToList(ds, "pusbocdcur", "bonm", "bocd", "����", "", acctTemp, "branchCombo"); // ����
    rxw.makeDataToList(ds, "dtlsprocstatcur", "cicdnm", "cicodeval", acctTemp, "moCombo2"); // ����ȸ��
    rxw.makeDataToList(ds, "errresncdcur", "cicdnm", "cicodeval", "����", "", acctTemp, "errCombo"); // ��������
    rxw.makeDataToList(ds, "cashrcptstatcur", "cicdnm", "cicodeval", acctTemp, "cashCombo2"); // ���ݿ�����
	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid");

	for(int i=0; i < ds.rdr_gradaplccur.size(); i++)
	{

		CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord rdr_gradaplccurRec = (CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord)ds.rdr_gradaplccur.get(i);
	
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			rxw.add_ColVal("INDEX");
			rxw.add_ColVal("bocdIndex");
			rxw.add_ColVal("dtlsprocstatIndex");
			rxw.add_ColVal("errresncdIndex");
			rxw.add_ColVal("cashrcptstatIndex");
			rxw.add_ColVal("tel_detail");
			rxw.add_ColVal("addr_detail");
			//rxw.add_ColVal("medicd");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rdr_gradaplccurRec);
		}

		//������ �߰�.
		rxw.add_ColVal("N");
		rxw.add_ColVal(i);
		rxw.add_ColVal(rdr_gradaplccurRec.bocd + i);
		rxw.add_ColVal(rdr_gradaplccurRec.dtlsprocstat + i);
		rxw.add_ColVal(rdr_gradaplccurRec.errresncd + i);
		rxw.add_ColVal(rdr_gradaplccurRec.recstat + i);
		rxw.add_ColVal(rdr_gradaplccurRec.home_tel_no + " / " + rdr_gradaplccurRec.ceph_no_1 + "-" + rdr_gradaplccurRec.ceph_no_2);
		rxw.add_ColVal(rdr_gradaplccurRec.addr + rdr_gradaplccurRec.dtlsaddr);
		//rxw.add_ColVal(rdr_gradaplccurRec.medicd);		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rdr_gradaplccurRec, false);		
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
	
%>
