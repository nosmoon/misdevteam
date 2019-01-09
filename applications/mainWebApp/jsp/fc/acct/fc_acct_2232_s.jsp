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
	FC_ACCT_2232_SDataSet ds = (FC_ACCT_2232_SDataSet)request.getAttribute("ds");
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
			FC_ACCT_2232_SCURLISTRecord rec = (FC_ACCT_2232_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_rcpm_dt", rec.slip_rcpm_dt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "rcpm_shet_kind", rec.rcpm_shet_kind);
			rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "tax_no", rec.tax_no);
			rx.add(record, "rcpm_no", rec.rcpm_no);
			//rx.add(record, "slip_rcpm_dt", StringUtil.replaceToXml(rec.slip_rcpm_dt));
			//rx.add(record, "rcpm_amt", StringUtil.replaceToXml(rec.rcpm_amt));
			//rx.add(record, "rcpm_shet_kind", StringUtil.replaceToXml(rec.rcpm_shet_kind));
			//rx.add(record, "rcpm_shet_no", StringUtil.replaceToXml(rec.rcpm_shet_no));
			//rx.add(record, "rcpm_slip_no", StringUtil.replaceToXml(rec.rcpm_slip_no));
			//rx.add(record, "tax_no", StringUtil.replaceToXml(rec.tax_no));
			//rx.add(record, "rcpm_no", StringUtil.replaceToXml(rec.rcpm_no));
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
<fc_acct_2232_s>
	<dataSet>
		<CURLIST>
			<record>
				<slip_rcpm_dt/>
				<rcpm_amt/>
				<rcpm_shet_kind/>
				<rcpm_shet_no/>
				<rcpm_slip_no/>
				<tax_no/>
				<rcpm_no/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2232_s>
*/
%>

<% /* 작성시간 : Fri Aug 14 17:55:52 KST 2009 */ %>