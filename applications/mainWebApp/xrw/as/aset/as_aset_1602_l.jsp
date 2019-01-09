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
	AS_ASET_1602_LDataSet ds = (AS_ASET_1602_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			AS_ASET_1602_LCURLIST2Record rec = (AS_ASET_1602_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "draft_doc_no2", rec.draft_doc_no2);
			rx.add(record, "slip_no", rec.slip_no);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AS_ASET_1602_LCURLIST1Record rec = (AS_ASET_1602_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aset_no", rec.aset_no);
			rx.add(record, "aset_nm", rec.aset_nm);
			rx.add(record, "chg_clsf_nm", rec.chg_clsf_nm);
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "sale_now_acqr_amt", rec.sale_now_acqr_amt);
			rx.add(record, "sale_redm_tot_amt", rec.sale_redm_tot_amt);
			rx.add(record, "sale_un_redm_amt", rec.sale_un_redm_amt);
			rx.add(record, "sale_pfls_amt", rec.sale_pfls_amt);
			rx.add(record, "remk_dtls", rec.remk_dtls);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST2>
		<record>
			<chg_dt/>
			<remk/>
			<draft_doc_no2/>
			<slip_no/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<aset_no/>
			<aset_nm/>
			<chg_clsf_nm/>
			<chg_dt/>
			<occr_dt/>
			<occr_seq/>
			<sub_seq/>
			<dept_cd/>
			<budg_cd/>
			<sale_now_acqr_amt/>
			<sale_redm_tot_amt/>
			<sale_un_redm_amt/>
			<sale_pfls_amt/>
			<remk_dtls/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 26 17:26:35 KST 2009 */ %>