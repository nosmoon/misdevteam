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
	FC_ACCT_2861_LDataSet ds = (FC_ACCT_2861_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** RCPMPROCPTCRLIST BEGIN */
		recordSet = rx.add(dataSet, "RCPMPROCPTCRLIST", "");

		for(int i = 0; i < ds.rcpmprocptcrlist.size(); i++) {
			FC_ACCT_2861_LRCPMPROCPTCRLISTRecord rec = (FC_ACCT_2861_LRCPMPROCPTCRLISTRecord)ds.rcpmprocptcrlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "rcpm_shet_kind", rec.rcpm_shet_kind);
			//rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
			//rx.add(record, "rcpm_clsf", rec.rcpm_clsf);
			//rx.add(record, "rcpm_shet_dlv_dt", rec.rcpm_shet_dlv_dt);
			//rx.add(record, "dlver_emp_no", rec.dlver_emp_no);
			//rx.add(record, "dlver_emp_nm", rec.dlver_emp_nm);
			//rx.add(record, "recp_pers_emp_no", rec.recp_pers_emp_no);
			//rx.add(record, "recp_pers_emp_nm", rec.recp_pers_emp_nm);
			//rx.add(record, "widr_dt", rec.widr_dt);
			//rx.add(record, "rcpm_shet_stat", rec.rcpm_shet_stat);
			//rx.add(record, "widr_resn", rec.widr_resn);
			//rx.add(record, "rmks", rec.rmks);
			//rx.add(record, "rsrt_pers_emp_no", rec.rsrt_pers_emp_no);
			//rx.add(record, "rsrt_pers_emp_nm", rec.rsrt_pers_emp_nm);
			rx.add(record, "rcpm_shet_kind", StringUtil.replaceToXml(rec.rcpm_shet_kind));
			rx.add(record, "rcpm_shet_no", StringUtil.replaceToXml(rec.rcpm_shet_no));
			rx.add(record, "rcpm_clsf", StringUtil.replaceToXml(rec.rcpm_clsf));
			rx.add(record, "rcpm_shet_dlv_dt", StringUtil.replaceToXml(rec.rcpm_shet_dlv_dt));
			rx.add(record, "dlver_emp_no", StringUtil.replaceToXml(rec.dlver_emp_no));
			rx.add(record, "dlver_emp_nm", StringUtil.replaceToXml(rec.dlver_emp_nm));
			rx.add(record, "recp_pers_emp_no", StringUtil.replaceToXml(rec.recp_pers_emp_no));
			rx.add(record, "recp_pers_emp_nm", StringUtil.replaceToXml(rec.recp_pers_emp_nm));
			rx.add(record, "widr_dt", StringUtil.replaceToXml(rec.widr_dt));
			rx.add(record, "rcpm_shet_stat", StringUtil.replaceToXml(rec.rcpm_shet_stat));
			rx.add(record, "widr_resn", StringUtil.replaceToXml(rec.widr_resn));
			rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			rx.add(record, "rsrt_pers_emp_no", StringUtil.replaceToXml(rec.rsrt_pers_emp_no));
			rx.add(record, "rsrt_pers_emp_nm", StringUtil.replaceToXml(rec.rsrt_pers_emp_nm));
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
<fc_acct_2861_l>
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
</fc_acct_2861_l>
*/
%>

<% /* 작성시간 : Thu Jul 16 10:45:23 KST 2009 */ %>