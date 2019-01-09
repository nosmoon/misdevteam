<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.agr.rec.*
	,	chosun.ciis.is.agr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_AGR_2910_LDataSet ds = (IS_AGR_2910_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_2910_LCURLISTRecord rec = (IS_AGR_2910_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "dlvs_dt", rec.dlvs_dt);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "rcpm_clsf", rec.rcpm_clsf);
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "card_coms", rec.card_coms);
			rx.add(record, "out_amt", rec.out_amt);
			rx.add(record, "im_amt", rec.im_amt);
			//rx.add(record, "im_amt_rate", rec.im_amt_rate);
			rx.add(record, "im_amt_rate", DigitUtil.cutUnderPoint(rec.im_amt_rate,2));
			rx.add(record, "prz_rate_clsf_nm", rec.prz_rate_clsf_nm);
			rx.add(record, "prz_amt", rec.prz_amt);
			rx.add(record, "prz_phb_saly_boks", rec.prz_phb_saly_boks);
			rx.add(record, "make_ask_reg_dt", rec.make_ask_reg_dt);
			rx.add(record, "make_ask_reg_seq", rec.make_ask_reg_seq);
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
