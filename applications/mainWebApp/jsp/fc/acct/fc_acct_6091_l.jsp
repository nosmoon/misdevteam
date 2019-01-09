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
	FC_ACCT_6091_LDataSet ds = (FC_ACCT_6091_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_6091_LCURLISTRecord rec = (FC_ACCT_6091_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "prof_type_cd", rec.prof_type_cd);
			rx.add(record, "taxstmt_no", rec.taxstmt_no);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "ern", rec.ern);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "erplace_cd", rec.erplace_cd);
			rx.add(record, "make_dt", rec.make_dt);
			rx.addCData(record, "vexc_cmpy_cd", rec.vexc_cmpy_cd);
			rx.add(record, "suply_total", rec.suply_total);
			rx.add(record, "vat_total", rec.vat_total);
			rx.addCData(record, "elec_tax_comp_nm", rec.elec_tax_comp_nm);
			//rx.add(record, "prof_type_cd", StringUtil.replaceToXml(rec.prof_type_cd));
			//rx.add(record, "taxstmt_no", StringUtil.replaceToXml(rec.taxstmt_no));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			//rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "erplace_cd", StringUtil.replaceToXml(rec.erplace_cd));
			//rx.add(record, "make_dt", StringUtil.replaceToXml(rec.make_dt));
			//rx.add(record, "vexc_cmpy_cd", StringUtil.replaceToXml(rec.vexc_cmpy_cd));
			//rx.add(record, "suply_total", StringUtil.replaceToXml(rec.suply_total));
			//rx.add(record, "vat_total", StringUtil.replaceToXml(rec.vat_total));
			//rx.add(record, "elec_tax_comp_nm", StringUtil.replaceToXml(rec.elec_tax_comp_nm));
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
<fc_acct_6091_l>
	<dataSet>
		<CURLIST>
			<record>
				<prof_type_cd/>
				<taxstmt_no/>
				<dlco_cd/>
				<ern/>
				<dlco_nm/>
				<suply_amt/>
				<vat_amt/>
				<budg_cd/>
				<fisc_dt/>
				<slip_no/>
				<erplace_cd/>
				<make_dt/>
				<vexc_cmpy_cd/>
				<suply_total/>
				<vat_total/>
				<elec_tax_comp_nm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_6091_l>
*/
%>

<% /* 작성시간 : Thu Mar 10 11:57:00 KST 2011 */ %>