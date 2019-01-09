<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_1502_LDataSet ds = (HD_AFFR_1502_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_AFFR_1502_LCURLIST2Record rec = (HD_AFFR_1502_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "scl_exps_clsf", rec.scl_exps_clsf);
			rx.add(record, "qq", rec.qq);
			rx.add(record, "bgn_mmdd", rec.bgn_mmdd);
			rx.add(record, "end_mmdd", rec.end_mmdd);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_AFFR_1502_LCURLIST1Record rec = (HD_AFFR_1502_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "scl_exps_clsf", rec.scl_exps_clsf);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "fix_rate_clsf", rec.fix_rate_clsf);
			rx.add(record, "pay_ratio_emp", rec.pay_ratio_emp);
			rx.add(record, "pay_ratio_ofcr", rec.pay_ratio_ofcr);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST2>
		<record>
			<occr_dt/>
			<seq/>
			<scl_exps_clsf/>
			<qq/>
			<bgn_mmdd/>
			<end_mmdd/>
			<incmg_pers_ipadd/>
			<incmg_pers/>
			<incmg_dt_tm/>
			<chg_pers/>
			<chg_dt_tm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<occr_dt/>
			<seq/>
			<scl_exps_clsf/>
			<frdt/>
			<todt/>
			<fix_rate_clsf/>
			<pay_ratio_emp/>
			<pay_ratio_ofcr/>
			<pay_amt/>
			<incmg_pers_ipadd/>
			<incmg_pers/>
			<incmg_dt_tm/>
			<chg_pers/>
			<chg_dt_tm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 17 10:18:14 KST 2009 */ %>