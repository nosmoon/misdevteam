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
	TN_DNS_2010_LDataSet ds = (TN_DNS_2010_LDataSet)request.getAttribute("ds");
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
			TN_DNS_2010_LCURLISTRecord rec = (TN_DNS_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "membercode", rec.membercode);
			rx.add(record, "memberidx", rec.memberidx);
			rx.addCData(record, "name", rec.name);
			rx.add(record, "membertype", rec.membertype);
			rx.add(record, "promisecode", rec.promisecode);
			rx.add(record, "promiseprice", rec.promiseprice);
			rx.add(record, "payprice", rec.payprice);
			rx.add(record, "payrate", rec.payrate);
			rx.add(record, "fundtype", rec.fundtype);
			rx.add(record, "paymethodcode", rec.paymethodcode);
			rx.add(record, "issuedate", rec.issuedate);
			rx.add(record, "contactdate", rec.contactdate);
			rx.add(record, "senddate", rec.senddate);
			rx.add(record, "cellphone", rec.cellphone);
			rx.add(record, "birthday", rec.birthday);
			//rx.add(record, "membercode", StringUtil.replaceToXml(rec.membercode));
			//rx.add(record, "name", StringUtil.replaceToXml(rec.name));
			//rx.add(record, "membertype", StringUtil.replaceToXml(rec.membertype));
			//rx.add(record, "promiseprice", StringUtil.replaceToXml(rec.promiseprice));
			//rx.add(record, "payprice", StringUtil.replaceToXml(rec.payprice));
			//rx.add(record, "payrate", StringUtil.replaceToXml(rec.payrate));
			//rx.add(record, "issuedate", StringUtil.replaceToXml(rec.issuedate));
			//rx.add(record, "contactdate", StringUtil.replaceToXml(rec.contactdate));
			//rx.add(record, "senddate", StringUtil.replaceToXml(rec.senddate));
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
<tn_dns_2010_l>
	<dataSet>
		<CURLIST>
			<record>
				<membercode/>
				<name/>
				<membertype/>
				<promiseprice/>
				<payprice/>
				<payrate/>
				<issuedate/>
				<contactdate/>
				<senddate/>
			</record>
		</CURLIST>
	</dataSet>
</tn_dns_2010_l>
*/
%>

<% /* 작성시간 : Tue Jun 14 11:05:31 KST 2016 */ %>