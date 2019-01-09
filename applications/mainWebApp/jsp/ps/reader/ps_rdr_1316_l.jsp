<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_rdr_1316_l.jsp
* ��� : ����ó�� �񱳴�󳻿� ��ȸ
* �ۼ����� : 2004-02-25
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-13
* ������ϸ� : ps_rdr_1316_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // ȭ�鿡 ������ ���μ�
    String records_per_page =   "5" ;
    // dataset �ν��Ͻ� ����κ�
    PS_L_ARBT_CMPROBJDataSet ds = (PS_L_ARBT_CMPROBJDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
		
	//ó������
	//rxw.makeDataToList(ds, "aprvproccd", "cicdnm", "cicodeval", "��ü", "", acctTemp, "aprvCombo");
	
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "detailGrid");

	for(int i=0; i < ds.curcommlist.size(); i++)
	{

		PS_L_ARBT_CMPROBJCURCOMMLISTRecord curcommlistRec = (PS_L_ARBT_CMPROBJCURCOMMLISTRecord)ds.curcommlist.get(i);
	
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("addr_detail");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal(new StringBuffer().append("").append(curcommlistRec.dlvzip).append(" ").append(curcommlistRec.dlvaddr).append(" ").append(curcommlistRec.dlvdtlsaddr));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
	
%>

