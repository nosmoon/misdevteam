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
	FC_ACCT_2251_LDataSet ds = (FC_ACCT_2251_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2251_LCURLIST1Record rec = (FC_ACCT_2251_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "pch_sdysnm", rec.pch_sdysnm);
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.addCData(record, "rmks1", rec.rmks1);
			rx.addCData(record, "rmks2", rec.rmks2);
			rx.add(record, "drcr_clsf", rec.drcr_clsf);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "boks_dlco_nm", rec.boks_dlco_nm);
			rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "incm_clsf_cd", rec.incm_clsf_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "pch_hsnm", rec.pch_hsnm);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.addCData(record, "pch_buseonm", rec.pch_buseonm);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.addCData(record, "pch_banknm", rec.pch_banknm);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "obj_acct_cd", rec.obj_acct_cd);
			rx.add(record, "pch_dsacctnm", rec.pch_dsacctnm);
			rx.add(record, "obj_dt", rec.obj_dt);
			rx.add(record, "obj_amt", rec.obj_amt);
			rx.add(record, "frcr_clsf_cd", rec.frcr_clsf_cd);
			rx.add(record, "frcr_amt", rec.frcr_amt);
			rx.add(record, "exrate", rec.exrate);
			rx.add(record, "note_stat", rec.note_stat);
			rx.add(record, "intg_dlco_cd", rec.intg_dlco_cd);
			rx.add(record, "prop_equip_cd", rec.prop_equip_cd);
			rx.add(record, "tax_stmt_no", rec.tax_stmt_no);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "erplace_cd", rec.erplace_cd);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "setoff_slip_no", rec.setoff_slip_no);
			rx.add(record, "occr_slip_clsf", rec.occr_slip_clsf);
			rx.add(record, "occr_slip", rec.occr_slip);
			//rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "pch_sdysnm", StringUtil.replaceToXml(rec.pch_sdysnm));
			//rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			//rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
			//rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			//rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			//rx.add(record, "drcr_clsf", StringUtil.replaceToXml(rec.drcr_clsf));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "boks_dlco_nm", StringUtil.replaceToXml(rec.boks_dlco_nm));
			//rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
			//rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			//rx.add(record, "incm_clsf_cd", StringUtil.replaceToXml(rec.incm_clsf_cd));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "pch_hsnm", StringUtil.replaceToXml(rec.pch_hsnm));
			//rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			//rx.add(record, "pch_buseonm", StringUtil.replaceToXml(rec.pch_buseonm));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
			//rx.add(record, "pch_banknm", StringUtil.replaceToXml(rec.pch_banknm));
			//rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			//rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			//rx.add(record, "obj_acct_cd", StringUtil.replaceToXml(rec.obj_acct_cd));
			//rx.add(record, "pch_dsacctnm", StringUtil.replaceToXml(rec.pch_dsacctnm));
			//rx.add(record, "obj_dt", StringUtil.replaceToXml(rec.obj_dt));
			//rx.add(record, "obj_amt", StringUtil.replaceToXml(rec.obj_amt));
			//rx.add(record, "frcr_clsf_cd", StringUtil.replaceToXml(rec.frcr_clsf_cd));
			//rx.add(record, "frcr_amt", StringUtil.replaceToXml(rec.frcr_amt));
			//rx.add(record, "exrate", StringUtil.replaceToXml(rec.exrate));
			//rx.add(record, "note_stat", StringUtil.replaceToXml(rec.note_stat));
			//rx.add(record, "intg_dlco_cd", StringUtil.replaceToXml(rec.intg_dlco_cd));
			//rx.add(record, "prop_equip_cd", StringUtil.replaceToXml(rec.prop_equip_cd));
			//rx.add(record, "tax_stmt_no", StringUtil.replaceToXml(rec.tax_stmt_no));
			//rx.add(record, "make_dt", StringUtil.replaceToXml(rec.make_dt));
			//rx.add(record, "erplace_cd", StringUtil.replaceToXml(rec.erplace_cd));
			//rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			//rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			//rx.add(record, "setoff_slip_no", StringUtil.replaceToXml(rec.setoff_slip_no));
			//rx.add(record, "occr_slip_clsf", StringUtil.replaceToXml(rec.occr_slip_clsf));
			//rx.add(record, "occr_slip", StringUtil.replaceToXml(rec.occr_slip));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2251_LCURLISTRecord rec = (FC_ACCT_2251_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			rx.add(record, "pch_cgbuseonm", rec.pch_cgbuseonm);
			rx.add(record, "incmg_emp_no", rec.incmg_emp_no);
			rx.add(record, "chnl_clsf_cd", rec.chnl_clsf_cd);
			rx.add(record, "pch_irjnm", rec.pch_irjnm);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "reso_amt", rec.reso_amt);
			rx.add(record, "reso_amt_ch", rec.reso_amt_ch);
			//rx.add(record, "clam_dept_cd", StringUtil.replaceToXml(rec.clam_dept_cd));
			//rx.add(record, "pch_cgbuseonm", StringUtil.replaceToXml(rec.pch_cgbuseonm));
			//rx.add(record, "incmg_emp_no", StringUtil.replaceToXml(rec.incmg_emp_no));
			//rx.add(record, "pch_irjnm", StringUtil.replaceToXml(rec.pch_irjnm));
			//rx.add(record, "incmg_dt", StringUtil.replaceToXml(rec.incmg_dt));
			//rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			//rx.add(record, "reso_amt", StringUtil.replaceToXml(rec.reso_amt));
			//rx.add(record, "reso_amt_ch", StringUtil.replaceToXml(rec.reso_amt_ch));
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
<fc_acct_2251_l>
	<dataSet>
		<CURLIST1>
			<record>
				<slip_arow_no/>
				<budg_cd/>
				<pch_sdysnm/>
				<dr_amt/>
				<crdt_amt/>
				<rmks1/>
				<rmks2/>
				<drcr_clsf/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_nm/>
				<boks_dlco_nm/>
				<mang_clsf_cd/>
				<mang_no/>
				<incm_clsf_cd/>
				<medi_cd/>
				<dtls_medi_cd/>
				<evnt_cd/>
				<pch_hsnm/>
				<use_dept_cd/>
				<pch_buseonm/>
				<comp_dt/>
				<mtry_dt/>
				<bank_cd/>
				<pch_banknm/>
				<unit/>
				<qunt/>
				<obj_acct_cd/>
				<pch_dsacctnm/>
				<obj_dt/>
				<obj_amt/>
				<frcr_clsf_cd/>
				<frcr_amt/>
				<exrate/>
				<note_stat/>
				<intg_dlco_cd/>
				<prop_equip_cd/>
				<tax_stmt_no/>
				<make_dt/>
				<erplace_cd/>
				<ern/>
				<suply_amt/>
				<setoff_slip_no/>
				<occr_slip_clsf/>
				<occr_slip/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_2251_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2251_l>
	<dataSet>
		<CURLIST>
			<record>
				<clam_dept_cd/>
				<pch_cgbuseonm/>
				<incmg_emp_no/>
				<pch_irjnm/>
				<incmg_dt/>
				<fisc_dt/>
				<reso_amt/>
				<reso_amt_ch/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2251_l>
*/
%>

<% /* 작성시간 : Fri Aug 28 17:16:09 KST 2009 */ %>