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
	FC_FUNC_8041_LDataSet ds = (FC_FUNC_8041_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_8041_LCURLIST1Record rec = (FC_FUNC_8041_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "leas_nm", rec.leas_nm);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "leas_stat_cd", rec.leas_stat_cd);
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "rcpay_amt_stot", rec.rcpay_amt_stot);
			rx.add(record, "frcr_amt", rec.frcr_amt);
			rx.add(record, "pay_plan_tms", rec.pay_plan_tms);
			rx.add(record, "libo_yn", rec.libo_yn);
			rx.add(record, "pch_amt1", rec.pch_amt1);
			rx.add(record, "pch_amt2", rec.pch_amt2);
			rx.add(record, "pch_count", rec.pch_count);
			rx.add(record, "pch_compgbnm", rec.pch_compgbnm);
			rx.add(record, "pch_compnm", rec.pch_compnm);
			rx.add(record, "pch_stnm", rec.pch_stnm);
			rx.add(record, "shggbnm", rec.shggbnm);
			rx.add(record, "libo_int_rate", rec.libo_int_rate);
			rx.add(record, "dedu_int_rate", rec.dedu_int_rate);
			rx.add(record, "int_calc_cd", rec.int_calc_cd);
			rx.add(record, "frex_cd", rec.frex_cd);
			rx.add(record, "frcr_cd_amt", rec.frcr_cd_amt);
			rx.add(record, "leas_hire_clsf_cd", rec.leas_hire_clsf_cd);
			rx.add(record, "imchagbnm", rec.imchagbnm);
			//rx.add(record, "leas_nm", StringUtil.replaceToXml(rec.leas_nm));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "leas_stat_cd", StringUtil.replaceToXml(rec.leas_stat_cd));
			//rx.add(record, "prelae_pay_clsf_cd", StringUtil.replaceToXml(rec.prelae_pay_clsf_cd));
			//rx.add(record, "cost_gain_stot", StringUtil.replaceToXml(rec.cost_gain_stot));
			//rx.add(record, "rcpay_amt_stot", StringUtil.replaceToXml(rec.rcpay_amt_stot));
			//rx.add(record, "frcr_amt", StringUtil.replaceToXml(rec.frcr_amt));
			//rx.add(record, "pay_plan_tms", StringUtil.replaceToXml(rec.pay_plan_tms));
			//rx.add(record, "libo_yn", StringUtil.replaceToXml(rec.libo_yn));
			//rx.add(record, "pch_amt1", StringUtil.replaceToXml(rec.pch_amt1));
			//rx.add(record, "pch_amt2", StringUtil.replaceToXml(rec.pch_amt2));
			//rx.add(record, "pch_count", StringUtil.replaceToXml(rec.pch_count));
			//rx.add(record, "pch_compgbnm", StringUtil.replaceToXml(rec.pch_compgbnm));
			//rx.add(record, "pch_compnm", StringUtil.replaceToXml(rec.pch_compnm));
			//rx.add(record, "pch_stnm", StringUtil.replaceToXml(rec.pch_stnm));
			//rx.add(record, "shggbnm", StringUtil.replaceToXml(rec.shggbnm));
			//rx.add(record, "libo_int_rate", StringUtil.replaceToXml(rec.libo_int_rate));
			//rx.add(record, "dedu_int_rate", StringUtil.replaceToXml(rec.dedu_int_rate));
			//rx.add(record, "int_calc_cd", StringUtil.replaceToXml(rec.int_calc_cd));
			//rx.add(record, "frex_cd", StringUtil.replaceToXml(rec.frex_cd));
			//rx.add(record, "frcr_cd_amt", StringUtil.replaceToXml(rec.frcr_cd_amt));
			//rx.add(record, "leas_hire_clsf_cd", StringUtil.replaceToXml(rec.leas_hire_clsf_cd));
			//rx.add(record, "imchagbnm", StringUtil.replaceToXml(rec.imchagbnm));
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
<fc_func_8041_l>
	<dataSet>
		<CURLIST1>
			<record>
				<leas_nm/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<leas_stat_cd/>
				<prelae_pay_clsf_cd/>
				<cost_gain_stot/>
				<rcpay_amt_stot/>
				<frcr_amt/>
				<pay_plan_tms/>
				<libo_yn/>
				<pch_amt1/>
				<pch_amt2/>
				<pch_count/>
				<pch_compgbnm/>
				<pch_compnm/>
				<pch_stnm/>
				<shggbnm/>
				<libo_int_rate/>
				<dedu_int_rate/>
				<int_calc_cd/>
				<frex_cd/>
				<frcr_cd_amt/>
				<leas_hire_clsf_cd/>
				<imchagbnm/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_func_8041_l>
*/
%>

<% /* 작성시간 : Thu Apr 09 16:48:11 KST 2009 */ %>