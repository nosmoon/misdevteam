<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_3032_LDataSet ds = (FC_ACCT_3032_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURINSRFEELIST BEGIN */
		recordSet = rx.add(dataSet, "CURINSRFEELIST", "");

		for(int i = 0; i < ds.curinsrfeelist.size(); i++) {
			FC_ACCT_3032_LCURINSRFEELISTRecord rec = (FC_ACCT_3032_LCURINSRFEELISTRecord)ds.curinsrfeelist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "x", rec.x);
			rx.add(record, "pch_shggbnm", rec.pch_shggbnm);
			rx.add(record, "pch_gwgbnm", rec.pch_gwgbnm);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "insr_nm", rec.insr_nm);
			rx.add(record, "mang_no2", rec.mang_no2);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "won_amt", rec.won_amt);
			rx.add(record, "dds", rec.dds);
			rx.add(record, "pch_totilsu", rec.pch_totilsu);
			rx.add(record, "prvmm_bal", rec.prvmm_bal);
			rx.add(record, "thmm_dr", rec.thmm_dr);
			rx.add(record, "thmm_crdt", rec.thmm_crdt);
			rx.add(record, "thmm_bal", rec.thmm_bal);
			rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curinsrfeelist.size());
		/****** CURINSRFEELIST END */

		/****** CURTOTALLIST BEGIN */
		recordSet = rx.add(dataSet, "CURTOTALLIST", "");

		for(int i = 0; i < ds.curtotallist.size(); i++) {
			FC_ACCT_3032_LCURTOTALLISTRecord rec = (FC_ACCT_3032_LCURTOTALLISTRecord)ds.curtotallist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_prvmm_bal", rec.tot_prvmm_bal);
			rx.add(record, "tot_thmm_dr", rec.tot_thmm_dr);
			rx.add(record, "tot_thmm_crdt", rec.tot_thmm_crdt);
			rx.add(record, "tot_thmm_bal", rec.tot_thmm_bal);
		}
		rx.add(recordSet, "totalcnt", ds.curtotallist.size());
		/****** CURTOTALLIST END */

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
	<CURINSRFEELIST>
		<record>
			<x/>
			<pch_shggbnm/>
			<pch_gwgbnm/>
			<mang_no/>
			<insr_nm/>
			<mang_no2/>
			<mtry_dt/>
			<won_amt/>
			<dds/>
			<pch_totilsu/>
			<prvmm_bal/>
			<thmm_dr/>
			<thmm_crdt/>
			<thmm_bal/>
			<mang_clsf_cd/>
		</record>
	</CURINSRFEELIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURTOTALLIST>
		<record>
			<tot_prvmm_bal/>
			<tot_thmm_dr/>
			<tot_thmm_crdt/>
			<tot_thmm_bal/>
		</record>
	</CURTOTALLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 05 10:37:49 KST 2009 */ %>