<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.rpt.rec.*
	,	chosun.ciis.tn.rpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_RPT_1400_LDataSet ds = (TN_RPT_1400_LDataSet)request.getAttribute("ds");
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
			TN_RPT_1400_LCURLISTRecord rec = (TN_RPT_1400_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "partitiontype", rec.partitiontype);
			rx.add(record, "paymethodname", rec.paymethodname);
			rx.add(record, "promise_cnt", rec.promise_cnt);
			rx.add(record, "promise_price", rec.promise_price);
			rx.add(record, "payment_cnt", rec.payment_cnt);
			rx.add(record, "payment_price", rec.payment_price);
			rx.add(record, "pymt_rate", rec.pymt_rate);
			//rx.add(record, "partitiontype", StringUtil.replaceToXml(rec.partitiontype));
			//rx.add(record, "paymethodname", StringUtil.replaceToXml(rec.paymethodname));
			//rx.add(record, "promise_cnt", StringUtil.replaceToXml(rec.promise_cnt));
			//rx.add(record, "promise_price", StringUtil.replaceToXml(rec.promise_price));
			//rx.add(record, "payment_cnt", StringUtil.replaceToXml(rec.payment_cnt));
			//rx.add(record, "payment_cnt", StringUtil.replaceToXml(rec.payment_cnt));
			//rx.add(record, "payment_price", StringUtil.replaceToXml(rec.payment_price));
			//rx.add(record, "pymt_rate", StringUtil.replaceToXml(rec.pymt_rate));
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
<tn_rpt_1400_l>
	<dataSet>
		<CURLIST>
			<record>
				<partitiontype/>
				<paymethodname/>
				<promise_cnt/>
				<promise_price/>
				<payment_cnt/>
				<payment_price/>
				<pymt_rate/>
			</record>
		</CURLIST>
	</dataSet>
</tn_rpt_1400_l>
*/
%>

<% /* 작성시간 : Wed Oct 19 14:41:05 KST 2016 */ %>