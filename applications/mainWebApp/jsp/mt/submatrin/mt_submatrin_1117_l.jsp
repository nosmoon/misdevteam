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
	MT_SUBMATRIN_1117_LDataSet ds = (MT_SUBMATRIN_1117_LDataSet)request.getAttribute("ds");
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
			MT_SUBMATRIN_1117_LCURLISTRecord rec = (MT_SUBMATRIN_1117_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "expn_clsf", rec.expn_clsf);
			rx.add(record, "impt_expn_clsf", rec.impt_expn_clsf);
			rx.add(record, "reso_amt", rec.reso_amt);
			rx.add(record, "titl", rec.titl);
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
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<slip_sub_seq/>
			<slip_arow_no/>
			<expn_clsf/>
			<impt_expn_clsf/>
			<reso_amt/>
			<titl/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jun 01 15:04:55 KST 2009 */ %>