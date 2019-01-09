<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.leas.rec.*
	,	chosun.ciis.as.leas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAS_1401_LDataSet ds = (AS_LEAS_1401_LDataSet)request.getAttribute("ds");
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
			AS_LEAS_1401_LCURLISTRecord rec = (AS_LEAS_1401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "basi_yy", rec.basi_yy);
			rx.add(record, "basi_qq", rec.basi_qq);
			rx.add(record, "basi_int_rate", rec.basi_int_rate);
			//rx.add(record, "basi_yy", StringUtil.replaceToXml(rec.basi_yy));
			//rx.add(record, "basi_qq", StringUtil.replaceToXml(rec.basi_qq));
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
<as_leas_1401_l>
	<dataSet>
		<CURLIST>
			<record>
				<basi_yy/>
				<basi_qq/>
				<basi_int_rate/>
			</record>
		</CURLIST>
	</dataSet>
</as_leas_1401_l>
*/
%>

<% /* 작성시간 : Sat May 09 12:20:21 KST 2009 */ %>