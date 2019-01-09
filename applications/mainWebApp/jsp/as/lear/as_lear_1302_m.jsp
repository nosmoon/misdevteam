<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.lear.rec.*
	,	chosun.ciis.as.lear.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAR_1302_MDataSet ds = (AS_LEAR_1302_MDataSet)request.getAttribute("ds");
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
			AS_LEAR_1302_MCURLISTRecord rec = (AS_LEAR_1302_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "basi_int_rate", rec.basi_int_rate);
			//rx.add(record, "basi_int_rate", StringUtil.replaceToXml(rec.basi_int_rate));
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
<as_lear_1302_m>
	<dataSet>
		<CURLIST>
			<record>
				<basi_int_rate/>
			</record>
		</CURLIST>
	</dataSet>
</as_lear_1302_m>
*/
%>

<% /* 작성시간 : Mon May 04 11:27:12 KST 2009 */ %>