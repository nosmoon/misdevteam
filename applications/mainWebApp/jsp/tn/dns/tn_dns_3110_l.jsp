<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.dns.rec.*
	,	chosun.ciis.tn.dns.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_DNS_3110_LDataSet ds = (TN_DNS_3110_LDataSet)request.getAttribute("ds");
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
			TN_DNS_3110_LCURLISTRecord rec = (TN_DNS_3110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "receiptbulkissueidx", rec.receiptbulkissueidx);
			rx.add(record, "issuedeptidx", rec.issuedeptidx);
			rx.add(record, "issuedeptname", rec.issuedeptname);
			rx.add(record, "paydate", rec.paydate);
			rx.add(record, "paymentcount", rec.paymentcount);
			rx.add(record, "price", rec.price);
			rx.add(record, "issuecount", rec.issuecount);
			rx.add(record, "adminname", rec.adminname);
			rx.add(record, "issuedate", rec.issuedate);
			//rx.add(record, "receiptbulkissueidx", StringUtil.replaceToXml(rec.receiptbulkissueidx));
			//rx.add(record, "issuedeptidx", StringUtil.replaceToXml(rec.issuedeptidx));
			//rx.add(record, "issuedeptname", StringUtil.replaceToXml(rec.issuedeptname));
			//rx.add(record, "paydate", StringUtil.replaceToXml(rec.paydate));
			//rx.add(record, "paymentcount", StringUtil.replaceToXml(rec.paymentcount));
			//rx.add(record, "price", StringUtil.replaceToXml(rec.price));
			//rx.add(record, "issucount", StringUtil.replaceToXml(rec.issucount));
			//rx.add(record, "adminname", StringUtil.replaceToXml(rec.adminname));
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
<tn_dns_3110_l>
	<dataSet>
		<CURLIST>
			<record>
				<receiptbulkissueidx/>
				<issuedeptidx/>
				<issuedeptname/>
				<paydate/>
				<paymentcount/>
				<price/>
				<issucount/>
				<adminname/>
			</record>
		</CURLIST>
	</dataSet>
</tn_dns_3110_l>
*/
%>

<% /* 작성시간 : Tue Jun 28 19:58:28 KST 2016 */ %>