<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1150_l.jsp
* ���       : ������������(���������˾�-�������������ȸ)
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
    SL_L_NWSPSUBSCNTRPTCRDataSet ds = (SL_L_NWSPSUBSCNTRPTCRDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "curr_page_no", curr_page_no);
	rxw.add(resTemp, "total_records", ds.totalcnt);
	rxw.add(resTemp, "datanotexist", String.valueOf(ds.nwspsubscntrcur.size()==0));
	
	rxw.makeHugeStart(resTemp, "subsGrid", ds.nwspsubscntrcur.size());
	SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord nwspsubscntrcurRec = null;
	for(int i=0; i<ds.nwspsubscntrcur.size(); i++){
	    nwspsubscntrcurRec = (SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(i);
        
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("duration");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(nwspsubscntrcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(new StringBuffer().append(Util.convertS(nwspsubscntrcurRec.rdr_extndt)).append(" ~ ").append("".equals(nwspsubscntrcurRec.suspdt)? "����" : Util.convertS(nwspsubscntrcurRec.suspdt)));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(nwspsubscntrcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
