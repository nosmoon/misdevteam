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
	FC_ACCT_2135_SDataSet ds = (FC_ACCT_2135_SDataSet)request.getAttribute("ds");
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
			FC_ACCT_2135_SCURLISTRecord rec = (FC_ACCT_2135_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rcpm_no", rec.rcpm_no);
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "occr_slip_no", rec.occr_slip_no);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			//rx.add(record, "rcpm_no", StringUtil.replaceToXml(rec.rcpm_no));
			//rx.add(record, "rcpm_slip_no", StringUtil.replaceToXml(rec.rcpm_slip_no));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "occr_slip_no", StringUtil.replaceToXml(rec.occr_slip_no));
			//rx.add(record, "rcpm_amt", StringUtil.replaceToXml(rec.rcpm_amt));
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
<fc_acct_2135_s>
	<dataSet>
		<CURLIST>
			<record>
				<rcpm_no/>
				<rcpm_slip_no/>
				<slip_no/>
				<occr_slip_no/>
				<rcpm_amt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2135_s>
*/
%>

<% /* 작성시간 : Sat Aug 08 11:15:42 KST 2009 */ %>