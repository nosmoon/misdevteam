<%@ page contentType="text/xml; charset=euc-kr" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_common_1510_p.jsp
* ��� 		 : ���˹��˻� �˾� (�����ȸ)
* �ۼ����� 	 : 2003-12-09
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
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    // getting dataset
    SL_L_BNSITEMDataSet ds = (SL_L_BNSITEMDataSet)request.getAttribute("ds");  // request dataset

    //application exception ó��-> ȭ�鿡�� ó��.
    /*if(ds.bnsitemcur.size() < 1){
        request.setAttribute("appException", new AppException("sl_common_1510_p.jsp(1)","�˻������ �������� �ʽ��ϴ�."));
        pageContext.forward("/jsp/ss/slcomm_jsp/app_error.jsp");
    }*/
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "curr_page_no", curr_page_no);
	rxw.add(resTemp, "total_records", ds.totalcnt);
	rxw.add(resTemp, "records_per_page", records_per_page);
	
	rxw.makeDataToBulk(ds, "bnsitemcur", resTemp, "listGrid");
	
	rxw.flush(out);
%>
