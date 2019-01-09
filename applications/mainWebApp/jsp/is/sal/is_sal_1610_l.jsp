<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.sal.rec.*
	,	chosun.ciis.is.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_SAL_1610_LDataSet ds = (IS_SAL_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_SAL_1610_LCURLISTRecord rec = (IS_SAL_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "purc_adjm_reg_dt", rec.purc_adjm_reg_dt);
			rx.add(record, "purc_adjm_reg_seq", rec.purc_adjm_reg_seq);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "asnt_dstc_cd", rec.asnt_dstc_cd);
			rx.addCData(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.add(record, "dlco_clsf_cd_seq", rec.dlco_clsf_cd_seq);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "adjm_dt", rec.adjm_dt);
			rx.add(record, "pay_plan_dd_pers", rec.pay_plan_dd_pers);
			rx.add(record, "txn_clsf", rec.txn_clsf);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "dduc_amt", rec.dduc_amt);
			rx.add(record, "comp_amt", rec.comp_amt);
			rx.add(record, "prom_amt", rec.prom_amt);
			rx.add(record, "gds_vol_amt", rec.gds_vol_amt);
			rx.add(record, "etc_amt", rec.etc_amt);
			rx.add(record, "stot_amt", rec.stot_amt);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "setl_bank_nm", rec.setl_bank_nm);
			rx.addCData(record, "acct_no", rec.acct_no);
			rx.addCData(record, "rcpm_main_nm", rec.rcpm_main_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "sup_ern", rec.sup_ern);
			rx.add(record, "chg_pers", rec.chg_pers);
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
