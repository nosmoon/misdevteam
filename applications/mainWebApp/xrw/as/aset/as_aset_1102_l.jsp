<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1102_LDataSet ds = (AS_ASET_1102_LDataSet)request.getAttribute("ds");
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
			AS_ASET_1102_LCURLISTRecord rec = (AS_ASET_1102_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "selected", rec.selected);
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "chg_clsf_nm", rec.chg_clsf_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "chg_tot_amt", rec.chg_tot_amt);
			rx.add(record, "vat_tot_amt", rec.vat_tot_amt);
			rx.add(record, "rcpm_tot_amt", rec.rcpm_tot_amt);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "tax_stmt_no", rec.tax_stmt_no);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_clsf", rec.chg_clsf);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "ndduc_year", rec.ndduc_year);
			rx.add(record, "ndduc_prd_clsf", rec.ndduc_prd_clsf);
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
			<selected/>
			<chg_dt/>
			<chg_clsf_nm/>
			<remk/>
			<chg_tot_amt/>
			<vat_tot_amt/>
			<rcpm_tot_amt/>
			<dlco_nm/>
			<tax_stmt_no/>
			<slip_no/>
			<incmg_pers/>
			<incmg_dt_tm/>
			<chg_clsf/>
			<occr_dt/>
			<occr_seq/>
			<ndduc_year/>
			<ndduc_prd_clsf/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 26 17:52:31 KST 2009 */ %>