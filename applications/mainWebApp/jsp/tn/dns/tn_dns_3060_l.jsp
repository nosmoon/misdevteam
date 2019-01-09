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
	TN_DNS_3060_LDataSet ds = (TN_DNS_3060_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			TN_DNS_3060_LCURLIST2Record rec = (TN_DNS_3060_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "paymentcode", rec.paymentcode);
			rx.add(record, "paydate", rec.paydate);
			rx.add(record, "deptidx", rec.deptidx);
			rx.add(record, "fundidx", rec.fundidx);
			rx.add(record, "paymethodcode", rec.paymethodcode);
			rx.add(record, "payprice", rec.payprice);
			rx.add(record, "receiptissue", rec.receiptissue);
			//rx.add(record, "paymentcode", StringUtil.replaceToXml(rec.paymentcode));
			//rx.add(record, "paydate", StringUtil.replaceToXml(rec.paydate));
			//rx.add(record, "deptidx", StringUtil.replaceToXml(rec.deptidx));
			//rx.add(record, "fundidx", StringUtil.replaceToXml(rec.fundidx));
			//rx.add(record, "paymethodcode", StringUtil.replaceToXml(rec.paymethodcode));
			//rx.add(record, "payprice", StringUtil.replaceToXml(rec.payprice));
			//rx.add(record, "receiptissue", StringUtil.replaceToXml(rec.receiptissue));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			TN_DNS_3060_LCURLIST1Record rec = (TN_DNS_3060_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "receiptcode", rec.receiptcode);
			rx.add(record, "issuedate", rec.issuedate);
			rx.add(record, "issuecategory", rec.issuecategory);
			rx.add(record, "donatorcategory", rec.donatorcategory);
			rx.add(record, "receiptcategory", rec.receiptcategory);
			rx.add(record, "name", rec.name);
			rx.add(record, "address", rec.address);
			rx.add(record, "regno", rec.regno);
			rx.add(record, "issuecount", rec.issuecount);
			rx.add(record, "issuedatecategory", rec.issuedatecategory);
			rx.add(record, "deptidx", rec.deptidx);
			rx.add(record, "deptidx", rec.deptidx);
			rx.add(record, "adminidx", rec.adminidx);
			rx.add(record, "memo", rec.memo);
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "receiptcode", StringUtil.replaceToXml(rec.receiptcode));
			//rx.add(record, "issuedate", StringUtil.replaceToXml(rec.issuedate));
			//rx.add(record, "issuecategory", StringUtil.replaceToXml(rec.issuecategory));
			//rx.add(record, "donatorcategory", StringUtil.replaceToXml(rec.donatorcategory));
			//rx.add(record, "receiptcategory", StringUtil.replaceToXml(rec.receiptcategory));
			//rx.add(record, "name", StringUtil.replaceToXml(rec.name));
			//rx.add(record, "address", StringUtil.replaceToXml(rec.address));
			//rx.add(record, "regno", StringUtil.replaceToXml(rec.regno));
			//rx.add(record, "issuecount", StringUtil.replaceToXml(rec.issuecount));
			//rx.add(record, "issuedatecategory", StringUtil.replaceToXml(rec.issuedatecategory));
			//rx.add(record, "deptidx", StringUtil.replaceToXml(rec.deptidx));
			//rx.add(record, "deptidx", StringUtil.replaceToXml(rec.deptidx));
			//rx.add(record, "adminidx", StringUtil.replaceToXml(rec.adminidx));
			//rx.add(record, "memo", StringUtil.replaceToXml(rec.memo));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<tn_dns_3060_l>
	<dataSet>
		<CURLIST2>
			<record>
				<paymentcode/>
				<paydate/>
				<deptidx/>
				<fundidx/>
				<paymethodcode/>
				<payprice/>
				<receiptissue/>
			</record>
		</CURLIST2>
	</dataSet>
</tn_dns_3060_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_3060_l>
	<dataSet>
		<CURLIST1>
			<record>
				<memberidx/>
				<receiptcode/>
				<issuedate/>
				<issuecategory/>
				<donatorcategory/>
				<receiptcategory/>
				<name/>
				<address/>
				<regno/>
				<issuecount/>
				<issuedatecategory/>
				<deptidx/>
				<deptidx/>
				<adminidx/>
				<memo/>
			</record>
		</CURLIST1>
	</dataSet>
</tn_dns_3060_l>
*/
%>

<% /* 작성시간 : Fri Aug 05 09:27:37 KST 2016 */ %>