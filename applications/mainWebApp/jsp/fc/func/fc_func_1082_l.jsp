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
	FC_FUNC_1082_LDataSet ds = (FC_FUNC_1082_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1082_LCURLISTRecord rec = (FC_FUNC_1082_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "note_clsf_cdnm", rec.note_clsf_cdnm);
			//rx.add(record, "note_no", rec.note_no);
			//rx.add(record, "note_amt", rec.note_amt);
			//rx.add(record, "sale_dscn_amt", rec.sale_dscn_amt);
			//rx.add(record, "rcpay_amt", rec.rcpay_amt);
			//rx.add(record, "corp_tax", rec.corp_tax);
			//rx.add(record, "etc_prft", rec.etc_prft);
			//rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "mtry_dt", rec.mtry_dt);
			//rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			//rx.add(record, "dlco_cdnm", rec.dlco_cdnm);
			//rx.add(record, "pay_plac_cdnm", rec.pay_plac_cdnm);
			//rx.add(record, "now_note_stat_cdnm", rec.now_note_stat_cdnm);
			//rx.add(record, "dlco_cdnm2", rec.dlco_cdnm2);
			//rx.add(record, "comp_dt", rec.comp_dt);
			//rx.add(record, "note_no1", rec.note_no1);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "biz_reg_no", rec.biz_reg_no);
			//rx.add(record, "bank_id", rec.bank_id);
			//rx.add(record, "acct_num", rec.acct_num);
			//rx.add(record, "tran_date_seq", rec.tran_date_seq);
			//rx.add(record, "current_clsf", rec.current_clsf);
			rx.add(record, "note_clsf_cdnm", StringUtil.replaceToXml(rec.note_clsf_cdnm));
			rx.add(record, "note_no", StringUtil.replaceToXml(rec.note_no));
			rx.add(record, "note_amt", StringUtil.replaceToXml(rec.note_amt));
			rx.add(record, "sale_dscn_amt", StringUtil.replaceToXml(rec.sale_dscn_amt));
			rx.add(record, "rcpay_amt", StringUtil.replaceToXml(rec.rcpay_amt));
			rx.add(record, "corp_tax", StringUtil.replaceToXml(rec.corp_tax));
			rx.add(record, "etc_prft", StringUtil.replaceToXml(rec.etc_prft));
			rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			rx.add(record, "issu_pers_nm", StringUtil.replaceToXml(rec.issu_pers_nm));
			rx.add(record, "dlco_cdnm", StringUtil.replaceToXml(rec.dlco_cdnm));
			rx.add(record, "pay_plac_cdnm", StringUtil.replaceToXml(rec.pay_plac_cdnm));
			rx.add(record, "now_note_stat_cdnm", StringUtil.replaceToXml(rec.now_note_stat_cdnm));
			rx.add(record, "dlco_cdnm2", StringUtil.replaceToXml(rec.dlco_cdnm2));
			rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			rx.add(record, "note_no1", StringUtil.replaceToXml(rec.note_no1));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
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
<fc_func_1082_l>
	<dataSet>
		<CURLIST>
			<record>
				<note_clsf_cdnm/>
				<note_no/>
				<note_amt/>
				<sale_dscn_amt/>
				<rcpay_amt/>
				<corp_tax/>
				<etc_prft/>
				<slip_no/>
				<mtry_dt/>
				<issu_pers_nm/>
				<dlco_cdnm/>
				<pay_plac_cdnm/>
				<now_note_stat_cdnm/>
				<dlco_cdnm2/>
				<comp_dt/>
				<note_no1/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<biz_reg_no/>
				<bank_id/>
				<acct_num/>
				<tran_date_seq/>
				<current_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1082_l>
*/
%>

<% /* 작성시간 : Tue Aug 18 17:51:44 KST 2009 */ %>