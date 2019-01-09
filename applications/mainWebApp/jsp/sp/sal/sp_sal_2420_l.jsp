<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_2420_LDataSet ds = (SP_SAL_2420_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SAL_2420_LCURLIST1Record rec = (SP_SAL_2420_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "deps_pers", rec.deps_pers);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "req_amt_1", rec.req_amt_1);
			rx.add(record, "req_amt_2", rec.req_amt_2);
			rx.add(record, "req_amt_3", rec.req_amt_3);
			rx.add(record, "req_amt_4", rec.req_amt_4);
			rx.add(record, "req_amt_5", rec.req_amt_5);
			rx.add(record, "req_amt_6", rec.req_amt_6);
			rx.add(record, "req_amt_7", rec.req_amt_7);
			rx.add(record, "req_amt_8", rec.req_amt_8);
			rx.add(record, "req_amt_9", rec.req_amt_9);
			rx.add(record, "req_amt_10", rec.req_amt_10);
			rx.add(record, "req_amt_11", rec.req_amt_11);
			rx.add(record, "req_amt_12", rec.req_amt_12);
			rx.add(record, "req_amt_13", rec.req_amt_13);
			rx.add(record, "req_amt_14", rec.req_amt_14);
			rx.add(record, "req_amt_15", rec.req_amt_15);
			rx.add(record, "tot", rec.tot);
			rx.add(record, "mappli", rec.mappli);
		}
		/****** CURLIST1 END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
