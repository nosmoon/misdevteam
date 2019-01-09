<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_2301_LDataSet ds = (MT_PAPINOUT_2301_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_2301_LCURLISTRecord rec = (MT_PAPINOUT_2301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "title", rec.title);
			rx.add(record, "s_ibgoamt", rec.s_ibgoamt);
			rx.add(record, "s_jiamt", rec.s_jiamt);
			rx.add(record, "tot_ibgoamt", rec.tot_ibgoamt);
			rx.add(record, "di_ibgojo_amt", rec.di_ibgojo_amt);
			rx.add(record, "di_ibgojovat", rec.di_ibgojovat);
			rx.add(record, "s_cgamt", rec.s_cgamt);
			rx.add(record, "s_jcamt", rec.s_jcamt);
			rx.add(record, "tot_cgamt", rec.tot_cgamt);
			rx.add(record, "di_cgjo_amt", rec.di_cgjo_amt);
			rx.add(record, "di_cgjo_vat", rec.di_cgjo_vat);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "grp", rec.grp);
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
			<title/>
			<s_ibgoamt/>
			<s_jiamt/>
			<tot_ibgoamt/>
			<di_ibgojo_amt/>
			<di_ibgojovat/>
			<s_cgamt/>
			<s_jcamt/>
			<tot_cgamt/>
			<di_cgjo_amt/>
			<di_cgjo_vat/>
			<matr_cd/>
			<grp/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 21 18:58:36 KST 2009 */ %>