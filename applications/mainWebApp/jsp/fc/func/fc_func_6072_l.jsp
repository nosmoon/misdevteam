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
	FC_FUNC_6072_LDataSet ds = (FC_FUNC_6072_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_6072_LCURLISTRecord rec = (FC_FUNC_6072_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pymt_dt", rec.pymt_dt);
			rx.add(record, "pymt_amt", rec.pymt_amt);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "ybjpno", rec.ybjpno);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
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
			<pymt_dt/>
			<pymt_amt/>
			<rmks/>
			<ybjpno/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 20 14:15:09 KST 2009 */ %>