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
	FC_ACCT_2354_LDataSet ds = (FC_ACCT_2354_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2354_LCURLISTRecord rec = (FC_ACCT_2354_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			//rx.add(record, "acct_cd", rec.acct_cd);
			//rx.add(record, "acctynm", rec.acctynm);
			//rx.add(record, "incmg_dt", rec.incmg_dt);
			//rx.add(record, "fisc_dt", rec.fisc_dt);
			//rx.add(record, "incmg_emp_no", rec.incmg_emp_no);
			//rx.add(record, "igbhannm", rec.igbhannm);
			//rx.add(record, "slip_aprv_yn", rec.slip_aprv_yn);
			//rx.add(record, "dr_amt", rec.dr_amt);
			//rx.add(record, "crdt_amt", rec.crdt_amt);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "draft_doc_no", rec.draft_doc_no);
			//rx.add(record, "draft_expn_amt", rec.draft_expn_amt);
			//rx.add(record, "draft_impt_amt", rec.draft_impt_amt);
			//rx.add(record, "draft_doc_dept_cd", rec.draft_doc_dept_cd);
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			rx.add(record, "acctynm", StringUtil.replaceToXml(rec.acctynm));
			rx.add(record, "incmg_dt", StringUtil.replaceToXml(rec.incmg_dt));
			rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			rx.add(record, "incmg_emp_no", StringUtil.replaceToXml(rec.incmg_emp_no));
			rx.add(record, "igbhannm", StringUtil.replaceToXml(rec.igbhannm));
			rx.add(record, "slip_aprv_yn", StringUtil.replaceToXml(rec.slip_aprv_yn));
			rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
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
<fc_acct_2354_l>
	<dataSet>
		<CURLIST>
			<record>
				<slip_seq/>
				<slip_sub_seq/>
				<acct_cd/>
				<acctynm/>
				<incmg_dt/>
				<fisc_dt/>
				<incmg_emp_no/>
				<igbhannm/>
				<slip_aprv_yn/>
				<dr_amt/>
				<crdt_amt/>
				<seq/>
				<draft_doc_no/>
				<draft_expn_amt/>
				<draft_impt_amt/>
				<draft_doc_dept_cd/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2354_l>
*/
%>

<% /* �ۼ��ð� : Fri Jul 17 17:10:46 KST 2009 */ %>