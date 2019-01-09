<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_4103_LDataSet ds = (HD_SALY_4103_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_SALY_4103_LCURLIST1Record rec = (HD_SALY_4103_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "saly_shft_bank_cd", rec.saly_shft_bank_cd);
			rx.add(record, "saly_shft_bank_nm", rec.saly_shft_bank_nm);
			rx.add(record, "saly_shft_acct_no", rec.saly_shft_acct_no);
			rx.add(record, "alon_shft_bank_cd", rec.alon_shft_bank_cd);
			rx.add(record, "alon_shft_bank_nm", rec.alon_shft_bank_nm);
			rx.add(record, "alon_shft_acct_no", rec.alon_shft_acct_no);
			rx.add(record, "encrg_amt_shft_bank_cd", rec.encrg_amt_shft_bank_cd);
			rx.add(record, "encrg_amt_shft_bank_nm", rec.encrg_amt_shft_bank_nm);
			rx.add(record, "encrg_amt_shft_acct_no", rec.encrg_amt_shft_acct_no);
			//rx.add(record, "saly_shft_bank_cd", StringUtil.replaceToXml(rec.saly_shft_bank_cd));
			//rx.add(record, "saly_shft_bank_nm", StringUtil.replaceToXml(rec.saly_shft_bank_nm));
			//rx.add(record, "saly_shft_acct_no", StringUtil.replaceToXml(rec.saly_shft_acct_no));
			//rx.add(record, "alon_shft_bank_cd", StringUtil.replaceToXml(rec.alon_shft_bank_cd));
			//rx.add(record, "alon_shft_bank_nm", StringUtil.replaceToXml(rec.alon_shft_bank_nm));
			//rx.add(record, "alon_shft_acct_no", StringUtil.replaceToXml(rec.alon_shft_acct_no));
			//rx.add(record, "encrg_amt_shft_bank_cd", StringUtil.replaceToXml(rec.encrg_amt_shft_bank_cd));
			//rx.add(record, "encrg_amt_shft_bank_nm", StringUtil.replaceToXml(rec.encrg_amt_shft_bank_nm));
			//rx.add(record, "encrg_amt_shft_acct_no", StringUtil.replaceToXml(rec.encrg_amt_shft_acct_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_4103_LCURLISTRecord rec = (HD_SALY_4103_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "lon_clsf_cd", rec.lon_clsf_cd);
			rx.add(record, "lon_dt", rec.lon_dt);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "bhbhyb", rec.bhbhyb);
			rx.add(record, "bogaamt", rec.bogaamt);
			rx.add(record, "bhnosabeon", rec.bhnosabeon);
			rx.add(record, "add_bogaamt", rec.add_bogaamt);
			rx.add(record, "add_bhnosabeon", rec.add_bhnosabeon);
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
			<emp_no/>
			<lon_clsf_cd/>
			<lon_dt/>
			<flnm/>
			<bhbhyb/>
			<bogaamt/>
			<bhnosabeon/>
			<add_bogaamt/>
			<add_bhnosabeon/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Jul 09 20:51:59 KST 2009 */ %>