<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.base.rec.*
	,	chosun.ciis.as.base.ds.*;
	"
%>
 
<%
	RwXml rx = new RwXml();
	AS_BASE_1102_LDataSet ds = (AS_BASE_1102_LDataSet)request.getAttribute("ds");
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
			AS_BASE_1102_LCURLISTRecord rec = (AS_BASE_1102_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "bund_cd", rec.bund_cd);
			rx.addCData(record, "bund_nm", rec.bund_nm);
			rx.add(record, "item_cnt", rec.item_cnt);
			rx.add(record, "mang_dt", rec.mang_dt);
			rx.add(record, "usag", rec.usag);
			rx.add(record, "supv_dept_cd", rec.supv_dept_cd);
			rx.add(record, "supv_dept_nm", rec.supv_dept_nm);
			rx.addCData(record, "dlvs_plac", rec.dlvs_plac);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "mony_unit_cd", rec.mony_unit_cd);
			rx.add(record, "mony_unit_nm", rec.mony_unit_nm);
			rx.add(record, "ltrm_adpay_cost", rec.ltrm_adpay_cost);
			rx.add(record, "leas_cmpy", rec.leas_cmpy);
			rx.add(record, "leas_no", rec.leas_no);
			rx.add(record, "leas_frdt", rec.leas_frdt);
			rx.add(record, "leas_todt", rec.leas_todt);
			rx.add(record, "re_leas_frdt", rec.re_leas_frdt);
			rx.add(record, "re_leas_todt", rec.re_leas_todt);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "incmg_pers_nm", rec.incmg_pers_nm);
			rx.add(record, "incmg_dt_tm_1", rec.incmg_dt_tm_1);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
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
			<bund_cd/>
			<bund_nm/>
			<item_cnt/>
			<mang_dt/>
			<usag/>
			<supv_dept_cd/>
			<supv_dept_nm/>
			<dlvs_plac/>
			<tot_amt/>
			<mony_unit_cd/>
			<mony_unit_nm/>
			<ltrm_adpay_cost/>
			<leas_cmpy/>
			<leas_no/>
			<leas_frdt/>
			<leas_todt/>
			<re_leas_frdt/>
			<re_leas_todt/>
			<incmg_pers_ipadd/>
			<incmg_pers/>
			<incmg_dt_tm/>
			<incmg_pers_nm/>
			<incmg_dt_tm_1/>
			<chg_pers/>
			<chg_dt_tm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Feb 24 19:50:16 KST 2009 */ %>