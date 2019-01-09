<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_2620_l.jsp
* ���       : ����-�������(��ϰ˻�)
* �ۼ�����   : 2004-01-29
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-06
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    // request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
    //long records_per_page = ((String)request.getParameter("pagesize") == null)? 5 : Long.parseLong(request.getParameter("pagesize"));
    long records_per_page = ((String)request.getParameter("pagesize") == null)? 5000 : Long.parseLong(request.getParameter("pagesize"));
    long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

	System.out.println("curr_page_no:"+curr_page_no);
   	System.out.println("records_per_page:"+records_per_page);

    // getting dataset
    SL_L_DSCTDataSet ds = (SL_L_DSCTDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.totalcnt));
	
	rxw.makeHugeStart(resTemp, "listGrid", ds.dsctcur.size());
	SL_L_DSCTDSCTCURRecord dsctcurRec = null;
	for(int i=0; i<ds.dsctcur.size(); i++)
	{
		dsctcurRec = (SL_L_DSCTDSCTCURRecord)ds.dsctcur.get(i);
        
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("boprocyn_f");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(dsctcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal("N".equals(dsctcurRec.boprocyn) ? "��Ȯ��" : "Ȯ��");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(dsctcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
