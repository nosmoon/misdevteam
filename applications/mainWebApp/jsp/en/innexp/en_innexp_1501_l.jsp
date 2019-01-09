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
	EN_INNEXP_1501_LDataSet ds = (EN_INNEXP_1501_LDataSet)request.getAttribute("ds");
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
			EN_INNEXP_1501_LCURLISTRecord rec = (EN_INNEXP_1501_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "reven_occr_no", rec.reven_occr_no);
			rx.add(record, "titl", rec.titl);
			rx.add(record, "budg_cd_dr", rec.budg_cd_dr);
			rx.add(record, "budg_nm_dr", rec.budg_nm_dr);
			rx.add(record, "amt_dr", rec.amt_dr);
			rx.add(record, "budg_cd_cr", rec.budg_cd_cr);
			rx.add(record, "budg_nm_cr", rec.budg_nm_cr);
			rx.add(record, "amt_cr", rec.amt_cr);
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
			<evnt_cd/>
			<evnt_nm/>
			<chrg_pers_nm/>
			<reven_occr_no/>
			<titl/>
			<budg_cd_dr/>
			<budg_nm_dr/>
			<amt_dr/>
			<budg_cd_cr/>
			<budg_nm_cr/>
			<amt_cr/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sun Apr 26 13:09:27 KST 2009 */ %>