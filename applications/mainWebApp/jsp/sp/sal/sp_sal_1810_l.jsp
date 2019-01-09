<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_1810_LDataSet ds = (SP_SAL_1810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_1810_LCURLISTRecord rec = (SP_SAL_1810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "rdr_extn_yymm", rec.rdr_extn_yymm);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "staf_no", rec.staf_no);
			rx.add(record, "staf_nm", rec.staf_nm);
			rx.add(record, "acty_area", rec.acty_area);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "a_hous_rdr_extn_qty", rec.a_hous_rdr_extn_qty);
			rx.add(record, "a_apt_rdr_extn_qty", rec.a_apt_rdr_extn_qty);
			rx.add(record, "a_shop_rdr_extn_qty", rec.a_shop_rdr_extn_qty);
			rx.add(record, "a_hous_ufth_qty", rec.a_hous_ufth_qty);
			rx.add(record, "a_apt_ufth_qty", rec.a_apt_ufth_qty);
			rx.add(record, "a_shop_ufth_qty", rec.a_shop_ufth_qty);
			rx.add(record, "a_hous_fix_qty", rec.a_hous_fix_qty);
			rx.add(record, "a_apt_fix_qty", rec.a_apt_fix_qty);
			rx.add(record, "a_shop_fix_qty", rec.a_shop_fix_qty);
			rx.add(record, "b_hous_rdr_extn_qty", rec.b_hous_rdr_extn_qty);
			rx.add(record, "b_apt_rdr_extn_qty", rec.b_apt_rdr_extn_qty);
			rx.add(record, "b_shop_rdr_extn_qty", rec.b_shop_rdr_extn_qty);
			rx.add(record, "b_hous_ufth_qty", rec.b_hous_ufth_qty);
			rx.add(record, "b_apt_ufth_qty", rec.b_apt_ufth_qty);
			rx.add(record, "b_shop_ufth_qty", rec.b_shop_ufth_qty);
			rx.add(record, "b_hous_fix_qty", rec.b_hous_fix_qty);
			rx.add(record, "b_apt_fix_qty", rec.b_apt_fix_qty);
			rx.add(record, "b_shop_fix_qty", rec.b_shop_fix_qty);
			rx.add(record, "a_tot", rec.a_tot);
			rx.add(record, "rdr_extn_alon", rec.rdr_extn_alon);
			rx.add(record, "leader_alon", rec.leader_alon);
			rx.add(record, "jungbuhonam_spc_acty_cost", rec.jungbuhonam_spc_acty_cost);
			rx.add(record, "mvin_team_spc_acty_cost", rec.mvin_team_spc_acty_cost);
			rx.add(record, "no_val_shrt_fee", rec.no_val_shrt_fee);
			rx.add(record, "rdr_extn_sctn_clsi_fee", rec.rdr_extn_sctn_clsi_fee);
			rx.add(record, "etc_alon_1", rec.etc_alon_1);
			rx.add(record, "etc_alon_2", rec.etc_alon_2);
			rx.add(record, "etc_alon_3", rec.etc_alon_3);
			rx.add(record, "pre_pay_dduc", rec.pre_pay_dduc);
			rx.add(record, "tax_amt_dduc", rec.tax_amt_dduc);
			rx.add(record, "res_tax_dduc", rec.res_tax_dduc);
			rx.add(record, "etc_dduc_1", rec.etc_dduc_1);
			rx.add(record, "etc_dduc_2", rec.etc_dduc_2);
			rx.add(record, "etc_dduc_3", rec.etc_dduc_3);
			rx.add(record, "stot_amt", rec.stot_amt);
			rx.add(record, "real_pay_amt", rec.real_pay_amt);
			rx.add(record, "wclam_subm_yn", rec.wclam_subm_yn);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "setl_bank_nm", rec.setl_bank_nm);
			rx.add(record, "rcpm_main_nm", rec.rcpm_main_nm);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "pay_plan_dt", rec.pay_plan_dt);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "remk", rec.remk);
		}
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
