<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.ddemp.rec.*
	,	chosun.ciis.hd.ddemp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DDEMP_4000_LDataSet ds = (HD_DDEMP_4000_LDataSet)request.getAttribute("ds");
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
			HD_DDEMP_4000_LCURLISTRecord rec = (HD_DDEMP_4000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "duty_yymm", rec.duty_yymm);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "octgr_cd", rec.octgr_cd);
			rx.add(record, "octgr_cd_nm", rec.octgr_cd_nm);
			rx.add(record, "lve_job_resn_cd", rec.lve_job_resn_cd);
			rx.add(record, "lve_job_resn_cd_nm", rec.lve_job_resn_cd_nm);
			rx.add(record, "duty_dds", rec.duty_dds);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "dd_amt", rec.dd_amt);
			rx.add(record, "time_amt", rec.time_amt);
			rx.add(record, "incm_tax", rec.incm_tax);
			rx.add(record, "res_tax", rec.res_tax);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "emp_insr_fee", rec.emp_insr_fee);
			rx.add(record, "hlth_insr_fee", rec.hlth_insr_fee);
			rx.add(record, "np_fee", rec.np_fee);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.addCData(record, "rmks", rec.rmks);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			//rx.add(record, "duty_yymm", StringUtil.replaceToXml(rec.duty_yymm));
			//rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "ptph_no", StringUtil.replaceToXml(rec.ptph_no));
			//rx.add(record, "octgr_cd", StringUtil.replaceToXml(rec.octgr_cd));
			//rx.add(record, "octgr_cd_nm", StringUtil.replaceToXml(rec.octgr_cd_nm));
			//rx.add(record, "lve_job_resn_cd", StringUtil.replaceToXml(rec.lve_job_resn_cd));
			//rx.add(record, "lve_job_resn_cd_nm", StringUtil.replaceToXml(rec.lve_job_resn_cd_nm));
			//rx.add(record, "duty_dds", StringUtil.replaceToXml(rec.duty_dds));
			//rx.add(record, "pay_amt", StringUtil.replaceToXml(rec.pay_amt));
			//rx.add(record, "dd_amt", StringUtil.replaceToXml(rec.dd_amt));
			//rx.add(record, "time_amt", StringUtil.replaceToXml(rec.time_amt));
			//rx.add(record, "incm_tax", StringUtil.replaceToXml(rec.incm_tax));
			//rx.add(record, "res_tax", StringUtil.replaceToXml(rec.res_tax));
			//rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			//rx.add(record, "emp_insr_fee", StringUtil.replaceToXml(rec.emp_insr_fee));
			//rx.add(record, "hlth_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_fee));
			//rx.add(record, "np_fee", StringUtil.replaceToXml(rec.np_fee));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			//rx.add(record, "use_dept_nm", StringUtil.replaceToXml(rec.use_dept_nm));
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
<hd_ddemp_4000_l>
	<dataSet>
		<CURLIST>
			<record>
				<duty_yymm/>
				<mang_no/>
				<flnm/>
				<prn/>
				<ptph_no/>
				<octgr_cd/>
				<octgr_cd_nm/>
				<lve_job_resn_cd/>
				<lve_job_resn_cd_nm/>
				<duty_dds/>
				<pay_amt/>
				<dd_amt/>
				<time_amt/>
				<incm_tax/>
				<res_tax/>
				<fisc_dt/>
				<emp_insr_fee/>
				<hlth_insr_fee/>
				<np_fee/>
				<budg_cd/>
				<budg_nm/>
				<rmks/>
				<actu_slip_no/>
				<proc_stat/>
				<proc_stat_nm/>
				<use_dept_cd/>
				<use_dept_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_ddemp_4000_l>
*/
%>

<% /* 작성시간 : Tue Feb 08 19:38:00 KST 2011 */ %>