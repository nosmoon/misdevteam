<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_5301_LDataSet ds = (FC_ACCT_5301_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_5301_LCURLISTRecord rec = (FC_ACCT_5301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "check1", rec.check1);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "clos_mm", rec.clos_mm);
			rx.add(record, "slip_dtls_clas", rec.slip_dtls_clas);
			rx.add(record, "bgn_dt", rec.bgn_dt);
			rx.add(record, "end_dt", rec.end_dt);
			rx.add(record, "clos_pers_emp_no", rec.clos_pers_emp_no);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
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
			<check1/>
			<slip_clsf_cd/>
			<clos_mm/>
			<slip_dtls_clas/>
			<bgn_dt/>
			<end_dt/>
			<clos_pers_emp_no/>
			<incmg_dt_tm/>
			<incmg_pers_ipadd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 13 10:41:02 KST 2009 */ %>