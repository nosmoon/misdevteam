<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1402_LDataSet ds = (AS_ASET_1402_LDataSet)request.getAttribute("ds");
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
			AS_ASET_1402_LCURLISTRecord rec = (AS_ASET_1402_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_nm", rec.acct_nm);
			rx.add(record, "ndduc_rate", rec.ndduc_rate);
			rx.add(record, "ndduc_amt", rec.ndduc_amt);
			rx.add(record, "aset_cnt", rec.aset_cnt);
			rx.add(record, "ndduc_year", rec.ndduc_year);
			rx.add(record, "ndduc_prd_clsf", rec.ndduc_prd_clsf);
			rx.add(record, "acct_cd", rec.acct_cd);
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
			<acct_nm/>
			<ndduc_rate/>
			<ndduc_amt/>
			<aset_cnt/>
			<ndduc_year/>
			<ndduc_prd_clsf/>
			<acct_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 17 16:21:32 KST 2009 */ %>