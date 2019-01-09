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
	FC_FUNC_7021_LDataSet ds = (FC_FUNC_7021_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_FUNC_7021_LCURLIST2Record rec = (FC_FUNC_7021_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "repay_dt", rec.repay_dt);
			rx.add(record, "repay_amt", rec.repay_amt);
			rx.add(record, "repay_rmks", rec.repay_rmks);
			rx.add(record, "repay_slip_no", rec.repay_slip_no);
			rx.add(record, "nomach_adpay_bal", rec.nomach_adpay_bal);
			//rx.add(record, "repay_dt", StringUtil.replaceToXml(rec.repay_dt));
			//rx.add(record, "repay_amt", StringUtil.replaceToXml(rec.repay_amt));
			//rx.add(record, "repay_rmks", StringUtil.replaceToXml(rec.repay_rmks));
			//rx.add(record, "repay_slip_no", StringUtil.replaceToXml(rec.repay_slip_no));
			//rx.add(record, "nomach_adpay_bal", StringUtil.replaceToXml(rec.nomach_adpay_bal));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_7021_LCURLIST1Record rec = (FC_FUNC_7021_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "loan_nm", rec.loan_nm);
			rx.add(record, "loan_amt", rec.loan_amt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_clsf_nm", rec.dlco_clsf_nm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "int_clsf_cd", rec.int_clsf_cd);
			rx.add(record, "loan_rmks", rec.loan_rmks);
			rx.add(record, "loan_slip_no", rec.loan_slip_no);
			rx.add(record, "loan_repay_clsf_cd", rec.loan_repay_clsf_cd);
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "rcpay_amt_stot", rec.rcpay_amt_stot);
			rx.add(record, "loan_slip_occr_dt", rec.loan_slip_occr_dt);
			rx.add(record, "loan_slip_clsf_cd", rec.loan_slip_clsf_cd);
			rx.add(record, "loan_slip_seq", rec.loan_slip_seq);
			rx.add(record, "loan_repay_clsf_nm", rec.loan_repay_clsf_nm);
			rx.add(record, "prelae_pay_clsf_nm", rec.prelae_pay_clsf_nm);
			rx.add(record, "janaeg", rec.janaeg);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "loan_nm", StringUtil.replaceToXml(rec.loan_nm));
			//rx.add(record, "loan_amt", StringUtil.replaceToXml(rec.loan_amt));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_clsf_nm", StringUtil.replaceToXml(rec.dlco_clsf_nm));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "compnm", StringUtil.replaceToXml(rec.compnm));
			//rx.add(record, "int_clsf_cd", StringUtil.replaceToXml(rec.int_clsf_cd));
			//rx.add(record, "loan_rmks", StringUtil.replaceToXml(rec.loan_rmks));
			//rx.add(record, "loan_slip_no", StringUtil.replaceToXml(rec.loan_slip_no));
			//rx.add(record, "loan_repay_clsf_cd", StringUtil.replaceToXml(rec.loan_repay_clsf_cd));
			//rx.add(record, "prelae_pay_clsf_cd", StringUtil.replaceToXml(rec.prelae_pay_clsf_cd));
			//rx.add(record, "cost_gain_stot", StringUtil.replaceToXml(rec.cost_gain_stot));
			//rx.add(record, "rcpay_amt_stot", StringUtil.replaceToXml(rec.rcpay_amt_stot));
			//rx.add(record, "loan_slip_occr_dt", StringUtil.replaceToXml(rec.loan_slip_occr_dt));
			//rx.add(record, "loan_slip_clsf_cd", StringUtil.replaceToXml(rec.loan_slip_clsf_cd));
			//rx.add(record, "loan_slip_seq", StringUtil.replaceToXml(rec.loan_slip_seq));
			//rx.add(record, "loan_repay_clsf_nm", StringUtil.replaceToXml(rec.loan_repay_clsf_nm));
			//rx.add(record, "prelae_pay_clsf_nm", StringUtil.replaceToXml(rec.prelae_pay_clsf_nm));
			//rx.add(record, "janaeg", StringUtil.replaceToXml(rec.janaeg));
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
<fc_func_7021_l>
	<dataSet>
		<CURLIST2>
			<record>
				<repay_dt/>
				<repay_amt/>
				<repay_rmks/>
				<repay_slip_no/>
				<nomach_adpay_bal/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_func_7021_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_7021_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<loan_nm/>
				<loan_amt/>
				<comp_dt/>
				<mtry_dt/>
				<dlco_clsf_cd/>
				<dlco_clsf_nm/>
				<dlco_cd/>
				<dlco_nm/>
				<compnm/>
				<int_clsf_cd/>
				<loan_rmks/>
				<loan_slip_no/>
				<loan_repay_clsf_cd/>
				<prelae_pay_clsf_cd/>
				<cost_gain_stot/>
				<rcpay_amt_stot/>
				<loan_slip_occr_dt/>
				<loan_slip_clsf_cd/>
				<loan_slip_seq/>
				<loan_repay_clsf_nm/>
				<prelae_pay_clsf_nm/>
				<janaeg/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_func_7021_l>
*/
%>

<% /* 작성시간 : Mon Apr 13 15:59:36 KST 2009 */ %>