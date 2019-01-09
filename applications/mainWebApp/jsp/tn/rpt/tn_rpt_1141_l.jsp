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
	TN_RPT_1141_LDataSet ds = (TN_RPT_1141_LDataSet)request.getAttribute("ds");
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
			TN_RPT_1141_LCURLISTRecord rec = (TN_RPT_1141_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sms_send_date", rec.sms_send_date);
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "sms_send_date", StringUtil.replaceToXml(rec.sms_send_date));
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
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
<tn_rpt_1141_l>
	<dataSet>
		<CURLIST>
			<record>
				<sms_send_date/>
				<cnt/>
			</record>
		</CURLIST>
	</dataSet>
</tn_rpt_1141_l>
*/
%>

<% /* 작성시간 : Fri Jun 01 10:45:08 KST 2018 */ %>