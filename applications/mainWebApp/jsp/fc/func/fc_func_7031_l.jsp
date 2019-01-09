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
	FC_FUNC_7031_LDataSet ds = (FC_FUNC_7031_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			FC_FUNC_7031_LCURLIST3Record rec = (FC_FUNC_7031_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pay_dt", rec.pay_dt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "int_amt", rec.int_amt);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "patr_budg_cd", rec.patr_budg_cd);
			rx.add(record, "deps_clsf_cd", rec.deps_clsf_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "pay_dt", StringUtil.replaceToXml(rec.pay_dt));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "int_amt", StringUtil.replaceToXml(rec.int_amt));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "patr_budg_cd", StringUtil.replaceToXml(rec.patr_budg_cd));
			//rx.add(record, "deps_clsf_cd", StringUtil.replaceToXml(rec.deps_clsf_cd));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_FUNC_7031_LCURLIST2Record rec = (FC_FUNC_7031_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "shggbnm", rec.shggbnm);
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "rcpay_amt_stot", rec.rcpay_amt_stot);
			rx.add(record, "janaeg", rec.janaeg);
			//rx.add(record, "prelae_pay_clsf_cd", StringUtil.replaceToXml(rec.prelae_pay_clsf_cd));
			//rx.add(record, "shggbnm", StringUtil.replaceToXml(rec.shggbnm));
			//rx.add(record, "cost_gain_stot", StringUtil.replaceToXml(rec.cost_gain_stot));
			//rx.add(record, "rcpay_amt_stot", StringUtil.replaceToXml(rec.rcpay_amt_stot));
			//rx.add(record, "janaeg", StringUtil.replaceToXml(rec.janaeg));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_7031_LCURLIST1Record rec = (FC_FUNC_7031_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
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
			rx.add(record, "loan_slip_no", rec.loan_slip_no);
			rx.add(record, "loan_repay_clsf_cd", rec.loan_repay_clsf_cd);
			rx.add(record, "compgbnm", rec.compgbnm);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "intgbnm", rec.intgbnm);
			rx.add(record, "cishgbnm", rec.cishgbnm);
			rx.add(record, "int_rate", rec.int_rate);
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
			//rx.add(record, "loan_slip_no", StringUtil.replaceToXml(rec.loan_slip_no));
			//rx.add(record, "loan_repay_clsf_cd", StringUtil.replaceToXml(rec.loan_repay_clsf_cd));
			//rx.add(record, "compgbnm", StringUtil.replaceToXml(rec.compgbnm));
			//rx.add(record, "compnm", StringUtil.replaceToXml(rec.compnm));
			//rx.add(record, "intgbnm", StringUtil.replaceToXml(rec.intgbnm));
			//rx.add(record, "cishgbnm", StringUtil.replaceToXml(rec.cishgbnm));
			//rx.add(record, "int_rate", StringUtil.replaceToXml(rec.int_rate));
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
<fc_func_7031_l>
	<dataSet>
		<CURLIST3>
			<record>
				<pay_dt/>
				<comp_dt/>
				<mtry_dt/>
				<int_amt/>
				<slip_no/>
				<rmks/>
				<patr_budg_cd/>
				<deps_clsf_cd/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
			</record>
		</CURLIST3>
	</dataSet>
</fc_func_7031_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_7031_l>
	<dataSet>
		<CURLIST2>
			<record>
				<prelae_pay_clsf_cd/>
				<shggbnm/>
				<cost_gain_stot/>
				<rcpay_amt_stot/>
				<janaeg/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_func_7031_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_7031_l>
	<dataSet>
		<CURLIST1>
			<record>
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
				<loan_slip_no/>
				<loan_repay_clsf_cd/>
				<compgbnm/>
				<compnm/>
				<intgbnm/>
				<cishgbnm/>
				<int_rate/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_func_7031_l>
*/
%>

<% /* 작성시간 : Tue Apr 07 14:11:00 KST 2009 */ %>