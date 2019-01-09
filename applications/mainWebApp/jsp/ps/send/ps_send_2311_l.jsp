<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_1211_l.jsp
* ��� : ��ü �ϰ��߼� �߼�ó�� �߼۹���� ����ȸ
* �ۼ����� : 2004-03-03
* �ۼ��� : ���ȯ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-10
* ������ϸ� : ps_send_2311_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = request.getParameter("records_per_page");
    // dataset �ν��Ͻ� ����κ�
    PS_L_BOSEND_LUMPDataSet ds = (PS_L_BOSEND_LUMPDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    //rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "detailGrid");
   	
	//rxw.flush(out);
	
	rxw.makeHugeStart(acctTemp, "detailGrid");
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		PS_L_BOSEND_LUMPCURCOMMLISTRecord rec = (PS_L_BOSEND_LUMPCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("rdr_no_detail");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(new StringBuffer().append(rec.rdr_no).append("-").append(rec.medicd).append("-").append(rec.termsubsno));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
	
    //data�� ���� ��� ó��. �߰� �ʿ�.
        
    //page ó��. �߰� �ʿ�.
%>
