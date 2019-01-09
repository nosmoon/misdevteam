<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.dwnwrk.rec.*
	,	chosun.ciis.hd.dwnwrk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DWNWRK_1300_LDataSet ds = (HD_DWNWRK_1300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_DWNWRK_1300_LCURLIST1Record rec = (HD_DWNWRK_1300_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "s_cmpy_cd", rec.s_cmpy_cd);
			rx.add(record, "s_emp_no", rec.s_emp_no);
			rx.add(record, "s_flnm", rec.s_flnm);
			rx.add(record, "s_dept_cd", rec.s_dept_cd);
			rx.add(record, "s_total_alon_amt", rec.s_total_alon_amt);
			rx.add(record, "s_pay_dt", rec.s_pay_dt);
			rx.add(record, "s_duty_dds", rec.s_duty_dds);
			rx.add(record, "s_total_amt", rec.s_total_amt);
			rx.add(record, "s_total_peple", rec.s_total_peple);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "incmg_pres", rec.incmg_pres);
			rx.add(record, "incmg_pres_ipadd", rec.incmg_pres_ipadd);
			rx.add(record, "proc_stat", rec.proc_stat);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DWNWRK_1300_LCURLISTRecord rec = (HD_DWNWRK_1300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "erl_prsnt_bgn_tm", rec.erl_prsnt_bgn_tm);
			rx.add(record, "erl_prsnt_end_tm", rec.erl_prsnt_end_tm);
			rx.add(record, "erl_prsnt_duty_tm", rec.erl_prsnt_duty_tm);
			rx.add(record, "alon_amt", rec.alon_amt);
			rx.add(record, "prsnt_tm", rec.prsnt_tm);
			rx.add(record, "finish_tm", rec.finish_tm);
			rx.add(record, "finish_dd_clsf", rec.finish_dd_clsf);
			rx.add(record, "duty_resn", rec.duty_resn);
			rx.add(record, "pay_dt", rec.pay_dt);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "slip_proc_seq", rec.slip_proc_seq);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "db_status", rec.db_status);
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
<dataSet>
	<CURLIST1>
		<record>
			<s_cmpy_cd/>
			<s_emp_no/>
			<s_flnm/>
			<s_dept_cd/>
			<s_total_alon_amt/>
			<s_pay_dt/>
			<s_duty_dds/>
			<s_total_amt/>
			<s_total_peple/>
			<actu_slip_no/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<incmg_pres/>
			<incmg_pres_ipadd/>
			<proc_stat/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<dept_nm/>
			<emp_no/>
			<nm_korn/>
			<posi_nm/>
			<duty_dt/>
			<erl_prsnt_bgn_tm/>
			<erl_prsnt_end_tm/>
			<erl_prsnt_duty_tm/>
			<alon_amt/>
			<prsnt_tm/>
			<finish_tm/>
			<finish_dd_clsf/>
			<duty_resn/>
			<pay_dt/>
			<proc_stat_nm/>
			<slip_proc_seq/>
			<actu_slip_no/>
			<slip_proc_mang_dt/>
			<slip_proc_mang_seq/>
			<proc_stat/>
			<dept_cd/>
			<slip_seq/>
			<db_status/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jul 07 17:12:39 KST 2009 */ %>