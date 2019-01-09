<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_6091_LDataSet ds = (FC_FUNC_6091_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_6091_LCURLISTRecord rec = (FC_FUNC_6091_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "rcpay_amt_stot", rec.rcpay_amt_stot);
			rx.add(record, "ijajanamt", rec.ijajanamt);
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "deps_isav_nm", rec.deps_isav_nm);
			rx.add(record, "cntr_amt", rec.cntr_amt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "pymt_mm", rec.pymt_mm);
			rx.add(record, "pymt_amt", rec.pymt_amt);
			rx.add(record, "tot_pymt_amt", rec.tot_pymt_amt);
			rx.add(record, "deps_isav_stat_cd", rec.deps_isav_stat_cd);
			rx.add(record, "cctr_dt", rec.cctr_dt);
			rx.add(record, "impt_amt", rec.impt_amt);
			rx.add(record, "corp_tax_amt", rec.corp_tax_amt);
			rx.add(record, "patr_budg_cd", rec.patr_budg_cd);
			rx.add(record, "deps_clsf_cd", rec.deps_clsf_cd);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "yejpno", rec.yejpno);
			rx.add(record, "tot_int_amt", rec.tot_int_amt);
			rx.add(record, "unrcp_precpt_bal", rec.unrcp_precpt_bal);
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
			<cost_gain_stot/>
			<rcpay_amt_stot/>
			<ijajanamt/>
			<prelae_pay_clsf_cd/>
			<deps_isav_nm/>
			<cntr_amt/>
			<comp_dt/>
			<mtry_dt/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<dlco_nm/>
			<compnm/>
			<pymt_mm/>
			<pymt_amt/>
			<tot_pymt_amt/>
			<deps_isav_stat_cd/>
			<cctr_dt/>
			<impt_amt/>
			<corp_tax_amt/>
			<patr_budg_cd/>
			<deps_clsf_cd/>
			<rmks/>
			<yejpno/>
			<tot_int_amt/>
			<unrcp_precpt_bal/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 09 14:11:51 KST 2009 */ %>