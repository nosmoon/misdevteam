<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1011_LDataSet ds = (FC_FUNC_1011_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1011_LCURLISTRecord rec = (FC_FUNC_1011_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "rcpm_slip_clsf_cd", rec.rcpm_slip_clsf_cd);
			rx.add(record, "rcpm_seq", rec.rcpm_seq);
			rx.add(record, "rcpm_sub_seq", rec.rcpm_sub_seq);
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "pay_plac_cd", rec.pay_plac_cd);
			rx.add(record, "note_clehous_cd", rec.note_clehous_cd);
			rx.add(record, "issu_cmpy_clsf_cd", rec.issu_cmpy_clsf_cd);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			rx.add(record, "now_note_stat_dt", rec.now_note_stat_dt);
			rx.add(record, "fisc_aprv_stat", rec.fisc_aprv_stat);
			rx.add(record, "rmks1", rec.rmks1);
			rx.add(record, "rmks2", rec.rmks2);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "bank_cd_nm", rec.bank_cd_nm);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "rcpm_acct_nm", rec.rcpm_acct_nm);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "rcpm_acct", rec.rcpm_acct);
			rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "rcpm_dt", StringUtil.replaceToXml(rec.rcpm_dt));
			//rx.add(record, "rcpm_slip_clsf_cd", StringUtil.replaceToXml(rec.rcpm_slip_clsf_cd));
			//rx.add(record, "rcpm_seq", StringUtil.replaceToXml(rec.rcpm_seq));
			//rx.add(record, "rcpm_sub_seq", StringUtil.replaceToXml(rec.rcpm_sub_seq));
			//rx.add(record, "note_clsf_cd", StringUtil.replaceToXml(rec.note_clsf_cd));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "note_amt", StringUtil.replaceToXml(rec.note_amt));
			//rx.add(record, "pay_plac_cd", StringUtil.replaceToXml(rec.pay_plac_cd));
			//rx.add(record, "note_clehous_cd", StringUtil.replaceToXml(rec.note_clehous_cd));
			//rx.add(record, "issu_cmpy_clsf_cd", StringUtil.replaceToXml(rec.issu_cmpy_clsf_cd));
			//rx.add(record, "issu_pers_nm", StringUtil.replaceToXml(rec.issu_pers_nm));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			//rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
			//rx.add(record, "now_note_stat_cd", StringUtil.replaceToXml(rec.now_note_stat_cd));
			//rx.add(record, "now_note_stat_dt", StringUtil.replaceToXml(rec.now_note_stat_dt));
			//rx.add(record, "fisc_aprv_stat", StringUtil.replaceToXml(rec.fisc_aprv_stat));
			//rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			//rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			//rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			//rx.add(record, "chg_dt_tm", StringUtil.replaceToXml(rec.chg_dt_tm));
			//rx.add(record, "chg_pers", StringUtil.replaceToXml(rec.chg_pers));
			//rx.add(record, "incmg_pers_ipadd", StringUtil.replaceToXml(rec.incmg_pers_ipadd));
			//rx.add(record, "bank_cd_nm", StringUtil.replaceToXml(rec.bank_cd_nm));
			//rx.add(record, "compnm", StringUtil.replaceToXml(rec.compnm));
			//rx.add(record, "rcpm_acct_nm", StringUtil.replaceToXml(rec.rcpm_acct_nm));
			//rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
			//rx.add(record, "rcpm_acct", StringUtil.replaceToXml(rec.rcpm_acct));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
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
<fc_func_1011_l>
	<dataSet>
		<CURLIST>
			<record>
				<rcpm_dt/>
				<rcpm_slip_clsf_cd/>
				<rcpm_seq/>
				<rcpm_sub_seq/>
				<note_clsf_cd/>
				<comp_dt/>
				<mtry_dt/>
				<note_amt/>
				<pay_plac_cd/>
				<note_clehous_cd/>
				<issu_cmpy_clsf_cd/>
				<issu_pers_nm/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<slip_sub_seq/>
				<slip_arow_no/>
				<now_note_stat_cd/>
				<now_note_stat_dt/>
				<fisc_aprv_stat/>
				<rmks1/>
				<rmks2/>
				<fisc_dt/>
				<chg_dt_tm/>
				<chg_pers/>
				<incmg_pers_ipadd/>
				<bank_cd_nm/>
				<compnm/>
				<rcpm_acct_nm/>
				<bank_cd/>
				<rcpm_acct/>
				<slip_no/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1011_l>
*/
%>

<% /* 작성시간 : Thu Apr 23 09:53:31 KST 2009 */ %>