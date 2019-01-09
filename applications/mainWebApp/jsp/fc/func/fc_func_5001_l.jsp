<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_5001_LDataSet ds = (FC_FUNC_5001_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_5001_LCURLISTRecord rec = (FC_FUNC_5001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "insr_nm", rec.insr_nm);
			rx.add(record, "insr_amt", rec.insr_amt);
			rx.add(record, "insr_rate", rec.insr_rate);
			rx.add(record, "frex_cd", rec.frex_cd);
			rx.add(record, "exrate", rec.exrate);
			rx.add(record, "frcr_amt", rec.frcr_amt);
			rx.add(record, "won_amt", rec.won_amt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nnm", rec.medi_nnm);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			rx.add(record, "pymt_rmks", rec.pymt_rmks);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "stat_nm", rec.stat_nm);
			rx.add(record, "fisc_aprv_stat", rec.fisc_aprv_stat);
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
			<insr_nm/>
			<insr_amt/>
			<insr_rate/>
			<frex_cd/>
			<exrate/>
			<frcr_amt/>
			<won_amt/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<dlco_nm/>
			<mtry_dt/>
			<medi_cd/>
			<medi_nnm/>
			<dtls_medi_cd/>
			<use_dept_cd/>
			<use_dept_nm/>
			<pymt_rmks/>
			<slip_no/>
			<stat_nm/>
			<fisc_aprv_stat/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 31 17:51:11 KST 2009 */ %>