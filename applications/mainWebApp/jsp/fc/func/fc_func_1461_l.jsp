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
	FC_FUNC_1461_LDataSet ds = (FC_FUNC_1461_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1461_LCURLISTRecord rec = (FC_FUNC_1461_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "note_clsf_cdnm", rec.note_clsf_cdnm);
			rx.add(record, "note_full_no", rec.note_full_no);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "deps_dt", rec.deps_dt);
			rx.add(record, "sale_dscn_amt", rec.sale_dscn_amt);
			rx.addCData(record, "bank_cd_nm", rec.bank_cd_nm);
			rx.add(record, "rcpm_acct_nm2", rec.rcpm_acct_nm2);
			rx.add(record, "rcpay_amt", rec.rcpay_amt);
			rx.add(record, "corp_tax", rec.corp_tax);
			rx.add(record, "etc_prft", rec.etc_prft);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.addCData(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.addCData(record, "dlco_cdnm", rec.dlco_cdnm);
			rx.add(record, "pay_plac_cdnm", rec.pay_plac_cdnm);
			rx.add(record, "now_note_stat_cdnm", rec.now_note_stat_cdnm);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "sale_aprv_no", rec.sale_aprv_no);
			rx.add(record, "coms", rec.coms);
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "note_seq", rec.note_seq);
			rx.add(record, "corp_local_tax", rec.corp_local_tax);
			//rx.add(record, "note_clsf_cdnm", StringUtil.replaceToXml(rec.note_clsf_cdnm));
			//rx.add(record, "note_full_no", StringUtil.replaceToXml(rec.note_full_no));
			//rx.add(record, "note_amt", StringUtil.replaceToXml(rec.note_amt));
			//rx.add(record, "deps_dt", StringUtil.replaceToXml(rec.deps_dt));
			//rx.add(record, "sale_dscn_amt", StringUtil.replaceToXml(rec.sale_dscn_amt));
			//rx.add(record, "bank_cd_nm", StringUtil.replaceToXml(rec.bank_cd_nm));
			//rx.add(record, "rcpm_acct_nm2", StringUtil.replaceToXml(rec.rcpm_acct_nm2));
			//rx.add(record, "rcpay_amt", StringUtil.replaceToXml(rec.rcpay_amt));
			//rx.add(record, "corp_tax", StringUtil.replaceToXml(rec.corp_tax));
			//rx.add(record, "etc_prft", StringUtil.replaceToXml(rec.etc_prft));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "issu_pers_nm", StringUtil.replaceToXml(rec.issu_pers_nm));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "dlco_cdnm", StringUtil.replaceToXml(rec.dlco_cdnm));
			//rx.add(record, "pay_plac_cdnm", StringUtil.replaceToXml(rec.pay_plac_cdnm));
			//rx.add(record, "now_note_stat_cdnm", StringUtil.replaceToXml(rec.now_note_stat_cdnm));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "sale_aprv_no", StringUtil.replaceToXml(rec.sale_aprv_no));
			//rx.add(record, "coms", StringUtil.replaceToXml(rec.coms));
			//rx.add(record, "note_clsf_cd", StringUtil.replaceToXml(rec.note_clsf_cd));
			//rx.add(record, "note_no", StringUtil.replaceToXml(rec.note_no));
			//rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
			//rx.add(record, "note_seq", StringUtil.replaceToXml(rec.note_seq));
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
<fc_func_1461_l>
	<dataSet>
		<CURLIST>
			<record>
				<note_clsf_cdnm/>
				<note_full_no/>
				<note_amt/>
				<deps_dt/>
				<sale_dscn_amt/>
				<bank_cd_nm/>
				<rcpm_acct_nm2/>
				<rcpay_amt/>
				<corp_tax/>
				<etc_prft/>
				<slip_no/>
				<mtry_dt/>
				<issu_pers_nm/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_cdnm/>
				<pay_plac_cdnm/>
				<now_note_stat_cdnm/>
				<comp_dt/>
				<sale_aprv_no/>
				<coms/>
				<note_clsf_cd/>
				<note_no/>
				<bank_cd/>
				<note_seq/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1461_l>
*/
%>

<% /* 작성시간 : Thu Dec 26 19:01:48 KST 2013 */ %>