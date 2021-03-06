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
	FC_FUNC_4034_LDataSet ds = (FC_FUNC_4034_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_4034_LCURLISTRecord rec = (FC_FUNC_4034_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "pay_note_no", rec.pay_note_no);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "yf_ysnm", rec.yf_ysnm);
			rx.add(record, "hf_compnm", rec.hf_compnm);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "rmks1", rec.rmks1);
			rx.add(record, "rmks2", rec.rmks2);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "patr_budg_cd", rec.patr_budg_cd);
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
			<mtry_dt/>
			<pay_note_no/>
			<note_amt/>
			<comp_dt/>
			<yf_ysnm/>
			<hf_compnm/>
			<slip_no/>
			<rmks1/>
			<rmks2/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<patr_budg_cd/>
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

<% /* 작성시간 : Tue Mar 31 11:40:41 KST 2009 */ %>