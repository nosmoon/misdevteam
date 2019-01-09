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
	FC_FUNC_6121_LDataSet ds = (FC_FUNC_6121_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_6121_LCURLISTRecord rec = (FC_FUNC_6121_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "rcpay_amt_stot", rec.rcpay_amt_stot);
			rx.add(record, "ijajanamt", rec.ijajanamt);
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "deps_isav_nm", rec.deps_isav_nm);
			rx.add(record, "tot_pymt_amt", rec.tot_pymt_amt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "mm_int", rec.mm_int);
			rx.add(record, "sum_pymt_amt", rec.sum_pymt_amt);
			rx.add(record, "tot_int", rec.tot_int);
			rx.add(record, "deps_isav_stat_cdnm", rec.deps_isav_stat_cdnm);
			rx.add(record, "hy_cctr_dt", rec.hy_cctr_dt);
			rx.add(record, "hy_impt_amt", rec.hy_impt_amt);
			rx.add(record, "hy_corp_tax_amt", rec.hy_corp_tax_amt);
			rx.add(record, "hy_patr_budg_cd", rec.hy_patr_budg_cd);
			rx.add(record, "hy_deps_clsf_cd", rec.hy_deps_clsf_cd);
			rx.add(record, "hy_rmks", rec.hy_rmks);
			rx.add(record, "hy_yejpno", rec.hy_yejpno);
			rx.add(record, "hy_tot_int_amt", rec.hy_tot_int_amt);
			rx.add(record, "hy_unrcp_precpt_bal", rec.hy_unrcp_precpt_bal);
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<cost_gain_stot/>
			<rcpay_amt_stot/>
			<ijajanamt/>
			<prelae_pay_clsf_cd/>
			<deps_isav_nm/>
			<tot_pymt_amt/>
			<comp_dt/>
			<mtry_dt/>
			<dlco_clsf_cd/>
			<dlco_nm/>
			<dlco_cd/>
			<compnm/>
			<mm_int/>
			<sum_pymt_amt/>
			<tot_int/>
			<deps_isav_stat_cdnm/>
			<hy_cctr_dt/>
			<hy_impt_amt/>
			<hy_corp_tax_amt/>
			<hy_patr_budg_cd/>
			<hy_deps_clsf_cd/>
			<hy_rmks/>
			<hy_yejpno/>
			<hy_tot_int_amt/>
			<hy_unrcp_precpt_bal/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Wed Mar 11 15:09:24 KST 2009 */ %>