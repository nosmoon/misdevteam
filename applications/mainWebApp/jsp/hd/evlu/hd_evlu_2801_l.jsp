<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_2801_LDataSet ds = (HD_EVLU_2801_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	int spcl_plus_point = rx.add(dataSet, "spcl_plus_point", ds.spcl_plus_point);
	int spcl_minus_point = rx.add(dataSet, "spcl_minus_point", ds.spcl_minus_point);
	int sum = rx.add(dataSet, "sum", ds.sum);

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_2801_LCURLISTRecord rec = (HD_EVLU_2801_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
		//	rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
		//	rx.add(record, "main_insp_dt", rec.main_insp_dt);
			rx.addCData(record, "prz_pnsh_nm", rec.prz_pnsh_nm);
			rx.addCData(record, "case_nm", rec.case_nm );
			rx.add(record, "point", rec.point );
		//	rx.add(record, "scor", rec.scor);
		//	rx.add(record, "remk", rec.remk);
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
			<proc_stat_nm/>
			<main_insp_dt/>
			<prz_pnsh_nm/>
			<scor/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 25 22:39:52 KST 2009 */ %>