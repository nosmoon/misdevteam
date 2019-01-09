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
	TN_DNS_3010_LDataSet ds = (TN_DNS_3010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int totalPrice = 0;
	int deletedCnt = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_DNS_3010_LCURLISTRecord rec = (TN_DNS_3010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "receiptidx", rec.receiptidx);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "deptidx", rec.deptidx);
			rx.add(record, "receiptcode", rec.receiptcode);
			rx.add(record, "name", rec.name);
			rx.add(record, "issuecategory", rec.issuecategory);
			rx.add(record, "issuedate", rec.issuedate);
			rx.add(record, "donatorcategory", rec.donatorcategory);
			rx.add(record, "receiptcategory", rec.receiptcategory);
			rx.add(record, "price", rec.price);
			rx.add(record, "membername", rec.membername);
			rx.add(record, "paymentissue", rec.paymentissue);
			rx.add(record, "issuecount", rec.issuecount);
			rx.add(record, "isdeleted", rec.isdeleted);
			//rx.add(record, "receiptidx", StringUtil.replaceToXml(rec.receiptidx));
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "deptidx", StringUtil.replaceToXml(rec.deptidx));
			//rx.add(record, "receiptcode", StringUtil.replaceToXml(rec.receiptcode));
			//rx.add(record, "name", StringUtil.replaceToXml(rec.name));
			//rx.add(record, "issuecategory", StringUtil.replaceToXml(rec.issuecategory));
			//rx.add(record, "issuedate", StringUtil.replaceToXml(rec.issuedate));
			//rx.add(record, "donatorcategory", StringUtil.replaceToXml(rec.donatorcategory));
			//rx.add(record, "membertype", StringUtil.replaceToXml(rec.membertype));
			//rx.add(record, "price", StringUtil.replaceToXml(rec.price));
			//rx.add(record, "membername", StringUtil.replaceToXml(rec.membername));
			//rx.add(record, "paymentissue", StringUtil.replaceToXml(rec.paymentissue));
			//rx.add(record, "issuecount", StringUtil.replaceToXml(rec.issuecount));
			totalPrice = totalPrice +  Integer.parseInt(rec.price);
			deletedCnt = deletedCnt +  Integer.parseInt(rec.isdeleted);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		rx.add(recordSet, "totalprice", totalPrice);
		rx.add(recordSet, "deletedcnt", deletedCnt);
		rx.add(recordSet, "cnt", ds.curlist.size() - deletedCnt);
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
<tn_dns_3010_l>
	<dataSet>
		<CURLIST>
			<record>
				<receiptidx/>
				<memberidx/>
				<deptidx/>
				<receiptcode/>
				<name/>
				<issuecategory/>
				<issuedate/>
				<donatorcategory/>
				<membertype/>
				<price/>
				<membername/>
				<paymentissue/>
				<issuecount/>
			</record>
		</CURLIST>
	</dataSet>
</tn_dns_3010_l>
*/
%>

<% /* 작성시간 : Tue Jun 21 19:16:21 KST 2016 */ %>