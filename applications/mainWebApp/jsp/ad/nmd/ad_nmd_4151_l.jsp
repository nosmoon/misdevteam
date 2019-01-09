<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_NMD_4151_LDataSet ds = (AD_NMD_4151_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {  

		int resForm = rx.add( resData , "resForm" , "");
		
		rx.add(resForm, "occr_dt", ds.occr_dt);  
		rx.add(resForm, "slip_clsf", ds.slip_clsf);
		rx.add(resForm, "seq", ds.seq);
		rx.add(resForm, "medi_cd", ds.medi_cd);
		rx.add(resForm, "pubc_frdt", ds.pubc_frdt);
		rx.add(resForm, "pubc_todt", ds.pubc_todt);
		rx.add(resForm, "rcpm_plac_clsf", ds.rcpm_plac_clsf);  
		rx.add(resForm, "dlco_no", ds.dlco_no);
		rx.add(resForm, "dlco_nm", ds.dlco_nm);
		rx.add(resForm, "rcpm_tot_amt", ds.rcpm_tot_amt);
		rx.add(resForm, "pubc_tot_amt", ds.pubc_tot_amt);
		rx.add(resForm, "setoff_done_amt", ds.setoff_done_amt);
		
		rx.add(resForm, "setoff_tobe_amt", ds.setoff_tobe_amt);
		rx.add(resForm, "final_setoff_yn", ds.final_setoff_yn);
		rx.add(resForm, "setoff_sum_amt", "0");
		rx.add(resForm, "tmp_setoff_tobe_amt", ds.setoff_tobe_amt);
		
		int gridData = rx.add( resData , "gridData" , "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_NMD_4151_LCURLISTRecord rec = (AD_NMD_4151_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			rx.add(record, "setoff_yn", "N");
			rx.add(record, "setoff_advt_fee", rec.rcpm_advt_fee);
			rx.add(record, "setoff_advt_vat", rec.rcpm_vat);
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "advt_fee", rec.advt_fee);			
			rx.add(record, "vat", rec.vat);			
			rx.add(record, "unrcpm_amt", rec.unrcpm_fee + rec.unrcpm_vat);			
			rx.add(record, "medi_nm", rec.medi_nm);			
			rx.add(record, "medi_cd", rec.medi_cd);		
			rx.add(record, "unrcpm_fee", rec.unrcpm_fee);			
			rx.add(record, "unrcpm_vat", rec.unrcpm_vat);			
		}	
		
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>