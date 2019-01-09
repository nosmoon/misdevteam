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
	HD_YADJM_5200_LDataSet ds = (HD_YADJM_5200_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_5200_LCURLISTRecord rec = (HD_YADJM_5200_LCURLISTRecord)ds.curlist.get(i);
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
			rx.add(record, "relg_appm_dona_amt_etc", rec.relg_appm_dona_amt_etc);
			rx.add(record, "appm_dona_amt_etc", rec.appm_dona_amt_etc);
			rx.add(record, "lgl_dona_amt_etc", rec.lgl_dona_amt_etc);
			rx.add(record, "dduc_polt_fund", rec.dduc_polt_fund);
			rx.add(record, "spc_case_dona_amt_etc", rec.spc_case_dona_amt_etc);
			rx.add(record, "crdt_card_tot_amt_onta", rec.crdt_card_tot_amt_onta);
			rx.add(record, "crdt_card_tot_amt_etc", rec.crdt_card_tot_amt_etc);
			rx.add(record, "edu_cost_giro_pymt_onta", rec.edu_cost_giro_pymt_onta);
			rx.add(record, "edu_cost_giro_pymt_etc", rec.edu_cost_giro_pymt_etc);
			rx.add(record, "cash_rcpt_onta", rec.cash_rcpt_onta);
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
			//rx.add(record, "relg_appm_dona_amt_etc", StringUtil.replaceToXml(rec.relg_appm_dona_amt_etc));
			//rx.add(record, "appm_dona_amt_etc", StringUtil.replaceToXml(rec.appm_dona_amt_etc));
			//rx.add(record, "lgl_dona_amt_etc", StringUtil.replaceToXml(rec.lgl_dona_amt_etc));
			//rx.add(record, "dduc_polt_fund", StringUtil.replaceToXml(rec.dduc_polt_fund));
			//rx.add(record, "spc_case_dona_amt_etc", StringUtil.replaceToXml(rec.spc_case_dona_amt_etc));
			//rx.add(record, "crdt_card_tot_amt_onta", StringUtil.replaceToXml(rec.crdt_card_tot_amt_onta));
			//rx.add(record, "crdt_card_tot_amt_etc", StringUtil.replaceToXml(rec.crdt_card_tot_amt_etc));
			//rx.add(record, "edu_cost_giro_pymt_onta", StringUtil.replaceToXml(rec.edu_cost_giro_pymt_onta));
			//rx.add(record, "edu_cost_giro_pymt_etc", StringUtil.replaceToXml(rec.edu_cost_giro_pymt_etc));
			//rx.add(record, "cash_rcpt_onta", StringUtil.replaceToXml(rec.cash_rcpt_onta));
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
<hd_yadjm_5200_l>
	<dataSet>
		<CURLIST>
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
				<relg_appm_dona_amt_etc/>
				<appm_dona_amt_etc/>
				<lgl_dona_amt_etc/>
				<dduc_polt_fund/>
				<spc_case_dona_amt_etc/>
				<crdt_card_tot_amt_onta/>
				<crdt_card_tot_amt_etc/>
				<edu_cost_giro_pymt_onta/>
				<edu_cost_giro_pymt_etc/>
				<cash_rcpt_onta/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_5200_l>
*/
%>

<% /* 작성시간 : Mon Jan 25 11:19:21 KST 2010 */ %>