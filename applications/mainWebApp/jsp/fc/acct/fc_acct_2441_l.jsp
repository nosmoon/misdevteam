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
	FC_ACCT_2441_LDataSet ds = (FC_ACCT_2441_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2441_LCURLISTRecord rec = (FC_ACCT_2441_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "rmks1a", rec.rmks1a);
			//rx.add(record, "fisc_dta", rec.fisc_dta);
			//rx.add(record, "occr_amt", rec.occr_amt);
			//rx.add(record, "actu_adpay_bal", rec.actu_adpay_bal);
			//rx.add(record, "fisc_dtb", rec.fisc_dtb);
			//rx.add(record, "rmks1b", rec.rmks1b);
			//rx.add(record, "amt", rec.amt);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "slip_clsf", rec.slip_clsf);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "sub_seq", rec.sub_seq);
			//rx.add(record, "arow_no", rec.arow_no);
			//rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "rmks1a", StringUtil.replaceToXml(rec.rmks1a));
			rx.add(record, "fisc_dta", StringUtil.replaceToXml(rec.fisc_dta));
			rx.add(record, "occr_amt", StringUtil.replaceToXml(rec.occr_amt));
			rx.add(record, "actu_adpay_bal", StringUtil.replaceToXml(rec.actu_adpay_bal));
			rx.add(record, "fisc_dtb", StringUtil.replaceToXml(rec.fisc_dtb));
			rx.add(record, "rmks1b", StringUtil.replaceToXml(rec.rmks1b));
			rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "slip_clsf", StringUtil.replaceToXml(rec.slip_clsf));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "sub_seq", StringUtil.replaceToXml(rec.sub_seq));
			rx.add(record, "arow_no", StringUtil.replaceToXml(rec.arow_no));
			rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
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
<fc_acct_2441_l>
	<dataSet>
		<CURLIST>
			<record>
				<rmks1a/>
				<fisc_dta/>
				<occr_amt/>
				<actu_adpay_bal/>
				<fisc_dtb/>
				<rmks1b/>
				<amt/>
				<occr_dt/>
				<slip_clsf/>
				<seq/>
				<sub_seq/>
				<arow_no/>
				<slip_no/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2441_l>
*/
%>

<% /* 작성시간 : Wed Jul 15 14:58:26 KST 2009 */ %>