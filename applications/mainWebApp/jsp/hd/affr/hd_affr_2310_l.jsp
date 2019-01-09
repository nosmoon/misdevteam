<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_2310_LDataSet ds = (HD_AFFR_2310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_AFFR_2310_LCURLIST1Record rec = (HD_AFFR_2310_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			rx.add(record, "tmp_dr_amt", StringUtil.replaceToXml(rec.tmp_dr_amt));
			rx.add(record, "tmp_crdt_amt", StringUtil.replaceToXml(rec.tmp_crdt_amt));
			rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			rx.add(record, "incmg_pers_ipadd", StringUtil.replaceToXml(rec.incmg_pers_ipadd));
			rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			rx.add(record, "slip_proc_mang_dt", StringUtil.replaceToXml(rec.slip_proc_mang_dt));
			rx.add(record, "slip_proc_mang_seq", StringUtil.replaceToXml(rec.slip_proc_mang_seq));
			rx.add(record, "cmpy_welf_fund_clsf", StringUtil.replaceToXml(rec.cmpy_welf_fund_clsf));
			rx.add(record, "titl2", StringUtil.replaceToXml(rec.titl2));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "emp_no", rec.emp_no);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "flnm", rec.flnm);
			//rx.add(record, "tmp_dr_amt", rec.tmp_dr_amt);
			//rx.add(record, "tmp_crdt_amt", rec.tmp_crdt_amt);
			//rx.add(record, "titl", rec.titl);
			//rx.add(record, "actu_slip_no", rec.actu_slip_no);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "incmg_pers", rec.incmg_pers);
			//rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			//rx.add(record, "proc_stat", rec.proc_stat);
			//rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			//rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			//rx.add(record, "cmpy_welf_fund_clsf", rec.cmpy_welf_fund_clsf);
			//rx.add(record, "titl2", rec.titl2);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "seq", rec.seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_2310_LCURLISTRecord rec = (HD_AFFR_2310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			rx.add(record, "ofcr_clsf", StringUtil.replaceToXml(rec.ofcr_clsf));
			rx.add(record, "pay_plac_clsf", StringUtil.replaceToXml(rec.pay_plac_clsf));
			rx.add(record, "congr_condl_dt", StringUtil.replaceToXml(rec.congr_condl_dt));
			rx.add(record, "congr_condl_cd", StringUtil.replaceToXml(rec.congr_condl_cd));
			rx.add(record, "congr_condl_fee", StringUtil.replaceToXml(rec.congr_condl_fee));
			rx.add(record, "art_flower", StringUtil.replaceToXml(rec.art_flower));
			rx.add(record, "ofcr_congr_condl_fee", StringUtil.replaceToXml(rec.ofcr_congr_condl_fee));
			rx.add(record, "ofcr_art_flower", StringUtil.replaceToXml(rec.ofcr_art_flower));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			rx.add(record, "congr_condl_nm", StringUtil.replaceToXml(rec.congr_condl_nm));
			rx.add(record, "slip_proc_mang_dt", StringUtil.replaceToXml(rec.slip_proc_mang_dt));
			rx.add(record, "slip_proc_mang_seq", StringUtil.replaceToXml(rec.slip_proc_mang_seq));
			rx.add(record, "slip_proc_seq", StringUtil.replaceToXml(rec.slip_proc_seq));
			rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			rx.add(record, "cmpy_welf_fund_clsf", StringUtil.replaceToXml(rec.cmpy_welf_fund_clsf));
			//rx.add(record, "emp_no", rec.emp_no);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "flnm", rec.flnm);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "dty_cd", rec.dty_cd);
			//rx.add(record, "posi_cd", rec.posi_cd);
			//rx.add(record, "ofcr_clsf", rec.ofcr_clsf);
			//rx.add(record, "pay_plac_clsf", rec.pay_plac_clsf);
			//rx.add(record, "congr_condl_dt", rec.congr_condl_dt);
			//rx.add(record, "congr_condl_cd", rec.congr_condl_cd);
			//rx.add(record, "congr_condl_fee", rec.congr_condl_fee);
			//rx.add(record, "art_flower", rec.art_flower);
			//rx.add(record, "ofcr_congr_condl_fee", rec.ofcr_congr_condl_fee);
			//rx.add(record, "ofcr_art_flower", rec.ofcr_art_flower);
			//rx.add(record, "remk", rec.remk);
			//rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "dty_nm", rec.dty_nm);
			//rx.add(record, "posi_nm", rec.posi_nm);
			//rx.add(record, "congr_condl_nm", rec.congr_condl_nm);
			//rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			//rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			//rx.add(record, "slip_proc_seq", rec.slip_proc_seq);
			//rx.add(record, "proc_stat", rec.proc_stat);
			//rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			//rx.add(record, "actu_slip_no", rec.actu_slip_no);
			//rx.add(record, "cmpy_welf_fund_clsf", rec.cmpy_welf_fund_clsf);
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
<hd_affr_2310_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<dept_cd/>
				<flnm/>
				<tmp_dr_amt/>
				<tmp_crdt_amt/>
				<titl/>
				<actu_slip_no/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<incmg_pers/>
				<incmg_pers_ipadd/>
				<proc_stat/>
				<slip_proc_mang_dt/>
				<slip_proc_mang_seq/>
				<cmpy_welf_fund_clsf/>
				<titl2/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_affr_2310_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_affr_2310_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<occr_dt/>
				<seq/>
				<flnm/>
				<dept_cd/>
				<dty_cd/>
				<posi_cd/>
				<ofcr_clsf/>
				<pay_plac_clsf/>
				<congr_condl_dt/>
				<congr_condl_cd/>
				<congr_condl_fee/>
				<art_flower/>
				<ofcr_congr_condl_fee/>
				<ofcr_art_flower/>
				<remk/>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
				<congr_condl_nm/>
				<slip_proc_mang_dt/>
				<slip_proc_mang_seq/>
				<slip_proc_seq/>
				<proc_stat/>
				<proc_stat_nm/>
				<actu_slip_no/>
				<cmpy_welf_fund_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_2310_l>
*/
%>

<% /* 작성시간 : Mon Aug 10 19:47:10 KST 2009 */ %>