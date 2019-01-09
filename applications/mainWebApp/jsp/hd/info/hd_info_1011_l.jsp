<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_1011_LDataSet ds = (HD_INFO_1011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");.
		int record = rx.add(root, "tempData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1011_LCURLISTRecord rec = (HD_INFO_1011_LCURLISTRecord)ds.curlist.get(i);
			//int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "duty_area_cd", rec.duty_area_cd);
			rx.add(record, "duty_area_nm", rec.duty_area_nm);
			rx.add(record, "dtplc_cd", rec.dtplc_cd);
			rx.add(record, "dtplc_nm", rec.dtplc_nm);
			rx.add(record, "in_cmpy_psgp_cd", rec.in_cmpy_psgp_cd);
			rx.add(record, "in_cmpy_psgp_nm", rec.in_cmpy_psgp_nm);
			rx.add(record, "in_cmpy_octgr_cd", rec.in_cmpy_octgr_cd);
			rx.add(record, "in_cmpy_octgr_nm", rec.in_cmpy_octgr_nm);
			rx.add(record, "in_cmpy_posk_cd", rec.in_cmpy_posk_cd);
			rx.add(record, "in_cmpy_posk_nm", rec.in_cmpy_posk_nm);
			rx.add(record, "cur_jobforc_cd", rec.cur_jobforc_cd);
			rx.add(record, "cur_jobforc_nm", rec.cur_jobforc_nm);
			rx.add(record, "cur_jobkind_cd", rec.cur_jobkind_cd);
			rx.add(record, "cur_jobkind_nm", rec.cur_jobkind_nm);
			rx.add(record, "cur_jobnon_cd", rec.cur_jobnon_cd);
			rx.addCData(record, "cur_jobnon_nm", rec.cur_jobnon_nm);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "lvcmpy_resn_cd", rec.lvcmpy_resn_cd);
			rx.add(record, "lvcmpy_resn_nm", rec.lvcmpy_resn_nm);
			rx.add(record, "last_midl_adjm_dt", rec.last_midl_adjm_dt);
			rx.add(record, "midl_adjm_tms", rec.midl_adjm_tms);
			rx.add(record, "last_upgrd_dt", rec.last_upgrd_dt);
			rx.add(record, "last_saly_chg_appmt_dt", rec.last_saly_chg_appmt_dt);
			rx.add(record, "last_appmt_dt", rec.last_appmt_dt);
			rx.add(record, "last_appmt_cd", rec.last_appmt_cd);
			rx.add(record, "last_appmt_nm", rec.last_appmt_nm);
			rx.add(record, "last_appmt_cont", rec.last_appmt_cont);
			rx.add(record, "last_temp_dt", rec.last_temp_dt);
			rx.add(record, "last_reinst_dt", rec.last_reinst_dt);
			rx.add(record, "last_temp_clsf", rec.last_temp_clsf);
			rx.add(record, "last_temp_clsf_nm", rec.last_temp_clsf_nm);
			rx.add(record, "last_stdy_dt", rec.last_stdy_dt);
			rx.add(record, "last_stdy_reinst_dt", rec.last_stdy_reinst_dt);
			rx.add(record, "in_cmpy_clsf", rec.in_cmpy_clsf);
			rx.add(record, "in_cmpy_clsf_nm", rec.in_cmpy_clsf_nm);
			rx.add(record, "open_invit_clsf", rec.open_invit_clsf);
			rx.add(record, "open_invit_clsf_nm", rec.open_invit_clsf_nm);
			rx.add(record, "open_invit_desty", rec.open_invit_desty);
			rx.add(record, "relg_cd", rec.relg_cd);
			rx.add(record, "relg_nm", rec.relg_nm);
			rx.add(record, "in_cmpy_resn_cd", rec.in_cmpy_resn_cd);
			rx.add(record, "in_cmpy_resn_nm", rec.in_cmpy_resn_nm);
			rx.add(record, "recom_pers_rshp_cd", rec.recom_pers_rshp_cd);
			rx.add(record, "recom_pers_rshp_nm", rec.recom_pers_rshp_nm);
			rx.add(record, "recom_pers_flnm", rec.recom_pers_flnm);
			rx.add(record, "blod_cd", rec.blod_cd);
			rx.add(record, "blod_nm", rec.blod_nm);
			rx.add(record, "nativ_cd", rec.nativ_cd);
			rx.add(record, "nativ_dtls_area", rec.nativ_dtls_area);
			rx.add(record, "hby_1", rec.hby_1);
			rx.add(record, "hby_2", rec.hby_2);
			rx.add(record, "spc_1", rec.spc_1);
			rx.add(record, "spc_2", rec.spc_2);
			rx.add(record, "saly_shft_bank_cd", rec.saly_shft_bank_cd);
			rx.add(record, "saly_shft_bank_nm", rec.saly_shft_bank_nm);
			rx.add(record, "saly_shft_acct_no", rec.saly_shft_acct_no);
			rx.add(record, "alon_shft_bank_cd", rec.alon_shft_bank_cd);
			rx.add(record, "alon_shft_bank_nm", rec.alon_shft_bank_nm);
			rx.add(record, "alon_shft_acct_no", rec.alon_shft_acct_no);
			rx.add(record, "encrg_amt_shft_bank_cd", rec.encrg_amt_shft_bank_cd);
			rx.add(record, "encrg_amt_shft_bank_nm", rec.encrg_amt_shft_bank_nm);
			rx.add(record, "encrg_amt_shft_acct_no", rec.encrg_amt_shft_acct_no);
			rx.add(record, "etc_shft_bank_cd", rec.etc_shft_bank_cd);
			rx.add(record, "etc_shft_bank_nm", rec.etc_shft_bank_nm);
			rx.add(record, "etc_shft_acct_no", rec.etc_shft_acct_no);
			rx.add(record, "etc_shft_chqe_pay_yn", rec.etc_shft_chqe_pay_yn);
			rx.add(record, "aprv_in_cmpy", rec.aprv_in_cmpy);
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
<dataSet>
	<CURLIST>
		<record>
			<emp_no/>
			<duty_area_cd/>
			<duty_area_nm/>
			<dtplc_cd/>
			<dtplc_nm/>
			<in_cmpy_psgp_cd/>
			<in_cmpy_psgp_nm/>
			<in_cmpy_octgr_cd/>
			<in_cmpy_octgr_nm/>
			<in_cmpy_posk_cd/>
			<in_cmpy_posk_nm/>
			<cur_jobforc_cd/>
			<cur_jobforc_nm/>
			<cur_jobkind_cd/>
			<cur_jobkind_nm/>
			<cur_jobnon_cd/>
			<cur_jobnon_nm/>
			<lvcmpy_dt/>
			<lvcmpy_resn_cd/>
			<lvcmpy_resn_nm/>
			<last_midl_adjm_dt/>
			<midl_adjm_tms/>
			<last_upgrd_dt/>
			<last_saly_chg_appmt_dt/>
			<last_appmt_dt/>
			<last_appmt_cd/>
			<last_appmt_nm/>
			<last_appmt_cont/>
			<last_temp_dt/>
			<last_reinst_dt/>
			<last_temp_clsf/>
			<last_temp_clsf_nm/>
			<last_stdy_dt/>
			<last_stdy_reinst_dt/>
			<in_cmpy_clsf/>
			<in_cmpy_clsf_nm/>
			<open_invit_clsf/>
			<open_invit_clsf_nm/>
			<open_invit_desty/>
			<relg_cd/>
			<relg_nm/>
			<in_cmpy_resn_cd/>
			<in_cmpy_resn_nm/>
			<recom_pers_rshp_cd/>
			<recom_pers_rshp_nm/>
			<recom_pers_flnm/>
			<nativ_cd/>
			<nativ_dtls_area/>
			<hby_1/>
			<hby_2/>
			<spc_1/>
			<spc_2/>
			<saly_shft_bank_cd/>
			<saly_shft_bank_nm/>
			<saly_shft_acct_no/>
			<alon_shft_bank_cd/>
			<alon_shft_bank_nm/>
			<alon_shft_acct_no/>
			<encrg_amt_shft_bank_cd/>
			<encrg_amt_shft_bank_nm/>
			<encrg_amt_shft_acct_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 03 09:18:37 KST 2009 */ %>