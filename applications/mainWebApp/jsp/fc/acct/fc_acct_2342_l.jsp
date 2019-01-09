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
	FC_ACCT_2342_LDataSet ds = (FC_ACCT_2342_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2342_LCURLISTRecord rec = (FC_ACCT_2342_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			//rx.add(record, "slip_arow_no", rec.slip_arow_no);
			//rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			//rx.add(record, "cgbuseonm", rec.cgbuseonm);
			//rx.add(record, "slip_aprv_yn", rec.slip_aprv_yn);
			//rx.add(record, "chrg_emp_no", rec.chrg_emp_no);
			//rx.add(record, "hjpddsabeonnm", rec.hjpddsabeonnm);
			//rx.add(record, "budg_yymm", rec.budg_yymm);
			//rx.add(record, "fisc_dt", rec.fisc_dt);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "hjpysnm", rec.hjpysnm);
			//rx.add(record, "drcr_clsf", rec.drcr_clsf);
			//rx.add(record, "dr_amt", rec.dr_amt);
			//rx.add(record, "crdt_amt", rec.crdt_amt);
			//rx.add(record, "evnt_cd", rec.evnt_cd);
			//rx.add(record, "tax_stmt_no", rec.tax_stmt_no);
			//rx.add(record, "setoff_slip_occr_dt", rec.setoff_slip_occr_dt);
			//rx.add(record, "setoff_slip_clsf_cd", rec.setoff_slip_clsf_cd);
			//rx.add(record, "setoff_slip_seq", rec.setoff_slip_seq);
			//rx.add(record, "setoff_slip_sub_seq", rec.setoff_slip_sub_seq);
			//rx.add(record, "setoff_slip_arow_no", rec.setoff_slip_arow_no);
			//rx.add(record, "obj_acct_cd", rec.obj_acct_cd);
			//rx.add(record, "obj_dt", rec.obj_dt);
			//rx.add(record, "obj_amt", rec.obj_amt);
			//rx.add(record, "rmks1", rec.rmks1);
			//rx.add(record, "rmks2", rec.rmks2);
			//rx.add(record, "use_dept_cd", rec.use_dept_cd);
			//rx.add(record, "usebuseonm", rec.usebuseonm);
			//rx.add(record, "incmg_emp_no", rec.incmg_emp_no);
			//rx.add(record, "hjpinsabeonnm", rec.hjpinsabeonnm);
			//rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "incm_clsf_cd", rec.incm_clsf_cd);
			//rx.add(record, "incmg_dt", rec.incmg_dt);
			//rx.add(record, "etc_in", rec.etc_in);
			//rx.add(record, "prop_equip_cd", rec.prop_equip_cd);
			//rx.add(record, "boks_dlco_nm", rec.boks_dlco_nm);
			//rx.add(record, "prt_no", rec.prt_no);
			//rx.add(record, "adpay_adjm_flag", rec.adpay_adjm_flag);
			//rx.add(record, "note_stat", rec.note_stat);
			//rx.add(record, "suply_amt", rec.suply_amt);
			//rx.add(record, "vat_amt", rec.vat_amt);
			//rx.add(record, "erplace_cd", rec.erplace_cd);
			//rx.add(record, "make_dt", rec.make_dt);
			//rx.add(record, "ern", rec.ern);
			//rx.add(record, "dlco_clsf_cd2", rec.dlco_clsf_cd2);
			//rx.add(record, "dlco_cd2", rec.dlco_cd2);
			//rx.add(record, "dlco_nm2", rec.dlco_nm2);
			//rx.add(record, "usebuseonm2", rec.usebuseonm2);
			//rx.add(record, "dlco_cd3", rec.dlco_cd3);
			//rx.add(record, "dlco_nm3", rec.dlco_nm3);
			//rx.add(record, "setoff_slip_no", rec.setoff_slip_no);
			//rx.add(record, "vat_amt2", rec.vat_amt2);
			//rx.add(record, "draft_doc_no", rec.draft_doc_no);
			//rx.add(record, "evnt_nm", rec.evnt_nm);
			//rx.add(record, "draft_doc_dept_cd", rec.draft_doc_dept_cd);
			//rx.add(record, "draft_expn_amt", rec.draft_expn_amt);
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
			rx.add(record, "clam_dept_cd", StringUtil.replaceToXml(rec.clam_dept_cd));
			rx.add(record, "cgbuseonm", StringUtil.replaceToXml(rec.cgbuseonm));
			rx.add(record, "slip_aprv_yn", StringUtil.replaceToXml(rec.slip_aprv_yn));
			rx.add(record, "chrg_emp_no", StringUtil.replaceToXml(rec.chrg_emp_no));
			rx.add(record, "hjpddsabeonnm", StringUtil.replaceToXml(rec.hjpddsabeonnm));
			rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "hjpysnm", StringUtil.replaceToXml(rec.hjpysnm));
			rx.add(record, "drcr_clsf", StringUtil.replaceToXml(rec.drcr_clsf));
			rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
			rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			rx.add(record, "tax_stmt_no", StringUtil.replaceToXml(rec.tax_stmt_no));
			rx.add(record, "setoff_slip_occr_dt", StringUtil.replaceToXml(rec.setoff_slip_occr_dt));
			rx.add(record, "setoff_slip_clsf_cd", StringUtil.replaceToXml(rec.setoff_slip_clsf_cd));
			rx.add(record, "setoff_slip_seq", StringUtil.replaceToXml(rec.setoff_slip_seq));
			rx.add(record, "setoff_slip_sub_seq", StringUtil.replaceToXml(rec.setoff_slip_sub_seq));
			rx.add(record, "setoff_slip_arow_no", StringUtil.replaceToXml(rec.setoff_slip_arow_no));
			rx.add(record, "obj_acct_cd", StringUtil.replaceToXml(rec.obj_acct_cd));
			rx.add(record, "obj_dt", StringUtil.replaceToXml(rec.obj_dt));
			rx.add(record, "obj_amt", StringUtil.replaceToXml(rec.obj_amt));
			rx.addCData(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			rx.addCData(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			rx.add(record, "usebuseonm", StringUtil.replaceToXml(rec.usebuseonm));
			rx.add(record, "incmg_emp_no", StringUtil.replaceToXml(rec.incmg_emp_no));
			rx.addCData(record, "hjpinsabeonnm", StringUtil.replaceToXml(rec.hjpinsabeonnm));
			rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.addCData(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "incm_clsf_cd", StringUtil.replaceToXml(rec.incm_clsf_cd));
			rx.add(record, "incmg_dt", StringUtil.replaceToXml(rec.incmg_dt));
			rx.add(record, "etc_in", StringUtil.replaceToXml(rec.etc_in));
			rx.add(record, "prop_equip_cd", StringUtil.replaceToXml(rec.prop_equip_cd));
			rx.addCData(record, "boks_dlco_nm", StringUtil.replaceToXml(rec.boks_dlco_nm));
			rx.add(record, "prt_no", StringUtil.replaceToXml(rec.prt_no));
			rx.add(record, "adpay_adjm_flag", StringUtil.replaceToXml(rec.adpay_adjm_flag));
			rx.add(record, "note_stat", StringUtil.replaceToXml(rec.note_stat));
			rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			rx.add(record, "erplace_cd", StringUtil.replaceToXml(rec.erplace_cd));
			rx.add(record, "make_dt", StringUtil.replaceToXml(rec.make_dt));
			rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			rx.add(record, "dlco_clsf_cd2", StringUtil.replaceToXml(rec.dlco_clsf_cd2));
			rx.add(record, "dlco_cd2", StringUtil.replaceToXml(rec.dlco_cd2));
			rx.addCData(record, "dlco_nm2", StringUtil.replaceToXml(rec.dlco_nm2));
			rx.addCData(record, "usebuseonm2", StringUtil.replaceToXml(rec.usebuseonm2));
			rx.add(record, "dlco_cd3", StringUtil.replaceToXml(rec.dlco_cd3));
			rx.addCData(record, "dlco_nm3", StringUtil.replaceToXml(rec.dlco_nm3));
			rx.add(record, "setoff_slip_no", StringUtil.replaceToXml(rec.setoff_slip_no));
			rx.add(record, "vat_amt2", StringUtil.replaceToXml(rec.vat_amt2));
			rx.add(record, "draft_doc_no", StringUtil.replaceToXml(rec.draft_doc_no));
			rx.addCData(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			rx.add(record, "draft_doc_dept_cd", StringUtil.replaceToXml(rec.draft_doc_dept_cd));
			rx.add(record, "draft_expn_amt", StringUtil.replaceToXml(rec.draft_expn_amt));
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
<fc_acct_2342_l>
	<dataSet>
		<CURLIST>
			<record>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<slip_sub_seq/>
				<slip_arow_no/>
				<clam_dept_cd/>
				<cgbuseonm/>
				<slip_aprv_yn/>
				<chrg_emp_no/>
				<hjpddsabeonnm/>
				<budg_yymm/>
				<fisc_dt/>
				<budg_cd/>
				<hjpysnm/>
				<drcr_clsf/>
				<dr_amt/>
				<crdt_amt/>
				<evnt_cd/>
				<tax_stmt_no/>
				<setoff_slip_occr_dt/>
				<setoff_slip_clsf_cd/>
				<setoff_slip_seq/>
				<setoff_slip_sub_seq/>
				<setoff_slip_arow_no/>
				<obj_acct_cd/>
				<obj_dt/>
				<obj_amt/>
				<rmks1/>
				<rmks2/>
				<use_dept_cd/>
				<usebuseonm/>
				<incmg_emp_no/>
				<hjpinsabeonnm/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_nm/>
				<incm_clsf_cd/>
				<incmg_dt/>
				<etc_in/>
				<prop_equip_cd/>
				<boks_dlco_nm/>
				<prt_no/>
				<adpay_adjm_flag/>
				<note_stat/>
				<suply_amt/>
				<vat_amt/>
				<erplace_cd/>
				<make_dt/>
				<ern/>
				<dlco_clsf_cd2/>
				<dlco_cd2/>
				<dlco_nm2/>
				<usebuseonm2/>
				<dlco_cd3/>
				<dlco_nm3/>
				<setoff_slip_no/>
				<vat_amt2/>
				<draft_doc_no/>
				<evnt_nm/>
				<draft_doc_dept_cd/>
				<draft_expn_amt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2342_l>
*/
%>

<% /* 작성시간 : Thu Jul 16 14:34:43 KST 2009 */ %>