<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2110_MDataSet ds = (FC_ACCT_2110_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int recordSet2 = 0;
	int comboSet = 0;
	int initData = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "supr_dept_cd", "");

		for(int i = 0; i < ds.sdeptlist.size(); i++) {
			FC_ACCT_2110_MSDEPTLISTRecord rec = (FC_ACCT_2110_MSDEPTLISTRecord)ds.sdeptlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cd+" "+rec.cdnm);
			rx.add(record, "supr_dept_cd", "");
		}
		/****** CURLIST1 END */
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "dept_cd", "");

		for(int i = 0; i < ds.deptlist.size(); i++) {
			FC_ACCT_2110_MDEPTLISTRecord rec = (FC_ACCT_2110_MDEPTLISTRecord)ds.deptlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cd+" "+rec.cdnm);
			rx.add(record, "supr_dept_cd", rec.mang_cd);
		}
		/****** CURLIST2 END */
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "pay_clsf", "");

		for(int i = 0; i < ds.paylist.size(); i++) {
			FC_ACCT_2110_MPAYLISTRecord rec = (FC_ACCT_2110_MPAYLISTRecord)ds.paylist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cd+" "+rec.cdnm);
		}
		/****** CURLIST3 END */	
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

<% /* 작성시간 : Wed Jan 18 11:34:16 KST 2012 */ %>