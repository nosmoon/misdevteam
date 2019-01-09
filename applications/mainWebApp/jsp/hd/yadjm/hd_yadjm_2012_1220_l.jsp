<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_2012_1220_LDataSet ds = (HD_YADJM_2012_1220_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_2012_1220_LCURLIST4Record rec = (HD_YADJM_2012_1220_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "adjm_rvrs_yy", rec.adjm_rvrs_yy);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "faml_seq", rec.faml_seq);
			rx.add(record, "base_dduc_yn", rec.base_dduc_yn);
			rx.add(record, "obcl_pers_dduc_yn", rec.obcl_pers_dduc_yn);
			rx.add(record, "fml_hshd_dduc_yn", rec.fml_hshd_dduc_yn);
			rx.add(record, "care_fee_dduc_yn", rec.care_fee_dduc_yn);
			rx.add(record, "faml_rshp_cd", rec.faml_rshp_cd);
			rx.add(record, "faml_flnm", rec.faml_flnm);
			rx.add(record, "faml_prn", rec.faml_prn);
			rx.add(record, "adopt_dt", rec.adopt_dt);
			rx.add(record, "dth_dt", rec.dth_dt);
			rx.add(record, "edu_suppamt", rec.edu_suppamt);
			rx.add(record, "edu_fee_clsf_cd", rec.edu_fee_clsf_cd);
			rx.add(record, "edu_cost_onta", rec.edu_cost_onta);
			rx.add(record, "edu_cost_etc", rec.edu_cost_etc);
			rx.add(record, "edu_splen_pers_onta", rec.edu_splen_pers_onta);
			rx.add(record, "edu_splen_pers_etc", rec.edu_splen_pers_etc);
			rx.add(record, "heal_suppamt", rec.heal_suppamt);
			rx.add(record, "hosp_cost_onta", rec.hosp_cost_onta);
			rx.add(record, "hosp_cost_etc", rec.hosp_cost_etc);
			rx.add(record, "asrc_prpn_insr_fee_onta", rec.asrc_prpn_insr_fee_onta);
			rx.add(record, "asrc_prpn_insr_fee_etc", rec.asrc_prpn_insr_fee_etc);
			rx.add(record, "obcl_pers_insr_onta", rec.obcl_pers_insr_onta);
			rx.add(record, "obcl_pers_insr_etc", rec.obcl_pers_insr_etc);
			rx.add(record, "nonprofit_dona_amt_etc", rec.nonprofit_dona_amt_etc);
			rx.add(record, "relg_appm_dona_amt_etc", rec.relg_appm_dona_amt_etc);
			rx.add(record, "appm_dona_amt_etc", rec.appm_dona_amt_etc);
			rx.add(record, "lgl_dona_amt_etc", rec.lgl_dona_amt_etc);
			rx.add(record, "dduc_polt_fund", rec.dduc_polt_fund);
			rx.add(record, "spc_case_dona_amt_etc", rec.spc_case_dona_amt_etc);
			rx.add(record, "crdt_card_tot_amt_onta", rec.crdt_card_tot_amt_onta);
			rx.add(record, "crdt_card_tot_amt_etc", rec.crdt_card_tot_amt_etc);
			rx.add(record, "debit_card_tot_amt_onta", rec.debit_card_tot_amt_onta);
			rx.add(record, "debit_card_tot_amt_etc", rec.debit_card_tot_amt_etc);
			rx.add(record, "edu_cost_giro_pymt_onta", rec.edu_cost_giro_pymt_onta);
			rx.add(record, "edu_cost_giro_pymt_etc", rec.edu_cost_giro_pymt_etc);
			rx.add(record, "cash_rcpt_onta", rec.cash_rcpt_onta);
			rx.add(record, "trad_mrkt_onta", rec.trad_mrkt_onta);
			rx.add(record, "trad_mrkt_etc", rec.trad_mrkt_etc);
			//rx.add(record, "adjm_rvrs_yy", StringUtil.replaceToXml(rec.adjm_rvrs_yy));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "faml_seq", StringUtil.replaceToXml(rec.faml_seq));
			//rx.add(record, "base_dduc_yn", StringUtil.replaceToXml(rec.base_dduc_yn));
			//rx.add(record, "obcl_pers_dduc_yn", StringUtil.replaceToXml(rec.obcl_pers_dduc_yn));
			//rx.add(record, "fml_hshd_dduc_yn", StringUtil.replaceToXml(rec.fml_hshd_dduc_yn));
			//rx.add(record, "care_fee_dduc_yn", StringUtil.replaceToXml(rec.care_fee_dduc_yn));
			//rx.add(record, "faml_rshp_cd", StringUtil.replaceToXml(rec.faml_rshp_cd));
			//rx.add(record, "faml_flnm", StringUtil.replaceToXml(rec.faml_flnm));
			//rx.add(record, "faml_prn", StringUtil.replaceToXml(rec.faml_prn));
			//rx.add(record, "adopt_dt", StringUtil.replaceToXml(rec.adopt_dt));
			//rx.add(record, "dth_dt", StringUtil.replaceToXml(rec.dth_dt));
			//rx.add(record, "edu_suppamt", StringUtil.replaceToXml(rec.edu_suppamt));
			//rx.add(record, "edu_fee_clsf_cd", StringUtil.replaceToXml(rec.edu_fee_clsf_cd));
			//rx.add(record, "edu_cost_onta", StringUtil.replaceToXml(rec.edu_cost_onta));
			//rx.add(record, "edu_cost_etc", StringUtil.replaceToXml(rec.edu_cost_etc));
			//rx.add(record, "edu_splen_pers_onta", StringUtil.replaceToXml(rec.edu_splen_pers_onta));
			//rx.add(record, "edu_splen_pers_etc", StringUtil.replaceToXml(rec.edu_splen_pers_etc));
			//rx.add(record, "heal_suppamt", StringUtil.replaceToXml(rec.heal_suppamt));
			//rx.add(record, "hosp_cost_onta", StringUtil.replaceToXml(rec.hosp_cost_onta));
			//rx.add(record, "hosp_cost_etc", StringUtil.replaceToXml(rec.hosp_cost_etc));
			//rx.add(record, "asrc_prpn_insr_fee_onta", StringUtil.replaceToXml(rec.asrc_prpn_insr_fee_onta));
			//rx.add(record, "asrc_prpn_insr_fee_etc", StringUtil.replaceToXml(rec.asrc_prpn_insr_fee_etc));
			//rx.add(record, "obcl_pers_insr_onta", StringUtil.replaceToXml(rec.obcl_pers_insr_onta));
			//rx.add(record, "obcl_pers_insr_etc", StringUtil.replaceToXml(rec.obcl_pers_insr_etc));
			//rx.add(record, "nonprofit_dona_amt_etc", StringUtil.replaceToXml(rec.nonprofit_dona_amt_etc));
			//rx.add(record, "relg_appm_dona_amt_etc", StringUtil.replaceToXml(rec.relg_appm_dona_amt_etc));
			//rx.add(record, "appm_dona_amt_etc", StringUtil.replaceToXml(rec.appm_dona_amt_etc));
			//rx.add(record, "lgl_dona_amt_etc", StringUtil.replaceToXml(rec.lgl_dona_amt_etc));
			//rx.add(record, "dduc_polt_fund", StringUtil.replaceToXml(rec.dduc_polt_fund));
			//rx.add(record, "spc_case_dona_amt_etc", StringUtil.replaceToXml(rec.spc_case_dona_amt_etc));
			//rx.add(record, "crdt_card_tot_amt_onta", StringUtil.replaceToXml(rec.crdt_card_tot_amt_onta));
			//rx.add(record, "crdt_card_tot_amt_etc", StringUtil.replaceToXml(rec.crdt_card_tot_amt_etc));
			//rx.add(record, "debit_card_tot_amt_onta", StringUtil.replaceToXml(rec.debit_card_tot_amt_onta));
			//rx.add(record, "debit_card_tot_amt_etc", StringUtil.replaceToXml(rec.debit_card_tot_amt_etc));
			//rx.add(record, "edu_cost_giro_pymt_onta", StringUtil.replaceToXml(rec.edu_cost_giro_pymt_onta));
			//rx.add(record, "edu_cost_giro_pymt_etc", StringUtil.replaceToXml(rec.edu_cost_giro_pymt_etc));
			//rx.add(record, "cash_rcpt_onta", StringUtil.replaceToXml(rec.cash_rcpt_onta));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_YADJM_2012_1220_LCURLIST3Record rec = (HD_YADJM_2012_1220_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			//rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cd_type", StringUtil.replaceToXml(rec.cd_type));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_YADJM_2012_1220_LCURLIST2Record rec = (HD_YADJM_2012_1220_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "limit_hosp_amt", rec.limit_hosp_amt);
			rx.add(record, "limit_crdt_amt", rec.limit_crdt_amt);
			rx.add(record, "sum_tot_saly_amt", rec.sum_tot_saly_amt);
			//rx.add(record, "limit_hosp_amt", StringUtil.replaceToXml(rec.limit_hosp_amt));
			//rx.add(record, "limit_crdt_amt", StringUtil.replaceToXml(rec.limit_crdt_amt));
			//rx.add(record, "sum_tot_saly_amt", StringUtil.replaceToXml(rec.sum_tot_saly_amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_YADJM_2012_1220_LCURLIST1Record rec = (HD_YADJM_2012_1220_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "zip_1_1", rec.zip_1_1);
			rx.add(record, "zip_2_1", rec.zip_2_1);
			rx.add(record, "addr_1", rec.addr_1);
			rx.add(record, "dtls_addr_1", rec.dtls_addr_1);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "zip_1_1", StringUtil.replaceToXml(rec.zip_1_1));
			//rx.add(record, "zip_2_1", StringUtil.replaceToXml(rec.zip_2_1));
			//rx.add(record, "addr_1", StringUtil.replaceToXml(rec.addr_1));
			//rx.add(record, "dtls_addr_1", StringUtil.replaceToXml(rec.dtls_addr_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_YADJM_2012_1220_LCURLISTRecord rec = (HD_YADJM_2012_1220_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "adjm_rvrs_yy", rec.adjm_rvrs_yy);
			rx.add(record, "adjm_clsf", rec.adjm_clsf);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "prsn_pens", rec.prsn_pens);
			rx.add(record, "pens_savg", rec.pens_savg);
			rx.add(record, "invsm_cmpd_invsm_amt_6", rec.invsm_cmpd_invsm_amt_6);
			rx.add(record, "invsm_cmpd_invsm_amt", rec.invsm_cmpd_invsm_amt);
			rx.add(record, "hous_subc_savg", rec.hous_subc_savg);
			rx.add(record, "multy_house_plan_savg", rec.multy_house_plan_savg);
			rx.add(record, "ltrm_hous_savg", rec.ltrm_hous_savg);
			rx.add(record, "labr_hous_savg", rec.labr_hous_savg);
			rx.add(record, "hous_hire_rcpm_won_li_amt_repa", rec.hous_hire_rcpm_won_li_amt_repa);
			rx.add(record, "monthly_rent_amt", rec.monthly_rent_amt);
			rx.add(record, "hous_loan_amt_int_1", rec.hous_loan_amt_int_1);
			rx.add(record, "hous_loan_amt_int_2012_1", rec.hous_loan_amt_int_2012_1 );
			rx.add(record, "hous_loan_amt_int_2012_2", rec.hous_loan_amt_int_2012_2 );
			rx.add(record, "ltrm_hous_mogg_loan_amt_int_re", rec.ltrm_hous_mogg_loan_amt_int_re);
			rx.add(record, "hous_loan_amt_int", rec.hous_loan_amt_int);
			rx.add(record, "ltrm_stok_type_savg_incm_dduc1", rec.ltrm_stok_type_savg_incm_dduc1);
			rx.add(record, "ltrm_stok_type_savg_incm_dduc2", rec.ltrm_stok_type_savg_incm_dduc2);
			rx.add(record, "ltrm_stok_type_savg_incm_dduc3", rec.ltrm_stok_type_savg_incm_dduc3);
			rx.add(record, "lvcmpy_pens", rec.lvcmpy_pens);
			rx.add(record, "smallbiz_incm_dduc", rec.smallbiz_incm_dduc);
			//rx.add(record, "adjm_rvrs_yy", StringUtil.replaceToXml(rec.adjm_rvrs_yy));
			//rx.add(record, "adjm_clsf", StringUtil.replaceToXml(rec.adjm_clsf));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "prsn_pens", StringUtil.replaceToXml(rec.prsn_pens));
			//rx.add(record, "pens_savg", StringUtil.replaceToXml(rec.pens_savg));
			//rx.add(record, "invsm_cmpd_invsm_amt_6", StringUtil.replaceToXml(rec.invsm_cmpd_invsm_amt_6));
			//rx.add(record, "invsm_cmpd_invsm_amt", StringUtil.replaceToXml(rec.invsm_cmpd_invsm_amt));
			//rx.add(record, "hous_subc_savg", StringUtil.replaceToXml(rec.hous_subc_savg));
			//rx.add(record, "multy_house_plan_savg", StringUtil.replaceToXml(rec.multy_house_plan_savg));
			//rx.add(record, "ltrm_hous_savg", StringUtil.replaceToXml(rec.ltrm_hous_savg));
			//rx.add(record, "labr_hous_savg", StringUtil.replaceToXml(rec.labr_hous_savg));
			//rx.add(record, "hous_hire_rcpm_won_li_amt_repa", StringUtil.replaceToXml(rec.hous_hire_rcpm_won_li_amt_repa));
			//rx.add(record, "monthly_rent_amt", StringUtil.replaceToXml(rec.monthly_rent_amt));
			//rx.add(record, "hous_loan_amt_int_1", StringUtil.replaceToXml(rec.hous_loan_amt_int_1));
			//rx.add(record, "ltrm_hous_mogg_loan_amt_int_re", StringUtil.replaceToXml(rec.ltrm_hous_mogg_loan_amt_int_re));
			//rx.add(record, "hous_loan_amt_int", StringUtil.replaceToXml(rec.hous_loan_amt_int));
			//rx.add(record, "ltrm_stok_type_savg_incm_dduc1", StringUtil.replaceToXml(rec.ltrm_stok_type_savg_incm_dduc1));
			//rx.add(record, "ltrm_stok_type_savg_incm_dduc2", StringUtil.replaceToXml(rec.ltrm_stok_type_savg_incm_dduc2));
			//rx.add(record, "ltrm_stok_type_savg_incm_dduc3", StringUtil.replaceToXml(rec.ltrm_stok_type_savg_incm_dduc3));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			HD_YADJM_2012_1220_LCURLIST5Record rec = (HD_YADJM_2012_1220_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "befrduty_cnt", rec.befrduty_cnt);
			//rx.add(record, "befrduty_cnt", StringUtil.replaceToXml(rec.befrduty_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */
		
		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			HD_YADJM_2012_1220_LCURLIST6Record rec = (HD_YADJM_2012_1220_LCURLIST6Record)ds.curlist6.get(i);
			//int record = rx.add(recordSet, "record", "");
			rx.add(recordSet, "upload_dt", rec.upload_dt);
			rx.add(recordSet, "add_file_nm", rec.add_file_nm);
			rx.add(recordSet, "add_file", rec.add_file);
			//rx.add(record, "upload_dt", StringUtil.replaceToXml(rec.upload_dt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */
		
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
<hd_yadjm_2012_1220_l>
	<dataSet>
		<CURLIST4>
			<record>
				<adjm_rvrs_yy/>
				<emp_no/>
				<faml_seq/>
				<base_dduc_yn/>
				<obcl_pers_dduc_yn/>
				<fml_hshd_dduc_yn/>
				<care_fee_dduc_yn/>
				<faml_rshp_cd/>
				<faml_flnm/>
				<faml_prn/>
				<adopt_dt/>
				<dth_dt/>
				<edu_suppamt/>
				<edu_fee_clsf_cd/>
				<edu_cost_onta/>
				<edu_cost_etc/>
				<edu_splen_pers_onta/>
				<edu_splen_pers_etc/>
				<heal_suppamt/>
				<hosp_cost_onta/>
				<hosp_cost_etc/>
				<asrc_prpn_insr_fee_onta/>
				<asrc_prpn_insr_fee_etc/>
				<obcl_pers_insr_onta/>
				<obcl_pers_insr_etc/>
				<nonprofit_dona_amt_etc/>
				<relg_appm_dona_amt_etc/>
				<appm_dona_amt_etc/>
				<lgl_dona_amt_etc/>
				<dduc_polt_fund/>
				<spc_case_dona_amt_etc/>
				<crdt_card_tot_amt_onta/>
				<crdt_card_tot_amt_etc/>
				<debit_card_tot_amt_onta/>
				<debit_card_tot_amt_etc/>
				<edu_cost_giro_pymt_onta/>
				<edu_cost_giro_pymt_etc/>
				<cash_rcpt_onta/>
			</record>
		</CURLIST4>
	</dataSet>
</hd_yadjm_2012_1220_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_yadjm_2012_1220_l>
	<dataSet>
		<CURLIST3>
			<record>
				<cd_type/>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_yadjm_2012_1220_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_yadjm_2012_1220_l>
	<dataSet>
		<CURLIST2>
			<record>
				<limit_hosp_amt/>
				<limit_crdt_amt/>
				<sum_tot_saly_amt/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_yadjm_2012_1220_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_yadjm_2012_1220_l>
	<dataSet>
		<CURLIST1>
			<record>
				<emp_no/>
				<zip_1_1/>
				<zip_2_1/>
				<addr_1/>
				<dtls_addr_1/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_yadjm_2012_1220_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_yadjm_2012_1220_l>
	<dataSet>
		<CURLIST>
			<record>
				<adjm_rvrs_yy/>
				<adjm_clsf/>
				<emp_no/>
				<prsn_pens/>
				<pens_savg/>
				<invsm_cmpd_invsm_amt_6/>
				<invsm_cmpd_invsm_amt/>
				<hous_subc_savg/>
				<multy_house_plan_savg/>
				<ltrm_hous_savg/>
				<labr_hous_savg/>
				<hous_hire_rcpm_won_li_amt_repa/>
				<monthly_rent_amt/>
				<hous_loan_amt_int_1/>
				<ltrm_hous_mogg_loan_amt_int_re/>
				<hous_loan_amt_int/>
				<ltrm_stok_type_savg_incm_dduc1/>
				<ltrm_stok_type_savg_incm_dduc2/>
				<ltrm_stok_type_savg_incm_dduc3/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_2012_1220_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_yadjm_2012_1220_l>
	<dataSet>
		<CURLIST5>
			<record>
				<befrduty_cnt/>
			</record>
		</CURLIST5>
	</dataSet>
</hd_yadjm_2012_1220_l>
*/
%>

<% /* 작성시간 : Fri Jan 14 2012_:23:07 KST 202012_ */ %>