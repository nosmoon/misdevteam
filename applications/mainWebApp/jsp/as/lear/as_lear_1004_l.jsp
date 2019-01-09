<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.lear.rec.*
	,	chosun.ciis.as.lear.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAR_1004_LDataSet ds = (AS_LEAR_1004_LDataSet)request.getAttribute("ds");
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
			AS_LEAR_1004_LCURLISTRecord rec = (AS_LEAR_1004_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "bldg_nm", rec.bldg_nm);
			rx.add(record, "cntr_no", rec.cntr_no);
			rx.add(record, "hire_dlco_ern", rec.hire_dlco_ern);
			rx.add(record, "hire_dlco_nm", rec.hire_dlco_nm);
			rx.add(record, "rcpm_tot_amt", rec.rcpm_tot_amt);
			rx.add(record, "clam_dt", rec.clam_dt);
			rx.add(record, "gurt_rcpm_amt", rec.gurt_rcpm_amt);
			rx.add(record, "leas_rcpm_amt", rec.leas_rcpm_amt);
			rx.add(record, "mang_rcpm_amt", rec.mang_rcpm_amt);
			rx.add(record, "vat_rcpm_amt", rec.vat_rcpm_amt);
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "occr_seq", StringUtil.replaceToXml(rec.occr_seq));
			//rx.add(record, "rcpm_dt", StringUtil.replaceToXml(rec.rcpm_dt));
			//rx.add(record, "bldg_nm", StringUtil.replaceToXml(rec.bldg_nm));
			//rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
			//rx.add(record, "hire_dlco_ern", StringUtil.replaceToXml(rec.hire_dlco_ern));
			//rx.add(record, "hire_dlco_nm", StringUtil.replaceToXml(rec.hire_dlco_nm));
			//rx.add(record, "rcpm_tot_amt", StringUtil.replaceToXml(rec.rcpm_tot_amt));
			//rx.add(record, "clam_dt", StringUtil.replaceToXml(rec.clam_dt));
			//rx.add(record, "gurt_rcpm_amt", StringUtil.replaceToXml(rec.gurt_rcpm_amt));
			//rx.add(record, "leas_rcpm_amt", StringUtil.replaceToXml(rec.leas_rcpm_amt));
			//rx.add(record, "mang_rcpm_amt", StringUtil.replaceToXml(rec.mang_rcpm_amt));
			//rx.add(record, "vat_rcpm_amt", StringUtil.replaceToXml(rec.vat_rcpm_amt));
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
<as_lear_1004_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<occr_seq/>
				<rcpm_dt/>
				<bldg_nm/>
				<cntr_no/>
				<hire_dlco_ern/>
				<hire_dlco_nm/>
				<rcpm_tot_amt/>
				<clam_dt/>
				<gurt_rcpm_amt/>
				<leas_rcpm_amt/>
				<mang_rcpm_amt/>
				<vat_rcpm_amt/>
			</record>
		</CURLIST>
	</dataSet>
</as_lear_1004_l>
*/
%>

<% /* 작성시간 : Fri Oct 09 11:56:50 KST 2009 */ %>