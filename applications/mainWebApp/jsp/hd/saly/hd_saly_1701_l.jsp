<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_1701_LDataSet ds = (HD_SALY_1701_LDataSet)request.getAttribute("ds");
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
			HD_SALY_1701_LCURLISTRecord rec = (HD_SALY_1701_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "saly_yy", rec.saly_yy);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "mm_saly", rec.mm_saly);
			rx.add(record, "rslt_pay", rec.rslt_pay);
			rx.add(record, "year_alon", rec.year_alon);
			rx.add(record, "hody_alon", rec.hody_alon);
			rx.add(record, "vgl_fee", rec.vgl_fee);
			rx.add(record, "snk_fee", rec.snk_fee);
			rx.add(record, "dd_subj_sel_fee", rec.dd_subj_sel_fee);
			rx.add(record, "cnfr_fee", rec.cnfr_fee);
			rx.add(record, "real_subj_sel_fee", rec.real_subj_sel_fee);
			rx.add(record, "erl_prsnt_alon", rec.erl_prsnt_alon);
			rx.add(record, "movm_fee", rec.movm_fee);
			rx.add(record, "dspch_dd_fee", rec.dspch_dd_fee);
			rx.add(record, "cmpy_burd_np_amt", rec.cmpy_burd_np_amt);
			rx.add(record, "cmpy_burd_hlth_insr_fee", rec.cmpy_burd_hlth_insr_fee);
			rx.add(record, "cmpy_burd_emp_insr_fee", rec.cmpy_burd_emp_insr_fee);
			rx.add(record, "cmpy_burd_dist_insr_fee", rec.cmpy_burd_dist_insr_fee);
			rx.add(record, "corp_card_use_amt", rec.corp_card_use_amt);
			rx.add(record, "olcard_use_amt", rec.olcard_use_amt);
			rx.add(record, "welf_card_use_amt", rec.welf_card_use_amt);
			rx.add(record, "hlth_chk_sply_amt", rec.hlth_chk_sply_amt);
			rx.add(record, "hospz_med_exam_fee", rec.hospz_med_exam_fee);
			rx.add(record, "child_scl_exps", rec.child_scl_exps);
			rx.add(record, "congr_condl_fee", rec.congr_condl_fee);
			rx.add(record, "paty_insr_fee", rec.paty_insr_fee);
			rx.add(record, "condo_use_cmpy_sply_amt", rec.condo_use_cmpy_sply_amt);
			rx.add(record, "posk_edu_fee", rec.posk_edu_fee);
			rx.add(record, "onl_edu_fee", rec.onl_edu_fee);
			rx.add(record, "sclgg_course_edu_fee", rec.sclgg_course_edu_fee);
			rx.add(record, "mba_course_edu_fee", rec.mba_course_edu_fee);
			rx.add(record, "cmpy_sply_stdy_fee", rec.cmpy_sply_stdy_fee);
			rx.add(record, "gc_sply_edu_fee", rec.gc_sply_edu_fee);
		
			
			//rx.add(record, "saly_yy", StringUtil.replaceToXml(rec.saly_yy));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "mm_saly", StringUtil.replaceToXml(rec.mm_saly));
			//rx.add(record, "rslt_pay", StringUtil.replaceToXml(rec.rslt_pay));
			//rx.add(record, "year_alon", StringUtil.replaceToXml(rec.year_alon));
			//rx.add(record, "hody_alon", StringUtil.replaceToXml(rec.hody_alon));
			//rx.add(record, "vgl_fee", StringUtil.replaceToXml(rec.vgl_fee));
			//rx.add(record, "snk_fee", StringUtil.replaceToXml(rec.snk_fee));
			//rx.add(record, "dd_subj_sel_fee", StringUtil.replaceToXml(rec.dd_subj_sel_fee));
			//rx.add(record, "cnfr_fee", StringUtil.replaceToXml(rec.cnfr_fee));
			//rx.add(record, "real_subj_sel_fee", StringUtil.replaceToXml(rec.real_subj_sel_fee));
			//rx.add(record, "erl_prsnt_alon", StringUtil.replaceToXml(rec.erl_prsnt_alon));
			//rx.add(record, "movm_fee", StringUtil.replaceToXml(rec.movm_fee));
			//rx.add(record, "dspch_dd_fee", StringUtil.replaceToXml(rec.dspch_dd_fee));
			//rx.add(record, "cmpy_burd_np_amt", StringUtil.replaceToXml(rec.cmpy_burd_np_amt));
			//rx.add(record, "cmpy_burd_hlth_insr_fee", StringUtil.replaceToXml(rec.cmpy_burd_hlth_insr_fee));
			//rx.add(record, "cmpy_burd_emp_insr_fee", StringUtil.replaceToXml(rec.cmpy_burd_emp_insr_fee));
			//rx.add(record, "cmpy_burd_dist_insr_fee", StringUtil.replaceToXml(rec.cmpy_burd_dist_insr_fee));
			//rx.add(record, "corp_card_use_amt", StringUtil.replaceToXml(rec.corp_card_use_amt));
			//rx.add(record, "olcard_use_amt", StringUtil.replaceToXml(rec.olcard_use_amt));
			//rx.add(record, "welf_card_use_amt", StringUtil.replaceToXml(rec.welf_card_use_amt));
			//rx.add(record, "hlth_chk_sply_amt", StringUtil.replaceToXml(rec.hlth_chk_sply_amt));
			//rx.add(record, "hospz_med_exam_fee", StringUtil.replaceToXml(rec.hospz_med_exam_fee));
			//rx.add(record, "child_scl_exps", StringUtil.replaceToXml(rec.child_scl_exps));
			//rx.add(record, "congr_condl_fee", StringUtil.replaceToXml(rec.congr_condl_fee));
			//rx.add(record, "paty_insr_fee", StringUtil.replaceToXml(rec.paty_insr_fee));
			//rx.add(record, "condo_use_cmpy_sply_amt", StringUtil.replaceToXml(rec.condo_use_cmpy_sply_amt));
			//rx.add(record, "posk_edu_fee", StringUtil.replaceToXml(rec.posk_edu_fee));
			//rx.add(record, "onl_edu_fee", StringUtil.replaceToXml(rec.onl_edu_fee));
			//rx.add(record, "sclgg_course_edu_fee", StringUtil.replaceToXml(rec.sclgg_course_edu_fee));
			//rx.add(record, "mba_course_edu_fee", StringUtil.replaceToXml(rec.mba_course_edu_fee));
			//rx.add(record, "cmpy_sply_stdy_fee", StringUtil.replaceToXml(rec.cmpy_sply_stdy_fee));
			//rx.add(record, "gc_sply_edu_fee", StringUtil.replaceToXml(rec.gc_sply_edu_fee));
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
<hd_saly_1701_l>
	<dataSet>
		<CURLIST>
			<record>
				<saly_yy/>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<mm_saly/>
				<rslt_pay/>
				<year_alon/>
				<hody_alon/>
				<vgl_fee/>
				<snk_fee/>
				<dd_subj_sel_fee/>
				<cnfr_fee/>
				<real_subj_sel_fee/>
				<erl_prsnt_alon/>
				<movm_fee/>
				<dspch_dd_fee/>
				<cmpy_burd_np_amt/>
				<cmpy_burd_hlth_insr_fee/>
				<cmpy_burd_emp_insr_fee/>
				<cmpy_burd_dist_insr_fee/>
				<corp_card_use_amt/>
				<olcard_use_amt/>
				<welf_card_use_amt/>
				<hlth_chk_sply_amt/>
				<hospz_med_exam_fee/>
				<child_scl_exps/>
				<congr_condl_fee/>
				<paty_insr_fee/>
				<condo_use_cmpy_sply_amt/>
				<posk_edu_fee/>
				<onl_edu_fee/>
				<sclgg_course_edu_fee/>
				<mba_course_edu_fee/>
				<cmpy_sply_stdy_fee/>
				<gc_sply_edu_fee/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_1701_l>
*/
%>

<% /* 작성시간 : Tue May 26 20:23:09 KST 2009 */ %>