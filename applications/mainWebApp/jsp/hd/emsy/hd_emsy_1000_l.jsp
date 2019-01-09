<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.emsy.rec.*
	,	chosun.ciis.hd.emsy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EMSY_1000_LDataSet ds = (HD_EMSY_1000_LDataSet)request.getAttribute("ds");
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
			HD_EMSY_1000_LCURLISTRecord rec = (HD_EMSY_1000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "sfromemail", rec.sfromemail);
			rx.addCData(record, "smailsubject", rec.smailsubject);
			rx.addCData(record, "smailcontent", rec.smailcontent);
			rx.add(record, "saly_pay_dt", rec.saly_pay_dt);
			//rx.add(record, "sfromemail", StringUtil.replaceToXml(rec.sfromemail));
			//rx.add(record, "smailsubject", StringUtil.replaceToXml(rec.smailsubject));
			//rx.add(record, "smailcontent", StringUtil.replaceToXml(rec.smailcontent));
			//rx.add(record, "saly_pay_dt", StringUtil.replaceToXml(rec.saly_pay_dt));
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
<hd_emsy_1000_l>
	<dataSet>
		<CURLIST>
			<record>
				<sfromemail/>
				<smailsubject/>
				<smailcontent/>
				<saly_pay_dt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_emsy_1000_l>
*/
%>

<% /* 작성시간 : Mon Oct 11 14:15:09 KST 2010 */ %>