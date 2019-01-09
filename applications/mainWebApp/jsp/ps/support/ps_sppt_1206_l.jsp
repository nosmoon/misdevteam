<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_sppt_1201_l.jsp
* ��� : ������������ ��ȸ
* �ۼ����� : 2003-12-08
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-17
* ������ϸ� : ps_sspt_1206_l.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    String records_per_page =   request.getParameter("records_per_page");
    // dataset �ν��Ͻ� ����κ�
    PS_L_DSCT_CATLDataSet ds = (PS_L_DSCT_CATLDataSet)request.getAttribute("ds");
    // �������� ȭ���� ������ Row��
    int records_non_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // ��ȸ ���.
    //rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "userGrid");
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		PS_L_DSCT_CATLCURCOMMLISTRecord curcommlistRec = (PS_L_DSCT_CATLCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("rdrno_detail");
			rxw.add_ColVal("from_to");
			rxw.add_ColVal("boprocynDesc");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal(curcommlistRec.rdr_no + "-" + curcommlistRec.medicd + "-" + curcommlistRec.termsubsno);
		rxw.add_ColVal(curcommlistRec.subsfrser_no + "-" + curcommlistRec.substoser_no);
		rxw.add_ColVal(curcommlistRec.boprocyn.equals("Y")? "ó���Ϸ�" : "��ó��");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
    
%>

