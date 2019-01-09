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
	FC_FUNC_1040_LDataSet ds = (FC_FUNC_1040_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1040_LCURLISTRecord rec = (FC_FUNC_1040_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "note_seq", rec.note_seq);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "note_clehous_cd", rec.note_clehous_cd);
			rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "eeghsnm", rec.eeghsnm);
			rx.add(record, "eestnm", rec.eestnm);
			rx.add(record, "eegbnm", rec.eegbnm);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "coms", rec.coms);
			rx.add(record, "slip_no", rec.slip_no);
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
			<note_clsf_cd/>
			<bank_cd/>
			<note_no/>
			<note_seq/>
			<mtry_dt/>
			<note_amt/>
			<issu_pers_nm/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<note_clehous_cd/>
			<now_note_stat_cd/>
			<compnm/>
			<eeghsnm/>
			<eestnm/>
			<eegbnm/>
			<comp_dt/>
			<coms/>
			<slip_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 02 13:28:08 KST 2009 */ %>