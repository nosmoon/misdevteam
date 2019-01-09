<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.appmt.rec.*
	,	chosun.ciis.hd.appmt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_APPMT_1100_LDataSet ds = (HD_APPMT_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_APPMT_1100_LCURLISTRecord rec = (HD_APPMT_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "row_num", rec.row_num);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "addm_dept_cd", rec.addm_dept_cd);
			rx.add(record, "addm_dept_nm", rec.addm_dept_nm);
			rx.add(record, "appmt_cd", rec.appmt_cd);
			rx.add(record, "appmt_nm", rec.appmt_nm);
			rx.add(record, "appmt_resn_cd", rec.appmt_resn_cd);
			rx.add(record, "appmt_resn_nm", rec.appmt_resn_nm);
			rx.add(record, "appmt_dt", rec.appmt_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "emp_clsf_cd", rec.emp_clsf_cd);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "emp_dtls_clsf", rec.emp_dtls_clsf);
			rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
			rx.add(record, "base_saly", rec.base_saly);
			rx.add(record, "posk_saly", rec.posk_saly);
			rx.add(record, "dty_alon", rec.dty_alon);
			rx.add(record, "posk_alon", rec.posk_alon);
			rx.add(record, "care_alon", rec.care_alon);
			rx.add(record, "food_alon", rec.food_alon);
			rx.add(record, "saly_stot", rec.saly_stot);
			rx.add(record, "appmt_sort", rec.appmt_sort);
			rx.add(record, "appmt_cont", rec.appmt_cont);
			rx.add(record, "appmt_stat_clsf", rec.appmt_stat_clsf);
			rx.add(record, "appmt_stat_clsf_nm", rec.appmt_stat_clsf_nm);
			rx.add(record, "evngt_saly", rec.evngt_saly);
			rx.add(record, "supl_saly", rec.supl_saly);
			rx.add(record, "trff_alon", rec.trff_alon);
			rx.add(record, "treat_add_amt", rec.treat_add_amt);
			rx.add(record, "saly_cls", rec.saly_cls);
			rx.add(record, "nxt_promo_dt", rec.nxt_promo_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "tax_jrnst", rec.tax_jrnst);
			rx.add(record, "auto_driv_alon", rec.auto_driv_alon);
			//rx.add(record, "row_num", StringUtil.replaceToXml(rec.row_num));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "addm_dept_cd", StringUtil.replaceToXml(rec.addm_dept_cd));
			//rx.add(record, "addm_dept_nm", StringUtil.replaceToXml(rec.addm_dept_nm));
			//rx.add(record, "appmt_cd", StringUtil.replaceToXml(rec.appmt_cd));
			//rx.add(record, "appmt_nm", StringUtil.replaceToXml(rec.appmt_nm));
			//rx.add(record, "appmt_resn_cd", StringUtil.replaceToXml(rec.appmt_resn_cd));
			//rx.add(record, "appmt_resn_nm", StringUtil.replaceToXml(rec.appmt_resn_nm));
			//rx.add(record, "appmt_dt", StringUtil.replaceToXml(rec.appmt_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "emp_clsf_cd", StringUtil.replaceToXml(rec.emp_clsf_cd));
			//rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "emp_dtls_clsf", StringUtil.replaceToXml(rec.emp_dtls_clsf));
			//rx.add(record, "emp_dtls_clsf_nm", StringUtil.replaceToXml(rec.emp_dtls_clsf_nm));
			//rx.add(record, "base_saly", StringUtil.replaceToXml(rec.base_saly));
			//rx.add(record, "posk_saly", StringUtil.replaceToXml(rec.posk_saly));
			//rx.add(record, "dty_alon", StringUtil.replaceToXml(rec.dty_alon));
			//rx.add(record, "posk_alon", StringUtil.replaceToXml(rec.posk_alon));
			//rx.add(record, "care_alon", StringUtil.replaceToXml(rec.care_alon));
			//rx.add(record, "food_alon", StringUtil.replaceToXml(rec.food_alon));
			//rx.add(record, "saly_stot", StringUtil.replaceToXml(rec.saly_stot));
			//rx.add(record, "appmt_sort", StringUtil.replaceToXml(rec.appmt_sort));
			//rx.add(record, "appmt_cont", StringUtil.replaceToXml(rec.appmt_cont));
			//rx.add(record, "appmt_stat_clsf", StringUtil.replaceToXml(rec.appmt_stat_clsf));
			//rx.add(record, "appmt_stat_clsf_nm", StringUtil.replaceToXml(rec.appmt_stat_clsf_nm));
			//rx.add(record, "evngt_saly", StringUtil.replaceToXml(rec.evngt_saly));
			//rx.add(record, "supl_saly", StringUtil.replaceToXml(rec.supl_saly));
			//rx.add(record, "trff_alon", StringUtil.replaceToXml(rec.trff_alon));
			//rx.add(record, "treat_add_amt", StringUtil.replaceToXml(rec.treat_add_amt));
			//rx.add(record, "saly_cls", StringUtil.replaceToXml(rec.saly_cls));
			//rx.add(record, "nxt_promo_dt", StringUtil.replaceToXml(rec.nxt_promo_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
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
<hd_appmt_1100_l>
	<dataSet>
		<CURLIST>
			<record>
				<row_num/>
				<cmpy_cd/>
				<emp_no/>
				<flnm/>
				<dept_cd/>
				<dept_nm/>
				<addm_dept_cd/>
				<addm_dept_nm/>
				<appmt_cd/>
				<appmt_nm/>
				<appmt_resn_cd/>
				<appmt_resn_nm/>
				<appmt_dt/>
				<mtry_dt/>
				<emp_clsf_cd/>
				<emp_clsf_nm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<emp_dtls_clsf/>
				<emp_dtls_clsf_nm/>
				<base_saly/>
				<posk_saly/>
				<dty_alon/>
				<posk_alon/>
				<care_alon/>
				<food_alon/>
				<saly_stot/>
				<appmt_sort/>
				<appmt_cont/>
				<appmt_stat_clsf/>
				<appmt_stat_clsf_nm/>
				<evngt_saly/>
				<supl_saly/>
				<trff_alon/>
				<treat_add_amt/>
				<saly_cls/>
				<nxt_promo_dt/>
				<seq/>
				<occr_dt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_appmt_1100_l>
*/
%>

<% /* 작성시간 : Wed Jun 27 18:37:14 KST 2012 */ %>