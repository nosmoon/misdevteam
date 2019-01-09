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
	HD_SALY_1410_LDataSet ds = (HD_SALY_1410_LDataSet)request.getAttribute("ds");
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
			HD_SALY_1410_LCURLISTRecord rec = (HD_SALY_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_cnt", rec.emp_cnt);
			rx.add(record, "mm_pay_amt", rec.mm_pay_amt);
			rx.add(record, "base_saly", rec.base_saly);
			rx.add(record, "posk_saly", rec.posk_saly);
			rx.add(record, "rgla_saly", rec.rgla_saly);
			rx.add(record, "week_hody_base_alon", rec.week_hody_base_alon);
			rx.add(record, "week_hody_cmpn_alon", rec.week_hody_cmpn_alon);
			rx.add(record, "lgl_hody_base_alon", rec.lgl_hody_base_alon);
			rx.add(record, "lgl_hody_cmpn_alon", rec.lgl_hody_cmpn_alon);
			rx.add(record, "nissu_dd_alon", rec.nissu_dd_alon);
			rx.add(record, "nissu_dd_base_alon", rec.nissu_dd_base_alon);
			rx.add(record, "vgl_fee", rec.vgl_fee);
			rx.add(record, "erl_prsnt_alon", rec.erl_prsnt_alon);
			rx.add(record, "prvmm_mstk_alon", rec.prvmm_mstk_alon);
			rx.add(record, "etc_duty_alon", rec.etc_duty_alon);
			rx.add(record, "non_regu_alon_stot", rec.non_regu_alon_stot);
			rx.add(record, "prvmm_mstk_saly", rec.prvmm_mstk_saly);
			rx.add(record, "retr_saly", rec.retr_saly);
			rx.add(record, "corr_base_stay_fee", rec.corr_base_stay_fee);
			rx.add(record, "tot_pay_amt", rec.tot_pay_amt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_cnt", StringUtil.replaceToXml(rec.emp_cnt));
			//rx.add(record, "mm_pay_amt", StringUtil.replaceToXml(rec.mm_pay_amt));
			//rx.add(record, "base_saly", StringUtil.replaceToXml(rec.base_saly));
			//rx.add(record, "posk_saly", StringUtil.replaceToXml(rec.posk_saly));
			//rx.add(record, "rgla_saly", StringUtil.replaceToXml(rec.rgla_saly));
			//rx.add(record, "week_hody_base_alon", StringUtil.replaceToXml(rec.week_hody_base_alon));
			//rx.add(record, "week_hody_cmpn_alon", StringUtil.replaceToXml(rec.week_hody_cmpn_alon));
			//rx.add(record, "lgl_hody_base_alon", StringUtil.replaceToXml(rec.lgl_hody_base_alon));
			//rx.add(record, "lgl_hody_cmpn_alon", StringUtil.replaceToXml(rec.lgl_hody_cmpn_alon));
			//rx.add(record, "nissu_dd_alon", StringUtil.replaceToXml(rec.nissu_dd_alon));
			//rx.add(record, "vgl_fee", StringUtil.replaceToXml(rec.vgl_fee));
			//rx.add(record, "erl_prsnt_alon", StringUtil.replaceToXml(rec.erl_prsnt_alon));
			//rx.add(record, "prvmm_mstk_alon", StringUtil.replaceToXml(rec.prvmm_mstk_alon));
			//rx.add(record, "etc_duty_alon", StringUtil.replaceToXml(rec.etc_duty_alon));
			//rx.add(record, "non_regu_alon_stot", StringUtil.replaceToXml(rec.non_regu_alon_stot));
			//rx.add(record, "prvmm_mstk_saly", StringUtil.replaceToXml(rec.prvmm_mstk_saly));
			//rx.add(record, "retr_saly", StringUtil.replaceToXml(rec.retr_saly));
			//rx.add(record, "corr_base_stay_fee", StringUtil.replaceToXml(rec.corr_base_stay_fee));
			//rx.add(record, "tot_pay_amt", StringUtil.replaceToXml(rec.tot_pay_amt));
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
<hd_saly_1410_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_cnt/>
				<mm_pay_amt/>
				<base_saly/>
				<posk_saly/>
				<rgla_saly/>
				<week_hody_base_alon/>
				<week_hody_cmpn_alon/>
				<lgl_hody_base_alon/>
				<lgl_hody_cmpn_alon/>
				<nissu_dd_alon/>
				<vgl_fee/>
				<erl_prsnt_alon/>
				<prvmm_mstk_alon/>
				<etc_duty_alon/>
				<non_regu_alon_stot/>
				<prvmm_mstk_saly/>
				<retr_saly/>
				<corr_base_stay_fee/>
				<tot_pay_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_1410_l>
*/
%>

<% /* 작성시간 : Fri May 01 10:23:15 KST 2009 */ %>