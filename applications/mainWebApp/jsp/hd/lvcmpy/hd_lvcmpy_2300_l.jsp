<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_2300_LDataSet ds = (HD_LVCMPY_2300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_LVCMPY_2300_LCURLIST4Record rec = (HD_LVCMPY_2300_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "non_tax_frnc", rec.non_tax_frnc);
			rx.add(record, "non_tax_jrnst", rec.non_tax_jrnst);
			rx.add(record, "saly_no", rec.saly_no);
			//rx.add(record, "non_tax_frnc", StringUtil.replaceToXml(rec.non_tax_frnc));
			//rx.add(record, "non_tax_jrnst", StringUtil.replaceToXml(rec.non_tax_jrnst));
			//rx.add(record, "saly_no", StringUtil.replaceToXml(rec.saly_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_LVCMPY_2300_LCURLIST3Record rec = (HD_LVCMPY_2300_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "adjm_rvrs_yy", rec.adjm_rvrs_yy);
			rx.add(record, "labr_incm_amt", rec.labr_incm_amt);
			rx.add(record, "base_dduc_slf", rec.base_dduc_slf);
			rx.add(record, "base_dduc_spos", rec.base_dduc_spos);
			rx.add(record, "boks_qunt_faml_nops", rec.boks_qunt_faml_nops);
			rx.add(record, "rspc_nops", rec.rspc_nops);
			rx.add(record, "addm_dduc_obcl_pers", rec.addm_dduc_obcl_pers);
			rx.add(record, "addm_dduc_fml_hshd", rec.addm_dduc_fml_hshd);
			rx.add(record, "addm_dduc_care_fee", rec.addm_dduc_care_fee);
			rx.add(record, "mj1birth_ibyang", rec.mj1birth_ibyang);
			rx.add(record, "multi_child_addm_dduc", rec.multi_child_addm_dduc);
			rx.add(record, "np_insr_fee_dduc", rec.np_insr_fee_dduc);
			rx.add(record, "temp1", rec.temp1);
			rx.add(record, "temp2", rec.temp2);
			rx.add(record, "spc_dduc_insr_fee", rec.spc_dduc_insr_fee);
			rx.add(record, "spc_dduc_hosp_fee", rec.spc_dduc_hosp_fee);
			rx.add(record, "spc_dduc_hous_fund", rec.spc_dduc_hous_fund);
			rx.add(record, "hous_mogg_loan_amt_int", rec.hous_mogg_loan_amt_int);
			rx.add(record, "spc_dduc_dona_amt", rec.spc_dduc_dona_amt);
			rx.add(record, "spc_dduc_wedd_etc", rec.spc_dduc_wedd_etc);
			rx.add(record, "spc_dduc_stot", rec.spc_dduc_stot);
			rx.add(record, "std_dduc_amt", rec.std_dduc_amt);
			rx.add(record, "dedu_labr_incm_amt", rec.dedu_labr_incm_amt);
			rx.add(record, "prsn_pens_pymt_amt", rec.prsn_pens_pymt_amt);
			rx.add(record, "pens_savg_pymt_amt", rec.pens_savg_pymt_amt);
			rx.add(record, "plac_cmpy_plac_trad_authr_inc", rec.plac_cmpy_plac_trad_authr_inc);
			rx.add(record, "hous_fund_pymt_amt", rec.hous_fund_pymt_amt);
			rx.add(record, "invsm_cmpd_invsm_amt", rec.invsm_cmpd_invsm_amt);
			rx.add(record, "emp_stok_ownr_cmpd_dona_amt_30", rec.emp_stok_ownr_cmpd_dona_amt_30);
			rx.add(record, "crdt_non_pcc_use", rec.crdt_non_pcc_use);
			rx.add(record, "ltrm_stok_type_savg_incm_dduc", rec.ltrm_stok_type_savg_incm_dduc);
			rx.add(record, "tax_amt_dduc_labr_incm", rec.tax_amt_dduc_labr_incm);
			rx.add(record, "tax_amt_dduc_polt_fund", rec.tax_amt_dduc_polt_fund);
			rx.add(record, "temp3", rec.temp3);
			rx.add(record, "tax_amt_dduc_hous_loan_amt_int", rec.tax_amt_dduc_hous_loan_amt_int);
			rx.add(record, "tax_amt_dduc_forn_pymt", rec.tax_amt_dduc_forn_pymt);
			rx.add(record, "tax_amt_dduc_stot", rec.tax_amt_dduc_stot);
			//rx.add(record, "adjm_rvrs_yy", StringUtil.replaceToXml(rec.adjm_rvrs_yy));
			//rx.add(record, "labr_incm_amt", StringUtil.replaceToXml(rec.labr_incm_amt));
			//rx.add(record, "base_dduc_slf", StringUtil.replaceToXml(rec.base_dduc_slf));
			//rx.add(record, "base_dduc_spos", StringUtil.replaceToXml(rec.base_dduc_spos));
			//rx.add(record, "boks_qunt_faml_nops", StringUtil.replaceToXml(rec.boks_qunt_faml_nops));
			//rx.add(record, "rspc_nops", StringUtil.replaceToXml(rec.rspc_nops));
			//rx.add(record, "addm_dduc_obcl_pers", StringUtil.replaceToXml(rec.addm_dduc_obcl_pers));
			//rx.add(record, "addm_dduc_fml_hshd", StringUtil.replaceToXml(rec.addm_dduc_fml_hshd));
			//rx.add(record, "addm_dduc_care_fee", StringUtil.replaceToXml(rec.addm_dduc_care_fee));
			//rx.add(record, "mj1birth_ibyang", StringUtil.replaceToXml(rec.mj1birth_ibyang));
			//rx.add(record, "multi_child_addm_dduc", StringUtil.replaceToXml(rec.multi_child_addm_dduc));
			//rx.add(record, "np_insr_fee_dduc", StringUtil.replaceToXml(rec.np_insr_fee_dduc));
			//rx.add(record, "temp1", StringUtil.replaceToXml(rec.temp1));
			//rx.add(record, "temp2", StringUtil.replaceToXml(rec.temp2));
			//rx.add(record, "spc_dduc_insr_fee", StringUtil.replaceToXml(rec.spc_dduc_insr_fee));
			//rx.add(record, "spc_dduc_hosp_fee", StringUtil.replaceToXml(rec.spc_dduc_hosp_fee));
			//rx.add(record, "spc_dduc_hous_fund", StringUtil.replaceToXml(rec.spc_dduc_hous_fund));
			//rx.add(record, "hous_mogg_loan_amt_int", StringUtil.replaceToXml(rec.hous_mogg_loan_amt_int));
			//rx.add(record, "spc_dduc_dona_amt", StringUtil.replaceToXml(rec.spc_dduc_dona_amt));
			//rx.add(record, "spc_dduc_wedd_etc", StringUtil.replaceToXml(rec.spc_dduc_wedd_etc));
			//rx.add(record, "spc_dduc_stot", StringUtil.replaceToXml(rec.spc_dduc_stot));
			//rx.add(record, "std_dduc_amt", StringUtil.replaceToXml(rec.std_dduc_amt));
			//rx.add(record, "dedu_labr_incm_amt", StringUtil.replaceToXml(rec.dedu_labr_incm_amt));
			//rx.add(record, "prsn_pens_pymt_amt", StringUtil.replaceToXml(rec.prsn_pens_pymt_amt));
			//rx.add(record, "pens_savg_pymt_amt", StringUtil.replaceToXml(rec.pens_savg_pymt_amt));
			//rx.add(record, "plac_cmpy_plac_trad_authr_inc", StringUtil.replaceToXml(rec.plac_cmpy_plac_trad_authr_inc));
			//rx.add(record, "hous_fund_pymt_amt", StringUtil.replaceToXml(rec.hous_fund_pymt_amt));
			//rx.add(record, "invsm_cmpd_invsm_amt", StringUtil.replaceToXml(rec.invsm_cmpd_invsm_amt));
			//rx.add(record, "emp_stok_ownr_cmpd_dona_amt_30", StringUtil.replaceToXml(rec.emp_stok_ownr_cmpd_dona_amt_30));
			//rx.add(record, "crdt_non_pcc_use", StringUtil.replaceToXml(rec.crdt_non_pcc_use));
			//rx.add(record, "ltrm_stok_type_savg_incm_dduc", StringUtil.replaceToXml(rec.ltrm_stok_type_savg_incm_dduc));
			//rx.add(record, "tax_amt_dduc_labr_incm", StringUtil.replaceToXml(rec.tax_amt_dduc_labr_incm));
			//rx.add(record, "tax_amt_dduc_polt_fund", StringUtil.replaceToXml(rec.tax_amt_dduc_polt_fund));
			//rx.add(record, "temp3", StringUtil.replaceToXml(rec.temp3));
			//rx.add(record, "tax_amt_dduc_hous_loan_amt_int", StringUtil.replaceToXml(rec.tax_amt_dduc_hous_loan_amt_int));
			//rx.add(record, "tax_amt_dduc_forn_pymt", StringUtil.replaceToXml(rec.tax_amt_dduc_forn_pymt));
			//rx.add(record, "tax_amt_dduc_stot", StringUtil.replaceToXml(rec.tax_amt_dduc_stot));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_LVCMPY_2300_LCURLIST2Record rec = (HD_LVCMPY_2300_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_pay_saly", rec.tot_pay_saly);
			rx.add(record, "non_tax_stot", rec.non_tax_stot);
			//rx.add(record, "tot_pay_saly", StringUtil.replaceToXml(rec.tot_pay_saly));
			//rx.add(record, "non_tax_stot", StringUtil.replaceToXml(rec.non_tax_stot));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_LVCMPY_2300_LCURLIST1Record rec = (HD_LVCMPY_2300_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "last_midl_adjm_dt", rec.last_midl_adjm_dt);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "last_midl_adjm_dt", StringUtil.replaceToXml(rec.last_midl_adjm_dt));
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			HD_LVCMPY_2300_LCURLIST5Record rec = (HD_LVCMPY_2300_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "etc_saly_amt", rec.etc_saly_amt);
			rx.add(record, "year_end", rec.year_end);
			//rx.add(record, "etc_saly_amt", StringUtil.replaceToXml(rec.etc_saly_amt));
			//rx.add(record, "year_end", StringUtil.replaceToXml(rec.year_end));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

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
<hd_lvcmpy_2300_l>
	<dataSet>
		<CURLIST4>
			<record>
				<non_tax_frnc/>
				<non_tax_jrnst/>
				<saly_no/>
			</record>
		</CURLIST4>
	</dataSet>
</hd_lvcmpy_2300_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_lvcmpy_2300_l>
	<dataSet>
		<CURLIST3>
			<record>
				<adjm_rvrs_yy/>
				<labr_incm_amt/>
				<base_dduc_slf/>
				<base_dduc_spos/>
				<boks_qunt_faml_nops/>
				<rspc_nops/>
				<addm_dduc_obcl_pers/>
				<addm_dduc_fml_hshd/>
				<addm_dduc_care_fee/>
				<mj1birth_ibyang/>
				<multi_child_addm_dduc/>
				<np_insr_fee_dduc/>
				<temp1/>
				<temp2/>
				<spc_dduc_insr_fee/>
				<spc_dduc_hosp_fee/>
				<spc_dduc_hous_fund/>
				<hous_mogg_loan_amt_int/>
				<spc_dduc_dona_amt/>
				<spc_dduc_wedd_etc/>
				<spc_dduc_stot/>
				<std_dduc_amt/>
				<dedu_labr_incm_amt/>
				<prsn_pens_pymt_amt/>
				<pens_savg_pymt_amt/>
				<plac_cmpy_plac_trad_authr_inc/>
				<hous_fund_pymt_amt/>
				<invsm_cmpd_invsm_amt/>
				<emp_stok_ownr_cmpd_dona_amt_30/>
				<crdt_non_pcc_use/>
				<ltrm_stok_type_savg_incm_dduc/>
				<tax_amt_dduc_labr_incm/>
				<tax_amt_dduc_polt_fund/>
				<temp3/>
				<tax_amt_dduc_hous_loan_amt_int/>
				<tax_amt_dduc_forn_pymt/>
				<tax_amt_dduc_stot/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_lvcmpy_2300_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_lvcmpy_2300_l>
	<dataSet>
		<CURLIST2>
			<record>
				<tot_pay_saly/>
				<non_tax_stot/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_lvcmpy_2300_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_lvcmpy_2300_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<nm_korn/>
				<dept_cd/>
				<dept_nm/>
				<in_cmpy_dt/>
				<last_midl_adjm_dt/>
				<lvcmpy_dt/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_lvcmpy_2300_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_lvcmpy_2300_l>
	<dataSet>
		<CURLIST5>
			<record>
				<etc_saly_amt/>
				<year_end/>
			</record>
		</CURLIST5>
	</dataSet>
</hd_lvcmpy_2300_l>
*/
%>

<% /* 작성시간 : Tue Aug 18 09:50:50 KST 2009 */ %>