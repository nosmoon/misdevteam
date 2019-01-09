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
	FC_ACCT_2231_LDataSet ds = (FC_ACCT_2231_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2231_LCURLISTRecord rec = (FC_ACCT_2231_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "ask_dept_nm", rec.ask_dept_nm);
			rx.add(record, "stmt_slip_no", rec.stmt_slip_no);
			rx.add(record, "tax_amt", rec.tax_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "diff_amt", rec.diff_amt);
			rx.add(record, "diff_amt1", rec.diff_amt1);
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "ask_dept_nm", StringUtil.replaceToXml(rec.ask_dept_nm));
			//rx.add(record, "stmt_slip_no", StringUtil.replaceToXml(rec.stmt_slip_no));
			//rx.add(record, "tax_amt", StringUtil.replaceToXml(rec.tax_amt));
			//rx.add(record, "rcpm_amt", StringUtil.replaceToXml(rec.rcpm_amt));
			//rx.add(record, "diff_amt", StringUtil.replaceToXml(rec.diff_amt));
			//rx.add(record, "diff_amt1", StringUtil.replaceToXml(rec.diff_amt1));
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
<fc_acct_2231_l>
	<dataSet>
		<CURLIST>
			<record>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_nm/>
				<ask_dept_nm/>
				<stmt_slip_no/>
				<tax_amt/>
				<rcpm_amt/>
				<diff_amt/>
				<diff_amt1/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2231_l>
*/
%>

<% /* 작성시간 : Fri Aug 14 17:51:21 KST 2009 */ %>