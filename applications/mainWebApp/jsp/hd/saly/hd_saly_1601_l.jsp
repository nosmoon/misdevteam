<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_1601_LDataSet ds = (HD_SALY_1601_LDataSet)request.getAttribute("ds");
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
			HD_SALY_1601_LCURLIST2Record rec = (HD_SALY_1601_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "saly_yyymm", rec.saly_yyymm);
			rx.add(record, "base_saly", rec.base_saly);
			rx.add(record, "posk_saly", rec.posk_saly);
			rx.add(record, "baseposk_saly", rec.baseposk_saly);
			rx.add(record, "yymm_alon", rec.yymm_alon);
			rx.add(record, "holy_alon", rec.holy_alon);
			rx.add(record, "non_regu_alon_stot", rec.non_regu_alon_stot);
			rx.add(record, "month_saly_sum", rec.month_saly_sum);
			//rx.add(record, "saly_yyymm", StringUtil.replaceToXml(rec.saly_yyymm));
			//rx.add(record, "base_saly", StringUtil.replaceToXml(rec.base_saly));
			//rx.add(record, "posk_saly", StringUtil.replaceToXml(rec.posk_saly));
			//rx.add(record, "baseposk_saly", StringUtil.replaceToXml(rec.baseposk_saly));
			//rx.add(record, "yymm_alon", StringUtil.replaceToXml(rec.yymm_alon));
			//rx.add(record, "holy_alon", StringUtil.replaceToXml(rec.holy_alon));
			//rx.add(record, "non_regu_alon_stot", StringUtil.replaceToXml(rec.non_regu_alon_stot));
			//rx.add(record, "month_saly_sum", StringUtil.replaceToXml(rec.month_saly_sum));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_1601_LCURLISTRecord rec = (HD_SALY_1601_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "saly_yy", rec.saly_yy);
			rx.add(record, "saly_no", rec.saly_no);
			rx.add(record, "pay_saly", rec.pay_saly);
			rx.add(record, "yymm_alon", rec.yymm_alon);
			rx.add(record, "hody_alon", rec.hody_alon);
			rx.add(record, "non_regu_alon_stot", rec.non_regu_alon_stot);
			rx.add(record, "etc_saly_amt1", rec.etc_saly_amt1);
			rx.add(record, "etc_saly_amt", rec.etc_saly_amt);
			rx.add(record, "lvcmpy_alon", rec.lvcmpy_alon);
			rx.add(record, "corr_base_stay_fee", rec.corr_base_stay_fee);
			rx.add(record, "bns", rec.bns);
			rx.add(record, "mm_saly", rec.mm_saly);
			rx.add(record, "non_tax_stot", rec.non_tax_stot);
			rx.add(record, "emp_insr_fee", rec.emp_insr_fee);
			rx.add(record, "np_slf_ctrb_amt", rec.np_slf_ctrb_amt);
			rx.add(record, "hlth_insr_fee", rec.hlth_insr_fee);
			rx.add(record, "hlth_insr_med_care_insr_fee", rec.hlth_insr_med_care_insr_fee);
			rx.add(record, "incm_tax", rec.incm_tax);
			rx.add(record, "res_tax", rec.res_tax);
			//rx.add(record, "saly_yy", StringUtil.replaceToXml(rec.saly_yy));
			//rx.add(record, "saly_no", StringUtil.replaceToXml(rec.saly_no));
			//rx.add(record, "pay_saly", StringUtil.replaceToXml(rec.pay_saly));
			//rx.add(record, "yymm_alon", StringUtil.replaceToXml(rec.yymm_alon));
			//rx.add(record, "hody_alon", StringUtil.replaceToXml(rec.hody_alon));
			//rx.add(record, "non_regu_alon_stot", StringUtil.replaceToXml(rec.non_regu_alon_stot));
			//rx.add(record, "etc_saly_amt1", StringUtil.replaceToXml(rec.etc_saly_amt1));
			//rx.add(record, "etc_saly_amt", StringUtil.replaceToXml(rec.etc_saly_amt));
			//rx.add(record, "lvcmpy_alon", StringUtil.replaceToXml(rec.lvcmpy_alon));
			//rx.add(record, "corr_base_stay_fee", StringUtil.replaceToXml(rec.corr_base_stay_fee));
			//rx.add(record, "bns", StringUtil.replaceToXml(rec.bns));
			//rx.add(record, "mm_saly", StringUtil.replaceToXml(rec.mm_saly));
			//rx.add(record, "non_tax_stot", StringUtil.replaceToXml(rec.non_tax_stot));
			//rx.add(record, "emp_insr_fee", StringUtil.replaceToXml(rec.emp_insr_fee));
			//rx.add(record, "np_slf_ctrb_amt", StringUtil.replaceToXml(rec.np_slf_ctrb_amt));
			//rx.add(record, "hlth_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_fee));
			//rx.add(record, "hlth_insr_med_care_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_med_care_insr_fee));
			//rx.add(record, "incm_tax", StringUtil.replaceToXml(rec.incm_tax));
			//rx.add(record, "res_tax", StringUtil.replaceToXml(rec.res_tax));
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
<hd_saly_1601_l>
	<dataSet>
		<CURLIST2>
			<record>
				<saly_yyymm/>
				<base_saly/>
				<posk_saly/>
				<baseposk_saly/>
				<yymm_alon/>
				<holy_alon/>
				<non_regu_alon_stot/>
				<month_saly_sum/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_saly_1601_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_saly_1601_l>
	<dataSet>
		<CURLIST>
			<record>
				<saly_yy/>
				<saly_no/>
				<pay_saly/>
				<yymm_alon/>
				<hody_alon/>
				<non_regu_alon_stot/>
				<etc_saly_amt1/>
				<etc_saly_amt/>
				<lvcmpy_alon/>
				<corr_base_stay_fee/>
				<bns/>
				<mm_saly/>
				<non_tax_stot/>
				<emp_insr_fee/>
				<np_slf_ctrb_amt/>
				<hlth_insr_fee/>
				<hlth_insr_med_care_insr_fee/>
				<incm_tax/>
				<res_tax/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_1601_l>
*/
%>

<% /* 작성시간 : Mon Nov 30 10:51:59 KST 2009 */ %>