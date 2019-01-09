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
	EN_INNEXP_1305_LDataSet ds = (EN_INNEXP_1305_LDataSet)request.getAttribute("ds");
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
			EN_INNEXP_1305_LCURLISTRecord rec = (EN_INNEXP_1305_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "flag", rec.flag);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "clos_stat", rec.clos_stat);
			rx.add(record, "clos_proc_dt", rec.clos_proc_dt);
			rx.add(record, "clos_pers_emp_nm", rec.clos_pers_emp_nm);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "incmg_pers_nm", rec.incmg_pers_nm);
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "chg_pers_nm", rec.chg_pers_nm);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "clos_type", rec.clos_type);
			//rx.add(record, "flag", StringUtil.replaceToXml(rec.flag));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "clos_stat", StringUtil.replaceToXml(rec.clos_stat));
			//rx.add(record, "clos_proc_dt", StringUtil.replaceToXml(rec.clos_proc_dt));
			//rx.add(record, "clos_pers_emp_nm", StringUtil.replaceToXml(rec.clos_pers_emp_nm));
			//rx.add(record, "incmg_dt", StringUtil.replaceToXml(rec.incmg_dt));
			//rx.add(record, "incmg_pers_nm", StringUtil.replaceToXml(rec.incmg_pers_nm));
			//rx.add(record, "chg_dt", StringUtil.replaceToXml(rec.chg_dt));
			//rx.add(record, "chg_pers_nm", StringUtil.replaceToXml(rec.chg_pers_nm));
			//rx.add(record, "clos_yn", StringUtil.replaceToXml(rec.clos_yn));
			//rx.add(record, "clos_type", StringUtil.replaceToXml(rec.clos_type));
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
<en_innexp_1305_l>
	<dataSet>
		<CURLIST>
			<record>
				<flag/>
				<occr_dt/>
				<clos_stat/>
				<clos_proc_dt/>
				<clos_pers_emp_nm/>
				<incmg_dt/>
				<incmg_pers_nm/>
				<chg_dt/>
				<chg_pers_nm/>
				<clos_yn/>
				<clos_type/>
			</record>
		</CURLIST>
	</dataSet>
</en_innexp_1305_l>
*/
%>

<% /* 작성시간 : Mon Sep 20 11:08:22 KST 2010 */ %>