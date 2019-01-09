<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_6030_LDataSet ds = (PR_PAPMAKE_6030_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PAPMAKE_6030_LCURLIST1Record rec = (PR_PAPMAKE_6030_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "gubun", rec.gubun);
			rx.add(record, "sub_rumn", rec.sub_rumn);
			rx.add(record, "prt", rec.prt);
			rx.add(record, "prt_total", rec.prt_total);
			rx.add(record, "make", rec.make);
			rx.add(record, "make_total", rec.make_total);
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "slip_proc_occr_dt", rec.slip_proc_occr_dt);
			rx.add(record, "slip_proc_seq", rec.slip_proc_seq);
			rx.add(record, "tax_stmt_dt", rec.tax_stmt_dt);
			rx.add(record, "tax_stmt_seq", rec.tax_stmt_seq);
            rx.add(record, "pre_code","");
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST1>
		<record>
			<gubun/>
			<sub_rumn/>
			<prt/>
			<prt_total/>
			<make/>
			<make_total/>
			<yymm/>
			<fac_clsf/>
			<slip_proc_occr_dt/>
			<slip_proc_seq/>
			<tax_stmt_dt/>
			<tax_stmt_seq/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 29 18:14:20 KST 2009 */ %>