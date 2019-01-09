<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.bas.rec.*
	,	chosun.ciis.tn.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_BAS_4001_LDataSet ds = (TN_BAS_4001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			TN_BAS_4001_LCURLIST2Record rec = (TN_BAS_4001_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "receiptcodeidx", rec.receiptcodeidx);
			rx.add(record, "category", rec.category);
			rx.add(record, "receiptcode", rec.receiptcode);
			rx.add(record, "receiptcodetype", rec.receiptcodetype);
			rx.add(record, "description", rec.description);
			rx.add(record, "useinsert", rec.useinsert);
			//rx.add(record, "receiptcodeidx", StringUtil.replaceToXml(rec.receiptcodeidx));
			//rx.add(record, "category", StringUtil.replaceToXml(rec.category));
			//rx.add(record, "receiptcode", StringUtil.replaceToXml(rec.receiptcode));
			//rx.add(record, "receiptcodetype", StringUtil.replaceToXml(rec.receiptcodetype));
			//rx.add(record, "description", StringUtil.replaceToXml(rec.description));
			//rx.add(record, "useinsert", StringUtil.replaceToXml(rec.useinsert));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_BAS_4001_LCURLISTRecord rec = (TN_BAS_4001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "receiptcodeidx", rec.receiptcodeidx);
			rx.add(record, "category", rec.category);
			rx.add(record, "receiptcode", rec.receiptcode);
			rx.add(record, "receiptcodetype", rec.receiptcodetype);
			rx.add(record, "description", rec.description);
			rx.add(record, "useinsert", rec.useinsert);
			//rx.add(record, "receiptcodeidx", StringUtil.replaceToXml(rec.receiptcodeidx));
			//rx.add(record, "category", StringUtil.replaceToXml(rec.category));
			//rx.add(record, "receiptcode", StringUtil.replaceToXml(rec.receiptcode));
			//rx.add(record, "receiptcodetype", StringUtil.replaceToXml(rec.receiptcodetype));
			//rx.add(record, "description", StringUtil.replaceToXml(rec.description));
			//rx.add(record, "useinsert", StringUtil.replaceToXml(rec.useinsert));
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
<tn_bas_4001_l>
	<dataSet>
		<CURLIST2>
			<record>
				<receiptcodeidx/>
				<category/>
				<receiptcode/>
				<receiptcodetype/>
				<description/>
				<useinsert/>
			</record>
		</CURLIST2>
	</dataSet>
</tn_bas_4001_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_bas_4001_l>
	<dataSet>
		<CURLIST>
			<record>
				<receiptcodeidx/>
				<category/>
				<receiptcode/>
				<receiptcodetype/>
				<description/>
				<useinsert/>
			</record>
		</CURLIST>
	</dataSet>
</tn_bas_4001_l>
*/
%>

<% /* 작성시간 : Thu Jun 30 14:08:53 KST 2016 */ %>