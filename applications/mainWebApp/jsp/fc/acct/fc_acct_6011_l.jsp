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
	FC_ACCT_6011_LDataSet ds = (FC_ACCT_6011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_6011_LCURLIST2Record rec = (FC_ACCT_6011_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "slip_arow_no", rec.slip_arow_no);
			//rx.add(record, "mmdd", rec.mmdd);
			//rx.add(record, "item", rec.item);
			//rx.add(record, "std", rec.std);
			//rx.add(record, "qunt", rec.qunt);
			//rx.add(record, "uprc", rec.uprc);
			//rx.add(record, "suply_amt", rec.suply_amt);
			//rx.add(record, "vat_amt", rec.vat_amt);
			//rx.add(record, "incmg_pgm_id", rec.incmg_pgm_id);
			rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
			rx.add(record, "mmdd", StringUtil.replaceToXml(rec.mmdd));
			rx.add(record, "item", StringUtil.replaceToXml(rec.item));
			rx.add(record, "std", StringUtil.replaceToXml(rec.std));
			rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			rx.add(record, "uprc", StringUtil.replaceToXml(rec.uprc));
			rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			rx.add(record, "incmg_pgm_id", StringUtil.replaceToXml(rec.incmg_pgm_id));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_6011_LCURLIST1Record rec = (FC_ACCT_6011_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "prof_type_cd", rec.prof_type_cd);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "occr_slip_occr_dt", rec.occr_slip_occr_dt);
			rx.add(record, "occr_slip_clsf_cd", rec.occr_slip_clsf_cd);
			rx.add(record, "occr_slip_seq", rec.occr_slip_seq);
			rx.add(record, "occr_slip_sub_seq", rec.occr_slip_sub_seq);
			rx.add(record, "occr_slip_arow_no", rec.occr_slip_arow_no);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "erplace_cd", rec.erplace_cd);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "tax_stmt_aprv_yn", rec.tax_stmt_aprv_yn);
			rx.add(record, "decl_yn", rec.decl_yn);
			rx.add(record, "decl_qq", rec.decl_qq);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "deal_clsf", rec.deal_clsf);
			rx.add(record, "ern", rec.ern);
			rx.addCData(record, "presi_nm", rec.presi_nm);
			rx.addCData(record, "addr", rec.addr);
			rx.add(record, "bizcond", rec.bizcond);
			rx.add(record, "item", rec.item);
			rx.add(record, "canc_yn", rec.canc_yn);
			rx.add(record, "canc_dt", rec.canc_dt);
			rx.add(record, "del_resn", rec.del_resn);
			rx.add(record, "elec_tax_bill_yn", rec.elec_tax_bill_yn);
			rx.add(record, "elec_tax_issu_dt", rec.elec_tax_issu_dt);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "incmg_pgm_id", rec.incmg_pgm_id);
			rx.add(record, "semuro_no", rec.semuro_no);
			rx.add(record, "elec_tax_comp_cd", rec.elec_tax_comp_cd);
			rx.addCData(record, "elec_tax_comp_cd_nm", rec.elec_tax_comp_cd_nm);
			rx.add(record, "email_id", rec.email_id);		
			rx.add(record, "budg_cd", rec.budg_cd);	
			rx.addCData(record, "budg_cd_nm", rec.budg_cd_nm);
			rx.add(record, "biz_plc_cd", rec.biz_plc_cd);
			rx.addCData(record, "remk1", rec.remk1);	
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "prof_type_cd", StringUtil.replaceToXml(rec.prof_type_cd));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "occr_slip_occr_dt", StringUtil.replaceToXml(rec.occr_slip_occr_dt));
			//rx.add(record, "occr_slip_clsf_cd", StringUtil.replaceToXml(rec.occr_slip_clsf_cd));
			//rx.add(record, "occr_slip_seq", StringUtil.replaceToXml(rec.occr_slip_seq));
			//rx.add(record, "occr_slip_sub_seq", StringUtil.replaceToXml(rec.occr_slip_sub_seq));
			//rx.add(record, "occr_slip_arow_no", StringUtil.replaceToXml(rec.occr_slip_arow_no));
			//rx.add(record, "make_dt", StringUtil.replaceToXml(rec.make_dt));
			//rx.add(record, "erplace_cd", StringUtil.replaceToXml(rec.erplace_cd));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			//rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			//rx.add(record, "tax_stmt_aprv_yn", StringUtil.replaceToXml(rec.tax_stmt_aprv_yn));
			//rx.add(record, "decl_yn", StringUtil.replaceToXml(rec.decl_yn));
			//rx.add(record, "decl_qq", StringUtil.replaceToXml(rec.decl_qq));
			//rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			//rx.add(record, "deal_clsf", StringUtil.replaceToXml(rec.deal_clsf));
			//rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			//rx.add(record, "presi_nm", StringUtil.replaceToXml(rec.presi_nm));
			//rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			//rx.add(record, "bizcond", StringUtil.replaceToXml(rec.bizcond));
			//rx.add(record, "item", StringUtil.replaceToXml(rec.item));
			//rx.add(record, "canc_yn", StringUtil.replaceToXml(rec.canc_yn));
			//rx.add(record, "canc_dt", StringUtil.replaceToXml(rec.canc_dt));
			//rx.add(record, "del_resn", StringUtil.replaceToXml(rec.del_resn));
			//rx.add(record, "elec_tax_bill_yn", StringUtil.replaceToXml(rec.elec_tax_bill_yn));
			//rx.add(record, "elec_tax_issu_dt", StringUtil.replaceToXml(rec.elec_tax_issu_dt));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "incmg_pgm_id", StringUtil.replaceToXml(rec.incmg_pgm_id));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<fc_acct_6011_l>
	<dataSet>
		<CURLIST2>
			<record>
				<slip_arow_no/>
				<mmdd/>
				<item/>
				<std/>
				<qunt/>
				<uprc/>
				<suply_amt/>
				<vat_amt/>
				<incmg_pgm_id/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_6011_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_6011_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<prof_type_cd/>
				<slip_clsf_cd/>
				<slip_occr_dt/>
				<slip_seq/>
				<occr_slip_occr_dt/>
				<occr_slip_clsf_cd/>
				<occr_slip_seq/>
				<occr_slip_sub_seq/>
				<occr_slip_arow_no/>
				<make_dt/>
				<erplace_cd/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_nm/>
				<suply_amt/>
				<vat_amt/>
				<tax_stmt_aprv_yn/>
				<decl_yn/>
				<decl_qq/>
				<fisc_dt/>
				<deal_clsf/>
				<ern/>
				<presi_nm/>
				<addr/>
				<bizcond/>
				<item/>
				<canc_yn/>
				<canc_dt/>
				<del_resn/>
				<elec_tax_bill_yn/>
				<elec_tax_issu_dt/>
				<slip_no/>
				<incmg_pgm_id/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_6011_l>
*/
%>

<% /* 작성시간 : Wed Jul 01 22:25:41 KST 2009 */ %>