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
	AS_LEAR_1003_LDataSet ds = (AS_LEAR_1003_LDataSet)request.getAttribute("ds");
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
			AS_LEAR_1003_LCURLISTRecord rec = (AS_LEAR_1003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cntr_no", rec.cntr_no);
			//rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
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
<as_lear_1003_l>
	<dataSet>
		<CURLIST>
			<record>
				<cntr_no/>
			</record>
		</CURLIST>
	</dataSet>
</as_lear_1003_l>
*/
%>

<% /* 작성시간 : Mon Jul 13 11:42:58 KST 2009 */ %>