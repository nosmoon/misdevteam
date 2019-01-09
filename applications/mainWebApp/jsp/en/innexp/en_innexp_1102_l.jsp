<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.en.innexp.rec.*
	,	chosun.ciis.en.innexp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_INNEXP_1102_LDataSet ds = (EN_INNEXP_1102_LDataSet)request.getAttribute("ds");
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
			EN_INNEXP_1102_LCURLISTRecord rec = (EN_INNEXP_1102_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "proc_yn", rec.proc_yn);
			rx.add(record, "occr_no", rec.occr_no);
			rx.add(record, "reven_dt", rec.reven_dt);
			rx.addCData(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "reven_amt", rec.reven_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.addCData(record, "titl", rec.titl);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "bizcond", rec.bizcond);
			rx.add(record, "item", rec.item);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "chrg_pers_emp_no", rec.chrg_pers_emp_no);
			rx.add(record, "chrg_pers_emp_nm", rec.chrg_pers_emp_nm);
			rx.add(record, "stmt_occr_dt", rec.stmt_occr_dt);
			rx.add(record, "stmt_occr_seq", rec.stmt_occr_seq);
			rx.add(record, "email", rec.email);
			//rx.add(record, "proc_yn", StringUtil.replaceToXml(rec.proc_yn));
			//rx.add(record, "occr_no", StringUtil.replaceToXml(rec.occr_no));
			//rx.add(record, "reven_dt", StringUtil.replaceToXml(rec.reven_dt));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			//rx.add(record, "dlco_clsf", StringUtil.replaceToXml(rec.dlco_clsf));
			//rx.add(record, "dlco_no", StringUtil.replaceToXml(rec.dlco_no));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "reven_amt", StringUtil.replaceToXml(rec.reven_amt));
			//rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			//rx.add(record, "tot_amt", StringUtil.replaceToXml(rec.tot_amt));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "occr_seq", StringUtil.replaceToXml(rec.occr_seq));
			//rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			//rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			//rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			//rx.add(record, "presi_nm", StringUtil.replaceToXml(rec.presi_nm));
			//rx.add(record, "bizcond", StringUtil.replaceToXml(rec.bizcond));
			//rx.add(record, "item", StringUtil.replaceToXml(rec.item));
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "chrg_pers_emp_no", StringUtil.replaceToXml(rec.chrg_pers_emp_no));
			//rx.add(record, "chrg_pers_emp_nm", StringUtil.replaceToXml(rec.chrg_pers_emp_nm));
			//rx.add(record, "stmt_occr_dt", StringUtil.replaceToXml(rec.stmt_occr_dt));
			//rx.add(record, "stmt_occr_seq", StringUtil.replaceToXml(rec.stmt_occr_seq));
			//rx.add(record, "email", StringUtil.replaceToXml(rec.email));
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
<en_innexp_1102_l>
	<dataSet>
		<CURLIST>
			<record>
				<proc_yn/>
				<occr_no/>
				<reven_dt/>
				<evnt_nm/>
				<dlco_clsf/>
				<dlco_no/>
				<dlco_nm/>
				<reven_amt/>
				<vat_amt/>
				<tot_amt/>
				<occr_dt/>
				<occr_seq/>
				<titl/>
				<ern/>
				<addr/>
				<presi_nm/>
				<bizcond/>
				<item/>
				<evnt_cd/>
				<chrg_pers_emp_no/>
				<chrg_pers_emp_nm/>
				<stmt_occr_dt/>
				<stmt_occr_seq/>
				<email/>
			</record>
		</CURLIST>
	</dataSet>
</en_innexp_1102_l>
*/
%>

<% /* 작성시간 : Thu Oct 14 10:25:15 KST 2010 */ %>