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
	FC_ACCT_2171_LDataSet ds = (FC_ACCT_2171_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** TAX_STMTLIST BEGIN */
		recordSet = rx.add(dataSet, "TAX_STMTLIST", "");

		for(int i = 0; i < ds.tax_stmtlist.size(); i++) {
			FC_ACCT_2171_LTAX_STMTLISTRecord rec = (FC_ACCT_2171_LTAX_STMTLISTRecord)ds.tax_stmtlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "chk", rec.chk);
			//rx.add(record, "prof_type_cd", rec.prof_type_cd);
			//rx.add(record, "prof_type_nm", rec.prof_type_nm);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_clsf_nm", rec.slip_clsf_nm);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "presi_nm", rec.presi_nm);
			//rx.add(record, "suply_amt", rec.suply_amt);
			//rx.add(record, "vat_amt", rec.vat_amt);
			//rx.add(record, "fisc_dt", rec.fisc_dt);
			//rx.add(record, "issu_tms", rec.issu_tms);
			//rx.add(record, "issu_pers_emp_no", rec.issu_pers_emp_no);
			//rx.add(record, "issu_pers_emp_nm", rec.issu_pers_emp_nm);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "tax_stmt_aprv_yn", rec.tax_stmt_aprv_yn);
			//rx.add(record, "ask_dept_cd", rec.ask_dept_cd);
			//rx.add(record, "slip_rcpm_dt", rec.slip_rcpm_dt);
			//rx.add(record, "transmission_yn", rec.transmission_yn);
			//rx.add(record, "tax_stmt", rec.tax_stmt);
			rx.add(record, "chk", StringUtil.replaceToXml(rec.chk));
			rx.add(record, "prof_type_cd", StringUtil.replaceToXml(rec.prof_type_cd));
			rx.add(record, "prof_type_nm", StringUtil.replaceToXml(rec.prof_type_nm));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_clsf_nm", StringUtil.replaceToXml(rec.slip_clsf_nm));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "presi_nm", StringUtil.replaceToXml(rec.presi_nm));
			rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			rx.add(record, "issu_tms", StringUtil.replaceToXml(rec.issu_tms));
			rx.add(record, "issu_pers_emp_no", StringUtil.replaceToXml(rec.issu_pers_emp_no));
			rx.add(record, "issu_pers_emp_nm", StringUtil.replaceToXml(rec.issu_pers_emp_nm));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "tax_stmt_aprv_yn", StringUtil.replaceToXml(rec.tax_stmt_aprv_yn));
			rx.add(record, "ask_dept_cd", StringUtil.replaceToXml(rec.ask_dept_cd));
			rx.add(record, "slip_rcpm_dt", StringUtil.replaceToXml(rec.slip_rcpm_dt));
			rx.add(record, "transmission_yn", StringUtil.replaceToXml(rec.transmission_yn));
			rx.add(record, "tax_stmt", StringUtil.replaceToXml(rec.tax_stmt));
			rx.add(record, "broker_issu_yn", StringUtil.replaceToXml(rec.broker_issu_yn));
			rx.add(record, "make_dt", StringUtil.replaceToXml(rec.make_dt));
			rx.add(record, "item", StringUtil.replaceToXml(rec.item));
		}
		rx.add(recordSet, "totalcnt", ds.tax_stmtlist.size());
		/****** TAX_STMTLIST END */

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
<fc_acct_2171_l>
	<dataSet>
		<TAX_STMTLIST>
			<record>
				<chk/>
				<prof_type_cd/>
				<prof_type_nm/>
				<slip_clsf_cd/>
				<slip_clsf_nm/>
				<slip_occr_dt/>
				<slip_seq/>
				<dlco_cd/>
				<dlco_nm/>
				<presi_nm/>
				<suply_amt/>
				<vat_amt/>
				<fisc_dt/>
				<issu_tms/>
				<issu_pers_emp_no/>
				<issu_pers_emp_nm/>
				<budg_cd/>
				<tax_stmt_aprv_yn/>
				<ask_dept_cd/>
				<slip_rcpm_dt/>
				<transmission_yn/>
				<tax_stmt/>
			</record>
		</TAX_STMTLIST>
	</dataSet>
</fc_acct_2171_l>
*/
%>

<% /* 작성시간 : Thu Aug 13 12:07:00 KST 2009 */ %>