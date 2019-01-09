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
	IS_AGR_1110_LDataSet ds = (IS_AGR_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_1110_LCURLISTRecord rec = (IS_AGR_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "acwr_reg_dt_seq", rec.acwr_reg_dt+rec.acwr_reg_seq); /**½Â³«¼­ÀÏÀÚ¼ø¹ø**/
			//rx.add(record, "acwr_reg_seq", rec.acwr_reg_seq);
			rx.add(record, "scat_dt", rec.scat_dt);
			rx.add(record, "rvord_type_nm", rec.rvord_type_nm);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "advcs_cd", rec.advcs_cd);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.addCData(record, "advt_nm", rec.advt_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "tot_rvord_amt", rec.tot_rvord_amt);
			rx.add(record, "indt_cd_nm", rec.indt_cd_nm);
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.add(record, "spc_sale_clsf_nm", rec.spc_sale_clsf_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "vatclsf_nm", rec.vatclsf_nm);
			rx.add(record, "clamt_mthd_nm", rec.clamt_mthd_nm);
			rx.add(record, "fix_yn", rec.fix_yn);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "s_purc_amt", rec.s_purc_amt);
			rx.add(record, "prft_amt", rec.prft_amt);
			rx.add(record, "prft_rate", DigitUtil.cutUnderPoint(rec.prft_rate,2));
			rx.add(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.add(record, "purc_dlco_nm", rec.purc_dlco_nm);
			//rx.add(record, "uprc", rec.uprc);
			rx.add(record, "uprc", DigitUtil.cutUnderPoint(rec.uprc,2));
			rx.add(record, "qunt", rec.qunt);
			//rx.add(record, "purc_uprc", rec.purc_uprc);
			rx.add(record, "purc_uprc", DigitUtil.cutUnderPoint(rec.purc_uprc,2));
			rx.add(record, "purc_qunt", rec.purc_qunt);
			rx.add(record, "purc_amt", rec.purc_amt);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
