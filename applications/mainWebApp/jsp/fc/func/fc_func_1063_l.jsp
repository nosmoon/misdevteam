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
	FC_FUNC_1063_LDataSet ds = (FC_FUNC_1063_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_FUNC_1063_LCURLISTRecord rec = (FC_FUNC_1063_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "note_clsf_cd_nm", rec.note_clsf_cd_nm);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "rcpay_amt", rec.rcpay_amt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.addCData(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "slipno", rec.slipno);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.addCData(record, "pch_compnm", rec.pch_compnm);
			rx.addCData(record, "pay_plac_cd_nm", rec.pay_plac_cd_nm);
			rx.add(record, "now_note_stat_cd_nm", rec.now_note_stat_cd_nm);
			rx.add(record, "dlco_cd2", rec.dlco_cd2);
			rx.addCData(record, "pch_smcompnm", rec.pch_smcompnm);
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "note_seq", rec.note_seq);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "dlco_clsf_cd2", rec.dlco_clsf_cd2);
			rx.add(record, "pay_plac_cd", rec.pay_plac_cd);
			rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
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
			<note_clsf_cd_nm/>
			<note_no/>
			<rcpay_amt/>
			<mtry_dt/>
			<issu_pers_nm/>
			<slipno/>
			<dlco_cd/>
			<pch_compnm/>
			<pay_plac_cd_nm/>
			<now_note_stat_cd_nm/>
			<dlco_cd2/>
			<pch_smcompnm/>
			<note_clsf_cd/>
			<bank_cd/>
			<note_seq/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<dlco_clsf_cd2/>
			<pay_plac_cd/>
			<now_note_stat_cd/>
			<dlco_clsf_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Feb 16 13:52:21 KST 2009 */ %>