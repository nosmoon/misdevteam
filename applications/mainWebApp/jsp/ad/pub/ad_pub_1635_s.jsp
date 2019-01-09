<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_1635_SDataSet ds = (AD_PUB_1635_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");
	int resForm = rx.add(root, "resForm", "");

	try { 

		long pubc_tot_amt = StringUtil.toNumber(ds.pubc_tot_amt);
		long fee		  = StringUtil.toNumber(ds.fee);	
		
		rx.add(resForm, "medi_cd", ds.medi_cd );
		rx.add(resForm, "hndl_clsf", ds.hndl_clsf ); 
		rx.add(resForm, "dlco_no", ds.dlco_no );
		rx.add(resForm, "dlco_nm", ds.dlco_nm );
		rx.add(resForm, "advt_cont", ds.advt_cont );
		rx.add(resForm, "pubc_side", ds.pubc_side );
		rx.add(resForm, "issu_ser_no", ds.issu_ser_no );
		rx.add(resForm, "publ_std", ds.publ_std );
		rx.add(resForm, "advt_fee", ds.advt_fee );
		rx.add(resForm, "vat", ds.vat );
		rx.add(resForm, "pubc_tot_amt", ds.pubc_tot_amt );
		rx.add(resForm, "agn", ds.agn );
		rx.add(resForm, "agn_nm", ds.agn_nm );
		rx.add(resForm, "fee_rate", ds.fee_rate );
		rx.add(resForm, "fee", ds.fee );
		rx.add(resForm, "hndl_plac_cd", ds.hndl_plac_cd );
		rx.add(resForm, "hndl_plac_nm", ds.hndl_plac_nm );
		rx.add(resForm, "coms_rate", ds.coms_rate );
		rx.add(resForm, "coms", ds.coms );
		rx.add(resForm, "indt_clsf", ds.indt_clsf );
		rx.add(resForm, "indt_clsf_nm", ds.indt_clsf_nm );
		rx.add(resForm, "mony_kind", ds.mony_kind );
		rx.add(resForm, "type_clsf", ds.type_clsf );
		rx.add(resForm, "type_clsf_nm", ds.type_clsf_nm );
		rx.add(resForm, "exrate", ds.exrate );
		rx.add(resForm, "chro_clsf", ds.chro_clsf );
		rx.add(resForm, "frex_cntr_amt", ds.frex_cntr_amt );
		rx.add(resForm, "nwsp_type_clsf", ds.nwsp_type_clsf );
		rx.add(resForm, "book_appndx_clsf", ds.book_appndx_clsf );
		rx.add(resForm, "slcrg_pers", ds.slcrg_pers );
		rx.add(resForm, "slcrg_pers_nm", ds.slcrg_pers_nm );
		rx.add(resForm, "dept_cd", ds.dept_cd );
		rx.add(resForm, "dept_nm", ds.dept_nm );
		rx.add(resForm, "mchrg_pers", ds.mchrg_pers );
		rx.add(resForm, "mchrg_pers_nm", ds.mchrg_pers_nm );
		rx.add(resForm, "rtax_yn", ds.rtax_yn );
		rx.add(resForm, "govern_advt_yn", ds.govern_advt_yn );
		rx.add(resForm, "advcs_offr_yn", ds.advcs_offr_yn );
		rx.add(resForm, "remk", ds.remk );
		rx.add(resForm, "proc_dt", ds.proc_dt);
		rx.add(resForm, "proc_seq", ds.proc_seq);
		rx.add(resForm, "pubc_dt", ds.pubc_dt);
		rx.add(resForm, "pubc_occr_seq", ds.pubc_occr_seq);
		rx.add(resForm, "pubc_occr_dt", ds.pubc_occr_dt);
		rx.add(resForm, "upd_resn", ds.upd_resn );
		rx.add(resForm, "upd_cont", ds.upd_cont );
		rx.add(resForm, "pre_pubc_slip_no", ds.pre_pubc_slip_no);
		rx.add(resForm, "pre_pubc_slip_no_crte_dt", ds.pre_pubc_slip_no_crte_dt);
		rx.add(resForm, "upd_yn", ds.upd_yn);
		rx.add(resForm, "div_yn", ds.div_yn);
		rx.add(resForm, "clos_stat", ds.clos_stat);
		rx.add(resForm, "clamt_stat", ds.clamt_stat); 
		rx.add(resForm, "sale_stmt_issu_yn", ds.sale_stmt_issu_yn);
		rx.add(resForm, "purc_stmt_issu_yn", ds.purc_stmt_issu_yn);
		rx.add(resForm, "elec_tax_stmt_yn", ds.elec_tax_stmt_yn);
		rx.add(resForm, "tax_email", ds.tax_email);
		rx.add(resForm, "tax_clsf", ds.tax_clsf);
		rx.add(resForm, "advt_clsf",ds.advt_clsf); 
		rx.add(resForm, "patr_chrg_info",ds.patr_chrg_info);
								
		rx.add(resForm, "preng_occr_dt", "");
		rx.add(resForm, "preng_occr_seq", "");
		
		rx.add(resForm, "sel_rate", "R"); 
/*		
		if(pubc_tot_amt > 0 && fee > 0){
			double real_rate = 0.0d;
			double tot_rate  = 0.0d;
			double net_rate  = 0.0d;
			real_rate = ((double)fee/(double)pubc_tot_amt) * 100;
			rx.add(resForm, "real_rate", DigitUtil.cutUnderPoint(real_rate, 1)); 
			rx.add(resForm, "real_rate_bool", "Y"); 
			
	        tot_rate  = ((double)fee/(double)((pubc_tot_amt - fee) * 100 / 85)) * 100;	
			rx.add(resForm, "tot_rate", DigitUtil.cutUnderPoint(tot_rate, 1)); 
			rx.add(resForm, "tot_rate_bool", "Y"); 

        	net_rate = ((double)fee / (double)(pubc_tot_amt - fee)) * 100;	
			rx.add(resForm, "net_rate", DigitUtil.cutUnderPoint(net_rate, 1)); 
			rx.add(resForm, "net_rate_bool", "Y"); 
		}
*/
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>