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
	TN_DNS_2030_LDataSet ds = (TN_DNS_2030_LDataSet)request.getAttribute("ds");
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
			TN_DNS_2030_LCURLISTRecord rec = (TN_DNS_2030_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "membercode", rec.membercode);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "name", rec.name);
			rx.add(record, "membertype", rec.membertype);
			//rx.add(record, "membercode", StringUtil.replaceToXml(rec.membercode));
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "name", StringUtil.replaceToXml(rec.name));
			//rx.add(record, "membertype", StringUtil.replaceToXml(rec.membertype));
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
<tn_dns_2030_l>
	<dataSet>
		<CURLIST>
			<record>
				<membercode/>
				<memberidx/>
				<name/>
				<membertype/>
			</record>
		</CURLIST>
	</dataSet>
</tn_dns_2030_l>
*/
%>

<% /* 작성시간 : Wed Sep 28 19:29:58 KST 2016 */ %>