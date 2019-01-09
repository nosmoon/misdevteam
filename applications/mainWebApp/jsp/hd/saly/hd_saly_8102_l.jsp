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
	HD_SALY_8102_LDataSet ds = (HD_SALY_8102_LDataSet)request.getAttribute("ds");
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
			HD_SALY_8102_LCURLISTRecord rec = (HD_SALY_8102_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "pens_clsf_nm", rec.pens_clsf_nm);
			rx.add(record, "pens_aply_mm", rec.pens_aply_mm);
			rx.add(record, "welf_pens_amt", rec.welf_pens_amt);
			rx.add(record, "prsn_pens_amt", rec.prsn_pens_amt);
			rx.add(record, "pens_stot", rec.pens_stot);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "age", rec.age);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "phone_no", rec.phone_no);
			rx.add(record, "pymt_gubun_nm", rec.pymt_gubun_nm);
			rx.add(record, "prsn_sppt_amt", rec.prsn_sppt_amt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "pens_clsf_nm", StringUtil.replaceToXml(rec.pens_clsf_nm));
			//rx.add(record, "pens_aply_mm", StringUtil.replaceToXml(rec.pens_aply_mm));
			//rx.add(record, "welf_pens_amt", StringUtil.replaceToXml(rec.welf_pens_amt));
			//rx.add(record, "prsn_pens_amt", StringUtil.replaceToXml(rec.prsn_pens_amt));
			//rx.add(record, "pens_stot", StringUtil.replaceToXml(rec.pens_stot));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "age", StringUtil.replaceToXml(rec.age));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "phone_no", StringUtil.replaceToXml(rec.phone_no));
			//rx.add(record, "pymt_gubun_nm", StringUtil.replaceToXml(rec.pymt_gubun_nm));
			//rx.add(record, "prsn_sppt_amt", StringUtil.replaceToXml(rec.prsn_sppt_amt));
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
<hd_saly_8102_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<occr_dt/>
				<seq/>
				<cd_nm/>
				<dept_cd/>
				<dept_nm/>
				<flnm/>
				<pens_clsf_nm/>
				<pens_aply_mm/>
				<welf_pens_amt/>
				<prsn_pens_amt/>
				<pens_stot/>
				<proc_stat/>
				<proc_stat_nm/>
				<remk/>
				<age/>
				<incmg_dt_tm/>
				<prn/>
				<phone_no/>
				<pymt_gubun_nm/>
				<prsn_sppt_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_8102_l>
*/
%>

<% /* 작성시간 : Fri Mar 04 16:02:31 KST 2016 */ %>