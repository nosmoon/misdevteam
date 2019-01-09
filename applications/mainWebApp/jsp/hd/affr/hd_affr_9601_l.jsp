<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_9601_LDataSet ds = (HD_AFFR_9601_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_9601_LCURLISTRecord rec = (HD_AFFR_9601_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "memb_clsf", rec.memb_clsf);
			rx.add(record, "memb_clsf_nm", rec.memb_clsf_nm);
			rx.add(record, "aply_obj_clsf", rec.aply_obj_clsf);
			rx.add(record, "aply_obj_name", rec.aply_obj_name);
			rx.add(record, "expn_clsf_cd", rec.expn_clsf_cd);
			rx.add(record, "expn_clsf_nm", rec.expn_clsf_nm);
			rx.add(record, "expn_cont", rec.expn_cont);
			rx.add(record, "str_dt", rec.str_dt);
			rx.add(record, "end_dt", rec.end_dt);
			rx.add(record, "limt_amt", rec.limt_amt);
			rx.add(record, "clam_amt", rec.clam_amt);
			rx.add(record, "excl_amt", rec.excl_amt);
			rx.add(record, "sply_amt", rec.sply_amt);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "deps_per", rec.deps_per);
			rx.add(record, "reg_dt", rec.reg_dt);
			rx.add(record, "pay_dt", rec.pay_dt);
			rx.add(record, "stlm_desty", rec.stlm_desty);
			rx.add(record, "dtynm", rec.dtynm);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "proc_mang_dt_seq", rec.proc_mang_dt_seq);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "expn_resn_cd1", rec.expn_resn_cd1);
			rx.add(record, "expn_resn_cd2", rec.expn_resn_cd2);
			rx.add(record, "expn_resn_cd3", rec.expn_resn_cd3);
			rx.add(record, "spos_name", rec.spos_name);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "proc_mang_dt", rec.proc_mang_dt);
			rx.add(record, "proc_mang_seq", rec.proc_mang_seq);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "memb_clsf", StringUtil.replaceToXml(rec.memb_clsf));
			//rx.add(record, "memb_clsf_nm", StringUtil.replaceToXml(rec.memb_clsf_nm));
			//rx.add(record, "aply_obj_clsf", StringUtil.replaceToXml(rec.aply_obj_clsf));
			//rx.add(record, "aply_obj_name", StringUtil.replaceToXml(rec.aply_obj_name));
			//rx.add(record, "expn_clsf_cd", StringUtil.replaceToXml(rec.expn_clsf_cd));
			//rx.add(record, "expn_cont", StringUtil.replaceToXml(rec.expn_cont));
			//rx.add(record, "str_dt", StringUtil.replaceToXml(rec.str_dt));
			//rx.add(record, "end_dt", StringUtil.replaceToXml(rec.end_dt));
			//rx.add(record, "limt_amt", StringUtil.replaceToXml(rec.limt_amt));
			//rx.add(record, "clam_amt", StringUtil.replaceToXml(rec.clam_amt));
			//rx.add(record, "excl_amt", StringUtil.replaceToXml(rec.excl_amt));
			//rx.add(record, "sply_amt", StringUtil.replaceToXml(rec.sply_amt));
			//rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
			//rx.add(record, "bank_nm", StringUtil.replaceToXml(rec.bank_nm));
			//rx.add(record, "acct_no", StringUtil.replaceToXml(rec.acct_no));
			//rx.add(record, "deps_per", StringUtil.replaceToXml(rec.deps_per));
			//rx.add(record, "reg_dt", StringUtil.replaceToXml(rec.reg_dt));
			//rx.add(record, "pay_dt", StringUtil.replaceToXml(rec.pay_dt));
			//rx.add(record, "stlm_desty", StringUtil.replaceToXml(rec.stlm_desty));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "expn_resn", StringUtil.replaceToXml(rec.expn_resn));
			//rx.add(record, "spos_name", StringUtil.replaceToXml(rec.spos_name));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "chg_pers", StringUtil.replaceToXml(rec.chg_pers));
			//rx.add(record, "chg_dt_tm", StringUtil.replaceToXml(rec.chg_dt_tm));
			//rx.add(record, "proc_mang_dt", StringUtil.replaceToXml(rec.proc_mang_dt));
			//rx.add(record, "proc_mang_seq", StringUtil.replaceToXml(rec.proc_mang_seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_affr_9601_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<mang_no/>
				<seq/>
				<flnm/>
				<memb_clsf/>
				<memb_clsf_nm/>
				<aply_obj_clsf/>
				<aply_obj_name/>
				<expn_clsf_cd/>
				<expn_cont/>
				<str_dt/>
				<end_dt/>
				<limt_amt/>
				<clam_amt/>
				<excl_amt/>
				<sply_amt/>
				<bank_cd/>
				<bank_nm/>
				<acct_no/>
				<deps_per/>
				<reg_dt/>
				<pay_dt/>
				<stlm_desty/>
				<remk/>
				<proc_stat/>
				<expn_resn/>
				<spos_name/>
				<incmg_pers/>
				<incmg_dt_tm/>
				<chg_pers/>
				<chg_dt_tm/>
				<proc_mang_dt/>
				<proc_mang_seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_9601_l>
*/
%>

<% /* 작성시간 : Mon Sep 18 17:05:22 KST 2017 */ %>