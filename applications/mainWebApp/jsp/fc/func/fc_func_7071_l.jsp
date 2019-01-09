<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_7071_LDataSet ds = (FC_FUNC_7071_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_7071_LCURLISTRecord rec = (FC_FUNC_7071_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "checked", rec.checked);
			rx.add(record, "fund_mang_no", rec.fund_mang_no);
			rx.add(record, "loan_no", rec.loan_no);
			rx.add(record, "loan_nm", rec.loan_nm);
			rx.add(record, "loan_amt", rec.loan_amt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "int_clsf_cd", rec.int_clsf_cd);
			rx.add(record, "loan_rmks", rec.loan_rmks);
			rx.add(record, "loan_slip_occr_dt", rec.loan_slip_occr_dt);
			rx.add(record, "loan_slip_clsf_cd", rec.loan_slip_clsf_cd);
			rx.add(record, "loan_slip_seq", rec.loan_slip_seq);
			rx.add(record, "loan_repay_clsf_cd", rec.loan_repay_clsf_cd);
			rx.add(record, "dlco_clsf_nm", rec.dlco_clsf_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "int_clsf_nm", rec.int_clsf_nm);
			rx.add(record, "loan_repay_clsf_nm", rec.loan_repay_clsf_nm);
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "prelae_pay_clsfnm", rec.prelae_pay_clsfnm);
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "rcpay_amt_stot", rec.rcpay_amt_stot);
			rx.add(record, "rest_amt", rec.rest_amt);
			rx.add(record, "repay_dt", rec.repay_dt);
			rx.add(record, "repay_amt", rec.repay_amt);
			rx.add(record, "repay_rmks", rec.repay_rmks);
			rx.add(record, "repay_slip_occr_dt", rec.repay_slip_occr_dt);
			rx.add(record, "repay_slip_clsf_cd", rec.repay_slip_clsf_cd);
			rx.add(record, "repay_slip_seq", rec.repay_slip_seq);
			rx.add(record, "nomach_adpay_bal", rec.nomach_adpay_bal);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "checked", StringUtil.replaceToXml(rec.checked));
			//rx.add(record, "fund_mang_no", StringUtil.replaceToXml(rec.fund_mang_no));
			//rx.add(record, "loan_no", StringUtil.replaceToXml(rec.loan_no));
			//rx.add(record, "loan_nm", StringUtil.replaceToXml(rec.loan_nm));
			//rx.add(record, "loan_amt", StringUtil.replaceToXml(rec.loan_amt));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "int_clsf_cd", StringUtil.replaceToXml(rec.int_clsf_cd));
			//rx.add(record, "loan_rmks", StringUtil.replaceToXml(rec.loan_rmks));
			//rx.add(record, "loan_slip_occr_dt", StringUtil.replaceToXml(rec.loan_slip_occr_dt));
			//rx.add(record, "loan_slip_clsf_cd", StringUtil.replaceToXml(rec.loan_slip_clsf_cd));
			//rx.add(record, "loan_slip_seq", StringUtil.replaceToXml(rec.loan_slip_seq));
			//rx.add(record, "loan_repay_clsf_cd", StringUtil.replaceToXml(rec.loan_repay_clsf_cd));
			//rx.add(record, "dlco_clsf_nm", StringUtil.replaceToXml(rec.dlco_clsf_nm));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "int_clsf_nm", StringUtil.replaceToXml(rec.int_clsf_nm));
			//rx.add(record, "loan_repay_clsf_nm", StringUtil.replaceToXml(rec.loan_repay_clsf_nm));
			//rx.add(record, "prelae_pay_clsf_cd", StringUtil.replaceToXml(rec.prelae_pay_clsf_cd));
			//rx.add(record, "prelae_pay_clsfnm", StringUtil.replaceToXml(rec.prelae_pay_clsfnm));
			//rx.add(record, "cost_gain_stot", StringUtil.replaceToXml(rec.cost_gain_stot));
			//rx.add(record, "rcpay_amt_stot", StringUtil.replaceToXml(rec.rcpay_amt_stot));
			//rx.add(record, "rest_amt", StringUtil.replaceToXml(rec.rest_amt));
			//rx.add(record, "repay_dt", StringUtil.replaceToXml(rec.repay_dt));
			//rx.add(record, "repay_amt", StringUtil.replaceToXml(rec.repay_amt));
			//rx.add(record, "repay_rmks", StringUtil.replaceToXml(rec.repay_rmks));
			//rx.add(record, "repay_slip_occr_dt", StringUtil.replaceToXml(rec.repay_slip_occr_dt));
			//rx.add(record, "repay_slip_clsf_cd", StringUtil.replaceToXml(rec.repay_slip_clsf_cd));
			//rx.add(record, "repay_slip_seq", StringUtil.replaceToXml(rec.repay_slip_seq));
			//rx.add(record, "nomach_adpay_bal", StringUtil.replaceToXml(rec.nomach_adpay_bal));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
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
<fc_func_7071_l>
	<dataSet>
		<CURLIST>
			<record>
				<checked/>
				<fund_mang_no/>
				<loan_no/>
				<loan_nm/>
				<loan_amt/>
				<comp_dt/>
				<mtry_dt/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<int_clsf_cd/>
				<loan_rmks/>
				<loan_slip_occr_dt/>
				<loan_slip_clsf_cd/>
				<loan_slip_seq/>
				<loan_repay_clsf_cd/>
				<dlco_clsf_nm/>
				<dlco_nm/>
				<int_clsf_nm/>
				<loan_repay_clsf_nm/>
				<prelae_pay_clsf_cd/>
				<prelae_pay_clsfnm/>
				<cost_gain_stot/>
				<rcpay_amt_stot/>
				<rest_amt/>
				<repay_dt/>
				<repay_amt/>
				<repay_rmks/>
				<repay_slip_occr_dt/>
				<repay_slip_clsf_cd/>
				<repay_slip_seq/>
				<nomach_adpay_bal/>
				<cmpy_cd/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_7071_l>
*/
%>

<% /* 작성시간 : Wed Apr 08 19:04:26 KST 2009 */ %>