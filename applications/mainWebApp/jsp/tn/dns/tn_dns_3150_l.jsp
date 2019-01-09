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
	TN_DNS_3120_LDataSet ds = (TN_DNS_3120_LDataSet)request.getAttribute("ds");
	
	int dataSet = 0;
	int recordSet = 0;	
	int rowcnt = 0;	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	StringBuffer size 		= new StringBuffer();
	
	RwText rt = new RwText(); 									//RwText 객체 생성
	rowcnt = ds.curlist.size();
	
	
	
	try {
	
		/****** CURLIST2 BEGIN */
		//recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			TN_DNS_3120_LCURLIST2Record rec = (TN_DNS_3120_LCURLIST2Record)ds.curlist2.get(i);
			//int record = rx.add(recordSet, "record", "");
			
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
//		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */
		
		
		
		/****** CURLIST1 END */

	}
	catch (Exception e) {
		//errcode += " JSP Error";
		//errmsg += " JSP Error Message = " + e.getMessage();
		out.println(rt.textFlush()); //버퍼 출력	
	}
	finally {
		//rx.add(dataSet, "errcode", errcode);
		//rx.add(dataSet, "errmsg", errmsg);
		//out.println(rx.xmlFlush());
		//out.println(rx.xmlEndFlush());
		out.println(rt.textFlush()); //버퍼 출력	
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_3120_l>
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
</tn_dns_3120_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_3120_l>
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
</tn_dns_3120_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_3120_l>
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
</tn_dns_3120_l>
*/
%>

<% /* 작성시간 : Mon Aug 08 20:00:55 KST 2016 */ %>