<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_8005_LDataSet ds = (MT_PAPORD_8005_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_8005_LCURLISTRecord rec = (MT_PAPORD_8005_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "use_a", rec.use_a);
			rx.add(record, "use_c", rec.use_c);
			rx.add(record, "use_b", rec.use_b);
			//rx.add(record, "use_a", StringUtil.replaceToXml(rec.use_a));
			//rx.add(record, "use_c", StringUtil.replaceToXml(rec.use_c));
			//rx.add(record, "use_b", StringUtil.replaceToXml(rec.use_b));
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
<mt_papord_8005_l>
	<dataSet>
		<CURLIST>
			<record>
				<use_a/>
				<use_c/>
				<use_b/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papord_8005_l>
*/
%>

<% /* 작성시간 : Thu Sep 08 17:55:17 KST 2016 */ %>