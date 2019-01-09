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
	HD_AFFR_1100_LDataSet ds = (HD_AFFR_1100_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_1100_LCURLIST1Record rec = (HD_AFFR_1100_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "tmp_dr_amt", rec.tmp_dr_amt);
			rx.add(record, "tmp_crdt_amt", rec.tmp_crdt_amt);
			rx.add(record, "titl", rec.titl);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "titl2", rec.titl2);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			rx.add(record, "cmpy_welf_fund_clsf", rec.cmpy_welf_fund_clsf);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "rcpt_clsf", rec.rcpt_clsf );
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "tmp_dr_amt", StringUtil.replaceToXml(rec.tmp_dr_amt));
			//rx.add(record, "tmp_crdt_amt", StringUtil.replaceToXml(rec.tmp_crdt_amt));
			//rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			//rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_pers_ipadd", StringUtil.replaceToXml(rec.incmg_pers_ipadd));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "titl2", StringUtil.replaceToXml(rec.titl2));
			//rx.add(record, "slip_proc_mang_dt", StringUtil.replaceToXml(rec.slip_proc_mang_dt));
			//rx.add(record, "slip_proc_mang_seq", StringUtil.replaceToXml(rec.slip_proc_mang_seq));
			//rx.add(record, "cmpy_welf_fund_clsf", StringUtil.replaceToXml(rec.cmpy_welf_fund_clsf));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1100_LCURLISTRecord rec = (HD_AFFR_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "use_frdt", rec.use_frdt);
			rx.add(record, "use_todt", rec.use_todt);
			rx.add(record, "use_dds", rec.use_dds);
			rx.add(record, "preng_condo_area_cd_1", rec.preng_condo_area_cd_1);
			rx.add(record, "preng_condo_cd_1", rec.preng_condo_cd_1);
			rx.addCData(record, "preng_condo_nm_1", rec.preng_condo_nm_1);
			rx.add(record, "preng_condo_area_cd_2", rec.preng_condo_area_cd_2);
			rx.add(record, "preng_condo_cd_2", rec.preng_condo_cd_2);
			rx.addCData(record, "preng_condo_nm_2", rec.preng_condo_nm_2);
			rx.add(record, "real_preng_condo_area_cd", rec.real_preng_condo_area_cd);
			rx.add(record, "real_preng_condo_cd", rec.real_preng_condo_cd);
			rx.addCData(record, "real_preng_condo_nm", rec.real_preng_condo_nm);
			rx.add(record, "preng_no", rec.preng_no);
			rx.add(record, "cmpy_sply_use_yn", rec.cmpy_sply_use_yn);
			rx.add(record, "cmpy_sply_use_yn_nm", rec.cmpy_sply_use_yn_nm);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "email_addr", rec.email_addr);
			rx.add(record, "use_pay_amt", rec.use_pay_amt);
			rx.add(record, "slf_burd_amt", rec.slf_burd_amt);
			rx.add(record, "cmpy_sply_amt", rec.cmpy_sply_amt);
			rx.add(record, "slf_drbk_amt", rec.slf_drbk_amt);
			rx.add(record, "guest_room_fee_tot_amt", rec.guest_room_fee_tot_amt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "noti_yn", rec.noti_yn);
			rx.add(record, "noti_yn_nm", rec.noti_yn_nm);
			rx.add(record, "drbk_obj_yn", rec.drbk_obj_yn);
			rx.add(record, "drbk_obj_yn_nm", rec.drbk_obj_yn_nm);
			rx.add(record, "preng_canc_yn", rec.preng_canc_yn);
			rx.add(record, "preng_canc_yn_nm", rec.preng_canc_yn_nm);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			rx.add(record, "aplc_dt", rec.aplc_dt);
			rx.add(record, "aplc_seq", rec.aplc_seq);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "guest_room_cnt", rec.guest_room_cnt);
			rx.add(record, "dds_send_do_it_day", rec.dds_send_do_it_day);
			rx.add(record, "slip_proc_seq", rec.slip_proc_seq);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "emp_clsf", rec.emp_clsf);
			rx.addCData(record, "remk_adm", rec.remk_adm);
			rx.add(record, "aplc_amt", rec.aplc_amt);
			rx.add(record, "rcpt_clsf", rec.rcpt_clsf);
			rx.add(record, "rcpt_nm", rec.rcpt_nm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "use_frdt", StringUtil.replaceToXml(rec.use_frdt));
			//rx.add(record, "use_todt", StringUtil.replaceToXml(rec.use_todt));
			//rx.add(record, "use_dds", StringUtil.replaceToXml(rec.use_dds));
			//rx.add(record, "preng_condo_area_cd_1", StringUtil.replaceToXml(rec.preng_condo_area_cd_1));
			//rx.add(record, "preng_condo_cd_1", StringUtil.replaceToXml(rec.preng_condo_cd_1));
			//rx.add(record, "preng_condo_nm_1", StringUtil.replaceToXml(rec.preng_condo_nm_1));
			//rx.add(record, "preng_condo_area_cd_2", StringUtil.replaceToXml(rec.preng_condo_area_cd_2));
			//rx.add(record, "preng_condo_cd_2", StringUtil.replaceToXml(rec.preng_condo_cd_2));
			//rx.add(record, "preng_condo_nm_2", StringUtil.replaceToXml(rec.preng_condo_nm_2));
			//rx.add(record, "real_preng_condo_area_cd", StringUtil.replaceToXml(rec.real_preng_condo_area_cd));
			//rx.add(record, "real_preng_condo_cd", StringUtil.replaceToXml(rec.real_preng_condo_cd));
			//rx.add(record, "real_preng_condo_nm", StringUtil.replaceToXml(rec.real_preng_condo_nm));
			//rx.add(record, "preng_no", StringUtil.replaceToXml(rec.preng_no));
			//rx.add(record, "cmpy_sply_use_yn", StringUtil.replaceToXml(rec.cmpy_sply_use_yn));
			//rx.add(record, "cmpy_sply_use_yn_nm", StringUtil.replaceToXml(rec.cmpy_sply_use_yn_nm));
			//rx.add(record, "tel_no", StringUtil.replaceToXml(rec.tel_no));
			//rx.add(record, "ptph_no", StringUtil.replaceToXml(rec.ptph_no));
			//rx.add(record, "email_addr", StringUtil.replaceToXml(rec.email_addr));
			//rx.add(record, "use_pay_amt", StringUtil.replaceToXml(rec.use_pay_amt));
			//rx.add(record, "slf_burd_amt", StringUtil.replaceToXml(rec.slf_burd_amt));
			//rx.add(record, "cmpy_sply_amt", StringUtil.replaceToXml(rec.cmpy_sply_amt));
			//rx.add(record, "slf_drbk_amt", StringUtil.replaceToXml(rec.slf_drbk_amt));
			//rx.add(record, "guest_room_fee_tot_amt", StringUtil.replaceToXml(rec.guest_room_fee_tot_amt));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "noti_yn", StringUtil.replaceToXml(rec.noti_yn));
			//rx.add(record, "noti_yn_nm", StringUtil.replaceToXml(rec.noti_yn_nm));
			//rx.add(record, "drbk_obj_yn", StringUtil.replaceToXml(rec.drbk_obj_yn));
			//rx.add(record, "drbk_obj_yn_nm", StringUtil.replaceToXml(rec.drbk_obj_yn_nm));
			//rx.add(record, "preng_canc_yn", StringUtil.replaceToXml(rec.preng_canc_yn));
			//rx.add(record, "preng_canc_yn_nm", StringUtil.replaceToXml(rec.preng_canc_yn_nm));
			//rx.add(record, "slip_proc_mang_dt", StringUtil.replaceToXml(rec.slip_proc_mang_dt));
			//rx.add(record, "slip_proc_mang_seq", StringUtil.replaceToXml(rec.slip_proc_mang_seq));
			//rx.add(record, "aplc_dt", StringUtil.replaceToXml(rec.aplc_dt));
			//rx.add(record, "aplc_seq", StringUtil.replaceToXml(rec.aplc_seq));
			//rx.add(record, "incmg_pers_ipadd", StringUtil.replaceToXml(rec.incmg_pers_ipadd));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "chg_pers", StringUtil.replaceToXml(rec.chg_pers));
			//rx.add(record, "chg_dt_tm", StringUtil.replaceToXml(rec.chg_dt_tm));
			//rx.add(record, "guest_room_cnt", StringUtil.replaceToXml(rec.guest_room_cnt));
			//rx.add(record, "dds_send_do_it_day", StringUtil.replaceToXml(rec.dds_send_do_it_day));
			//rx.add(record, "slip_proc_seq", StringUtil.replaceToXml(rec.slip_proc_seq));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			//rx.add(record, "emp_clsf", StringUtil.replaceToXml(rec.emp_clsf));
			//rx.add(record, "remk_adm", StringUtil.replaceToXml(rec.remk_adm));
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
<hd_affr_1100_l>
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
				<titl2/>
				<slip_proc_mang_dt/>
				<slip_proc_mang_seq/>
				<cmpy_welf_fund_clsf/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_affr_1100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_affr_1100_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<occr_dt/>
				<seq/>
				<flnm/>
				<dept_cd/>
				<dept_nm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<use_frdt/>
				<use_todt/>
				<use_dds/>
				<preng_condo_area_cd_1/>
				<preng_condo_cd_1/>
				<preng_condo_nm_1/>
				<preng_condo_area_cd_2/>
				<preng_condo_cd_2/>
				<preng_condo_nm_2/>
				<real_preng_condo_area_cd/>
				<real_preng_condo_cd/>
				<real_preng_condo_nm/>
				<preng_no/>
				<cmpy_sply_use_yn/>
				<cmpy_sply_use_yn_nm/>
				<tel_no/>
				<ptph_no/>
				<email_addr/>
				<use_pay_amt/>
				<slf_burd_amt/>
				<cmpy_sply_amt/>
				<slf_drbk_amt/>
				<guest_room_fee_tot_amt/>
				<remk/>
				<noti_yn/>
				<noti_yn_nm/>
				<drbk_obj_yn/>
				<drbk_obj_yn_nm/>
				<preng_canc_yn/>
				<preng_canc_yn_nm/>
				<slip_proc_mang_dt/>
				<slip_proc_mang_seq/>
				<aplc_dt/>
				<aplc_seq/>
				<incmg_pers_ipadd/>
				<incmg_pers/>
				<incmg_dt_tm/>
				<chg_pers/>
				<chg_dt_tm/>
				<guest_room_cnt/>
				<dds_send_do_it_day/>
				<slip_proc_seq/>
				<proc_stat/>
				<proc_stat_nm/>
				<actu_slip_no/>
				<emp_clsf/>
				<remk_adm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_1100_l>
*/
%>

<% /* 작성시간 : Fri Nov 27 16:07:29 KST 2009 */ %>