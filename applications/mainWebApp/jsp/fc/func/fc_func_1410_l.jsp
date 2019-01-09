<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1410_LDataSet ds = (FC_FUNC_1410_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1410_LCURLISTRecord rec = (FC_FUNC_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "note_clsf_cd_nm2", rec.note_clsf_cd_nm2);
			rx.add(record, "note_full_no", rec.note_full_no);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "bank_cd_nm", rec.bank_cd_nm);
			rx.add(record, "rcpm_acct_nm2", rec.rcpm_acct_nm2);
			rx.add(record, "slipno", rec.slipno);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "now_note_stat_cd2", rec.now_note_stat_cd2);
			rx.add(record, "sale_aprv_no", rec.sale_aprv_no);
			rx.add(record, "coms", rec.coms);
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "note_seq", rec.note_seq);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "rcpm_acct", rec.rcpm_acct);
			rx.add(record, "rcpm_acct_nm", rec.rcpm_acct_nm);
			rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			rx.add(record, "now_note_stat_cd_nm", rec.now_note_stat_cd_nm);
			rx.add(record, "note_clsf_cd_nm", rec.note_clsf_cd_nm);
			rx.add(record, "rcpay_amt", rec.rcpay_amt);
			rx.add(record, "corp_tax", rec.corp_tax);
			rx.add(record, "etc_prft", rec.etc_prft);
			rx.add(record, "es_dlco_clsf_cd", rec.es_dlco_clsf_cd);
			rx.add(record, "es_dlco_cd", rec.es_dlco_cd);
			rx.add(record, "escompnm", rec.escompnm);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
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
			<note_clsf_cd_nm2/>
			<note_full_no/>
			<note_amt/>
			<bank_cd_nm/>
			<rcpm_acct_nm2/>
			<slipno/>
			<comp_dt/>
			<mtry_dt/>
			<issu_pers_nm/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<compnm/>
			<now_note_stat_cd2/>
			<sale_aprv_no/>
			<coms/>
			<note_clsf_cd/>
			<note_no/>
			<note_seq/>
			<bank_cd/>
			<rcpm_acct/>
			<rcpm_acct_nm/>
			<now_note_stat_cd/>
			<now_note_stat_cd_nm/>
			<note_clsf_cd_nm/>
			<rcpay_amt/>
			<corp_tax/>
			<etc_prft/>
			<es_dlco_clsf_cd/>
			<es_dlco_cd/>
			<escompnm/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<slip_sub_seq/>
			<slip_arow_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 03 15:51:43 KST 2009 */ %>