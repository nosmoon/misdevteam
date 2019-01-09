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
	FC_FUNC_1093_LDataSet ds = (FC_FUNC_1093_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1093_LCURLISTRecord rec = (FC_FUNC_1093_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "a_nbn_no", rec.a_nbn_no);
			rx.add(record, "a_note_clsf_cd", rec.a_note_clsf_cd);
			rx.add(record, "a_note_amt", rec.a_note_amt);
			rx.add(record, "a_comp_dt", rec.a_comp_dt);
			rx.add(record, "a_mtry_dt", rec.a_mtry_dt);
			rx.add(record, "a_issu_cmpy_clsf_cd", rec.a_issu_cmpy_clsf_cd);
			rx.add(record, "a_issu_pers_nm", rec.a_issu_pers_nm);
			rx.add(record, "a_bank_cd_nm", rec.a_bank_cd_nm);
			rx.add(record, "a_note_no", rec.a_note_no);
			rx.add(record, "a_note_seq", rec.a_note_seq);
			rx.add(record, "a_bank_cd", rec.a_bank_cd);
			rx.add(record, "a_rcpm_acct", rec.a_rcpm_acct);
			rx.add(record, "a_sale_aprv_no", rec.a_sale_aprv_no);
			rx.add(record, "a_note_clsf_cd2", rec.a_note_clsf_cd2);
			//rx.add(record, "a_nbn_no", StringUtil.replaceToXml(rec.a_nbn_no));
			//rx.add(record, "a_note_clsf_cd", StringUtil.replaceToXml(rec.a_note_clsf_cd));
			//rx.add(record, "a_note_amt", StringUtil.replaceToXml(rec.a_note_amt));
			//rx.add(record, "a_comp_dt", StringUtil.replaceToXml(rec.a_comp_dt));
			//rx.add(record, "a_mtry_dt", StringUtil.replaceToXml(rec.a_mtry_dt));
			//rx.add(record, "a_issu_cmpy_clsf_cd", StringUtil.replaceToXml(rec.a_issu_cmpy_clsf_cd));
			//rx.add(record, "a_issu_pers_nm", StringUtil.replaceToXml(rec.a_issu_pers_nm));
			//rx.add(record, "a_bank_cd_nm", StringUtil.replaceToXml(rec.a_bank_cd_nm));
			//rx.add(record, "a_note_no", StringUtil.replaceToXml(rec.a_note_no));
			//rx.add(record, "a_note_seq", StringUtil.replaceToXml(rec.a_note_seq));
			//rx.add(record, "a_bank_cd", StringUtil.replaceToXml(rec.a_bank_cd));
			//rx.add(record, "a_rcpm_acct", StringUtil.replaceToXml(rec.a_rcpm_acct));
			//rx.add(record, "a_sale_aprv_no", StringUtil.replaceToXml(rec.a_sale_aprv_no));
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
<fc_func_1093_l>
	<dataSet>
		<CURLIST>
			<record>
				<a_nbn_no/>
				<a_note_clsf_cd/>
				<a_note_amt/>
				<a_comp_dt/>
				<a_mtry_dt/>
				<a_issu_cmpy_clsf_cd/>
				<a_issu_pers_nm/>
				<a_bank_cd_nm/>
				<a_note_no/>
				<a_note_seq/>
				<a_bank_cd/>
				<a_rcpm_acct/>
				<a_sale_aprv_no/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1093_l>
*/
%>

<% /* 작성시간 : Thu Jun 25 10:01:45 KST 2009 */ %>