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
	FC_FUNC_1052_LDataSet ds = (FC_FUNC_1052_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1052_LCURLISTRecord rec = (FC_FUNC_1052_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "note_clsf_cd_nm", rec.note_clsf_cd_nm);
			//rx.add(record, "note_no", rec.note_no);
			//rx.add(record, "mtry_dt", rec.mtry_dt);
			//rx.add(record, "note_amt", rec.note_amt);
			//rx.add(record, "frex_amt", rec.frex_amt);
			//rx.add(record, "rcpay_amt", rec.rcpay_amt);
			//rx.add(record, "coms", rec.coms);
			//rx.add(record, "eeik_amt", rec.eeik_amt);
			//rx.add(record, "slipno", rec.slipno);
			//rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			//rx.add(record, "compnm2", rec.compnm2);
			//rx.add(record, "note_clehous_cd_nm", rec.note_clehous_cd_nm);
			//rx.add(record, "now_note_stat_cd_nm", rec.now_note_stat_cd_nm);
			//rx.add(record, "bank_nm", rec.bank_nm);
			//rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "note_clehous_cd", rec.note_clehous_cd);
			//rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			//rx.add(record, "compnm", rec.compnm);
			//rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			//rx.add(record, "dlco_clsf_cd1", rec.dlco_clsf_cd1);
			//rx.add(record, "dlco_cd1", rec.dlco_cd1);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			//rx.add(record, "slip_arow_no", rec.slip_arow_no);
			//rx.add(record, "frex_cd", rec.frex_cd);
			//rx.add(record, "exrate", rec.exrate);
			//rx.add(record, "bank_cd", rec.bank_cd);
			//rx.add(record, "note_seq", rec.note_seq);
			//rx.add(record, "biz_reg_no", rec.biz_reg_no);
			//rx.add(record, "bank_id", rec.bank_id);
			//rx.add(record, "acct_num", rec.acct_num);
			//rx.add(record, "tran_date_seq", rec.tran_date_seq);
			//rx.add(record, "current_clsf", rec.current_clsf);
			rx.add(record, "note_clsf_cd_nm", StringUtil.replaceToXml(rec.note_clsf_cd_nm));
			rx.add(record, "note_no", StringUtil.replaceToXml(rec.note_no));
			rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			rx.add(record, "note_amt", StringUtil.replaceToXml(rec.note_amt));
			rx.add(record, "frex_amt", StringUtil.replaceToXml(rec.frex_amt));
			rx.add(record, "rcpay_amt", StringUtil.replaceToXml(rec.rcpay_amt));
			rx.add(record, "coms", StringUtil.replaceToXml(rec.coms));
			rx.add(record, "eeik_amt", StringUtil.replaceToXml(rec.eeik_amt));
			rx.add(record, "slipno", StringUtil.replaceToXml(rec.slipno));
			rx.add(record, "issu_pers_nm", StringUtil.replaceToXml(rec.issu_pers_nm));
			rx.add(record, "compnm2", StringUtil.replaceToXml(rec.compnm2));
			rx.add(record, "note_clehous_cd_nm", StringUtil.replaceToXml(rec.note_clehous_cd_nm));
			rx.add(record, "now_note_stat_cd_nm", StringUtil.replaceToXml(rec.now_note_stat_cd_nm));
			rx.add(record, "bank_nm", StringUtil.replaceToXml(rec.bank_nm));
			rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "note_clehous_cd", StringUtil.replaceToXml(rec.note_clehous_cd));
			rx.add(record, "now_note_stat_cd", StringUtil.replaceToXml(rec.now_note_stat_cd));
			rx.add(record, "compnm", StringUtil.replaceToXml(rec.compnm));
			rx.add(record, "note_clsf_cd", StringUtil.replaceToXml(rec.note_clsf_cd));
			rx.add(record, "dlco_clsf_cd1", StringUtil.replaceToXml(rec.dlco_clsf_cd1));
			rx.add(record, "dlco_cd1", StringUtil.replaceToXml(rec.dlco_cd1));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
			rx.add(record, "frex_cd", StringUtil.replaceToXml(rec.frex_cd));
			rx.add(record, "exrate", StringUtil.replaceToXml(rec.exrate));
			rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
			rx.add(record, "note_seq", StringUtil.replaceToXml(rec.note_seq));
			rx.add(record, "biz_reg_no", StringUtil.replaceToXml(rec.biz_reg_no));
			rx.add(record, "bank_id", StringUtil.replaceToXml(rec.bank_id));
			rx.add(record, "acct_num", StringUtil.replaceToXml(rec.acct_num));
			rx.add(record, "tran_date_seq", StringUtil.replaceToXml(rec.tran_date_seq));
			rx.add(record, "current_clsf", StringUtil.replaceToXml(rec.current_clsf));
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
<fc_func_1052_l>
	<dataSet>
		<CURLIST>
			<record>
				<note_clsf_cd_nm/>
				<note_no/>
				<mtry_dt/>
				<note_amt/>
				<frex_amt/>
				<rcpay_amt/>
				<coms/>
				<eeik_amt/>
				<slipno/>
				<issu_pers_nm/>
				<compnm2/>
				<note_clehous_cd_nm/>
				<now_note_stat_cd_nm/>
				<bank_nm/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<note_clehous_cd/>
				<now_note_stat_cd/>
				<compnm/>
				<note_clsf_cd/>
				<dlco_clsf_cd1/>
				<dlco_cd1/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<slip_sub_seq/>
				<slip_arow_no/>
				<frex_cd/>
				<exrate/>
				<bank_cd/>
				<note_seq/>
				<biz_reg_no/>
				<bank_id/>
				<acct_num/>
				<tran_date_seq/>
				<current_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1052_l>
*/
%>

<% /* 작성시간 : Mon Aug 17 20:41:31 KST 2009 */ %>