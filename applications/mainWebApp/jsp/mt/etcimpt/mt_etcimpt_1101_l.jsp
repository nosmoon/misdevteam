<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etcimpt.rec.*
	,	chosun.ciis.mt.etcimpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCIMPT_1101_LDataSet ds = (MT_ETCIMPT_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "seq", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_ETCIMPT_1101_LCURLISTRecord rec = (MT_ETCIMPT_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "seq", rec.seq);
            rx.add(record, "value",rec.seq);
            rx.add(record, "label",rec.seq);
			rx.add(record, "yy", rec.yy);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "leas_clsf", rec.leas_clsf);
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
<dataSet>
	<CURLIST>
		<record>
			<seq/>
			<yy/>
			<cmpy_cd/>
			<leas_clsf/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue May 19 11:08:52 KST 2009 */ %>