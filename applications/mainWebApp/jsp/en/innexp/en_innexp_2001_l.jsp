<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.en.innexp.rec.*
	,	chosun.ciis.en.innexp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_INNEXP_2001_LDataSet ds = (EN_INNEXP_2001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			EN_INNEXP_2001_LCURLIST3Record rec = (EN_INNEXP_2001_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "reven_amt_3", rec.reven_amt_3);
			rx.add(record, "expn_amt_3", rec.expn_amt_3);
			rx.add(record, "bal_amt_3", rec.bal_amt_3);
			//rx.add(record, "reven_amt_3", StringUtil.replaceToXml(rec.reven_amt_3));
			//rx.add(record, "expn_amt_3", StringUtil.replaceToXml(rec.expn_amt_3));
			//rx.add(record, "bal_amt_3", StringUtil.replaceToXml(rec.bal_amt_3));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			EN_INNEXP_2001_LCURLIST2Record rec = (EN_INNEXP_2001_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "reven_amt_2", rec.reven_amt_2);
			rx.add(record, "expn_amt_2", rec.expn_amt_2);
			rx.add(record, "bal_amt_2", rec.bal_amt_2);
			//rx.add(record, "reven_amt_2", StringUtil.replaceToXml(rec.reven_amt_2));
			//rx.add(record, "expn_amt_2", StringUtil.replaceToXml(rec.expn_amt_2));
			//rx.add(record, "bal_amt_2", StringUtil.replaceToXml(rec.bal_amt_2));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			EN_INNEXP_2001_LCURLIST1Record rec = (EN_INNEXP_2001_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "reven_amt_1", rec.reven_amt_1);
			rx.add(record, "expn_amt_1", rec.expn_amt_1);
			rx.add(record, "bal_amt_1", rec.bal_amt_1);
			//rx.add(record, "reven_amt_1", StringUtil.replaceToXml(rec.reven_amt_1));
			//rx.add(record, "expn_amt_1", StringUtil.replaceToXml(rec.expn_amt_1));
			//rx.add(record, "bal_amt_1", StringUtil.replaceToXml(rec.bal_amt_1));
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
<en_innexp_2001_l>
	<dataSet>
		<CURLIST3>
			<record>
				<reven_amt_3/>
				<expn_amt_3/>
				<bal_amt_3/>
			</record>
		</CURLIST3>
	</dataSet>
</en_innexp_2001_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<en_innexp_2001_l>
	<dataSet>
		<CURLIST2>
			<record>
				<reven_amt_2/>
				<expn_amt_2/>
				<bal_amt_2/>
			</record>
		</CURLIST2>
	</dataSet>
</en_innexp_2001_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<en_innexp_2001_l>
	<dataSet>
		<CURLIST1>
			<record>
				<reven_amt_1/>
				<expn_amt_1/>
				<bal_amt_1/>
			</record>
		</CURLIST1>
	</dataSet>
</en_innexp_2001_l>
*/
%>

<% /* 작성시간 : Wed Apr 29 14:49:12 KST 2009 */ %>