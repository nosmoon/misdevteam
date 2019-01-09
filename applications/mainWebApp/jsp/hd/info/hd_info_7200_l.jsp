<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_7200_LDataSet ds = (HD_INFO_7200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INFO_7200_LCURLIST1Record rec = (HD_INFO_7200_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.addCData(record, "dept_nm", rec.dept_nm);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "tmp_crdt_amt", rec.tmp_crdt_amt);
			rx.addCData(record, "titl", rec.titl);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "proc_stat", rec.proc_stat);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "tot_amt", StringUtil.replaceToXml(rec.tot_amt));
			//rx.add(record, "tmp_crdt_amt", StringUtil.replaceToXml(rec.tmp_crdt_amt));
			//rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			//rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_pers_ipadd", StringUtil.replaceToXml(rec.incmg_pers_ipadd));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_7200_LCURLISTRecord rec = (HD_INFO_7200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "frlc_no", rec.frlc_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "pay_mm", rec.pay_mm);
			rx.add(record, "chrg_posk_cd", rec.chrg_posk_cd);
			rx.addCData(record, "chrg_posk_nm", rec.chrg_posk_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "thrw_pgm", rec.thrw_pgm);
			rx.addCData(record, "thrw_pgm_nm", rec.thrw_pgm_nm);
			rx.add(record, "cntr_dt", rec.cntr_dt);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "duty_dds", rec.duty_dds);
			rx.add(record, "pay_cycl", rec.pay_cycl);
			rx.add(record, "pay_cycl_nm", rec.pay_cycl_nm);
			rx.add(record, "servcost", rec.servcost);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "duty_tms", rec.duty_tms);
			rx.add(record, "base_amt", rec.base_amt);
			rx.add(record, "etc_amt", rec.etc_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "incm_clsf_cd", rec.incm_clsf_cd);
			rx.add(record, "incm_clsf_nm", rec.incm_clsf_nm);
			rx.add(record, "incm_tax", rec.incm_tax);
			rx.add(record, "res_tax", rec.res_tax);
			rx.addCData(record, "draft_no", rec.draft_no);
			rx.add(record, "draft_dept_cd", rec.draft_dept_cd);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.addCData(record, "budg_nm", rec.budg_nm);
			rx.add(record, "setl_bank", rec.bank_cd);
			rx.add(record, "acct_no", rec.acct_no);
			rx.addCData(record, "remk", rec.remk);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			rx.add(record, "slip_proc_seq", rec.slip_proc_seq);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "frlc_no", StringUtil.replaceToXml(rec.frlc_no));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			//rx.add(record, "pay_mm", StringUtil.replaceToXml(rec.pay_mm));
			//rx.add(record, "chrg_posk_cd", StringUtil.replaceToXml(rec.chrg_posk_cd));
			//rx.add(record, "chrg_posk_nm", StringUtil.replaceToXml(rec.chrg_posk_nm));
			//rx.add(record, "thrw_pgm", StringUtil.replaceToXml(rec.thrw_pgm));
			//rx.add(record, "cntr_dt", StringUtil.replaceToXml(rec.cntr_dt));
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
			//rx.add(record, "duty_dds", StringUtil.replaceToXml(rec.duty_dds));
			//rx.add(record, "pay_cycl", StringUtil.replaceToXml(rec.pay_cycl));
			//rx.add(record, "servcost", StringUtil.replaceToXml(rec.servcost));
			//rx.add(record, "duty_tms", StringUtil.replaceToXml(rec.duty_tms));
			//rx.add(record, "etc_amt", StringUtil.replaceToXml(rec.etc_amt));
			//rx.add(record, "tot_amt", StringUtil.replaceToXml(rec.tot_amt));
			//rx.add(record, "draft_no", StringUtil.replaceToXml(rec.draft_no));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "slip_proc_mang_dt", StringUtil.replaceToXml(rec.slip_proc_mang_dt));
			//rx.add(record, "slip_proc_mang_seq", StringUtil.replaceToXml(rec.slip_proc_mang_seq));
			//rx.add(record, "slip_proc_seq", StringUtil.replaceToXml(rec.slip_proc_seq));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
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
<hd_info_7200_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<mang_no/>
				<flnm/>
				<dept_cd/>
				<dept_nm/>
				<tot_amt/>
				<tmp_crdt_amt/>
				<titl/>
				<actu_slip_no/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<incmg_pers/>
				<incmg_pers_ipadd/>
				<proc_stat/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_info_7200_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_7200_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<frlc_no/>
				<occr_dt/>
				<seq/>
				<flnm/>
				<mang_no/>
				<pay_mm/>
				<chrg_posk_cd/>
				<chrg_posk_nm/>
				<thrw_pgm/>
				<cntr_dt/>
				<lvcmpy_dt/>
				<duty_dds/>
				<pay_cycl/>
				<servcost/>
				<duty_tms/>
				<etc_amt/>
				<tot_amt/>
				<draft_no/>
				<budg_cd/>
				<budg_nm/>
				<remk/>
				<slip_proc_mang_dt/>
				<slip_proc_mang_seq/>
				<slip_proc_seq/>
				<proc_stat/>
				<proc_stat_nm/>
				<actu_slip_no/>
			</record>
		</CURLIST>
	</dataSet>
</hd_info_7200_l>
*/
%>

<% /* 작성시간 : Wed Mar 27 17:56:00 KST 2013 */ %>