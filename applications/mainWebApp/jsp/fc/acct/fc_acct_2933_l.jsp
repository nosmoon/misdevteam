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
	FC_ACCT_2933_LDataSet ds = (FC_ACCT_2933_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2933_LCURLISTRecord rec = (FC_ACCT_2933_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_no", rec.acct_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "bank_clsf", rec.bank_clsf);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "pch_count", rec.pch_count);
			//rx.add(record, "acct_no", StringUtil.replaceToXml(rec.acct_no));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "bank_clsf", StringUtil.replaceToXml(rec.bank_clsf));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "pch_count", StringUtil.replaceToXml(rec.pch_count));
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
<fc_acct_2933_l>
	<dataSet>
		<CURLIST>
			<record>
				<acct_no/>
				<dlco_nm/>
				<bank_clsf/>
				<amt/>
				<pch_count/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2933_l>
*/
%>

<% /* 작성시간 : Fri Apr 24 17:06:37 KST 2009 */ %>