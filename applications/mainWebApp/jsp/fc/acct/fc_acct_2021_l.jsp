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
	FC_ACCT_2021_LDataSet ds = (FC_ACCT_2021_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2021_LCURLISTRecord rec = (FC_ACCT_2021_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cost_clsf", rec.cost_clsf);
			//rx.add(record, "clam_amt", rec.clam_amt);
			//rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			//rx.add(record, "chrg_emp_no", rec.chrg_emp_no);
			//rx.add(record, "titl", rec.titl);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "budg_yymm", rec.budg_yymm);
			//rx.add(record, "medi_cd", rec.medi_cd);
			//rx.add(record, "fisc_dt", rec.fisc_dt);
			//rx.add(record, "pch_buseonm", rec.pch_buseonm);
			//rx.add(record, "pch_mcnm", rec.pch_mcnm);
			//rx.add(record, "pch_ddjnm", rec.pch_ddjnm);
			//rx.add(record, "adpay_expn_no", rec.adpay_expn_no);
			//rx.add(record, "end_yn", rec.end_yn);
			//rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			//rx.add(record, "draft_doc_no", rec.draft_doc_no);
			//rx.add(record, "draft_expn_amt", rec.draft_expn_amt);
			//rx.add(record, "draft_doc_dept_cd", rec.draft_doc_dept_cd);
			rx.add(record, "cost_clsf", StringUtil.replaceToXml(rec.cost_clsf));
			rx.add(record, "clam_amt", StringUtil.replaceToXml(rec.clam_amt));
			rx.add(record, "clam_dept_cd", StringUtil.replaceToXml(rec.clam_dept_cd));
			rx.add(record, "chrg_emp_no", StringUtil.replaceToXml(rec.chrg_emp_no));
			rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			rx.add(record, "pch_buseonm", StringUtil.replaceToXml(rec.pch_buseonm));
			rx.add(record, "pch_mcnm", StringUtil.replaceToXml(rec.pch_mcnm));
			rx.add(record, "pch_ddjnm", StringUtil.replaceToXml(rec.pch_ddjnm));
			rx.add(record, "adpay_expn_no", StringUtil.replaceToXml(rec.adpay_expn_no));
			rx.add(record, "end_yn", StringUtil.replaceToXml(rec.end_yn));
			rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
			rx.add(record, "draft_doc_no", StringUtil.replaceToXml(rec.draft_doc_no));
			rx.add(record, "draft_expn_amt", StringUtil.replaceToXml(rec.draft_expn_amt));
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
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2021_l>
	<dataSet>
		<CURLIST>
			<record>
				<cost_clsf/>
				<clam_amt/>
				<clam_dept_cd/>
				<chrg_emp_no/>
				<titl/>
				<budg_cd/>
				<budg_yymm/>
				<medi_cd/>
				<fisc_dt/>
				<pch_buseonm/>
				<pch_mcnm/>
				<pch_ddjnm/>
				<adpay_expn_no/>
				<end_yn/>
				<dtls_medi_cd/>
				<draft_doc_no/>
				<draft_expn_amt/>
				<draft_doc_dept_cd/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2021_l>
*/
%>

<% /* 작성시간 : Thu Jul 09 16:56:00 KST 2009 */ %>