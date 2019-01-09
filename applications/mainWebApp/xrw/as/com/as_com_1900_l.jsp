<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.com.rec.*
	,	chosun.ciis.as.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_COM_1900_LDataSet ds = (AS_COM_1900_LDataSet)request.getAttribute("ds");
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
			AS_COM_1900_LCURLISTRecord rec = (AS_COM_1900_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "ern", rec.ern);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
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
<as_com_1900_l>
	<dataSet>
		<CURLIST>
			<record>
				<ern/>
				<dlco_nm/>
			</record>
		</CURLIST>
	</dataSet>
</as_com_1900_l>
*/
%>

<% /* 작성시간 : Thu Jun 18 14:07:36 KST 2009 */ %>