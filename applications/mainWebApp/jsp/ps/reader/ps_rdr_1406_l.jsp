<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_rdr_1406_l.jsp
* ��� : ����-������ȸ ����Ʈ
* �ۼ����� : 2004-02-25
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-05
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // ȭ�鿡 ������ ���μ�
    String records_per_page =   request.getParameter("records_per_page");
	
    // dataset �ν��Ͻ� ����κ�
    PS_L_RDR_PUBL_SEARCHDataSet ds = (PS_L_RDR_PUBL_SEARCHDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.rdr_publcur.size();

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
   	//������ȸ ���
   	//rxw.makeDataToBulk(ds, "rdr_publcur", resTemp, "userGrid");
   	
   	rxw.makeHugeStart(resTemp, "userGrid");
	
	for(int i=0; i < ds.rdr_publcur.size() ; i++)
	{
		PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord rdr_publcurRec = (PS_L_RDR_PUBL_SEARCHRDR_PUBLCURRecord)ds.rdr_publcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("addr_detail");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rdr_publcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(rdr_publcurRec.dlvzip + " " + rdr_publcurRec.dlvaddr + " " + rdr_publcurRec.dlvdtlsaddr);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rdr_publcurRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
   	//rxw.flush(out);

    
%>

