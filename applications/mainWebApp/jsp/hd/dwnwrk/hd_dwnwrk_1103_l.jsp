<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.dwnwrk.rec.*
	,	chosun.ciis.hd.dwnwrk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DWNWRK_1103_LDataSet ds = (HD_DWNWRK_1103_LDataSet)request.getAttribute("ds");
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
			HD_DWNWRK_1103_LCURLISTRecord rec = (HD_DWNWRK_1103_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "erl_prsnt_bgn_tm", rec.erl_prsnt_bgn_tm);
			rx.add(record, "erl_prsnt_end_tm", rec.erl_prsnt_end_tm);
			rx.add(record, "erl_prsnt_duty_tm", rec.erl_prsnt_duty_tm);
			rx.add(record, "prsnt_tm", rec.prsnt_tm);
			rx.add(record, "finish_tm", rec.finish_tm);
			rx.add(record, "duty_resn", rec.duty_resn);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "finish_dd_clsf", rec.finish_dd_clsf);
			rx.add(record, "finish_dd_clsf_nm", rec.finish_dd_clsf_nm);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "duty_dt", StringUtil.replaceToXml(rec.duty_dt));
			//rx.add(record, "erl_prsnt_bgn_tm", StringUtil.replaceToXml(rec.erl_prsnt_bgn_tm));
			//rx.add(record, "erl_prsnt_end_tm", StringUtil.replaceToXml(rec.erl_prsnt_end_tm));
			//rx.add(record, "erl_prsnt_duty_tm", StringUtil.replaceToXml(rec.erl_prsnt_duty_tm));
			//rx.add(record, "prsnt_tm", StringUtil.replaceToXml(rec.prsnt_tm));
			//rx.add(record, "finish_tm", StringUtil.replaceToXml(rec.finish_tm));
			//rx.add(record, "duty_resn", StringUtil.replaceToXml(rec.duty_resn));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "finish_dd_clsf", StringUtil.replaceToXml(rec.finish_dd_clsf));
			//rx.add(record, "finish_dd_clsf_nm", StringUtil.replaceToXml(rec.finish_dd_clsf_nm));
			//rx.add(record, "slip_proc_mang_dt", StringUtil.replaceToXml(rec.slip_proc_mang_dt));
			//rx.add(record, "slip_proc_mang_seq", StringUtil.replaceToXml(rec.slip_proc_mang_seq));
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
<hd_dwnwrk_1103_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<posi_nm/>
				<duty_dt/>
				<erl_prsnt_bgn_tm/>
				<erl_prsnt_end_tm/>
				<erl_prsnt_duty_tm/>
				<prsnt_tm/>
				<finish_tm/>
				<duty_resn/>
				<proc_stat/>
				<proc_stat_nm/>
				<finish_dd_clsf/>
				<finish_dd_clsf_nm/>
				<slip_proc_mang_dt/>
				<slip_proc_mang_seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_dwnwrk_1103_l>
*/
%>

<% /* 작성시간 : Mon Apr 26 14:26:26 KST 2010 */ %>