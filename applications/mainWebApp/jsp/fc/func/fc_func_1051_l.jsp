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
	FC_FUNC_1051_LDataSet ds = (FC_FUNC_1051_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1051_LCURLISTRecord rec = (FC_FUNC_1051_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "note_clsf_cd_nm", rec.note_clsf_cd_nm);
			//rx.add(record, "note_no", rec.note_no);
			//rx.add(record, "mtry_dt", rec.mtry_dt);
			//rx.add(record, "note_amt", rec.note_amt);
			//rx.add(record, "frex_amt", rec.frex_amt);
			//rx.add(record, "note_amt2", rec.note_amt2);
			//rx.add(record, "coms", rec.coms);
			//rx.add(record, "eeik_amt", rec.eeik_amt);
			//rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			//rx.add(record, "compnm", rec.compnm);
			//rx.add(record, "note_clehous_cd_nm", rec.note_clehous_cd_nm);
			//rx.add(record, "now_note_stat_cd_nm", rec.now_note_stat_cd_nm);
			//rx.add(record, "compnm2", rec.compnm2);
			//rx.add(record, "comp_dt", rec.comp_dt);
			//rx.add(record, "bank_cd", rec.bank_cd);
			//rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			//rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			//rx.add(record, "note_clehous_cd", rec.note_clehous_cd);
			//rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "dlco_clsf_cd1", rec.dlco_clsf_cd1);
			//rx.add(record, "dlco_cd1", rec.dlco_cd1);
			//rx.add(record, "note_seq", rec.note_seq);
			rx.add(record, "note_clsf_cd_nm", StringUtil.replaceToXml(rec.note_clsf_cd_nm));
			rx.add(record, "note_no", StringUtil.replaceToXml(rec.note_no));
			rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			rx.add(record, "note_amt", StringUtil.replaceToXml(rec.note_amt));
			rx.add(record, "frex_amt", StringUtil.replaceToXml(rec.frex_amt));
			rx.add(record, "note_amt2", StringUtil.replaceToXml(rec.note_amt2));
			rx.add(record, "coms", StringUtil.replaceToXml(rec.coms));
			rx.add(record, "eeik_amt", StringUtil.replaceToXml(rec.eeik_amt));
			rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			rx.add(record, "issu_pers_nm", StringUtil.replaceToXml(rec.issu_pers_nm));
			rx.add(record, "compnm", StringUtil.replaceToXml(rec.compnm));
			rx.add(record, "note_clehous_cd_nm", StringUtil.replaceToXml(rec.note_clehous_cd_nm));
			rx.add(record, "now_note_stat_cd_nm", StringUtil.replaceToXml(rec.now_note_stat_cd_nm));
			rx.add(record, "compnm2", StringUtil.replaceToXml(rec.compnm2));
			rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
			rx.add(record, "now_note_stat_cd", StringUtil.replaceToXml(rec.now_note_stat_cd));
			rx.add(record, "note_clsf_cd", StringUtil.replaceToXml(rec.note_clsf_cd));
			rx.add(record, "note_clehous_cd", StringUtil.replaceToXml(rec.note_clehous_cd));
			rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "dlco_clsf_cd1", StringUtil.replaceToXml(rec.dlco_clsf_cd1));
			rx.add(record, "dlco_cd1", StringUtil.replaceToXml(rec.dlco_cd1));
			rx.add(record, "note_seq", StringUtil.replaceToXml(rec.note_seq));
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
<fc_func_1051_l>
	<dataSet>
		<CURLIST>
			<record>
				<note_clsf_cd_nm/>
				<note_no/>
				<mtry_dt/>
				<note_amt/>
				<frex_amt/>
				<note_amt2/>
				<coms/>
				<eeik_amt/>
				<slip_no/>
				<issu_pers_nm/>
				<compnm/>
				<note_clehous_cd_nm/>
				<now_note_stat_cd_nm/>
				<compnm2/>
				<comp_dt/>
				<bank_cd/>
				<now_note_stat_cd/>
				<note_clsf_cd/>
				<note_clehous_cd/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_clsf_cd1/>
				<dlco_cd1/>
				<note_seq/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1051_l>
*/
%>

<% /* 작성시간 : Mon Aug 17 20:41:31 KST 2009 */ %>