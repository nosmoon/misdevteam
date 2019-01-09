<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papmeda.rec.*
	,	chosun.ciis.mt.papmeda.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPMEDA_1102_LDataSet ds = (MT_PAPMEDA_1102_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPMEDA_1102_LCURLISTRecord rec = (MT_PAPMEDA_1102_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "hdqt_amt", rec.hdqt_amt);
			rx.add(record, "hdqt_paper_uprc", rec.hdqt_paper_uprc);
			rx.add(record, "cnsm_wgt", rec.cnsm_wgt);
			rx.add(record, "meda_dt", rec.meda_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "tax_stmt_seq", rec.tax_stmt_seq);
			rx.add(record, "slip_proc_occr_dt", rec.slip_proc_occr_dt);
			rx.add(record, "slip_proc_seq", rec.slip_proc_seq);
			rx.add(record, "meda_amt", rec.meda_amt);
			rx.add(record, "meda_vat", rec.meda_vat);
			rx.add(record, "basi_amt", rec.basi_amt);
			rx.add(record, "eps_no", rec.eps_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
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
			<meda_yymm/>
			<fac_clsf/>
			<medi_cd/>
			<papcmpy_cd/>
			<hdqt_amt/>
			<hdqt_paper_uprc/>
			<cnsm_wgt/>
			<meda_dt/>
			<slip_clsf_cd/>
			<tax_stmt_seq/>
			<slip_proc_occr_dt/>
			<slip_proc_seq/>
			<meda_amt/>
			<meda_vat/>
			<eps_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 08 11:13:45 KST 2009 */ %>