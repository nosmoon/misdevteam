<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_2013_1231_LDataSet ds = (HD_YADJM_2013_1231_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_2013_1231_LCURLISTRecord rec = (HD_YADJM_2013_1231_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "account_no", rec.account_no);
			rx.add(record, "payment", rec.payment);
			rx.add(record, "deduct_amt", rec.deduct_amt);
			rx.add(record, "adjm_rvrs_yy", rec.adjm_rvrs_yy);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "stok_savg_type", rec.stok_savg_type);
			//rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
			//rx.add(record, "account_no", StringUtil.replaceToXml(rec.account_no));
			//rx.add(record, "payment", StringUtil.replaceToXml(rec.payment));
			//rx.add(record, "deduct_amt", StringUtil.replaceToXml(rec.deduct_amt));
			//rx.add(record, "adjm_rvrs_yy", StringUtil.replaceToXml(rec.adjm_rvrs_yy));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "stok_savg_type", StringUtil.replaceToXml(rec.stok_savg_type));
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
<hd_yadJM_2013_1231_l>
	<dataSet>
		<CURLIST>
			<record>
				<bank_cd/>
				<account_no/>
				<payment/>
				<deduct_amt/>
				<adjm_rvrs_yy/>
				<emp_no/>
				<occr_dt/>
				<seq/>
				<stok_savg_type/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadJM_2013_1231_l>
*/
%>

<% /* 작성시간 : Fri Jan 11 15:24:32 KST 2013 */ %>