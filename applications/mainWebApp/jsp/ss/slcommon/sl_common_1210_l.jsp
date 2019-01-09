<%@ page contentType="text/xml;charset=euc-kr"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_common_1210_l.jsp
* ��� 		 : ���� Ȯ���� �˻� (�����ȸ)
* �ۼ����� 	 : 2003-12-13
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-01
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	// request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	//long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 5000 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    // getting dataset
    SL_L_EXTNPERSDataSet ds = (SL_L_EXTNPERSDataSet)request.getAttribute("ds");  // request dataset

    //application exception ó��	-> ȭ�鿡�� ó��.
    /*if(ds.curcommlist.size() < 1){
        request.setAttribute("appException", new AppException("sl_common_1210_l.jsp(1)","�˻������ �������� �ʽ��ϴ�."));
        pageContext.forward("/jsp/ss/slcomm_jsp/app_error.jsp");
    }*/
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "curr_page_no", curr_page_no);
	rxw.add(resTemp, "total_records", ds.totalcnt);
	rxw.add(resTemp, "records_per_page", records_per_page);
	
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	SL_L_EXTNPERSCURCOMMLISTRecord rec = null;
	for(int i=0; i<ds.curcommlist.size(); i++){
		rec = (SL_L_EXTNPERSCURCOMMLISTRecord)ds.curcommlist.get(i);
        
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("seq");
			rxw.add_ColVal("uniqeno");
			rxw.add_ColVal("tel_no");
			rxw.add_ColVal("ptph_no");
			//���� �״�� ���.
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(start_no++);
		rxw.add_ColVal("".equals(rec.stafno)? rec.boemp_no : rec.stafno);
		rxw.add_ColVal(Util.getChainStr(rec.tel_no1, rec.tel_no2, rec.tel_no3, "-"));
		rxw.add_ColVal(Util.getChainStr(rec.ptph_no1, rec.ptph_no2, rec.ptph_no3, "-"));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

