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
	FC_ACCT_5111_LDataSet ds = (FC_ACCT_5111_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_5111_LCURLISTRecord rec = (FC_ACCT_5111_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clos_dt", rec.clos_dt);
			rx.add(record, "clos_clsf", rec.clos_clsf);
			rx.add(record, "clos_tbl", rec.clos_tbl);
			rx.add(record, "clos_proc_dt_tm", rec.clos_proc_dt_tm);
			rx.add(record, "clos_proc_ms", rec.clos_proc_ms);
			rx.add(record, "clos_pers_emp_no", rec.clos_pers_emp_no);
			rx.add(record, "clos_pers_emp_nm", rec.clos_pers_emp_nm);
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
			<clos_dt/>
			<clos_clsf/>
			<clos_tbl/>
			<clos_proc_dt_tm/>
			<clos_proc_ms/>
			<clos_pers_emp_no/>
			<clos_pers_emp_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 12 20:36:19 KST 2009 */ %>