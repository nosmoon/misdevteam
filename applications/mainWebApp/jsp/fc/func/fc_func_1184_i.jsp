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
	FC_FUNC_1184_IDataSet ds = (FC_FUNC_1184_IDataSet)request.getAttribute("ds");
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
			FC_FUNC_1184_ICURLISTRecord rec = (FC_FUNC_1184_ICURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rv_out_rv", rec.rv_out_rv);
			rx.add(record, "rv_out_cashamt", rec.rv_out_cashamt);
			rx.add(record, "rv_slip_no", rec.rv_slip_no);
			rx.add(record, "rv_out_eecnt", rec.rv_out_eecnt);
			rx.add(record, "rv_out_msg", rec.rv_out_msg);
			rx.add(record, "rv_slip_occr_dt", rec.rv_slip_occr_dt);
			rx.add(record, "rv_slip_clsf_cd", rec.rv_slip_clsf_cd);
			rx.add(record, "rv_slip_seq", rec.rv_slip_seq);
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
			<rv_out_rv/>
			<rv_out_cashamt/>
			<rv_slip_no/>
			<rv_out_eecnt/>
			<rv_out_msg/>
			<rv_slip_occr_dt/>
			<rv_slip_clsf_cd/>
			<rv_slip_seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 27 12:53:08 KST 2009 */ %>