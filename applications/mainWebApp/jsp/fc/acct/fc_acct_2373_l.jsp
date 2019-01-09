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
	FC_ACCT_2373_LDataSet ds = (FC_ACCT_2373_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	rx.add(dataSet, "note_yn", ds.note_yn);
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2373_LCURLISTRecord rec = (FC_ACCT_2373_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "check1", rec.check1);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			//rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			//rx.add(record, "rmks1", rec.rmks1);
			//rx.add(record, "sum_cbamt", rec.sum_cbamt);
			//rx.add(record, "sum_dbamt", rec.sum_dbamt);
			//rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "tax_stmt_no", rec.tax_stmt_no);
			//rx.add(record, "draft_doc_no", rec.draft_doc_no);
			//rx.add(record, "draft_expn_amt", rec.draft_expn_amt);
			//rx.add(record, "draft_impt_amt", rec.draft_impt_amt);
			//rx.add(record, "draft_doc_dept_cd", rec.draft_doc_dept_cd);
			rx.add(record, "check1", StringUtil.replaceToXml(rec.check1));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			rx.add(record, "clam_dept_cd", StringUtil.replaceToXml(rec.clam_dept_cd));
			rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			rx.add(record, "sum_cbamt", StringUtil.replaceToXml(rec.sum_cbamt));
			rx.add(record, "sum_dbamt", StringUtil.replaceToXml(rec.sum_dbamt));
			rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			rx.add(record, "tax_stmt_no", StringUtil.replaceToXml(rec.tax_stmt_no));
			rx.add(record, "draft_doc_no", StringUtil.replaceToXml(rec.draft_doc_no));
			rx.add(record, "draft_expn_amt", StringUtil.replaceToXml(rec.draft_expn_amt));
			rx.add(record, "draft_impt_amt", StringUtil.replaceToXml(rec.draft_impt_amt));
			rx.add(record, "draft_doc_dept_cd", StringUtil.replaceToXml(rec.draft_doc_dept_cd));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<fc_acct_2373_l>
	<dataSet>
		<CURLIST>
			<record>
				<check1/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<slip_sub_seq/>
				<clam_dept_cd/>
				<rmks1/>
				<sum_cbamt/>
				<sum_dbamt/>
				<slip_no/>
				<tax_stmt_no/>
				<draft_doc_no/>
				<draft_expn_amt/>
				<draft_impt_amt/>
				<draft_doc_dept_cd/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2373_l>
*/
%>

<% /* �ۼ��ð� : Fri Jul 17 18:04:47 KST 2009 */ %>