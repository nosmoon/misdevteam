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
	FC_ACCT_2213_LDataSet ds = (FC_ACCT_2213_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2213_LCURLISTRecord rec = (FC_ACCT_2213_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "happen_slipno", rec.happen_slipno);
			rx.add(record, "in_slipno", rec.in_slipno);
			rx.add(record, "slip_rcpm_dt", rec.slip_rcpm_dt);
			rx.add(record, "rcpm_dept_cd", rec.rcpm_dept_cd);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			//rx.add(record, "happen_slipno", StringUtil.replaceToXml(rec.happen_slipno));
			//rx.add(record, "in_slipno", StringUtil.replaceToXml(rec.in_slipno));
			//rx.add(record, "slip_rcpm_dt", StringUtil.replaceToXml(rec.slip_rcpm_dt));
			//rx.add(record, "rcpm_dept_cd", StringUtil.replaceToXml(rec.rcpm_dept_cd));
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
<fc_acct_2213_l>
	<dataSet>
		<CURLIST>
			<record>
				<happen_slipno/>
				<in_slipno/>
				<slip_rcpm_dt/>
				<rcpm_dept_cd/>
				<rcpm_amt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2213_l>
*/
%>

<% /* 작성시간 : Fri Apr 17 17:52:42 KST 2009 */ %>