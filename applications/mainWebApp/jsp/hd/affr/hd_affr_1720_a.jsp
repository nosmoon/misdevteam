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
	HD_AFFR_1720_ADataSet ds = (HD_AFFR_1720_ADataSet)request.getAttribute("ds");
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
			HD_AFFR_1720_ACURLISTRecord rec = (HD_AFFR_1720_ACURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "scl_exps_pay_yy", rec.scl_exps_pay_yy);
			rx.add(record, "scl_exps_pay_qq", rec.scl_exps_pay_qq);
			rx.add(record, "scl_exps_clsf", rec.scl_exps_clsf);
			rx.add(record, "scl_exps_pay_plac_clsf", rec.scl_exps_pay_plac_clsf);
			rx.add(record, "obj_pers_flnm", rec.obj_pers_flnm);
			rx.add(record, "obj_pers_prn", rec.obj_pers_prn);
			rx.add(record, "scl_nm", rec.scl_nm);
			rx.add(record, "grade", rec.grade);
			rx.add(record, "scl_part", rec.scl_part);
			rx.add(record, "aplc_amt", rec.aplc_amt);
			rx.add(record, "vdty_amt", rec.vdty_amt);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			rx.add(record, "aplc_dt", rec.aplc_dt);
			rx.add(record, "aplc_seq", rec.aplc_seq);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "scl_exps_clsf_nm", rec.scl_exps_clsf_nm);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "scl_exps_pay_yy", StringUtil.replaceToXml(rec.scl_exps_pay_yy));
			//rx.add(record, "scl_exps_pay_qq", StringUtil.replaceToXml(rec.scl_exps_pay_qq));
			//rx.add(record, "scl_exps_clsf", StringUtil.replaceToXml(rec.scl_exps_clsf));
			//rx.add(record, "scl_exps_pay_plac_clsf", StringUtil.replaceToXml(rec.scl_exps_pay_plac_clsf));
			//rx.add(record, "obj_pers_flnm", StringUtil.replaceToXml(rec.obj_pers_flnm));
			//rx.add(record, "obj_pers_prn", StringUtil.replaceToXml(rec.obj_pers_prn));
			//rx.add(record, "scl_nm", StringUtil.replaceToXml(rec.scl_nm));
			//rx.add(record, "grade", StringUtil.replaceToXml(rec.grade));
			//rx.add(record, "scl_part", StringUtil.replaceToXml(rec.scl_part));
			//rx.add(record, "aplc_amt", StringUtil.replaceToXml(rec.aplc_amt));
			//rx.add(record, "vdty_amt", StringUtil.replaceToXml(rec.vdty_amt));
			//rx.add(record, "pay_amt", StringUtil.replaceToXml(rec.pay_amt));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "slip_proc_mang_dt", StringUtil.replaceToXml(rec.slip_proc_mang_dt));
			//rx.add(record, "slip_proc_mang_seq", StringUtil.replaceToXml(rec.slip_proc_mang_seq));
			//rx.add(record, "aplc_dt", StringUtil.replaceToXml(rec.aplc_dt));
			//rx.add(record, "aplc_seq", StringUtil.replaceToXml(rec.aplc_seq));
			//rx.add(record, "incmg_pers_ipadd", StringUtil.replaceToXml(rec.incmg_pers_ipadd));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "chg_pers", StringUtil.replaceToXml(rec.chg_pers));
			//rx.add(record, "chg_dt_tm", StringUtil.replaceToXml(rec.chg_dt_tm));
			//rx.add(record, "scl_exps_clsf_nm", StringUtil.replaceToXml(rec.scl_exps_clsf_nm));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
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
<hd_affr_1720_a>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<occr_dt/>
				<seq/>
				<flnm/>
				<dept_cd/>
				<dty_cd/>
				<posi_cd/>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
				<scl_exps_pay_yy/>
				<scl_exps_pay_qq/>
				<scl_exps_clsf/>
				<scl_exps_pay_plac_clsf/>
				<obj_pers_flnm/>
				<obj_pers_prn/>
				<scl_nm/>
				<grade/>
				<scl_part/>
				<aplc_amt/>
				<vdty_amt/>
				<pay_amt/>
				<remk/>
				<slip_proc_mang_dt/>
				<slip_proc_mang_seq/>
				<aplc_dt/>
				<aplc_seq/>
				<incmg_pers_ipadd/>
				<incmg_pers/>
				<incmg_dt_tm/>
				<chg_pers/>
				<chg_dt_tm/>
				<scl_exps_clsf_nm/>
				<proc_stat_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_1720_a>
*/
%>

<% /* 작성시간 : Mon Sep 21 17:44:45 KST 2009 */ %>