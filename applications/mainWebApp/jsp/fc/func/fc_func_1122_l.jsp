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
	FC_FUNC_1122_LDataSet ds = (FC_FUNC_1122_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1122_LCURLISTRecord rec = (FC_FUNC_1122_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "note_clsf_nm", rec.note_clsf_nm);
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "note_seq", rec.note_seq);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "issu_cmpy_clsf_cd", rec.issu_cmpy_clsf_cd);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "pay_plac_cd", rec.pay_plac_cd);
			rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "eegbnm", rec.eegbnm);
			rx.add(record, "bhsgbnm", rec.bhsgbnm);
			rx.add(record, "jgjnm", rec.jgjnm);
			rx.add(record, "eestnm", rec.eestnm);
			//rx.add(record, "note_clsf_nm", StringUtil.replaceToXml(rec.note_clsf_nm));
			//rx.add(record, "note_clsf_cd", StringUtil.replaceToXml(rec.note_clsf_cd));
			//rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
			//rx.add(record, "note_no", StringUtil.replaceToXml(rec.note_no));
			//rx.add(record, "note_seq", StringUtil.replaceToXml(rec.note_seq));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "note_amt", StringUtil.replaceToXml(rec.note_amt));
			//rx.add(record, "issu_cmpy_clsf_cd", StringUtil.replaceToXml(rec.issu_cmpy_clsf_cd));
			//rx.add(record, "issu_pers_nm", StringUtil.replaceToXml(rec.issu_pers_nm));
			//rx.add(record, "pay_plac_cd", StringUtil.replaceToXml(rec.pay_plac_cd));
			//rx.add(record, "now_note_stat_cd", StringUtil.replaceToXml(rec.now_note_stat_cd));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			//rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
			//rx.add(record, "eegbnm", StringUtil.replaceToXml(rec.eegbnm));
			//rx.add(record, "bhsgbnm", StringUtil.replaceToXml(rec.bhsgbnm));
			//rx.add(record, "jgjnm", StringUtil.replaceToXml(rec.jgjnm));
			//rx.add(record, "eestnm", StringUtil.replaceToXml(rec.eestnm));
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
<fc_func_1122_l>
	<dataSet>
		<CURLIST>
			<record>
				<note_clsf_nm/>
				<note_clsf_cd/>
				<bank_cd/>
				<note_no/>
				<note_seq/>
				<mtry_dt/>
				<note_amt/>
				<issu_cmpy_clsf_cd/>
				<issu_pers_nm/>
				<pay_plac_cd/>
				<now_note_stat_cd/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<slip_no/>
				<slip_sub_seq/>
				<slip_arow_no/>
				<eegbnm/>
				<bhsgbnm/>
				<jgjnm/>
				<eestnm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1122_l>
*/
%>

<% /* 작성시간 : Tue Jul 21 14:19:11 KST 2009 */ %>