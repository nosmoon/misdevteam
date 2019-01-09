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
	HD_YADJM_1222_LDataSet ds = (HD_YADJM_1222_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_1222_LCURLISTRecord rec = (HD_YADJM_1222_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "adjm_rvrs_yy", rec.adjm_rvrs_yy);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "faml_seq", rec.faml_seq);
			rx.add(record, "faml_rshp_cd", rec.faml_rshp_cd);
			rx.add(record, "faml_prn", rec.faml_prn);
			rx.add(record, "faml_flnm", rec.faml_flnm);
			rx.add(record, "asrc_prpn_insr_fee_onta", rec.asrc_prpn_insr_fee_onta);
			rx.add(record, "asrc_prpn_insr_fee_etc", rec.asrc_prpn_insr_fee_etc);
			rx.add(record, "obcl_pers_insr_onta", rec.obcl_pers_insr_onta);
			rx.add(record, "obcl_pers_insr_etc", rec.obcl_pers_insr_etc);
			rx.add(record, "hosp_cost_slf_onta", rec.hosp_cost_slf_onta);
			rx.add(record, "hosp_cost_slf_etc", rec.hosp_cost_slf_etc);
			rx.add(record, "hosp_fee_onta", rec.hosp_fee_onta);
			rx.add(record, "hosp_fee_etc", rec.hosp_fee_etc);
			rx.add(record, "lgl_dona_amt_onta", rec.lgl_dona_amt_onta);
			rx.add(record, "lgl_dona_amt_etc", rec.lgl_dona_amt_etc);
			rx.add(record, "spc_case_dona_amt_onta", rec.spc_case_dona_amt_onta);
			rx.add(record, "spc_case_dona_amt_etc", rec.spc_case_dona_amt_etc);
			rx.add(record, "emp_stok_ownr_onta", rec.emp_stok_ownr_onta);
			rx.add(record, "emp_stok_ownr_etc", rec.emp_stok_ownr_etc);
			rx.add(record, "appm_dona_amt_onta", rec.appm_dona_amt_onta);
			rx.add(record, "appm_dona_amt_etc", rec.appm_dona_amt_etc);
			rx.add(record, "relg_appm_dona_amt_onta", rec.relg_appm_dona_amt_onta);
			rx.add(record, "relg_appm_dona_amt_etc", rec.relg_appm_dona_amt_etc);
			rx.add(record, "edu_cost_slf_sclgg_onta", rec.edu_cost_slf_sclgg_onta);
			rx.add(record, "edu_cost_slf_sclgg_etc", rec.edu_cost_slf_sclgg_etc);
			rx.add(record, "edu_cost_slf_onta", rec.edu_cost_slf_onta);
			rx.add(record, "edu_cost_slf_etc", rec.edu_cost_slf_etc);
			rx.add(record, "edu_cost_ent_scl_onta", rec.edu_cost_ent_scl_onta);
			rx.add(record, "edu_cost_ent_scl_etc", rec.edu_cost_ent_scl_etc);
			rx.add(record, "edu_cost_elmihi_onta", rec.edu_cost_elmihi_onta);
			rx.add(record, "edu_cost_elmihi_etc", rec.edu_cost_elmihi_etc);
			rx.add(record, "edu_cost_univ_onta", rec.edu_cost_univ_onta);
			rx.add(record, "edu_cost_univ_etc", rec.edu_cost_univ_etc);
			rx.add(record, "edu_splen_pers_onta", rec.edu_splen_pers_onta);
			rx.add(record, "edu_splen_pers_etc", rec.edu_splen_pers_etc);
			rx.add(record, "crdt_card_tot_amt_onta", rec.crdt_card_tot_amt_onta);
			rx.add(record, "crdt_card_tot_amt_etc", rec.crdt_card_tot_amt_etc);
			rx.add(record, "edu_cost_giro_pymt_onta", rec.edu_cost_giro_pymt_onta);
			rx.add(record, "edu_cost_giro_pymt_etc", rec.edu_cost_giro_pymt_etc);
			rx.add(record, "cash_rcpt_onta", rec.cash_rcpt_onta);
			//rx.add(record, "adjm_rvrs_yy", StringUtil.replaceToXml(rec.adjm_rvrs_yy));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "faml_seq", StringUtil.replaceToXml(rec.faml_seq));
			//rx.add(record, "faml_rshp_cd", StringUtil.replaceToXml(rec.faml_rshp_cd));
			//rx.add(record, "faml_prn", StringUtil.replaceToXml(rec.faml_prn));
			//rx.add(record, "faml_flnm", StringUtil.replaceToXml(rec.faml_flnm));
			//rx.add(record, "asrc_prpn_insr_fee_onta", StringUtil.replaceToXml(rec.asrc_prpn_insr_fee_onta));
			//rx.add(record, "asrc_prpn_insr_fee_etc", StringUtil.replaceToXml(rec.asrc_prpn_insr_fee_etc));
			//rx.add(record, "obcl_pers_insr_onta", StringUtil.replaceToXml(rec.obcl_pers_insr_onta));
			//rx.add(record, "obcl_pers_insr_etc", StringUtil.replaceToXml(rec.obcl_pers_insr_etc));
			//rx.add(record, "hosp_cost_slf_onta", StringUtil.replaceToXml(rec.hosp_cost_slf_onta));
			//rx.add(record, "hosp_cost_slf_etc", StringUtil.replaceToXml(rec.hosp_cost_slf_etc));
			//rx.add(record, "hosp_fee_onta", StringUtil.replaceToXml(rec.hosp_fee_onta));
			//rx.add(record, "hosp_fee_etc", StringUtil.replaceToXml(rec.hosp_fee_etc));
			//rx.add(record, "lgl_dona_amt_onta", StringUtil.replaceToXml(rec.lgl_dona_amt_onta));
			//rx.add(record, "lgl_dona_amt_etc", StringUtil.replaceToXml(rec.lgl_dona_amt_etc));
			//rx.add(record, "spc_case_dona_amt_onta", StringUtil.replaceToXml(rec.spc_case_dona_amt_onta));
			//rx.add(record, "spc_case_dona_amt_etc", StringUtil.replaceToXml(rec.spc_case_dona_amt_etc));
			//rx.add(record, "emp_stok_ownr_onta", StringUtil.replaceToXml(rec.emp_stok_ownr_onta));
			//rx.add(record, "emp_stok_ownr_etc", StringUtil.replaceToXml(rec.emp_stok_ownr_etc));
			//rx.add(record, "appm_dona_amt_onta", StringUtil.replaceToXml(rec.appm_dona_amt_onta));
			//rx.add(record, "appm_dona_amt_etc", StringUtil.replaceToXml(rec.appm_dona_amt_etc));
			//rx.add(record, "relg_appm_dona_amt_onta", StringUtil.replaceToXml(rec.relg_appm_dona_amt_onta));
			//rx.add(record, "relg_appm_dona_amt_etc", StringUtil.replaceToXml(rec.relg_appm_dona_amt_etc));
			//rx.add(record, "edu_cost_slf_sclgg_onta", StringUtil.replaceToXml(rec.edu_cost_slf_sclgg_onta));
			//rx.add(record, "edu_cost_slf_sclgg_etc", StringUtil.replaceToXml(rec.edu_cost_slf_sclgg_etc));
			//rx.add(record, "edu_cost_slf_onta", StringUtil.replaceToXml(rec.edu_cost_slf_onta));
			//rx.add(record, "edu_cost_slf_etc", StringUtil.replaceToXml(rec.edu_cost_slf_etc));
			//rx.add(record, "edu_cost_ent_scl_onta", StringUtil.replaceToXml(rec.edu_cost_ent_scl_onta));
			//rx.add(record, "edu_cost_ent_scl_etc", StringUtil.replaceToXml(rec.edu_cost_ent_scl_etc));
			//rx.add(record, "edu_cost_elmihi_onta", StringUtil.replaceToXml(rec.edu_cost_elmihi_onta));
			//rx.add(record, "edu_cost_elmihi_etc", StringUtil.replaceToXml(rec.edu_cost_elmihi_etc));
			//rx.add(record, "edu_cost_univ_onta", StringUtil.replaceToXml(rec.edu_cost_univ_onta));
			//rx.add(record, "edu_cost_univ_etc", StringUtil.replaceToXml(rec.edu_cost_univ_etc));
			//rx.add(record, "edu_splen_pers_onta", StringUtil.replaceToXml(rec.edu_splen_pers_onta));
			//rx.add(record, "edu_splen_pers_etc", StringUtil.replaceToXml(rec.edu_splen_pers_etc));
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
<hd_yadjm_1222_l>
	<dataSet>
		<CURLIST>
			<record>
				<adjm_rvrs_yy/>
				<emp_no/>
				<faml_seq/>
				<faml_rshp_cd/>
				<faml_prn/>
				<faml_flnm/>
				<asrc_prpn_insr_fee_onta/>
				<asrc_prpn_insr_fee_etc/>
				<obcl_pers_insr_onta/>
				<obcl_pers_insr_etc/>
				<hosp_cost_slf_onta/>
				<hosp_cost_slf_etc/>
				<hosp_fee_onta/>
				<hosp_fee_etc/>
				<lgl_dona_amt_onta/>
				<lgl_dona_amt_etc/>
				<spc_case_dona_amt_onta/>
				<spc_case_dona_amt_etc/>
				<emp_stok_ownr_onta/>
				<emp_stok_ownr_etc/>
				<appm_dona_amt_onta/>
				<appm_dona_amt_etc/>
				<relg_appm_dona_amt_onta/>
				<relg_appm_dona_amt_etc/>
				<edu_cost_slf_sclgg_onta/>
				<edu_cost_slf_sclgg_etc/>
				<edu_cost_slf_onta/>
				<edu_cost_slf_etc/>
				<edu_cost_ent_scl_onta/>
				<edu_cost_ent_scl_etc/>
				<edu_cost_elmihi_onta/>
				<edu_cost_elmihi_etc/>
				<edu_cost_univ_onta/>
				<edu_cost_univ_etc/>
				<edu_splen_pers_onta/>
				<edu_splen_pers_etc/>
				<crdt_card_tot_amt_onta/>
				<crdt_card_tot_amt_etc/>
				<edu_cost_giro_pymt_onta/>
				<edu_cost_giro_pymt_etc/>
				<cash_rcpt_onta/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_1222_l>
*/
%>

<% /* 작성시간 : Sun Aug 23 17:01:03 KST 2009 */ %>