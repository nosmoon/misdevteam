<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_1721_LDataSet ds = (HD_AFFR_1721_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1721_LCURLISTRecord rec = (HD_AFFR_1721_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "scl_exps_pay_yy", rec.scl_exps_pay_yy);
			rx.add(record, "scl_exps_pay_qq", rec.scl_exps_pay_qq);
			rx.add(record, "scl_exps_clsf", rec.scl_exps_clsf);
			rx.add(record, "scl_exps_pay_plac_clsf", rec.scl_exps_pay_plac_clsf);
			rx.add(record, "obj_pers_flnm", rec.obj_pers_flnm);
			rx.add(record, "obj_pers_prn", rec.obj_pers_prn);
			rx.addCData(record, "scl_nm", rec.scl_nm);
			rx.addCData(record, "grade", rec.grade);
			rx.addCData(record, "scl_part", rec.scl_part);
			rx.add(record, "aplc_amt", rec.aplc_amt);
			rx.add(record, "vdty_amt", rec.vdty_amt);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.addCData(record, "remk", rec.remk);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			rx.add(record, "aplc_dt", rec.aplc_dt);
			rx.add(record, "aplc_seq", rec.aplc_seq);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.addCData(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.addCData(record, "scl_exps_clsf_nm", rec.scl_exps_clsf_nm);
			rx.addCData(record, "proc_stat_nm", rec.proc_stat_nm);
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
	<CURLIST>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<occr_dt/>
			<seq/>
			<flnm/>
			<dept_cd/>
			<dty_cd/>
			<posi_cd/>
			<dept_nm/>
			<dty_nm/>
			<posi_nm/>
			<scl_exps_pay_yy/>
			<scl_exps_pay_qq/>
			<scl_exps_clsf/>
			<scl_exps_pay_plac_clsf/>
			<obj_pers_flnm/>
			<obj_pers_prn/>
			<scl_nm/>
			<grade/>
			<scl_part/>
			<aplc_amt/>
			<vdty_amt/>
			<pay_amt/>
			<remk/>
			<slip_proc_mang_dt/>
			<slip_proc_mang_seq/>
			<aplc_dt/>
			<aplc_seq/>
			<incmg_pers_ipadd/>
			<incmg_pers/>
			<incmg_dt_tm/>
			<chg_pers/>
			<chg_dt_tm/>
			<scl_exps_clsf_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 19 11:12:09 KST 2009 */ %>