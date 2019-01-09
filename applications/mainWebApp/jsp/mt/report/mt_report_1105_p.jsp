<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.report.rec.*
	,	chosun.ciis.mt.report.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_REPORT_1105_PDataSet ds = (MT_REPORT_1105_PDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_REPORT_1105_PCURLIST1Record rec = (MT_REPORT_1105_PCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "num", rec.num);
			//rx.add(record, "num", StringUtil.replaceToXml(rec.num));
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
<mt_report_1105_p>
	<dataSet>
		<CURLIST1>
			<record>
				<num/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_report_1105_p>
*/
%>

<% /* 작성시간 : Fri Jul 31 12:01:55 KST 2009 */ %>