<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_5262_LDataSet ds = (HD_INFO_5262_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "Acctchg", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5262_LCURLISTRecord rec = (HD_INFO_5262_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "saly_shft_bank_cd", rec.saly_shft_bank_cd);
			rx.add(record, "saly_shft_bank_nm", rec.saly_shft_bank_nm);
			rx.add(record, "saly_shft_acct_no", rec.saly_shft_acct_no);
			rx.add(record, "alon_shft_bank_cd", rec.alon_shft_bank_cd);
			rx.add(record, "alon_shft_bank_nm", rec.alon_shft_bank_nm);
			rx.add(record, "alon_shft_acct_no", rec.alon_shft_acct_no);
			rx.add(record, "encrg_amt_shft_bank_cd", rec.encrg_amt_shft_bank_cd);
			rx.add(record, "encrg_amt_shft_bank_nm", rec.encrg_amt_shft_bank_nm);
			rx.add(record, "encrg_amt_shft_acct_no", rec.encrg_amt_shft_acct_no);
			rx.add(record, "etc_shft_bank_cd", rec.etc_shft_bank_cd);
			rx.add(record, "etc_shft_bank_nm", rec.etc_shft_bank_nm);
			rx.add(record, "etc_shft_acct_no", rec.etc_shft_acct_no);
			rx.add(record, "etc_amt_shft_acct", rec.etc_amt_shft_acct);			
			rx.add(record, "etc_amt_shft_acct_nm", rec.etc_amt_shft_acct_nm);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "saly_shft_bank_cd", StringUtil.replaceToXml(rec.saly_shft_bank_cd));
			//rx.add(record, "saly_shft_bank_nm", StringUtil.replaceToXml(rec.saly_shft_bank_nm));
			//rx.add(record, "saly_shft_acct_no", StringUtil.replaceToXml(rec.saly_shft_acct_no));
			//rx.add(record, "alon_shft_bank_cd", StringUtil.replaceToXml(rec.alon_shft_bank_cd));
			//rx.add(record, "alon_shft_bank_nm", StringUtil.replaceToXml(rec.alon_shft_bank_nm));
			//rx.add(record, "alon_shft_acct_no", StringUtil.replaceToXml(rec.alon_shft_acct_no));
			//rx.add(record, "encrg_amt_shft_bank_cd", StringUtil.replaceToXml(rec.encrg_amt_shft_bank_cd));
			//rx.add(record, "encrg_amt_shft_bank_nm", StringUtil.replaceToXml(rec.encrg_amt_shft_bank_nm));
			//rx.add(record, "encrg_amt_shft_acct_no", StringUtil.replaceToXml(rec.encrg_amt_shft_acct_no));
			//rx.add(record, "etc_shft_bank_cd", StringUtil.replaceToXml(rec.etc_shft_bank_cd));
			//rx.add(record, "etc_shft_bank_nm", StringUtil.replaceToXml(rec.etc_shft_bank_nm));
			//rx.add(record, "etc_shft_acct_no", StringUtil.replaceToXml(rec.etc_shft_acct_no));
			//rx.add(record, "etc_amt_shft_acct", StringUtil.replaceToXml(rec.etc_amt_shft_acct));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
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
<hd_info_5262_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<occr_dt/>
				<seq/>
				<saly_shft_bank_cd/>
				<saly_shft_bank_nm/>
				<saly_shft_acct_no/>
				<alon_shft_bank_cd/>
				<alon_shft_bank_nm/>
				<alon_shft_acct_no/>
				<encrg_amt_shft_bank_cd/>
				<encrg_amt_shft_bank_nm/>
				<encrg_amt_shft_acct_no/>
				<etc_shft_bank_cd/>
				<etc_shft_bank_nm/>
				<etc_shft_acct_no/>
				<etc_amt_shft_acct/>
				<proc_stat/>
				<proc_stat_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_info_5262_l>
*/
%>

<% /* 작성시간 : Mon Dec 18 10:32:15 KST 2017 */ %>