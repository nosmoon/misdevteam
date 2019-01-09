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
	FC_FUNC_1104_LDataSet ds = (FC_FUNC_1104_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1104_LCURLISTRecord rec = (FC_FUNC_1104_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "note_seq", rec.note_seq);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			rx.add(record, "jpgbnm", rec.jpgbnm);
			rx.add(record, "eegbnm", rec.eegbnm);
			rx.add(record, "compgbnm", rec.compgbnm);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "eestnm", rec.eestnm);
			rx.add(record, "dlco_clsf_cd2", rec.dlco_clsf_cd2);
			rx.add(record, "dlco_cd2", rec.dlco_cd2);
			rx.add(record, "patr_budg_cd", rec.patr_budg_cd);
			rx.add(record, "deps_clsf_cd", rec.deps_clsf_cd);
			rx.add(record, "deps_dt", rec.deps_dt);
			rx.add(record, "dhon_resn_cd", rec.dhon_resn_cd);
			rx.add(record, "dhon_occr_dt", rec.dhon_occr_dt);
			rx.add(record, "rmks1", rec.rmks1);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd2", rec.slip_clsf_cd2);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "escompnm", rec.escompnm);
			rx.add(record, "frex_cd", rec.frex_cd);
			rx.add(record, "exrate", rec.exrate);
			rx.add(record, "frex_amt", rec.frex_amt);
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
			<bank_cd/>
			<note_no/>
			<note_seq/>
			<slip_clsf_cd/>
			<mtry_dt/>
			<note_clsf_cd/>
			<note_amt/>
			<issu_pers_nm/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<now_note_stat_cd/>
			<jpgbnm/>
			<eegbnm/>
			<compgbnm/>
			<compnm/>
			<eestnm/>
			<dlco_clsf_cd2/>
			<dlco_cd2/>
			<patr_budg_cd/>
			<deps_clsf_cd/>
			<deps_dt/>
			<dhon_resn_cd/>
			<dhon_occr_dt/>
			<rmks1/>
			<slip_occr_dt/>
			<slip_clsf_cd2/>
			<slip_seq/>
			<slip_no/>
			<escompnm/>
			<frex_cd/>
			<exrate/>
			<frex_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 10 11:01:44 KST 2009 */ %>