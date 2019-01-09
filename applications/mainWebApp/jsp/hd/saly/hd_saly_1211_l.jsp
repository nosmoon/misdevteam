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
	HD_SALY_1211_LDataSet ds = (HD_SALY_1211_LDataSet)request.getAttribute("ds");
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
			HD_SALY_1211_LCURLISTRecord rec = (HD_SALY_1211_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "week_hody_base_alon_dds", rec.week_hody_base_alon_dds);
			rx.add(record, "week_hody_base_alon", rec.week_hody_base_alon);
			rx.add(record, "week_hody_cmpn_alon_dds", rec.week_hody_cmpn_alon_dds);
			rx.add(record, "week_hody_cmpn_alon", rec.week_hody_cmpn_alon);
			rx.add(record, "lgl_hody_base_alon_dds", rec.lgl_hody_base_alon_dds);
			rx.add(record, "lgl_hody_base_alon", rec.lgl_hody_base_alon);
			rx.add(record, "lgl_hody_cmpn_alon_dds", rec.lgl_hody_cmpn_alon_dds);
			rx.add(record, "lgl_hody_cmpn_alon", rec.lgl_hody_cmpn_alon);
			rx.add(record, "nissu_dd_alon_dds", rec.nissu_dd_alon_dds);
			rx.add(record, "nissu_dd_alon", rec.nissu_dd_alon);
			rx.add(record, "nissu_dd_base_alon_dds", rec.nissu_dd_base_alon_dds);
			rx.add(record, "nissu_dd_base_alon", rec.nissu_dd_base_alon);
			rx.add(record, "prvmm_mstk_alon", rec.prvmm_mstk_alon);
			rx.add(record, "alvc_use_rat", rec.alvc_use_rat);
			rx.add(record, "alon_tot", rec.alon_tot);
			rx.add(record, "p_alon_tot", rec.p_alon_tot);
			rx.add(record, "pp_alon_tot", rec.pp_alon_tot);
			rx.add(record, "vgl_fee_dds", rec.vgl_fee_dds);
			rx.add(record, "vgl_fee", rec.vgl_fee);
			rx.add(record, "erl_prsnt_alon_dds", rec.erl_prsnt_alon_dds);
			rx.add(record, "erl_prsnt_alon", rec.erl_prsnt_alon);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "week_hody_base_alon_dds", StringUtil.replaceToXml(rec.week_hody_base_alon_dds));
			//rx.add(record, "week_hody_base_alon", StringUtil.replaceToXml(rec.week_hody_base_alon));
			//rx.add(record, "week_hody_cmpn_alon_dds", StringUtil.replaceToXml(rec.week_hody_cmpn_alon_dds));
			//rx.add(record, "week_hody_cmpn_alon", StringUtil.replaceToXml(rec.week_hody_cmpn_alon));
			//rx.add(record, "lgl_hody_base_alon_dds", StringUtil.replaceToXml(rec.lgl_hody_base_alon_dds));
			//rx.add(record, "lgl_hody_base_alon", StringUtil.replaceToXml(rec.lgl_hody_base_alon));
			//rx.add(record, "lgl_hody_cmpn_alon_dds", StringUtil.replaceToXml(rec.lgl_hody_cmpn_alon_dds));
			//rx.add(record, "lgl_hody_cmpn_alon", StringUtil.replaceToXml(rec.lgl_hody_cmpn_alon));
			//rx.add(record, "nissu_dd_alon_dds", StringUtil.replaceToXml(rec.nissu_dd_alon_dds));
			//rx.add(record, "nissu_dd_alon", StringUtil.replaceToXml(rec.nissu_dd_alon));
			//rx.add(record, "prvmm_mstk_alon", StringUtil.replaceToXml(rec.prvmm_mstk_alon));
			//rx.add(record, "alvc_use_rat", StringUtil.replaceToXml(rec.alvc_use_rat));
			//rx.add(record, "alon_tot", StringUtil.replaceToXml(rec.alon_tot));
			//rx.add(record, "p_alon_tot", StringUtil.replaceToXml(rec.p_alon_tot));
			//rx.add(record, "pp_alon_tot", StringUtil.replaceToXml(rec.pp_alon_tot));
			//rx.add(record, "vgl_fee_dds", StringUtil.replaceToXml(rec.vgl_fee_dds));
			//rx.add(record, "vgl_fee", StringUtil.replaceToXml(rec.vgl_fee));
			//rx.add(record, "erl_prsnt_alon_dds", StringUtil.replaceToXml(rec.erl_prsnt_alon_dds));
			//rx.add(record, "erl_prsnt_alon", StringUtil.replaceToXml(rec.erl_prsnt_alon));
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
<hd_saly_1211_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<dty_nm/>
				<posi_nm/>
				<week_hody_base_alon_dds/>
				<week_hody_base_alon/>
				<week_hody_cmpn_alon_dds/>
				<week_hody_cmpn_alon/>
				<lgl_hody_base_alon_dds/>
				<lgl_hody_base_alon/>
				<lgl_hody_cmpn_alon_dds/>
				<lgl_hody_cmpn_alon/>
				<nissu_dd_alon_dds/>
				<nissu_dd_alon/>
				<prvmm_mstk_alon/>
				<alvc_use_rat/>
				<alon_tot/>
				<p_alon_tot/>
				<pp_alon_tot/>
				<vgl_fee_dds/>
				<vgl_fee/>
				<erl_prsnt_alon_dds/>
				<erl_prsnt_alon/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_1211_l>
*/
%>

<% /* 작성시간 : Tue Apr 28 16:11:09 KST 2009 */ %>