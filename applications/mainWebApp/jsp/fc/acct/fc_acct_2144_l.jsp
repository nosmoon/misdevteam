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
	FC_ACCT_2144_LDataSet ds = (FC_ACCT_2144_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2144_LCURLISTRecord rec = (FC_ACCT_2144_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "tax_slip_no", rec.tax_slip_no);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "gtiysnm", rec.gtiysnm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "rcpm_kind", rec.rcpm_kind);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "coms", rec.coms);
			rx.add(record, "occr_slip_no", rec.occr_slip_no);
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "make_dt", rec.make_dt);
			//rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			//rx.add(record, "tax_slip_no", StringUtil.replaceToXml(rec.tax_slip_no));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "gtiysnm", StringUtil.replaceToXml(rec.gtiysnm));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "rcpm_kind", StringUtil.replaceToXml(rec.rcpm_kind));
			//rx.add(record, "rcpm_amt", StringUtil.replaceToXml(rec.rcpm_amt));
			//rx.add(record, "coms", StringUtil.replaceToXml(rec.coms));
			//rx.add(record, "occr_slip_no", StringUtil.replaceToXml(rec.occr_slip_no));
			//rx.add(record, "rcpm_slip_no", StringUtil.replaceToXml(rec.rcpm_slip_no));
			//rx.add(record, "make_dt", StringUtil.replaceToXml(rec.make_dt));
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
<fc_acct_2144_l>
	<dataSet>
		<CURLIST>
			<record>
				<slip_sub_seq/>
				<tax_slip_no/>
				<budg_cd/>
				<gtiysnm/>
				<dlco_cd/>
				<dlco_nm/>
				<rcpm_kind/>
				<rcpm_amt/>
				<coms/>
				<occr_slip_no/>
				<rcpm_slip_no/>
				<make_dt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2144_l>
*/
%>

<% /* 작성시간 : Fri Apr 03 16:44:00 KST 2009 */ %>