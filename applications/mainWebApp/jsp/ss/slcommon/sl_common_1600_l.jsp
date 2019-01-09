<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_common_1600_l.jsp
* ��� 		 : ���� - ��ü�ڵ� ����Ʈ
* �ۼ����� 	 : 2003-12-12
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-02
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	// request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 9 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

	// getting dataset
    SL_L_BOMEDIDataSet ds = (SL_L_BOMEDIDataSet)request.getAttribute("ds");  // request dataset

    /* ���� ó�� ���� */
    if(ds.curcommlist.size() < 1){
        request.setAttribute("appException", new AppException("sl_common_1600_l.jsp(1)","��޸�ü�� �������� �ʽ��ϴ�."));
        pageContext.forward("/jsp/ss/slcomm_jsp/app_error.jsp");
        //rd.forward(request, response);
    }
    /* ���� ó�� �� */
    
    //TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeHugeStart(resTemp, "mediGrid", ds.curcommlist.size());
	SL_L_BOMEDICURCOMMLISTRecord curcommlistRec = null;
	for(int i=0; i<ds.curcommlist.size(); i++){
		curcommlistRec = (SL_L_BOMEDICURCOMMLISTRecord)ds.curcommlist.get(i);
        
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("chk");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal("");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
