<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.en.innexp.rec.*
	,	chosun.ciis.en.innexp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_INNEXP_1001_LDataSet ds = (EN_INNEXP_1001_LDataSet)request.getAttribute("ds");
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
			EN_INNEXP_1001_LCURLISTRecord rec = (EN_INNEXP_1001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "reven_no", rec.reven_no);
			rx.addCData(record, "evnt_nm", rec.evnt_nm);
			rx.addCData(record, "titl", rec.titl);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "reven_dt", rec.reven_dt);
			rx.add(record, "reven_amt", rec.reven_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "stmt_no", rec.stmt_no);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "chrg_dept_nm", rec.chrg_dept_nm);
			rx.add(record, "incmg_pers_nm", rec.incmg_pers_nm);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "evnt_yy", rec.evnt_yy);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_seq", rec.evnt_seq);
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
			<reven_no/>
			<evnt_nm/>
			<titl/>
			<dlco_nm/>
			<reven_dt/>
			<reven_amt/>
			<vat_amt/>
			<rcpm_amt/>
			<stmt_no/>
			<actu_slip_no/>
			<chrg_pers_nm/>
			<chrg_dept_nm/>
			<incmg_pers_nm/>
			<incmg_dt/>
			<occr_dt/>
			<slip_clsf_cd/>
			<occr_seq/>
			<evnt_yy/>
			<evnt_cd/>
			<evnt_seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue May 19 21:31:31 KST 2009 */ %>