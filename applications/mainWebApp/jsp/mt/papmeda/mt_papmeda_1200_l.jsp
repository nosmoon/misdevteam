<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papmeda.rec.*
	,	chosun.ciis.mt.papmeda.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPMEDA_1200_LDataSet ds = (MT_PAPMEDA_1200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "fac_clsf", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPMEDA_1200_LCURLISTRecord rec = (MT_PAPMEDA_1200_LCURLISTRecord)ds.curlist.get(i);
			rx.add(recordSet, "cd", rec.cd);
			rx.add(recordSet, "cdnm", rec.cdnm);
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
			<cd/>
			<cdnm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 08 14:17:58 KST 2009 */ %>