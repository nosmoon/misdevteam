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
	FC_FUNC_1191_LDataSet ds = (FC_FUNC_1191_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1191_LCURLISTRecord rec = (FC_FUNC_1191_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pcheegbnm", rec.pcheegbnm);
			rx.add(record, "nbn_no", rec.nbn_no);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "rcpay_amt", rec.rcpay_amt);
			rx.add(record, "dhon_occr_dt", rec.dhon_occr_dt);
			rx.add(record, "pchbudosayunm", rec.pchbudosayunm);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "pchjpgbnm", rec.pchjpgbnm);
			rx.add(record, "dlco", rec.dlco);
			rx.add(record, "pch_compnm", rec.pch_compnm);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "pcheestnm", rec.pcheestnm);
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "pch_eegbnm", rec.pch_eegbnm);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "note_seq", rec.note_seq);
			rx.add(record, "dhon_resn_cd", rec.dhon_resn_cd);
			rx.add(record, "pch_budosayunm", rec.pch_budosayunm);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "pch_jpgbnm", rec.pch_jpgbnm);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			rx.add(record, "pch_eestnm", rec.pch_eestnm);
			rx.add(record, "daesonamt", rec.daesonamt);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
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
			<pcheegbnm/>
			<nbn_no/>
			<note_amt/>
			<rcpay_amt/>
			<dhon_occr_dt/>
			<pchbudosayunm/>
			<slip_no/>
			<pchjpgbnm/>
			<dlco/>
			<pch_compnm/>
			<mtry_dt/>
			<issu_pers_nm/>
			<pcheestnm/>
			<note_clsf_cd/>
			<pch_eegbnm/>
			<note_no/>
			<bank_cd/>
			<note_seq/>
			<dhon_resn_cd/>
			<pch_budosayunm/>
			<slip_clsf_cd/>
			<pch_jpgbnm/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<now_note_stat_cd/>
			<pch_eestnm/>
			<daesonamt/>
			<slip_occr_dt/>
			<slip_seq/>
			<slip_sub_seq/>
			<slip_arow_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 27 20:05:29 KST 2009 */ %>