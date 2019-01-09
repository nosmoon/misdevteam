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
	AS_LEAS_1107_MDataSet ds = (AS_LEAS_1107_MDataSet)request.getAttribute("ds");
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
			AS_LEAS_1107_MCURLISTRecord rec = (AS_LEAS_1107_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ern", rec.ern);
			rx.add(record, "ernm", rec.ernm);
			rx.add(record, "ern_nm", rec.ern_nm);
			//rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			//rx.add(record, "ernm", StringUtil.replaceToXml(rec.ernm));
			//rx.add(record, "ern_nm", StringUtil.replaceToXml(rec.ern_nm));
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
<as_leas_1107_m>
	<dataSet>
		<CURLIST>
			<record>
				<ern/>
				<ernm/>
				<ern_nm/>
			</record>
		</CURLIST>
	</dataSet>
</as_leas_1107_m>
*/
%>

<% /* 작성시간 : Mon Apr 13 15:19:23 KST 2009 */ %>