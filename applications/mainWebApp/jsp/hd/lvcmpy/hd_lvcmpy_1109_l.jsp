<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_1109_LDataSet ds = (HD_LVCMPY_1109_LDataSet)request.getAttribute("ds");
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
			HD_LVCMPY_1109_LCURLIST2Record rec = (HD_LVCMPY_1109_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "lvcmpy_clsf", rec.lvcmpy_clsf);
			rx.add(record, "saly_pay_mm", rec.saly_pay_mm);
			rx.add(record, "saly_fr_dt", rec.saly_fr_dt);
			rx.add(record, "saly_to_dt", rec.saly_to_dt);
			rx.add(record, "saly_cnt", rec.saly_cnt);
			rx.add(record, "pay_saly1", rec.pay_saly1);
			rx.add(record, "pay_saly2", rec.pay_saly2);
			rx.add(record, "hody_alon1", rec.hody_alon1);
			rx.add(record, "hody_alon2", rec.hody_alon2);
			rx.add(record, "yymm_alon1", rec.yymm_alon1);
			rx.add(record, "yymm_alon2", rec.yymm_alon2);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "lvcmpy_clsf", StringUtil.replaceToXml(rec.lvcmpy_clsf));
			//rx.add(record, "saly_pay_mm", StringUtil.replaceToXml(rec.saly_pay_mm));
			//rx.add(record, "saly_fr_dt", StringUtil.replaceToXml(rec.saly_fr_dt));
			//rx.add(record, "saly_to_dt", StringUtil.replaceToXml(rec.saly_to_dt));
			//rx.add(record, "saly_cnt", StringUtil.replaceToXml(rec.saly_cnt));
			//rx.add(record, "pay_saly1", StringUtil.replaceToXml(rec.pay_saly1));
			//rx.add(record, "pay_saly2", StringUtil.replaceToXml(rec.pay_saly2));
			//rx.add(record, "hody_alon1", StringUtil.replaceToXml(rec.hody_alon1));
			//rx.add(record, "hody_alon2", StringUtil.replaceToXml(rec.hody_alon2));
			//rx.add(record, "yymm_alon1", StringUtil.replaceToXml(rec.yymm_alon1));
			//rx.add(record, "yymm_alon2", StringUtil.replaceToXml(rec.yymm_alon2));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_LVCMPY_1109_LCURLISTRecord rec = (HD_LVCMPY_1109_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "rvrs_prd_frdt", rec.rvrs_prd_frdt);
			rx.add(record, "rvrs_prd_todt", rec.rvrs_prd_todt);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "last_midl_adjm_dt", rec.last_midl_adjm_dt);
			rx.add(record, "real_lvcmpy_dt", rec.real_lvcmpy_dt);
			rx.add(record, "cont_svc_yys", rec.cont_svc_yys);
			rx.add(record, "cont_svc_yy", rec.cont_svc_yy);
			rx.add(record, "cont_svc_dd", rec.cont_svc_dd);
			rx.add(record, "last_mm_saly_1", rec.last_mm_saly_1);
			rx.add(record, "last_mm_saly_2", rec.last_mm_saly_2);
			rx.add(record, "last_mm_saly_3", rec.last_mm_saly_3);
			rx.add(record, "last_mm_saly_4", rec.last_mm_saly_4);
			rx.add(record, "last_mm_saly_add", rec.last_mm_saly_add);
			rx.add(record, "last_mm_alon_1", rec.last_mm_alon_1);
			rx.add(record, "last_mm_alon_2", rec.last_mm_alon_2);
			rx.add(record, "last_mm_alon_3", rec.last_mm_alon_3);
			rx.add(record, "last_mm_alon_4", rec.last_mm_alon_4);
			rx.add(record, "last_mm_alon_add", rec.last_mm_alon_add);
			rx.add(record, "year_alon_pay_yymm", rec.year_alon_pay_yymm);
			rx.add(record, "year_alon_pay_amt", rec.year_alon_pay_amt);
			rx.add(record, "mm_avg_charg_amt", rec.mm_avg_charg_amt);
			rx.add(record, "lvcmpy_amt", rec.lvcmpy_amt);
			rx.add(record, "lvcmpy_mm_saly", rec.lvcmpy_mm_saly);
			rx.add(record, "yymm_alon_1", rec.yymm_alon_1);
			rx.add(record, "year_cnt_1", rec.year_cnt_1);
			rx.add(record, "duty_cnt_1", rec.duty_cnt_1);
			rx.add(record, "em_cnt_1", rec.em_cnt_1);
			rx.add(record, "yy_alon_use_stot_1", rec.yy_alon_use_stot_1);
			rx.add(record, "yy_alon_2", rec.yy_alon_2);
			rx.add(record, "year_cnt_2", rec.year_cnt_2);
			rx.add(record, "duty_cnt_2", rec.duty_cnt_2);
			rx.add(record, "em_cnt_2", rec.em_cnt_2);
			rx.add(record, "yy_alon_use_stot_2", rec.yy_alon_use_stot_2);
			rx.add(record, "un_pay_alon", rec.un_pay_alon);
			rx.add(record, "lvcmpy_add_amt", rec.lvcmpy_add_amt);
			rx.add(record, "nm_lvcmpy_add_amt", rec.nm_lvcmpy_add_amt);
			rx.add(record, "cont_svc_yys_2012", rec.cont_svc_yys_2012);
			rx.add(record, "cont_svc_yys_2013", rec.cont_svc_yys_2013);
			rx.add(record, "avg_wag_dt", rec.avg_wag_dt);
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
			//rx.add(record, "rvrs_prd_frdt", StringUtil.replaceToXml(rec.rvrs_prd_frdt));
			//rx.add(record, "rvrs_prd_todt", StringUtil.replaceToXml(rec.rvrs_prd_todt));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "last_midl_adjm_dt", StringUtil.replaceToXml(rec.last_midl_adjm_dt));
			//rx.add(record, "real_lvcmpy_dt", StringUtil.replaceToXml(rec.real_lvcmpy_dt));
			//rx.add(record, "cont_svc_yys", StringUtil.replaceToXml(rec.cont_svc_yys));
			//rx.add(record, "cont_svc_yy", StringUtil.replaceToXml(rec.cont_svc_yy));
			//rx.add(record, "cont_svc_dd", StringUtil.replaceToXml(rec.cont_svc_dd));
			//rx.add(record, "last_mm_saly_1", StringUtil.replaceToXml(rec.last_mm_saly_1));
			//rx.add(record, "last_mm_saly_2", StringUtil.replaceToXml(rec.last_mm_saly_2));
			//rx.add(record, "last_mm_saly_3", StringUtil.replaceToXml(rec.last_mm_saly_3));
			//rx.add(record, "last_mm_saly_4", StringUtil.replaceToXml(rec.last_mm_saly_4));
			//rx.add(record, "last_mm_saly_add", StringUtil.replaceToXml(rec.last_mm_saly_add));
			//rx.add(record, "last_mm_alon_1", StringUtil.replaceToXml(rec.last_mm_alon_1));
			//rx.add(record, "last_mm_alon_2", StringUtil.replaceToXml(rec.last_mm_alon_2));
			//rx.add(record, "last_mm_alon_3", StringUtil.replaceToXml(rec.last_mm_alon_3));
			//rx.add(record, "last_mm_alon_4", StringUtil.replaceToXml(rec.last_mm_alon_4));
			//rx.add(record, "last_mm_alon_add", StringUtil.replaceToXml(rec.last_mm_alon_add));
			//rx.add(record, "year_alon_pay_yymm", StringUtil.replaceToXml(rec.year_alon_pay_yymm));
			//rx.add(record, "year_alon_pay_amt", StringUtil.replaceToXml(rec.year_alon_pay_amt));
			//rx.add(record, "mm_avg_charg_amt", StringUtil.replaceToXml(rec.mm_avg_charg_amt));
			//rx.add(record, "lvcmpy_amt", StringUtil.replaceToXml(rec.lvcmpy_amt));
			//rx.add(record, "lvcmpy_mm_saly", StringUtil.replaceToXml(rec.lvcmpy_mm_saly));
			//rx.add(record, "yymm_alon_1", StringUtil.replaceToXml(rec.yymm_alon_1));
			//rx.add(record, "year_cnt_1", StringUtil.replaceToXml(rec.year_cnt_1));
			//rx.add(record, "duty_cnt_1", StringUtil.replaceToXml(rec.duty_cnt_1));
			//rx.add(record, "em_cnt_1", StringUtil.replaceToXml(rec.em_cnt_1));
			//rx.add(record, "yy_alon_use_stot_1", StringUtil.replaceToXml(rec.yy_alon_use_stot_1));
			//rx.add(record, "yy_alon_2", StringUtil.replaceToXml(rec.yy_alon_2));
			//rx.add(record, "year_cnt_2", StringUtil.replaceToXml(rec.year_cnt_2));
			//rx.add(record, "duty_cnt_2", StringUtil.replaceToXml(rec.duty_cnt_2));
			//rx.add(record, "em_cnt_2", StringUtil.replaceToXml(rec.em_cnt_2));
			//rx.add(record, "yy_alon_use_stot_2", StringUtil.replaceToXml(rec.yy_alon_use_stot_2));
			//rx.add(record, "un_pay_alon", StringUtil.replaceToXml(rec.un_pay_alon));
			//rx.add(record, "lvcmpy_add_amt", StringUtil.replaceToXml(rec.lvcmpy_add_amt));
			//rx.add(record, "nm_lvcmpy_add_amt", StringUtil.replaceToXml(rec.nm_lvcmpy_add_amt));
			//rx.add(record, "cont_svc_yys_2012", StringUtil.replaceToXml(rec.cont_svc_yys_2012));
			//rx.add(record, "cont_svc_yys_2013", StringUtil.replaceToXml(rec.cont_svc_yys_2013));
			//rx.add(record, "avg_wag_dt", StringUtil.replaceToXml(rec.avg_wag_dt));
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
<hd_lvcmpy_1109_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<lvcmpy_dt/>
				<seq/>
				<lvcmpy_clsf/>
				<saly_pay_mm/>
				<saly_fr_dt/>
				<saly_to_dt/>
				<saly_cnt/>
				<pay_saly1/>
				<pay_saly2/>
				<hody_alon1/>
				<hody_alon2/>
				<yymm_alon1/>
				<yymm_alon2/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_lvcmpy_1109_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_lvcmpy_1109_l>
	<dataSet>
		<CURLIST>
			<record>
				<lvcmpy_dt/>
				<rvrs_prd_frdt/>
				<rvrs_prd_todt/>
				<dept_cd/>
				<dept_nm/>
				<in_cmpy_dt/>
				<last_midl_adjm_dt/>
				<real_lvcmpy_dt/>
				<cont_svc_yys/>
				<cont_svc_yy/>
				<cont_svc_dd/>
				<last_mm_saly_1/>
				<last_mm_saly_2/>
				<last_mm_saly_3/>
				<last_mm_saly_4/>
				<last_mm_saly_add/>
				<last_mm_alon_1/>
				<last_mm_alon_2/>
				<last_mm_alon_3/>
				<last_mm_alon_4/>
				<last_mm_alon_add/>
				<year_alon_pay_yymm/>
				<year_alon_pay_amt/>
				<mm_avg_charg_amt/>
				<lvcmpy_amt/>
				<lvcmpy_mm_saly/>
				<yymm_alon_1/>
				<year_cnt_1/>
				<duty_cnt_1/>
				<em_cnt_1/>
				<yy_alon_use_stot_1/>
				<yy_alon_2/>
				<year_cnt_2/>
				<duty_cnt_2/>
				<em_cnt_2/>
				<yy_alon_use_stot_2/>
				<un_pay_alon/>
				<lvcmpy_add_amt/>
				<nm_lvcmpy_add_amt/>
				<cont_svc_yys_2012/>
				<cont_svc_yys_2013/>
				<avg_wag_dt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_lvcmpy_1109_l>
*/
%>

<% /* 작성시간 : Wed Nov 23 11:10:11 KST 2016 */ %>