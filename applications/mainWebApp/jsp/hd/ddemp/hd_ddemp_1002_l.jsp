<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.ddemp.rec.*
	,	chosun.ciis.hd.ddemp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DDEMP_1002_LDataSet ds = (HD_DDEMP_1002_LDataSet)request.getAttribute("ds");
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
			HD_DDEMP_1002_LCURLISTRecord rec = (HD_DDEMP_1002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "chk", "");
			rx.add(record, "prn", rec.prn);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "studt_wk_yn", rec.studt_wk_yn);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "emp_insr_dduc_yn", rec.emp_insr_dduc_yn);
			rx.add(record, "octgr_cd", rec.octgr_cd);
			rx.add(record, "lve_job_resn_cd", rec.lve_job_resn_cd);
			rx.add(record, "avg_duty_tm", rec.avg_duty_tm);
			rx.add(record, "day01", rec.day01);
			rx.add(record, "day02", rec.day02);
			rx.add(record, "day03", rec.day03);
			rx.add(record, "day04", rec.day04);
			rx.add(record, "day05", rec.day05);
			rx.add(record, "day06", rec.day06);
			rx.add(record, "day07", rec.day07);
			rx.add(record, "day08", rec.day08);
			rx.add(record, "day09", rec.day09);
			rx.add(record, "day10", rec.day10);
			rx.add(record, "day11", rec.day11);
			rx.add(record, "day12", rec.day12);
			rx.add(record, "day13", rec.day13);
			rx.add(record, "day14", rec.day14);
			rx.add(record, "day15", rec.day15);
			rx.add(record, "day16", rec.day16);
			rx.add(record, "day17", rec.day17);
			rx.add(record, "day18", rec.day18);
			rx.add(record, "day19", rec.day19);
			rx.add(record, "day20", rec.day20);
			rx.add(record, "day21", rec.day21);
			rx.add(record, "day22", rec.day22);
			rx.add(record, "day23", rec.day23);
			rx.add(record, "day24", rec.day24);
			rx.add(record, "day25", rec.day25);
			rx.add(record, "day26", rec.day26);
			rx.add(record, "day27", rec.day27);
			rx.add(record, "day28", rec.day28);
			rx.add(record, "day29", rec.day29);
			rx.add(record, "day30", rec.day30);
			rx.add(record, "day31", rec.day31);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "hlth_insr_fee", rec.hlth_insr_fee);
			rx.add(record, "np_fee", rec.np_fee);
			rx.add(record, "dd_amt", rec.dd_amt);
			rx.add(record, "time_amt", rec.time_amt);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "rcpt_clsf_nm", rec.rcpt_clsf_nm);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			rx.addCData(record, "rmks", rec.rmks);
			rx.addCData(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "emp_insr_fee", rec.emp_insr_fee);
			rx.add(record, "hd_decid_pers", rec.hd_decid_pers);
			rx.add(record, "hd_decid_dt_tm", rec.hd_decid_dt_tm);
			rx.add(record, "duty_dds", rec.duty_dds);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "clos_dt", rec.clos_dt);
			rx.add(record, "incm_tax", rec.incm_tax);
			rx.add(record, "res_tax", rec.res_tax);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "rcpt_clsf", rec.rcpt_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "duty_yymm", rec.duty_yymm);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			rx.add(record, "proc_clsf", rec.proc_clsf);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.addCData(record, "dtls_medi_nm", rec.dtls_medi_nm);
			rx.add(record, "medi_cnt", "");
			rx.add(record, "budg_cnt", "");
			rx.add(record, "all_insr_dduc_yn", rec.all_insr_dduc_yn);
			rx.add(record, "hlth_insr_med_care_insr_fee", rec.hlth_insr_med_care_insr_fee);
		  rx.add(record, "cntr_amt", rec.cntr_amt);
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
	<CURLIST>
		<record>
			<prn/>
			<flnm/>
			<studt_wk_yn/>
			<ptph_no/>
			<emp_insr_dduc_yn/>
			<octgr_cd/>
			<lve_job_resn_cd/>
			<avg_duty_tm/>
			<day01/>
			<day02/>
			<day03/>
			<day04/>
			<day05/>
			<day06/>
			<day07/>
			<day08/>
			<day09/>
			<day10/>
			<day11/>
			<day12/>
			<day13/>
			<day14/>
			<day15/>
			<day16/>
			<day17/>
			<day18/>
			<day19/>
			<day20/>
			<day21/>
			<day22/>
			<day23/>
			<day24/>
			<day25/>
			<day26/>
			<day27/>
			<day28/>
			<day29/>
			<day30/>
			<day31/>
			<pay_amt/>
			<hlth_insr_fee/>
			<np_fee/>
			<budg_nm/>
			<rcpt_clsf_nm/>
			<medi_nm/>
			<use_dept_nm/>
			<rmks/>
			<evnt_nm/>
			<actu_slip_no/>
			<emp_insr_fee/>
			<hd_decid_pers/>
			<hd_decid_dt_tm/>
			<duty_dds/>
			<clos_yn/>
			<clos_dt/>
			<incm_tax/>
			<res_tax/>
			<budg_cd/>
			<rcpt_clsf/>
			<medi_cd/>
			<use_dept_cd/>
			<evnt_cd/>
			<cmpy_cd/>
			<mang_no/>
			<occr_dt/>
			<seq/>
			<duty_yymm/>
			<slip_proc_mang_dt/>
			<slip_proc_mang_seq/>
			<proc_clsf/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Jun 11 22:22:09 KST 2009 */ %>