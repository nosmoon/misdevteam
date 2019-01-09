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
	FC_ACCT_2501_LDataSet ds = (FC_ACCT_2501_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2501_LCURLISTRecord rec = (FC_ACCT_2501_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_slip", rec.occr_slip);
			rx.add(record, "occr_slip_clsf", rec.occr_slip_clsf);
			rx.add(record, "occr_amt", rec.occr_amt);
			rx.add(record, "extnc_amt", rec.extnc_amt);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "extnc_slip_clsf", rec.extnc_slip_clsf);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.addCData(record, "occr_dlco_nm", rec.occr_dlco_nm);
			rx.add(record, "proc_clsf", rec.proc_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.addCData(record, "extnc_dlco_nm", rec.extnc_dlco_nm);
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
			<occr_slip/>
			<occr_slip_clsf/>
			<occr_amt/>
			<extnc_amt/>
			<amt1/>
			<extnc_slip_clsf/>
			<budg_cd/>
			<occr_dlco_nm/>
			<proc_clsf/>
			<medi_cd/>
			<extnc_dlco_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 24 15:44:36 KST 2009 */ %>