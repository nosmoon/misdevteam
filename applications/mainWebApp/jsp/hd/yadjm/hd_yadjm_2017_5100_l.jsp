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
	HD_YADJM_2017_5100_LDataSet ds = (HD_YADJM_2017_5100_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_2017_5100_LCURLISTRecord rec = (HD_YADJM_2017_5100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "adjm_rvrs_yy", rec.adjm_rvrs_yy);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "hous_loan_amt_int_1", rec.hous_loan_amt_int_1);
			rx.add(record, "ltrm_hous_mogg_loan_amt_int_re", rec.ltrm_hous_mogg_loan_amt_int_re);
			rx.add(record, "hous_loan_amt_int", rec.hous_loan_amt_int);
			rx.add(record, "hous_loan_amt_int_2012_1", rec.hous_loan_amt_int_2012_1);
			rx.add(record, "hous_loan_amt_int_2012_2", rec.hous_loan_amt_int_2012_2);
			rx.add(record, "hous_loan_amt_int_2015_15y_fn", rec.hous_loan_amt_int_2015_15y_fn);
			rx.add(record, "hous_loan_amt_int_2015_15y", rec.hous_loan_amt_int_2015_15y);
			rx.add(record, "hous_loan_amt_int_2015_15y_etc", rec.hous_loan_amt_int_2015_15y_etc);
			rx.add(record, "hous_loan_amt_int_2015_10y", rec.hous_loan_amt_int_2015_10y);
			//rx.add(record, "adjm_rvrs_yy", StringUtil.replaceToXml(rec.adjm_rvrs_yy));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "hous_loan_amt_int_1", StringUtil.replaceToXml(rec.hous_loan_amt_int_1));
			//rx.add(record, "ltrm_hous_mogg_loan_amt_int_re", StringUtil.replaceToXml(rec.ltrm_hous_mogg_loan_amt_int_re));
			//rx.add(record, "hous_loan_amt_int", StringUtil.replaceToXml(rec.hous_loan_amt_int));
			//rx.add(record, "hous_loan_amt_int_2012_1", StringUtil.replaceToXml(rec.hous_loan_amt_int_2012_1));
			//rx.add(record, "hous_loan_amt_int_2012_2", StringUtil.replaceToXml(rec.hous_loan_amt_int_2012_2));
			//rx.add(record, "hous_loan_amt_int_2016_15y_fn", StringUtil.replaceToXml(rec.hous_loan_amt_int_2016_15y_fn));
			//rx.add(record, "hous_loan_amt_int_2016_15y", StringUtil.replaceToXml(rec.hous_loan_amt_int_2016_15y));
			//rx.add(record, "hous_loan_amt_int_2016_15y_etc", StringUtil.replaceToXml(rec.hous_loan_amt_int_2016_15y_etc));
			//rx.add(record, "hous_loan_amt_int_2016_10y", StringUtil.replaceToXml(rec.hous_loan_amt_int_2016_10y));
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
<hd_yadjm_2016_5100_l>
	<dataSet>
		<CURLIST>
			<record>
				<adjm_rvrs_yy/>
				<emp_no/>
				<flnm/>
				<hous_loan_amt_int_1/>
				<ltrm_hous_mogg_loan_amt_int_re/>
				<hous_loan_amt_int/>
				<hous_loan_amt_int_2012_1/>
				<hous_loan_amt_int_2012_2/>
				<hous_loan_amt_int_2016_15y_fn/>
				<hous_loan_amt_int_2016_15y/>
				<hous_loan_amt_int_2016_15y_etc/>
				<hous_loan_amt_int_2016_10y/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_2016_5100_l>
*/
%>

<% /* 작성시간 : Thu Dec 24 16:13:34 KST 2015 */ %>