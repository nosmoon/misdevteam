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
	FC_FUNC_1091_LDataSet ds = (FC_FUNC_1091_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1091_LCURLISTRecord rec = (FC_FUNC_1091_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "b_note_clsf_cd_nm", rec.b_note_clsf_cd_nm);
			rx.add(record, "b_nbn_no", rec.b_nbn_no);
			rx.add(record, "b_pch_cymd1to", rec.b_pch_cymd1to);
			rx.add(record, "b_rcpay_amt", rec.b_rcpay_amt);
			rx.add(record, "b_issu_pers_nm", rec.b_issu_pers_nm);
			rx.add(record, "b_dlco_clsf_cd_nm", rec.b_dlco_clsf_cd_nm);
			rx.add(record, "b_pay_plac_cd_nm", rec.b_pay_plac_cd_nm);
			rx.add(record, "b_now_note_stat_cd_nm", rec.b_now_note_stat_cd_nm);
			rx.add(record, "b_dlco_clsf_cd", rec.b_dlco_clsf_cd);
			rx.add(record, "b_dlco_cd", rec.b_dlco_cd);
			rx.add(record, "b_pay_plac_cd", rec.b_pay_plac_cd);
			rx.add(record, "b_now_note_stat_cd", rec.b_now_note_stat_cd);
			rx.add(record, "b_note_clsf_cd", rec.b_note_clsf_cd);
			rx.add(record, "b_bank_cd", rec.b_bank_cd);
			rx.add(record, "b_note_no", rec.b_note_no);
			rx.add(record, "b_note_seq", rec.b_note_seq);
			//rx.add(record, "b_note_clsf_cd_nm", StringUtil.replaceToXml(rec.b_note_clsf_cd_nm));
			//rx.add(record, "b_nbn_no", StringUtil.replaceToXml(rec.b_nbn_no));
			//rx.add(record, "b_pch_cymd1to", StringUtil.replaceToXml(rec.b_pch_cymd1to));
			//rx.add(record, "b_rcpay_amt", StringUtil.replaceToXml(rec.b_rcpay_amt));
			//rx.add(record, "b_issu_pers_nm", StringUtil.replaceToXml(rec.b_issu_pers_nm));
			//rx.add(record, "b_dlco_clsf_cd_nm", StringUtil.replaceToXml(rec.b_dlco_clsf_cd_nm));
			//rx.add(record, "b_pay_plac_cd_nm", StringUtil.replaceToXml(rec.b_pay_plac_cd_nm));
			//rx.add(record, "b_now_note_stat_cd_nm", StringUtil.replaceToXml(rec.b_now_note_stat_cd_nm));
			//rx.add(record, "b_dlco_clsf_cd", StringUtil.replaceToXml(rec.b_dlco_clsf_cd));
			//rx.add(record, "b_dlco_cd", StringUtil.replaceToXml(rec.b_dlco_cd));
			//rx.add(record, "b_pay_plac_cd", StringUtil.replaceToXml(rec.b_pay_plac_cd));
			//rx.add(record, "b_now_note_stat_cd", StringUtil.replaceToXml(rec.b_now_note_stat_cd));
			//rx.add(record, "b_note_clsf_cd", StringUtil.replaceToXml(rec.b_note_clsf_cd));
			//rx.add(record, "b_bank_cd", StringUtil.replaceToXml(rec.b_bank_cd));
			//rx.add(record, "b_note_no", StringUtil.replaceToXml(rec.b_note_no));
			//rx.add(record, "b_note_seq", StringUtil.replaceToXml(rec.b_note_seq));
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
<fc_func_1091_l>
	<dataSet>
		<CURLIST>
			<record>
				<b_note_clsf_cd_nm/>
				<b_nbn_no/>
				<b_pch_cymd1to/>
				<b_rcpay_amt/>
				<b_issu_pers_nm/>
				<b_dlco_clsf_cd_nm/>
				<b_pay_plac_cd_nm/>
				<b_now_note_stat_cd_nm/>
				<b_dlco_clsf_cd/>
				<b_dlco_cd/>
				<b_pay_plac_cd/>
				<b_now_note_stat_cd/>
				<b_note_clsf_cd/>
				<b_bank_cd/>
				<b_note_no/>
				<b_note_seq/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1091_l>
*/
%>

<% /* 작성시간 : Mon Jun 22 10:32:05 KST 2009 */ %>