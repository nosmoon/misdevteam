<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_1610_LDataSet ds = (AD_DEP_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {  
	
		long tot_bsamt 			= 0;	//선수금잔액 
		long tot_misu_amt       = 0;    //미수금합계
		long tot_sunsu_amt 		= 0;    //선수금합계
				
		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_DEP_1610_LCURLISTRecord rec = (AD_DEP_1610_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "per_rcpm_slip_no", rec.per_rcpm_slip_no);
			rx.add(record, "yesu_amt", rec.yesu_amt);
			rx.add(record, "subseq", rec.subseq);
			rx.add(record, "dlco_nm2", rec.dlco_nm2);
			rx.add(record, "yesu_exch_amt", rec.yesu_exch_amt);
			rx.add(record, "sunsu_amt", rec.sunsu_amt);
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "sunsu_exch_amt", rec.sunsu_exch_amt);
			rx.add(record, "gita_exch_amt", rec.gita_exch_amt);
			rx.add(record, "gita_amt", rec.gita_amt);
			rx.add(record, "bsamt", rec.bsamt);	//선수금잔액 
			
			tot_bsamt         += StringUtil.toLong(rec.bsamt);
			tot_misu_amt      += StringUtil.toLong(rec.misu_amt);
			tot_sunsu_amt     += StringUtil.toLong(rec.sunsu_amt);
			
		}	
		
		int gridData2 = rx.add(resData, "gridData2", "");
				
		for(int i = 0; i<ds.curlist2.size(); i++) {
			AD_DEP_1610_LCURLIST2Record rec = (AD_DEP_1610_LCURLIST2Record)ds.curlist2.get(i);

			int record2 = rx.add(gridData2, "record2", "");
			
			rx.add(record2, "medi_nm", rec.medi_nm);
			rx.add(record2, "tot_yesu_amt", rec.tot_yesu_amt);
			rx.add(record2, "tot_yesu_exch_amt", rec.tot_yesu_exch_amt);
			rx.add(record2, "tot_sunsu_amt", rec.tot_sunsu_amt);
		}
		
		int resForm = rx.add(resData, "resForm", "");
		
		rx.add(resForm, "tot_bsamt", tot_bsamt);
		rx.add(resForm, "tot_misu_amt", tot_misu_amt);
		rx.add(resForm, "tot_sunsu_amt", tot_sunsu_amt);		
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
