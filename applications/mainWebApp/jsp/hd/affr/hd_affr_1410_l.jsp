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
	HD_AFFR_1410_LDataSet ds = (HD_AFFR_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_AFFR_1410_LCURLIST1Record rec = (HD_AFFR_1410_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			rx.add(record, "tmp_dr_amt", StringUtil.replaceToXml(rec.tmp_dr_amt));
			rx.add(record, "tmp_crdt_amt", StringUtil.replaceToXml(rec.tmp_crdt_amt));
			rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			rx.add(record, "incmg_pers_ipadd", StringUtil.replaceToXml(rec.incmg_pers_ipadd));
			rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			rx.add(record, "slip_proc_mang_dt", StringUtil.replaceToXml(rec.slip_proc_mang_dt));
			rx.add(record, "slip_proc_mang_seq", StringUtil.replaceToXml(rec.slip_proc_mang_seq));
			rx.add(record, "cmpy_welf_fund_clsf", StringUtil.replaceToXml(rec.cmpy_welf_fund_clsf));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "emp_no", rec.emp_no);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "flnm", rec.flnm);
			//rx.add(record, "tmp_dr_amt", rec.tmp_dr_amt);
			//rx.add(record, "tmp_crdt_amt", rec.tmp_crdt_amt);
			//rx.add(record, "titl", rec.titl);
			//rx.add(record, "actu_slip_no", rec.actu_slip_no);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "incmg_pers", rec.incmg_pers);
			//rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			//rx.add(record, "proc_stat", rec.proc_stat);
			//rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			//rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			//rx.add(record, "cmpy_welf_fund_clsf", rec.cmpy_welf_fund_clsf);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "seq", rec.seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1410_LCURLISTRecord rec = (HD_AFFR_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			rx.add(record, "faml_seq", StringUtil.replaceToXml(rec.faml_seq));
			rx.add(record, "child_flnm", StringUtil.replaceToXml(rec.child_flnm));
			rx.add(record, "faml_rshp_cd", StringUtil.replaceToXml(rec.faml_rshp_cd));
			rx.add(record, "faml_rshp_nm", StringUtil.replaceToXml(rec.faml_rshp_nm));
			rx.add(record, "treat_edu_frdt", StringUtil.replaceToXml(rec.treat_edu_frdt));
			rx.add(record, "treat_edu_todt", StringUtil.replaceToXml(rec.treat_edu_todt));
			rx.add(record, "treat_edu_cont", StringUtil.replaceToXml(rec.treat_edu_cont));
			rx.add(record, "treat_edu_instt", StringUtil.replaceToXml(rec.treat_edu_instt));
			rx.add(record, "treat_edu_instt_tel_no", StringUtil.replaceToXml(rec.treat_edu_instt_tel_no));
			rx.add(record, "clam_amt", StringUtil.replaceToXml(rec.clam_amt));
			rx.add(record, "cmpy_sply_amt", StringUtil.replaceToXml(rec.cmpy_sply_amt));
			rx.add(record, "slip_proc_mang_dt", StringUtil.replaceToXml(rec.slip_proc_mang_dt));
			rx.add(record, "slip_proc_mang_seq", StringUtil.replaceToXml(rec.slip_proc_mang_seq));
			rx.add(record, "slip_proc_seq", StringUtil.replaceToXml(rec.slip_proc_seq));
			rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			rx.add(record, "pay_plac_clsf", StringUtil.replaceToXml(rec.pay_plac_clsf));
			//rx.add(record, "emp_no", rec.emp_no);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "flnm", rec.flnm);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "dty_cd", rec.dty_cd);
			//rx.add(record, "posi_cd", rec.posi_cd);
			//rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "dty_nm", rec.dty_nm);
			//rx.add(record, "posi_nm", rec.posi_nm);
			//rx.add(record, "faml_seq", rec.faml_seq);
			//rx.add(record, "child_flnm", rec.child_flnm);
			//rx.add(record, "faml_rshp_cd", rec.faml_rshp_cd);
			//rx.add(record, "faml_rshp_nm", rec.faml_rshp_nm);
			//rx.add(record, "treat_edu_frdt", rec.treat_edu_frdt);
			//rx.add(record, "treat_edu_todt", rec.treat_edu_todt);
			//rx.add(record, "treat_edu_cont", rec.treat_edu_cont);
			//rx.add(record, "treat_edu_instt", rec.treat_edu_instt);
			//rx.add(record, "treat_edu_instt_tel_no", rec.treat_edu_instt_tel_no);
			//rx.add(record, "clam_amt", rec.clam_amt);
			//rx.add(record, "cmpy_sply_amt", rec.cmpy_sply_amt);
			//rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			//rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			//rx.add(record, "slip_proc_seq", rec.slip_proc_seq);
			//rx.add(record, "proc_stat", rec.proc_stat);
			//rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			//rx.add(record, "actu_slip_no", rec.actu_slip_no);
			//rx.add(record, "pay_plac_clsf", rec.pay_plac_clsf);
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
<hd_affr_1410_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<dept_cd/>
				<flnm/>
				<tmp_dr_amt/>
				<tmp_crdt_amt/>
				<titl/>
				<actu_slip_no/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<incmg_pers/>
				<incmg_pers_ipadd/>
				<proc_stat/>
				<slip_proc_mang_dt/>
				<slip_proc_mang_seq/>
				<cmpy_welf_fund_clsf/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_affr_1410_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_affr_1410_l>
	<dataSet>
		<CURLIST>
			<record>
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
				<faml_seq/>
				<child_flnm/>
				<faml_rshp_cd/>
				<faml_rshp_nm/>
				<treat_edu_frdt/>
				<treat_edu_todt/>
				<treat_edu_cont/>
				<treat_edu_instt/>
				<treat_edu_instt_tel_no/>
				<clam_amt/>
				<cmpy_sply_amt/>
				<slip_proc_mang_dt/>
				<slip_proc_mang_seq/>
				<slip_proc_seq/>
				<proc_stat/>
				<proc_stat_nm/>
				<actu_slip_no/>
				<pay_plac_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_1410_l>
*/
%>

<% /* 작성시간 : Tue Aug 11 14:49:40 KST 2009 */ %>