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
	FC_ACCT_4044_PDataSet ds = (FC_ACCT_4044_PDataSet)request.getAttribute("ds");
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
			FC_ACCT_4044_PCURLISTRecord rec = (FC_ACCT_4044_PCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "pch_compnm", rec.pch_compnm);
			rx.add(record, "pch_amt1", rec.pch_amt1);
			rx.add(record, "pch_amt2", rec.pch_amt2);
			rx.add(record, "pch_amt3", rec.pch_amt3);
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "pch_compnm", StringUtil.replaceToXml(rec.pch_compnm));
			//rx.add(record, "pch_amt1", StringUtil.replaceToXml(rec.pch_amt1));
			//rx.add(record, "pch_amt2", StringUtil.replaceToXml(rec.pch_amt2));
			//rx.add(record, "pch_amt3", StringUtil.replaceToXml(rec.pch_amt3));
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
<fc_acct_4044_p>
	<dataSet>
		<CURLIST>
			<record>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<pch_compnm/>
				<pch_amt1/>
				<pch_amt2/>
				<pch_amt3/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_4044_p>
*/
%>

<% /* 작성시간 : Mon Aug 10 19:29:18 KST 2009 */ %>