<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_5021_LDataSet ds = (FC_FUNC_5021_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_5021_LCURLISTRecord rec = (FC_FUNC_5021_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bhgbcdnm", rec.bhgbcdnm);
			rx.add(record, "bhnonm", rec.bhnonm);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			rx.add(record, "bhcompcdnm", rec.bhcompcdnm);
			rx.add(record, "bhusebuseocdnm", rec.bhusebuseocdnm);
			rx.add(record, "won_amt", rec.won_amt);
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "bhbijanamt", rec.bhbijanamt);
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
			<bhgbcdnm/>
			<bhnonm/>
			<comp_dt/>
			<mtry_dt/>
			<dlco_nm/>
			<use_dept_nm/>
			<bhcompcdnm/>
			<bhusebuseocdnm/>
			<won_amt/>
			<cost_gain_stot/>
			<bhbijanamt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 01 11:18:53 KST 2009 */ %>