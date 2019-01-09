<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_common_1105_l.jsp
* ��� 		 : ���� �� ��ȸ �˾�
* �ۼ����� 	 : 2003-12-09
* �ۼ��� 	 : �迵��
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
	//long records_per_page = ((String)request.getParameter("pagesize") == null)? 4 : Long.parseLong(request.getParameter("pagesize"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 5000 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    // getting dataset
    SL_L_RDR_DTLS_SECHDataSet ds = (SL_L_RDR_DTLS_SECHDataSet)request.getAttribute("ds");

    if(ds.mmcur.size() < 1){
        request.setAttribute("appException", new AppException("sl_common_1105_l.jsp(1)","�˻������ �������� �ʽ��ϴ�."));
        pageContext.forward("/jsp/ss/slcomm_jsp/app_error.jsp");
    }

    SL_L_RDR_DTLS_SECHMMCURRecord rec1 = null; // ��ȸ�� ���� ����� ������ ���ڵ�
    rec1 = (SL_L_RDR_DTLS_SECHMMCURRecord)ds.mmcur.get(0);
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//caption ����
	rxw.makeDataToBulk(rec1, resTemp, "rdrDtlsSechmm");
	
	//��ȸ ����.
	rxw.makeHugeStart(resTemp, "listGrid", ds.rdrdtlscur.size());
	SL_L_RDR_DTLS_SECHRDRDTLSCURRecord rec = null;
    String str_realsubsamt;
	for(int i=0; i<ds.rdrdtlscur.size(); i++)
	{
		rec = (SL_L_RDR_DTLS_SECHRDRDTLSCURRecord)ds.rdrdtlscur.get(i);
        //�Ǳ����ݾ� õ�� ������ ��ģ��.
        str_realsubsamt = "" + rec.realsubsamt;
        str_realsubsamt = (str_realsubsamt.length() > 3 )? str_realsubsamt.substring(0, str_realsubsamt.length()-3) : "0" ;
        
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("seq");
			rxw.add_ColVal("dlvinfo");
			rxw.add_ColVal("rdr_no");
			rxw.add_ColVal("rdrnm");
			rxw.add_ColVal("addr");
			rxw.add_ColVal("rptvrdr_extndt");
			rxw.add_ColVal("rptvvalmm");
			rxw.add_ColVal("mediinfo");
			rxw.add_ColVal("clamtmthdcd");
			rxw.add_ColVal("valqty");
			rxw.add_ColVal("pre_valqty");
			rxw.add_ColVal("no_valqty");
			for(int j=1; j<13; j++)
			{
				String fld = new StringBuffer().append("m1_").append(j<10 ? "0" : "").append(j).toString();
				if(j<12)
					rxw.add_ColVal(fld);
				else
					rxw.add_RowVal(fld);
			}
			//������ �ʵ�� �ڵ� ����.
			//rxw.makeRecordToBulkTitle(stopcntrcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(start_no++);
		rxw.add_ColVal(Util.getChainStr(rec.dlvdstccd, rec.dlvno, rec.dlvintvno, "-"));
		rxw.add_ColVal(rec.rdr_no);
		rxw.add_ColVal(rec.rdrnm);
		rxw.add_ColVal(rec.addrnm + " " + rec.dlvdtlsaddr + " " + rec.dlvdong + " " + rec.dlvser_no + " " + rec.dlvbnji);
		rxw.add_ColVal(rec.rptvrdr_extndt);
		rxw.add_ColVal(rec.rptvvalmm);
		rxw.add_ColVal(new StringBuffer().append(rec.cimgtcd2).append("-").append(str_realsubsamt));
		rxw.add_ColVal(rec.clamtmthdcd);
		rxw.add_ColVal(rec.valqty);
		rxw.add_ColVal(rec.pre_valqty);
		rxw.add_ColVal(rec.no_valqty);
		for(int j=0; rec.m1!=null && j<12; j++)
		{
			String val = "";
			try{
				val = rec.m1.substring(j, j+1);
			}catch(Exception e){
				val = "";
			}
			if(j<11)
				rxw.add_ColVal(val);
			else
				rxw.add_RowVal(val);
		}
		//������ �ʵ� �ڵ�����.
		//rxw.makeRecordToBulk(stopcntrcurRec, false);
	}
	rxw.makeHugeEnd();
	
	int naviInfo = rxw.add(resTemp, "naviInfo", "");
	rxw.add(naviInfo, "curr_page_no", curr_page_no);
	rxw.add(naviInfo, "total_records", ds.totalcnt);
	rxw.add(naviInfo, "records_per_page", records_per_page);
	
	rxw.flush(out);
%>
