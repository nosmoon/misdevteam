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
	FC_ACCT_2301_LDataSet ds = (FC_ACCT_2301_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2301_LCURLISTRecord rec = (FC_ACCT_2301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pay_dt", rec.pay_dt);
			rx.add(record, "type_cd", rec.type_cd);
			rx.add(record, "prof_type_cd", rec.prof_type_cd);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sum_amt", rec.sum_amt);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "pch_mcnm", rec.pch_mcnm);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "occr_slip_occr_dt", rec.occr_slip_occr_dt);
			rx.add(record, "occr_slip_clsf_cd", rec.occr_slip_clsf_cd);
			rx.add(record, "occr_slip_seq", rec.occr_slip_seq);
			//rx.add(record, "pay_dt", StringUtil.replaceToXml(rec.pay_dt));
			//rx.add(record, "type_cd", StringUtil.replaceToXml(rec.type_cd));
			//rx.add(record, "prof_type_cd", StringUtil.replaceToXml(rec.prof_type_cd));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sum_amt", StringUtil.replaceToXml(rec.sum_amt));
			//rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			//rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "pch_mcnm", StringUtil.replaceToXml(rec.pch_mcnm));
			//rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			//rx.add(record, "occr_slip_occr_dt", StringUtil.replaceToXml(rec.occr_slip_occr_dt));
			//rx.add(record, "occr_slip_clsf_cd", StringUtil.replaceToXml(rec.occr_slip_clsf_cd));
			//rx.add(record, "occr_slip_seq", StringUtil.replaceToXml(rec.occr_slip_seq));
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
<fc_acct_2301_l>
	<dataSet>
		<CURLIST>
			<record>
				<pay_dt/>
				<type_cd/>
				<prof_type_cd/>
				<slip_clsf_cd/>
				<slip_occr_dt/>
				<slip_seq/>
				<medi_cd/>
				<sum_amt/>
				<suply_amt/>
				<vat_amt/>
				<mtry_dt/>
				<pch_mcnm/>
				<fisc_dt/>
				<occr_slip_occr_dt/>
				<occr_slip_clsf_cd/>
				<occr_slip_seq/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2301_l>
*/
%>

<% /* 작성시간 : Tue Apr 28 11:29:31 KST 2009 */ %>