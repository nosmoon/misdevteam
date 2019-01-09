<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*;
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2851_LDataSet ds = (FC_ACCT_2851_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	dataSet = rx.add(root, "dataSet", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** RCPMPROCPTCRLIST BEGIN */
		recordSet = rx.add(dataSet, "RCPMPROCPTCRLIST", "");

		for(int i = 0; i < ds.rcpmprocptcrlist.size(); i++) {
			FC_ACCT_2851_LRCPMPROCPTCRLISTRecord rec = (FC_ACCT_2851_LRCPMPROCPTCRLISTRecord)ds.rcpmprocptcrlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rcpm_shet_kind", rec.rcpm_shet_kind);
			rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
			rx.add(record, "rcpm_clsf", rec.rcpm_clsf);
			rx.add(record, "rcpm_shet_dlv_dt", rec.rcpm_shet_dlv_dt);
			rx.add(record, "dlver_emp_no", rec.dlver_emp_no);
			rx.add(record, "dlver_emp_nm", rec.dlver_emp_nm);
			rx.add(record, "recp_pers_emp_no", rec.recp_pers_emp_no);
			rx.add(record, "recp_pers_emp_nm", rec.recp_pers_emp_nm);
			rx.add(record, "widr_dt", rec.widr_dt);
			rx.add(record, "rcpm_shet_stat", rec.rcpm_shet_stat);
			rx.add(record, "widr_resn", rec.widr_resn);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "rsrt_pers_emp_no", rec.rsrt_pers_emp_no);
			rx.add(record, "rsrt_pers_emp_nm", rec.rsrt_pers_emp_nm);
		}
		rx.add(recordSet, "totalcnt", ds.rcpmprocptcrlist.size());
		/****** RCPMPROCPTCRLIST END */

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
	<RCPMPROCPTCRLIST>
		<record>
			<rcpm_shet_kind/>
			<rcpm_shet_no/>
			<rcpm_clsf/>
			<rcpm_shet_dlv_dt/>
			<dlver_emp_no/>
			<dlver_emp_nm/>
			<recp_pers_emp_no/>
			<recp_pers_emp_nm/>
			<widr_dt/>
			<rcpm_shet_stat/>
			<widr_resn/>
			<rmks/>
			<rsrt_pers_emp_no/>
			<rsrt_pers_emp_nm/>
		</record>
	</RCPMPROCPTCRLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jan 20 16:58:01 KST 2009 */ %>