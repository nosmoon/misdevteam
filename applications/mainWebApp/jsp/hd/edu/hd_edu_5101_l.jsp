<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.edu.rec.*
	,	chosun.ciis.hd.edu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EDU_5101_LDataSet ds = (HD_EDU_5101_LDataSet)request.getAttribute("ds");
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
			HD_EDU_5101_LCURLISTRecord rec = (HD_EDU_5101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "acpn_no", rec.acpn_no);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "phon_num", rec.phon_num);
			rx.add(record, "out_class_type", rec.out_class_type);
			rx.add(record, "out_class_type_nm", rec.out_class_type_nm);
			rx.add(record, "acty_type", rec.acty_type);
			rx.add(record, "acty_type_nm", rec.acty_type_nm);
			rx.add(record, "acty_etc", rec.acty_etc);
			rx.addCData(record, "req_instt_nm", rec.req_instt_nm);
			rx.addCData(record, "req_presi_nm", rec.req_presi_nm);
			rx.addCData(record, "req_chrg_dept_nm", rec.req_chrg_dept_nm);
			rx.add(record, "req_chrg_nm", rec.req_chrg_nm);
			rx.add(record, "req_phon_nm", rec.req_phon_nm);
			rx.addCData(record, "req_resn", rec.req_resn);
			rx.addCData(record, "out_class_subj_nm", rec.out_class_subj_nm);
			rx.addCData(record, "out_class_plac", rec.out_class_plac);
			rx.add(record, "out_class_fr_dt", rec.out_class_fr_dt);
			rx.add(record, "out_class_to_dt", rec.out_class_to_dt);
			rx.add(record, "out_class_fr_tm", rec.out_class_fr_tm);
			rx.add(record, "out_class_to_tm", rec.out_class_to_tm);
			rx.add(record, "yy_avg_tms", rec.yy_avg_tms);
			rx.add(record, "mm_avg_tms", rec.mm_avg_tms);
			rx.add(record, "tms_avg_tm", rec.tms_avg_tm);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "tms_avg_amt", rec.tms_avg_amt);
			rx.add(record, "trff_stay_amt", rec.trff_stay_amt);
			rx.add(record, "tms_avg_trff_stay_amt", rec.tms_avg_trff_stay_amt);
			rx.add(record, "proc_stat", rec.proc_stat);
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "acpn_no", StringUtil.replaceToXml(rec.acpn_no));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "phon_num", StringUtil.replaceToXml(rec.phon_num));
			//rx.add(record, "out_class_type", StringUtil.replaceToXml(rec.out_class_type));
			//rx.add(record, "out_class_type_nm", StringUtil.replaceToXml(rec.out_class_type_nm));
			//rx.add(record, "acty_type", StringUtil.replaceToXml(rec.acty_type));
			//rx.add(record, "acty_type_nm", StringUtil.replaceToXml(rec.acty_type_nm));
			//rx.add(record, "acty_etc", StringUtil.replaceToXml(rec.acty_etc));
			//rx.add(record, "req_instt_nm", StringUtil.replaceToXml(rec.req_instt_nm));
			//rx.add(record, "req_presi_nm", StringUtil.replaceToXml(rec.req_presi_nm));
			//rx.add(record, "req_chrg_dept_nm", StringUtil.replaceToXml(rec.req_chrg_dept_nm));
			//rx.add(record, "req_chrg_nm", StringUtil.replaceToXml(rec.req_chrg_nm));
			//rx.add(record, "req_phon_nm", StringUtil.replaceToXml(rec.req_phon_nm));
			//rx.add(record, "req_resn", StringUtil.replaceToXml(rec.req_resn));
			//rx.add(record, "out_class_subj_nm", StringUtil.replaceToXml(rec.out_class_subj_nm));
			//rx.add(record, "out_class_plac", StringUtil.replaceToXml(rec.out_class_plac));
			//rx.add(record, "out_class_fr_dt", StringUtil.replaceToXml(rec.out_class_fr_dt));
			//rx.add(record, "out_class_to_dt", StringUtil.replaceToXml(rec.out_class_to_dt));
			//rx.add(record, "out_class_fr_tm", StringUtil.replaceToXml(rec.out_class_fr_tm));
			//rx.add(record, "out_class_to_tm", StringUtil.replaceToXml(rec.out_class_to_tm));
			//rx.add(record, "yy_avg_tms", StringUtil.replaceToXml(rec.yy_avg_tms));
			//rx.add(record, "mm_avg_tms", StringUtil.replaceToXml(rec.mm_avg_tms));
			//rx.add(record, "tms_avg_tm", StringUtil.replaceToXml(rec.tms_avg_tm));
			//rx.add(record, "tot_amt", StringUtil.replaceToXml(rec.tot_amt));
			//rx.add(record, "tms_avg_amt", StringUtil.replaceToXml(rec.tms_avg_amt));
			//rx.add(record, "trff_stay_amt", StringUtil.replaceToXml(rec.trff_stay_amt));
			//rx.add(record, "tms_avg_trff_stay_amt", StringUtil.replaceToXml(rec.tms_avg_trff_stay_amt));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
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
<hd_edu_5101_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<seq/>
				<acpn_no/>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<phon_num/>
				<out_class_type/>
				<out_class_type_nm/>
				<acty_type/>
				<acty_type_nm/>
				<acty_etc/>
				<req_instt_nm/>
				<req_presi_nm/>
				<req_chrg_dept_nm/>
				<req_chrg_nm/>
				<req_phon_nm/>
				<req_resn/>
				<out_class_subj_nm/>
				<out_class_plac/>
				<out_class_fr_dt/>
				<out_class_to_dt/>
				<out_class_fr_tm/>
				<out_class_to_tm/>
				<yy_avg_tms/>
				<mm_avg_tms/>
				<tms_avg_tm/>
				<tot_amt/>
				<tms_avg_amt/>
				<trff_stay_amt/>
				<tms_avg_trff_stay_amt/>
				<proc_stat/>
			</record>
		</CURLIST>
	</dataSet>
</hd_edu_5101_l>
*/
%>

<% /* 작성시간 : Thu Sep 29 17:04:20 KST 2016 */ %>