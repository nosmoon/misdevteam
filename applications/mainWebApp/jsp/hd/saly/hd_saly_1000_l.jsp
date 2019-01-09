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
	HD_SALY_1000_LDataSet ds = (HD_SALY_1000_LDataSet)request.getAttribute("ds");
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
			HD_SALY_1000_LCURLISTRecord rec = (HD_SALY_1000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "saly_yy", rec.saly_yy);
			rx.add(record, "saly_no", rec.saly_no);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "week_hody_base_alon", rec.week_hody_base_alon);
			rx.add(record, "week_hody_cmpn_alon", rec.week_hody_cmpn_alon);
			rx.add(record, "lgl_hody_alon", rec.lgl_hody_alon);
			rx.add(record, "nissu_dd_alon", rec.nissu_dd_alon);
			rx.add(record, "erl_prsnt_alon", rec.erl_prsnt_alon);
			rx.add(record, "vgl_fee", rec.vgl_fee);
			rx.add(record, "etc_duty_alon", rec.etc_duty_alon);
			rx.add(record, "prvmm_mstk_alon", rec.prvmm_mstk_alon);
			rx.add(record, "non_regu_alon_stot", rec.non_regu_alon_stot);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
		//	rx.add(record, "lang_study_splamt",	rec.lang_study_splamt); 
		//	rx.add(record, "rslt_alon_saly", rec.rslt_alon_saly); 
		//	rx.add(record, "scl_exps_alon_saly", rec.scl_exps_alon_saly);
			rx.add(record, "etc_alon_saly", rec.etc_alon_saly);
			rx.add(record, "bns_saly", rec.bns_saly);
		//	rx.add(record, "rslt_alon_exst_pay", rec.rslt_alon_exst_pay);
		//	rx.add(record, "scl_exps_alon_exst_pay", rec.scl_exps_alon_exst_pay);
    	//	rx.add(record, "etc_alon_exst_pay", rec.etc_alon_exst_pay);
		//	rx.add(record, "bns_exst_pay", rec.bns_exst_pay);
		//	rx.add(record, "sply_chk_fee", rec.sply_chk_fee);
		//	rx.add(record, "anvy_pay_fee", rec.anvy_pay_fee);                                          
		//	rx.add(record, "anvy_pay_fee", rec.anvy_pay_fee);
			rx.add(record, "hody_duty_alon", rec.hody_duty_alon);          
		//	rx.add(record, "rdr_extn_alon", rec.rdr_extn_alon);           
		//	rx.add(record, "vaca_fee", rec.vaca_fee);                
		//	rx.add(record, "park_vilt_sply_fee", rec.park_vilt_sply_fee);      
		//	rx.add(record, "clamt_alon", rec.clamt_alon);              
		//	rx.add(record, "prz_fee", rec.prz_fee);   
			rx.add(record, "congr_fee", rec.congr_fee);
			rx.add(record, "welfare_fee", rec.welfare_fee);
			rx.add(record, "adpay_amt", rec.adpay_amt);       

			//rx.add(record, "saly_yy", StringUtil.replaceToXml(rec.saly_yy));
			//rx.add(record, "saly_no", StringUtil.replaceToXml(rec.saly_no));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "week_hody_base_alon", StringUtil.replaceToXml(rec.week_hody_base_alon));
			//rx.add(record, "week_hody_cmpn_alon", StringUtil.replaceToXml(rec.week_hody_cmpn_alon));
			//rx.add(record, "lgl_hody_alon", StringUtil.replaceToXml(rec.lgl_hody_alon));
			//rx.add(record, "nissu_dd_alon", StringUtil.replaceToXml(rec.nissu_dd_alon));
			//rx.add(record, "erl_prsnt_alon", StringUtil.replaceToXml(rec.erl_prsnt_alon));
			//rx.add(record, "vgl_fee", StringUtil.replaceToXml(rec.vgl_fee));
			//rx.add(record, "etc_duty_alon", StringUtil.replaceToXml(rec.etc_duty_alon));
			//rx.add(record, "prvmm_mstk_alon", StringUtil.replaceToXml(rec.prvmm_mstk_alon));
			//rx.add(record, "non_regu_alon_stot", StringUtil.replaceToXml(rec.non_regu_alon_stot));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
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
<hd_saly_1000_l>
	<dataSet>
		<CURLIST>
			<record>
				<saly_yy/>
				<saly_no/>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<week_hody_base_alon/>
				<week_hody_cmpn_alon/>
				<lgl_hody_alon/>
				<nissu_dd_alon/>
				<erl_prsnt_alon/>
				<vgl_fee/>
				<etc_duty_alon/>
				<prvmm_mstk_alon/>
				<non_regu_alon_stot/>
				<proc_stat/>
				<proc_stat_nm/>
				<lang_study_splamt/>
				<rslt_alon_saly/>
				<scl_exps_alon_saly/>
				<etc_alon_saly/>
				<bns_saly/>
				<rslt_alon_exst_pay/>
				<scl_exps_alon_exst_pay/>
				<etc_alon_exst_pay/>
				<bns_exst_pay/>
				<sply_chk_fee/>
				<anvy_pay_fee/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_1000_l>
*/
%>

<% /* 작성시간 : Wed Apr 22 20:46:18 KST 2009 */ %>