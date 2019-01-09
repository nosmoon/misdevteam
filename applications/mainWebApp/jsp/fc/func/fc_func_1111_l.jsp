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
	FC_FUNC_1111_LDataSet ds = (FC_FUNC_1111_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1111_LCURLISTRecord rec = (FC_FUNC_1111_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dhon_resn_cd", rec.dhon_resn_cd);
			rx.add(record, "slip_occr_dt2", rec.slip_occr_dt2);
			rx.add(record, "slip_clsf_cd2", rec.slip_clsf_cd2);
			rx.add(record, "slip_seq2", rec.slip_seq2);
			rx.add(record, "slip_no2", rec.slip_no2);
			rx.add(record, "dlco_clsf_cd2", rec.dlco_clsf_cd2);
			rx.add(record, "dlco_cd2", rec.dlco_cd2);
			rx.add(record, "stat_dt", rec.stat_dt);
			rx.add(record, "dhon_occr_dt", rec.dhon_occr_dt);
			rx.add(record, "pch_amt1", rec.pch_amt1);
			rx.add(record, "pch_amt2", rec.pch_amt2);
			rx.add(record, "pch_amt3", rec.pch_amt3);
			rx.add(record, "pch_amt4", rec.pch_amt4);
			rx.add(record, "pch_compgbnm", rec.pch_compgbnm);
			rx.add(record, "pch_compnm", rec.pch_compnm);
			rx.add(record, "pch_bankgbnm", rec.pch_bankgbnm);
			rx.add(record, "pch_banknm", rec.pch_banknm);
			rx.add(record, "dhon_resn_nm", rec.dhon_resn_nm);
			rx.add(record, "pch_amt5", rec.pch_amt5);
			rx.add(record, "pch_amt6", rec.pch_amt6);
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
			<note_amt/>
			<mtry_dt/>
			<issu_pers_nm/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<slip_no/>
			<slip_sub_seq/>
			<slip_arow_no/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<dhon_resn_cd/>
			<slip_occr_dt2/>
			<slip_clsf_cd2/>
			<slip_seq2/>
			<slip_no2/>
			<dlco_clsf_cd2/>
			<dlco_cd2/>
			<stat_dt/>
			<dhon_occr_dt/>
			<pch_amt1/>
			<pch_amt2/>
			<pch_amt3/>
			<pch_amt4/>
			<pch_compgbnm/>
			<pch_compnm/>
			<pch_bankgbnm/>
			<pch_banknm/>
			<dhon_resn_nm/>
			<pch_amt5/>
			<pch_amt6/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Feb 27 13:33:35 KST 2009 */ %>