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
	FC_ACCT_2562_SDataSet ds = (FC_ACCT_2562_SDataSet)request.getAttribute("ds");
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
			FC_ACCT_2562_SCURLIST1Record rec = (FC_ACCT_2562_SCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "bgn_dt", rec.bgn_dt);
			//rx.add(record, "last_dt", rec.last_dt);
			rx.add(record, "bgn_dt", StringUtil.replaceToXml(rec.bgn_dt));
			rx.add(record, "last_dt", StringUtil.replaceToXml(rec.last_dt));
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
<fc_acct_2562_s>
	<dataSet>
		<CURLIST1>
			<record>
				<bgn_dt/>
				<last_dt/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_2562_s>
*/
%>

<% /* 작성시간 : Tue Jul 14 13:38:52 KST 2009 */ %>