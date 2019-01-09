<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_5600_PDataSet ds = (FC_ACCT_5600_PDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURCOMMLIST BEGIN */
		recordSet = rx.add(dataSet, "CURCOMMLIST", "");

		for(int i = 0; i < ds.curcommlist.size(); i++) {
			FC_ACCT_5600_PCURCOMMLISTRecord rec = (FC_ACCT_5600_PCURCOMMLISTRecord)ds.curcommlist.get(i);
			int record = rx.add(recordSet, "record", "");
		}
		rx.add(recordSet, "totalcnt", ds.curcommlist.size());
		/****** CURCOMMLIST END */

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
<fc_acct_5600_p>
	<dataSet>
		<CURCOMMLIST>
			<record>
			</record>
		</CURCOMMLIST>
	</dataSet>
</fc_acct_5600_p>
*/
%>

<% /* 작성시간 : Mon Aug 10 16:00:46 KST 2009 */ %>