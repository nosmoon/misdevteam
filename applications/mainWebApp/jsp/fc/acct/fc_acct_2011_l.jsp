<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2011_LDataSet ds = (FC_ACCT_2011_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2011_LCURLIST1Record rec = (FC_ACCT_2011_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			//rx.add(record, "slip_arow_no", rec.slip_arow_no);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "drcr_clsf", rec.drcr_clsf);
			//rx.add(record, "dr_amt", rec.dr_amt);
			//rx.add(record, "crdt_amt", rec.crdt_amt);
			//rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "boks_dlco_nm", rec.boks_dlco_nm);
			//rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			//rx.add(record, "mang_no", rec.mang_no);
			//rx.add(record, "incm_clsf_cd", rec.incm_clsf_cd);
			//rx.add(record, "medi_cd", rec.medi_cd);
			//rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			//rx.add(record, "use_dept_cd", rec.use_dept_cd);
			//rx.add(record, "comp_dt", rec.comp_dt);
			//rx.add(record, "mtry_dt", rec.mtry_dt);
			//rx.add(record, "unit", rec.unit);
			//rx.add(record, "qunt", rec.qunt);
			//rx.add(record, "tax_stmt_no", rec.tax_stmt_no);
			//rx.add(record, "setoff_slip_occr_dt", rec.setoff_slip_occr_dt);
			//rx.add(record, "setoff_slip_clsf_cd", rec.setoff_slip_clsf_cd);
			//rx.add(record, "setoff_slip_seq", rec.setoff_slip_seq);
			//rx.add(record, "setoff_slip_sub_seq", rec.setoff_slip_sub_seq);
			//rx.add(record, "setoff_slip_arow_no", rec.setoff_slip_arow_no);
			//rx.add(record, "etc_in", rec.etc_in);
			//rx.add(record, "rmks2", rec.rmks2);
			//rx.add(record, "make_dt", rec.make_dt);
			//rx.add(record, "erplace_cd", rec.erplace_cd);
			//rx.add(record, "ern", rec.ern);
			//rx.add(record, "suply_amt", rec.suply_amt);
			//rx.add(record, "vat_amt", rec.vat_amt);
			//rx.add(record, "budg_cd_nm", rec.budg_cd_nm);
			//rx.add(record, "use_dept_cd_nm", rec.use_dept_cd_nm);
			//rx.add(record, "medi_cd_nm", rec.medi_cd_nm);
			//rx.add(record, "int_rate", rec.int_rate);
			//rx.add(record, "pay_bank_cd", rec.pay_bank_cd);
			//rx.add(record, "pay_bank_cd_nm", rec.pay_bank_cd_nm);
			//rx.add(record, "purc_amt", rec.purc_amt);
			//rx.add(record, "corp_tax_amt", rec.corp_tax_amt);
			//rx.add(record, "issu_dt", rec.issu_dt);
			//rx.add(record, "insr_nm", rec.insr_nm);
			//rx.add(record, "intg_dlco_cd", rec.intg_dlco_cd);
			//rx.add(record, "prop_equip_cd", rec.prop_equip_cd);
			//rx.add(record, "adpay_adjm_flag", rec.adpay_adjm_flag);
			//rx.add(record, "bank_clsf", rec.bank_clsf);
			//rx.add(record, "acct_no", rec.acct_no);
			//rx.add(record, "deps_pers_nm", rec.deps_pers_nm);
			//rx.add(record, "occr_slip_clsf", rec.occr_slip_clsf);
			//rx.add(record, "occr_slip", rec.occr_slip);
			//rx.add(record, "note_stat", rec.note_stat);
			//rx.add(record, "vat_amt2", rec.vat_amt2);
			//rx.add(record, "with_tax", rec.with_tax);
			//rx.add(record, "incm_tax", rec.incm_tax);
			//rx.add(record, "res_tax", rec.res_tax);
			//rx.add(record, "etc_in_amt", rec.etc_in_amt);
			//rx.add(record, "setoff_no", rec.setoff_no);
			//rx.add(record, "confirm_flag", rec.confirm_flag);
			//rx.add(record, "draft_doc_no", rec.draft_doc_no);
			//rx.add(record, "draft_expn_amt", rec.draft_expn_amt);
			//rx.add(record, "recp_pers_clsf", rec.recp_pers_clsf);
			//rx.add(record, "recp_pers", rec.recp_pers);
			//rx.add(record, "rn", rec.rn);
			//rx.add(record, "draft_doc_dept_cd", rec.draft_doc_dept_cd);
			//rx.add(record, "semuro_occr_dt", rec.semuro_occr_dt);
			//rx.add(record, "semuro_seq", rec.semuro_seq);
			//rx.add(record, "semuro_no", rec.semuro_no);
			//rx.add(record, "email_id", rec.email_id);
			//rx.add(record, "prop_equip_cd_nm", rec.prop_equip_cd_nm);
			//rx.add(record, "recp_pers1", rec.recp_pers1);
			//rx.add(record, "recp_pers_nm1", rec.recp_pers_nm1);
			rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "drcr_clsf", StringUtil.replaceToXml(rec.drcr_clsf));
			rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
			rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "boks_dlco_nm", rec.boks_dlco_nm);
			rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
			rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			rx.add(record, "incm_clsf_cd", StringUtil.replaceToXml(rec.incm_clsf_cd));
			rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
			rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			rx.add(record, "tax_stmt_no", StringUtil.replaceToXml(rec.tax_stmt_no));
			rx.add(record, "setoff_slip_occr_dt", StringUtil.replaceToXml(rec.setoff_slip_occr_dt));
			rx.add(record, "setoff_slip_clsf_cd", StringUtil.replaceToXml(rec.setoff_slip_clsf_cd));
			rx.add(record, "setoff_slip_seq", StringUtil.replaceToXml(rec.setoff_slip_seq));
			rx.add(record, "setoff_slip_sub_seq", StringUtil.replaceToXml(rec.setoff_slip_sub_seq));
			rx.add(record, "setoff_slip_arow_no", StringUtil.replaceToXml(rec.setoff_slip_arow_no));
			rx.add(record, "etc_in", StringUtil.replaceToXml(rec.etc_in));
			rx.addCData(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			rx.add(record, "make_dt", StringUtil.replaceToXml(rec.make_dt));
			rx.add(record, "erplace_cd", StringUtil.replaceToXml(rec.erplace_cd));
			rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			rx.add(record, "budg_cd_nm", StringUtil.replaceToXml(rec.budg_cd_nm));
			rx.add(record, "use_dept_cd_nm", StringUtil.replaceToXml(rec.use_dept_cd_nm));
			rx.addCData(record, "medi_cd_nm", StringUtil.replaceToXml(rec.medi_cd_nm));
			rx.addCData(record, "dtls_medi_cd_nm", StringUtil.replaceToXml(rec.dtls_medi_cd_nm));
			rx.add(record, "int_rate", StringUtil.replaceToXml(rec.int_rate));
			rx.add(record, "pay_bank_cd", StringUtil.replaceToXml(rec.pay_bank_cd));
			rx.add(record, "pay_bank_cd_nm", StringUtil.replaceToXml(rec.pay_bank_cd_nm));
			rx.add(record, "purc_amt", StringUtil.replaceToXml(rec.purc_amt));
			rx.add(record, "corp_tax_amt", StringUtil.replaceToXml(rec.corp_tax_amt));
			rx.add(record, "issu_dt", StringUtil.replaceToXml(rec.issu_dt));
			rx.add(record, "insr_nm", StringUtil.replaceToXml(rec.insr_nm));
			rx.add(record, "intg_dlco_cd", StringUtil.replaceToXml(rec.intg_dlco_cd));
			rx.add(record, "prop_equip_cd", StringUtil.replaceToXml(rec.prop_equip_cd));
			rx.add(record, "adpay_adjm_flag", StringUtil.replaceToXml(rec.adpay_adjm_flag));
			rx.add(record, "bank_clsf", StringUtil.replaceToXml(rec.bank_clsf));
			rx.add(record, "acct_no", StringUtil.replaceToXml(rec.acct_no));
			rx.addCData(record, "deps_pers_nm", StringUtil.replaceToXml(rec.deps_pers_nm));
			rx.add(record, "occr_slip_clsf", StringUtil.replaceToXml(rec.occr_slip_clsf));
			rx.add(record, "occr_slip", StringUtil.replaceToXml(rec.occr_slip));
			rx.add(record, "note_stat", StringUtil.replaceToXml(rec.note_stat));
			rx.add(record, "vat_amt2", StringUtil.replaceToXml(rec.vat_amt2));
			rx.add(record, "with_tax", StringUtil.replaceToXml(rec.with_tax));
			rx.add(record, "incm_tax", StringUtil.replaceToXml(rec.incm_tax));
			rx.add(record, "res_tax", StringUtil.replaceToXml(rec.res_tax));
			rx.add(record, "etc_in_amt", StringUtil.replaceToXml(rec.etc_in_amt));
			rx.add(record, "setoff_no", StringUtil.replaceToXml(rec.setoff_no));
			rx.add(record, "confirm_flag", StringUtil.replaceToXml(rec.confirm_flag));
			rx.add(record, "draft_doc_no", StringUtil.replaceToXml(rec.draft_doc_no));
			rx.add(record, "draft_expn_amt", StringUtil.replaceToXml(rec.draft_expn_amt));
			rx.add(record, "recp_pers_clsf", StringUtil.replaceToXml(rec.recp_pers_clsf));
			rx.add(record, "recp_pers", StringUtil.replaceToXml(rec.recp_pers));
			rx.add(record, "rn", StringUtil.replaceToXml(rec.rn));
			rx.add(record, "draft_doc_dept_cd", StringUtil.replaceToXml(rec.draft_doc_dept_cd));
			rx.add(record, "semuro_occr_dt", StringUtil.replaceToXml(rec.semuro_occr_dt));
			rx.add(record, "semuro_seq", StringUtil.replaceToXml(rec.semuro_seq));
			rx.add(record, "semuro_no", StringUtil.replaceToXml(rec.semuro_no));
			rx.add(record, "email_id", StringUtil.replaceToXml(rec.email_id));
			rx.add(record, "prop_equip_cd_nm", StringUtil.replaceToXml(rec.prop_equip_cd_nm));
			rx.add(record, "recp_pers1", StringUtil.replaceToXml(rec.recp_pers1));
			rx.add(record, "recp_pers_nm1", StringUtil.replaceToXml(rec.recp_pers_nm1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2011_LCURLISTRecord rec = (FC_ACCT_2011_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "titl", rec.titl);
			//rx.add(record, "reso_amt", rec.reso_amt);
			//rx.add(record, "expn_clsf", rec.expn_clsf);
			//rx.add(record, "expn_hope_dt", rec.expn_hope_dt);
			//rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			//rx.add(record, "budg_yymm", rec.budg_yymm);
			//rx.add(record, "chrg_emp_no", rec.chrg_emp_no);
			//rx.add(record, "evnt_cd", rec.evnt_cd);
			//rx.add(record, "clam_dept_cd_nm", rec.clam_dept_cd_nm);
			//rx.add(record, "chrg_emp_no_nm", rec.chrg_emp_no_nm);
			//rx.add(record, "slip_aprv_yn", rec.slip_aprv_yn);
			//rx.add(record, "fisc_dt", rec.fisc_dt);
			//rx.add(record, "evnt_cd_nm", rec.evnt_cd_nm);
			//rx.add(record, "evnt_cd_seq", rec.evnt_cd_seq);
			//rx.add(record, "draft_doc_no", rec.draft_doc_no);
			//rx.add(record, "draft_doc_dept_cd", rec.draft_doc_dept_cd);
			//rx.add(record, "draft_expn_amt", rec.draft_expn_amt);
			//rx.add(record, "draft_expn_amt", StringUtil.replaceToXml(rec.draft_expn_amt));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "medi_cd_nm", StringUtil.replaceToXml(rec.medi_cd_nm));
			//rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
			rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			rx.add(record, "reso_amt", StringUtil.replaceToXml(rec.reso_amt));
			rx.add(record, "expn_clsf", StringUtil.replaceToXml(rec.expn_clsf));
			rx.add(record, "expn_hope_dt", StringUtil.replaceToXml(rec.expn_hope_dt));
			rx.add(record, "clam_dept_cd", StringUtil.replaceToXml(rec.clam_dept_cd));
			rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			rx.add(record, "chrg_emp_no", StringUtil.replaceToXml(rec.chrg_emp_no));
			rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			rx.add(record, "clam_dept_cd_nm", StringUtil.replaceToXml(rec.clam_dept_cd_nm));
			rx.add(record, "chrg_emp_no_nm", StringUtil.replaceToXml(rec.chrg_emp_no_nm));
			rx.add(record, "slip_aprv_yn", StringUtil.replaceToXml(rec.slip_aprv_yn));
			rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			rx.addCData(record, "evnt_cd_nm", StringUtil.replaceToXml(rec.evnt_cd_nm));
			rx.add(record, "evnt_cd_seq", StringUtil.replaceToXml(rec.evnt_cd_seq));
			rx.add(record, "draft_doc_no", StringUtil.replaceToXml(rec.draft_doc_no));
			rx.add(record, "draft_doc_dept_cd", StringUtil.replaceToXml(rec.draft_doc_dept_cd));
			rx.add(record, "draft_expn_amt", StringUtil.replaceToXml(rec.draft_expn_amt));
			rx.add(record, "medi_cd", rec.medi_cd); 
			rx.addCData(record, "medi_cd_nm", rec.medi_cd_nm);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.addCData(record, "dtls_medi_cd_nm", rec.dtls_medi_cd_nm);
			rx.add(record, "chnl_clsf_cd", rec.chnl_clsf_cd);
		
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
<fc_acct_2011_l>
	<dataSet>
		<CURLIST1>
			<record>
				<slip_sub_seq/>
				<slip_arow_no/>
				<budg_cd/>
				<drcr_clsf/>
				<dr_amt/>
				<crdt_amt/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_nm/>
				<boks_dlco_nm/>
				<mang_clsf_cd/>
				<mang_no/>
				<incm_clsf_cd/>
				<medi_cd/>
				<dtls_medi_cd/>
				<use_dept_cd/>
				<comp_dt/>
				<mtry_dt/>
				<unit/>
				<qunt/>
				<tax_stmt_no/>
				<setoff_slip_occr_dt/>
				<setoff_slip_clsf_cd/>
				<setoff_slip_seq/>
				<setoff_slip_sub_seq/>
				<setoff_slip_arow_no/>
				<etc_in/>
				<rmks2/>
				<make_dt/>
				<erplace_cd/>
				<ern/>
				<suply_amt/>
				<vat_amt/>
				<budg_cd_nm/>
				<use_dept_cd_nm/>
				<medi_cd_nm/>
				<int_rate/>
				<pay_bank_cd/>
				<pay_bank_cd_nm/>
				<purc_amt/>
				<corp_tax_amt/>
				<issu_dt/>
				<insr_nm/>
				<intg_dlco_cd/>
				<prop_equip_cd/>
				<adpay_adjm_flag/>
				<bank_clsf/>
				<acct_no/>
				<deps_pers_nm/>
				<occr_slip_clsf/>
				<occr_slip/>
				<note_stat/>
				<vat_amt2/>
				<with_tax/>
				<incm_tax/>
				<res_tax/>
				<etc_in_amt/>
				<setoff_no/>
				<confirm_flag/>
				<draft_doc_no/>
				<draft_expn_amt/>
				<recp_pers_clsf/>
				<recp_pers/>
				<rn/>
				<draft_doc_dept_cd/>
				<semuro_occr_dt/>
				<semuro_seq/>
				<semuro_no/>
				<email_id/>
				<prop_equip_cd_nm/>
				<recp_pers1/>
				<recp_pers_nm1/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_2011_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2011_l>
	<dataSet>
		<CURLIST>
			<record>
				<titl/>
				<reso_amt/>
				<expn_clsf/>
				<expn_hope_dt/>
				<clam_dept_cd/>
				<budg_yymm/>
				<chrg_emp_no/>
				<evnt_cd/>
				<clam_dept_cd_nm/>
				<chrg_emp_no_nm/>
				<slip_aprv_yn/>
				<fisc_dt/>
				<evnt_cd_nm/>
				<evnt_cd_seq/>
				<draft_doc_no/>
				<draft_doc_dept_cd/>
				<draft_expn_amt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2011_l>
*/
%>

<% /* 작성시간 : Tue Aug 25 17:42:37 KST 2009 */ %>