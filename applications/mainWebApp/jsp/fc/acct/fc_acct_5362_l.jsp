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
	FC_ACCT_5362_LDataSet ds = (FC_ACCT_5362_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_5362_LCURLISTRecord rec = (FC_ACCT_5362_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "acacctynm", rec.acacctynm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "ycyscdnm", rec.ycyscdnm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "usebuseonm", rec.usebuseonm);
			rx.add(record, "rmks1", rec.rmks1);
			rx.add(record, "rmks2", rec.rmks2);
			rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			rx.add(record, "cgbuseonm", rec.cgbuseonm);
			rx.add(record, "qunt", rec.qunt);
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
			<acct_cd/>
			<acacctynm/>
			<budg_cd/>
			<ycyscdnm/>
			<medi_cd/>
			<dr_amt/>
			<use_dept_cd/>
			<usebuseonm/>
			<rmks1/>
			<rmks2/>
			<clam_dept_cd/>
			<cgbuseonm/>
			<qunt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 19 09:32:23 KST 2009 */ %>