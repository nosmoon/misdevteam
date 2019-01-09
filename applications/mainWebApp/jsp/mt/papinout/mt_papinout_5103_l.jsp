<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_5103_LDataSet ds = (MT_PAPINOUT_5103_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_5103_LCURLISTRecord rec = (MT_PAPINOUT_5103_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "cnsm_frdt", rec.cnsm_frdt);
			rx.add(record, "cnsm_todt", rec.cnsm_todt);
			rx.add(record, "tax_stmt_dt", rec.tax_stmt_dt);
			if(rec.tax_stmt_seq.equals("")) {
				rx.add(record, "tax_stmt_seq", "");
			} else {
				rx.add(record, "tax_stmt_seq", rec.tax_stmt_seq);
				rx.add(record, "tax_stmt_seq1", rec.tax_stmt_seq.substring(0,2) + "-" + rec.tax_stmt_seq.substring(2,10) + "-" + rec.tax_stmt_seq.substring(10));
			}
			rx.add(record, "slip_proc_occr_dt", rec.slip_proc_occr_dt);
			if(rec.slip_occr_dt.equals("")) {
				rx.add(record, "slip_proc_seq", "");
			} else {
				rx.add(record, "slip_proc_seq", rec.slip_occr_dt + "-" + rec.slip_clsf_cd + "-" + rec.slip_seq);
			}
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "rcpm_nm", rec.rcpm_nm);
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
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<dlco_cd/>
			<ern/>
			<dlco_nm/>
			<rcpm_dt/>
			<cnsm_frdt/>
			<cnsm_todt/>
			<tax_stmt_dt/>
			<tax_stmt_seq/>
			<slip_proc_occr_dt/>
			<slip_proc_seq/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 13 10:36:36 KST 2009 */ %>