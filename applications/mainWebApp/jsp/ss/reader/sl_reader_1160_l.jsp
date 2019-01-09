<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1160_l.jsp
* ���       : ������������(���������˾�-�޵����������ȸ)
* �ۼ�����   : 2003-12-12
* �ۼ���     : �迵��
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
    SL_L_VSPTCRDataSet ds = (SL_L_VSPTCRDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "curr_page_no", curr_page_no);
	rxw.add(resTemp, "total_records", ds.totalcnt);
	rxw.add(resTemp, "datanotexist", String.valueOf(ds.vsptcrcur.size()==0));
	
	rxw.makeHugeStart(resTemp, "suspGrid", ds.vsptcrcur.size());
	SL_L_VSPTCRVSPTCRCURRecord vsptcrcurRec = null;
	for(int i=0; i<ds.vsptcrcur.size(); i++){
	    vsptcrcurRec = (SL_L_VSPTCRVSPTCRCURRecord)ds.vsptcrcur.get(i);
        
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("duration");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(vsptcrcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(new StringBuffer().append(Util.convertS(vsptcrcurRec.suspfrdt)).append(" - ").append(Util.convertS(vsptcrcurRec.susptodt)));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(vsptcrcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
