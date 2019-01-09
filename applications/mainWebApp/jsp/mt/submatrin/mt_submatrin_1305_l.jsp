<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrin.rec.*
	,	chosun.ciis.mt.submatrin.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRIN_1305_LDataSet ds = (MT_SUBMATRIN_1305_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATRIN_1305_LCURLISTRecord rec = (MT_SUBMATRIN_1305_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "gubun", rec.gubun);
			rx.add(record, "biopsb", rec.biopsb);
			rx.add(record, "bihannm", rec.bihannm);
			rx.add(record, "sgjbyhcd10", rec.sgjbyhcd10);
			rx.add(record, "sgysjgbcd10", rec.sgysjgbcd10);
			rx.add(record, "biigamt10", rec.biigamt10);
			rx.add(record, "biigvat10", rec.biigvat10);
			rx.add(record, "sgjbyhcd20", rec.sgjbyhcd20);
			rx.add(record, "sgysjgbcd20", rec.sgysjgbcd20);
			rx.add(record, "biigamt20", rec.biigamt20);
			rx.add(record, "biigvat20", rec.biigvat20);
			rx.add(record, "sgjbyhcd22", rec.sgjbyhcd22);
			rx.add(record, "sgysjgbcd22", rec.sgysjgbcd22);
			rx.add(record, "biigamt22", rec.biigamt22);
			rx.add(record, "biigvat22", rec.biigvat22);
			rx.add(record, "sgjbyhcd25", rec.sgjbyhcd25);
			rx.add(record, "sgysjgbcd25", rec.sgysjgbcd25);
			rx.add(record, "biigamt25", rec.biigamt25);
			rx.add(record, "biigvat25", rec.biigvat25);
			rx.add(record, "sgjbyhcdall", rec.sgjbyhcdall);
			rx.add(record, "sgysjgbcdall", rec.sgysjgbcdall);
			rx.add(record, "biigamtall", rec.biigamtall);
			rx.add(record, "biigvatall", rec.biigvatall);

			rx.add(record, "totRow10", (Long.parseLong(rec.biigamt10) + Long.parseLong(rec.biigvat10))) ;
			rx.add(record, "totRow20", (Long.parseLong(rec.biigamt20) + Long.parseLong(rec.biigvat20))) ;
			rx.add(record, "totRow22", (Long.parseLong(rec.biigamt22) + Long.parseLong(rec.biigvat22))) ;
			rx.add(record, "totRow25", (Long.parseLong(rec.biigamt25) + Long.parseLong(rec.biigvat25))) ;
			rx.add(record, "totRow",   (Long.parseLong(rec.biigamtall) + Long.parseLong(rec.biigvatall))) ;
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
			<gubun/>
			<biopsb/>
			<bihannm/>
			<sgjbyhcd10/>
			<sgysjgbcd10/>
			<biigamt10/>
			<biigvat10/>
			<sgjbyhcd20/>
			<sgysjgbcd20/>
			<biigamt20/>
			<biigvat20/>
			<sgjbyhcd22/>
			<sgysjgbcd22/>
			<biigamt22/>
			<biigvat22/>
			<sgjbyhcd25/>
			<sgysjgbcd25/>
			<biigamt25/>
			<biigvat25/>
			<sgjbyhcdall/>
			<sgysjgbcdall/>
			<biigamtall/>
			<biigvatall/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 19 21:40:53 KST 2009 */ %>