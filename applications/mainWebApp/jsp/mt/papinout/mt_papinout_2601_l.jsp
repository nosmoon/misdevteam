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
	MT_PAPINOUT_2601_LDataSet ds = (MT_PAPINOUT_2601_LDataSet)request.getAttribute("ds");
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
			MT_PAPINOUT_2601_LCURLISTRecord rec = (MT_PAPINOUT_2601_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "owh_dt", rec.owh_dt);
			rx.add(record, "factcdnm", rec.factcdnm);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "owh_uprc", rec.owh_uprc);
			rx.add(record, "owh_roll", rec.owh_roll);
			rx.add(record, "owh_wgt", rec.owh_wgt);
			rx.add(record, "owh_amt", rec.owh_amt);
			rx.add(record, "mov_factcdnm", rec.mov_factcdnm);
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
			<owh_dt/>
			<factcdnm/>
			<matr_cd/>
			<owh_uprc/>
			<owh_roll/>
			<owh_wgt/>
			<owh_amt/>
			<mov_factcdnm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Apr 25 12:31:53 KST 2009 */ %>