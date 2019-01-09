<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_NMD_4070_LDataSet ds = (AD_NMD_4070_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData 	= rx.add(root, "resData", "");
	int gridData 	= rx.add(resData, "gridData", "");
			
	try { 
		long   tot_sale_amt     = 0;
		long   tot_lftvr_amt    = 0;
		long   tot_refn_amt     = 0;
		long   tot_fee          = 0;
		long   tot_unclct_amt   = 0;
			
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_NMD_4070_LCURLISTRecord rec = (AD_NMD_4070_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "sale_stmt_issu_yn", rec.sale_stmt_issu_yn);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "chpn_slip_no", rec.chpn_slip_no);	
			rx.addCData(record, "readr_nm", rec.readr_nm);			
			rx.add(record, "read_stat", rec.read_stat);			
			rx.add(record, "tax_clsf", rec.tax_clsf);
			rx.add(record, "advt_yn", rec.advt_yn);			
			rx.add(record, "read_fr_dt", rec.read_fr_dt);
			rx.add(record, "stplt_time", rec.stplt_time);
			rx.add(record, "sale_amt", rec.sale_amt);			
			rx.add(record, "lftvr_amt", rec.lftvr_amt);
			rx.add(record, "suspns_dt", rec.suspns_dt);
			rx.add(record, "refn_time", rec.refn_time);
			rx.add(record, "refn_amt", rec.refn_amt);
			rx.add(record, "hndl_clsf", rec.hndl_clsf);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "dlco_no", rec.dlco_no);			
			rx.addCData(record, "agn", rec.agn);
			rx.add(record, "fee_rate", rec.fee_rate);
			rx.add(record, "fee", rec.fee);
			rx.add(record, "rcpm_clsf", rec.rcpm_clsf);
			rx.add(record, "tot_rcpm_amt", rec.tot_rcpm_amt);
			rx.add(record, "unclct_amt", rec.unclct_amt);
			rx.add(record, "clos_stat", rec.clos_stat);
			rx.add(record, "extn_no", rec.extn_no);
			rx.add(record, "grp_id", rec.grp_id);
			rx.add(record, "id", rec.id);

			tot_sale_amt   += StringUtil.toLong(rec.sale_amt);  
			tot_lftvr_amt  += StringUtil.toLong(rec.lftvr_amt);
			tot_refn_amt   += StringUtil.toLong(rec.refn_amt);
			tot_fee        += StringUtil.toLong(rec.fee);		
			tot_unclct_amt += StringUtil.toLong(rec.unclct_amt);			
				
		}
		int resForm = rx.add(resData, "resForm", "");
		
		rx.add(resForm, "tot_sale_amt", tot_sale_amt ); 
		rx.add(resForm, "tot_lftvr_amt", tot_lftvr_amt ); 
		rx.add(resForm, "tot_refn_amt", tot_refn_amt ); 
		rx.add(resForm, "tot_fee_amt", tot_fee ); 		
	    rx.add(resForm, "tot_unclct_amt", tot_unclct_amt); 			    
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

