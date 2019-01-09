<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.en.innexp.rec.*
	,	chosun.ciis.en.innexp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_INNEXP_3001_LDataSet ds = (EN_INNEXP_3001_LDataSet)request.getAttribute("ds");
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
			EN_INNEXP_3001_LCURLISTRecord rec = (EN_INNEXP_3001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "chrg_pers_emp_nm", rec.chrg_pers_emp_nm);
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "chrg_pers_emp_no", rec.chrg_pers_emp_no);
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
			<dlco_no/>
			<dlco_nm/>
			<evnt_cd/>
			<evnt_nm/>
			<chrg_pers_emp_nm/>
			<misu_amt/>
			<chrg_pers_emp_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 27 19:39:58 KST 2009 */ %>