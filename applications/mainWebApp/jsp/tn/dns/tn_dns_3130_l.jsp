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
	TN_DNS_3130_LDataSet ds = (TN_DNS_3130_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "gridData3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			TN_DNS_3130_LCURLIST3Record rec = (TN_DNS_3130_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "receiptbulkissueidx", rec.receiptbulkissueidx);
			rx.addCData(record, "issuname", rec.issuname);
			rx.add(record, "donatorcategory", rec.donatorcategory);
			rx.add(record, "receiptcategory", rec.receiptcategory);
			rx.add(record, "price", rec.price);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "membercategorycode", rec.membercategorycode);
			rx.add(record, "receiptidx", rec.receiptidx);
			rx.addCData(record, "name", rec.name);
			rx.add(record, "paymenttype", rec.paymenttype);
			rx.add(record, "status", rec.status);
			rx.add(record, "receiptcode", rec.receiptcode);
			//rx.add(record, "receiptbulkissueidx", StringUtil.replaceToXml(rec.receiptbulkissueidx));
			//rx.add(record, "issuname", StringUtil.replaceToXml(rec.issuname));
			//rx.add(record, "donatorcategory", StringUtil.replaceToXml(rec.donatorcategory));
			//rx.add(record, "receiptcategory", StringUtil.replaceToXml(rec.receiptcategory));
			//rx.add(record, "price", StringUtil.replaceToXml(rec.price));
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "membercategorycode", StringUtil.replaceToXml(rec.membercategorycode));
			//rx.add(record, "name", StringUtil.replaceToXml(rec.name));
			//rx.add(record, "paymenttype", StringUtil.replaceToXml(rec.paymenttype));
			//rx.add(record, "status", StringUtil.replaceToXml(rec.status));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			TN_DNS_3130_LCURLIST2Record rec = (TN_DNS_3130_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "receiptbulkissueidx", rec.receiptbulkissueidx);
			rx.addCData(record, "issuname", rec.issuname);
			rx.add(record, "donatorcategory", rec.donatorcategory);
			rx.add(record, "receiptcategory", rec.receiptcategory);
			rx.add(record, "price", rec.price);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "membercategorycode", rec.membercategorycode);
			rx.add(record, "receiptidx", rec.receiptidx);
			rx.addCData(record, "name", rec.name);
			rx.add(record, "paymenttype", rec.paymenttype);
			rx.add(record, "receiptcode", rec.receiptcode);
			//rx.add(record, "receiptbulkissueidx", StringUtil.replaceToXml(rec.receiptbulkissueidx));
			//rx.add(record, "issuname", StringUtil.replaceToXml(rec.issuname));
			//rx.add(record, "donatorcategory", StringUtil.replaceToXml(rec.donatorcategory));
			//rx.add(record, "receiptcategory", StringUtil.replaceToXml(rec.receiptcategory));
			//rx.add(record, "price", StringUtil.replaceToXml(rec.price));
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "membercategorycode", StringUtil.replaceToXml(rec.membercategorycode));
			//rx.add(record, "receiptidx", StringUtil.replaceToXml(rec.receiptidx));
			//rx.add(record, "name", StringUtil.replaceToXml(rec.name));
			//rx.add(record, "paymenttype", StringUtil.replaceToXml(rec.paymenttype));
			//rx.add(record, "receiptcode", StringUtil.replaceToXml(rec.receiptcode));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			TN_DNS_3130_LCURLIST1Record rec = (TN_DNS_3130_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "receiptbulkissueidx", rec.receiptbulkissueidx);
			rx.add(record, "issuedeptidx", rec.issuedeptidx);
			rx.add(record, "issuedeptname", rec.issuedeptname);
			rx.add(record, "startpaydate", rec.startpaydate);
			rx.add(record, "endpaydate", rec.endpaydate);
			rx.add(record, "includeissued", rec.includeissued);
			rx.add(record, "paymentcount", rec.paymentcount);
			rx.add(record, "price", rec.price);
			rx.add(record, "issuecount", rec.issuecount);
			rx.add(record, "adminname", rec.adminname);
			rx.add(record, "issuedate", rec.issuedate);
			rx.add(record, "deptidx", rec.deptidx);
			//rx.add(record, "receiptbulkissueidx", StringUtil.replaceToXml(rec.receiptbulkissueidx));
			//rx.add(record, "issuedeptidx", StringUtil.replaceToXml(rec.issuedeptidx));
			//rx.add(record, "issuedeptname", StringUtil.replaceToXml(rec.issuedeptname));
			//rx.add(record, "startpaydate", StringUtil.replaceToXml(rec.startpaydate));
			//rx.add(record, "endpaydate", StringUtil.replaceToXml(rec.endpaydate));
			//rx.add(record, "includeissued", StringUtil.replaceToXml(rec.includeissued));
			//rx.add(record, "paymentcount", StringUtil.replaceToXml(rec.paymentcount));
			//rx.add(record, "price", StringUtil.replaceToXml(rec.price));
			//rx.add(record, "issuecount", StringUtil.replaceToXml(rec.issuecount));
			//rx.add(record, "adminname", StringUtil.replaceToXml(rec.adminname));
			//rx.add(record, "issuedate", StringUtil.replaceToXml(rec.issuedate));
			//rx.add(record, "deptidx", StringUtil.replaceToXml(rec.deptidx));
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
<tn_dns_3130_l>
	<dataSet>
		<CURLIST3>
			<record>
				<receiptbulkissueidx/>
				<issuname/>
				<donatorcategory/>
				<receiptcategory/>
				<price/>
				<memberidx/>
				<membercategorycode/>
				<name/>
				<paymenttype/>
				<status/>
			</record>
		</CURLIST3>
	</dataSet>
</tn_dns_3130_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_3130_l>
	<dataSet>
		<CURLIST2>
			<record>
				<receiptbulkissueidx/>
				<issuname/>
				<donatorcategory/>
				<receiptcategory/>
				<price/>
				<memberidx/>
				<membercategorycode/>
				<receiptidx/>
				<name/>
				<paymenttype/>
				<receiptcode/>
			</record>
		</CURLIST2>
	</dataSet>
</tn_dns_3130_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_3130_l>
	<dataSet>
		<CURLIST1>
			<record>
				<receiptbulkissueidx/>
				<issuedeptidx/>
				<issuedeptname/>
				<startpaydate/>
				<endpaydate/>
				<includeissued/>
				<paymentcount/>
				<price/>
				<issuecount/>
				<adminname/>
				<issuedate/>
				<deptidx/>
			</record>
		</CURLIST1>
	</dataSet>
</tn_dns_3130_l>
*/
%>

<% /* 작성시간 : Tue Aug 16 17:58:33 KST 2016 */ %>