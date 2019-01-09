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
	FC_ACCT_2841_LDataSet ds = (FC_ACCT_2841_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** RCPMSHETLIST BEGIN */
		recordSet = rx.add(dataSet, "RCPMSHETLIST", "");

		for(int i = 0; i < ds.rcpmshetlist.size(); i++) {
			FC_ACCT_2841_LRCPMSHETLISTRecord rec = (FC_ACCT_2841_LRCPMSHETLISTRecord)ds.rcpmshetlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rcpm_shet_kind", rec.rcpm_shet_kind);
			rx.add(record, "rcpm_indc_bgn_no", rec.rcpm_indc_bgn_no);
			rx.add(record, "rcpm_clsf", rec.rcpm_clsf);
			rx.add(record, "rcpm_shet_dlv_dt", rec.rcpm_shet_dlv_dt);
			rx.add(record, "dlver_emp_no", rec.dlver_emp_no);
			rx.add(record, "dlver_emp_nm", rec.dlver_emp_nm);
			rx.add(record, "recp_pers_emp_no", rec.recp_pers_emp_no);
			rx.add(record, "recp_pers_emp_nm", rec.recp_pers_emp_nm);
			rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
		}
		rx.add(recordSet, "totalcnt", ds.rcpmshetlist.size());
		/****** RCPMSHETLIST END */

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
	<RCPMSHETLIST>
		<record>
			<rcpm_shet_kind/>
			<rcpm_indc_bgn_no/>
			<rcpm_clsf/>
			<rcpm_shet_dlv_dt/>
			<dlver_emp_no/>
			<dlver_emp_nm/>
			<recp_pers_emp_no/>
			<recp_pers_emp_nm/>
			<rcpm_shet_no/>
		</record>
	</RCPMSHETLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 03 20:38:33 KST 2009 */ %>