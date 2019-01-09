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
	TN_RPT_1600_LDataSet ds = (TN_RPT_1600_LDataSet)request.getAttribute("ds");
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
			TN_RPT_1600_LCURLISTRecord rec = (TN_RPT_1600_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "membercode", rec.membercode);
			rx.add(record, "name", rec.name);
			rx.add(record, "promisecode", rec.promisecode);
			rx.add(record, "promisedate", rec.promisedate);
			rx.add(record, "promiseprice", rec.promiseprice);
			rx.add(record, "paymethodnm", rec.paymethodnm);
			rx.add(record, "partitiontype", rec.partitiontype);
			rx.add(record, "paystartdate", rec.paystartdate);
			rx.add(record, "payenddate", rec.payenddate);
			rx.add(record, "monthlypayday", rec.monthlypayday);
			rx.add(record, "monthlypayprice", rec.monthlypayprice);
			rx.add(record, "partitioncount", rec.partitioncount);
			rx.add(record, "onlineproyn", rec.onlineproyn);
			rx.add(record, "writedate", rec.writedate);
			rx.add(record, "fund2", rec.fund2);
			//rx.add(record, "membercode", StringUtil.replaceToXml(rec.membercode));
			//rx.add(record, "name", StringUtil.replaceToXml(rec.name));
			//rx.add(record, "promisecode", StringUtil.replaceToXml(rec.promisecode));
			//rx.add(record, "promisedate", StringUtil.replaceToXml(rec.promisedate));
			//rx.add(record, "promiseprice", StringUtil.replaceToXml(rec.promiseprice));
			//rx.add(record, "paymethodnm", StringUtil.replaceToXml(rec.paymethodnm));
			//rx.add(record, "partitiontype", StringUtil.replaceToXml(rec.partitiontype));
			//rx.add(record, "paystartdate", StringUtil.replaceToXml(rec.paystartdate));
			//rx.add(record, "payenddate", StringUtil.replaceToXml(rec.payenddate));
			//rx.add(record, "monthlypayday", StringUtil.replaceToXml(rec.monthlypayday));
			//rx.add(record, "monthlypayprice", StringUtil.replaceToXml(rec.monthlypayprice));
			//rx.add(record, "partitioncount", StringUtil.replaceToXml(rec.partitioncount));
			//rx.add(record, "onlineproyn", StringUtil.replaceToXml(rec.onlineproyn));
			//rx.add(record, "writedate", StringUtil.replaceToXml(rec.writedate));
			//rx.add(record, "fund2", StringUtil.replaceToXml(rec.fund2));
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
<tn_rpt_1600_l>
	<dataSet>
		<CURLIST>
			<record>
				<membercode/>
				<name/>
				<promisecode/>
				<promisedate/>
				<promiseprice/>
				<paymethodnm/>
				<partitiontype/>
				<paystartdate/>
				<payenddate/>
				<monthlypayday/>
				<monthlypayprice/>
				<partitioncount/>
				<onlineproyn/>
				<writedate/>
				<fund2/>
			</record>
		</CURLIST>
	</dataSet>
</tn_rpt_1600_l>
*/
%>

<% /* 작성시간 : Thu Nov 24 18:18:48 KST 2016 */ %>