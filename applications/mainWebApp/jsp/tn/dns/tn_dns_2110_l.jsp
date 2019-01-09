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
	TN_DNS_2110_LDataSet ds = (TN_DNS_2110_LDataSet)request.getAttribute("ds");
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
			TN_DNS_2110_LCURLISTRecord rec = (TN_DNS_2110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fundcode", rec.fundcode);
			rx.add(record, "fund1", rec.fund1);
			rx.add(record, "fund2", rec.fund2);
			rx.add(record, "fund3", rec.fund3);
			rx.add(record, "check", "N");
			rx.add(record, "fundidx", rec.fundidx);
			//rx.add(record, "fundcode", StringUtil.replaceToXml(rec.fundcode));
			//rx.add(record, "fund1", StringUtil.replaceToXml(rec.fund1));
			//rx.add(record, "fund2", StringUtil.replaceToXml(rec.fund2));
			//rx.add(record, "fund3", StringUtil.replaceToXml(rec.fund3));
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
<tn_dns_2110_l>
	<dataSet>
		<CURLIST>
			<record>
				<fundcode/>
				<fund1/>
				<fund2/>
				<fund3/>
			</record>
		</CURLIST>
	</dataSet>
</tn_dns_2110_l>
*/
%>

<% /* 작성시간 : Wed Jun 15 18:49:00 KST 2016 */ %>